/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.systemproperties;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.util.NbBundle.Messages;

public class RefreshPropsAction extends AbstractAction {

    @Messages("LBL_RefreshProps=Refresh")
    public RefreshPropsAction() {
        super(Bundle.LBL_RefreshProps());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PropertiesNotifier.changed();
    }
    
}