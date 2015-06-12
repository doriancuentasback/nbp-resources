/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sim.filesupport;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.cookies.OpenCookie;
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
        id = "org.sim.filesupport.NewFileAction")
@ActionRegistration(
        displayName = "#CTL_NewFileAction")
@ActionReference(path = "Menu/File", position = 0)
@Messages("CTL_NewFileAction=New File")
public final class NewFileAction implements ActionListener {

    private static AtomicInteger _integer = new AtomicInteger(0);

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            DataObject gdo = getDataObject();
            OpenCookie cookie = gdo.getLookup().lookup(OpenCookie.class);
            cookie.open();
        } catch (DataObjectNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    protected DataObject getDataObject() throws DataObjectNotFoundException, IOException {
        String templateName = getTemplate();
        FileObject fo = FileUtil.getConfigRoot().getFileObject(templateName);
        DataObject template = DataObject.find(fo);
        FileSystem memFS = FileUtil.createMemoryFileSystem();
        FileObject root = memFS.getRoot();
        DataFolder dataFolder = DataFolder.findFolder(root);
        DataObject gdo = template.createFromTemplate(dataFolder, "SimTemplate" + getNextCount());
        return gdo;
    }

    protected String getTemplate() {
        return "Templates/Other/SimTemplate.xml";
    }

    private static int getNextCount() {
        return _integer.incrementAndGet();
    }
}
