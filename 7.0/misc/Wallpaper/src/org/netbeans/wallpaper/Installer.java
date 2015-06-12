/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.wallpaper;

import javax.swing.UIManager;
import org.openide.modules.ModuleInstall;

/**
 * Manages a module's lifecycle. Remember that an installer is optional and
 * often not needed at all.
 */
public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        UIManager.put("NbMainWindow.showCustomBackground", Boolean.TRUE);
        RootFrame.init();
    }
}
