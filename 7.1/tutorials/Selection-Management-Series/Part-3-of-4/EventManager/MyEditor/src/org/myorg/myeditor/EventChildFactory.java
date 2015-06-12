/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.myeditor;

import java.util.Arrays;
import java.util.List;
import org.myorg.myapi.Event;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;

class EventChildFactory extends ChildFactory<Event> {

    public EventChildFactory() {
    }

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
        return new EventNode(key);
    }
    
}
