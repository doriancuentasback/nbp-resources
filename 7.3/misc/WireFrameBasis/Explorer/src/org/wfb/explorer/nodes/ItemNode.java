package org.wfb.explorer.nodes;

import java.util.List;
import javax.swing.Action;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.Utilities;
import org.openide.util.lookup.Lookups;
import org.wfb.domain.Item;

public class ItemNode extends AbstractNode {

    public ItemNode(Item item) {
        super(Children.LEAF, Lookups.singleton(item));
        setDisplayName(item.getDisplayName());
    }
    
    @Override
    public Action[] getActions(boolean context) {
        List<? extends Action> actionsForRoot = Utilities.actionsForPath("Actions/Item");
        return actionsForRoot.toArray(new Action[actionsForRoot.size()]);
    }
    
}
