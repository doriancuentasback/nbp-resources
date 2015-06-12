/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.lookup.viewer;

import java.awt.BorderLayout;
import javax.swing.JTree;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.explorer.view.BeanTreeView;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;
import org.openide.windows.TopComponent;

@TopComponent.Description( preferredID = "LookupTopComponent",
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "navigator", openAtStartup = true)
@ActionID(category = "Window", id = "org.netbeans.lookup.viewer.LookupTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_LookupAction",
preferredID = "LookupTopComponent")
@NbBundle.Messages({
    "CTL_LookupAction=Lookup",
    "CTL_LookupTopComponent=Objects Currently in the Lookup",
    "HINT_LookupTopComponent=This is a Lookup window"
})
public class LookupViewerTopComponent extends TopComponent implements ExplorerManager.Provider {

    private InstanceContent ic = new InstanceContent();
    private ExplorerManager em = new ExplorerManager();

    public LookupViewerTopComponent() {
        setName(Bundle.CTL_LookupTopComponent());
        setToolTipText(Bundle.HINT_LookupTopComponent());
        setLayout(new BorderLayout());
        BeanTreeView btv = new BeanTreeView();
        btv.setRootVisible(false);
        AbstractNode node = new AbstractNode(Children.create(new LookupViewerChildFactory(), true));
        em.setRootContext(node);
        add(btv, BorderLayout.CENTER);
        associateLookup(new ProxyLookup(ExplorerUtils.createLookup(em, getActionMap()), new AbstractLookup(ic)));
        ic.add(new ExcludeFromLookup());
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return em;
    }
}
