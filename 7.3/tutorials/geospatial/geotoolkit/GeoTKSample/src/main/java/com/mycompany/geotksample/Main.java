package com.mycompany.geotksample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.net.MalformedURLException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.geotoolkit.data.DataStore;
import org.geotoolkit.data.FeatureCollection;
import org.geotoolkit.data.query.Query;
import org.geotoolkit.data.query.QueryBuilder;
import org.geotoolkit.data.shapefile.ShapefileDataStore;
import org.geotoolkit.factory.Hints;
import org.geotoolkit.gui.swing.go2.JMap2D;
import org.geotoolkit.gui.swing.go2.control.JNavigationBar;
import org.geotoolkit.lang.Setup;
import org.geotoolkit.map.MapBuilder;
import org.geotoolkit.map.MapContext;
import org.geotoolkit.storage.DataStoreException;
import org.geotoolkit.util.RandomStyleFactory;
import org.opengis.feature.simple.SimpleFeature;

public class Main {

    static {
        //allow reprojection even if grid or bursawolf parameters are missing
        Hints.putSystemDefault(Hints.LENIENT_DATUM_SHIFT, Boolean.TRUE);
        //global initialization
        Setup.initialize(null);
        //force loading all image readers/writers
        ImageIO.scanForPlugins();
    }

    public static void main(String[] args) throws MalformedURLException, DataStoreException {
        final DataStore store = new ShapefileDataStore(Main.class.getResource("bc_border.shp"));
        final MapContext ctx = MapBuilder.createContext();
        final Query query = QueryBuilder.all(store.getNames().iterator().next());
        final FeatureCollection<SimpleFeature> col = store.createSession(true).getFeatureCollection(query);
        ctx.layers().add(MapBuilder.createFeatureLayer(col, RandomStyleFactory.createRandomVectorStyle(col)));
        JMap2D map = new JMap2D();
        map.getContainer().setContext(ctx);
        map.setBackground(new Color(0, 150, 150));
        JFrame pJFrame = createGUI(map);
        pJFrame.setVisible(true);
    }

    public static JFrame createGUI(JMap2D map) {
        JFrame frm = new JFrame("My Borders");
        //Add elements
        JPanel pJPanel = new JPanel(new BorderLayout());
        JNavigationBar navBar = new JNavigationBar(map);
        pJPanel.add(BorderLayout.NORTH, navBar);
        pJPanel.add(BorderLayout.CENTER, map);
        //Create
        frm.setContentPane(pJPanel);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(new Dimension(500, 500));
        frm.setVisible(true);
        return frm;
    }
    
}
