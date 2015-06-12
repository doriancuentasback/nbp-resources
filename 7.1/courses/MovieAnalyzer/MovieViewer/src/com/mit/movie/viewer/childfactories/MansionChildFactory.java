/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.viewer.childfactories;

import com.mit.movie.domain.Actor;
import com.mit.movie.domain.Mansion;
import com.mit.movie.viewer.nodes.MansionNode;
import java.beans.IntrospectionException;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.nodes.NodeEvent;
import org.openide.nodes.NodeListener;
import org.openide.nodes.NodeMemberEvent;
import org.openide.nodes.NodeReorderEvent;
import org.openide.util.Exceptions;

/**
 *
 * @author Geertjan
 */
public class MansionChildFactory extends ChildFactory<Mansion> implements NodeListener {

    private final Actor actor;
    private List<Mansion> mansions;

    public MansionChildFactory(Actor actor) {
        this.actor = actor;
        mansions = new ArrayList<Mansion>();
        mansions.addAll(actor.getMansions());

    }

    @Override
    protected boolean createKeys(List<Mansion> list) {
        list.addAll(mansions);
        return true;
    }

    @Override
    protected Node createNodeForKey(Mansion key) {
        MansionNode mansionNode = null;
        try {
            mansionNode = new MansionNode(key);
            mansionNode.addNodeListener(this);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return mansionNode;
    }

    @Override
    public void nodeDestroyed(NodeEvent ev) {
        Mansion removedMansion = ev.getNode().getLookup().lookup(Mansion.class);
        mansions.remove(removedMansion);
        refresh(true);
    }

    @Override
    public void childrenAdded(NodeMemberEvent nme) {
    }

    @Override
    public void childrenRemoved(NodeMemberEvent nme) {
    }

    @Override
    public void childrenReordered(NodeReorderEvent nre) {
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
    }
    
}
