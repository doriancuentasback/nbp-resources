/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.lookup.viewer;

import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

/**
 *
 * @author Geertjan
 */
class SubViewerChildFactory extends ChildFactory<Object> {
    
    private final Object key;

    public SubViewerChildFactory(Object key) {
        this.key = key;
    }

    @Override
    protected boolean createKeys(List<Object> list) {
        if (key instanceof Lookup.Provider) {
            Lookup.Provider lp = (Lookup.Provider)key;
            list.addAll(lp.getLookup().lookupAll(Object.class));
        }
        return true;
    }

    @Override
    protected Node createNodeForKey(Object subkey) {
             LookupNode node = null;

        try {
            node = new LookupNode(key, Children.create(new SubViewerChildFactory(subkey), true));
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }
    
    
    
    
    
}
