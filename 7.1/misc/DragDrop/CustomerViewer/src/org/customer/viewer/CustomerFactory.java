/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.customer.viewer;

/**
 *
 * @author gwielenga
 */
import java.util.List;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.customer.domain.Customer;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.lookup.Lookups;

class CustomerFactory extends ChildFactory.Detachable<Customer> implements ChangeListener {

    private final CustomerList model;

    public CustomerFactory(CustomerList model) {
        this.model = model;
    }

    @Override
    protected boolean createKeys(List<Customer> list) {
        list.addAll(model.list());
        return true;
    }

    @Override
    protected Node createNodeForKey(Customer name) {
        return new CustomerNode(Children.LEAF, Lookups.fixed(name), model);
    }

    @Override
    protected void addNotify() {
        model.addChangeListener(this);
    }

    @Override
    protected void removeNotify() {
        model.removeChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        refresh(false);
    }
    
}
