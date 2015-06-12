/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spring.sample;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyJButton extends JButton {

    private ActionListener actionListener;

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void init() {
        this.addActionListener(actionListener);
    }
    
}