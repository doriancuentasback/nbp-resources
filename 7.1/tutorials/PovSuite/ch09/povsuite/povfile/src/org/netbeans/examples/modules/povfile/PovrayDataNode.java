package org.netbeans.examples.modules.povfile;

import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;
import org.netbeans.examples.api.povray.MainFileProvider;
import org.netbeans.examples.api.povray.RendererService;
import org.netbeans.examples.api.povray.ViewService;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.NbBundle;

public class PovrayDataNode extends DataNode implements ChangeListener {

    public PovrayDataNode(PovrayDataObject obj) {
	super(obj, Children.LEAF);
	RendererService serv = (RendererService) getFromProject(RendererService.class);
	if (serv != null) {
	    //Could be an isolated file outside of a project, in which
	    //case there is no renderer service
	    serv.addChangeListener(obj.getPrimaryFile(), this);
	}
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
	    result = new Action[actions.length + 3];
	    result[0] = actions[0];
	    result[1] = new SetMainFileAction();
	    result[2] = rendererAction;
	    result[3] = new ViewAction();
	} else {
	    //Isolated file in the favorites window or something
	    result = actions;
	}
	return result;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
	fireIconChange();
    }

    private static final String NEEDS_RENDER_BADGE_FILE =
	    "org/netbeans/examples/modules/povfile/needsRenderBadge.png";
    private static final String HAS_IMAGE_BADGE_FILE =
	    "org/netbeans/examples/modules/povfile/hasImageBadge.png";
    private static final String NO_IMAGE_BADGE_FILE =
	    "org/netbeans/examples/modules/povfile/hasNoImageBadge.png";

    @Override
    public Image getIcon(int type) {
	Image result = super.getIcon(type);
	ViewService vs = (ViewService) getFromProject(ViewService.class);
	if (vs != null) {
	    FileObject file = getFile();
	    boolean hasRender = vs.isRendered(file);
	    if (hasRender) {
		Image badge1 = ImageUtilities.loadImage(HAS_IMAGE_BADGE_FILE);
		result = ImageUtilities.mergeImages(result, badge1, 8, 8);
		boolean upToDate = vs.isUpToDate(file);
		if (!upToDate) {
		    Image badge2 = ImageUtilities.loadImage(NEEDS_RENDER_BADGE_FILE);
		    result = ImageUtilities.mergeImages(result, badge2, 8, 0);
		}
	    } else {
		Image badge3 = ImageUtilities.loadImage(NO_IMAGE_BADGE_FILE);
		result = ImageUtilities.mergeImages(result, badge3, 8, 8);
	    }
	}
	return result;
    }

    @NbBundle.Messages("LBL_View=View")
    private class ViewAction extends AbstractAction {

	ViewAction() {
	    putValue(Action.NAME, Bundle.LBL_View());
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
	    ViewService service = (ViewService) getFromProject(ViewService.class);
	    FileObject fob = getDataObject().getPrimaryFile();
	    service.view(fob);
	}

	@Override
	public boolean isEnabled() {
	    return getFromProject(ViewService.class) != null;
	}
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
