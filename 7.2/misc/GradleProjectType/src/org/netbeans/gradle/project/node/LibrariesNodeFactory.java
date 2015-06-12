package org.netbeans.gradle.project.node;

import java.awt.Image;
import java.beans.BeanInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.gradle.tooling.GradleConnector;
import org.gradle.tooling.ProjectConnection;
import org.gradle.tooling.model.ExternalDependency;
import org.gradle.tooling.model.eclipse.EclipseProject;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.api.project.SourceGroup;
import org.netbeans.api.project.Sources;
import org.netbeans.gradle.project.GradleProject;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.ChangeSupport;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;

/**
 *
 * @author Martin Adamek & Geertjan Wielenga
 */
@NodeFactory.Registration(projectType = "org-gradle-project", position = 20)
public class LibrariesNodeFactory implements NodeFactory {

    private GradleProject project;

    @Override
    public NodeList<?> createNodes(Project p) {
        project = p.getLookup().lookup(GradleProject.class);
        assert project != null;
        return new LibrariesNodeList(project);
    }

    private class LibrariesNodeList implements NodeList<String>, ChangeListener {

        private final ChangeSupport changeSupport = new ChangeSupport(this);

        public LibrariesNodeList(GradleProject proj) {
            project = proj;
        }

        @Override
        public List<String> keys() {
            List<String> result = new ArrayList<String>();
            result.add("Libraries");
            return result;
        }

        @Override
        public Node node(String key) {
            AbstractNode dependenciesNode = new AbstractNode(Children.create(new GradleLibrariesChildFactory(), true)) {
                @Override
                public Image getIcon(int type) {
                    return getMergedImage();
                }

                @Override
                public Image getOpenedIcon(int type) {
                    return getMergedImage();
                }
            };
            dependenciesNode.setDisplayName(key);
            return dependenciesNode;
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

    private Image getMergedImage() {
        Node n = DataFolder.findFolder(FileUtil.getConfigRoot()).getNodeDelegate();
        Icon original = new ImageIcon(n.getIcon(BeanInfo.ICON_COLOR_16x16));
        Image image = ((ImageIcon) original).getImage();
        Image badge = ImageUtilities.loadImage("org/netbeans/modules/java/api/common/project/ui/resources/libraries-badge.png");
        final Image mergeImages = ImageUtilities.mergeImages(image, badge, 7, 7);
        return mergeImages;
    }

    private class GradleLibrariesChildFactory extends ChildFactory<ExternalDependency> implements FileChangeListener {

        @StaticResource()
        private final String imageLoc = "org/netbeans/gradle/project/resources/task.gif";

        private GradleLibrariesChildFactory() {
            project.getProjectDirectory().getFileObject("build.gradle").addFileChangeListener(this);
        }

        @Override
        protected boolean createKeys(List<ExternalDependency> list) {
            GradleConnector gradleConnector = GradleConnector.newConnector();
            gradleConnector.forProjectDirectory(FileUtil.toFile(project.getProjectDirectory()));
            ProjectConnection projectConnection = gradleConnector.connect();
            EclipseProject project = projectConnection.getModel(EclipseProject.class);
            for (ExternalDependency externalDependency : project.getClasspath()) {
                list.add(externalDependency);
            }
            return true;
        }

        @Override
        protected Node createNodeForKey(ExternalDependency key) {
            Node node = null;
            try {
                node = new FilterNode(DataObject.find(FileUtil.toFileObject(key.getFile())).getNodeDelegate());
            } catch (DataObjectNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
            return node;
        }

        @Override
        public void fileFolderCreated(FileEvent fe) {
        }

        @Override
        public void fileDataCreated(FileEvent fe) {
        }

        @Override
        public void fileChanged(FileEvent fe) {
            refresh(true);
        }

        @Override
        public void fileDeleted(FileEvent fe) {
        }

        @Override
        public void fileRenamed(FileRenameEvent fre) {
        }

        @Override
        public void fileAttributeChanged(FileAttributeEvent fae) {
        }
    }
}
