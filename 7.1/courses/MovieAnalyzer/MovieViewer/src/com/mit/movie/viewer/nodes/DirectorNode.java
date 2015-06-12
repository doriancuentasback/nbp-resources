package com.mit.movie.viewer.nodes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mit.movie.domain.Director;
import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;

/**
 *
 * @author Geertjan
 */
public class DirectorNode extends BeanNode {

    public DirectorNode(Director bean) throws IntrospectionException {
        super(bean);
        setDisplayName("Director: " + bean.getNsme());
        setIconBaseWithExtension("com/mit/movie/viewer/resources/movie-green-icon.gif");
    }
}
