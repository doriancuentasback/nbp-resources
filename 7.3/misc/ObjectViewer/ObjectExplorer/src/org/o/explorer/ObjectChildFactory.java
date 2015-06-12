package org.o.explorer;

import java.beans.IntrospectionException;
import java.util.List;
import org.o.api.MyObject;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

public class ObjectChildFactory extends ChildFactory<MyObject> {

    private MyObject key;

    public ObjectChildFactory(MyObject key) {
        this.key = key;
    }

    @Override
    protected boolean createKeys(List<MyObject> toPopulate) {
        toPopulate.addAll(key.getChildren());
        return true;
    }

    @Override
    protected Node createNodeForKey(MyObject key) {
        ObjectNode node = null;
        try {
            node = new ObjectNode(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }
}
