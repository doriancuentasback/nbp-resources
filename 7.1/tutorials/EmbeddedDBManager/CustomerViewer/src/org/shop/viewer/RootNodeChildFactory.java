/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.shop.viewer;

import demo.Customer;
import java.util.List;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.shop.api.CustomerQuery;
import org.shop.api.capabilities.ReloadableEntityCapability;

class RootNodeChildFactory extends ChildFactory<Customer> {

    private CustomerQuery query;

    public RootNodeChildFactory(CustomerQuery query) {
        this.query = query;
    }

    @Override
    protected boolean createKeys(List<Customer> list) {
        // get this ability from the lookup ...
        ReloadableEntityCapability r = query.getLookup().lookup(ReloadableEntityCapability.class);
        // ... and  use the ability
        if (r != null) {
            try {
                r.reload();
            } catch (Exception e) {
                // Empty
            }
        }
        // Now populate the list of child entities...
        list.addAll(query.getCustomers());
        // And return true since we're all set:
        return true;
    }

    @Override
    protected Node createNodeForKey(Customer key) {
        Node customernNode = new AbstractNode(Children.LEAF);
        customernNode.setDisplayName(key.getName());
        return customernNode;
    }

}