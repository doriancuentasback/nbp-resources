package org.diary.explorer.actions;

import java.util.Set;
import org.diary.domain.Entry;
import org.diary.editor.EntryEditorTopComponent;
import org.netbeans.api.actions.Editable;
import org.openide.cookies.OpenCookie;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

public class OpenEntryCapability implements OpenCookie {

    private final Entry bean;

    public OpenEntryCapability(Entry bean) {
        this.bean = bean;
    }

    @Override
    public void open() {
        TopComponent tc = findTopComponent(bean);
        if (tc == null) {
            tc = new EntryEditorTopComponent(bean);
            tc.open();
        }
        tc.requestActive();
    }

    private TopComponent findTopComponent(Entry entry) {
        Set<TopComponent> openTopComponents = WindowManager.getDefault().getRegistry().getOpened();
        for (TopComponent tc : openTopComponents) {
            if (tc.getLookup().lookup(Entry.class) == entry && tc.getLookup().lookup(Editable.class)!=null) {
                return tc;
            }
        }
        return null;
    }

}
