/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.javasourcefilepalette;

import java.io.IOException;
import javax.swing.Action;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.palette.DragAndDropHandler;
import org.netbeans.spi.palette.PaletteActions;
import org.netbeans.spi.palette.PaletteController;
import org.netbeans.spi.palette.PaletteFactory;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.datatransfer.ExTransferable;

public class JavaSourceFileLayerPaletteFactory {

    //Name of the folder in the layer.xml file 
    //that is the root of the palette:
    public static final String JAVA_PALETTE_FOLDER = "JavaPalette";
    private static PaletteController palette = null;

    @MimeRegistration(mimeType = "text/x-java", service = PaletteController.class)
    public static PaletteController createPalette() {
        try {
            if (null == palette) {
                palette = PaletteFactory.createPalette(
                        JAVA_PALETTE_FOLDER,
                        new MyActions(),
                        null,
                        new MyDragAndDropHandler());
            }
            return palette;
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return null;
    }

    private static class MyActions extends PaletteActions {

        //Add new buttons to the Palette Manager here:
        @Override
        public Action[] getImportActions() {
            return null;
        }

        //Add new contextual menu items to the palette here:
        @Override
        public Action[] getCustomPaletteActions() {
            return null;
        }

        //Add new contextual menu items for palette categories here:
        @Override
        public Action[] getCustomCategoryActions(Lookup arg0) {
            return null;
        }

        //Add new contextual menu items for palette items here:
        @Override
        public Action[] getCustomItemActions(Lookup arg0) {
            return null;
        }

        //Define the double-click action here:
        @Override
        public Action getPreferredAction(Lookup arg0) {
            return null;
        }
        
    }

    //Definition of the DragAndDropHandler:
    private static class MyDragAndDropHandler extends DragAndDropHandler {

        MyDragAndDropHandler() {
            super(true);
        }

        //Maybe you don't like the default 'add to palette' 
        //implementation,
        //so you could create your own here:
        @Override
        public void customize(ExTransferable t, Lookup item) {
        }
    }
    
}
