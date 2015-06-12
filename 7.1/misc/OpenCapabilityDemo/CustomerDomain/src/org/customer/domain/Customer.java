/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.customer.domain;

/**
 *
 * @author geertjan
 */
public class Customer {
    
    String name;

    public Customer(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
