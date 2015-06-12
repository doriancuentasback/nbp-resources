package org.netbeans.examples.api.povray;

import org.openide.filesystems.FileObject;

public abstract class MainFileProvider {

    public abstract FileObject getMainFile();

    public abstract void setMainFile (FileObject file);

    public boolean isMainFile (FileObject file) {
        return file.equals(getMainFile());
    }

}