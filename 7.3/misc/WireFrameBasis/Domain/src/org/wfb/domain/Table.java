package org.wfb.domain;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Table {

    private String displayName;
    private List<Row> rows;
    public static final String PROP_ROWS = "rows";
    

    public Table(String displayName, List<Row> rows) {
        this.displayName = displayName;
        this.rows = rows;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        List<Row> oldRows = this.rows;
        this.rows = rows;
        propertyChangeSupport.firePropertyChange(PROP_ROWS, oldRows, rows);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
