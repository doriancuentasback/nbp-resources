/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

@ActionID(id="org.shop.editor.CustomerNewActionListener", category="File")
@ActionRegistration(displayName="#CTL_CustomerNewActionListener")
@ActionReference(path="Menu/File", position=10)
@Messages("CTL_CustomerNewActionListener=New")
public final class CustomerNewActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        CustomerEditorTopComponent tc = (CustomerEditorTopComponent) WindowManager.getDefault().findTopComponent("CustomerEditorTopComponent");
        tc.resetFields();
        tc.open();
        tc.requestActive();
    }

}