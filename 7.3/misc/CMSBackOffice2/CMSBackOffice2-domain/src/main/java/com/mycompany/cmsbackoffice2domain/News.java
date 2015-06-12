/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cmsbackoffice2domain;

/**
 *
 * @author Geertjan
 */
public class News {
    
    String title;
    
    String description;
    
    String javaScript;

    public News(String title, String description, String javaScript) {
        this.title = title;
        this.description = description;
        this.javaScript = javaScript;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJavaScript() {
        return javaScript;
    }

    public void setJavaScript(String javaScript) {
        this.javaScript = javaScript;
    }
    
}
