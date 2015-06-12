/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.domain;

import java.awt.Color;
import java.io.File;
import java.util.List;

/**
 *
 * @author Geertjan
 */
public class Movie {
    
    String title;
    File movieTorrent;
    int year;
    Color themeColor;
    List<Actor> actors;
    Director director;

    public Movie(String title, int year, 
            Color themeColor, File movieTorrent, 
            List<Actor> actors,
            Director director
            ) {
        this.actors = actors;
        this.director = director;
        this.title = title;
        this.year = year;
        this.themeColor = themeColor;
        this.movieTorrent = movieTorrent;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
    
    public File getMovieTorrent() {
        return movieTorrent;
    }

    public void setMovieTorrent(File movieTorrent) {
        this.movieTorrent = movieTorrent;
    }
    
    public Color getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(Color themeColor) {
        this.themeColor = themeColor;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
