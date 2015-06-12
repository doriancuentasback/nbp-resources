/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.shop.api;

import org.shop.api.capabilities.ReloadableEntityCapability;
import demo.Customer;
import java.util.ArrayList;
import java.util.List;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.util.Lookup;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.shop.api.capabilities.SaveableEntityCapability;

public final class CustomerQuery implements Lookup.Provider {

    private List<Customer> customers;
    private Lookup lookup;
    private InstanceContent instanceContent;
    private String sqlstring;
    private CustomerSearchDAO dao = new CustomerSearchDAO();

    public CustomerQuery() {
        customers = new ArrayList<Customer>();
        // Create an InstanceContent to hold abilities...
        instanceContent = new InstanceContent();
        // Create an AbstractLookup to expose InstanceContent contents...
        lookup = new AbstractLookup(instanceContent);
        // Add a "Reloadable" ability to this entity
        instanceContent.add(new ReloadableEntityCapability() {
            @Override
            public void reload() throws Exception {
                ProgressHandle handle = ProgressHandleFactory.createHandle("Loading...");
                handle.start();
                List<Customer> result = dao.search(sqlstring);
                for (Customer customer : result) {
                    if (!getCustomers().contains(customer)) {
                        getCustomers().add(customer);
                    }
                }
                handle.finish();
            }
        });
        instanceContent.add(new SaveableEntityCapability() {
            @Override
            public void save(Customer customer) throws Exception {
                dao.save(customer);
            }
        });
    }

    public String getNamedQuery() {
        return sqlstring;
    }

    public void setNamedQuery(String sqlstring) {
        this.sqlstring = sqlstring;
    }

    @Override
    public String toString() {
        return sqlstring;
    }

    @Override
    public Lookup getLookup() {
        return lookup;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

}