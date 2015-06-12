/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.image2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.netbeans.modules.image.ImageDataObject;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.loaders.DataObject;
import org.openide.util.NbBundle.Messages;


// HURRAY!!!

@ActionID(
    category = "Edit",
id = "org.netbeans.modules.image2.TestAction")
@ActionRegistration(
    displayName = "#CTL_TestAction")
@ActionReference(path = "Menu/File", position = 1300)
@Messages("CTL_TestAction=HelloWorld")
public final class TestAction implements ActionListener {
    
    private final ImageDataObject dobj;

    public TestAction(ImageDataObject dobj) {
        this.dobj = dobj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, dobj.getPrimaryFile().getPath());
    }
    
}
