package org.netbeans.gradle.project.classpath;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.gradle.tooling.GradleConnector;
import org.gradle.tooling.ProjectConnection;
import org.gradle.tooling.model.ExternalDependency;
import org.gradle.tooling.model.eclipse.EclipseProject;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.platform.JavaPlatform;
import org.netbeans.api.java.platform.JavaPlatformManager;
import org.netbeans.api.java.platform.Specification;
import org.netbeans.api.project.Project;
import org.netbeans.spi.java.classpath.ClassPathImplementation;
import org.netbeans.spi.java.classpath.PathResourceImplementation;
import org.netbeans.spi.java.classpath.support.ClassPathSupport;
import org.openide.filesystems.FileUtil;

final class BootClassPathImplementation implements ClassPathImplementation {

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    private static Project project;

    public static BootClassPathImplementation forProject(Project project) {
        BootClassPathImplementation.project = project;
        BootClassPathImplementation impl = new BootClassPathImplementation();
        return impl;
    }

    @Override
    public List<PathResourceImplementation> getResources() {
        JavaPlatform jp = getJavaPlatform();
        final List<PathResourceImplementation> result = new ArrayList<PathResourceImplementation>();
        if (jp != null) {
            final ClassPath cp = jp.getBootstrapLibraries();
            assert cp != null : jp;
            for (ClassPath.Entry entry : cp.entries()) {
                result.add(ClassPathSupport.createResource(entry.getURL()));
            }
        }
        GradleConnector gradleConnector = GradleConnector.newConnector();
        gradleConnector.forProjectDirectory(FileUtil.toFile(project.getProjectDirectory()));
        ProjectConnection projectConnection = gradleConnector.connect();
        EclipseProject eclipseProject = projectConnection.getModel(EclipseProject.class);
        for (ExternalDependency externalDependency : eclipseProject.getClasspath()) {
            result.add(ClassPathSupport.createResource(FileUtil.urlForArchiveOrDir(externalDependency.getFile())));
        }
        return Collections.unmodifiableList(result);
    }

    public JavaPlatform getJavaPlatform() {
        JavaPlatform[] platforms = JavaPlatformManager.getDefault().getPlatforms(null, new Specification("j2se", null));
        for (JavaPlatform platform : platforms) {
            if (platform.getInstallFolders().size() > 0) {
                return platform;
            }
        }
        return JavaPlatform.getDefault();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.support.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.support.removePropertyChangeListener(listener);
    }

}
