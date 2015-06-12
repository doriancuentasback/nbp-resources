package org.gheditor.visual;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import org.gheditor.visual.palette.VisualPaletteFactory;
import org.netbeans.core.spi.multiview.CloseOperationState;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.MultiViewElementCallback;
import org.openide.awt.UndoRedo;
import org.openide.filesystems.FileObject;
import org.openide.util.Lookup;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.ProxyLookup;
import org.openide.windows.TopComponent;

@MultiViewElement.Registration(displayName = "Visual",
        mimeType = {"text/x-marketing+xml"},
        persistenceType = TopComponent.PERSISTENCE_NEVER,
        preferredID = "VisualMultiViewElement",
        position = 1)
public class VisualMultiViewElement extends JPanel implements MultiViewElement {

    private final FileObject obj;
    private final JToolBar tb = new JToolBar();
    private final InstanceContent ic = new InstanceContent();
    private final Lookup dynamicLookup;

    public VisualMultiViewElement(Lookup lkp) {
        this.dynamicLookup = new AbstractLookup(ic);
        this.obj = lkp.lookup(FileObject.class);
        assert obj != null;
        ic.add(VisualPaletteFactory.getPalette());
        ic.add(obj);
    }

    @Override
    public JComponent getVisualRepresentation() {
        return new VisualMultiViewScene(obj).createView();
    }

    @Override
    public JComponent getToolbarRepresentation() {
        tb.setFloatable(false);
        return tb;
    }

    @Override
    public Action[] getActions() {
        return new Action[0];
    }

    @Override
    public Lookup getLookup() {
        return new ProxyLookup(dynamicLookup, obj.getLookup());
    }

    @Override
    public void componentOpened() {
    }

    @Override
    public void componentClosed() {
    }

    @Override
    public void componentShowing() {
    }

    @Override
    public void componentHidden() {
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
        callback.getTopComponent().setDisplayName(obj.getNameExt());
    }

    @Override
    public CloseOperationState canCloseElement() {
        return CloseOperationState.STATE_OK;
    }
}
