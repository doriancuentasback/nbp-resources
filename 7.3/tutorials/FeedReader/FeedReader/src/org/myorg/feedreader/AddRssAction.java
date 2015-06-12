package org.myorg.feedreader;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.AbstractAction;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.filesystems.FileLock;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataFolder;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(category = "RootActions", id = "org.myorg.feedreader.AddRssAction")
@ActionRegistration(displayName = "#FN_addbutton")
@Messages("FN_addbutton=Add Feed")
public class AddRssAction extends AbstractAction {

    private final DataFolder folder;

    public AddRssAction(DataFolder df) {
        folder = df;
    }

    @Messages({
            "FN_askurl_msg=Enter the URL of an RSS/Atom Feed",
            "FN_askurl_title=New Feed",
            "FN_askurl_err=Invalid URL: {0}|",
            "FN_cannotConnect_err=Cannot Connect!"
    })
    @Override
    public void actionPerformed(ActionEvent ae) {
        NotifyDescriptor.InputLine nd = new NotifyDescriptor.InputLine(
                Bundle.FN_askurl_msg(),
                Bundle.FN_askurl_title(),
                NotifyDescriptor.OK_CANCEL_OPTION,
                NotifyDescriptor.PLAIN_MESSAGE);
        Object result = DialogDisplayer.getDefault().notify(nd);
        if (result.equals(NotifyDescriptor.OK_OPTION)) {
            String urlString = nd.getInputText();
            URL url;
            try {
                url = new URL(urlString);
            } catch (MalformedURLException e) {
                Exceptions.attachLocalizedMessage(e, Bundle.FN_askurl_err(result));
                Exceptions.printStackTrace(e);
                return;
            }
            try {
                checkConnection(url);
            } catch (IOException e) {
                Exceptions.attachLocalizedMessage(e, Bundle.FN_cannotConnect_err());
                Exceptions.printStackTrace(e);
                return;
            }
            Feed f = new Feed(url);
            FileObject fld = folder.getPrimaryFile();
            String baseName = "RssFeed";
            int ix = 1;
            while (fld.getFileObject(baseName + ix, "ser") != null) {
                ix++;
            }
            try {
                FileObject writeTo = fld.createData(baseName + ix, "ser");
                FileLock lock = writeTo.lock();
                try {
                    ObjectOutputStream str = new ObjectOutputStream(writeTo.getOutputStream(lock));
                    try {
                        str.writeObject(f);
                    } finally {
                        str.close();
                    }
                } finally {
                    lock.releaseLock();
                }
            } catch (IOException ioe) {
                Exceptions.printStackTrace(ioe);
            }
        }
    }

    private static void checkConnection(final URL url) throws IOException {
        InputStream is = url.openStream();
        is.close();
    }
    
}