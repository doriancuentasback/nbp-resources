package org.geotools.mygeospatialsystem;

import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.map.DefaultMapContext;
import org.geotools.map.FeatureLayer;
import org.geotools.map.Layer;
import org.geotools.map.MapContext;
import org.geotools.renderer.GTRenderer;
import org.geotools.renderer.lite.StreamingRenderer;
import org.geotools.styling.SLD;
import org.geotools.styling.Style;
import org.geotools.swing.JMapPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.modules.InstalledFileLocator;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
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

    @Messages("CTL_MyMapName=Map")
    public MyMapTopComponent() {
        try {
            setDisplayName(Bundle.CTL_MyMapName());
            File databaseFile = InstalledFileLocator.getDefault().locate("resources/ne_10m_admin_0_countries.shp", "MyGeospatialSystem-map", false);
            FileObject databaseFO = FileUtil.toFileObject(databaseFile);
            FileDataStore store = FileDataStoreFinder.getDataStore(FileUtil.toFile(databaseFO));
            SimpleFeatureSource featureSource = store.getFeatureSource();
            // Create a map context and add our shapefile to it:
            MapContext map = new DefaultMapContext();
            map.setTitle("Quickstart");
            map.addLayer(featureSource, null);
            Style style = SLD.createSimpleStyle(featureSource.getSchema());
            Layer layer = new FeatureLayer(featureSource, style);
            map.addLayer(layer);
            // Now display the map
            // Create a renderer which will draw the features:
            GTRenderer renderer = new StreamingRenderer();
            JMapPane pane = new JMapPane(map, null, renderer);
            setLayout(new BorderLayout());
            add(pane, BorderLayout.CENTER);
            putClientProperty("print.printable", true);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
