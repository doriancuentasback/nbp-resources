package org.wfb.explorer.childfactories;

import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.wfb.domain.Row;
import org.wfb.domain.Table;
import org.wfb.explorer.nodes.RowNode;
import org.wfb.utils.CentralLookup;

public class RowChildFactory extends ChildFactory.Detachable<Row> implements LookupListener {

    private final Table key;
    Lookup.Result<Row> rowsInCentralLookup;
    
    public RowChildFactory(Table key) {
        this.key = key;
    }

    @Override
    protected void addNotify() {
        rowsInCentralLookup = CentralLookup.getDefault().lookupResult(Row.class);
        rowsInCentralLookup.addLookupListener(this);
    }
    
    @Override
    protected void removeNotify() {
        rowsInCentralLookup.removeLookupListener(this);
    }
    
    @Override
    protected boolean createKeys(List<Row> list) {
        list.addAll(key.getRows());
        return true;
    }

    @Override
    protected Node createNodeForKey(Row key) {
        return new RowNode(key);
    }

    @Override
    public void resultChanged(LookupEvent le) {
        refresh(true);
    }

}
