/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palette.contrib.tom;

import java.beans.IntrospectionException;
import java.util.Arrays;
import java.util.List;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;

/**
 *
 * @author geertjan
 */
public class TomChildFactory extends ChildFactory<String> {

    @Override
    protected boolean createKeys(List<String> list) {
        list.addAll(Arrays.asList("plus", "minus", "equals"));
        return true;
    }

    @Override
    protected Node createNodeForKey(String key) {
        BeanNode node = null;
        try {
            node = new BeanNode(key);
            node.setDisplayName(key);
        } catch (IntrospectionException ex) {
        }
        return node;
    }
}
