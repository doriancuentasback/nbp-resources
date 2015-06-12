package org.netbeans.preso.integrato;

import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import org.jpedal.PdfDecoder;
import org.jpedal.exception.PdfException;
import org.jpedal.fonts.FontMappings;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.awt.StatusDisplayer;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.NbPreferences;

/**
 *
 * @author geertjan
 */
class PresentationChildfactory extends ChildFactory<ImageObject> {

    private File file = null;
    private ArrayList<ImageObject> mylist;
    private String url = null;

    public PresentationChildfactory() {

        NbPreferences.forModule(PresentationsTopComponent.class).addPreferenceChangeListener(new PreferenceChangeListener() {
            @Override
            public void preferenceChange(PreferenceChangeEvent evt) {
                reset();
                refresh(true);
            }
        });
        reset();
    }

    @Override
    protected boolean createKeys(List<ImageObject> list) {
        PdfDecoder decode_pdf = new PdfDecoder(true);
        mylist = new ArrayList<ImageObject>();
        try {
            if (file != null) {
                ProgressHandle handle = ProgressHandleFactory.createHandle("Creating images from " + file.getPath());
                handle.start();
                FontMappings.setFontReplacements();
                decode_pdf.openPdfFile(FileUtil.normalizePath(file.getPath()));
                int start = 1, end = decode_pdf.getPageCount();
                for (int i = start; i < end + 1; i++) {
                    BufferedImage img = decode_pdf.getPageAsImage(i);
                    mylist.add(new ImageObject(img, i));
                }
                handle.finish();
            } else if (url != null) {
                ProgressHandle handle = ProgressHandleFactory.createHandle("Creating images from " + url);
                handle.start();
                FontMappings.setFontReplacements();
                decode_pdf.openPdfFileFromURL(url, false);
                int start = 1, end = decode_pdf.getPageCount();
                for (int i = start; i < end + 1; i++) {
                    BufferedImage img = decode_pdf.getPageAsImage(i);
                    mylist.add(new ImageObject(img, i));
                }
                handle.finish();
            }
            decode_pdf.closePdfFile();
            list.addAll(mylist);
        } catch (PdfException ex) {
            Exceptions.printStackTrace(ex);
        }
        return true;
    }

    @Override
    protected Node createNodeForKey(final ImageObject key) {
        AbstractNode an = new AbstractNode(Children.LEAF) {
            @Override
            public Action getPreferredAction() {
                return new OpenFile(key);
            }

            @Override
            public Action[] getActions(boolean context) {
                return new Action[]{new OpenFile(key)};
            }
        };
        an.setIconBaseWithExtension("org/netbeans/preso/integrato/icon_red_dot.png");
        an.setDisplayName("Slide " + key.getI());
        if (file != null) {
            an.setShortDescription(file.getName());
        } else {
            an.setShortDescription(url);
        }
        return an;
    }

    private void reset() {
        if (!"empty".equals(NbPreferences.forModule(PresentationsTopComponent.class).get("presentationFile", "empty"))) {
            String presentationFile = NbPreferences.forModule(PresentationsTopComponent.class).get("presentationFile", "empty");
            if (presentationFile.startsWith("http")) {
                this.url = presentationFile;
            } else if (presentationFile.endsWith(".pdf")) {
                this.file = new File(presentationFile);
            }
        } else {
            StatusDisplayer.getDefault().setStatusText("Right-click the Presentation node to load a PDF file...");
        }
    }

    private class OpenFile extends AbstractAction {

        private final ImageObject key;

        private OpenFile(ImageObject key) {
            super("Open File");
            this.key = key;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                File file = new File(System.getProperty("netbeans.user", "user.home") + "/slide" + key.getI() + ".png");
                ImageIO.write(key.getImage(), "jpg", file);
                DataObject.find(FileUtil.toFileObject(file)).getLookup().lookup(OpenCookie.class).open();
                StatusDisplayer.getDefault().setStatusText("done " + file.getAbsolutePath());
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
}
