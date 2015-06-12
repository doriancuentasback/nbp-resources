/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.utilities;

import demo.Customer;
import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.lookup.Lookups;

public class CustomerChildFactory extends ChildFactory<Customer> {

    private List<Customer> resultList;

    public CustomerChildFactory(List<Customer> resultList) {
        this.resultList = resultList;
    }

    @Override
    protected boolean createKeys(List<Customer> list) {
        for (Customer Customer : resultList) {
            list.add(Customer);
        }
        return true;
    }

    @Override
    protected Node createNodeForKey(Customer c) {
        try {
            return new CustomerBeanNode(c);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
            return null;
        }
    }

    private class CustomerBeanNode extends BeanNode {

        public CustomerBeanNode(Customer bean) throws IntrospectionException {
            super(bean, Children.LEAF, Lookups.singleton(bean));
        }

    }
    
}
