package org.wfb.explorer.childfactories;

import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Lookup.Result;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.wfb.utils.CentralLookup;
import org.wfb.domain.Table;
import org.wfb.explorer.nodes.TableNode;

public class TableChildFactory extends ChildFactory.Detachable<Table> implements LookupListener {

    Result<Table> tablesInCentralLookup;
    
    @Override
    protected void addNotify() {
        tablesInCentralLookup = CentralLookup.getDefault().lookupResult(Table.class);
        tablesInCentralLookup.addLookupListener(this);
    }

    @Override
    protected void removeNotify() {
        tablesInCentralLookup.removeLookupListener(this);
    }

    @Override
    protected boolean createKeys(List<Table> list) {
        list.addAll(tablesInCentralLookup.allInstances());
        return true;
    }

    @Override
    protected Node createNodeForKey(Table key) {
        return new TableNode(key);
    }

    @Override
    public void resultChanged(LookupEvent le) {
        refresh(true);
    }
    
}
