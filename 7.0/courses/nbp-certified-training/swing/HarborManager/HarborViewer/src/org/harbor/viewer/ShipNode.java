package org.harbor.viewer;

import java.beans.IntrospectionException;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.List;
import javax.swing.Action;
import javax.swing.event.UndoableEditEvent;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import org.harbor.domain.Ship;
import org.openide.awt.StatusDisplayer;
import org.openide.awt.UndoRedo;
import org.openide.cookies.SaveCookie;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.Lookup;
import org.openide.util.Utilities;
import org.openide.util.WeakListeners;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;

public class ShipNode extends BeanNode
        implements PropertyChangeListener, UndoRedo.Provider {

    private final InstanceContent ic;
    private final ShipSaveCapability saveCookie;
    private UndoRedo.Manager manager;

    private String oldDisplayName;
    private String newDisplayName;
    private Ship ship;
    
    public ShipNode(Ship bean) throws IntrospectionException {
        this(bean, new InstanceContent());
    }

    private ShipNode(Ship bean, InstanceContent ic) throws IntrospectionException {
        super(bean, Children.LEAF, new ProxyLookup(new AbstractLookup(ic), Lookups.singleton(bean)));
        this.ic = ic;
        setDisplayName(bean.getType());
        setShortDescription(String.valueOf(bean.getYear()));
        saveCookie = new ShipSaveCapability(bean);
        bean.addPropertyChangeListener(WeakListeners.propertyChange(this, bean));
    }

    @Override
    public Action[] getActions(boolean context) {
        List<? extends Action> shipActions =
                Utilities.actionsForPath("Actions/Ship");
        return shipActions.toArray(new Action[shipActions.size()]);
    }

    protected void fire(boolean modified) {
        if (modified) {
            ic.add(saveCookie);
        } else {
            ic.remove(saveCookie);
        }
    }

    @Override
    public UndoRedo getUndoRedo() {
        manager = Lookup.getDefault().lookup(
                UndoRedo.Manager.class);
        return manager;
    }
    
    private class ShipSaveCapability implements SaveCookie {
        private final Ship bean;
        public ShipSaveCapability(Ship bean) {
            this.bean = bean;
        }
        @Override
        public void save() throws IOException {
            StatusDisplayer.getDefault().setStatusText("Saving...");
            fire(false);
        }
    }

    @Override
    public boolean canRename() {
        return true;
    }

    @Override
    public void setName(String newDisplayName) {
        Ship c = getLookup().lookup(Ship.class);
        oldDisplayName = c.getType();
        c.setType(newDisplayName);
        fireNameChange(oldDisplayName, newDisplayName);
        fire(true);
        fireUndoableEvent("type", ship, oldDisplayName, newDisplayName);
    }

    public void fireUndoableEvent(String property, Ship source, Object oldValue, Object newValue) {
        ReUndoableEdit reUndoableEdit = new ReUndoableEdit(
                property, source, oldValue, newValue);
        UndoableEditEvent undoableEditEvent = new UndoableEditEvent(
                this, reUndoableEdit);
        manager.undoableEditHappened(undoableEditEvent);
    }

    private class ReUndoableEdit extends AbstractUndoableEdit {
        private Object oldValue;
        private Object newValue;
        private Ship source;
        private String property;
        public ReUndoableEdit(String property, Ship source, Object oldValue, Object newValue) {
            super();
            this.oldValue = oldValue;
            this.newValue = newValue;
            this.source = source;
            this.property = property;
        }
        @Override
        public void undo() throws CannotUndoException {
            setName(oldValue.toString());
        }
        @Override
        public void redo() throws CannotRedoException {
            setName(newValue.toString());
        }
    }

    @Override
    public String getDisplayName() {
        Ship c = getLookup().lookup(Ship.class);
        if (null != c.getType()) {
            return c.getType();
        }
        return super.getDisplayName();
    }

    @Override
    public String getShortDescription() {
        Ship c = getLookup().lookup(Ship.class);
        if (null != String.valueOf(c.getYear())) {
            return String.valueOf(c.getYear());
        }
        return super.getShortDescription();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("type")) {
            String oldDisplayName = evt.getOldValue().toString();
            String newDisplayName = evt.getNewValue().toString();
            fireDisplayNameChange(oldDisplayName, newDisplayName);
        } else if (evt.getPropertyName().equals("year")) {
            String oldToolTip = evt.getOldValue().toString();
            String newToolTip = evt.getNewValue().toString();
            fireShortDescriptionChange(oldToolTip, newToolTip);
        }
        fire(true);
    }
    
}
