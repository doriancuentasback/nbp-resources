/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.harbor.domain;

import java.awt.Color;
import java.beans.*;
import java.io.Serializable;

public class Ship implements Serializable {

    public static final String TYPE = "type";
    public static final String YEAR = "year";
    public static final String COLOR = "color";
    private String type;
    private int year;
    private Color color;
    private PropertyChangeSupport propertySupport;

    public Ship(String type, int year, Color color) {
        this.type = type;
        this.year = year;
        this.color = color;
        propertySupport = new PropertyChangeSupport(this);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        Color oldValue = this.color;
        this.color = color;
        propertySupport.firePropertyChange(COLOR, oldValue, color);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int oldValue = this.year;
        this.year = year;
        propertySupport.firePropertyChange(YEAR, oldValue, year);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldValue = this.type;
        this.type = type;
        propertySupport.firePropertyChange(TYPE, oldValue, type);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}
