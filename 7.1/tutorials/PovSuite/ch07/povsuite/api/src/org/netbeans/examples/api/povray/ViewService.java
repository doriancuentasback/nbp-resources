package org.netbeans.examples.api.povray;

import org.openide.filesystems.FileObject;

public interface ViewService {

    boolean isRendered(FileObject file);

    boolean isUpToDate(FileObject file);

    void view(FileObject file);
    
}
