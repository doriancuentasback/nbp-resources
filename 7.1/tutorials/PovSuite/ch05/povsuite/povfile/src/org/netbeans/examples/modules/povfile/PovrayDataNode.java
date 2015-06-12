package org.netbeans.examples.modules.povfile;

import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;
import org.netbeans.examples.api.povray.MainFileProvider;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataNode;
import org.openide.nodes.Children;

public class PovrayDataNode extends DataNode {

    public PovrayDataNode(PovrayDataObject obj) {
        super(obj, Children.LEAF);
    }

    private FileObject getFile() {
        return getDataObject().getPrimaryFile();
    }

    private Object getFromProject(Class clazz) {
        Object result;
        Project p = FileOwnerQuery.getOwner(getFile());
        if (p != null) {
            result = p.getLookup().lookup(clazz);
        } else {
            result = null;
        }
        return result;
    }

    private boolean isMainFile() {
        MainFileProvider prov = (MainFileProvider) getFromProject(MainFileProvider.class);
        boolean result;
        if (prov == null) {
            result = false;
        } else {
            FileObject myFile = getFile();
            result = prov.isMainFile(myFile);
        }
        return result;
    }

    @Override
    public String getHtmlDisplayName() {
        return isMainFile() ? "<b>" + getDisplayName() + "</b>" : null;
    }
    
}
