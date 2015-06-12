/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.examples.modules.povproject;

import java.awt.EventQueue;
import java.io.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.prefs.Preferences;
import javax.swing.JFileChooser;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.examples.api.povray.MainFileProvider;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.util.RequestProcessor;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OutputWriter;

/**
 *
 * @author geertjan
 */
public class Povray {

    private static File povray = null;
    private static File include = null;
    /**
     * Preferences key for the povray executable
     */
    private static final String KEY_POVRAY_EXEC = "povray";
    /**
     * Preferences key for the povray standard includes dir
     */
    private static final String KEY_POVRAY_INCLUDES = "include";
    private final RendererServiceImpl renderService;
    private final FileObject toRender;
    private final Properties settings;

    Povray(RendererServiceImpl renderService, FileObject toRender, Properties settings) {
	this.renderService = renderService;
	this.toRender = toRender;
	this.settings = settings == null ? renderService.getRendererSettings(
		renderService.getPreferredRendererSettingsNames()) : settings;
    }

    public FileObject render() throws IOException {
	if (EventQueue.isDispatchThread()) {
	    throw new IllegalStateException("Tried to run povray from the "
		    + "event thread");
	}

	//Find the scene file pass to POV-Ray as a java.io.File
	File scene;
	try {
	    scene = getFileToRender();
	} catch (IOException ioe) {
	    showMsg(ioe.getMessage());
	    return null;
	}

	//Get the POV-Ray executable
	File povray = getPovray();
	if (povray == null) {
	    //The user cancelled the file chooser w/o selecting
	    showMsg(NbBundle.getMessage(Povray.class, "MSG_NoPovrayExe"));
	    return null;
	}

	//Get the include dir, if it isn't under povray's home dir
	File includesDir = getStandardIncludeDir(povray);
	if (includesDir == null) {
	    //The user cancelled the file chooser w/o selecting
	    showMsg(NbBundle.getMessage(Povray.class, "MSG_NoPovrayInc"));
	    return null;
	}

	//Find the image output directory for the project
	File imagesDir = getImagesDir();

	//Assemble and format the line switches for the POV-Ray process based
	//on the contents of the Properties object
	String args = getCmdLineArgs(includesDir);
	String outFileName = stripExtension(scene) + ".png";

	//Compute the name of the output image file
	File outFile = new File(imagesDir.getPath() + File.separator
		+ outFileName);

	//Delete the image if it exists, so that any current tab viewing the file is
	//closed and the file will definitely be re-read when it is re-opened
	if (outFile.exists() && !outFile.delete()) {
	    showMsg(NbBundle.getMessage(Povray.class,
		    "LBL_CantDelete", outFile.getName()));
	    return null;
	}

	//Append the input file and output file arguments to the command line
	String cmdline = povray.getPath() + ' ' + args + " +I"
		+ scene.getPath() + " +O" + outFile.getPath();

	System.err.println(cmdline);

	showMsg(NbBundle.getMessage(Povray.class, "MSG_Rendering",
		scene.getName()));
	final Process process = Runtime.getRuntime().exec(cmdline);

	//Get the standard out of the process
	InputStream out = new BufferedInputStream(process.getInputStream(), 8192);
	//Get the standard in of the process
	InputStream err = new BufferedInputStream(process.getErrorStream(), 8192);

	//Create readers for each
	final Reader outReader = new BufferedReader(new InputStreamReader(out));
	final Reader errReader = new BufferedReader(new InputStreamReader(err));

	//Get an InputOutput to write to the output window
	InputOutput io = IOProvider.getDefault().getIO(scene.getName(), false);

	//Force it to open the output window/activate our tab
	io.select();

	//Print the command line we're calling for debug purposes
	io.getOut().println(cmdline);

	//Create runnables to poll each output stream
	OutHandler processSystemOut = new OutHandler(outReader, io.getOut());
	OutHandler processSystemErr = new OutHandler(errReader, io.getErr());

	//Get two different threads listening on the output & err
	//using the system-wide thread pool
	RequestProcessor.getDefault().post(processSystemOut);
	RequestProcessor.getDefault().post(processSystemErr);

	try {
	    //Hang this thread until the process exits
	    process.waitFor();
	} catch (InterruptedException ex) {
	    Exceptions.printStackTrace(ex);
	}

	//Close the output window's streams (title will become non-bold)
	processSystemOut.close();
	processSystemErr.close();

	if (outFile.exists() && process.exitValue() == 0) {
	    //Try to find the new image file
	    FileObject outFileObject = FileUtil.toFileObject(outFile);
	    showMsg(NbBundle.getMessage(Povray.class, "MSG_Success",
		    outFile.getPath()));
	    return outFileObject;
	} else {
	    showMsg(NbBundle.getMessage(Povray.class, "MSG_Failure",
		    scene.getPath()));
	    return null;
	}

    }

    static class OutHandler implements Runnable {

	private Reader out;
	private OutputWriter writer;

	public OutHandler(Reader out, OutputWriter writer) {
	    this.out = out;
	    this.writer = writer;
	}

	@Override
	public void run() {
	    while (true) {
		try {
		    while (!out.ready()) {
			try {
			    Thread.sleep(200);
			} catch (InterruptedException e) {
			    close();
			    return;
			}
		    }
		    if (!readOneBuffer() || Thread.currentThread().isInterrupted()) {
			close();
			return;
		    }
		} catch (IOException ioe) {
		    //Stream already closed, this is fine
		    return;
		}
	    }
	}

	private boolean readOneBuffer() throws IOException {
	    char[] cbuf = new char[255];
	    int read;
	    while ((read = out.read(cbuf)) != -1) {
		writer.write(cbuf, 0, read);
	    }
	    return read != -1;
	}

	private void close() {
	    try {
		out.close();
	    } catch (IOException ioe) {
		Exceptions.printStackTrace(ioe);
	    } finally {
		writer.close();
	    }
	}
    }

    private File getFileToRender() throws IOException {
	FileObject render = toRender;
	if (render == null) {
	    PovrayProject proj = renderService.getProject();
	    MainFileProvider provider = (MainFileProvider) proj.getLookup().lookup(MainFileProvider.class);
	    if (provider == null) {
		throw new IllegalStateException("Main file provider missing");
	    }
	    render = provider.getMainFile();
	    if (render == null) {
		ProjectInformation info = (ProjectInformation) proj.getLookup().lookup(ProjectInformation.class);
		//XXX let the user choose
		throw new IOException(NbBundle.getMessage(Povray.class,
			"MSG_NoMainFile", info.getDisplayName()));
	    }
	}
	assert render != null;
	File result = FileUtil.toFile(render);
	if (result == null) {
	    throw new IOException(NbBundle.getMessage(Povray.class,
		    "MSG_VirtualFile", render.getName()));
	}
	assert result.exists();
	assert result.isFile();
	return result;
    }

    private String getCmdLineArgs(File includesDir) {
	StringBuilder cmdline = new StringBuilder();
	for (Iterator i = settings.keySet().iterator(); i.hasNext();) {
	    String key = (String) i.next();
	    String val = settings.getProperty(key);
	    cmdline.append('+');
	    cmdline.append(key);
	    cmdline.append(val);
	    cmdline.append(' ');
	}
	cmdline.append("+L");
	cmdline.append(includesDir.getPath());
	return cmdline.toString();
    }

    private File getImagesDir() {
	PovrayProject proj = renderService.getProject();
	FileObject fob = proj.getImagesFolder(true);
	File result = FileUtil.toFile(fob);
	assert result != null && result.exists();
	return result;
    }

    public static String stripExtension(File f) {
	String sceneName = f.getName();
	int endIndex;
	if ((endIndex = sceneName.lastIndexOf('.')) != -1) {
	    sceneName = sceneName.substring(0, endIndex);
	}
	return sceneName;
    }

    private void showMsg(String msg) {
	StatusDisplayer.getDefault().setStatusText(msg);
    }

    @NbBundle.Messages({"TTL_FindPovray=Locate POV-Ray Executable",
	"MSG_WindowsWarning="
	+ "POV-Ray for Windows always displays its graphical"
	+ "user interface when it runs. You can get a command-line "
	+ "version of POV-Ray at <a href=\"http://www.imagico.de/files/povcyg_350c.zip\">"
	+ "http://www.imagico.de/files/povcyg_350c.zip</a>"
    })
    private static File getPovray() {
	if (povray == null || !povray.exists()) {
	    Preferences prefs = RendererServiceImpl.getPreferences();
	    String loc = prefs.get(KEY_POVRAY_EXEC, null);
	    if (loc != null) {
		povray = new File(loc);
	    }
	    if (povray == null || !povray.exists()) {
		File maybePov = locate(Bundle.TTL_FindPovray());
		if (maybePov.getPath().endsWith("pvengine.exe")) {
		    //Warn the user to get a command line build:
		    NotifyDescriptor msg = new NotifyDescriptor.Confirmation(
			    NbBundle.getMessage(RendererServiceImpl.class,
			    Bundle.MSG_WindowsWarning()),
			    NotifyDescriptor.WARNING_MESSAGE);
		    Object result = DialogDisplayer.getDefault().notify(msg);
		    if (result == NotifyDescriptor.CANCEL_OPTION) {
			return null;
		    }
		}
		povray = maybePov;
		if (povray != null) {
		    prefs.put(KEY_POVRAY_EXEC, povray.getPath());
		}
	    }
	}
	return povray;
    }

    @NbBundle.Messages("TTL_FindIncludeDir=Find POV-Ray Standard Include File Dir")
    private static File getStandardIncludeDir(File povray) {
	if (include != null) {
	    return include;
	}
	Preferences prefs = RendererServiceImpl.getPreferences();
	String loc = prefs.get(KEY_POVRAY_INCLUDES, null);
	if (loc != null) {
	    include = new File(loc);
	    if (!include.exists()) {
		include = null;
	    }
	}
	if (include == null) {
	    include = new File(povray.getParentFile().getParent()
		    + File.separator + "include");
	    if (!include.exists()) {
		include = locate(Bundle.TTL_FindIncludeDir());
		if (include != null) {
		    prefs.put(KEY_POVRAY_INCLUDES, include.getPath());
		} else {
		    include = null;
		}
	    }
	}
	return include;
    }

    private static File locate(String key) {
	JFileChooser jfc = new JFileChooser();
	jfc.setDialogTitle(key);
	jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
	jfc.showOpenDialog(null);
	File result = jfc.getSelectedFile();
	return result;
    }
}