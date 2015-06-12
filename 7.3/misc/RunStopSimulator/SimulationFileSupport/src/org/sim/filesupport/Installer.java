/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sim.filesupport;

import javax.swing.Action;
import org.openide.filesystems.FileUtil;
import org.openide.windows.OnShowing;

@OnShowing
public class Installer implements Runnable {

    @Override
    public void run() {
        FileUtil.getConfigObject("Actions/File/org-sim-filesupport-NewFileAction.instance", Action.class).actionPerformed(null);
    }
}
