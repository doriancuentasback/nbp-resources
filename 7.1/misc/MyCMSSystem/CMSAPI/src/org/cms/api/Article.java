/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cms.api;

import java.io.Serializable;

/**
 *
 * @author geertjan
 */
public class Article implements Serializable {

    public Article(String title, String content, String groovy) {
        this.title = title;
        this.content = content;
        this.groovy = groovy;
    }

    String title;

    String content;

    String groovy;

    public String getGroovy() {
        return groovy;
    }

    public void setGroovy(String groovy) {
        this.groovy = groovy;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
