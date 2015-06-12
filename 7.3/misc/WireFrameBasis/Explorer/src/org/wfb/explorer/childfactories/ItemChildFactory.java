package org.wfb.explorer.childfactories;

import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.wfb.domain.Item;
import org.wfb.domain.Row;
import org.wfb.explorer.nodes.ItemNode;
import org.wfb.utils.CentralLookup;

public class ItemChildFactory extends ChildFactory.Detachable<Item> implements LookupListener {

    private final Row row;
    private Lookup.Result<Item> itemsInCentralLookup;

    public ItemChildFactory(Row row) {
        this.row = row;
    }

    @Override
    protected void addNotify() {
        itemsInCentralLookup = CentralLookup.getDefault().lookupResult(Item.class);
        itemsInCentralLookup.addLookupListener(this);
    }

    @Override
    protected void removeNotify() {
        itemsInCentralLookup.removeLookupListener(this);
    }

    @Override
    protected boolean createKeys(List<Item> list) {
        list.addAll(row.getItems());
        return true;
    }

    @Override
    protected Node createNodeForKey(Item key) {
        return new ItemNode(key);
    }

    @Override
    public void resultChanged(LookupEvent le) {
        refresh(true);
    }

}
