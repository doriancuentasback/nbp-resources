/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.shop.api;

import demo.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public final class CustomerSearchDAO {

    EntityManager entityManager = Persistence.createEntityManagerFactory("CustomerLibraryPU").createEntityManager();

    public List<Customer> search(String search) {
        javax.persistence.Query query = entityManager.createQuery(search);
        List<Customer> customers = new ArrayList<Customer>();
        List<Customer> resultList = query.getResultList();
        for (Customer c : resultList) {
            customers.add(c);
        }
        return customers;
    }

    public void save(Customer customer) {
        entityManager.getTransaction().begin();
        entityManager.find(Customer.class, customer.getCustomerId());
        entityManager.getTransaction().commit();
    }
    
}