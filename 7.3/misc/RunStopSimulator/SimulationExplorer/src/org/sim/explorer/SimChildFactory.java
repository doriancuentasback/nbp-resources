package org.sim.explorer;

import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.sim.api.CentralLookup;
import org.sim.filesupport.SimDataObject;

/**
 *
 * @author geertjan
 */
public class SimChildFactory extends ChildFactory.Detachable<SimDataObject> implements LookupListener {

    Lookup.Result<SimDataObject> result;

    @Override
    protected boolean createKeys(List<SimDataObject> list) {
        list.addAll(result.allInstances());
        return true;
    }

    @Override
    protected Node createNodeForKey(SimDataObject key) {
        return key.getNodeDelegate();
    }

    @Override
    protected void addNotify() {
        result = CentralLookup.getDefault().lookupResult(SimDataObject.class);
        result.addLookupListener(this);
    }

    @Override
    protected void removeNotify() {
        result.removeLookupListener(this);
    }

    @Override
    public void resultChanged(LookupEvent le) {
        refresh(true);
    }
}
