/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.customer.explorer;

import java.awt.BorderLayout;
import java.beans.IntrospectionException;
import java.beans.PropertyVetoException;
import java.util.List;
import javax.swing.Action;
import javax.swing.JOptionPane;
import org.customer.model.Customer;
import org.customer.utils.CentralLookup;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.StatusDisplayer;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.explorer.view.BeanTreeView;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup.Result;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.customer.explorer//CustomerExplorer//EN",
        autostore = false)
@TopComponent.Description(
        preferredID = "CustomerExplorerTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "properties", openAtStartup = true)
@ActionID(category = "Window", id = "org.customer.explorer.CustomerExplorerTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_CustomerExplorerAction",
        preferredID = "CustomerExplorerTopComponent")
@Messages({
    "CTL_CustomerExplorerAction=Open Explorer",
    "CTL_CustomerExplorerTopComponent=Explorer",
    "HINT_CustomerExplorerTopComponent=This is a CustomerExplorer window"
})
public final class CustomerExplorerTopComponent extends TopComponent implements ExplorerManager.Provider {

    private ExplorerManager em = new ExplorerManager();
    private InstanceContent ic = new InstanceContent();

    public CustomerExplorerTopComponent() {
        initComponents();
        setName(Bundle.CTL_CustomerExplorerTopComponent());
        setToolTipText(Bundle.HINT_CustomerExplorerTopComponent());
        setLayout(new BorderLayout());
        em.setRootContext(new AbstractNode(Children.create(new DroppedCustomerChildFactory(), true)));
        BeanTreeView btv = new BeanTreeView();
        btv.setRootVisible(false);
        add(btv, BorderLayout.CENTER);
        associateLookup(new ProxyLookup(ExplorerUtils.createLookup(em, getActionMap()), new AbstractLookup(ic)));
    }

    private class DroppedCustomerChildFactory extends ChildFactory.Detachable<Customer> implements LookupListener {

        private Result<Customer> allCustomersInCentalLookup;
        private Result<Customer> allCustomersInGlobalLookup;

        @Override
        protected boolean createKeys(List<Customer> list) {
            for (Customer c : allCustomersInCentalLookup.allInstances()) {
                ic.add(c);
                list.add(c);
            }
            return true;
        }

        @Override
        protected Node createNodeForKey(Customer t) {
            DroppedCustomerNode node = null;
            try {
                node = new DroppedCustomerNode(t);
            } catch (IntrospectionException ex) {
                Exceptions.printStackTrace(ex);
            }
            return node;
        }

        private class DroppedCustomerNode extends BeanNode {

            public DroppedCustomerNode(Customer t) throws IntrospectionException {
                super(t, Children.LEAF, Lookups.singleton(t));
                setDisplayName(t.getTitle());
            }

            @Override
            public Action[] getActions(boolean bln) {
                return new Action[]{};
            }
        }

        @Override
        protected void addNotify() {
            super.addNotify();
            allCustomersInCentalLookup = CentralLookup.getDefault().lookupResult(Customer.class);
            allCustomersInCentalLookup.addLookupListener(this);
            allCustomersInGlobalLookup = Utilities.actionsGlobalContext().lookupResult(Customer.class);
            allCustomersInGlobalLookup.addLookupListener(this);
        }

        @Override
        protected void removeNotify() {
            super.removeNotify();
            allCustomersInCentalLookup.removeLookupListener(this);
            allCustomersInGlobalLookup.removeLookupListener(this);
        }

        @Override
        public void resultChanged(LookupEvent le) {
            refresh(true);
            if (!allCustomersInGlobalLookup.allInstances().isEmpty()) {
                Customer c = allCustomersInGlobalLookup.allInstances().iterator().next();
                for (Node node : em.getRootContext().getChildren().getNodes()) {
                    if (node.getDisplayName().equals(c.getTitle())) {
                        try {
                            em.setSelectedNodes(new Node[]{node});
                        } catch (PropertyVetoException ex) {
                            Exceptions.printStackTrace(ex);
                        }
                    }
                }
            }
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

    @Override
    public ExplorerManager getExplorerManager() {
        return em;
    }
}
