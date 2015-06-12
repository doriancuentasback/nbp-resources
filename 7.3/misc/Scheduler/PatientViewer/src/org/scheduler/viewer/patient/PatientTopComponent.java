/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scheduler.viewer.patient;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Point;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import org.netbeans.api.settings.ConvertAsProperties;
import org.netbeans.swing.outline.Outline;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.StatusDisplayer;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.explorer.view.OutlineView;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.nodes.NodeTransfer;
import org.openide.nodes.PropertySupport;
import org.openide.nodes.Sheet;
import org.openide.util.Exceptions;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.Lookups;
import org.scheduler.model.Doctor;
import org.scheduler.model.Patient;
import org.scheduler.model.ScheduleManager;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.scheduler.viewer.patient//Patient//EN",
        autostore = false)
@TopComponent.Description(
        preferredID = "PatientTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "org.scheduler.viewer.patient.PatientTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_PatientAction",
        preferredID = "PatientTopComponent")
@Messages({
    "CTL_PatientAction=Patient",
    "CTL_PatientTopComponent=Patients",
    "HINT_PatientTopComponent=This is a Patient window"
})
public final class PatientTopComponent extends TopComponent implements ExplorerManager.Provider {

    ExplorerManager em = new ExplorerManager();

    public PatientTopComponent() {
        initComponents();
        setName(Bundle.CTL_PatientTopComponent());
        setToolTipText(Bundle.HINT_PatientTopComponent());
        setLayout(new BorderLayout());

        //Create children, using the factory class we created:
        Children kids = Children.create(new PatientChildFactory(), true);

        //Create a root node:
        Node rootNode = new AbstractNode(kids);

        //Create the OutlineView:
        PatientOutlineView ov = new PatientOutlineView();

        //Set the columns of the outline view,
        //using the name of the property
        //followed by the text to be displayed in the column header:
        ov.setPropertyColumns(
                "morningdoctor", "Morning Doctor",
                "afternoondoctor", "Afternoon Doctor");

        //Hide the root node, since we only care about the children:
        ov.getOutline().setRootVisible(false);

        //Add the OutlineView to the TopComponent:
        add(ov, BorderLayout.CENTER);

        //Set the root of the ExplorerManager:
        em.setRootContext(rootNode);

        //Put the Nodes into the Lookup of the TopComponent,
        //so that the Properties window will be synchronized:
        associateLookup(ExplorerUtils.createLookup(em, getActionMap()));

    }

    @Override
    public ExplorerManager getExplorerManager() {
        return em;
    }

    private class PatientOutlineView extends OutlineView {

        Outline outline;

        public PatientOutlineView() {
            super("Patients");
            outline = getOutline();
            DropTarget dt = new DropTarget(outline, new PatientOutlineViewDropTargetListener());
            dt.setDefaultActions(DnDConstants.ACTION_COPY_OR_MOVE);
            dt.setActive(true);
            outline.setColumnHidingAllowed(false);
        }

        public class PatientOutlineViewDropTargetListener implements DropTargetListener {

            @Override
            public void drop(DropTargetDropEvent dtde) {
                Point locationOfDrop = dtde.getLocation();
                Node doctorNode = NodeTransfer.node(
                        dtde.getTransferable(),
                        NodeTransfer.DND_COPY_OR_MOVE);
                Doctor doctor = doctorNode.getLookup().lookup(Doctor.class);
                if (doctor != null) {
                    int columnAtPoint = outline.columnAtPoint(locationOfDrop);
                    int rowAtPoint = outline.rowAtPoint(locationOfDrop);
                    if (columnAtPoint != 0) {
                        outline.setValueAt(doctor.getName(), rowAtPoint, columnAtPoint);
                        outline.setRowSelectionInterval(rowAtPoint, rowAtPoint);
                        Node currentPatientNode = getExplorerManager().getSelectedNodes()[0];
                        Patient currentPatient = currentPatientNode.getLookup().lookup(Patient.class);
                        StringBuilder messageBuilder = new StringBuilder();
                        messageBuilder.append("Assigned ").append(doctor.getName()).append(" to ").append(
                                currentPatient.getName());
                        if (columnAtPoint == 1) {
                            currentPatient.setMorningdoctor(doctor);
                            messageBuilder.append(" for the morning slot");
                        } else if (columnAtPoint == 2) {
                            currentPatient.setAfternoondoctor(doctor);
                            messageBuilder.append(" for the afternoon slot");
                        }
                        StatusDisplayer.getDefault().setStatusText(messageBuilder.toString());
                    } else {
                        StatusDisplayer.getDefault().setStatusText(
                                "Cannot drop " + doctor.getName() + " at "
                                + rowAtPoint + " / " + columnAtPoint
                                + " because that's the Patients column");
                    }
                }
            }

            @Override
            public void dragEnter(DropTargetDragEvent dtde) {
            }

            @Override
            public void dragExit(DropTargetEvent dtde) {
            }

            @Override
            public void dragOver(DropTargetDragEvent dtde) {
            }

            @Override
            public void dropActionChanged(DropTargetDragEvent dtde) {
            }
        }
    }

    private class PatientChildFactory extends ChildFactory<Patient> {

        @Override
        protected boolean createKeys(List<Patient> list) {
            list.addAll(ScheduleManager.getPatients());
            return true;
        }

        @Override
        protected Node createNodeForKey(Patient key) {
            try {
                return new PatientNode(key);
            } catch (IntrospectionException ex) {
                Exceptions.printStackTrace(ex);
            }
            return null;
        }

        private class PatientNode extends BeanNode {

            public PatientNode(Patient bean) throws IntrospectionException {
                super(bean, Children.LEAF, Lookups.singleton(bean));
                setDisplayName(bean.getName());
            }

            @Override
            protected Sheet createSheet() {
                Sheet sheet = super.createSheet();
                Sheet.Set set = sheet.get(Sheet.PROPERTIES);
                if (set == null) {
                    set = Sheet.createPropertiesSet();
                    set.setName("PROPERTIES");
                }
                Patient patient = getLookup().lookup(Patient.class);
                set.put(new MorningDoctorNodeProperty(patient.getMorningdoctor()));
                set.put(new AfternoonDoctorNodeProperty(patient.getAfternoondoctor()));
                sheet.put(set);
                return sheet;
            }
//            @Override
//            public PasteType getDropType(Transferable t, int arg1, int arg2) {
//                final Node node = NodeTransfer.node(t, NodeTransfer.DND_COPY_OR_MOVE);
//                return new PasteType() {
//                    @Override
//                    public Transferable paste() throws IOException {
//                        Doctor doctor = node.getLookup().lookup(Doctor.class);
//                        Patient patient = getLookup().lookup(Patient.class);
//                        String message = doctor.getName() + " dropped on " + patient.getName();
//                        JOptionPane.showMessageDialog(null, message);
//                        return null;
//                    }
//                };
//            }
        }
    }

    public class MorningDoctorNodeProperty extends PropertySupport.ReadWrite<String> {

        private final Doctor doctor;

        public MorningDoctorNodeProperty(Doctor doctor) {
            super("morningdoctor", String.class, "Morning Doctor", "Doctor assigned in the morning");
            this.doctor = doctor;
            setValue("suppressCustomEditor", Boolean.TRUE);
        }

        @Override
        public String getValue() {
            return doctor.getName();
        }

        @Override
        public void setValue(String t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            doctor.setName(t);
        }
    }

    public class AfternoonDoctorNodeProperty extends PropertySupport.ReadWrite<String> {

        private final Doctor doctor;

        public AfternoonDoctorNodeProperty(Doctor doctor) {
            super("afternoondoctor", String.class, "Afternoon Doctor", "Doctor assigned in the afternoon");
            this.doctor = doctor;
            setValue("suppressCustomEditor", Boolean.TRUE);
        }

        @Override
        public String getValue() {
            return doctor.getName();
        }

        @Override
        public void setValue(String t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            doctor.setName(t);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

}
