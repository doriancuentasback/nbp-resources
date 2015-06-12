package org.netbeans.examples.propertysheet.undo;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.awt.UndoRedo;
import org.openide.util.ChangeSupport;
import org.openide.util.ImageUtilities;
import org.openide.util.NbBundle;
import org.openide.util.WeakListeners;

/**
 *
 * @author Tim Boudreau
 */
public final class GlobalUndoManager {

    private static final Mgr manager = new Mgr();

    static {
        manager.setLimit(20);
    }
    
    private GlobalUndoManager() {
    }

    public static UndoRedo.Manager get() {
        return manager;
    }
    
    static void fireEditsChanged() {
        manager.fire();
    }

    //Use the actions below if you want your own undo actions over a global
    //undo manager
    public static Action createUndoAction() {
        return new UndoAction();
    }

    public static Action createRedoAction() {
        return new RedoAction();
    }
    
    static class Mgr extends UndoRedo.Manager {
        //Subclass which can fire changes if an edit stops being valid
        private final ChangeSupport supp = new ChangeSupport(this);

        @Override
        public void addChangeListener(ChangeListener l) {
            super.addChangeListener(l);
            supp.addChangeListener(l);
        }

        @Override
        public void removeChangeListener(ChangeListener l) {
            super.removeChangeListener(l);
            supp.removeChangeListener(l);
        }
        
        void fire() {
            supp.fireChange();
        }
    }

    private static final class UndoAction extends AbstractAction implements ChangeListener {

        @SuppressWarnings("LeakingThisInConstructor") //NOI18N
        UndoAction() {
            super(NbBundle.getMessage(UndoAction.class, "UNDO_STANDALONE")); //NOI18N
            manager.addChangeListener(WeakListeners.change(this, manager));
            putValue(SMALL_ICON, ImageUtilities.loadImage("org/openide/resources/actions/undo.gif"));
            putValue(LARGE_ICON_KEY, ImageUtilities.loadImage("org/openide/resources/actions/undo24.gif"));
            stateChanged(null);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            manager.undo();
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            System.err.println("Change canUndo " + manager.canUndo() + " canRedo " + manager.canRedo());
            setEnabled(manager.canUndo());
            putValue(NAME, isEnabled() ? manager.getUndoPresentationName()
                    : NbBundle.getMessage(UndoAction.class, "UNDO_STANDALONE")); //NOI18N
        }
    }

    private static final class RedoAction extends AbstractAction implements ChangeListener {

        @SuppressWarnings("LeakingThisInConstructor")
        RedoAction() {
            super(NbBundle.getMessage(UndoAction.class, "REDO_STANDALONE")); //NOI18N
            manager.addChangeListener(WeakListeners.change(this, manager));
            putValue(SMALL_ICON, ImageUtilities.loadImage("org/openide/resources/actions/redo.gif"));
            putValue(LARGE_ICON_KEY, ImageUtilities.loadImage("org/openide/resources/actions/redo24.gif"));
            stateChanged(null);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            manager.redo();
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            setEnabled(manager.canRedo());
            putValue(NAME, isEnabled() ? manager.getRedoPresentationName()
                    : NbBundle.getMessage(UndoAction.class, "REDO_STANDALONE")); //NOI18N
        }
    }
}
