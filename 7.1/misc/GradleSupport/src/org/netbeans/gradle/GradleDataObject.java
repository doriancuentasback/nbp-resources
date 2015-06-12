/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.gradle;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.nodes.Children;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;

public class GradleDataObject extends MultiDataObject {

    public GradleDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        CookieSet cookies = getCookieSet();
        cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
        getLookup().lookup(DataEditorSupport.class).setMIMEType("text/x-groovy");
    }

    @Override
    protected Node createNodeDelegate() {
        return new DataNode(this, Children.create(new TaskChildFactory(this), true), getLookup());
    }

    @Override
    public Lookup getLookup() {
        return getCookieSet().getLookup();
    }
    
}
