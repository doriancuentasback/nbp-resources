/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.simple.filesupport;

import javax.swing.Action;
import org.openide.filesystems.FileUtil;
import org.openide.windows.OnShowing;

@OnShowing
public class Installer implements Runnable {

    @Override
    public void run() {
        FileUtil.getConfigObject("Actions/File/org-simple-core-NewFileAction.instance", Action.class).actionPerformed(null);
    }

}
