/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.domain;

/**
 *
 * @author geertjan
 */
public class Match {

    String displayText;

    String icon;

    public String getIcon() {
	return icon;
    }

    public void setIcon(String icon) {
	this.icon = icon;
    }

    public String getDisplayText() {
	return displayText;
    }

    public void setDisplayText(String displayText) {
	this.displayText = displayText;
    }

    public Match(String displayText, String icon) {
	this.displayText = displayText;
	this.icon = icon;
    }

}
