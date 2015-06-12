package org.abhi.viewer;

import java.io.File;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup.Result;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.Utilities;
import org.openide.util.WeakListeners;

public class FileNode extends FilterNode implements LookupListener {

    Result<String> stringResult = Utilities.actionsGlobalContext().lookupResult(String.class);
    
    public FileNode(Node original, Children children) {
        super(original, new FileKids(original));
        setDisplayName(original.getDisplayName());
        setChildren(new FileKids(original));
        stringResult.addLookupListener(WeakListeners.create(LookupListener.class, this, stringResult));
    }

    @Override
    public void resultChanged(LookupEvent le) {
       if (!stringResult.allInstances().isEmpty()) {
            String dir = stringResult.allInstances().iterator().next();
            try {
                Node or = DataObject.find(FileUtil.toFileObject(new File(dir))).getNodeDelegate();
                setChildren(new FileKids(or));
            } catch (DataObjectNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }

}