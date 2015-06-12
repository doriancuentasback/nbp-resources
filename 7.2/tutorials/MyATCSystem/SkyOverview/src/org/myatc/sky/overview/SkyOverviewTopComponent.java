/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myatc.sky.overview;

import java.awt.BorderLayout;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.view.BeanTreeView;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;

@ConvertAsProperties(
    dtd = "-//org.myatc.sky.overview//SkyOverview//EN",
autostore = false)
@TopComponent.Description(
    preferredID = "SkyOverviewTopComponent",
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "properties", openAtStartup = true)
@ActionID(category = "Window", id = "org.myatc.sky.overview.SkyOverviewTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_SkyOverviewAction",
preferredID = "SkyOverviewTopComponent")
@NbBundle.Messages({
    "CTL_SkyOverviewAction=SkyOverview",
    "CTL_SkyOverviewTopComponent=Sky Overview",
    "HINT_SkyOverviewTopComponent=This is a SkyOverview window"
})
public class SkyOverviewTopComponent extends TopComponent implements ExplorerManager.Provider {

    private ExplorerManager em = new ExplorerManager();

    @Override
    public ExplorerManager getExplorerManager() {
        return em;
    }

    public SkyOverviewTopComponent() {
        initComponents();
        setName(Bundle.CTL_SkyOverviewTopComponent());
        setToolTipText(Bundle.HINT_SkyOverviewTopComponent());
        putClientProperty(TopComponent.PROP_CLOSING_DISABLED, true);
        putClientProperty(TopComponent.PROP_MAXIMIZATION_DISABLED, true);
        putClientProperty(TopComponent.PROP_DRAGGING_DISABLED, true);
        putClientProperty(TopComponent.PROP_UNDOCKING_DISABLED, true);
        putClientProperty(TopComponent.PROP_SLIDING_DISABLED, true);
        setLayout(new BorderLayout());
        BeanTreeView btv = new BeanTreeView();
        Node rootNode = new AbstractNode(Children.create(new HistoryChildFactory(), false));
        rootNode.setDisplayName("History");
        em.setRootContext(rootNode);
        add(btv, BorderLayout.CENTER);
    }

    private void initComponents() {
        // TODO add components to the component here
    }

    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

}