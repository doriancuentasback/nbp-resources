package org.prediction.specify;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

@ActionID(
        category = "Predict",
        id = "org.prediction.specify.SwitchToSpecifyRole")
@ActionRegistration(
    displayName = "#CTL_SwitchToSpecifyRole")
@ActionReference(
        path = "Menu/Window", 
        position = 250)
@Messages("CTL_SwitchToSpecifyRole=Switch to Specify Role")
public final class SwitchToSpecifyRole implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        WindowManager.getDefault().setRole("specify");
    }
    
}
