package org.netbeans.gradle.project.classpath;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.netbeans.api.project.Project;
import org.netbeans.spi.java.classpath.ClassPathImplementation;
import org.netbeans.spi.java.classpath.PathResourceImplementation;
import org.netbeans.spi.java.classpath.support.ClassPathSupport;
import org.openide.filesystems.FileUtil;
import org.openide.util.Utilities;

final class ProjectClassPathImplementation implements ClassPathImplementation {

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    private List<PathResourceImplementation> resources;

    private static Project project;

    public static ProjectClassPathImplementation forProject(Project project) {
        ProjectClassPathImplementation.project = project;
        ProjectClassPathImplementation impl = new ProjectClassPathImplementation();
        return impl;
    }

    @Override
    public synchronized List<PathResourceImplementation> getResources() {
        if (this.resources == null) {
            this.resources = this.getPath();
        }
        return this.resources;
    }

    private List<PathResourceImplementation> getPath() {
        assert Thread.holdsLock(this);
        List<PathResourceImplementation> result = new ArrayList<PathResourceImplementation>();
        addLibs(FileUtil.toFile(project.getProjectDirectory()), result);
        return Collections.unmodifiableList(result);
    }

    private void addLibs(File root, List<PathResourceImplementation> result) {
        if (!root.exists() || !root.isDirectory()) {
            return;
        }
        File libDir = new File(root, SourceCategory.LIB.getRelativePath());
        if (!libDir.exists() || !libDir.isDirectory()) {
            return;
        }
        addJars(libDir, result, false);
    }

    private static void addJars(File dir, List<PathResourceImplementation> result, boolean recurse) {
        File[] jars = dir.listFiles();
        if (jars != null) {
            for (File f : jars) {
                try {
                    if (f.isFile()) {
                        URL entry = Utilities.toURI(f).toURL();
                        if (FileUtil.isArchiveFile(entry)) {
                            entry = FileUtil.getArchiveRoot(entry);
                            result.add(ClassPathSupport.createResource(entry));
                        }
                    } else if (recurse && f.isDirectory()) {
                        addJars(f, result, recurse);
                    }
                } catch (MalformedURLException mue) {
                    assert false : mue;
                }
            }
        }
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

}
