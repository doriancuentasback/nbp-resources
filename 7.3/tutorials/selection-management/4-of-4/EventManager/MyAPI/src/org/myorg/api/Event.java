package org.myorg.api;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public final class Event {

    private Date date = new Date();
    private static int count = 0;
    private final int index;

    public Event() {
        index = count++;
    }

    public Date getDate() {
        return date;
    }

    public int getIndex() {
        return index;
    }

    public void setDate(Date d) {
        Date oldDate = date;
        date = d;
        fire("date", oldDate, date);
    }

    @Override
    public String toString() {
        return index + " - " + date;
    }
    private List listeners = Collections.synchronizedList(new LinkedList());

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        listeners.add(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        listeners.remove(pcl);
    }

    private void fire(String propertyName, Object old, Object nue) {
        //Passing 0 below on purpose, so you only synchronize for one atomic call:
        PropertyChangeListener[] pcls = (PropertyChangeListener[]) listeners.toArray(new PropertyChangeListener[0]);
        for (int i = 0; i < pcls.length; i++) {
            pcls[i].propertyChange(new PropertyChangeEvent(this, propertyName, old, nue));
        }
    }
}
