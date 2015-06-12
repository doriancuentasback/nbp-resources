package org.wfb.explorer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;
import org.openide.util.actions.Presenter;
import org.wfb.domain.Item;
import org.wfb.domain.Row;
import org.wfb.utils.CentralLookup;

@ActionID(
        category = "Row",
        id = "org.wfb.explorer.actions.CreateItemAction")
@ActionRegistration(
        lazy = false,
        displayName = "#CTL_CreateItemAction")
@ActionReference(path = "Menu/File", position = 1000)
@Messages("CTL_CreateItemAction=Create Item...")
public final class CreateItemAction extends AbstractAction implements ActionListener, Presenter.Popup {

    @Override
    public void actionPerformed(ActionEvent ev) {
        // not used
    }

    @Override
    public JMenuItem getPopupPresenter() {
        JMenu paletteMenu = new JMenu("Create Item...");
        FileObject[] children = FileUtil.getConfigFile("palette").getChildren();
        for(final FileObject fo: FileUtil.getOrder(Arrays.asList(children), false)){
            paletteMenu.add(new AbstractAction(fo.getName()) {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Row row = Utilities.actionsGlobalContext().lookup(Row.class);
                    Item newItem = new Item(fo.getName(), row);
                    List<Item> items = row.getItems();
                    items.add(newItem);
                    row.setItems(items);
                    CentralLookup.getDefault().add(newItem);
                    StatusDisplayer.getDefault().setStatusText(newItem.getDisplayName());
                }
            });
        }
        return paletteMenu;
    }
    
}
