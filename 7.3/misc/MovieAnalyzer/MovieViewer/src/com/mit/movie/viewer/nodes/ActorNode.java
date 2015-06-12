package com.mit.movie.viewer.nodes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mit.movie.domain.Actor;
import com.mit.movie.viewer.childfactories.MansionChildFactory;
import java.beans.IntrospectionException;
import java.io.IOException;
import javax.swing.Action;
import org.openide.actions.DeleteAction;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Geertjan
 */
public class ActorNode extends BeanNode {

    public ActorNode(Actor bean) throws IntrospectionException {
        super(bean, Children.create(new MansionChildFactory(bean), false), Lookups.singleton(bean));
        setDisplayName("Actor: " + bean.getNsme());
        setIconBaseWithExtension("com/mit/movie/viewer/resources/movie-red-icon.png");
    }

    @Override
    public boolean canDestroy() {
        return true;
    }

    @Override
    public Action[] getActions(boolean context) {
        return new Action[]{(SystemAction.get(DeleteAction.class))};
    }

    @Override
    public void destroy() throws IOException {
        fireNodeDestroyed();
    }
}
