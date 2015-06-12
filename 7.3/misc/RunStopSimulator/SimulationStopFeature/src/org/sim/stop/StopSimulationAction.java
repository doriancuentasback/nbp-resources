/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sim.stop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.sim.api.Stoppable;

@ActionID(
        category = "Simulator",
        id = "org.sim.stop.StopSimulationAction")
@ActionRegistration(
        iconBase = "org/sim/stop/Stop.png",
        displayName = "#CTL_StopSimulationAction")
@ActionReference(path = "Toolbars/File", position = 20)
@Messages("CTL_StopSimulationAction=Stop Simulation")
public final class StopSimulationAction implements ActionListener {

    private final List<Stoppable> context;

    public StopSimulationAction(List<Stoppable> context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        for (Stoppable s : context) {
            s.stop();
        }
    }
}
