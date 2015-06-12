package org.netbeans.examples.propertysheet.undo;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyEditor;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.UndoableEditEvent;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoableEdit;
import org.netbeans.examples.propertysheet.undo.UndoProxyNode.ProxyProperty.UndoableEditImpl;
import org.openide.nodes.Node.Property;
import org.openide.nodes.Node.PropertySet;
import org.openide.nodes.*;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.util.WeakListeners;
import org.openide.util.WeakSet;

/**
 * Proxies a Node with a wrapper whose Property objects add undo operations to a
 * global undo manager.
 *
 * @author Tim Boudreau
 */
final class UndoProxyNode extends FilterNode {
    private final Set<UndoableEditImpl<?>> edits = new WeakSet<UndoableEditImpl<?>>();
    private final NodeListener listener = new EditDeleter();
    
    UndoProxyNode(Node orig) {
        super(orig, new ProxyChildren(orig));
        orig.addNodeListener(WeakListeners.create(NodeListener.class, listener, orig));
    }

    @Override
    public PropertySet[] getPropertySets() {
        //Create wrapper proxy sets that produce wrapper properties
        PropertySet[] sets = super.getPropertySets();
        PropertySet[] result = new PropertySet[sets.length];
        for (int i = 0; i < sets.length; i++) {
            result[i] = new ProxyPropertySet(this, sets[i]);
        }
        return result;
    }
    
    void addEdit(UndoableEditImpl<?> edit) {
        edits.add(edit);
    }
    
    class EditDeleter implements NodeListener {

        @Override
        public void childrenAdded(NodeMemberEvent nme) {
            //do nothing
        }

        @Override
        public void childrenRemoved(NodeMemberEvent nme) {
            //do nothing
        }

        @Override
        public void childrenReordered(NodeReorderEvent nre) {
            //do nothing
        }

        @Override
        public void nodeDestroyed(NodeEvent ne) {
            //Iterate any edits and destroy them if the node is destroyed,
            //and trigger the undo manager to fire changes deleting the edit
            for (Iterator<UndoableEditImpl<?>> it=edits.iterator(); it.hasNext();) {
                UndoableEditImpl<?> edit = it.next();
                if (edit != null) { //can be null with WeakSet
                    edit.die();
                    it.remove();
                    GlobalUndoManager.fireEditsChanged();
                }
            }
        }

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            //do nothing
        }
    }
    
    static class ProxyChildren extends FilterNode.Children {

        public ProxyChildren(Node or) {
            super(or);
        }

        @Override
        protected Node[] createNodes(Node key) {
            //Recursively wrap all children
            return new Node[]{new UndoProxyNode(key)};
        }
    }

    static class ProxyPropertySet extends PropertySet {
        private final UndoProxyNode node;
        private final PropertySet orig;

        public ProxyPropertySet(UndoProxyNode node, PropertySet orig) {
            super(orig.getName(), orig.getDisplayName(), orig.getShortDescription());
            this.node = node;
            this.orig = orig;
        }

        @Override
        public String getHtmlDisplayName() {
            return orig.getHtmlDisplayName();
        }

        @Override
        public Enumeration<String> attributeNames() {
            return orig.attributeNames();
        }

        @Override
        public String getDisplayName() {
            return orig.getDisplayName();
        }

        @Override
        public String getName() {
            return orig.getName();
        }

        @Override
        public String getShortDescription() {
            return orig.getShortDescription();
        }

        @Override
        public Object getValue(String attributeName) {
            return orig.getValue(attributeName);
        }

        @Override
        public boolean isExpert() {
            return orig.isExpert();
        }

        @Override
        public boolean isHidden() {
            return orig.isHidden();
        }

        @Override
        public boolean isPreferred() {
            return orig.isPreferred();
        }

        @Override
        public void setDisplayName(String displayName) {
            if (orig == null) {
                return; //superclass constructor
            }
            orig.setDisplayName(displayName);
        }

        @Override
        public void setExpert(boolean expert) {
            if (orig == null) {
                return; //superclass constructor
            }
            orig.setExpert(expert);
        }

        @Override
        public void setHidden(boolean hidden) {
            if (orig == null) {
                return; //superclass constructor
            }
            orig.setHidden(hidden);
        }

        @Override
        public void setName(String name) {
            if (orig == null) {
                return; //superclass constructor
            }
            orig.setName(name);
        }

        @Override
        public void setPreferred(boolean preferred) {
            if (orig == null) {
                return; //superclass constructor
            }
            orig.setPreferred(preferred);
        }

        @Override
        public void setShortDescription(String text) {
            if (orig == null) {
                return; //superclass constructor
            }
            orig.setShortDescription(text);
        }

        @Override
        public void setValue(String attributeName, Object value) {
            if (orig == null) {
                return; //superclass constructor
            }
            orig.setValue(attributeName, value);
        }
        private Property<?>[] properties;

        @Override
        public synchronized Property<?>[] getProperties() {
            if (properties == null) {
                Property<?>[] p = orig.getProperties();
                properties = new Property[p.length];
                for (int i = 0; i < p.length; i++) {
                    Property<?> property = p[i];
                    properties[i] = proxy(node, property);
                }
            }
            return properties;
        }
    }

    static <T> ProxyProperty<T> proxy(UndoProxyNode node, Property<T> prop) {
        return new ProxyProperty<T>(node, prop);
    }

    static class ProxyProperty<T> extends org.openide.nodes.Node.Property<T> {
        private final UndoProxyNode node;

        private final Property<T> orig;

        public ProxyProperty(UndoProxyNode node, Property<T> orig) {
            super(orig.getValueType());
            this.node = node;
            this.orig = orig;
            setDisplayName(orig.getDisplayName());
            setShortDescription(orig.getShortDescription());
        }

        @Override
        public boolean canRead() {
            return orig.canRead();
        }

        @Override
        public T getValue() throws IllegalAccessException, InvocationTargetException {
            return orig.getValue();
        }

        @Override
        public boolean canWrite() {
            return orig.canWrite();
        }

        private boolean equals(Object a, Object b) {
            boolean result = a == b;
            if (!result) {
                result = a != null && a.equals(b) || ((a == null) != (b == null));
            }
            return result;
        }

        @Override
        public void setValue(T t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            //Check if we're being called by one of our UndoableEdits
            if (!inUndoOperation) {
                T old = getValue();
                orig.setValue(t);
                //Ignore changes that don't change anything
                if (!equals(old, t)) {
                    UndoableEditImpl<T> edit = new UndoableEditImpl<T>(this, old, t);
                    //Add an edit to the global manager
                    GlobalUndoManager.get().undoableEditHappened(new UndoableEditEvent(this, edit));
                    //Add it to our cache, so it can be expired if the node is destroyed
                    node.addEdit(edit);
                }
            } else {
                orig.setValue(t);
            }
        }

        @Override
        public String getHtmlDisplayName() {
            return orig.getHtmlDisplayName();
        }

        @Override
        public PropertyEditor getPropertyEditor() {
            return orig.getPropertyEditor();
        }

        @Override
        public boolean isDefaultValue() {
            return orig.isDefaultValue();
        }

        @Override
        public void restoreDefaultValue() throws IllegalAccessException, InvocationTargetException {
            orig.restoreDefaultValue();
        }

        @Override
        public boolean supportsDefaultValue() {
            return orig.supportsDefaultValue();
        }
        boolean inUndoOperation;

        static class UndoableEditImpl<T> implements UndoableEdit {

            private T oldValue;
            private T newValue;
            private ProxyProperty<T> prop;
            private boolean redo;

            public UndoableEditImpl(ProxyProperty<T> prop, T oldValue, T newValue) {
                this.prop = prop;
                this.oldValue = oldValue;
                this.newValue = newValue;
            }

            private void proxy(Exception e) throws CannotUndoException {
                CannotUndoException ee = new CannotUndoException();
                ee.initCause(e);
                Exceptions.attachLocalizedMessage(e, NbBundle.getMessage(UndoableEditImpl.class,
                        redo ? "CANNOT_REDO" : "CANNOT_UNDO", //NOI18N
                        redo ? getRedoPresentationName() : getUndoPresentationName()));
                Logger.getLogger(UndoableEditImpl.class.getName()).log(
                        Level.INFO, "Exception " + (redo
                        ? "redoing " : "undoing " + this), e); //NOI18N
                throw ee;
            }

            @Override
            public synchronized void undo() throws CannotUndoException {
                prop.inUndoOperation = true;
                try {
                    prop.setValue(oldValue);
                    redo = true;
                } catch (IllegalAccessException ex) {
                    proxy(ex);
                } catch (IllegalArgumentException ex) {
                    proxy(ex);
                } catch (InvocationTargetException ex) {
                    proxy(ex);
                } catch (RuntimeException ex) {
                    proxy(ex);
                } finally {
                    prop.inUndoOperation = false;
                }
            }

            @Override
            public synchronized boolean canUndo() {
                return prop != null && !redo;
            }

            @Override
            public synchronized void redo() throws CannotRedoException {
                prop.inUndoOperation = true;
                try {
                    prop.setValue(newValue);
                    redo = false;
                } catch (IllegalAccessException ex) {
                    proxy(ex);
                } catch (IllegalArgumentException ex) {
                    proxy(ex);
                } catch (InvocationTargetException ex) {
                    proxy(ex);
                } catch (RuntimeException ex) {
                    proxy(ex);
                } finally {
                    prop.inUndoOperation = false;
                }
            }

            @Override
            public synchronized boolean canRedo() {
                return prop != null && redo;
            }

            @Override
            public synchronized void die() {
                //Ensure we're not leaking
                prop = null;
                oldValue = null;
                newValue = null;
            }

            @Override
            public boolean addEdit(UndoableEdit anEdit) {
                return false;
            }

            @Override
            public boolean replaceEdit(UndoableEdit anEdit) {
                return false;
            }

            @Override
            public boolean isSignificant() {
                return true;
            }

            @Override
            public String getPresentationName() {
                return redo ? getRedoPresentationName() : getUndoPresentationName();
            }

            @Override
            public String getUndoPresentationName() {
                return NbBundle.getMessage(UndoableEditImpl.class, "UNDO", //NOI18N
                        prop.getDisplayName());
            }

            @Override
            public String getRedoPresentationName() {
                return NbBundle.getMessage(UndoableEditImpl.class, "REDO", //NOI18N
                        prop.getDisplayName());
            }

            @Override
            public String toString() {
                return getPresentationName();
            }
        }
    }
}
