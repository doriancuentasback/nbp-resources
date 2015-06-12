package org.wfb.explorer.nodes;

import java.util.List;
import javax.swing.Action;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.Utilities;
import org.wfb.explorer.childfactories.TableChildFactory;

public class RootNode extends AbstractNode {

    public RootNode() {
        super(Children.create(new TableChildFactory(), false));
        setDisplayName("Root");
    }

    @Override
    public Action[] getActions(boolean context) {
        List<? extends Action> actionsForRoot = Utilities.actionsForPath("Actions/Root");
        return actionsForRoot.toArray(new Action[actionsForRoot.size()]);
    }

}
