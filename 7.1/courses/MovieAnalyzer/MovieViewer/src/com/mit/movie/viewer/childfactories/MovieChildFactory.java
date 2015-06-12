/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.viewer.childfactories;

import com.mit.movie.domain.Actor;
import com.mit.movie.domain.Director;
import com.mit.movie.domain.Mansion;
import com.mit.movie.domain.Movie;
import com.mit.movie.viewer.nodes.MovieNode;
import java.awt.Color;
import java.beans.IntrospectionException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author Geertjan
 */
public class MovieChildFactory extends ChildFactory<Movie> {

    //THIS METHOD IS CALLED ON A BACKGROUND THREAD:
    @Override
    protected boolean createKeys(List<Movie> list) {
        //Here is where we connect to the database:
        List<Mansion> mansions1 = new ArrayList<Mansion>();
        List<Mansion> mansions2 = new ArrayList<Mansion>();
        List<Mansion> mansions3 = new ArrayList<Mansion>();
        mansions1.add(new Mansion("Palm Beach"));
        mansions1.add(new Mansion("Hollywood"));
        mansions2.add(new Mansion("Los Angeles"));
        mansions3.add(new Mansion("New York"));
        mansions3.add(new Mansion("London"));
        List<Actor> deerHunterActors = new ArrayList<Actor>();
        deerHunterActors.add(new Actor("Christopher Walken", mansions1));
        deerHunterActors.add(new Actor("Robert de Niro", mansions2));
        List<Actor> catchMeActors = new ArrayList<Actor>();
        catchMeActors.add(new Actor("Christopher Walken", mansions1));
        catchMeActors.add(new Actor("Leonardo DiCaprio", mansions1));
        List<Actor> gremlinsActors = new ArrayList<Actor>();
        gremlinsActors.add(new Actor("Cute fuzzy toy animal", mansions3));
        gremlinsActors.add(new Actor("Scary fuzzy toy animal", mansions3));
        Movie deerHunter = new Movie("The Deer Hunter", 1978,
                Color.BLUE, new File(""), deerHunterActors, new Director("Michael Cimino"));
        Movie catchMe = new Movie("Catch Me If You Can", 2002,
                Color.RED, new File(""), catchMeActors, new Director("Stephen Spielberg"));
        Movie movie3 = new Movie("Gremlins", 1990,
                Color.CYAN, new File(""), gremlinsActors, new Director("Stephen Spielberg"));
        list.add(deerHunter);
        list.add(catchMe);
        list.add(movie3);
        return true;
    }

    @Override
    protected Node createNodeForKey(Movie key) {
        MovieNode node = null;
        try {
            node = new MovieNode(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }

}
