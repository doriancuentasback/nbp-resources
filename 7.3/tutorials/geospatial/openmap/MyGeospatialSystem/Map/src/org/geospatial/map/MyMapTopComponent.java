package org.geospatial.map;

import com.bbn.openmap.LayerHandler;
import com.bbn.openmap.MapBean;
import com.bbn.openmap.MapHandler;
import com.bbn.openmap.MouseDelegator;
import com.bbn.openmap.MultipleSoloMapComponentException;
import com.bbn.openmap.event.MapMouseEvent;
import com.bbn.openmap.event.MapMouseListener;
import com.bbn.openmap.event.SelectMouseMode;
import com.bbn.openmap.gui.BasicMapPanel;
import com.bbn.openmap.gui.MapPanel;
import com.bbn.openmap.layer.shape.ShapeLayer;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.Properties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.StatusDisplayer;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.TopComponent;

@TopComponent.Description(
        preferredID = "MyMapTopComponent",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(
        mode = "editor", 
        openAtStartup = true)
@ActionID(
        category = "Window", 
        id = "org.geospatial.map.MyMapTopComponent")
@ActionReferences({
    @ActionReference(
        path = "Menu/Window", 
        position = 0)
})
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_MyMapAction")
@Messages(
        "CTL_MyMapAction=Open Map")
public class MyMapTopComponent extends TopComponent {

    private final InstanceContent ic = new InstanceContent();

    @Messages("CTL_MyMapName=Map")
    public MyMapTopComponent() {

        setDisplayName(Bundle.CTL_MyMapName());

        setLayout(new BorderLayout());

        try {

            //MapPanel:
            MapPanel mapPanel = new BasicMapPanel();

            //MapHandler:
            MapHandler mapHandler = mapPanel.getMapHandler();
            mapHandler.add(new LayerHandler());
            mapHandler.add(this);

            //MapBean:
            MapBean mapBean = mapPanel.getMapBean();
            mapBean.setScale(120000000f);

            //Selection:
            MouseDelegator mouseDelegator = new MouseDelegator();
            mapHandler.add(mouseDelegator);
            SelectMouseMode selectMouseMode = new SelectMouseMode();
            mapHandler.add(selectMouseMode);
            mouseDelegator.setActive(selectMouseMode);

            //MapMouseListener:
            final MyMapMouseListener myMapMouseListener = new MyMapMouseListener();

            //ShapeLayer:
            ShapeLayer shapeLayer = new ShapeLayer() {
                @Override
                public synchronized MapMouseListener getMapMouseListener() {
                    return myMapMouseListener;
                }
            };

            //Properties:
            Properties shapeLayerProps = new Properties();
            shapeLayerProps.put("lineColor", "000000");
            shapeLayerProps.put("fillColor", "BDDE83");
            shapeLayerProps.put("shapeFile", "org/geospatial/map/dcwpo-browse.shp");
            shapeLayerProps.put("spatialIndex", "org/geospatial/map/dcwpo-browse.ssx");

            //Assign properties to ShapeLayer:
            shapeLayer.setProperties(shapeLayerProps);
            shapeLayer.setVisible(true);

            //Assign ShapeLayer to MapHandler:
            mapHandler.add(shapeLayer);

            add(mapPanel.getMapBean(), BorderLayout.CENTER);

        } catch (MultipleSoloMapComponentException msmce) {
        }

        associateLookup(new AbstractLookup(ic));

    }

    public class MyMapMouseListener implements MapMouseListener {
        @Override
        public String[] getMouseModeServiceList() {
            return new String[]{SelectMouseMode.modeID};
        }
        @Override
        public boolean mouseClicked(MouseEvent e) {
            MapMouseEvent mme = (MapMouseEvent) e;
            //Optionally:
            //LatLonPoint latLonPoint = LatLonPoint.getFloat(mme.getLatLon());
            //UTMPoint utmPoint = UTMPoint.LLtoUTM(latLonPoint);
            //Publish something into Lookup:
            ic.set(Collections.singleton(mme.getLatLon()), null);
            StatusDisplayer.getDefault().setStatusText(mme.getLatLon().toString());
            return true;
        }
        @Override
        public boolean mousePressed(MouseEvent e) {return true;}
        @Override
        public boolean mouseReleased(MouseEvent e) {return true;}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
        @Override
        public boolean mouseDragged(MouseEvent e) {return true;}
        @Override
        public boolean mouseMoved(MouseEvent e) {return true;}
        @Override
        public void mouseMoved() {}
    }

}