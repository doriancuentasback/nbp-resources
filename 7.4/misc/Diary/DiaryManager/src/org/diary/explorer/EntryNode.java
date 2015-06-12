package org.diary.explorer;

import java.beans.IntrospectionException;
import java.io.IOException;
import javax.swing.Action;
import org.diary.explorer.actions.OpenEntryCapability;
import org.diary.domain.Entry;
import org.diary.options.OpenBehaviorPanel;
import org.openide.actions.DeleteAction;
import org.openide.actions.OpenAction;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.NbPreferences;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.WindowManager;

public class EntryNode extends BeanNode {

    public EntryNode(Entry bean) throws IntrospectionException {
        this(bean, new InstanceContent());
    }

    private EntryNode(Entry bean, InstanceContent ic) throws IntrospectionException {
        super(bean, Children.LEAF, new AbstractLookup(ic));
        ic.add(bean);
        final OpenEntryCapability oec = new OpenEntryCapability(bean);
        ic.add(oec);
        if (NbPreferences.forModule(OpenBehaviorPanel.class).getBoolean("automaticOpening", false)) {
            WindowManager.getDefault().invokeWhenUIReady(new Runnable() {
                @Override
                public void run() {
                    oec.open();
                }
            });
        }
    }

    @Override
    public Action getPreferredAction() {
        return SystemAction.get(OpenAction.class);
    }

    @Override
    public Action[] getActions(boolean context) {
        return new Action[]{
            SystemAction.get(OpenAction.class),
            SystemAction.get(DeleteAction.class)
        };
    }

    @Override
    public boolean canDestroy() {
        return true;
    }

    @Override
    public boolean canRename() {
        return true;
    }

    @Override
    public void destroy() throws IOException {
        fireNodeDestroyed();
    }

}
