/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.viewer.nodes;

import com.mit.movie.domain.Movie;
import com.mit.movie.viewer.childfactories.PersonChildFactory;
import java.beans.IntrospectionException;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.List;
import javax.swing.Action;
import org.openide.actions.DeleteAction;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.Utilities;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.Lookups;

public class MovieNode extends BeanNode implements PropertyChangeListener {

    private final InstanceContent ic;
    private final Movie bean;

    public MovieNode(Movie bean) throws IntrospectionException {
        this(bean, new InstanceContent());
    }

    private MovieNode(final Movie bean, final InstanceContent ic) throws IntrospectionException {
        super(bean, Children.create(new PersonChildFactory(bean), true), Lookups.singleton(bean));
        this.ic = ic;
        this.bean = bean;
        bean.addPropertyChangeListener(this);
        setDisplayName(bean.getTitle());
        setIconBaseWithExtension("com/mit/movie/viewer/resources/movie-blue-icon.png");
    }

    @Override
    public Action[] getActions(boolean context) {
        List<? extends Action> movieActions = Utilities.actionsForPath("Actions/Movie");
        int size = movieActions.size();
        Action[] toArray = movieActions.toArray(new Action[size]);
        toArray[size - 1] = SystemAction.get(DeleteAction.class);
        return toArray;
    }

    @Override
    public void setName(String s) {
        Movie c = getLookup().lookup(Movie.class);
        String oldDisplayName = c.getTitle();
        c.setTitle(s);
        fireDisplayNameChange(oldDisplayName, s);
    }

    @Override
    public boolean canRename() {
        return true;
    }

    @Override
    public boolean canDestroy() {
        return true;
    }

    @Override
    public void destroy() throws IOException {
        fireNodeDestroyed();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("title")) {
            setDisplayName(evt.getNewValue().toString());
        }
    }
}
