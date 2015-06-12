/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.examples.modules.povproject;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.examples.api.povray.RendererService;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ProjectState;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.RequestProcessor;
import org.openide.util.lookup.Lookups;

public class PovrayProject implements Project {

    public static final String SCENES_DIR = "scenes"; //NOI18N
    public static final String IMAGES_DIR = "images"; //NOI18N
    public static final String KEY_MAINFILE = "main.file";
    private final FileObject projectDir;
    LogicalViewProvider logicalView = new PovrayLogicalView(this);
    private final ProjectState state;

    public PovrayProject(FileObject projectDir, ProjectState state) {
        this.projectDir = projectDir;
        this.state = state;
    }

    @Override
    public FileObject getProjectDirectory() {
        return projectDir;
    }

    FileObject getScenesFolder(boolean create) {
        FileObject result =
                projectDir.getFileObject(SCENES_DIR);

        if (result == null && create) {
            try {
                result = projectDir.createFolder(SCENES_DIR);
            } catch (IOException ioe) {
                Exceptions.printStackTrace(ioe);
            }
        }
        return result;
    }

    FileObject getImagesFolder(boolean create) {
        FileObject result =
                projectDir.getFileObject(IMAGES_DIR);
        if (result == null && create) {
            try {
                result = projectDir.createFolder(IMAGES_DIR);
            } catch (IOException ioe) {
                Exceptions.printStackTrace(ioe);
            }
        }
        return result;
    }
    private Lookup lkp;

    @Override
    public Lookup getLookup() {
        if (lkp == null) {
            lkp = Lookups.fixed(new Object[]{
                        this, //project spec requires a project be in its own lookup
                        state, //allow outside code to mark the project as needing saving
                        new ActionProviderImpl(), //Provides standard actions like Build and Clean
                        loadProperties(), //The project properties
                        new Info(), //Project information implementation
                        logicalView, //Logical view of project implementation
                        new MainFileProviderImpl(this),
                        new RendererServiceImpl(this), //Renderer Service Implementation
                        new ViewServiceImpl(this), //Allow things to find/open the image associated with a scene file
                    });
        }
        return lkp;
    }

    private Properties loadProperties() {

        FileObject fob = projectDir.getFileObject(PovProjectFactory.PROJECT_DIR
                + "/" + PovProjectFactory.PROJECT_PROPFILE);

        Properties properties = new NotifyProperties(state);
        if (fob != null) {
            try {
                properties.load(fob.getInputStream());
            } catch (Exception e) {
                Exceptions.printStackTrace(e);
            }
        }

        return properties;

    }

    private static class NotifyProperties extends Properties {

        private final ProjectState state;

        NotifyProperties(ProjectState state) {
            this.state = state;
        }

        @Override
        public Object put(Object key, Object val) {
            Object result = super.put(key, val);
            if (((result == null) != (val == null)) || (result != null
                    && val != null && !val.equals(result))) {
                state.markModified();
            }

            return result;

        }
    }

    private final class ActionProviderImpl implements ActionProvider {

        @Override
        public String[] getSupportedActions() {
            return new String[]{
                        ActionProvider.COMMAND_BUILD,
                        ActionProvider.COMMAND_CLEAN,
                        ActionProvider.COMMAND_COMPILE_SINGLE
                    };
        }

        @Override
        public void invokeAction(String string, Lookup lookup) throws IllegalArgumentException {
            int idx = Arrays.asList(getSupportedActions()).indexOf(string);
            switch (idx) {
                case 0: //build
                    final RendererService ren = (RendererService) getLookup().lookup(RendererService.class);
                    RequestProcessor.getDefault().post(new Runnable() {
                        @Override
                        public void run() {
                            FileObject image = ren.render();
                            //If we succeeded, try to open the image
                            if (image != null) {
                                DataObject dob;
                                try {
                                    dob = DataObject.find(image);
                                    OpenCookie open = (OpenCookie) dob.getNodeDelegate().getLookup().lookup(
                                            OpenCookie.class);
                                    if (open != null) {
                                        open.open();
                                    }
                                } catch (DataObjectNotFoundException ex) {
                                    Exceptions.printStackTrace(ex);
                                }
                            }
                        }
                    });
                    break;
                case 1: //clean
                    FileObject fob = getImagesFolder(false);
                    if (fob != null) {
                        DataFolder fld = DataFolder.findFolder(fob);
                        for (Enumeration en = fld.children(); en.hasMoreElements();) {
                            DataObject ob = (DataObject) en.nextElement();
                            try {
                                ob.delete();
                            } catch (IOException ioe) {
                                Exceptions.printStackTrace(ioe);
                            }
                        }
                    }
                    break;
                case 2: //compile-single
                    final DataObject ob = (DataObject) lookup.lookup(DataObject.class);
                    if (ob != null) {
                        final RendererService ren1 = (RendererService) getLookup().lookup(RendererService.class);
                        RequestProcessor.getDefault().post(new Runnable() {
                            @Override
                            public void run() {
                                if (ob.isValid()) { //Could theoretically change before we run
                                    ren1.render(ob.getPrimaryFile());
                                }
                            }
                        });
                    }
                    break;
                default:
                    throw new IllegalArgumentException(string);
            }
        }

        @Override
        public boolean isActionEnabled(String string, Lookup lookup) throws IllegalArgumentException {
            int idx = Arrays.asList(getSupportedActions()).indexOf(string);
            boolean result;
            switch (idx) {
                case 0: //build
                    result = true;
                    break;
                case 1: //clean
                    result = getImagesFolder(false) != null
                            && getImagesFolder(false).getChildren().length > 0;
                    break;
                case 2: //compile-single
                    DataObject ob = (DataObject) lookup.lookup(DataObject.class);
                    if (ob != null) {
                        FileObject file = ob.getPrimaryFile();
                        result = "text/x-povray".equals(file.getMIMEType());
                    } else {
                        result = false;
                    }
                    break;
                default:
                    result = false;
            }
            return result;
        }

    }

    /**
     * Implementation of project system's ProjectInformation class
     */
    private final class Info implements ProjectInformation {

        @Override
        public Icon getIcon() {
            return new ImageIcon(ImageUtilities.loadImage(
                    "org/netbeans/examples/modules/povproject/resources/scenes.gif"));
        }

        @Override
        public String getName() {
            return getProjectDirectory().getName();
        }

        @Override
        public String getDisplayName() {
            return getName();
        }

        @Override
        public void addPropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }

        @Override
        public void removePropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }

        @Override
        public Project getProject() {
            return PovrayProject.this;
        }
    }
}
