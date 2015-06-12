/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.runway.viewer;

import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.runway.api.RunWay;

/**
 *
 * @author geertjan
 */
public class RunWayChildFactory extends ChildFactory<RunWay> {

    @Override
    protected boolean createKeys(List<RunWay> list) {
        list.addAll(Lookup.getDefault().lookupAll(RunWay.class));
        return true;
    }

    @Override
    protected Node createNodeForKey(RunWay key) {
        RunWayNode node = null;
        try {
            node = new RunWayNode(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }
}
