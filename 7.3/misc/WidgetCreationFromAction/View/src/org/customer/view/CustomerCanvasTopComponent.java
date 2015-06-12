package org.customer.view;

import java.awt.Color;
import java.awt.Point;
import java.beans.PropertyChangeEvent;
import java.util.Collections;
import javax.swing.JOptionPane;
import org.customer.model.Customer;
import org.customer.model.capabilities.Droppable;
import org.customer.utils.CentralLookup;
import org.netbeans.api.settings.ConvertAsProperties;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.SelectProvider;
import org.netbeans.api.visual.model.ObjectScene;
import org.netbeans.api.visual.widget.LabelWidget;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Widget;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.StatusDisplayer;
import org.openide.nodes.Node;
import org.openide.util.Lookup.Result;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;
import org.openide.util.WeakListeners;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.ProxyLookup;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.customer.view//CustomerCanvas//EN",
        autostore = false)
@TopComponent.Description(
        preferredID = "CustomerCanvasTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "org.customer.view.CustomerCanvasTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_CustomerCanvasAction",
        preferredID = "CustomerCanvasTopComponent")
@Messages({
    "CTL_CustomerCanvasAction=Open Canvas",
    "CTL_CustomerCanvasTopComponent=Canvas",
    "HINT_CustomerCanvasTopComponent=This is a CustomerCanvas window"
})
public final class CustomerCanvasTopComponent extends TopComponent {

    private InstanceContent droppableIc = new InstanceContent();
    private InstanceContent customerIc = new InstanceContent();

    public CustomerCanvasTopComponent() {
        initComponents();
        setName(Bundle.CTL_CustomerCanvasTopComponent());
        setToolTipText(Bundle.HINT_CustomerCanvasTopComponent());
        jScrollPane1.setViewportView(new CustomerScene().createView());
        associateLookup(new ProxyLookup(new AbstractLookup(droppableIc), new AbstractLookup(customerIc)));
    }

    private class CustomerScene extends ObjectScene implements LookupListener {

        LabelWidget customerWidget;
        Result<Customer> allCustomersInLookup;

        public CustomerScene() {
            final LayerWidget layerWidget = new LayerWidget(this);
            Droppable d = new Droppable() {
                @Override
                public void doDrop(final Customer c) {
                    CentralLookup.getDefault().add(c);
                    customerWidget = new LabelWidget(CustomerScene.this, c.getTitle());
                    customerWidget.getActions().addAction(ActionFactory.createMoveAction());
                    customerWidget.getActions().addAction(ActionFactory.createSelectAction(new SelectProvider() {
                        @Override
                        public boolean isAimingAllowed(Widget widget, Point point, boolean bln) {
                            return false;
                        }
                        @Override
                        public boolean isSelectionAllowed(Widget widget, Point point, boolean bln) {
                            return true;
                        }
                        @Override
                        public void select(Widget widget, Point point, boolean bln) {
                            customerIc.set(Collections.singleton(c), null);
                        }
                    }));
                    layerWidget.addChild(customerWidget);
                    validate();
                    addObject(c, customerWidget);
                }
            };
            addChild(layerWidget);
            droppableIc.add(d);
            allCustomersInLookup = Utilities.actionsGlobalContext().lookupResult(Customer.class);
            allCustomersInLookup.addLookupListener(WeakListeners.create(LookupListener.class, this, allCustomersInLookup));
        }

        @Override
        public void resultChanged(LookupEvent le) {
            if (!allCustomersInLookup.allInstances().isEmpty()) {
                Customer c = allCustomersInLookup.allInstances().iterator().next();
                for (Object o : getObjects()) {
                    Customer localObject = (Customer) o;
                    if (localObject.getTitle().equals(c.getTitle())) {
                        findWidget(localObject).setForeground(Color.RED);
                        StatusDisplayer.getDefault().setStatusText("Selected: " + c.getTitle());
                    } else {
                        findWidget(o).setForeground(Color.BLACK);
                    }
                }
            }
            validate();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

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
