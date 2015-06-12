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

public final class ShowDiagram extends CookieAction {

    protected void performAction(Node[] activatedNodes) {
        DataObject dataObject;
        VPrologTopComponent win;
        
        dataObject = activatedNodes[0].getLookup().lookup(DataObject.class);

        win = VPrologTopComponent.findInstance();
        win.open();
        win.requestActive();
        win.loadProlog(dataObject);
    }

    protected int mode() {
        return CookieAction.MODE_EXACTLY_ONE;
    }

    public String getName() {
        return NbBundle.getMessage(ShowDiagram.class, "CTL_ShowDiagram");
    }

    protected Class[] cookieClasses() {
        return new Class[]{DataObject.class};
    }

    @Override
    protected String iconResource() {
        return "org/hulles/geewhiz/vps.gif";
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }
}

