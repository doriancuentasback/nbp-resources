package org.wfb.explorer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.wfb.domain.Item;
import org.wfb.domain.Row;
import org.wfb.domain.Table;
import org.wfb.utils.CentralLookup;

@ActionID(
        category = "Table",
        id = "org.wfb.explorer.actions.CreateRowAction")
@ActionRegistration(
        displayName = "#CTL_CreateRowAction")
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1100),
    @ActionReference(path = "Shortcuts", name = "D-C")
})
@Messages("CTL_CreateRowAction=Create Row")
public final class CreateRowAction implements ActionListener {

    private AtomicInteger _integer;
    private final Table table;

    public CreateRowAction(Table table) {
        this.table = table;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Row newRow = new Row("row " + getNextCount(), table, new ArrayList<Item>());
        List<Row> rows = table.getRows();
        rows.add(newRow);
        table.setRows(rows);
        CentralLookup.getDefault().add(newRow);
    }

    private int getNextCount() {
        _integer = new AtomicInteger(table.getRows().size());
        return _integer.incrementAndGet();
    }

}
