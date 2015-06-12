/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.news.domain;

/**
 *
 * @author Geertjan
 */
public class News {
    
    String title;
    String description;
    String js;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }
    
    /**
     *
     * @param title
     * @param desc
     * @param js
     */
    public News(String title, String desc, String js) {
        this.title = title;
        this.description = desc;
        this.js = js;
    }
    
}
