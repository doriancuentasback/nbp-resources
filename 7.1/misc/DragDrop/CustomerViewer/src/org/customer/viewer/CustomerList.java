package org.customer.viewer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.event.ChangeListener;
import org.customer.domain.Customer;
import org.openide.util.ChangeSupport;

/**
 * Model of a list of customers.
 */
public final class CustomerList {
    
    private final List<Customer> customers;
    private final ChangeSupport cs = new ChangeSupport(this);

    public CustomerList(List<Customer> customers) {
        this.customers = new ArrayList<Customer>(customers);
    }

    public List<? extends Customer> list() {
        return customers;
    }

    public void add(Customer c) {
        customers.add(c);
        cs.fireChange();
    }

    public void remove(Customer c) {
        customers.remove(c);
        cs.fireChange();
    }

    public void reorder(int[] perm) {
        Customer[] reordered = new Customer[customers.size()];
        for (int i = 0; i < perm.length; i++) {
            int j = perm[i];
            Customer c = customers.get(i);
            reordered[j] = c;
        }
        customers.clear();
        customers.addAll(Arrays.asList(reordered));
        cs.fireChange();
    }

    public void addChangeListener(ChangeListener l) {
        cs.addChangeListener(l);
    }

    public void removeChangeListener(ChangeListener l) {
        cs.removeChangeListener(l);
    }

}
