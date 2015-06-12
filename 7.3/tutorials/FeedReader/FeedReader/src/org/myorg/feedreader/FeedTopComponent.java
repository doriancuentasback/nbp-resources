package org.myorg.feedreader;

import java.awt.BorderLayout;
import javax.swing.ActionMap;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.explorer.view.BeanTreeView;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

@TopComponent.Description(
        preferredID = "FeedTopComponent",
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(
        mode = "explorer",
openAtStartup = true)
@ActionID(
        category = "Window",
id = "org.myorg.feedreader.FeedTopComponent")
@ActionReferences({
    @ActionReference(
        path = "Menu/Window",
    position = 0)
})
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_FeedAction")
@Messages({
    "CTL_FeedAction=Open Feed Window"})
public class FeedTopComponent extends TopComponent implements ExplorerManager.Provider {

    private final ExplorerManager manager = new ExplorerManager();

    @Messages({
        "CTL_FeedTopComponent=Feed Window",
        "HINT_FeedTopComponent=This is a Feed Window"})
    private FeedTopComponent() {
        setName(Bundle.CTL_FeedTopComponent());
        setToolTipText(Bundle.HINT_FeedTopComponent());
        setLayout(new BorderLayout());
        add(new BeanTreeView(), BorderLayout.CENTER);
        try {
            FileObject rssFeedsFolder = FileUtil.getConfigFile("RssFeeds");
            Node rssFeedsNode = DataObject.find(rssFeedsFolder).getNodeDelegate();
            manager.setRootContext(new RootNode(rssFeedsNode));
        } catch (DataObjectNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        }
        ActionMap map = getActionMap();
        map.put("delete", ExplorerUtils.actionDelete(manager, true));
        associateLookup(ExplorerUtils.createLookup(manager, map));
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return manager;
    }
    
}
