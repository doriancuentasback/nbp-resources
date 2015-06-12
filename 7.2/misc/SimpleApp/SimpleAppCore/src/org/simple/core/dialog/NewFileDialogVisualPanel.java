/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.simple.core.dialog;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.ChangedCharSetException;
import javax.swing.text.Document;
import org.openide.ErrorManager;
import org.openide.explorer.ExplorerManager;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.util.NbBundle.Messages;

public final class NewFileDialogVisualPanel extends JPanel implements ExplorerManager.Provider {

    private ExplorerManager em = new ExplorerManager();

    public NewFileDialogVisualPanel() throws DataObjectNotFoundException {
        initComponents();
        beanTreeView1.setRootVisible(false);
        FileObject templatesFolder = FileUtil.getConfigFile("Templates/Simple");
        DataObject dob = DataObject.find(templatesFolder);
        em.setRootContext(new FilterNode(dob.getNodeDelegate()));
        em.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        FileObject fo = em.getSelectedNodes()[0].getLookup().lookup(FileObject.class);
                        if (fo != null) {
                            URL descURL = (URL) fo.getAttribute("instantiatingWizardURL");
                            if (descURL != null) {
                                try {
                                    //this.description.setPage (descURL);
                                    // Set page does not work well if there are mutiple calls to that
                                    // see issue #49067. This is a hotfix for the bug which causes                                
                                    // synchronous loading of the content. It should be improved later 
                                    // by doing it in request processor.

                                    //this.description.read( descURL.openStream(), descURL );
                                    // #52801: handlig changed charset
                                    String charset = findEncodingFromURL(descURL.openStream());
                                    ErrorManager.getDefault().log(ErrorManager.INFORMATIONAL, "Url " + descURL + " has charset " + charset); // NOI18N
                                    if (charset != null) {
                                        descriptionPane.putClientProperty("charset", charset); // NOI18N
                                    }
                                    descriptionPane.read(descURL.openStream(), descURL);
                                } catch (ChangedCharSetException x) {
                                    Document doc = descriptionPane.getEditorKit().createDefaultDocument();
                                    doc.putProperty("IgnoreCharsetDirective", Boolean.valueOf(true)); // NOI18N
                                    try {
                                        descriptionPane.read(descURL.openStream(), doc);
                                    } catch (IOException ioe) {
                                        ErrorManager.getDefault().notify(ErrorManager.INFORMATIONAL, ioe);
                                        descriptionPane.setText(null);
                                    }
                                } catch (IOException e) {
                                    ErrorManager.getDefault().notify(ErrorManager.INFORMATIONAL, e);
                                    descriptionPane.setText(null);
                                }
                            } else {
                                descriptionPane.setText("No description provided for \"" + fo.getName() +"\"");
                            }
                        }
                    }
                });
            }
        });
    }

    private static String findEncodingFromURL(InputStream stream) {
        try {
            byte[] arr = new byte[4096];
            int len = stream.read(arr, 0, arr.length);
            String txt = new String(arr, 0, (len >= 0) ? len : 0, "ISO-8859-1").toUpperCase(Locale.ENGLISH);
            // encoding
            return findEncoding(txt);


        } catch (IOException x) {
            Logger.getLogger(NewFileDialogVisualPanel.class
                    .getName()).log(Level.INFO, null, x);
        }
        return null;
    }

    /**
     * Tries to guess the mime type from given input stream. Tries to find
     * <em>&lt;meta http-equiv="Content-Type" content="text/html;
     * charset=iso-8859-1"&gt;</em>
     *
     * @param txt the string to search in (should be in upper case)
     * @return the encoding or null if no has been found
     */
    private static String findEncoding(String txt) {
        int headLen = txt.indexOf("</HEAD>"); // NOI18N
        if (headLen == -1) {
            headLen = txt.length();
        }

        int content = txt.indexOf("CONTENT-TYPE"); // NOI18N
        if (content == -1 || content > headLen) {
            return null;
        }

        int charset = txt.indexOf("CHARSET=", content); // NOI18N
        if (charset == -1) {
            return null;
        }

        int charend = txt.indexOf('"', charset);
        int charend2 = txt.indexOf('\'', charset);
        if (charend == -1 && charend2 == -1) {
            return null;
        }

        if (charend2 != -1) {
            if (charend == -1 || charend > charend2) {
                charend = charend2;
            }
        }

        return txt.substring(charset + "CHARSET=".length(), charend); // NOI18N
    }

    @Messages("CTL_File=Choose File Type")
    @Override
    public String getName() {
        return Bundle.CTL_File();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionPane = new javax.swing.JEditorPane();
        beanTreeView1 = new org.openide.explorer.view.BeanTreeView();
        jLabel1 = new javax.swing.JLabel();

        descriptionPane.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(descriptionPane);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(NewFileDialogVisualPanel.class, "NewFileDialogVisualPanel.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
            .addComponent(beanTreeView1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beanTreeView1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openide.explorer.view.BeanTreeView beanTreeView1;
    private javax.swing.JEditorPane descriptionPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    @Override
    public ExplorerManager getExplorerManager() {
        return em;
    }
}
