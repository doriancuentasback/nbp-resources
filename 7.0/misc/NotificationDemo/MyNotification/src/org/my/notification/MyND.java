/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.my.notification;

import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import org.openide.awt.Notification;
import org.openide.awt.NotificationDisplayer;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service = NotificationDisplayer.class, position = -100, supersedes = "org.netbeans.core.ui.notifications.NotificationDisplayerImpl")
public class MyND extends NotificationDisplayer {

    @Override
    public Notification notify(String string, Icon icon, String string1, ActionListener al, Priority prt) {
        JOptionPane.showMessageDialog(null, "There's a new update!");
        return notify(string, icon, string1, al, prt);
    }

    @Override
    public Notification notify(String string, Icon icon, JComponent jc, JComponent jc1, Priority prt) {
        JOptionPane.showMessageDialog(null, "There's a new update!");
        return notify(string, icon, jc, jc1, prt);
    }

}
