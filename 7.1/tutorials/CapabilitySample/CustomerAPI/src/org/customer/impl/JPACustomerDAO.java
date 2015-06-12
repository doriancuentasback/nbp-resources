package org.customer.impl;

import demo.Customer;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.customer.api.CustomerDAO;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service=CustomerDAO.class)
public class JPACustomerDAO implements CustomerDAO {

    @Override
    public Set<Customer> findAll() {
        EntityManager entityManager = 
                Persistence.createEntityManagerFactory("CustomerLibraryPU").createEntityManager();
        Query query = entityManager.createNamedQuery("Customer.findAll");
        Set<Customer> customers = new HashSet<Customer>();
        List<Customer> resultList = query.getResultList();
        for (Customer c : resultList) {
            customers.add(c);
        }
        return customers;
    }
    
}
