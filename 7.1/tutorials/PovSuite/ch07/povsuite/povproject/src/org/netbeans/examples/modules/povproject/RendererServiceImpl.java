package org.netbeans.examples.modules.povproject;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.prefs.Preferences;
import org.netbeans.examples.api.povray.RendererService;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.Exceptions;

public class RendererServiceImpl extends RendererService {

    private PovrayProject proj;

    public RendererServiceImpl(PovrayProject proj) {
        this.proj = proj;
    }

    PovrayProject getProject() {
        return proj;
    }

    private FileObject getRendererSettingsFolder() {
        String folderName = "Povray/RendererSettings";
        FileObject result = FileUtil.getConfigFile(folderName);
        if (result == null && !logged) {
            //Corrupted userdir or something is very very wrong.
            //Log it and move on.
            Exceptions.printStackTrace(new IllegalStateException("Renderer settings dir missing!"));
            logged = true;
        }
        return result;
    }
    private static boolean logged = false;

    private FileObject fileFor(String settingsName) {
        FileObject settingsFolder = getRendererSettingsFolder();
        FileObject result;
        if (settingsFolder != null) { //should never be null
            result = settingsFolder.getFileObject(settingsName);
        } else {
            result = null;
        }
        return result;
    }

    private void setPreferredRendererSettingsName(String val) {
        getPreferences().put(KEY_PREFERRED_SETTINGS, val);
    }
    private static final String KEY_PREFERRED_SETTINGS = "preferredSettings";

    static Preferences getPreferences() {
        return Preferences.userNodeForPackage(RendererServiceImpl.class);
    }

    @Override
    public FileObject render(FileObject scene, String propertiesName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FileObject render(FileObject scene, Properties renderSettings) {
        Povray pov = new Povray(this, scene, renderSettings);
        try {
            return pov.render();
        } catch (IOException ioe) {
            Exceptions.printStackTrace(ioe);
            return null;
        }
    }

    @Override
    public FileObject render(FileObject scene) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FileObject render() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String[] getAvailableRendererSettingsNames() {
        FileObject settingsFolder = getRendererSettingsFolder();
        String[] result;
        if (settingsFolder != null) {
            //Use a DataFolder here, so our ordering attributes in the layer
            //file are applied, and our returned String array will be in the
            //order we want
            DataFolder fld = DataFolder.findFolder(settingsFolder);
            DataObject[] kids = fld.getChildren();
            result = new String[kids.length];
            for (int i = 0; i < kids.length; i++) {
                result[i] = kids[i].getPrimaryFile().getNameExt();
            }
        } else {
            result = new String[0];
        }
        return result;
    }

    @Override
    public Properties getRendererSettings(String name) {
        Properties result = new Properties();
        FileObject settingsFile = fileFor(name);
        if (settingsFile != null) {
            try {
                result.load(new BufferedInputStream(settingsFile.getInputStream()));
            } catch (FileNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        } else {
            Exceptions.printStackTrace(
                    new NullPointerException("Requested non-existent settings "
                    + "file " + name));
        }
        return result;
    }

    @Override
    public String getPreferredRendererSettingsNames() {
        String result = getPreferences().get(KEY_PREFERRED_SETTINGS, null);
        if (result == null) {
            result = "640x480.properties";
        }
        return result;
    }

    @Override
    public String getDisplayName(String settingsName) {
        FileObject file = fileFor(settingsName);
        String result;
        if (file != null) {
            DataObject dob;
            try {
                dob = DataObject.find(file);
                result = dob.getNodeDelegate().getDisplayName();
            } catch (DataObjectNotFoundException ex) {
                Exceptions.printStackTrace(ex);
                result = "[error]";
            }
        } else {
            result = "";
        }
        return result;
    }
}
