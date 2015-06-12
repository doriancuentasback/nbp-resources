package org.prediction.forecast;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

@ActionID(
        category = "Predict",
        id = "org.prediction.forecast.SwitchToForecastRole")
@ActionRegistration(
    displayName = "#CTL_SwitchToForecastRole")
@ActionReference(
        path = "Menu/Window", 
        position = 260)
@Messages("CTL_SwitchToForecastRole=Switch to Forecast Role")
public final class SwitchToForecastRole implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        WindowManager.getDefault().setRole("forecast");
    }
    
}
