/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.license;

import org.openide.DialogDisplayer;
import org.openide.LifecycleManager;
import org.openide.NotifyDescriptor;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    @Override
    public void validate() throws IllegalStateException {
        NotifyDescriptor.InputLine inputMessage = new NotifyDescriptor.InputLine(
                "Enter License Key:",
                "License Key",
                NotifyDescriptor.OK_CANCEL_OPTION,
                NotifyDescriptor.QUESTION_MESSAGE);
        Object result = DialogDisplayer.getDefault().notify(inputMessage);
        if (NotifyDescriptor.YES_OPTION.equals(result)) {
            String enteredLicenseKey = inputMessage.getInputText();
            if (!enteredLicenseKey.equals("123456")) {
                throw new IllegalStateException(
                        "License Key was incorrect. "
                        + "Editor and Viewer will not be installed.");
            }
        } else {
            throw new IllegalStateException(
                    "License Key was not entered. "
                    + "Editor and Viewer will not be installed.");
        }
    }

}
