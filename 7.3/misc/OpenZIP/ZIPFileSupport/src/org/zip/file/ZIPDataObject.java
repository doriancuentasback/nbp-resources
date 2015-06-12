package org.zip.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.netbeans.api.actions.Openable;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.filesystems.MIMEResolver;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.util.Cancellable;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.util.RequestProcessor;
import org.zip.utils.CentralLookup;

@Messages({
    "LBL_ZIP_LOADER=Files of ZIP"
})
@MIMEResolver.ExtensionRegistration(
        displayName = "#LBL_ZIP_LOADER",
        mimeType = "application/x-zip",
        showInFileChooser = {"ZIP Archives"},
        extension = {"zip", "ZIP"})
@DataObject.Registration(
        mimeType = "application/x-zip",
        displayName = "#LBL_ZIP_LOADER",
        position = 300)
@ActionReferences({
    @ActionReference(
            path = "Loaders/application/x-zip/Actions",
            id =
            @ActionID(category = "System", id = "org.openide.actions.OpenAction"),
            position = 100),
})
public class ZIPDataObject extends MultiDataObject implements Openable {

    private static final RequestProcessor RP = new RequestProcessor(ZIPDataObject.class);

    public ZIPDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
    }

    @Override
    public void open() {
        final File zip = FileUtil.toFile(getPrimaryFile());
        RP.post(new Runnable() {
            @Override
            public void run() {
                try {
                    File root = FileUtil.toFile(getPrimaryFile().getParent().createFolder(getName()));
                    unpackAndOpen(zip, root);
                    CentralLookup.getDefault().add(FileUtil.toFileObject(root));
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        });
    }

    @Messages({
        "# {0} - ZIP file", "MSG_unpacking=Unpacking {0}",
        "# {0} - ZIP entry name", "MSG_creating=Creating {0}",
        "# {0} - folder", "MSG_checking=Checking for project: {0}"
    })
    private void unpackAndOpen(File zip, File root) throws IOException {
        final AtomicBoolean canceled = new AtomicBoolean();
        ProgressHandle handle = ProgressHandleFactory.createHandle(Bundle.MSG_unpacking(zip.getName()), new Cancellable() {
            @Override
            public boolean cancel() {
                return canceled.compareAndSet(false, true);
            }
        });
        handle.start();
        try {
            List<File> folders = new ArrayList<File>();
            InputStream is = new FileInputStream(zip);
            try {
                ZipInputStream zis = new ZipInputStream(is);
                ZipEntry entry;
                while ((entry = zis.getNextEntry()) != null) {
                    if (canceled.get()) {
                        return;
                    }
                    String n = entry.getName();
                    File f = new File(root, n);
                    if (n.endsWith("/")) {
                        if (!f.isDirectory()) {
                            if (!f.mkdirs()) {
                                throw new IOException("could not make " + f);
                            }
                            if (entry.getTime() > 0) {
                                if (!f.setLastModified(entry.getTime())) {
                                    // oh well
                                }
                            }
                        }
                        folders.add(f);
                    } else {
                        handle.progress(Bundle.MSG_creating(n));
                        File p = f.getParentFile();
                        if (!p.isDirectory() && !p.mkdirs()) {
                            throw new IOException("could not make " + p);
                        }
                        OutputStream os = new FileOutputStream(f);
                        try {
                            FileUtil.copy(zis, os);
                        } finally {
                            os.close();
                        }
                        if (entry.getTime() > 0) {
                            if (!f.setLastModified(entry.getTime())) {
                                // oh well
                            }
                        }
                    }
                }
            } finally {
                is.close();
            }
            handle.switchToDeterminate(folders.size());
            if (canceled.get()) {
                return;
            }
        } finally {
            handle.finish();
        }
    }
    
}
