/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galileo.netbeans.module;

final class ModuleOptions2Panel extends javax.swing.JPanel {

   private final ModuleOptions2PanelController controller;

   ModuleOptions2Panel(ModuleOptions2PanelController controller) {
      this.controller = controller;
      initComponents();
      // TODO listen to changes in form fields and call controller.changed()
   }

   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 202, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 68, Short.MAX_VALUE)
      );
   }// </editor-fold>//GEN-END:initComponents

   void load() {
      // TODO read settings and initialize GUI
      // Example:        
      // someCheckBox.setSelected(Preferences.userNodeForPackage(ModuleOptions2Panel.class).getBoolean("someFlag", false));
      // or for org.openide.util with API spec. version >= 7.4:
      // someCheckBox.setSelected(NbPreferences.forModule(ModuleOptions2Panel.class).getBoolean("someFlag", false));
      // or:
      // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
   }

   void store() {
      // TODO store modified settings
      // Example:
      // Preferences.userNodeForPackage(ModuleOptions2Panel.class).putBoolean("someFlag", someCheckBox.isSelected());
      // or for org.openide.util with API spec. version >= 7.4:
      // NbPreferences.forModule(ModuleOptions2Panel.class).putBoolean("someFlag", someCheckBox.isSelected());
      // or:
      // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());
   }

   boolean valid() {
      // TODO check whether form is consistent and complete
      return true;
   }
      // Variables declaration - do not modify//GEN-BEGIN:variables
   // End of variables declaration//GEN-END:variables
}