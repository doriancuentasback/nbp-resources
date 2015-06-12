/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.my.notification;

import java.awt.Component;
import javax.swing.JLabel;
import org.openide.awt.StatusLineElementProvider;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service=StatusLineElementProvider.class, supersedes="org.netbeans.core.ui.notifications.StatusLineElement")
public class MySLE implements StatusLineElementProvider {

    @Override
    public Component getStatusLineElement() {
        return new JLabel("hello");
    }
   
}