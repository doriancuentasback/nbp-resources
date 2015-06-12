package org.diary.domain;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.netbeans.api.settings.ConvertAsJavaBean;

@ConvertAsJavaBean()
public class Entry {

    private String name;
    private String content;
    private final PropertyChangeSupport propertyChangeSupport;

    public Entry() {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String newValue) {
        String oldValue = this.name;
        this.name = newValue;
        propertyChangeSupport.firePropertyChange("name", oldValue, newValue);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String newValue) {
        String oldValue = this.content;
        this.content = newValue;
        propertyChangeSupport.firePropertyChange("content", oldValue, newValue);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
