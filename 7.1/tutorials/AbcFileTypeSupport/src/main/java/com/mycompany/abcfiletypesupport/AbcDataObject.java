/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abcfiletypesupport;

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

public class AbcDataObject extends MultiDataObject {

    public AbcDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        registerEditor("text/x-abc", true);
    }

    @Override
    protected int associateLookup() {
        return 1;
    }

    @MultiViewElement.Registration(displayName = "#LBL_Abc_EDITOR",
    iconBase = "com/mycompany/abcfiletypesupport/abc16.png",
    mimeType = "text/x-abc",
    persistenceType = TopComponent.PERSISTENCE_ONLY_OPENED,
    preferredID = "Abc",
    position = 1000)
    @Messages("LBL_Abc_EDITOR=Source")
    public static MultiViewEditorElement createEditor(Lookup lkp) {
        return new MultiViewEditorElement(lkp);
    }
}
