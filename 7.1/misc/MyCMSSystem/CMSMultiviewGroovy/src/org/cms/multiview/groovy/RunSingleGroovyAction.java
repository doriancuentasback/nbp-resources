/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cms.multiview.groovy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.cookies.EditorCookie;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

@ActionID(category = "Groovy",
id = "org.cms.multiview.groovy.RunSingleGroovyAction")
@ActionRegistration(displayName = "#CTL_RunSingleGroovyAction")
@ActionReferences({
    @ActionReference(path = "Editors/text/x-groovy/Popup", position = 3333)
})
@NbBundle.Messages("CTL_RunSingleGroovyAction=Run Single")
public final class RunSingleGroovyAction implements ActionListener {

    private final Node context;

    public RunSingleGroovyAction(Node context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("groovy");
        try {
            InputOutput inout = IOProvider.getDefault().getIO("Result", true);
            inout.select();
            StyledDocument doc = context.getLookup().lookup(EditorCookie.class).getDocument();
            inout.getOut().print(engine.eval(doc.getText(0, doc.getLength())));
        } catch (BadLocationException ex) {
            Exceptions.printStackTrace(ex);
        } catch (ScriptException ex) {
            Exceptions.printStackTrace(ex);
        }

    }
    
}
