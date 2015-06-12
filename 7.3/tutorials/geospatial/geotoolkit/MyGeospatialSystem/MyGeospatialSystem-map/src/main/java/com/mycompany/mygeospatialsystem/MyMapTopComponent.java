package com.mycompany.mygeospatialsystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.BoxLayout;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import javax.swing.JPanel;
import org.geotoolkit.data.DataStore;
import org.geotoolkit.data.FeatureCollection;
import org.geotoolkit.data.query.Query;
import org.geotoolkit.data.query.QueryBuilder;
import org.geotoolkit.data.shapefile.ShapefileDataStore;
import org.geotoolkit.gui.swing.go2.JMap2D;
import org.geotoolkit.gui.swing.go2.control.JCoordinateBar;
import org.geotoolkit.gui.swing.go2.control.JEditionBar;
import org.geotoolkit.gui.swing.go2.control.JNavigationBar;
import org.geotoolkit.map.MapBuilder;
import org.geotoolkit.map.MapContext;
import org.geotoolkit.storage.DataStoreException;
import org.geotoolkit.util.RandomStyleFactory;
import org.opengis.feature.simple.SimpleFeature;
import org.openide.modules.InstalledFileLocator;
import org.openide.util.Exceptions;
import org.openide.util.Utilities;

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
public final class MyMapTopComponent extends TopComponent {

    @Messages("CTL_MyMapName=Map")
    public MyMapTopComponent() {
        setDisplayName(Bundle.CTL_MyMapName());
        try {
            File databaseFile = InstalledFileLocator.getDefault().locate("resources/usa_counties.shp", "org-geotools-MyGeospatialSystem-map", false);
            final DataStore store = new ShapefileDataStore(Utilities.toURL(databaseFile));
            final MapContext ctx = MapBuilder.createContext();
            final Query query;
            try {
                query = QueryBuilder.all(store.getNames().iterator().next());
                final FeatureCollection<SimpleFeature> col = store.createSession(true).getFeatureCollection(query);
                ctx.layers().add(MapBuilder.createFeatureLayer(col, RandomStyleFactory.createRandomVectorStyle(col)));
                JMap2D map = new JMap2D();
                map.getContainer().setContext(ctx);
                map.setBackground(new Color(0, 150, 150));
                setLayout(new BorderLayout());
                add(createGUI(map), BorderLayout.CENTER);
            } catch (DataStoreException ex) {
                Exceptions.printStackTrace(ex);
            }
        } catch (DataStoreException ex) {
            Exceptions.printStackTrace(ex);
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private JPanel createGUI(JMap2D map) {
        JPanel toolPanel = new JPanel();
        toolPanel.setLayout(new BoxLayout(toolPanel, BoxLayout.X_AXIS));
        JNavigationBar jNavigationBar = new JNavigationBar(map);
        jNavigationBar.setFloatable(false);
        toolPanel.add(jNavigationBar);
        JEditionBar jEditionBar = new JEditionBar(map);
        jEditionBar.setFloatable(false);
        toolPanel.add(jEditionBar);
        JPanel pJPanel = new JPanel(new BorderLayout());
        pJPanel.add(BorderLayout.NORTH, toolPanel);
        pJPanel.add(BorderLayout.CENTER, map);
        JCoordinateBar jCoordinateBar = new JCoordinateBar(map);
        jCoordinateBar.setFloatable(false);
        pJPanel.add(BorderLayout.SOUTH, jCoordinateBar);
        return pJPanel;
    }
    
    private org.geotoolkit.gui.swing.contexttree.JContextTree guiTree;
    
}