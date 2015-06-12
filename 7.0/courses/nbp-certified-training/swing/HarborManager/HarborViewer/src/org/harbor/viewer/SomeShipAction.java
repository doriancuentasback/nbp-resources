/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.harbor.viewer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.harbor.domain.Ship;

import org.openide.awt.ActionRegistration;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionID;
import org.openide.awt.DynamicMenuContent;
import org.openide.util.NbBundle.Messages;

@ActionID(category = "Ship",
id = "org.harbor.viewer.SomeShipAction")
@ActionRegistration(displayName = "#CTL_SomeShipAction")
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1300)
})
@Messages("CTL_SomeShipAction=Some Ship")
public final class SomeShipAction extends AbstractAction {

    private final Ship context;

    public SomeShipAction(Ship context) {
        this.context = context;
        putValue(DynamicMenuContent.HIDE_WHEN_DISABLED, true);
    }

    public void actionPerformed(ActionEvent ev) {
        // TODO use context
    }
    
}
