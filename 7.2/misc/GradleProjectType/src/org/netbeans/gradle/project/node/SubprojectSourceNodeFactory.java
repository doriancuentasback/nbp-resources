package org.netbeans.gradle.project.node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.api.project.SourceGroup;
import org.netbeans.api.project.Sources;
import org.netbeans.gradle.project.classpath.GroovySources;
import org.netbeans.spi.java.project.support.ui.PackageView;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.nodes.Node;
import org.openide.util.ChangeSupport;

/**
 *
 * @author Martin Adamek & Geertjan Wielenga
 */
@NodeFactory.Registration(projectType="org-gradle-subproject", position=10)
public class SubprojectSourceNodeFactory implements NodeFactory {

    @Override
    public NodeList<?> createNodes(Project p) {
        org.netbeans.gradle.subproject.GradleSubProject project = p.getLookup().lookup(org.netbeans.gradle.subproject.GradleSubProject.class);
        assert project != null;
        return new SourcesNodeList(project);
    }

    private class SourcesNodeList implements NodeList<SourceGroupKey>, ChangeListener {

        private org.netbeans.gradle.subproject.GradleSubProject project;

        private final ChangeSupport changeSupport = new ChangeSupport(this);

        public SourcesNodeList(org.netbeans.gradle.subproject.GradleSubProject proj) {
            this.project = proj;
        }

        @Override
        public List<SourceGroupKey> keys() {
            FileObject projectDir = project.getProjectDirectory();
            if (projectDir == null || !projectDir.isValid()) {
                return Collections.<SourceGroupKey>emptyList();
            }
            Sources sources = getSources();
            List<SourceGroup> sourceGroups = GroovySources.getGroovySourceGroups(sources);
            
            List<SourceGroupKey> result =  new ArrayList<SourceGroupKey>();

            for (SourceGroup sourceGroup : sourceGroups) {
                if (sourceGroup.getRootFolder() != null) {
                    result.add(new SourceGroupKey(sourceGroup, projectDir));
                }
            }
            
            Collections.sort(result);
            return result;
        }
        
        @Override
        public Node node(SourceGroupKey key) {
            return PackageView.createPackageView(key.group);
        }

        @Override
        public void addChangeListener(ChangeListener l) {
            changeSupport.addChangeListener(l);
        }

        @Override
        public void removeChangeListener(ChangeListener l) {
            changeSupport.removeChangeListener(l);
        }

        @Override
        public void addNotify() {
            getSources().addChangeListener(this);
        }

        @Override
        public void removeNotify() {
            getSources().removeChangeListener(this);
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            // setKeys(getKeys());
            // The caller holds ProjectManager.mutex() read lock
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    changeSupport.fireChange();
                }
            });
        }

        private Sources getSources() {
            return ProjectUtils.getSources(project);
        }

    }

    private static class SourceGroupKey implements Comparable<SourceGroupKey> {

        public final SourceGroup group;
        public final FileObject fileObject;
        public final FileObject projectDir;

        SourceGroupKey(SourceGroup group, FileObject projectDir) {
            this.group = group;
            this.fileObject = group.getRootFolder();
            this.projectDir = projectDir;
        }

        @Override
        public int hashCode() {
            return fileObject.hashCode();
        }


        @Override
        public int compareTo(SourceGroupKey o) {
            String relativePath1 = FileUtil.getRelativePath(projectDir, fileObject);
            String relativePath2 = FileUtil.getRelativePath(projectDir, o.fileObject);
            return relativePath1.compareTo(relativePath2);
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof SourceGroupKey)) {
                return false;
            } else {
                SourceGroupKey otherKey = (SourceGroupKey) obj;
                String thisDisplayName = this.group.getDisplayName();
                String otherDisplayName = otherKey.group.getDisplayName();
                // XXX what is the operator binding order supposed to be here??
                return fileObject.equals(otherKey.fileObject) &&
                        thisDisplayName == null ? otherDisplayName == null : thisDisplayName.equals(otherDisplayName);
            }
        }

        @Override
        public String toString() {
            return group.toString();
        }

    }

}
