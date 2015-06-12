/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.runway.api;

/**
 *
 * @author geertjan
 */
public class Engineer {

    String name;

    public Engineer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
