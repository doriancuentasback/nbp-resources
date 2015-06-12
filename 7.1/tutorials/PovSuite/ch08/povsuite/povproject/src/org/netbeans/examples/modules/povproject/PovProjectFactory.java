/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.examples.modules.povproject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ProjectFactory;
import org.netbeans.spi.project.ProjectState;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service=ProjectFactory.class)
public class PovProjectFactory implements ProjectFactory {

    public static final String PROJECT_DIR = "pvproject";
    public static final String PROJECT_PROPFILE = "project.properties";

    @Override
    public boolean isProject(FileObject projectDirectory) {
        return projectDirectory.getFileObject(PROJECT_DIR) != null;
    }

    @Override
    public Project loadProject(FileObject projectDirectory, ProjectState state) throws IOException {
        return isProject(projectDirectory) ? new PovrayProject(projectDirectory, state) : null;
    }

    @Override
    public void saveProject(Project project) throws IOException, ClassCastException {
    
        FileObject projectRoot = project.getProjectDirectory();
        if (projectRoot.getFileObject(PROJECT_DIR) == null) {
            throw new IOException("Project dir " + projectRoot.getPath() + " deleted,"
                    + " cannot save project");
        }

        //Force creation of the scenes/ dir if it was deleted
        ((PovrayProject) project).getScenesFolder(true);

        //Find the properties file pvproject/project.properties,
        //creating it if necessary
        String propsPath = PROJECT_DIR + "/" + PROJECT_PROPFILE;
        FileObject propertiesFile = projectRoot.getFileObject(propsPath);
        if (propertiesFile == null) {
            //Recreate the properties file if needed
            propertiesFile = projectRoot.createData(propsPath);
        }

        Properties properties = (Properties) project.getLookup().lookup(Properties.class);
        File f = FileUtil.toFile(propertiesFile);
        properties.store(new FileOutputStream(f), "NetBeans Povray Project Properties");

    }

}
