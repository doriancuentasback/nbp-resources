/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spring.sample;

import java.awt.Component;
import java.util.List;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class MyJPanel extends JPanel {

    private List<Component> panelComponents;

    public void setPanelComponents(List<Component> panelComponents) {
        this.panelComponents = panelComponents;
    }

    public void init() {
        setLayout(new MigLayout());
        for (Component component : panelComponents) {
            add(component);
        }
    }
    
}