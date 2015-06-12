package org.o.api;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyObject {

    private static final Logger LOG = Logger.getLogger(MyObject.class.getName());
    private transient final PropertyChangeSupport propertyChangeSupport =
            new PropertyChangeSupport(this);
    private String type;
    private List<MyObject> children = new ArrayList<MyObject>();
    public static final String PROP_TYPE = "type";

    public MyObject(final String type) {
        this.type = type;
    }

    public void addChild(final MyObject child) {
        children.add(child);
        propertyChangeSupport.firePropertyChange("ADD", null, child);
        LOG.log(Level.INFO, "Object Type: {0}, added new child {1}. "
                + "This object has {2} children.", new Object[]{
            type, child.getType(), children.size()});
    }

    public List<MyObject> getChildren() {
        return children;
    }

    public boolean hasChildren() {
        return !children.isEmpty();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        propertyChangeSupport.firePropertyChange(PROP_TYPE, oldType, type);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
