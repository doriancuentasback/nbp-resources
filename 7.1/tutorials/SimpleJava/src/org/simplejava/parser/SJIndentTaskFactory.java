/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.simplejava.parser;

import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.IndentTask;

public class SJIndentTaskFactory implements IndentTask.Factory {

    @Override
    public IndentTask createTask(Context context) {
        return new SJIndentTask(context);
    }

}
