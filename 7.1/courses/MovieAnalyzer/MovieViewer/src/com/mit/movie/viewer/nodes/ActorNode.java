package com.mit.movie.viewer.nodes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mit.movie.domain.Actor;
import com.mit.movie.viewer.childfactories.MansionChildFactory;
import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;

/**
 *
 * @author Geertjan
 */
public class ActorNode extends BeanNode {

    public ActorNode(Actor bean) throws IntrospectionException {
        super(bean, Children.create(new MansionChildFactory(bean), false));
        setDisplayName("Actor: " + bean.getNsme());
        setIconBaseWithExtension("com/mit/movie/viewer/resources/movie-red-icon.png");
    }
}
