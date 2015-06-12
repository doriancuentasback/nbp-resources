package org.customer.api;

import org.customer.api.capabilities.CustomerQueryCapability;
import demo.Customer;
import java.util.HashSet;
import java.util.Set;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.util.Lookup;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;

public class CustomerLookupProvider implements Lookup.Provider {

    private Set<Customer> customers;
    private Lookup lookup;
    private InstanceContent customerCapabilityGroup;

    public CustomerLookupProvider() {
        customers = new HashSet<Customer>();
        // Create an InstanceContent to hold abilities...
        customerCapabilityGroup = new InstanceContent();
        // Create an AbstractLookup to expose the InstanceContent...
        lookup = new AbstractLookup(customerCapabilityGroup);
        // Add a "Customer Query" ability to the group of capabilities:
        customerCapabilityGroup.add(new CustomerQueryCapability() {
            @Override
            public void reload() throws Exception {
                ProgressHandle handle = ProgressHandleFactory.createHandle("Loading...");
                handle.start();
                CustomerDAO cdao = Lookup.getDefault().lookup(CustomerDAO.class);
                if (cdao == null) {
                    Customer c = new Customer(1);
                    c.setName("<no data access object has been registered>");
                    customers.add(c);
                } else {
                    customers.addAll(cdao.findAll());
                }
                handle.finish();
            }
        });
    }

    @Override
    public Lookup getLookup() {
        return lookup;
    }
    public Set<Customer> getCustomers() {
        return customers;
    }
    
}