package org.gheditor.visual.palette;

import java.io.IOException;
import javax.swing.Action;
import org.netbeans.spi.palette.PaletteActions;
import org.netbeans.spi.palette.PaletteController;
import org.netbeans.spi.palette.PaletteFactory;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

public class VisualPaletteFactory {
    public static PaletteController getPalette() {
        PaletteController controller = null;
        try {
            controller = PaletteFactory.createPalette(
                    "Items",
                    new PaletteActions() {
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
                    });
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return controller;
    }
}
