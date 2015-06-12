package org.wfb.explorer.nodes;

import java.util.List;
import javax.swing.Action;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.Utilities;
import org.openide.util.lookup.Lookups;
import org.wfb.domain.Row;
import org.wfb.explorer.childfactories.ItemChildFactory;

public class RowNode extends AbstractNode {

    public RowNode(Row row) {
        super(Children.create(new ItemChildFactory(row), true), Lookups.singleton(row));
        setDisplayName(row.getDisplayName());
    }
    
    @Override
    public Action[] getActions(boolean context) {
        List<? extends Action> actionsForRoot = Utilities.actionsForPath("Actions/Row");
        return actionsForRoot.toArray(new Action[actionsForRoot.size()]);
    }
    
}
