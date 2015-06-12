package org.netbeans.examples.modules.povproject;

import java.awt.Toolkit;
import java.io.File;
import org.netbeans.examples.api.povray.ViewService;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.Exceptions;

public class ViewServiceImpl implements ViewService {

    private final PovrayProject proj;

    public ViewServiceImpl(PovrayProject proj) {
        this.proj = proj;
    }

    @Override
    public boolean isRendered(FileObject file) {
        return getImageFor(file) != null;
    }

    @Override
    public boolean isUpToDate(FileObject scene) {
        FileObject image = getImageFor(scene);
        boolean result;
        if (image != null) {
            result = scene.lastModified().before(image.lastModified());
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public void view(FileObject scene) {
        FileObject image = getImageFor(scene);
        if (image != null) {
            DataObject dob;
            try {
                dob = DataObject.find(image);
                OpenCookie open = dob.getNodeDelegate().getLookup().lookup(OpenCookie.class);
                if (open != null) {
                    open.open();
                    return;
                }
            } catch (DataObjectNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        Toolkit.getDefaultToolkit().beep();
    }

    private FileObject getImageFor(FileObject scene) {
        FileObject imagesDir = proj.getImagesFolder(false);
        FileObject result;
        if (imagesDir != null) {
            File sceneFile = FileUtil.toFile(scene);
            if (sceneFile != null) {
                String imageName = Povray.stripExtension(sceneFile) + ".png";
                //Will be null if it doesn't exist:
                result = imagesDir.getFileObject(imageName);
            } else {
                result = null;
            }
        } else {
            //No images dir, there can't be an image
            result = null;
        }
        return result;
    }

}
