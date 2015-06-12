/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.tfnode;

import com.tinkerforge.Device;
import java.awt.Point;
import java.awt.datatransfer.Transferable;
import java.beans.BeanInfo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.Action;
import javax.swing.JOptionPane;
import org.netbeans.api.project.Project;
import org.netbeans.api.settings.ConvertAsProperties;
import org.netbeans.api.visual.action.AcceptProvider;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.ConnectProvider;
import org.netbeans.api.visual.action.ConnectorState;
import org.netbeans.api.visual.action.SelectProvider;
import org.netbeans.api.visual.anchor.AnchorFactory;
import org.netbeans.api.visual.anchor.AnchorShape;
import org.netbeans.api.visual.vmd.VMDNodeWidget;
import org.netbeans.api.visual.widget.ConnectionWidget;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.netbeans.spi.palette.PaletteActions;
import org.netbeans.spi.palette.PaletteFactory;
import org.netbeans.tfnode.palette.BrickChildFactory;
import org.openide.awt.StatusDisplayer;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.nodes.NodeTransfer;
import org.openide.util.Lookup;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.AbstractLookup.Content;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;

/**
 * Top component which displays something.
 */
//@TopComponent.Description(
//    preferredID = "TinkerForgeDesignerTopComponent",
////iconBase="SET/PATH/TO/ICON/HERE", 
//persistenceType = TopComponent.PERSISTENCE_ALWAYS)
//@TopComponent.Registration(mode = "editor", openAtStartup = false)
@Messages({
    "CTL_TinkerForgeDesignerAction=TinkerForgeDesigner",
    "CTL_TinkerForgeDesignerTopComponent=TinkerForgeDesigner Window",
    "HINT_TinkerForgeDesignerTopComponent=This is a TinkerForgeDesigner window"
})
public final class TinkerForgeDesignerTopComponent extends TopComponent {

    Set<Device> uniqueDevices = new HashSet<Device>();
    final Scene scene = new Scene();
    final LayerWidget baseLayer = new LayerWidget(scene);
    final LayerWidget connectionLayer = new LayerWidget(scene);
    private final InstanceContent ic = new InstanceContent();
    private Project project;

    public TinkerForgeDesignerTopComponent(Project project) {
        this.project = project;
        initComponents();
        setName(Bundle.CTL_TinkerForgeDesignerTopComponent());
        setToolTipText(Bundle.HINT_TinkerForgeDesignerTopComponent());
        scene.getActions().addAction(ActionFactory.createAcceptAction(new AcceptProvider() {
            @Override
            public ConnectorState isAcceptable(Widget widget, Point point, Transferable t) {
                Node node = NodeTransfer.node(t, NodeTransfer.DND_COPY_OR_MOVE);
                if (node != null) {
                    Device device = node.getLookup().lookup(Device.class);
                    if (!uniqueDevices.contains(device)) {
                        return ConnectorState.ACCEPT;
                    }
                }
                return ConnectorState.REJECT_AND_STOP;
            }

            @Override
            public void accept(Widget widget, Point point, Transferable t) {
                Node node = NodeTransfer.node(t, NodeTransfer.DND_COPY_OR_MOVE);
                if (node != null) {
                    Device device = node.getLookup().lookup(Device.class);
                    if (device != null) {
                        uniqueDevices.add(device);
                        VMDNodeWidget simpleWidget;
                        String myText = device.getClass().getSimpleName();
                        simpleWidget = new VMDNodeWidget(scene);
                        simpleWidget.setNodeName(myText);
                        simpleWidget.setToolTipText(myText);
                        simpleWidget.setNodeImage(node.getIcon(BeanInfo.ICON_COLOR_16x16));
                        simpleWidget.setPreferredLocation(point);
                        simpleWidget.getActions().addAction(ActionFactory.createExtendedConnectAction(
                                connectionLayer, new DeviceConnectProvider()));
                        simpleWidget.getActions().addAction(ActionFactory.createMoveAction());
                        simpleWidget.getActions().addAction(ActionFactory.createSelectAction(new SelectProvider() {
                            @Override
                            public boolean isAimingAllowed(Widget widget, Point point, boolean bln) {
                                return true;
                            }

                            @Override
                            public boolean isSelectionAllowed(Widget widget, Point point, boolean bln) {
                                return true;
                            }

                            @Override
                            public void select(Widget widget, Point point, boolean bln) {
                                JOptionPane.showMessageDialog(null, point);
                            }
                        }));
                        baseLayer.addChild(simpleWidget);
                    } else {
                        StatusDisplayer.getDefault().setStatusText("Hey, you didn't drop a LCD Bricklet");
                    }
                } else {
                    StatusDisplayer.getDefault().setStatusText("Hey, you didn't drop a Node");
                }
            }
        }));

        scene.addChild(baseLayer);
        scene.addChild(connectionLayer);

        jScrollPane1.setViewportView(scene.createView());

        associateLookup(new ProxyLookup(new AbstractLookup(ic), Lookups.singleton(PaletteFactory.createPalette(new AbstractNode(Children.create(new SectionChildFactory(), true)), new PaletteActions() {
            @Override
            public Action[] getImportActions() {
                return null;
            }

            @Override
            public Action[] getCustomPaletteActions() {
                return null;
            }

            @Override
            public Action[] getCustomCategoryActions(Lookup category) {
                return null;
            }

            @Override
            public Action[] getCustomItemActions(Lookup item) {
                return null;
            }

            @Override
            public Action getPreferredAction(Lookup item) {
                return null;
            }
        }))));

    }

    private static class SectionChildFactory extends ChildFactory<String> {

        @Override
        protected boolean createKeys(List<String> list) {
            list.add("Bricks");
            return true;
        }

        @Override
        protected Node createNodeForKey(String key) {
            AbstractNode sectionNode = new AbstractNode(Children.create(new BrickChildFactory(), true));
            sectionNode.setDisplayName(key);
            return sectionNode;
        }
        
    }

    private class DeviceConnectProvider implements ConnectProvider {

        @Override
        public boolean isSourceWidget(Widget sourceWidget) {
            return sourceWidget instanceof VMDNodeWidget;
        }

        @Override
        public ConnectorState isTargetWidget(Widget sourceWidget, Widget targetWidget) {
            return sourceWidget != targetWidget
                    && targetWidget instanceof VMDNodeWidget ? ConnectorState.ACCEPT : ConnectorState.REJECT;
        }

        @Override
        public boolean hasCustomTargetWidgetResolver(Scene scene) {
            return false;
        }

        @Override
        public Widget resolveTargetWidget(Scene scene, Point point) {
            return null;
        }

        @Override
        public void createConnection(Widget source, Widget target) {
            ConnectionWidget deviceConnectionWidget = new ConnectionWidget(scene);
            deviceConnectionWidget.setTargetAnchorShape(AnchorShape.TRIANGLE_HOLLOW);
            deviceConnectionWidget.setTargetAnchor(AnchorFactory.createRectangularAnchor(target));
            deviceConnectionWidget.setSourceAnchor(AnchorFactory.createRectangularAnchor(source));
            connectionLayer.addChild(deviceConnectionWidget);
            ic.add(new ProjectConnectionWrapper(project, deviceConnectionWidget));
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
