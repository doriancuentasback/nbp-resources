/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.examples.modules.povfile;

import java.awt.event.ActionEvent;
import java.util.Properties;
import javax.swing.AbstractAction;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import org.netbeans.examples.api.povray.RendererService;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.util.RequestProcessor;
import org.openide.util.actions.Presenter;

public class RendererAction extends AbstractAction implements Presenter.Popup {

    private final RendererService renderer;
    private final PovrayDataNode node;

    public RendererAction(RendererService renderer, PovrayDataNode node) {
        this.renderer = renderer;
        this.node = node;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        assert false;
    }

    @NbBundle.Messages("LBL_Render=Render")
    @Override
    public JMenuItem getPopupPresenter() {

        JMenu result = new JMenu();

        //Set the menu's label
        result.setText(Bundle.LBL_Render());

        //Get the names of all available settings sets:
        String[] availableSettings =
                renderer.getAvailableRendererSettingsNames();

        //Get the name of the most recently used setting set:
        String preferred = renderer.getPreferredRendererSettingsNames();

        for (int i = 0; i < availableSettings.length; i++) {

            String currName = availableSettings[i];

            RenderWithSettingsAction action =
                    new RenderWithSettingsAction(currName);

            JCheckBoxMenuItem itemForSettings = new JCheckBoxMenuItem(action);

            //Show our menu item checked if it is the most recently used set
            //of settings:
            itemForSettings.setSelected(preferred != null
                    && preferred.equals(currName));

            result.add(itemForSettings);

        }

        return result;

    }

    private class RenderWithSettingsAction extends AbstractAction implements Runnable {

        private final String name;

        public RenderWithSettingsAction(String name) {
            this.name = name;
            putValue(NAME, renderer.getDisplayName(name));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            RequestProcessor.getDefault().post(this);
        }

        @Override
        public void run() {
            DataObject ob = node.getDataObject();
            FileObject toRender = ob.getPrimaryFile();
            Properties mySettings = renderer.getRendererSettings(name);
            FileObject image = renderer.render(toRender, mySettings);
            if (image != null) {
                try {
                    //Try to open the file:
                    DataObject dob = DataObject.find(image);
                    Node n = dob.getNodeDelegate();
                    OpenCookie ck = (OpenCookie) n.getLookup().lookup(OpenCookie.class);
                    if (ck != null) {
                        ck.open();
                    }
                } catch (DataObjectNotFoundException e) {
                    //Should never happen
                    Exceptions.printStackTrace(e);
                }
            }
        }
    }
}