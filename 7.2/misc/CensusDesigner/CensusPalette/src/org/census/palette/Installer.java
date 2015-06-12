/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.census.palette;

import org.openide.modules.ModuleInstall;
import org.openide.windows.WindowManager;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        WindowManager.getDefault().invokeWhenUIReady(new Runnable() {
            @Override
            public void run() {
                CensusDesignerTopComponent cdtc = (CensusDesignerTopComponent) WindowManager.getDefault().findTopComponent("CensusDesignerTopComponent");
                cdtc.requestActive();
            }
        });
    }
    
}
