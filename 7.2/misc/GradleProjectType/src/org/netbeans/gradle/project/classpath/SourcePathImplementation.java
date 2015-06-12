package org.netbeans.gradle.project.classpath;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.netbeans.api.project.Project;
import org.netbeans.spi.java.classpath.ClassPathImplementation;
import org.netbeans.spi.java.classpath.PathResourceImplementation;
import org.netbeans.spi.java.classpath.support.ClassPathSupport;

final class SourcePathImplementation implements ClassPathImplementation, PropertyChangeListener {

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    private final SourceRoots sourceRoots;

    private List<PathResourceImplementation> resources;

    private SourcePathImplementation(SourceRoots sourceRoots) {
        assert sourceRoots != null;
        this.sourceRoots = sourceRoots;
    }

    public static SourcePathImplementation forProject(Project project, SourceRoots sourceRoots) {
        return new SourcePathImplementation(sourceRoots);
    }

    @Override
    public List<PathResourceImplementation> getResources() {
        synchronized (this) {
            if (this.resources != null) {
                return this.resources;
            }
        }
        List<URL> roots = this.sourceRoots.getRootURLs();
        synchronized (this) {
            if (this.resources == null) {
                List<PathResourceImplementation> result = new ArrayList<PathResourceImplementation>(roots.size());
                for (URL url : roots) {
                    PathResourceImplementation res = ClassPathSupport.createResource(url);
                    result.add(res);
                }
                this.resources = Collections.unmodifiableList(result);
            }
            return this.resources;
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
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
