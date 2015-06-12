/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.shop.viewer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.shop.api.capabilities.ReloadableViewCapability;

public final class ReloadAction extends AbstractAction {

    private ReloadableViewCapability reloadableViewCapability;

    public ReloadAction(Lookup lookup) {
        reloadableViewCapability = lookup.lookup(ReloadableViewCapability.class);
        putValue(AbstractAction.NAME, "Reload");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (reloadableViewCapability != null) {
            try {
                reloadableViewCapability.reloadChildren();
            } catch (Exception ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
    
}