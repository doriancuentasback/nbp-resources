/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.domain;

import java.util.List;

/**
 *
 * @author Geertjan
 */
public class Actor implements Person {

    String nsme;
    List<Mansion> mansions;

    public Actor(String nsme, List<Mansion> mansions) {
        this.nsme = nsme;
        this.mansions = mansions;
    }

    public List<Mansion> getMansions() {
        return mansions;
    }

    public void setMansions(List<Mansion> mansions) {
        this.mansions = mansions;
    }

    public String getNsme() {
        return nsme;
    }

    public void setNsme(String nsme) {
        this.nsme = nsme;
    }

    @Override
    public int getType() {
        return 1;
    }
}
