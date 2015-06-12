/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abcfiletypesupport;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle.Messages;

@ActionID(category = "Edit",
id = "com.mycompany.abcfiletypesupport.MyAction")
@ActionRegistration(displayName = "#CTL_MyAction")
@ActionReferences({
    @ActionReference(path = "Loaders/text/x-abc/Actions", position = 0)
})
@Messages("CTL_MyAction=My Action")
public final class MyAction implements ActionListener {

    private final AbcDataObject context;

    public MyAction(AbcDataObject context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        FileObject f = context.getPrimaryFile();
        String displayName = FileUtil.getFileDisplayName(f);
        String msg = "This file is " + displayName + ".";
        NotifyDescriptor nd = new NotifyDescriptor.Message(msg);
        DialogDisplayer.getDefault().notify(nd);
    }
    
}
