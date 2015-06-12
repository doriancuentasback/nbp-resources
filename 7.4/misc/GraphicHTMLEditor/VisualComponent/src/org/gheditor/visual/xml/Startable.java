package org.gheditor.visual.xml;

import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.Exceptions;
import org.openide.windows.OnShowing;

@OnShowing
public class Startable implements Runnable {

    @Override
    public void run() {
//        try {
//            DataObject.find(FileUtil.getConfigFile("Templates/Other/Advert.xml")).getLookup().lookup(OpenCookie.class).open();
//        } catch (DataObjectNotFoundException ex) {
//            Exceptions.printStackTrace(ex);
//        }
    }

}
