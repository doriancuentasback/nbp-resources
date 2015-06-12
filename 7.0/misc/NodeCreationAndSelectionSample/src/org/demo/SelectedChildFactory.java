package org.demo;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.ChangeSupport;
import org.openide.util.Exceptions;

public class SelectedChildFactory extends ChildFactory.Detachable<BusinessObject> implements ChangeListener {

    ArrayList selectedList = Utils.getSelectededArrayList();
    ChangeSupport changeSupport = Utils.getChangeSupport(this);

    public SelectedChildFactory() {
        changeSupport.addChangeListener(this);
    }

    @Override
    protected void addNotify() {
        refresh(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        refresh(true);
    }

    @Override
    protected boolean createKeys(List<BusinessObject> list) {
        list.addAll(selectedList);
        return true;
    }

    @Override
    protected Node createNodeForKey(BusinessObject key) {
        BeanNode node = null;
        try {
            node = new BeanNode(Children.LEAF);
            node.setDisplayName(key.getName());
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }

}
