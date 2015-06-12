package com.mit.movie.viewer.nodes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mit.movie.domain.Mansion;
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
public class MansionNode extends BeanNode {

    public MansionNode(Mansion bean) throws IntrospectionException {
        super(bean, Children.LEAF, Lookups.singleton(bean));
        setDisplayName("Mansion: " + bean.getCity());
        setIconBaseWithExtension("com/mit/movie/viewer/resources/movie-orange-icon.gif");
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
