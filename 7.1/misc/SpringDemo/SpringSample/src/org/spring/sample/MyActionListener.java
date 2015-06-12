/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spring.sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hello from Spring!");
    }
    
}