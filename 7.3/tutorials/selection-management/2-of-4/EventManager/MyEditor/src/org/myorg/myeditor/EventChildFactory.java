/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.myeditor;

import java.util.Arrays;
import java.util.List;
import org.myorg.api.Event;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Geertjan
 */
public class EventChildFactory extends ChildFactory<Event> {

    @Override
    protected boolean createKeys(List toPopulate) {
        Event[] objs = new Event[5];
        for (int i = 0; i < objs.length; i++) {
            objs[i] = new Event();
        }
        toPopulate.addAll(Arrays.asList(objs));
        return true;
    }

    @Override
    protected Node createNodeForKey(Event key) {
        Node result = new AbstractNode(Children.create(new EventChildFactory(), true), Lookups.singleton(key));
        result.setDisplayName(key.toString());
        return result;
    }
    
}
