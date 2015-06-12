/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.census.palette;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import javax.swing.Action;
import javax.swing.JScrollPane;
import org.netbeans.api.settings.ConvertAsProperties;
import org.netbeans.api.visual.action.AcceptProvider;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.ConnectorState;
import org.netbeans.api.visual.widget.LabelWidget;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.netbeans.spi.actions.AbstractSavable;
import org.netbeans.spi.palette.PaletteActions;
import org.netbeans.spi.palette.PaletteFactory;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.NodeTransfer;
import org.openide.util.Lookup;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.Lookups;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.census.palette//CensusDesigner//EN",
        autostore = false)
@TopComponent.Description(
        preferredID = "CensusDesignerTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "org.census.palette.CensusDesignerTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_CensusDesignerAction",
        preferredID = "CensusDesignerTopComponent")
@Messages({
    "CTL_CensusDesignerAction=CensusDesigner",
    "CTL_CensusDesignerTopComponent=CensusDesigner Window",
    "HINT_CensusDesignerTopComponent=This is a CensusDesigner window"
})
public final class CensusDesignerTopComponent extends TopComponent {

    private InstanceContent ic = new InstanceContent();

    public CensusDesignerTopComponent() {
        initComponents();
        setName(Bundle.CTL_CensusDesignerTopComponent());
        setToolTipText(Bundle.HINT_CensusDesignerTopComponent());


        setLayout(new BorderLayout());
        JScrollPane jsp = new JScrollPane();

        final Scene scene = new Scene();
        final LayerWidget baseLayer = new LayerWidget(scene);

        scene.getActions().addAction(ActionFactory.createAcceptAction(new AcceptProvider() {
            @Override
            public ConnectorState isAcceptable(Widget widget, Point point, Transferable t) {
                return ConnectorState.ACCEPT;
            }

            @Override
            public void accept(Widget widget, Point point, Transferable t) {
                Country country = NodeTransfer.node(t, NodeTransfer.DND_COPY_OR_MOVE).getLookup().lookup(Country.class);
                MyWidget lw = new MyWidget(scene, country.getName(), CensusDesignerTopComponent.this);
                lw.setPreferredLocation(point);
                baseLayer.addChild(lw);
                modify();
            }
        }));


        scene.addChild(baseLayer);

        jsp.setViewportView(scene.createView());

        add(jsp, BorderLayout.CENTER);

        associateLookup(Lookups.fixed(new AbstractLookup(ic), PaletteFactory.createPalette(new AbstractNode(Children.create(new CategoryChildFactory(), true)), new PaletteActions() {
            @Override
            public Action[] getImportActions() {
                return null;
            }

            @Override
            public Action[] getCustomPaletteActions() {
                return null;
            }

            @Override
            public Action[] getCustomCategoryActions(Lookup lkp) {
                return null;
            }

            @Override
            public Action[] getCustomItemActions(Lookup lkp) {
                return null;
            }

            @Override
            public Action getPreferredAction(Lookup lkp) {
                return null;
            }
        })));

    }

    private void modify() {
        if (getLookup().lookup(CensusDesignerSavable.class) == null) {
            ic.add(new CensusDesignerSavable());
        }
    }
    
    private class CensusDesignerSavable extends AbstractSavable {

        public CensusDesignerSavable() {
            register();
        }

        @Override
        protected String findDisplayName() {
            return "Bla";
        }

        @Override
        protected void handleSave() throws IOException {
            tc().ic.remove(this);
            unregister();
        }

        CensusDesignerTopComponent tc() {
            return CensusDesignerTopComponent.this;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CensusDesignerSavable) {
                CensusDesignerSavable cds = (CensusDesignerSavable) obj;
                return tc() == cds.tc();
            }
            return false;
        }

        @Override
        public int hashCode() {
            return tc().hashCode();
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
