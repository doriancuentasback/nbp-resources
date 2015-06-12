/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.harbor.viewer;

import java.awt.Color;
import java.beans.IntrospectionException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.harbor.domain.Ship;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;

/**
 *
 * @author geertjan
 */
public class ShipChildFactory extends ChildFactory<Ship>{

    @Override
    protected boolean createKeys(List<Ship> list) {
        Ship ship1 = new Ship("Big", 1971, Color.BLUE);
        Ship ship2 = new Ship("Small", 1983, Color.MAGENTA);
        list.add(ship1);
        list.add(ship2);
        return true;
    }

    @Override
    protected Node createNodeForKey(Ship key) {
        ShipNode node = null;
        try {
            node = new ShipNode(key);
        } catch (IntrospectionException ex) {
            Logger.getLogger(ShipChildFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return node;
    }
    
    
    
}
