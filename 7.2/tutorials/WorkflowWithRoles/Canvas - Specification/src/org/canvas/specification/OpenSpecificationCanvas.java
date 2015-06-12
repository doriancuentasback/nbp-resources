/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.canvas.specification;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionRegistration;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionID;
import org.openide.util.NbBundle.Messages;
import org.openide.util.NbPreferences;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

@ActionID(category = "Canvas",
id = "org.canvas.specification.OpenSpecificationCanvas")
@ActionRegistration(displayName = "#CTL_OpenSpecificationCanvas",
        iconBase="org/canvas/specification/icon.png")
@ActionReferences({
    @ActionReference(path = "Menu/Window", position = 150),
    @ActionReference(path = "Toolbars/Canvas", position = 20)
})
@Messages("CTL_OpenSpecificationCanvas=Open Specification Canvas")
public final class OpenSpecificationCanvas implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        WindowManager.getDefault().setRole("specification");
        NbPreferences.forModule(TopComponent.class).put("currentRole", "specification");
    }
    
}
