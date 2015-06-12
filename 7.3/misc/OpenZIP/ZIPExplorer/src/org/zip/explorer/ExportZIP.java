package org.zip.explorer;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.netbeans.api.queries.SharabilityQuery;
import org.netbeans.api.queries.VisibilityQuery;
import org.openide.DialogDisplayer;
import org.openide.NotificationLineSupport;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Cancellable;
import org.openide.util.NbBundle.Messages;
import org.openide.util.RequestProcessor;
import org.openide.util.Utilities;
import org.zip.utils.CentralLookup;

public class ExportZIP extends JPanel {

    private static final RequestProcessor RP = new RequestProcessor(ExportZIP.class);
    private static final Logger LOG = Logger.getLogger(ExportZIP.class.getName());

    @ActionID(category = "File", id = "org.zip.explorer.export")
    @ActionRegistration(iconInMenu = false, displayName = "#CTL_ExportZIPAction")
    @ActionReference(path = "Menu/File", position = 1000)
    @Messages("CTL_ExportZIPAction=Export To &ZIP...")
    public static final class ExportZIPAction implements ActionListener {

        @Messages({
            "LBL_export=Export",
            "TITLE_export=Export ZIP Folder to ZIP File",
            "# {0} - ZIP file", "MSG_created=Created {0}"
        })
        @Override
        public void actionPerformed(ActionEvent e) {
            final ExportZIP panel = new ExportZIP();
            final JButton ok = new JButton(Bundle.LBL_export());
            NotifyDescriptor d = new NotifyDescriptor(panel, Bundle.TITLE_export(), NotifyDescriptor.OK_CANCEL_OPTION, NotifyDescriptor.PLAIN_MESSAGE, new Object[]{ok, NotifyDescriptor.CANCEL_OPTION}, null);
            final NotificationLineSupport notifications = d.createNotificationLineSupport();
            panel.addPropertyChangeListener(new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    ok.setEnabled(panel.check(notifications));
                }
            });
            panel.projectComboActionPerformed(null);
            if (DialogDisplayer.getDefault().notify(d) == ok) {
                final File root = panel.root();
                final File zip = new File(panel.zipField.getText());
                RP.post(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            if (!build(root, zip)) {
                                if (!zip.delete()) {
                                    throw new IOException("Cannot delete " + zip);
                                }
                                return;
                            }
                        } catch (IOException x) {
                            LOG.log(Level.WARNING, null, x);
                            return;
                        }
                        StatusDisplayer.getDefault().setStatusText(Bundle.MSG_created(zip));
                        try {
                            Desktop.getDesktop().open(zip);
                        } catch (Exception x) {
                            LOG.log(Level.FINE, null, x);
                        }
                    }
                });
            }
        }
    }

    @org.netbeans.api.annotations.common.SuppressWarnings("OS_OPEN_STREAM")
    @Messages({
        "# {0} - ZIP file", "MSG_building=Building {0}",
        "# {0} - ZIP entry name", "MSG_packed=Packed: {0}"
    })
    private static boolean build(File root, File zip) throws IOException {
        final AtomicBoolean canceled = new AtomicBoolean();
        ProgressHandle handle = ProgressHandleFactory.createHandle(Bundle.MSG_building(zip.getName()), new Cancellable() {
            @Override
            public boolean cancel() {
                return canceled.compareAndSet(false, true);
            }
        });
        handle.start();
        try {
            List<String> files = new ArrayList<String>();
            scanForFiles(root, files, "", handle, canceled, true);
            if (canceled.get()) {
                return false;
            }
            handle.switchToDeterminate(files.size());
            OutputStream os = new FileOutputStream(zip);
            try {
                ZipOutputStream zos = new ZipOutputStream(os);
                Set<String> written = new HashSet<String>();
                String prefix = root.getName() + '/';
                for (int i = 0; i < files.size(); i++) {
                    if (canceled.get()) {
                        return false;
                    }
                    String name = files.get(i);
                    writeEntry(prefix + name, written, zos, new File(root, name));
                    handle.progress(Bundle.MSG_packed(name), i);
                }
                zos.finish();
                zos.close();
            } finally {
                os.close();
            }
        } finally {
            handle.finish();
        }
        return true;
    }

    @Messages({"# {0} - subdirectory", "MSG_searching=Searching in {0}"})
    private static void scanForFiles(File root, List<String> files, String prefix, ProgressHandle handle, AtomicBoolean canceled, boolean mixedSharability) throws IOException {
        File[] kids = root.listFiles();
        if (kids == null) {
            throw new IOException("could not list " + root);
        }
        Arrays.sort(kids);
        for (File kid : kids) {
            if (canceled.get()) {
                return;
            }
            if (!VisibilityQuery.getDefault().isVisible(kid)) {
                continue;
            }
            boolean kidMixed;
            if (mixedSharability) {
                switch (SharabilityQuery.getSharability(Utilities.toURI(kid))) {
                    case SHARABLE:
                        kidMixed = false;
                        break;
                    case NOT_SHARABLE:
                        continue;
                    default:
                        kidMixed = true;
                }
            } else {
                kidMixed = false;
            }
            String n = kid.getName();
            String prefixN = prefix + n;
            if (kid.isFile()) {
                files.add(prefixN);
            } else if (kid.isDirectory()) {
                handle.progress(Bundle.MSG_searching(prefixN));
                scanForFiles(kid, files, prefixN + '/', handle, canceled, kidMixed);
            } // else symlink etc.?
        }
    }

    private static void writeEntry(String name, Set<String> written, ZipOutputStream zos, File f) throws IOException, FileNotFoundException {
        if (!written.add(name)) {
            return;
        }
        int idx = name.lastIndexOf('/', name.length() - 2);
        if (idx != -1) {
            writeEntry(name.substring(0, idx + 1), written, zos, f.getParentFile());
        }
        ZipEntry ze = new ZipEntry(name);
        ze.setTime(f.lastModified());
        if (name.endsWith("/")) {
            ze.setMethod(ZipEntry.STORED);
            ze.setSize(0);
            ze.setCrc(0);
            zos.putNextEntry(ze);
        } else {
            ByteArrayOutputStream content = new ByteArrayOutputStream((int) f.length());
            InputStream is = new FileInputStream(f);
            try {
                FileUtil.copy(is, content);
            } finally {
                is.close();
            }
            ze.setMethod(ZipEntry.DEFLATED);
            ze.setSize(f.length());
            CRC32 crc = new CRC32();
            byte[] data = content.toByteArray();
            crc.update(data);
            ze.setCrc(crc.getValue());
            zos.putNextEntry(ze);
            zos.write(data);
        }
    }

    @Messages({
        "ERR_no_proj=No ZIP folder selected.",
        "ERR_no_root=Must select a ZIP folder to package.",
        "# {0} - directory", "ERR_no_dir={0} does not exist.",
        "ERR_no_zip=Must select a ZIP to export to.",
        "# {0} - file", "ERR_exists={0} already exists.",
        "ERR_hg=If using Mercurial, consider instead: hg bundle --all ..."
    })
    private boolean check(NotificationLineSupport notifications) {
        notifications.clearMessages();
        if (projectRadio.isSelected() && projectCombo.getSelectedIndex() == -1) {
            notifications.setInformationMessage(Bundle.ERR_no_proj());
            return false;
        } else if (otherRadio.isSelected()) {
            String t = otherField.getText();
            if (t.isEmpty()) {
                notifications.setInformationMessage(Bundle.ERR_no_root());
                return false;
            } else if (!new File(t).isDirectory()) {
                notifications.setErrorMessage(Bundle.ERR_no_dir(t));
                return false;
            }
        }
        String t = zipField.getText();
        if (t.isEmpty()) {
            notifications.setInformationMessage(Bundle.ERR_no_zip());
            return false;
        } else if (new File(t).exists()) {
            notifications.setErrorMessage(Bundle.ERR_exists(t));
            return false;
        } else if (new File(t).getParentFile() == null) {
            notifications.setErrorMessage(Bundle.ERR_no_dir(new File(t)));
            return false;
        } else if (!new File(t).getParentFile().isDirectory()) {
            notifications.setErrorMessage(Bundle.ERR_no_dir(new File(t).getParent()));
            return false;
        }
        if (new File(root(), ".hg/store").isDirectory()) {
            notifications.setInformationMessage(Bundle.ERR_hg());
        }
        return true;
    }
    private boolean zipFieldDefault = true;

    private ExportZIP() {
        initComponents();
        ArrayList<String> al = new ArrayList<String>();
        for (FileObject fo : CentralLookup.getDefault().lookupAll(FileObject.class)) {
            al.add(fo.getPath());
        }
        projectCombo.setModel(new DefaultComboBoxModel(al.toArray()));
        zipField.getDocument().addDocumentListener(new DocumentListener() {
            private void edited() {
                firePropertyChange("validity", null, null);
                zipFieldDefault = false;
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                edited();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                edited();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }

    private File root() {
        if (projectRadio.isSelected()  && projectCombo.getSelectedItem()!=null) {
            return new File(projectCombo.getSelectedItem().toString());
        } else {
            return new File(otherField.getText());
        }
    }

    private void defaultZipField() {
        if (zipFieldDefault) {
            File root = root();
            if (root != null) {
                zipField.setText(FileUtil.normalizeFile(new File(System.getProperty("java.io.tmpdir"), root.getName() + ".zip")).getAbsolutePath());
                zipFieldDefault = true;
            }
        }
        firePropertyChange("validity", null, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootGroup = new javax.swing.ButtonGroup();
        projectRadio = new javax.swing.JRadioButton();
        projectCombo = new javax.swing.JComboBox();
        otherRadio = new javax.swing.JRadioButton();
        otherField = new javax.swing.JTextField();
        otherButton = new javax.swing.JButton();
        zipLabel = new javax.swing.JLabel();
        zipField = new javax.swing.JTextField();
        zipButton = new javax.swing.JButton();

        rootGroup.add(projectRadio);
        projectRadio.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(projectRadio, org.openide.util.NbBundle.getMessage(ExportZIP.class, "ExportZIP.projectRadio.text")); // NOI18N
        projectRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectRadioActionPerformed(evt);
            }
        });

        projectCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectComboActionPerformed(evt);
            }
        });

        rootGroup.add(otherRadio);
        org.openide.awt.Mnemonics.setLocalizedText(otherRadio, org.openide.util.NbBundle.getMessage(ExportZIP.class, "ExportZIP.otherRadio.text")); // NOI18N
        otherRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherRadioActionPerformed(evt);
            }
        });

        otherField.setEditable(false);

        org.openide.awt.Mnemonics.setLocalizedText(otherButton, org.openide.util.NbBundle.getMessage(ExportZIP.class, "ExportZIP.otherButton.text")); // NOI18N
        otherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherButtonActionPerformed(evt);
            }
        });

        zipLabel.setLabelFor(zipField);
        org.openide.awt.Mnemonics.setLocalizedText(zipLabel, org.openide.util.NbBundle.getMessage(ExportZIP.class, "ExportZIP.zipLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(zipButton, org.openide.util.NbBundle.getMessage(ExportZIP.class, "ExportZIP.zipButton.text")); // NOI18N
        zipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zipLabel)
                    .addComponent(projectRadio)
                    .addComponent(otherRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(otherField, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otherButton))
                    .addComponent(projectCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zipField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zipButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectRadio)
                    .addComponent(projectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherRadio)
                    .addComponent(otherField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipLabel)
                    .addComponent(zipField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void zipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            zipField.setText(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_zipButtonActionPerformed

    private void otherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            otherField.setText(fc.getSelectedFile().getAbsolutePath());
            otherRadio.setSelected(true);
            defaultZipField();
        }
    }//GEN-LAST:event_otherButtonActionPerformed

    private void projectComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectComboActionPerformed
        projectRadio.setSelected(true);
        defaultZipField();
    }//GEN-LAST:event_projectComboActionPerformed

    private void projectRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectRadioActionPerformed
        defaultZipField();
    }//GEN-LAST:event_projectRadioActionPerformed

    private void otherRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherRadioActionPerformed
        defaultZipField();
    }//GEN-LAST:event_otherRadioActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton otherButton;
    private javax.swing.JTextField otherField;
    private javax.swing.JRadioButton otherRadio;
    private javax.swing.JComboBox projectCombo;
    private javax.swing.JRadioButton projectRadio;
    private javax.swing.ButtonGroup rootGroup;
    private javax.swing.JButton zipButton;
    private javax.swing.JTextField zipField;
    private javax.swing.JLabel zipLabel;
    // End of variables declaration//GEN-END:variables
}
