/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.simplejava.parser;

import javax.swing.text.BadLocationException;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.ReformatTask;
import org.openide.awt.StatusDisplayer;

public class SJReformatTask implements ReformatTask {

    private Context context;

    public SJReformatTask(Context context) {
        this.context = context;
    }

    @Override
    public void reformat() throws BadLocationException {
        StatusDisplayer.getDefault().setStatusText("We will format this now...");
    }

    @Override
    public ExtraLock reformatLock() {
        return null;
    }
    
}
