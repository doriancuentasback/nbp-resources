/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.countries;

import javax.swing.UIManager;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        UIManager.put("EditorTabDisplayerUI", "org.netbeans.modules.countries.NoTabsTabDisplayerUI");
    }
    
}
