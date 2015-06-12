package org.zip.explorer;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import javax.swing.ActionMap;
import javax.swing.text.DefaultEditorKit;
import org.netbeans.api.actions.Closable;
import org.netbeans.api.settings.ConvertAsProperties;
import org.netbeans.spi.actions.AbstractSavable;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.Actions;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.explorer.view.BeanTreeView;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup.Result;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.NbBundle;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
import org.zip.utils.CentralLookup;

@ConvertAsProperties(
        dtd = "-//org.zip.explorer//ZIP//EN",
        autostore = false)
@TopComponent.Description(
        preferredID = "ZIPTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "explorer", openAtStartup = true)
@ActionID(category = "Window", id = "org.zip.explorer.ZIPTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_ZIPAction",
        preferredID = "ZIPTopComponent")
@NbBundle.Messages({
    "CTL_ZIPAction=ZIP",
    "CTL_ZIPTopComponent=ZIP Window",
    "HINT_ZIPTopComponent=This is a ZIP window"
})
public class ZIPExplorer extends TopComponent implements ExplorerManager.Provider {

    private ExplorerManager mgr = new ExplorerManager();
    private InstanceContent instanceContent;

    public ZIPExplorer() {
        setName(Bundle.CTL_ZIPTopComponent());
        setToolTipText(Bundle.HINT_ZIPTopComponent());
        setLayout(new BorderLayout());
        Node rootNode = new AbstractNode(Children.create(new ZIPChildFactory(), false));
        rootNode.setDisplayName("Root");
        BeanTreeView btv = new BeanTreeView();
        btv.setRootVisible(false);
        add(btv, BorderLayout.CENTER);
        ActionMap map = this.getActionMap();
        map.put(DefaultEditorKit.copyAction, ExplorerUtils.actionCopy(mgr));
        map.put(DefaultEditorKit.cutAction, ExplorerUtils.actionCut(mgr));
        map.put(DefaultEditorKit.pasteAction, ExplorerUtils.actionPaste(mgr));
        map.put("delete", ExplorerUtils.actionDelete(mgr, true)); // or false
        mgr.setRootContext(rootNode);
        associateLookup(ExplorerUtils.createLookup(mgr, map));
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return mgr;
    }

    private class ZIPChildFactory extends ChildFactory.Detachable<FileObject> implements LookupListener {
        private Result<FileObject> filesInCentralLookup;
        @Override
        protected boolean createKeys(List<FileObject> list) {
            list.addAll(filesInCentralLookup.allInstances());
            return true;
        }
        @Override
        protected Node createNodeForKey(final FileObject key) {
            ZipNode node = null;
            try {
                node = new ZipNode(key);
            } catch (DataObjectNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
            return node;
        }
        private class ZipNode extends FilterNode {
            public ZipNode(final FileObject key) throws DataObjectNotFoundException {
                super(
                        DataFolder.find(key).getNodeDelegate(),
                        new FilterNode.Children(DataFolder.find(key).getNodeDelegate()),
                        new AbstractLookup(instanceContent = new InstanceContent()));
                setDisplayName(key.getName() + ".zip");
                key.addRecursiveListener(new FileChangeListener() {
                    @Override
                    public void fileFolderCreated(FileEvent fe) {
                        modify(fe.getFile());
                    }
                    @Override
                    public void fileDataCreated(FileEvent fe) {
                        modify(fe.getFile());
                    }
                    @Override
                    public void fileChanged(FileEvent fe) {
                        modify(fe.getFile());
                    }
                    @Override
                    public void fileDeleted(FileEvent fe) {
                        modify(fe.getFile());
                    }
                    @Override
                    public void fileRenamed(FileRenameEvent fre) {
                        modify(fre.getFile());
                    }
                    @Override
                    public void fileAttributeChanged(FileAttributeEvent fae) {
                        modify(fae.getFile());
                    }
                    private void modify(FileObject file) {
                        if (getLookup().lookup(ZIPSavable.class) == null) {
                            instanceContent.add(new ZIPSavable(file));
                        }
                    }
                });
                instanceContent.add(new Closable() {
                    @Override
                    public boolean close() {
                        //Remove the FileObject from Central Lookup:
                        CentralLookup.getDefault().remove(key);
                        //Refresh the Node hierarchy, which will remove the Node:
                        refresh(true);
                        //But now we also want to close the related files
                        //that are currently open, i.e., those from the 
                        //currently closed ZIP folder.
                        //Start by identifying the path to the ZIP folder:
                        String fullPathToZIPFolder = key.getPath();
                        //Iterate through open TopComponents, find matching FileObjects
                        //and close those TopComponents
                        Set<TopComponent> opened = WindowManager.getDefault().getRegistry().getOpened();
                        for (TopComponent topComponent : opened) {
                            FileObject tcFileObject = topComponent.getLookup().lookup(FileObject.class);
                            if (tcFileObject != null) {
                                String fullPathToFile = tcFileObject.getPath();
                                if(fullPathToFile.contains(fullPathToZIPFolder)){
                                    if (topComponent.canClose()){
                                       topComponent.close();
                                    }
                                }
                            }
                        }
                        return true;
                    }
                });
            }
        }
        @Override
        public void resultChanged(LookupEvent le) {
            refresh(true);
        }
        @Override
        protected void addNotify() {
            filesInCentralLookup = CentralLookup.getDefault().lookupResult(FileObject.class);
            filesInCentralLookup.addLookupListener(this);
        }
        @Override
        protected void removeNotify() {
            filesInCentralLookup.removeLookupListener(this);
        }
    }

    private class ZIPSavable extends AbstractSavable {
        private final FileObject file;
        private ZIPSavable(FileObject file) {
            register();
            this.file = file;
        }
        @Override
        protected String findDisplayName() {
            return file.getPath();
        }
        @Override
        protected void handleSave() throws IOException {
            Actions.forID("File", "org.zip.explorer.export").actionPerformed(null);
            tc().instanceContent.remove(this);
            unregister();
        }
        ZIPExplorer tc() {
            return ZIPExplorer.this;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ZIPSavable) {
                ZIPSavable m = (ZIPSavable) obj;
                return tc() == m.tc();
            }
            return false;
        }
        @Override
        public int hashCode() {
            return tc().hashCode();
        }
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
    
}
