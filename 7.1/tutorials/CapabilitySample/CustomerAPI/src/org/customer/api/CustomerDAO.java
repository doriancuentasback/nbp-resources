package org.customer.api;

import demo.Customer;
import java.util.Set;

public interface CustomerDAO {

    public Set<Customer> findAll();
    
}