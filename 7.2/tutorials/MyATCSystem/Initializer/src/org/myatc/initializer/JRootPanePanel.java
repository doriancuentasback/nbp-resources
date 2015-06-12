/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myatc.initializer;

import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import javax.swing.JRootPane;
import javax.swing.RootPaneContainer;

/**
 *
 * @author Geertjan
 */
public class JRootPanePanel extends JComponent implements RootPaneContainer {

   private JRootPane rootPane = new JRootPane();

   public JRootPanePanel() {
      super.addImpl(rootPane, null, 0);
   }

   @Override
   /**
    * make the root pane fill the entire components content area
    */
   public void doLayout() {
      rootPane.setBounds(0, 0, getWidth(), getHeight());
   }

   /**
    * Overridden delegate the layout manager the content pane. Just like JFrame and JDialog do.
    */
   @Override
   public void setLayout(LayoutManager manager) {
      getContentPane().setLayout(manager);
   }


   /**
    * Overridden to pass the added component to the content pane. Just like JFrame and JDialog do.
    */
   @Override
   protected void addImpl(Component comp, Object constraints, int index) {
      getContentPane().add(comp, constraints, index);
   }

   @Override
   public Container getContentPane() {
      return rootPane.getContentPane();
   }

   @Override
   public Component getGlassPane() {
      return rootPane.getGlassPane();
   }

   @Override
   public JLayeredPane getLayeredPane() {
      return rootPane.getLayeredPane();
   }

   @Override
   public void setContentPane(Container contentPane) {
      rootPane.setContentPane(contentPane);
   }

   @Override
   public void setGlassPane(Component glassPane) {
      rootPane.setGlassPane(glassPane);

   }

   @Override
   public void setLayeredPane(JLayeredPane layeredPane) {
      rootPane.setLayeredPane(layeredPane);
   }

}