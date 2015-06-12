package org.prediction.diagnose;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

@ActionID(
        category = "Predict",
        id = "org.prediction.diagnose.SwitchToDiagnoseRole")
@ActionRegistration(
    displayName = "#CTL_SwitchToDiagnoseRole")
@ActionReference(
        path = "Menu/Window", 
        position = 255)
@Messages("CTL_SwitchToDiagnoseRole=Switch to Diagnose Role")
public final class SwitchToDiagnoseRole implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        WindowManager.getDefault().setRole("diagnose");
    }
    
}
