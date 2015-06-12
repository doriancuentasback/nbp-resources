package org.netbeans.examples.propertysheet.undo;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.util.ImageUtilities;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

/**
 *
 * @author Tim Boudreau
 */
public final class WindowAction extends AbstractAction {
    public WindowAction() {
        super (NbBundle.getMessage(WindowAction.class, "PROPERTY_SHEET_WINDOW")); //NOI18N
        putValue(SMALL_ICON, ImageUtilities.loadImage(
                "org/netbeans/core/windows/resources/properties.gif")); //NOI18N
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TopComponent tc = WindowManager.getDefault().findTopComponent(PropertySheetWindow.ID);
        if (tc != null) {
            tc.open();
            tc.requestActive();
        } else {
            PropertySheetWindow nue = new PropertySheetWindow();
            nue.open();
            nue.requestActive();
        }
    }
}
