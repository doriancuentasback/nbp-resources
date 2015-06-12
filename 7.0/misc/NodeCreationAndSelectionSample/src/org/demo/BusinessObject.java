package org.demo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class BusinessObject {

    String name;
    boolean selected=false;
    private PropertyChangeSupport propertyChangeSupport;

    public BusinessObject(String name) {
        propertyChangeSupport = new PropertyChangeSupport(this);
        this.name=name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean newValue) {
        boolean oldValue = this.selected;
        this.selected = newValue;
        propertyChangeSupport.firePropertyChange("selected", oldValue, newValue);

    }

    public String getName() {
        return name;
    }

    public void setName(String newValue) {
        String oldValue = this.name;
        this.name = newValue;
        propertyChangeSupport.firePropertyChange("name", oldValue, newValue);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
    
}
