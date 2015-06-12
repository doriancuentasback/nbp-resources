/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.examples.modules.povproject;

import java.io.File;
import java.util.prefs.Preferences;
import javax.swing.JFileChooser;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.NbBundle;
import org.openide.windows.WindowManager;

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

    @NbBundle.Messages({"TTL_FindPovray=Locate POV-Ray Executable",
        "MSG_WindowsWarning="
        + "<html>POV-Ray for Windows always displays its graphical"
        + "user interface when it runs. You can get a command-line "
        + "version of POV-Ray at <a href=\"http://www.imagico.de/files/povcyg_350c.zip\">"
        + "http://www.imagico.de/files/povcyg_350c.zip</a></html>"
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
        jfc.setDialogTitle(NbBundle.getMessage(Povray.class, key));
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.showOpenDialog(WindowManager.getDefault().getMainWindow());
        File result = jfc.getSelectedFile();
        return result;
    }
    
}
