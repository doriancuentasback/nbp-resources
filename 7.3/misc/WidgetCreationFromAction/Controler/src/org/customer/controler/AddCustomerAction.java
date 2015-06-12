package org.customer.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.customer.model.Customer;
import org.customer.model.capabilities.Droppable;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle;

@ActionID(
        category = "Tools",
        id = "org.customer.controler.AddCustomerAction")
@ActionRegistration(
        iconBase = "org/customer/controler/icon.png",
        displayName = "#AddCustomerAction")
@ActionReferences({
    @ActionReference(path = "Toolbars/File", position = 300)
})
@NbBundle.Messages("AddCustomerAction=Add Customer")
public final class AddCustomerAction implements ActionListener {
    private final Droppable context;
    public AddCustomerAction(Droppable droppable) {
        this.context = droppable;
    }
    @Override
    public void actionPerformed(ActionEvent ev) {
        NotifyDescriptor.InputLine inputLine = new NotifyDescriptor.InputLine("Name:", "Data Entry");
        Object result = DialogDisplayer.getDefault().notify(inputLine);
        if (result == NotifyDescriptor.OK_OPTION) {
            Customer customer = new Customer(inputLine.getInputText());
            context.doDrop(customer);
        }
    }
}