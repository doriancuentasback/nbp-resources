/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.canvas.production;

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
id = "org.canvas.production.OpenProductionCanvas")
@ActionRegistration(displayName = "#CTL_OpenProductionCanvas",
        iconBase="org/canvas/production/icon.png")
@ActionReferences({
    @ActionReference(path = "Menu/Window", position = 250),
    @ActionReference(path = "Toolbars/Canvas", position = 10)
})
@Messages("CTL_OpenProductionCanvas=Open Production Canvas")
public final class OpenProductionCanvas implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        WindowManager.getDefault().setRole("production");
        NbPreferences.forModule(TopComponent.class).put("currentRole", "production");
    }
    
}
