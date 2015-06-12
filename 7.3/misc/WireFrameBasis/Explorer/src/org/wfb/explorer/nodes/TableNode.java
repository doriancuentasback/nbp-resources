package org.wfb.explorer.nodes;

import java.util.List;
import javax.swing.Action;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.Utilities;
import org.openide.util.lookup.Lookups;
import org.wfb.domain.Table;
import org.wfb.explorer.childfactories.RowChildFactory;

public class TableNode extends AbstractNode {

    public TableNode(Table table) {
        super(Children.create(new RowChildFactory(table), false), Lookups.singleton(table));
        setDisplayName(table.getDisplayName());
    }
    
    @Override
    public Action[] getActions(boolean context) {
        List<? extends Action> actionsForRoot = Utilities.actionsForPath("Actions/Table");
        return actionsForRoot.toArray(new Action[actionsForRoot.size()]);
    }
    
}
