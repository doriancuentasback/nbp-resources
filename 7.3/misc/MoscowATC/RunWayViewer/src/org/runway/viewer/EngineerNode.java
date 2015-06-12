/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.runway.viewer;

import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;
import org.runway.api.Engineer;

/**
 *
 * @author geertjan
 */
public class EngineerNode extends BeanNode {

    public EngineerNode(Engineer engineer) throws IntrospectionException {
        super(engineer, Children.LEAF, Lookups.singleton(engineer));
        setDisplayName(engineer.getName());
    }
}
