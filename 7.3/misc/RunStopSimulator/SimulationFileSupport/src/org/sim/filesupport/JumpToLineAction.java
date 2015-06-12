/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sim.filesupport;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.cookies.LineCookie;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.text.Line;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Simulation",
        id = "org.sim.filesupport.JumpToLineAction")
@ActionRegistration(
        displayName = "#CTL_JumpToLineAction")
@Messages("CTL_JumpToLineAction=Jump to Line")
public final class JumpToLineAction implements ActionListener {

    private final Node context;

    public JumpToLineAction(Node context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        DataObject parentDobj = context.getParentNode().getLookup().lookup(DataObject.class);
        LineCookie lineCapability = parentDobj.getLookup().lookup(LineCookie.class);
        Line line = lineCapability.getLineSet().getOriginal(getCurrentLineNumber(context, lineCapability));
        line.show(Line.ShowOpenType.OPEN, Line.ShowVisibilityType.FRONT);
    }

    private int getCurrentLineNumber(Node node, LineCookie lineCapability) {
        int lineNumber = 0;
        List<? extends Line> lines = lineCapability.getLineSet().getLines();
        for (Line line : lines) {
            if (line.getText().trim().equals(node.getDisplayName().trim())) {
                lineNumber = line.getLineNumber();
            }
        }
        return lineNumber;
    }
}
