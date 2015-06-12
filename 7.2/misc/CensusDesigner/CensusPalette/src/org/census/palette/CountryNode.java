/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.census.palette;

import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author geertjan
 */
public class CountryNode extends BeanNode {

    public CountryNode(Country bean) throws IntrospectionException {
        super(bean, Children.LEAF, Lookups.singleton(bean));
        setDisplayName(bean.getName());
    }
    
}
