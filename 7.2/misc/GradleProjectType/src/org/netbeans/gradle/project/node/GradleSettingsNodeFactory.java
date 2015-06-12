package org.netbeans.gradle.project.node;

import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.api.project.Sources;
import org.netbeans.gradle.project.GradleProject;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.ChangeSupport;
import org.openide.util.Exceptions;

/**
 *
 * @author Martin Adamek & Geertjan Wielenga
 */
@NodeFactory.Registration(projectType = "org-gradle-project", position = 40)
public class GradleSettingsNodeFactory implements NodeFactory {

    private GradleProject project;

    @Override
    public NodeList<?> createNodes(Project p) {
        project = p.getLookup().lookup(GradleProject.class);
        assert project != null;
        return new LibrariesNodeList(project);
    }

    private class LibrariesNodeList implements NodeList<Node>, ChangeListener {

        private final ChangeSupport changeSupport = new ChangeSupport(this);

        public LibrariesNodeList(GradleProject proj) {
            project = proj;
        }

        @Override
        public List<Node> keys() {
            List<Node> result = new ArrayList<Node>();
            try {
                FileObject fo = project.getProjectDirectory().getFileObject("settings.gradle");
                if (fo != null) {
                    result.add(DataObject.find(fo).getNodeDelegate());
                }
            } catch (DataObjectNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
            return result;
        }

        @Override
        public Node node(Node key) {
            return new FilterNode(key);
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
}
