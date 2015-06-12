/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.canvas.diagnostics;

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
id = "org.canvas.diagnostics.OpenDiagnosticsCanvas")
@ActionRegistration(displayName = "#CTL_OpenDiagnosticsCanvas",
        iconBase="org/canvas/diagnostics/icon.png")
@ActionReferences({
    @ActionReference(path = "Menu/Window", position = 3333),
    @ActionReference(path = "Toolbars/Canvas", position = 30)
})
@Messages("CTL_OpenDiagnosticsCanvas=Open Diagnostics Canvas")
public final class OpenDiagnosticsCanvas implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        WindowManager.getDefault().setRole("diagnostics");
        NbPreferences.forModule(TopComponent.class).put("currentRole", "diagnostics");
    }

}
