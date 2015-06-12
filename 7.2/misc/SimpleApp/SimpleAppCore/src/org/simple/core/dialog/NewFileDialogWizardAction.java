package org.simple.core.dialog;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.cookies.OpenCookie;
import org.openide.explorer.ExplorerManager;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileSystem;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
id = "org.simple.core.dialog.NewFileDialogWizardAction")
@ActionRegistration(
        iconBase = "org/simple/core/newFile.png",
displayName = "Open New File Dialog")
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 10)
})
public final class NewFileDialogWizardAction implements ActionListener {

    private static AtomicInteger _integer = new AtomicInteger(0);
    private DialogDescriptor dd;
    private NewFileDialogVisualPanel nfdvp;

    @Messages("ACT_NewFile=New File")
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            nfdvp = new NewFileDialogVisualPanel();
            dd = new DialogDescriptor(nfdvp, "Select Template", true, new MyButtonListener());
            Dialog dialog = DialogDisplayer.getDefault().createDialog(dd);
            dialog.setVisible(true);
            dialog.toFront();
        } catch (DataObjectNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private FileObject getTemplate() {
        ExplorerManager.Provider p = nfdvp;
        return p.getExplorerManager().getSelectedNodes()[0].getLookup().lookup(FileObject.class);
    }

    private class MyButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (dd.getValue() == DialogDescriptor.OK_OPTION) {
                DataObject gdo;
                try {
                    gdo = getDataObject();
                    OpenCookie cookie = gdo.getLookup().lookup(OpenCookie.class);
                    cookie.open();
                } catch (DataObjectNotFoundException ex) {
                    Exceptions.printStackTrace(ex);
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        }
    }

    protected DataObject getDataObject() throws DataObjectNotFoundException, IOException {
        String templateName = getTemplate().getPath();
        FileObject fo = FileUtil.getConfigRoot().getFileObject(templateName);
        DataObject template = DataObject.find(fo);
        FileSystem memFS = FileUtil.createMemoryFileSystem();
        FileObject root = memFS.getRoot();
        DataFolder dataFolder = DataFolder.findFolder(root);
        DataObject gdo = template.createFromTemplate(dataFolder, getTemplate().getName() + " (" + getNextCount() + ")");
        return gdo;
    }

    private static int getNextCount() {
        return _integer.incrementAndGet();
    }
}
