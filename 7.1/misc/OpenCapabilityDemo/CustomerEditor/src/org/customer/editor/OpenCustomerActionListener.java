/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.customer.editor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.netbeans.api.actions.Openable;

import org.openide.awt.ActionRegistration;
import org.openide.awt.ActionID;
import org.openide.util.NbBundle.Messages;

@ActionID(category = "Customer",
id = "org.customer.viewer.nodes.OpenCustomerActionListener")
@ActionRegistration(displayName = "#CTL_OpenCustomerActionListener")
@Messages("CTL_OpenCustomerActionListener=Open Customer")
public final class OpenCustomerActionListener implements ActionListener {

    private final Openable context;

    public OpenCustomerActionListener(Openable context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        context.open();
    }
    
}
