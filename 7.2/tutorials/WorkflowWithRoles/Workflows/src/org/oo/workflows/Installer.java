/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oo.workflows;

import org.openide.modules.ModuleInstall;
import org.openide.util.NbPreferences;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
import org.openide.windows.WindowSystemEvent;
import org.openide.windows.WindowSystemListener;

public class Installer extends ModuleInstall implements WindowSystemListener {

    @Override
    public void restored() {
        WindowManager.getDefault().addWindowSystemListener(this);
    }

    @Override
    public void beforeLoad(WindowSystemEvent event) {
        String role = NbPreferences.forModule(TopComponent.class).get("currentRole", "production");
        WindowManager.getDefault().setRole(role);
        WindowManager.getDefault().removeWindowSystemListener(this);
    }

    @Override
    public void afterLoad(WindowSystemEvent event) {
    }

    @Override
    public void beforeSave(WindowSystemEvent event) {
    }

    @Override
    public void afterSave(WindowSystemEvent event) {
    }
    
}
