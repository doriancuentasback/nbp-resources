/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customermanager.beans;

import com.mycompany.customermanager.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author geertjan
 */
@Stateless
@Named
public class CustomerSessionBean {
    
    @PersistenceContext
    EntityManager em;

    public List<Customer> getCustomers() {
        return em.createNamedQuery("Customer.findAll").getResultList();
    }

}
