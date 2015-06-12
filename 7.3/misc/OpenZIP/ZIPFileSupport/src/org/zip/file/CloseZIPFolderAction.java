package org.zip.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import org.netbeans.api.actions.Closable;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.zip.file.CloseZIPFolderAction")
@ActionRegistration(
        displayName = "#CTL_CloseZIPFolderAction")
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 850),
    @ActionReference(path = "Loaders/folder/any/Actions", position = 250)
})
@Messages("CTL_CloseZIPFolderAction=Close ZIP Folder")
public final class CloseZIPFolderAction implements ActionListener {

    private final List<Closable> context;

    public CloseZIPFolderAction(List<Closable> context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        for (Closable closable : context) {
            closable.close();
        }
    }
    
}
