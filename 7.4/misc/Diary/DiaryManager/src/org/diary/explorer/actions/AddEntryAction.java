package org.diary.explorer.actions;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.SwingUtilities;
import org.diary.domain.Entry;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataFolder;
import org.openide.loaders.InstanceDataObject;
import org.openide.modules.OnStart;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

@ActionID(
        category = "Edit",
        id = "org.diary.explorer.actions.AddEntryAction"
)
@ActionRegistration(
        iconBase = "org/diary/explorer/images/new.png",
        displayName = "#CTL_AddEntryAction"
)
@ActionReference(path = "Toolbars/File", position = 300)
@Messages("CTL_AddEntryAction=Add Entry")
@OnStart
public final class AddEntryAction implements ActionListener, Runnable {

    private final DateFormat formatter;

    public AddEntryAction() {
        formatter = new SimpleDateFormat("HH:mm:ss");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String time = formatter.format(System.currentTimeMillis());
        NotifyDescriptor.InputLine nd = new NotifyDescriptor.InputLine("Name:", "New Entry");
        Object notify = DialogDisplayer.getDefault().notify(nd);
        String message = null;
        if (notify == NotifyDescriptor.OK_OPTION) {
            message = nd.getInputText();
        } 
        if (message.length()==0 || notify == NotifyDescriptor.CANCEL_OPTION) {
            message = "entry (" + time + ")";
        }
        Entry bean = new Entry();
        bean.setName(message);
        bean.setContent("");
        try {
            InstanceDataObject.create(
                    DataFolder.findFolder(FileUtil.getConfigFile("DiaryEntries")),
                    bean.getName(),
                    bean,
                    null,
                    true
            );
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @Override
    public void run() {
        FileObject diaryEntries = FileUtil.getConfigFile("DiaryEntries");
        if (diaryEntries == null) {
            try {
                FileUtil.getConfigRoot().createFolder("DiaryEntries");
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        //Set the size of the initial screen to something manageable:
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame f = WindowManager.getDefault().getMainWindow();
                f.addWindowListener(new Listener());
            }
        });
    }

    public class Listener extends WindowAdapter {

        @Override
        public void windowOpened(WindowEvent event) {
            Frame f = WindowManager.getDefault().getMainWindow();
            f.setTitle("Diary");
            f.setSize(600, 400);
        }
    }

}
