/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.my.notification;

import java.awt.event.ActionListener;
import java.util.Collection;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import org.openide.awt.Notification;
import org.openide.awt.NotificationDisplayer;
import org.openide.awt.NotificationDisplayer.Priority;
import org.openide.modules.ModuleInstall;
import org.openide.util.Lookup;

/**
 * Manages a module's lifecycle. Remember that an installer is optional and
 * often not needed at all.
 */
public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        Collection<? extends NotificationDisplayer> all = Lookup.getDefault().lookupAll(NotificationDisplayer.class);
        for (NotificationDisplayer nd : all) {
        }
    }

}
