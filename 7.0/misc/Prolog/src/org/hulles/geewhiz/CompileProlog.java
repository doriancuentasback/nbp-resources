/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hulles.geewhiz;

import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CookieAction;

public final class CompileProlog extends CookieAction {

    protected void performAction(Node[] activatedNodes) {
        DataObject dataObject = activatedNodes[0].getLookup().lookup(DataObject.class);
        
//        PrologCompiler compiler = new PrologCompiler();
        PrologCompiler compiler = new PrologCompiler();
        compiler.compileDataObject(dataObject);
    }

    protected int mode() {
        return CookieAction.MODE_EXACTLY_ONE;
    }

    public String getName() {
        return NbBundle.getMessage(CompileProlog.class, "CTL_CompileProlog");
    }

    protected Class[] cookieClasses() {
        return new Class[]{DataObject.class};
    }

    @Override
    protected String iconResource() {
        return "org/hulles/geewhiz/compile16.png";
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }
}

