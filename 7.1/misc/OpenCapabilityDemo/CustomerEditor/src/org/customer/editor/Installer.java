package org.customer.editor;

import java.util.HashSet;
import java.util.Set;
import org.customer.domain.Customer;
import org.openide.modules.ModuleInstall;
import org.openide.util.Lookup.Result;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.Utilities;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

public class Installer extends ModuleInstall implements LookupListener {

    Result<Customer> customerResults;
    Set<Customer> uniqueCustomers = CustomerUtilities.uniqueCustomers;

    @Override
    public void restored() {
        customerResults = Utilities.actionsGlobalContext().lookupResult(Customer.class);
        customerResults.addLookupListener(this);
    }

    @Override
    public void resultChanged(LookupEvent le) {
        if (customerResults.allInstances().iterator().hasNext()) {
            Customer c = customerResults.allInstances().iterator().next();
            if (uniqueCustomers.add(c)) {
                CustomerEditorTopComponent cetc = new CustomerEditorTopComponent(c);
                cetc.open();
                cetc.requestActive();
            } else { //In this case, the TopComponent is already open, but needs to become active:
                for (TopComponent tc : WindowManager.getDefault().findMode("editor").getTopComponents()){
                    if (tc.getName().contains(c.getName())){
                        tc.requestActive();
                    }
                }
            }
        }
    }
    
}
