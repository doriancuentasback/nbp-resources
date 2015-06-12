/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.shop.viewer;

import javax.swing.Action;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.shop.api.CustomerQuery;
import org.shop.api.capabilities.ReloadableViewCapability;

public final class RootNode extends AbstractNode {

    private CustomerQuery query;
    private InstanceContent instanceContent;

    public RootNode(CustomerQuery query) {
        this(query, new InstanceContent());
    }

    private RootNode(CustomerQuery query, InstanceContent ic) {
        super(Children.create(new RootNodeChildFactory(query), true), new AbstractLookup(ic));
        this.query = query;
        this.instanceContent = ic;
        // Add a new ability for this node to be reloaded:
        this.instanceContent.add(new ReloadableViewCapability() {
            @Override
            public void reloadChildren() throws Exception {
                // To reload this node, set a new set of children
                // using a RootNodeChildFactory object, that retrieves
                // children asynchronously:
                setChildren(Children.create(new RootNodeChildFactory(RootNode.this.query), false));
            }
        });
    }

    @Override
    public String getDisplayName() {
        return "Query: " + query.getNamedQuery();
    }

    @Override
    public Action[] getActions(boolean context) {
        // Pass the Lookup, which now contains ReloadableViewCapability, to the Action:
        return new Action[]{new ReloadAction(getLookup())};
    }
    
}
