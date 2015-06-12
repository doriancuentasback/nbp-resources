/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.examples.modules.povproject;

import java.util.Properties;
import org.netbeans.examples.api.povray.MainFileProvider;
import org.openide.filesystems.FileObject;

/**
 *
 * @author geertjan
 */
public class MainFileProviderImpl extends MainFileProvider {

    private final PovrayProject proj;

    private FileObject mainFile = null;

    private boolean checked = false;

    MainFileProviderImpl(PovrayProject proj) {
        this.proj = proj;
    }

    @Override
    public FileObject getMainFile() {
        //Try to look up the main file in the project properties
        //the first time this is called;  no need to look it up every
        //time, either it's there or it's not and when the user sets it
        //we'll save it when the project is closed
        if (mainFile == null && !checked) {
            checked = true;
            Properties props = (Properties) proj.getLookup().lookup(Properties.class);
            String path = props.getProperty(PovrayProject.KEY_MAINFILE);
            if (path != null) {
                FileObject projectDir = proj.getProjectDirectory();
                mainFile = projectDir.getFileObject(path);
            }
        }
        if (mainFile != null && !mainFile.isValid()) {
            return null;
        }
        return mainFile;
    }


    @Override
    public void setMainFile(FileObject file) {
        String projPath = proj.getProjectDirectory().getPath();
        assert file == null ||
                file.getPath().startsWith(projPath) :
                "Main file not under project";
        boolean change = ((mainFile == null) != (file == null)) ||
                (mainFile != null && !mainFile.equals(file));
        if (change) {
            mainFile = file;
            //Get the project properties (loaded from
            //$PROJECT/pvproject/project.properties)
            Properties props = (Properties) proj.getLookup().lookup(
                    Properties.class);
            //Store the relative path from the project root as the main file
            String relPath = file.getPath().substring(projPath.length());
            props.put(PovrayProject.KEY_MAINFILE, relPath);
        }
    }

}