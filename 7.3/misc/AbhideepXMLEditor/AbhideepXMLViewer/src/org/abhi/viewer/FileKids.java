package org.abhi.viewer;

import java.util.ArrayList;
import java.util.List;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;

public class FileKids extends FilterNode.Children {
    public FileKids(Node or) {
        super(or);
    }
    @Override
    protected Node[] createNodes(Node object) {
        List<Node> result = new ArrayList<Node>();
        for (Node node : super.createNodes(object)) {
            if (accept(node)) {
                result.add(new FilterNode(node));
            }
        }
        return result.toArray(new Node[0]);
    }
    private boolean accept(Node node) {
        if (node.getDisplayName().endsWith(".xml") || node.getDisplayName().endsWith(".html")) {
            return true;
        } else {
            return false;
        }
    }
}