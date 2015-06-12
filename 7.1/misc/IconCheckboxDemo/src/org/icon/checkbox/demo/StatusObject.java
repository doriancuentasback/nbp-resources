/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icon.checkbox.demo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.openide.awt.StatusDisplayer;

public class StatusObject {

    private boolean visible;
    public static final String PROP_VISIBLE = "visible";

    public StatusObject(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        boolean oldVisible = this.visible;
        this.visible = visible;
        propertyChangeSupport.firePropertyChange(PROP_VISIBLE, oldVisible, visible);
        StatusDisplayer.getDefault().setStatusText("Visible: " + visible);
    }
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
