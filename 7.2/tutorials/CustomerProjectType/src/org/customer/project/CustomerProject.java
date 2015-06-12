package org.customer.project;

import java.awt.Image;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.customer.project.sub.ReportsSubprojectProvider;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.CopyOperationImplementation;
import org.netbeans.spi.project.DeleteOperationImplementation;
import org.netbeans.spi.project.MoveOrRenameOperationImplementation;
import org.netbeans.spi.project.ProjectState;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.netbeans.spi.project.ui.support.CommonProjectActions;
import org.netbeans.spi.project.ui.support.DefaultProjectOperations;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;

public class CustomerProject implements Project {

    private final FileObject projectDir;
    private final ProjectState state;
    private Lookup lkp;

    CustomerProject(FileObject dir, ProjectState state) {
        this.projectDir = dir;
        this.state = state;
    }

    @Override
    public FileObject getProjectDirectory() {
        return projectDir;
    }

    @Override
    public Lookup getLookup() {
        if (lkp == null) {
            lkp = Lookups.fixed(new Object[]{
                this,
                new Info(),
                new CustomerProjectLogicalView(this),
                new CustomerCustomizerProvider(this),
                new CustomerActionProvider(),
                new CustomerProjectMoveOrRenameOperation(),
                new CustomerProjectCopyOperation(),
                new CustomerProjectDeleteOperation(this),
                new ReportsSubprojectProvider(this),});
        }
        return lkp;
    }

    class CustomerActionProvider implements ActionProvider {

        @Override
        public String[] getSupportedActions() {
            return new String[]{
                ActionProvider.COMMAND_RENAME,
                ActionProvider.COMMAND_MOVE,
                ActionProvider.COMMAND_COPY,
                ActionProvider.COMMAND_DELETE
            };
        }

        @Override
        public void invokeAction(String string, Lookup lkp) throws IllegalArgumentException {
            if (string.equalsIgnoreCase(ActionProvider.COMMAND_RENAME)) {
                DefaultProjectOperations.performDefaultRenameOperation(
                        CustomerProject.this,
                        "");
            }
            if (string.equalsIgnoreCase(ActionProvider.COMMAND_MOVE)) {
                DefaultProjectOperations.performDefaultMoveOperation(
                        CustomerProject.this);
            }
            if (string.equalsIgnoreCase(ActionProvider.COMMAND_COPY)) {
                DefaultProjectOperations.performDefaultCopyOperation(
                        CustomerProject.this);
            }
            if (string.equalsIgnoreCase(ActionProvider.COMMAND_DELETE)) {
                DefaultProjectOperations.performDefaultDeleteOperation(
                        CustomerProject.this);
            }
        }

        @Override
        public boolean isActionEnabled(String command, Lookup lookup) throws IllegalArgumentException {
            if ((command.equals(ActionProvider.COMMAND_RENAME))) {
                return true;
            } else if ((command.equals(ActionProvider.COMMAND_MOVE))) {
                return true;
            } else if ((command.equals(ActionProvider.COMMAND_COPY))) {
                return true;
            } else if ((command.equals(ActionProvider.COMMAND_DELETE))) {
                return true;
            }
            return false;
        }

    }

    private final class CustomerProjectMoveOrRenameOperation implements MoveOrRenameOperationImplementation {

        @Override
        public List<FileObject> getMetadataFiles() {
            return new ArrayList<FileObject>();
        }

        @Override
        public List<FileObject> getDataFiles() {
            return new ArrayList<FileObject>();
        }

        @Override
        public void notifyRenaming() throws IOException {
        }

        @Override
        public void notifyRenamed(String nueName) throws IOException {
        }

        @Override
        public void notifyMoving() throws IOException {
        }

        @Override
        public void notifyMoved(Project original, File originalPath, String nueName) throws IOException {
        }
    
    }

    private final class CustomerProjectCopyOperation implements CopyOperationImplementation {

        @Override
        public List<FileObject> getMetadataFiles() {
            return new ArrayList<FileObject>();
        }

        @Override
        public List<FileObject> getDataFiles() {
            return new ArrayList<FileObject>();
        }

        @Override
        public void notifyCopying() throws IOException {
        }

        @Override
        public void notifyCopied(Project prjct, File file, String string) throws IOException {
        }
    
    }

    private final class CustomerProjectDeleteOperation implements DeleteOperationImplementation {

        private final CustomerProject project;

        private CustomerProjectDeleteOperation(CustomerProject project) {
            this.project = project;
        }

        @Override
        public List<FileObject> getDataFiles() {
            List<FileObject> files = new ArrayList<FileObject>();
            FileObject[] projectChildren = project.getProjectDirectory().getChildren();
            for (FileObject fileObject : projectChildren) {
                addFile(project.getProjectDirectory(), fileObject.getNameExt(), files);
            }
            return files;
        }

        private void addFile(FileObject projectDirectory, String fileName, List<FileObject> result) {
            FileObject file = projectDirectory.getFileObject(fileName);
            if (file != null) {
                result.add(file);
            }
        }

        @Override
        public List<FileObject> getMetadataFiles() {
            return new ArrayList<FileObject>();
        }

        @Override
        public void notifyDeleting() throws IOException {
        }

        @Override
        public void notifyDeleted() throws IOException {
        }
    
    }

    class CustomerProjectLogicalView implements LogicalViewProvider {

        @StaticResource()
        public static final String CUSTOMER_ICON = "org/customer/project/icon.png";
        private final CustomerProject project;

        public CustomerProjectLogicalView(CustomerProject project) {
            this.project = project;
        }

        @Override
        public Node createLogicalView() {
            try {
                //Obtain the project directory's node:
                FileObject projectDirectory = project.getProjectDirectory();
                DataFolder projectFolder = DataFolder.findFolder(projectDirectory);
                Node nodeOfProjectFolder = projectFolder.getNodeDelegate();
                //Decorate the project directory's node:
                return new ProjectNode(nodeOfProjectFolder, project);
            } catch (DataObjectNotFoundException donfe) {
                Exceptions.printStackTrace(donfe);
                //Fallback-the directory couldn't be created -
                //read-only filesystem or something evil happened
                return new AbstractNode(Children.LEAF);
            }
        }

        private final class ProjectNode extends FilterNode {

            final CustomerProject project;

            public ProjectNode(Node node, CustomerProject project) throws DataObjectNotFoundException {
                super(node,
                        NodeFactorySupport.createCompositeChildren(
                        project,
                        "Projects/org-customer-project/Nodes"),
                        // new FilterNode.Children(node),
                        new ProxyLookup(
                        new Lookup[]{
                    Lookups.singleton(project),
                    node.getLookup()
                }));
                this.project = project;
            }

            @Override
            public Action[] getActions(boolean arg0) {
                return new Action[]{
                    CommonProjectActions.newFileAction(),
                    CommonProjectActions.copyProjectAction(),
                    CommonProjectActions.moveProjectAction(),
                    CommonProjectActions.renameProjectAction(),
                    CommonProjectActions.deleteProjectAction(),
                    CommonProjectActions.customizeProjectAction(),
                    CommonProjectActions.closeProjectAction()
                };
            }

            @Override
            public Image getIcon(int type) {
                return ImageUtilities.loadImage(CUSTOMER_ICON);
            }

            @Override
            public Image getOpenedIcon(int type) {
                return getIcon(type);
            }

            @Override
            public String getDisplayName() {
                return project.getProjectDirectory().getName();
            }
    
        }

        @Override
        public Node findPath(Node root, Object target) {
            //leave unimplemented for now
            return null;
        }
    
    }

    private final class Info implements ProjectInformation {

        @StaticResource()
        public static final String CUSTOMER_ICON = "org/customer/project/icon.png";

        @Override
        public Icon getIcon() {
            return new ImageIcon(ImageUtilities.loadImage(CUSTOMER_ICON));
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
            return CustomerProject.this;
        }

    }

}
