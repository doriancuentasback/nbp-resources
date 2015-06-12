package com.mycompany.cmsbackoffice2editor.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
    category = "Edit",
id = "com.mycompany.cmsbackoffice2editor.actions.RobotReplaceAction")
@ActionRegistration(
        iconBase = "org/openide/resources/actions/find.gif",
        displayName = "#CTL_RobotReplaceAction")
@ActionReferences({
    @ActionReference(path = "Editors/text/javascript/Popup", position = 750),
    @ActionReference(path = "Editors/Toolbars/Default", position = 10)
})
@Messages("CTL_RobotReplaceAction=Find/Replace")
public final class RobotReplaceAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_H);
        } catch (AWTException ex) {
            Exceptions.printStackTrace(ex);
        }

    }
}
