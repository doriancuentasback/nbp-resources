/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.palette.contrib.dick;

import java.beans.IntrospectionException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;

/**
 *
 * @author geertjan
 */
public class DickChildFactory extends ChildFactory<String> {

    @Override
    protected boolean createKeys(List<String> list) {
        list.addAll(Arrays.asList("one", "two", "three"));
        return true;
    }

    @Override
    protected Node createNodeForKey(String key) {
        BeanNode node = null;
        try {
            node = new BeanNode(key);
            node.setDisplayName(key);
        } catch (IntrospectionException ex) {
            Logger.getLogger(DickChildFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return node;
    }
}
