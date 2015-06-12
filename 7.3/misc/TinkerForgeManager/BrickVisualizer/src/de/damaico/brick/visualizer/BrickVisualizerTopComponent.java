/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.damaico.brick.visualizer;

import com.tinkerforge.Device;
import de.damaico.brick.api.ConnectionAnalyzerCapability;
import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.datatransfer.Transferable;
import java.beans.BeanInfo;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import org.netbeans.api.settings.ConvertAsProperties;
import org.netbeans.api.visual.action.AcceptProvider;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.ConnectProvider;
import org.netbeans.api.visual.action.ConnectorState;
import org.netbeans.api.visual.action.SelectProvider;
import org.netbeans.api.visual.anchor.AnchorFactory;
import org.netbeans.api.visual.anchor.AnchorShape;
import org.netbeans.api.visual.vmd.VMDNodeWidget;
import org.netbeans.api.visual.vmd.VMDPinWidget;
import org.netbeans.api.visual.widget.ConnectionWidget;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.StatusDisplayer;
import org.openide.nodes.Node;
import org.openide.nodes.NodeTransfer;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.TopComponent;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
    dtd = "-//de.damaico.brick.visualizer//BrickVisualizer//EN",
autostore = false)
@TopComponent.Description(
    preferredID = "BrickVisualizerTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "output", openAtStartup = true)
@ActionID(category = "Window", id = "de.damaico.brick.visualizer.BrickVisualizerTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_BrickVisualizerAction",
preferredID = "BrickVisualizerTopComponent")
@Messages(
{
    "CTL_BrickVisualizerAction=BrickVisualizer",
    "CTL_BrickVisualizerTopComponent=BrickVisualizer Window",
    "HINT_BrickVisualizerTopComponent=This is a BrickVisualizer window"
})
public final class BrickVisualizerTopComponent extends TopComponent
{
        final Scene scene = new Scene();
        final LayerWidget baseLayer = new LayerWidget(scene);
        final LayerWidget connectionLayer = new LayerWidget(scene);

    public BrickVisualizerTopComponent()
    {
        initComponents();
        setName(Bundle.CTL_BrickVisualizerTopComponent());
        setToolTipText(Bundle.HINT_BrickVisualizerTopComponent());
        putClientProperty(TopComponent.PROP_KEEP_PREFERRED_SIZE_WHEN_SLIDED_IN, Boolean.TRUE);
   
        final Set<Device> uniqueDevices = new HashSet<Device>();

        scene.getActions().addAction(ActionFactory.createAcceptAction(new AcceptProvider()
        {
            @Override
            public ConnectorState isAcceptable(Widget widget, Point point, Transferable transferable)
            {
                Node node = NodeTransfer.node(transferable, NodeTransfer.DND_COPY_OR_MOVE);
                if (node != null)
                {
                    Device device = node.getLookup().lookup(Device.class);
                    if (!uniqueDevices.contains(device))
                    {
                        StatusDisplayer.getDefault().setStatusText("New Object " + device.getClass().getSimpleName());
                        return ConnectorState.ACCEPT;
                    }
                }

                return ConnectorState.REJECT_AND_STOP;
            }

            @Override
            public void accept(Widget widget, Point point, Transferable transferable)
            {
                Node node = NodeTransfer.node(transferable, NodeTransfer.DND_COPY_OR_MOVE);
                if (node != null)
                {
                    Device device = node.getLookup().lookup(Device.class);
                    if (device != null)
                    {
                        uniqueDevices.add(device);
                        VMDNodeWidget simpleWidget;
                        Calendar cal = Calendar.getInstance();
                        simpleWidget = new VMDNodeWidget(scene);
                        simpleWidget.setNodeName(node.getName() + "=" + cal.getTime().toString());
                        simpleWidget.setToolTipText("TT " + node.getName());
                        simpleWidget.setPreferredLocation(point);
                        simpleWidget.setNodeImage(node.getIcon(BeanInfo.ICON_COLOR_16x16));
                        simpleWidget.getActions().addAction(ActionFactory.createExtendedConnectAction(connectionLayer, new DeviceConnectProvider()));
                        simpleWidget.getActions().addAction(ActionFactory.createMoveAction());
                        simpleWidget.getActions().addAction(ActionFactory.createSelectAction(new SelectProvider() {

                            @Override
                            public boolean isAimingAllowed(Widget widget, Point localLocation, boolean invertSelection)
                            {
                                return true;
                            }

                            @Override
                            public boolean isSelectionAllowed(Widget widget, Point localLocation, boolean invertSelection)
                            {
                                return true;
                            }

                            @Override
                            public void select(Widget widget, Point localLocation, boolean invertSelection)
                            {
                                JOptionPane.showMessageDialog(null, localLocation);
                            }
                        }));
                        baseLayer.addChild(simpleWidget);

                        VMDPinWidget pin1 = new VMDPinWidget(scene);
                        pin1.setPinName("Pin1");
                        simpleWidget.addChild(pin1);

                        VMDPinWidget pin2 = new VMDPinWidget(scene);
                        pin2.setPinName("Pin2");
                        simpleWidget.addChild(pin2);

                        simpleWidget.setCheckClipping(true);

//                        LabelWidget helloWorldLabel = new LabelWidget(scene, "Position:" + brickletRotaryPoti.getClass().getSimpleName());
//                        helloWorldLabel.setPreferredLocation(point);
//                        helloWorldLabel.getActions().addAction(ActionFactory.createMoveAction());
//                        baseLayer.addChild(helloWorldLabel);

                    }
                }
            }
        }));

        

        scene.addChild(baseLayer);
        scene.addChild(connectionLayer);
        
        jScrollPane1.setViewportView(scene.createView());
        
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(scene.createSatelliteView(), BorderLayout.CENTER);
        
        associateLookup(new AbstractLookup(ic));
    }
    
    InstanceContent ic = new InstanceContent();

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of
     * this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentOpened()
    {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed()
    {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p)
    {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p)
    {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
    
    
    private class DeviceConnectProvider implements ConnectProvider
    {
        

        @Override
        public boolean isSourceWidget(Widget sourceWidget)
        {
            return sourceWidget instanceof VMDNodeWidget;
        }

        @Override
        public ConnectorState isTargetWidget(Widget sourceWidget, Widget targetWidget)
        {
            return sourceWidget!=targetWidget && targetWidget instanceof VMDNodeWidget ? ConnectorState.ACCEPT:ConnectorState.REJECT;
        }

        @Override
        public boolean hasCustomTargetWidgetResolver(Scene scene)
        {
            return false;
        }

        @Override
        public Widget resolveTargetWidget(Scene scene, Point sceneLocation)
        {
            return null;
        }

        @Override
        public void createConnection(Widget sourceWidget, Widget targetWidget)
        {
            ConnectionWidget deviceConnectionWidget = new ConnectionWidget(scene);
            deviceConnectionWidget.setTargetAnchorShape(AnchorShape.TRIANGLE_FILLED);
            deviceConnectionWidget.setTargetAnchor(AnchorFactory.createRectangularAnchor(targetWidget, true));
            deviceConnectionWidget.setSourceAnchorShape(AnchorShape.TRIANGLE_OUT);
            deviceConnectionWidget.setSourceAnchor(AnchorFactory.createCircularAnchor(sourceWidget, 10));
            
            connectionLayer.addChild(deviceConnectionWidget);
            
            ic.add(new BrickConnectionAnalyzerCapability(deviceConnectionWidget));
        }
        
    }
    
    private class BrickConnectionAnalyzerCapability implements ConnectionAnalyzerCapability
    {
        private final ConnectionWidget deviceConnectionWidget;

        public BrickConnectionAnalyzerCapability(ConnectionWidget deviceConnectionWidget)
        {
            this.deviceConnectionWidget = deviceConnectionWidget;
        }

        @Override
        public ConnectionWidget analyze()
        {
            ic.remove(this);
            return deviceConnectionWidget;
        }
        
    }
    
    
    
}
