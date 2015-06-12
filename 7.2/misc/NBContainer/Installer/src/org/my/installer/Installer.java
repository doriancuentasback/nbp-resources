/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.my.installer;

import javax.swing.UIManager;
import org.openide.awt.ToolbarPool;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        UIManager.put("EditorTabDisplayerUI", "org.my.installer.NoTabsTabDisplayerUI");
        ToolbarPool.getDefault().setVisible(false);
        System.setProperty("netbeans.winsys.menu_bar.path", "LookAndFeel/MenuBar.instance");
    }
    
}
