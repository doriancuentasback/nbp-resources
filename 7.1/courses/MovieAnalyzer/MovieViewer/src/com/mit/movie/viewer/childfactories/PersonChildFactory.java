/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.viewer.childfactories;

import com.mit.movie.domain.Actor;
import com.mit.movie.domain.Movie;
import com.mit.movie.viewer.nodes.ActorNode;
import com.mit.movie.viewer.nodes.DirectorNode;
import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author Geertjan
 */
public class PersonChildFactory extends ChildFactory<Movie> {

    private final Movie movie;

    public PersonChildFactory(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected boolean createKeys(List<Movie> list) {
        list.add(movie);
        return true;
    }

    @Override
    protected Node[] createNodesForKey(Movie key) {
        int size = key.getActors().size() + 1;
        Node[] nodes = new Node[size];
        for (int i = 0; i < key.getActors().size(); i++) {
            try {
                nodes[i] = new ActorNode(key.getActors().get(i));
            } catch (IntrospectionException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        try {
            nodes[size-1] = new DirectorNode(key.getDirector());
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return nodes;
    }

}
