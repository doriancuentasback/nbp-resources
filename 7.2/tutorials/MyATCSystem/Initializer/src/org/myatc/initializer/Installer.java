/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myatc.initializer;

import javax.swing.Action;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import org.openide.filesystems.FileUtil;
import org.openide.modules.ModuleInstall;
import org.openide.util.Exceptions;
import org.openide.windows.WindowManager;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        WindowManager.getDefault().invokeWhenUIReady(new Runnable() {
            @Override
            public void run() {
                FileUtil.getConfigObject("Actions/Window/org-netbeans-core-windows-actions-ToggleFullScreenAction.instance", Action.class).actionPerformed(null);
            }
        });
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
            UIManager.put("ViewTabDisplayerUI", "org.myatc.initializer.NoTabsTabDisplayerUI");
            UIManager.put("EditorTabDisplayerUI", "org.myatc.initializer.NoTabsTabDisplayerUI");
        } catch (UnsupportedLookAndFeelException ex) {
            Exceptions.printStackTrace(ex);
        }
//        UIManager.put("NbMainWindow.showCustomBackground", Boolean.TRUE);
//        RootFrame.init();
    }
}
