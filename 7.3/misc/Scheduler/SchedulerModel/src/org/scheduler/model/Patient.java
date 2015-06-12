/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scheduler.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author geertjan
 */
public class Patient {

    String name;
    Doctor morningdoctor;
    Doctor afternoondoctor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doctor getMorningdoctor() {
        return morningdoctor;
    }

    public void setMorningdoctor(Doctor morningdoctor) {
        this.morningdoctor = morningdoctor;
    }

    public Doctor getAfternoondoctor() {
        return afternoondoctor;
    }

    public void setAfternoondoctor(Doctor afternoondoctor) {
        this.afternoondoctor = afternoondoctor;
    }

    public Patient(String name, Doctor morningdoctor, Doctor afternoondoctor) {
        this.name = name;
        this.morningdoctor = morningdoctor;
        this.afternoondoctor = afternoondoctor;
    }
    
}
