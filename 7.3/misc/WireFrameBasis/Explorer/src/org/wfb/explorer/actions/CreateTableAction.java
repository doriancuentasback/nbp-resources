package org.wfb.explorer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.wfb.domain.Row;
import org.wfb.domain.Table;
import org.wfb.utils.CentralLookup;

@ActionID(
        category = "Root",
        id = "org.wfb.explorer.actions.CreateTableAction")
@ActionRegistration(
        displayName = "#CTL_CreateTableAction")
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 1300),
    @ActionReference(path = "Shortcuts", name = "D-Z")
})
@Messages("CTL_CreateTableAction=Create Table")
public final class CreateTableAction implements ActionListener {

    private static AtomicInteger _integer = new AtomicInteger(0);

    @Override
    public void actionPerformed(ActionEvent e) {
        Table newTable = new Table("table " + getNextCount(), new ArrayList<Row>());
        CentralLookup.getDefault().add(newTable);
    }
    
    private static int getNextCount() {
        return _integer.incrementAndGet();
    }
    
}
