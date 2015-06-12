/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.customer.domain;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer  {

    private static final AtomicInteger ids = new AtomicInteger();
    private String name;
    private final int id;

    public Customer(String name) {
        this.name = name;
        id = ids.getAndIncrement();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
