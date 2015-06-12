/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.domain;

/**
 *
 * @author Geertjan
 */
public class Director implements Person {

    String nsme;

    public Director(String nsme) {
        this.nsme = nsme;
    }

    public String getNsme() {
        return nsme;
    }

    public void setNsme(String nsme) {
        this.nsme = nsme;
    }

    @Override
    public int getType() {
        return 2;
    }
}
