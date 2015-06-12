/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.engineer.allocator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.runway.api.Engineer;

@ActionID(
        category = "Engineers",
        id = "org.engineer.allocator.AllocateEngineersAction")
@ActionRegistration(
        iconBase = "org/engineer/allocator/icon.png",
        displayName = "#CTL_AllocateEngineersAction")
@ActionReferences({
    @ActionReference(path = "Menu/Engineers", position = 0),
    @ActionReference(path = "Toolbars/Engineers", position = 0)
})
@Messages("CTL_AllocateEngineersAction=Allocate Engineers")
public final class AllocateEngineersAction implements ActionListener {

    private final List<Engineer> context;

    public AllocateEngineersAction(List<Engineer> context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        for (Engineer engineer : context) {
            JOptionPane.showMessageDialog(null, "Allocate " + engineer.getName());
        }

    }
}
