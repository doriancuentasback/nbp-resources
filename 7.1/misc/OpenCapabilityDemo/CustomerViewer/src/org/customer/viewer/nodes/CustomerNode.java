/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.customer.viewer.nodes;

import java.beans.IntrospectionException;
import java.util.List;
import javax.swing.Action;
import org.customer.domain.Customer;
import org.netbeans.api.actions.Openable;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.Utilities;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;

/**
 *
 * @author geertjan
 */
public class CustomerNode extends BeanNode<Customer> {

    public CustomerNode(Customer bean) throws IntrospectionException {
        this(bean, new InstanceContent());
    }

    private CustomerNode(final Customer bean, final InstanceContent ic) throws IntrospectionException {
        super(bean, Children.LEAF, new AbstractLookup(ic));
        setDisplayName(bean.getName());
        ic.add(new Openable() {
            @Override
            public void open() {
                ic.add(bean);
                ic.remove(bean);
            }
        });
    }

    @Override
    public Action[] getActions(boolean context) {
        List<? extends Action> customerActions = Utilities.actionsForPath("Actions/Customer");
        return customerActions.toArray(new Action[customerActions.size()]);
    }
    
}
