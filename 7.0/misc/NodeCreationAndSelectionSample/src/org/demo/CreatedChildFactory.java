package org.demo;

import java.beans.IntrospectionException;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.ChangeSupport;
import org.openide.util.Exceptions;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;

public class CreatedChildFactory extends ChildFactory.Detachable<BusinessObject> implements ChangeListener {

    ArrayList<BusinessObject> createdList = Utils.getCreatedArrayList();
    ArrayList<BusinessObject> selectedList = Utils.getSelectededArrayList();
    ChangeSupport changeSupport = Utils.getChangeSupport(this);

    public CreatedChildFactory() {
        changeSupport.addChangeListener(this);
    }

    @Override
    protected void addNotify() {
        refresh(true);
    }

    public void stateChanged(ChangeEvent e) {
        refresh(true);
    }

    @Override
    protected boolean createKeys(List<BusinessObject> list) {
        list.addAll(createdList);
        return true;
    }

    @Override
    protected Node createNodeForKey(BusinessObject key) {
        BusinessObject businessObject = new BusinessObject(key.getName());
        try {
            return new CreatedNode(businessObject, new InstanceContent());
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return null;
    }

    public class CreatedNode extends BeanNode {
        public CreatedNode(final BusinessObject businessObject, final InstanceContent ic) throws IntrospectionException {
            super(businessObject, Children.LEAF, new AbstractLookup(ic));
            ic.add(new CheckNode(businessObject));
            ic.add(businessObject);
            setDisplayName(businessObject.getName());
            businessObject.addPropertyChangeListener(new PropertyChangeListener() {
                public void propertyChange(PropertyChangeEvent evt) {
                    if (businessObject.isSelected()) {
                        selectedList.add(businessObject);
                    } else {
                        selectedList.remove(businessObject);
                    }
                    changeSupport.fireChange();
                }
            });
        }
    }
    
}
