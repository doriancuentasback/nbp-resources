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
import org.runway.api.Engineer;
import org.runway.api.RunWay;

/**
 *
 * @author geertjan
 */
public class EngineerChildFactory extends ChildFactory<Engineer> {

    private final RunWay bean;

    EngineerChildFactory(RunWay bean) {
        this.bean = bean;
    }

    @Override
    protected boolean createKeys(List<Engineer> list) {
        list.addAll(bean.getEngineers());
        return true;
    }

    @Override
    protected Node createNodeForKey(Engineer key) {
        EngineerNode node = null;
        try {
            node = new EngineerNode(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }
}
