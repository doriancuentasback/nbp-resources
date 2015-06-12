/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.examples.modules.povproject;

import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.openide.actions.FileSystemAction;
import org.openide.actions.NewTemplateAction;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.NbBundle;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;

/**
 *
 * @author geertjan
 */
class PovrayLogicalView implements LogicalViewProvider {

    private final PovrayProject project;

    public PovrayLogicalView(PovrayProject project) {
	this.project = project;
    }

    @Override
    public Node createLogicalView() {

	try {

	    //Get the scenes directory, creating if deleted
	    FileObject scenes = project.getScenesFolder(true);

	    //Get the DataObject that represents it
	    DataFolder scenesDataObject =
		    DataFolder.findFolder(scenes);

	    //Get its default node—we'll wrap our node around it to change the
	    //display name, icon, etc.
	    Node realScenesFolderNode = scenesDataObject.getNodeDelegate();

	    //This FilterNode will be our project node
	    return new ScenesNode(realScenesFolderNode, project);

	} catch (DataObjectNotFoundException donfe) {

	    Exceptions.printStackTrace(donfe);

	    //Fallback—the directory couldn't be created -
	    //read-only filesystem or something evil happened
	    return new AbstractNode(Children.LEAF);

	}

    }

    /**
     * This is the node you actually see in the Projects window for the project
     */
    private static final class ScenesNode extends FilterNode {

	final PovrayProject project;

	public ScenesNode(Node node, PovrayProject project) throws DataObjectNotFoundException {
	    super(node, new FilterNode.Children(node),
		    //The projects system wants the project in the Node's lookup.
		    //NewAction and friends want the original Node's lookup.
		    //Make a merge of both
		    new ProxyLookup(
		    Lookups.singleton(project),
		    node.getLookup()));
	    this.project = project;
	}

	@Override
	public Image getIcon(int type) {
	    return ImageUtilities.loadImage(
		    "org/netbeans/examples/modules/povproject/resources/scenes.gif");
	}

	@Override
	public Image getOpenedIcon(int type) {
	    return getIcon(type);
	}

	@Override
	public String getDisplayName() {
	    return project.getProjectDirectory().getName();
	}

	@NbBundle.Messages({
	    "LBL_Build=Render Project",
	    "LBL_Clean=Clean Project"
	})
	@Override
	public Action[] getActions(boolean popup) {
	    Action[] result = new Action[]{
		new ProjectAction(ActionProvider.COMMAND_BUILD, Bundle.LBL_Build(), project),
		new ProjectAction(ActionProvider.COMMAND_CLEAN, Bundle.LBL_Clean(), project),
		new OtherProjectAction(project, false),
		SystemAction.get(NewTemplateAction.class),
		SystemAction.get(FileSystemAction.class),
		new OtherProjectAction(project, true),};
	    return result;
	}
    }

    private static class ProjectAction extends AbstractAction {

	private final PovrayProject project;
	private final String command;

	public ProjectAction(String cmd, String displayName, PovrayProject prj) {
	    this.project = prj;
	    putValue(NAME, displayName);
	    this.command = cmd;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
	    ActionProvider prov = (ActionProvider) project.getLookup().lookup(ActionProvider.class);
	    prov.invokeAction(command, null);
	}

	@Override
	public boolean isEnabled() {
	    ActionProvider prov = (ActionProvider) project.getLookup().lookup(ActionProvider.class);
	    return prov.isActionEnabled(command, null);
	}
    }

    @NbBundle.Messages({
	"LBL_CloseProject=Close Project",
	"LBL_SetMainProject=Set Main Project"
    })
    private static class OtherProjectAction extends AbstractAction {

	private final PovrayProject project;
	private final boolean isClose;

	OtherProjectAction(PovrayProject project, boolean isClose) {
	    putValue(NAME, isClose ? Bundle.LBL_CloseProject() : Bundle.LBL_SetMainProject());
	    this.project = project;
	    this.isClose = isClose;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
	    if (isClose) {
		OpenProjects.getDefault().close(new Project[]{project});
	    } else {
		OpenProjects.getDefault().setMainProject(project);
	    }
	}
    }

    @Override
    public Node findPath(Node root, Object target) {
	//leave unimplemented for now
	return null;
    }
}
