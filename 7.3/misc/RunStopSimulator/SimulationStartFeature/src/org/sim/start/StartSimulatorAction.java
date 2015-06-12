/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sim.start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.sim.api.Startable;

@ActionID(
        category = "Simulator",
        id = "org.sim.start.StartSimulatorAction")
@ActionRegistration(
        iconBase = "org/sim/start/Start.png",
        displayName = "#CTL_StartSimulatorAction")
@ActionReference(path = "Toolbars/File", position = 10)
@Messages("CTL_StartSimulatorAction=Start Simulator")
public final class StartSimulatorAction implements ActionListener {

    private final List<Startable> context;

    public StartSimulatorAction(List<Startable> context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        for (Startable s : context) {
            s.start();
        }
    }
}
