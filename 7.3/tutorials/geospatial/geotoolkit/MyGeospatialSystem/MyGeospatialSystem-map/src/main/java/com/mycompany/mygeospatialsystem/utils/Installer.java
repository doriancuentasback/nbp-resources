package com.mycompany.mygeospatialsystem.utils;

import java.io.File;
import javax.imageio.ImageIO;
import javax.sql.DataSource;
import javax.swing.UIManager;
import org.geotoolkit.factory.Hints;
import org.geotoolkit.image.io.plugin.WorldFileImageReader;
import org.geotoolkit.image.io.plugin.WorldFileImageWriter;
import org.geotoolkit.image.jai.Registry;
import org.geotoolkit.internal.sql.DefaultDataSource;
import org.geotoolkit.referencing.CRS;
import org.geotoolkit.referencing.factory.epsg.EpsgInstaller;
import org.opengis.util.FactoryException;
import org.openide.modules.ModuleInstall;
import org.openide.util.Exceptions;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {

        // TODO
        //force netbeans platform classloader to load image readers.
        Registry.setDefaultCodecPreferences();
        WorldFileImageReader.Spi.registerDefaults(null);
        WorldFileImageWriter.Spi.registerDefaults(null);
        ImageIO.scanForPlugins();

        Hints.putSystemDefault(Hints.LENIENT_DATUM_SHIFT, Boolean.TRUE);

        //force netbeans platform classloader to load the derby and postgres driver
        //often use for EPSG databases
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }

        //create a database in user directory
        final String userHome = System.getProperty("user.home");
        //create storage folder
        final File storageFolder = new File(userHome + File.separator + ".puzzle" + File.separator + "EPSG");

        final String url = "jdbc:derby:" + userHome + File.separator + ".puzzle" + File.separator + "EPSG" + File.separator + "EPSG;create=true";
        final DataSource ds = new DefaultDataSource(url);
        Hints.putSystemDefault(Hints.EPSG_DATA_SOURCE, ds);

        //try to create it, won't do anything if already exist
        try {
            createEpsgDB(storageFolder, url);
        } catch (FactoryException ex) {
        }

        //force loading epsg
        try {
            CRS.decode("EPSG:3395");
        } catch (Exception ex) {
        }

        UIManager.put("EditorTabDisplayerUI", "com.mycompany.mygeospatialsystem.utils.NoTabsTabDisplayerUI");

    }

    private static void createEpsgDB(final File folder, final String url) throws FactoryException {
        folder.mkdirs();

        final EpsgInstaller installer = new EpsgInstaller();
        installer.setDatabase(url);

        if (!installer.exists()) {
            installer.call();

            final DataSource ds = new DefaultDataSource(url);
            Hints.putSystemDefault(Hints.EPSG_DATA_SOURCE, ds);
        }
    }
}
