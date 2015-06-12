package org.diary.explorer;

import java.awt.BorderLayout;
import javax.swing.ActionMap;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.explorer.view.BeanTreeView;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;

@TopComponent.Description(
        preferredID = "EntryExplorerTopComponent",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "explorer", openAtStartup = true)
@ActionID(category = "Window", id = "org.diary.explorer.EntryExplorerTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_EntryExplorerAction",
        preferredID = "EntryExplorerTopComponent"
)
@NbBundle.Messages({
    "CTL_EntryExplorerAction=Diary Entries",
    "CTL_EntryExplorerTopComponent=Diary Entries"
})
public class EntryExplorerTopComponent extends TopComponent implements ExplorerManager.Provider {

    private final ExplorerManager em = new ExplorerManager();

    public EntryExplorerTopComponent() {
        setDisplayName(Bundle.CTL_EntryExplorerTopComponent());
        setLayout(new BorderLayout());
        BeanTreeView btv = new BeanTreeView();
        btv.setRootVisible(false);
        add(btv, BorderLayout.CENTER);
        em.setRootContext(new AbstractNode(Children.create(new EntryChildFactory(), true)));
        ActionMap map = getActionMap();
        map.put("delete", ExplorerUtils.actionDelete(em, true));
        associateLookup(ExplorerUtils.createLookup(em, map));
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return em;
    }

}
