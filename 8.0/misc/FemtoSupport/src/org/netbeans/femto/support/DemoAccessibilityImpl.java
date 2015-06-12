package org.netbeans.femto.support;

import java.io.IOException;
import java.io.InputStream;
import org.netbeans.api.project.Project;
import org.netbeans.spi.java.queries.AccessibilityQueryImplementation;
import org.netbeans.spi.project.ProjectServiceProvider;
import org.netbeans.spi.project.support.ant.AntProjectHelper;
import org.netbeans.spi.project.support.ant.EditableProperties;
import org.openide.filesystems.FileObject;
import org.openide.util.Exceptions;

@ProjectServiceProvider(
        projectType = "org-netbeans-modules-java-j2seproject",
        service = AccessibilityQueryImplementation.class)
public class DemoAccessibilityImpl implements AccessibilityQueryImplementation {
    private final Project project;
    public DemoAccessibilityImpl(Project project) {
        this.project = project;
    }
    @Override
    public Boolean isPubliclyAccessible(FileObject pkg) {
        String packageName = pkg.getName();
        FileObject projectprop =
           project.getProjectDirectory().getFileObject(AntProjectHelper.PROJECT_PROPERTIES_PATH);
        EditableProperties ep;
        try {
            ep = loadProperties(projectprop);
            if (ep.containsKey("enableforJavaCard")) {
                return ep.get("enableforJavaCard").contains(packageName);
            }
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return false;
    }
    private static EditableProperties loadProperties(FileObject propsFO) throws IOException {
        InputStream propsIS = propsFO.getInputStream();
        EditableProperties props = new EditableProperties(true);
        try {
            props.load(propsIS);
        } finally {
            propsIS.close();
        }
        return props;
    }
}