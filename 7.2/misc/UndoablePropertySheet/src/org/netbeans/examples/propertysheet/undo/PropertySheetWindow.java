package org.netbeans.examples.propertysheet.undo;

import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.openide.awt.UndoRedo;
import org.openide.explorer.propertysheet.PropertySheet;
import org.openide.nodes.Node;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;
import org.openide.util.lookup.ProxyLookup;
import org.openide.windows.Mode;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

/**
 * A fake property sheet window which proxies all nodes with undoable ones.
 *
 * @author Tim Boudreau
 */
public final class PropertySheetWindow extends TopComponent implements PropertyChangeListener {

    private final PropertySheet sheet = new PropertySheet();
    private final SettableProxyLookup mp;
    public static final String ID = "_sheet";
    
    static {
        System.setProperty("org.openide.explorer.propertysheet.PropUtils.level", "" + Integer.MIN_VALUE);
    }

    public PropertySheetWindow() {
        this(new SettableProxyLookup());
    }

    private PropertySheetWindow(SettableProxyLookup mp) {
        super(mp);
        this.mp = mp;
        setLayout(new BorderLayout());
        add(sheet, BorderLayout.CENTER);
        setDisplayName(NbBundle.getMessage(PropertySheetWindow.class, 
                "PROPERTY_SHEET_WINDOW_NAME")); //NOI18N
        setIcon(ImageUtilities.loadImage(
                "org/netbeans/core/windows/resources/properties.gif")); //NOI18N
    }

    @Override
    protected String preferredID() {
        return ID;
    }

    @Override
    protected void componentOpened() {
        TopComponent.getRegistry().addPropertyChangeListener(this);
        propertyChange(null);
    }

    @Override
    protected void componentClosed() {
        TopComponent.getRegistry().removePropertyChangeListener(this);
        sheet.setNodes(new Node[0]);
    }

    @Override
    public int getPersistenceType() {
        return PERSISTENCE_ONLY_OPENED;
    }

    @Override
    public UndoRedo getUndoRedo() {
        return GlobalUndoManager.get();
    }

    @Override
    public void open() {
        Mode mode = WindowManager.getDefault().findMode("properties"); //NOI18N
        if (mode != null) {
            mode.dockInto(this);
        }
        super.open();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt == null || TopComponent.Registry.PROP_ACTIVATED.equals(evt.getPropertyName())) {
            TopComponent tc = TopComponent.getRegistry().getActivated();
            if (tc != this) {
                if (tc == null) {
                    mp.clear();
                } else {
                    mp.set(tc.getLookup());
                }
            }
        }
        if (evt == null || TopComponent.Registry.PROP_ACTIVATED_NODES.equals(evt.getPropertyName())) {
            Node[] nodes = TopComponent.getRegistry().getActivatedNodes();
            sheet.setNodes(proxy(nodes));
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //do nothing
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //do nothing
    }

    static Node proxy(Node node) {
        if (node instanceof UndoProxyNode) {
            return node;
        }
        return new UndoProxyNode(node);
    }

    static Node[] proxy(Node[] nodes) {
        Node[] result = new Node[nodes.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = proxy(nodes[i]);
        }
        return result;
    }

    static class SettableProxyLookup extends ProxyLookup {

        public void clear() {
            setLookups();
        }

        public void set(Lookup lkp) {
            setLookups(lkp);
        }
    }
}
