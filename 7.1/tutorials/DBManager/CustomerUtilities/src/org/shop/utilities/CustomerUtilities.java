/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.utilities;

import demo.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.openide.explorer.ExplorerManager;
import org.openide.nodes.Children;

/**
 *
 * @author geertjan
 */
public class CustomerUtilities {
    
    private static ExplorerManager em;
    
    public static void refreshNode() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("CustomerLibraryPU").createEntityManager();
        Query query = entityManager.createNamedQuery("Customer.findAll");
        List<Customer> resultList = query.getResultList();
        em.setRootContext(new CustomerRootNode(Children.create(new CustomerChildFactory(resultList), true)));
    }

    public static ExplorerManager getExplorerManager() {
        if (em == null){
            em = new ExplorerManager();
        }
        return em;
    }
    
}
