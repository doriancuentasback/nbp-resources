/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.myeditor;

import java.beans.PropertyEditorManager;
import java.util.Date;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        PropertyEditorManager.registerEditor(Date.class, DatePropertyEditor.class);
    }
    
}
