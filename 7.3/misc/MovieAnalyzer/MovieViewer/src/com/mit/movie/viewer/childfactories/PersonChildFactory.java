/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.viewer.childfactories;

import com.mit.movie.domain.Actor;
import com.mit.movie.domain.Director;
import com.mit.movie.domain.Movie;
import com.mit.movie.domain.Person;
import com.mit.movie.viewer.nodes.ActorNode;
import com.mit.movie.viewer.nodes.DirectorNode;
import java.beans.IntrospectionException;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;
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
public class PersonChildFactory extends ChildFactory<Person> implements NodeListener {

    private Movie movie;
    private List<Person> persons;

    public PersonChildFactory(Movie movie) {
        this.movie = movie;
        persons = new ArrayList<Person>();
        persons.addAll(movie.getActors());
        persons.add(movie.getDirector());
    }

    @Override
    protected boolean createKeys(List<Person> list) {
        list.addAll(persons);
        return true;
    }

    @Override
    protected Node createNodeForKey(Person key) {
        Node node = null;
        if (key instanceof Actor) {
            try {
                node = new ActorNode((Actor) key);
                node.addNodeListener(this);
            } catch (IntrospectionException ex) {
                Exceptions.printStackTrace(ex);
            }
        } else if (key instanceof Director) {
            try {
                node = new DirectorNode((Director) key);
                node.addNodeListener(this);
            } catch (IntrospectionException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return node;
    }

    @Override
    public void nodeDestroyed(NodeEvent ev) {
        Person currentPerson = ev.getNode().getLookup().lookup(Person.class);
        persons.remove(currentPerson);
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
