/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.customer.viewer.nodes;

import java.beans.IntrospectionException;
import java.util.List;
import org.customer.domain.Customer;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author geertjan
 */
public class CustomerChildFactory extends ChildFactory<Customer> {

    @Override
    protected boolean createKeys(List<Customer> list) {
        list.add(new Customer("Tom"));
        list.add(new Customer("John"));
        return true;
    }

    @Override
    protected Node createNodeForKey(Customer key) {
        CustomerNode node = null;
        try {
            node = new CustomerNode(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }
    
}
