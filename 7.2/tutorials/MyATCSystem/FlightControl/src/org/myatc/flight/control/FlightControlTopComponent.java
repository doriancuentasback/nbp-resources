/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myatc.flight.control;

import com.bbn.openmap.proj.coords.LatLonPoint;
import java.awt.BorderLayout;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.view.BeanTreeView;
import org.openide.filesystems.FileUtil;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup.Result;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

@ConvertAsProperties(
    dtd = "-//org.myatc.flight.control//FlightControl//EN",
autostore = false)
@TopComponent.Description(
    preferredID = "FlightControlTopComponent",
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "output", openAtStartup = true)
@ActionID(category = "Window", id = "org.myatc.flight.control.FlightControlTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_FlightControlAction",
preferredID = "FlightControlTopComponent")
@NbBundle.Messages({
    "CTL_FlightControlAction=FlightControl",
    "CTL_FlightControlTopComponent=Flight Control",
    "HINT_FlightControlTopComponent=This is a FlightControl window"
})
public class FlightControlTopComponent extends TopComponent implements ExplorerManager.Provider {

    private ExplorerManager em = new ExplorerManager();

    @Override
    public ExplorerManager getExplorerManager() {
        return em;
    }

    public FlightControlTopComponent() {
        setName(Bundle.CTL_FlightControlTopComponent());
        setToolTipText(Bundle.HINT_FlightControlTopComponent());
        putClientProperty(TopComponent.PROP_CLOSING_DISABLED, true);
        putClientProperty(TopComponent.PROP_MAXIMIZATION_DISABLED, true);
        putClientProperty(TopComponent.PROP_DRAGGING_DISABLED, true);
        putClientProperty(TopComponent.PROP_UNDOCKING_DISABLED, true);
        putClientProperty(TopComponent.PROP_SLIDING_DISABLED, true);
        setLayout(new BorderLayout());
        BeanTreeView btv = new BeanTreeView();
        Node rootNode = new AbstractNode(Children.create(new CurrentChildFactory(em), false));
        rootNode.setDisplayName("Current Selection");
        em.setRootContext(rootNode);
        add(btv, BorderLayout.CENTER);
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
