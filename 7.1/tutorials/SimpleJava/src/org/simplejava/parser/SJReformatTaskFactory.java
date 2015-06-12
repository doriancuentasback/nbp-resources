/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.simplejava.parser;

import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

public class SJReformatTaskFactory implements ReformatTask.Factory {

    @Override
    public ReformatTask createTask(Context context) {
        return new SJReformatTask(context);
    }
    
}

