package org.netbeans.htmltidy;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.spi.tasklist.FileTaskScanner;
import org.netbeans.spi.tasklist.Task;
import org.openide.cookies.LineCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.text.Line;
import org.w3c.tidy.Tidy;

public class HTMLTidyFileTaskScanner extends FileTaskScanner {

    public static HTMLTidyFileTaskScanner create() {
        return new HTMLTidyFileTaskScanner("HTML Tidy", "HTML Tidy tips & suggestions");
    }

    private HTMLTidyFileTaskScanner(String taskName, String taskDescriptions) {
        super(taskName, taskDescriptions, "Advanced");
    }


    @Override
    public List<? extends Task> scan(final FileObject resource) {
        LinkedList tasks = new LinkedList<Task>();
        if (resource.getMIMEType().equals("text/html")) {
            Tidy tidy = new Tidy();
            try {
                StringWriter stringWriter = new StringWriter();
                PrintWriter errorWriter = new PrintWriter(stringWriter);
                tidy.setErrout(errorWriter);
                tidy.parse(resource.getInputStream(), System.out);
                String[] split = stringWriter.toString().split("\n");
                for (final String string : split) {
                    final int end = string.indexOf(" c");
                    if (string.startsWith("line")) {
                        LineCookie lc = null;
                        int lineNumber = 0;
                        try {
                            lc = DataObject.find(resource).getLookup().lookup(LineCookie.class);
                            lineNumber = Integer.parseInt(string.substring(0, end).replace("line ", ""));
                            Line line = lc.getLineSet().getOriginal(lineNumber);
                            tasks.add(Task.create(resource, "tidy-tasklist-warning", string, line.getLineNumber()));
                        } catch (DataObjectNotFoundException ex) {
                            Logger.getLogger(HTMLTidyFileTaskScanner.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HTMLTidyFileTaskScanner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tasks;
    }

    @Override
    public void attach(Callback clbck) {
    }

}
