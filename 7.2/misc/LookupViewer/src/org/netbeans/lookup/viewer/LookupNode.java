/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.lookup.viewer;

import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;

/**
 *
 * @author Geertjan
 */
public class LookupNode extends BeanNode {

    public LookupNode(Object bean, Children kids) throws IntrospectionException {
        super(bean);
        setDisplayName(bean.getClass().getCanonicalName());
        setChildren(kids);
    }
    
}
