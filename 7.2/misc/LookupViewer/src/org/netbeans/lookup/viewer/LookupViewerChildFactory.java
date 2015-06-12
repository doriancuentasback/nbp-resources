/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.lookup.viewer;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.List;
import org.openide.awt.StatusDisplayer;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup.Result;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.Utilities;
import org.openide.util.lookup.Lookups;
import org.openide.windows.WindowManager;

/**
 *
 * @author Geertjan
 */
public class LookupViewerChildFactory extends ChildFactory.Detachable<Object> implements LookupListener {

    private Result<Object> lookupResult;
    boolean keepOld = false;
    private ArrayList<Object> objectsList = new ArrayList<Object>();
    private ArrayList<Object> copyObjectsList = new ArrayList<Object>();

    @Override
    protected boolean createKeys(List<Object> list) {
        if (keepOld) {
            list.addAll(copyObjectsList);
        } else {
            list.addAll(objectsList);
        }
        return true;
    }

    @Override
    protected Node createNodeForKey(final Object key) {
              LookupNode node = null;

        try {
            node = new LookupNode(key, Children.create(new SubViewerChildFactory(key), true));
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }

    @Override
    protected void addNotify() {
        lookupResult = Utilities.actionsGlobalContext().lookupResult(Object.class);
        lookupResult.addLookupListener(this);
    }

    @Override
    protected void removeNotify() {
        lookupResult.removeLookupListener(this);
    }

    @Override
    public void resultChanged(LookupEvent le) {
        if (WindowManager.getDefault().getRegistry().getActivated().getLookup().lookup(ExcludeFromLookup.class) != null) {
            keepOld = true;
        } else {
            keepOld = false;
            objectsList = new ArrayList<Object>();
            objectsList.addAll(lookupResult.allInstances());
            copyObjectsList = objectsList;
        }
        refresh(false);
    }
}
