/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ceylon.filetype;

import java.io.IOException;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.text.MultiViewEditorElement;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

public class CeylonDataObject extends MultiDataObject {

    public CeylonDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
	super(pf, loader);
	registerEditor("text/x-ceylon", true);
    }

    @Override
    protected int associateLookup() {
	return 1;
    }

    @MultiViewElement.Registration(displayName = "#LBL_Ceylon_EDITOR",
    iconBase = "org/ceylon/filetype/ceylon_icon.png",
    mimeType = "text/x-ceylon",
    persistenceType = TopComponent.PERSISTENCE_ONLY_OPENED,
    preferredID = "Ceylon",
    position = 1000)
    @Messages("LBL_Ceylon_EDITOR=Source")
    public static MultiViewEditorElement createEditor(Lookup lkp) {
	return new MultiViewEditorElement(lkp);
    }
    
}
