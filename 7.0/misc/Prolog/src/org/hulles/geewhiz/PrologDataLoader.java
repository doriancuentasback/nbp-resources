/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hulles.geewhiz;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.UniFileLoader;
import org.openide.util.NbBundle;

public class PrologDataLoader extends UniFileLoader {

    public static final String REQUIRED_MIME = "text/x-prolog";
    private static final long serialVersionUID = 1L;

    public PrologDataLoader() {
        super("org.hulles.geewhiz.PrologDataObject");
    }

    @Override
    protected String defaultDisplayName() {
        return NbBundle.getMessage(PrologDataLoader.class, "LBL_Prolog_loader_name");
    }

    @Override
    protected void initialize() {
        super.initialize();
        getExtensions().addMimeType(REQUIRED_MIME);
    }

    protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException {
        return new PrologDataObject(primaryFile, this);
    }

    @Override
    protected String actionsContext() {
        return "Loaders/" + REQUIRED_MIME + "/Actions";
    }
}
