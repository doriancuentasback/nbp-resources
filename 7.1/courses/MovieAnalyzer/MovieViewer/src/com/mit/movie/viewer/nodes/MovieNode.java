/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.viewer.nodes;

import com.mit.movie.viewer.childfactories.PersonChildFactory;
import com.mit.movie.domain.Movie;
import java.beans.IntrospectionException;
import java.util.List;
import javax.swing.Action;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.Utilities;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.Lookups;

public class MovieNode extends BeanNode {

    private final InstanceContent ic;
    private final Movie bean;

    public MovieNode(Movie bean) throws IntrospectionException {
	this(bean, new InstanceContent());
    }

    private MovieNode(final Movie bean, final InstanceContent ic) throws IntrospectionException {
	super(bean, Children.create(new PersonChildFactory(bean), false), Lookups.singleton(bean));
	this.ic = ic;
	this.bean = bean;
	setDisplayName(bean.getTitle());
	setIconBaseWithExtension("com/mit/movie/viewer/resources/movie-blue-icon.png");
    }

    @Override
    public Action[] getActions(boolean context) {
	List<? extends Action> movieActions = Utilities.actionsForPath("Actions/Movie");
	return movieActions.toArray(new Action[movieActions.size()]);
    }

}
