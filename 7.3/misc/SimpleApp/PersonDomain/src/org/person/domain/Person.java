/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.person.domain;

/**
 *
 * @author geertjan
 */
public class Person {
    String type;
    public Person(String type) {
        this.type=type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
