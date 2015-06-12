package org.netbeans.gradle.project;

import java.awt.Image;
import javax.swing.Action;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.netbeans.spi.project.ui.support.CommonProjectActions;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.netbeans.spi.project.ui.support.ProjectSensitiveActions;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;

public class GradleProjectLogicalViewProvider implements LogicalViewProvider {

    private final GradleProject project;
    private GradleProjectNode rootNode = null;

    public GradleProjectLogicalViewProvider(GradleProject project) {
        this.project = project;
    }

    @Override
    public Node createLogicalView() {
        if (rootNode == null) {
            try {
                rootNode = new GradleProjectNode(DataFolder.findFolder(project.getProjectDirectory()).getNodeDelegate());
            } catch (DataObjectNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return rootNode;
    }

    private final class GradleProjectNode extends FilterNode {

        @StaticResource()
        private final String imageLoc = "org/netbeans/gradle/project/resources/gradle.png";

        public GradleProjectNode(Node node) throws DataObjectNotFoundException {
            super(node, NodeFactorySupport.createCompositeChildren(project, "Projects/org-gradle-project/Nodes"),
                    new ProxyLookup(
                    Lookups.singleton(project),
                    node.getLookup()));
        }

        @Override
        public Action[] getActions(boolean arg0) {
            Action[] nodeActions = new Action[]{
                ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_RUN, "Run", null),
                CommonProjectActions.newFileAction(),
                CommonProjectActions.copyProjectAction(),
                CommonProjectActions.deleteProjectAction(),
                CommonProjectActions.customizeProjectAction(),
                CommonProjectActions.closeProjectAction(),
            };
            return nodeActions;
        }

        @Override
        public Image getIcon(int type) {
            return ImageUtilities.loadImage(imageLoc);
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
