package com.mycompany.mavenplatformmodulea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(category = "Window",
id = "com.mycompany.mavenproject2.HelloWorldActionListener")
@ActionRegistration(displayName = "#CTL_HelloWorldActionListener")
@ActionReference(path = "Menu/Window", position = 0)
@Messages("CTL_HelloWorldActionListener=Hello World")
public final class HelloWorldActionListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        NotifyDescriptor d = new NotifyDescriptor.Message("hello...");
        DialogDisplayer.getDefault().notify(d);
    }

}
