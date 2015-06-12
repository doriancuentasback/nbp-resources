package org.wfb.explorer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.wfb.domain.Table;
import org.wfb.utils.CentralLookup;

@ActionID(
        category = "Table",
        id = "org.wfb.explorer.actions.DeleteTableAction")
@ActionRegistration(
        displayName = "#CTL_DeleteTableAction")
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1200),
    @ActionReference(path = "Shortcuts", name = "D-X")
})
@Messages("CTL_DeleteTableAction=Delete Table")
public final class DeleteTableAction implements ActionListener {

    private final List<Table> context;

    public DeleteTableAction(List<Table> context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        for (Table table : context) {
            CentralLookup.getDefault().remove(table);
        }
    }
    
}
