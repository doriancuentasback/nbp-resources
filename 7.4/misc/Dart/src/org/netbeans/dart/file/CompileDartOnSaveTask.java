package org.netbeans.dart.file;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.api.extexecution.ExecutionDescriptor;
import org.netbeans.api.extexecution.ExecutionService;
import org.netbeans.api.extexecution.ExternalProcessBuilder;
import org.netbeans.dart.options.DartPanel;
import org.netbeans.spi.editor.document.OnSaveTask;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.util.Exceptions;
import org.openide.util.NbPreferences;
import org.openide.util.Utilities;

public class CompileDartOnSaveTask implements OnSaveTask {

    private final Document document;

    private final AtomicBoolean canceled = new AtomicBoolean();

    public CompileDartOnSaveTask(Document doc) {
        this.document = doc;
    }

    @Override
    public void performTask() {
        String dart2js = NbPreferences.forModule(DartPanel.class).get("dart2js", "");
        execute(dart2js, getFileObject(document));
    }

    public FileObject getFileObject(Document doc) {
        Object sdp = doc.getProperty(Document.StreamDescriptionProperty);
        if (sdp instanceof FileObject) {
            return (FileObject) sdp;
        }
        if (sdp instanceof DataObject) {
            return ((DataObject) sdp).getPrimaryFile();
        }
        return null;
    }

    public Integer execute(final String path, FileObject fo) {
        Integer get = null;
        ExecutionDescriptor descriptor = new ExecutionDescriptor().
                showProgress(true).
                frontWindow(true).
                controllable(true);
        ExternalProcessBuilder processBuilder = new ExternalProcessBuilder(path)
                .addArgument("-o").addArgument(fo.getParent().getPath() + "/" + fo.getName() + ".dart.js")
                .addArgument("--minify")
                .addArgument(fo.getPath());
        ExecutionService service = ExecutionService.newService(processBuilder, descriptor, path);
        Future<Integer> task = service.run();
        try {
            get = task.get();
        } catch (InterruptedException ex) {
            Exceptions.printStackTrace(ex);
        } catch (ExecutionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return get;
    }

    @Override
    public void runLocked(Runnable r) {
        r.run();
    }

    @Override
    public boolean cancel() {
        canceled.set(true);
        return true;
    }

    @MimeRegistration(mimeType = "text/x-dart", service = OnSaveTask.Factory.class, position = 1500)
    public static final class FactoryImpl implements Factory {

        @Override
        public OnSaveTask createTask(Context context) {
            return new CompileDartOnSaveTask(context.getDocument());
        }
    }

}
