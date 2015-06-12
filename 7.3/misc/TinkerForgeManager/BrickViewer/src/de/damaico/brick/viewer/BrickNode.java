package de.damaico.brick.viewer;

import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;

public class BrickNode extends BeanNode {

    public BrickNode(String name) throws IntrospectionException {
        super(name);
        setDisplayName(name);
    }

}
