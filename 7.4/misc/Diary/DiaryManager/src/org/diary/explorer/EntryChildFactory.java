package org.diary.explorer;

import java.beans.IntrospectionException;
import java.beans.PropertyChangeEvent;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.diary.domain.Entry;
import org.netbeans.api.actions.Editable;
import org.netbeans.api.actions.Openable;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.nodes.NodeEvent;
import org.openide.nodes.NodeListener;
import org.openide.nodes.NodeMemberEvent;
import org.openide.nodes.NodeReorderEvent;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.Utilities;
import org.openide.util.lookup.Lookups;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

class EntryChildFactory extends ChildFactory.Detachable<Entry> implements LookupListener, NodeListener {

    Lookup.Result<Entry> diaryResult;
    Lookup.Result<Openable> openableResult;

    @Override
    protected boolean createKeys(List<Entry> list) {
        list.addAll(diaryResult.allInstances());
        return true;
    }

    @Override
    protected Node createNodeForKey(Entry key) {
        EntryNode node = null;
        try {
            node = new EntryNode(key);
            node.addNodeListener(this);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }

    @Override
    public void resultChanged(LookupEvent le) {
        refresh(true);
        while(openableResult.allInstances().iterator().hasNext()){
            openableResult.allInstances().iterator().next().open();
        }
    }

    @Override
    protected void addNotify() {
        diaryResult = Lookups.forPath("DiaryEntries").lookupResult(Entry.class);
        diaryResult.addLookupListener(this);
        openableResult = Utilities.actionsGlobalContext().lookupResult(Openable.class);
        openableResult.addLookupListener(this);
    }

    @Override
    protected void removeNotify() {
        diaryResult.removeLookupListener(this);
        openableResult.removeLookupListener(this);
    }

    @Override
    public void childrenAdded(NodeMemberEvent nme) {
    }

    @Override
    public void childrenRemoved(NodeMemberEvent nme) {
    }

    @Override
    public void childrenReordered(NodeReorderEvent nre) {
    }

    @Override
    public void nodeDestroyed(NodeEvent ev) {
        FileObject diaryEntries = FileUtil.getConfigFile("DiaryEntries");
        Collection<? extends Entry> beansToBeDeleted = ev.getNode().getLookup().lookupAll(Entry.class);
        for (Entry beanToBeDeleted : beansToBeDeleted) {
            for (FileObject oneDiaryEntry : diaryEntries.getChildren()) {
                Entry matchedObject = FileUtil.getConfigObject(oneDiaryEntry.getPath(), Entry.class);
                if (matchedObject == beanToBeDeleted) {
                    try {
                        oneDiaryEntry.delete();
                    } catch (IOException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
            }
            final TopComponent tc = findTopComponent(beanToBeDeleted);
            if (tc != null) {
                WindowManager.getDefault().invokeWhenUIReady(new Runnable() {
                    @Override
                    public void run() {
                        tc.close();
                    }
                });
            }
            refresh(true);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
    }

    private TopComponent findTopComponent(Entry entry) {
        Set<TopComponent> openTopComponents = WindowManager.getDefault().getRegistry().getOpened();
        for (TopComponent tc : openTopComponents) {
            if (tc.getLookup().lookup(Entry.class) == entry && tc.getLookup().lookup(Editable.class) != null) {
                return tc;
            }
        }
        return null;
    }

}
