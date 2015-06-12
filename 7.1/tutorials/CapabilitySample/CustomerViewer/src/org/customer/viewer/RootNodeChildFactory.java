package org.customer.viewer;

import demo.Customer;
import java.beans.IntrospectionException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.customer.api.CustomerLookupProvider;
import org.customer.api.capabilities.CustomerQueryCapability;
import org.openide.nodes.*;
import org.openide.util.Exceptions;

class RootNodeChildFactory extends ChildFactory<Customer> {

    @Override
    protected boolean createKeys(List<Customer> list) {
        EntityManager entityManager =
                Persistence.createEntityManagerFactory("CustomerLibraryPU").createEntityManager();
        Query query = entityManager.createNamedQuery("Customer.findAll");
        list.addAll(query.getResultList());
        return true;
    }

    @Override
    protected Node createNodeForKey(Customer key) {
        Node customernNode = null;
        try {
            customernNode = new BeanNode(key);
            customernNode.setDisplayName(key.getName());
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return customernNode;
    }
    
}

















//        CustomerLookupProvider cLookupProvider = new CustomerLookupProvider();
//        CustomerQueryCapability cQueryCapability = 
//                cLookupProvider.getLookup().lookup(CustomerQueryCapability.class);
//        if (cQueryCapability != null) {
//            try {
//                cQueryCapability.reload();
//                list.addAll(cLookupProvider.getCustomers());
//                return true;
//            } catch (Exception e) {
//            }
//        }
//        return false;