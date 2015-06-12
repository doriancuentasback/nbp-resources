package org.netbeans.examples.modules.povfile;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.xml.ws.BindingType;
import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;
import org.netbeans.examples.api.povray.MainFileProvider;
import org.netbeans.examples.api.povray.RendererService;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;

public class PovrayDataNode extends DataNode {

    public PovrayDataNode(PovrayDataObject obj) {
        super(obj, Children.LEAF);
    }

    public FileObject getFile() {
        return getDataObject().getPrimaryFile();
    }

    public Object getFromProject(Class clazz) {
        Object result;
        Project p = FileOwnerQuery.getOwner(getFile());
        if (p != null) {
            result = p.getLookup().lookup(clazz);
        } else {
            result = null;
        }
        return result;
    }

    private boolean isMainFile() {
        MainFileProvider prov = (MainFileProvider) getFromProject(MainFileProvider.class);
        boolean result;
        if (prov == null) {
            result = false;
        } else {
            FileObject myFile = getFile();
            result = prov.isMainFile(myFile);
        }
        return result;
    }

    @Override
    public String getHtmlDisplayName() {
        return isMainFile() ? "<b>" + getDisplayName() + "</b>" : null;
    }

    @Override
    public Action[] getActions(boolean popup) {
        Action[] actions = super.getActions(popup);
        RendererService renderer =
                (RendererService) getFromProject(RendererService.class);
        Action[] result;
        if (renderer != null && actions.length > 0) { //should always be > 0
            Action rendererAction = new RendererAction(renderer, this);
            result = new Action[actions.length + 2];
            result[0] = actions[0];
            result[1] = new SetMainFileAction();
            result[2] = rendererAction;
        } else {
            //Isolated file in the favorites window or something
            result = actions;
        }
        return result;
    }

    @NbBundle.Messages("CTL_SetMainFile=Set Main File")
    private final class SetMainFileAction extends AbstractAction {

        public SetMainFileAction() {
            putValue(NAME, Bundle.CTL_SetMainFile());
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFileProvider provider = (MainFileProvider) getFromProject(MainFileProvider.class);
            FileObject oldMain = provider.getMainFile();
            provider.setMainFile(getFile());
            fireDisplayNameChange(getDisplayName(), getHtmlDisplayName());
            if (oldMain != null) {
                try {
                    Node oldMainFilesNode = DataObject.find(oldMain).getNodeDelegate();
                    if (oldMainFilesNode instanceof PovrayDataNode) {
                        ((PovrayDataNode) oldMainFilesNode).fireDisplayNameChange(null, oldMainFilesNode.getDisplayName());
                    }
                } catch (DataObjectNotFoundException donfe) { //Should never happen
                    Exceptions.printStackTrace(donfe);
                }
            }
        }

        @Override
        public boolean isEnabled() {
            return !isMainFile() && getFromProject(MainFileProvider.class) != null;
        }
    }
}
