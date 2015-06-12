package org.wfb.explorer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.wfb.domain.Row;
import org.wfb.domain.Table;
import org.wfb.utils.CentralLookup;

@ActionID(
        category = "Row",
        id = "org.wfb.explorer.actions.DeleteRowAction")
@ActionRegistration(
        displayName = "#CTL_DeleteRowAction")
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1200),
    @ActionReference(path = "Shortcuts", name = "D-V")
})
@Messages("CTL_DeleteRowAction=Delete Row")
public final class DeleteRowAction implements ActionListener {

    private final List<Row> context;

    public DeleteRowAction(List<Row> context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        for (Row rowToBeDeleted : context) {
            Table table = rowToBeDeleted.getParent();
            List<Row> rows = table.getRows();
            rows.remove(rowToBeDeleted);
            table.setRows(rows);
            CentralLookup.getDefault().remove(rowToBeDeleted);
        }
    }
    
}
