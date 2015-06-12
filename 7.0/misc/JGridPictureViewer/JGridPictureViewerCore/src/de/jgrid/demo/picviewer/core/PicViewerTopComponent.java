/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jgrid.demo.picviewer.core;

import de.jgrid.JGrid;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.IntrospectionException;
import java.beans.PropertyVetoException;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.lookup.Lookups;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(dtd = "-//de.jgrid.demo.picviewer.core//PicViewer//EN",
autostore = false)
@TopComponent.Description(preferredID = "PicViewerTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "de.jgrid.demo.picviewer.core.PicViewerTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(displayName = "#CTL_PicViewerAction",
preferredID = "PicViewerTopComponent")
public final class PicViewerTopComponent extends TopComponent implements ExplorerManager.Provider {

    private ExplorerManager em = new ExplorerManager();

    public PicViewerTopComponent() {
        initComponents();
        setName(NbBundle.getMessage(PicViewerTopComponent.class, "CTL_PicViewerTopComponent"));
        setToolTipText(NbBundle.getMessage(PicViewerTopComponent.class, "HINT_PicViewerTopComponent"));

        setLayout(new BorderLayout());


    }

    private class PicChildFactory extends ChildFactory<PicViewerObject> {
        @Override
        protected boolean createKeys(final List<PicViewerObject> list) {
            list.add(generateViewObject("beach", 1));
            list.add(generateViewObject("desert", 2));
            list.add(generateViewObject("water", 3));
            list.add(generateViewObject("farm", 4));
            list.add(generateViewObject("nature", 5));
            list.add(generateViewObject("travel", 6));
            return true;
        }

        private PicViewerObject generateViewObject(String folder, int id) {
            PicViewerObject obj = new PicViewerObject();
            for (int i = 1; i <= 10; i++) {
                try {
                    obj.addImage(ImageIO.read(new URL(
                            "http://guigarage.com/downloads/viewerpics/" + folder + "/"
                            + i + ".png")));
                    obj.setId(id);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            return obj;
        }

        @Override
        protected Node createNodeForKey(PicViewerObject key) {
            BeanNode node = null;
            try {
                node = new PicNode(key);
            } catch (IntrospectionException ex) {
                Exceptions.printStackTrace(ex);
            }
            return node;
        }
        
    }

    private class PicNode extends BeanNode {
        public PicNode(PicViewerObject key) throws IntrospectionException {
            super(key, Children.LEAF, Lookups.singleton(key));
        }
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return em;
    }

    public class JGridView extends JScrollPane {
        @Override
        public void addNotify() {
            super.addNotify();
            final ExplorerManager em = ExplorerManager.find(this);
            if (em != null) {
                final JGrid grid = new JGrid();
                Node root = em.getRootContext();
                final Node[] nodes = root.getChildren().getNodes();
                final PicViewerObject[] pics = new PicViewerObject[nodes.length];
                for (int i = 0; i < nodes.length; i++) {
                    Node node = nodes[i];
                    pics[i] = node.getLookup().lookup(PicViewerObject.class);
                }
                grid.getCellRendererManager().setDefaultRenderer(new PicViewerRenderer());
                grid.setModel(new DefaultListModel() {

                    @Override
                    public int getSize() {
                        return pics.length;
                    }

                    @Override
                    public Object getElementAt(int i) {
                        return pics[i];
                    }
                });
                grid.setFixedCellDimension(160);
                grid.addMouseMotionListener(new MouseAdapter() {

                    int lastIndex = -1;

                    @Override
                    public void mouseMoved(MouseEvent e) {
                        if (lastIndex >= 0) {
                            Object o = grid.getModel().getElementAt(lastIndex);
                            if (o instanceof PicViewerObject) {
                                Rectangle r = grid.getCellBounds(lastIndex);
                                if (r != null && !r.contains(e.getPoint())) {
                                    ((PicViewerObject) o).setMarker(false);
                                    grid.repaint(r);
                                }
                            }
                        }
                        int index = grid.getCellAt(e.getPoint());
                        if (index >= 0) {
                            Object o = grid.getModel().getElementAt(index);
                            if (o instanceof PicViewerObject) {
                                Rectangle r = grid.getCellBounds(index);
                                if (r != null) {
                                    ((PicViewerObject) o).setFraction(((float) e.getPoint().x - (float) r.x)
                                            / (float) r.width);
                                    ((PicViewerObject) o).setMarker(true);
                                    lastIndex = index;
                                    grid.repaint(r);
                                }
                            }
                        }

                    }
                });
                grid.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        //Somehow compare the selected item
                        //with the list of books and find a matching book:
                        int selectedIndex = grid.getSelectedIndex();
                        for (int i = 0; i < nodes.length; i++) {
                            int picId = pics[i].getId();
                            if (selectedIndex == picId) {
                                try {
                                    em.setSelectedNodes(new Node[]{nodes[i]});
                                } catch (PropertyVetoException ex) {
                                    Exceptions.printStackTrace(ex);
                                }
                            }
                        }
                    }
                });
                setViewportView(grid);
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        Node root = new AbstractNode(Children.create(new PicChildFactory(), false));
        root.setDisplayName("Books");
        em.setRootContext(root);
        JScrollPane scrollPane = new JGridView();
        add(scrollPane, BorderLayout.CENTER);
        associateLookup(ExplorerUtils.createLookup(em, getActionMap()));
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
