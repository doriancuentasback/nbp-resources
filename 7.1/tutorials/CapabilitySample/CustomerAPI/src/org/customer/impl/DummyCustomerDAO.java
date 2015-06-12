package org.customer.impl;

import demo.Customer;
import java.util.HashSet;
import java.util.Set;
import org.customer.api.CustomerDAO;
import org.openide.util.lookup.ServiceProvider;

//@ServiceProvider(service=CustomerDAO.class)
public class DummyCustomerDAO implements CustomerDAO {

    @Override
    public Set<Customer> findAll() {
        Set<Customer> customers = new HashSet<Customer>();
        for (int i = 0; i < 10; i++) {
            Customer c = new Customer(i);
            c.setName(Integer.toString(i));
            customers.add(c);
        }
        return customers;
    }
    
}
