/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.damaico.brick.connectionanalyzer;

import de.damaico.brick.api.ConnectionAnalyzerCapability;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import org.netbeans.api.visual.widget.ConnectionWidget;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
    category = "Edit",
id = "de.damaico.brick.connectionanalyzer.ConnectionAnalyzerActionListener")
@ActionRegistration(
    iconBase = "de/damaico/brick/connectionanalyzer/ambientLight.png",
displayName = "#CTL_ConnectionAnalyzerActionListener")
@ActionReferences(
{
    @ActionReference(path = "Menu/Tools", position = 0),
    @ActionReference(path = "Toolbars/File", position = 300)
})
@Messages("CTL_ConnectionAnalyzerActionListener=Analyze Connections")
public final class ConnectionAnalyzerActionListener implements ActionListener
{

    private final List<ConnectionAnalyzerCapability> context;

    public ConnectionAnalyzerActionListener(List<ConnectionAnalyzerCapability> context)
    {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev)
    {
        for (ConnectionAnalyzerCapability connectionAnalyzerCapability : context)
        {
            ConnectionWidget analyze = connectionAnalyzerCapability.analyze();
            String toolTipTextSource = analyze.getSourceAnchor().getRelatedWidget().getToolTipText();
            String toolTipTextTarget = analyze.getTargetAnchor().getRelatedWidget().getToolTipText();
            JOptionPane.showMessageDialog(null, "Connection:" + toolTipTextSource + "=>" + toolTipTextTarget);
        }

    }
}
