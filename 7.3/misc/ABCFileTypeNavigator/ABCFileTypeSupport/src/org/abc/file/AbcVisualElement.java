package org.abc.file;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.datatransfer.Transferable;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import org.netbeans.api.visual.action.AcceptProvider;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.ConnectorState;
import org.netbeans.api.visual.widget.LabelWidget;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.netbeans.core.spi.multiview.CloseOperationState;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.MultiViewElementCallback;
import org.netbeans.spi.palette.PaletteActions;
import org.netbeans.spi.palette.PaletteFactory;
import org.openide.awt.UndoRedo;
import org.openide.filesystems.FileAlreadyLockedException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.nodes.NodeTransfer;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;
import org.openide.windows.TopComponent;

@MultiViewElement.Registration(
        displayName = "#LBL_Abc_VISUAL",
        iconBase = "org/abc/file/icon.png",
        mimeType = "text/x-abc",
        persistenceType = TopComponent.PERSISTENCE_NEVER,
        preferredID = "AbcVisual",
        position = 500)
@Messages("LBL_Abc_VISUAL=Visual")
public final class AbcVisualElement extends JPanel implements MultiViewElement {

    private AbcDataObject obj;
    private Lookup lookup;
    private JToolBar toolbar = new JToolBar();
    private transient MultiViewElementCallback callback;
    private JScrollPane jsp = new JScrollPane();
    private Scene scene;

    public AbcVisualElement(final Lookup lkp) {
        obj = lkp.lookup(AbcDataObject.class);
        scene = lkp.lookup(Scene.class);
        lookup = new ProxyLookup(lkp, Lookups.singleton(new AbcNavigatorLookupHint()));
        assert obj != null;
        initComponents();
        setLayout(new BorderLayout());
        JComponent component;
        if (scene.getView() == null) {
            component = scene.createView();
        } else {
            component = scene.getView();
        }
        jsp.setViewportView(component);
        add(jsp, BorderLayout.CENTER);
        scene.getActions().addAction(ActionFactory.createAcceptAction(new AcceptProvider() {
            @Override
            public ConnectorState isAcceptable(Widget widget, Point point, Transferable transferable) {
                return ConnectorState.ACCEPT;
            }
            @Override
            public void accept(Widget widget, Point point, Transferable transferable) {
                Node transferredNode = NodeTransfer.node(transferable, NodeTransfer.DND_COPY_OR_MOVE);
                String label = transferredNode.getLookup().lookup(String.class);
                if (label != null) {
                    LabelWidget lw = new LabelWidget(scene, label);
                    lw.setPreferredLocation(point);
                    lkp.lookup(LayerWidget.class).addChild(lw);
                    try {
                        String existingContent = obj.getPrimaryFile().asText();
                        String newContent = existingContent + "\n" + label;
                        OutputStream os = obj.getPrimaryFile().getOutputStream();
                        OutputStreamWriter writer = new OutputStreamWriter(os);
                        writer.write(newContent);
                        writer.flush();
                        writer.close();
                    } catch (FileAlreadyLockedException ex) {
                        Exceptions.printStackTrace(ex);
                    } catch (IOException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
            }
        }));

        InstanceContent ic = new InstanceContent();
        Lookup dynamicLookup = new AbstractLookup(ic);
        lookup = new ProxyLookup(dynamicLookup, getLookup());
        ic.add(PaletteFactory.createPalette(nodeHierarchy, new PaletteActions() {
            @Override
            public Action[] getImportActions() {
                return null;
            }
            @Override
            public Action[] getCustomPaletteActions() {
                return null;
            }
            @Override
            public Action[] getCustomCategoryActions(Lookup category) {
                return null;
            }
            @Override
            public Action[] getCustomItemActions(Lookup item) {
                return null;
            }
            @Override
            public Action getPreferredAction(Lookup item) {
                return null;
            }
        }));

    }

    @Override
    public String getName() {
        return "AbcVisualElement";
    }

    Node nodeHierarchy = new AbstractNode(Children.create(new ChildFactory<String>() {
        @Override
        protected boolean createKeys(List toPopulate) {
            for (int i = 0; i < 10; i++) {
                toPopulate.add("Category " + i);
            }
            return true;
        }
        @Override
        protected Node createNodeForKey(String key) {
            AbstractNode an = new AbstractNode(Children.create(new ChildFactory<String>() {
                @Override
                protected boolean createKeys(List<String> toPopulate) {
                    for (int i = 0; i < 10; i++) {
                        toPopulate.add("Item " + i);
                    }
                    return true;
                }
                @Override
                protected Node createNodeForKey(final String key) {
                    AbstractNode an = new AbstractNode(Children.LEAF, Lookups.singleton(key));
                    an.setDisplayName(key);
                    return an;
                }
            }, true));
            an.setDisplayName(key);
            return an;
        }
    }, true));

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
    public JComponent getVisualRepresentation() {

        return this;
    }

    @Override
    public JComponent getToolbarRepresentation() {
        toolbar.setFloatable(false);
        return toolbar;
    }

    @Override
    public Action[] getActions() {
        return new Action[0];
    }

    @Override
    public Lookup getLookup() {
        return lookup;
    }

    @Override
    public void componentOpened() {
    }

    @Override
    public void componentClosed() {
    }

    @Override
    public void componentShowing() {
        lookup.lookup(InstanceContent.class).add(scene);
    }

    @Override
    public void componentHidden() {
        lookup.lookup(InstanceContent.class).remove(scene);
    }

    @Override
    public void componentActivated() {
    }

    @Override
    public void componentDeactivated() {
    }

    @Override
    public UndoRedo getUndoRedo() {
        return UndoRedo.NONE;
    }

    @Override
    public void setMultiViewCallback(MultiViewElementCallback callback) {
        this.callback = callback;
        callback.getTopComponent().setDisplayName(obj.getPrimaryFile().getNameExt());
    }

    @Override
    public CloseOperationState canCloseElement() {
        return CloseOperationState.STATE_OK;
    }
}
