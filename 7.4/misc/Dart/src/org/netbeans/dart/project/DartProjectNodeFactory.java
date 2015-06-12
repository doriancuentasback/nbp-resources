package org.netbeans.dart.project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.xml.sax.SAXException;

/**
 *
 * @author geertjan
 */
@NodeFactory.Registration(projectType = "org-netbeans-modules-web-clientproject", position = 200)
public class DartProjectNodeFactory implements NodeFactory {

    @Override
    public NodeList createNodes(Project project) {
        FilterNode projectNode;
        try {
            Node node = DataObject.find(project.getProjectDirectory()).getNodeDelegate().getChildren().findChild("web");
            if (node != null) {
                URL u = new URL("nbresloc:/org/netbeans/dart/project/hideStandardView.xml");
                projectNode = new FilterNode(node, new FileFilterNodeChildren(node));
                return NodeFactorySupport.fixedNodeList(projectNode);
            }
        } catch (DataObjectNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
        return NodeFactorySupport.fixedNodeList();
    }

    public class FileFilterNodeChildren extends FilterNode.Children {

        public FileFilterNodeChildren(Node original) {
            super(original);
        }

        @Override
        protected Node[] createNodes(Node object) {
            List<Node> result = new ArrayList<Node>();
            for (Node node : super.createNodes(object)) {
                if (accept(node)) {
                    result.add(node);
                }
            }
            return result.toArray(new Node[0]);
        }

        private boolean accept(Node node) {
            return !node.getDisplayName().equals("packages")
                    && !node.getDisplayName().endsWith(".dart.precompiled.js")
                    && !node.getDisplayName().endsWith(".dart.js")
                    && !node.getDisplayName().endsWith(".dart.js.deps")
                    && !node.getDisplayName().endsWith(".dart.js.map");
        }
    }

}
