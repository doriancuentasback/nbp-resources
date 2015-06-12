package org.netbeans.modules.importantwebfiles;

import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.Exceptions;

@NodeFactory.Registration(projectType = "org-netbeans-modules-web-project")
public class ImportantFilesNodeFactoryImpl implements NodeFactory {

    Project proj;

    @Override
    public NodeList createNodes(Project project) {
      
        this.proj = project;
        
        //If there is no 'nbproject' folder,
        //return an empty list of nodes:
        if (proj.getProjectDirectory().getFileObject("nbproject") == null) {
            return NodeFactorySupport.fixedNodeList();
        }
        
        //If our item is in the project's lookup,
        //return a new node in the node list:
        MyCoolLookupItem item = project.getLookup().lookup(MyCoolLookupItem.class);
        if (item != null) {
            try {
                ImportantFilesNode nd = new ImportantFilesNode(proj);
                return NodeFactorySupport.fixedNodeList(nd);
            } catch (DataObjectNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        
        //If our item isn't in the lookup,
        //then return an empty list of nodes:
        return NodeFactorySupport.fixedNodeList();
        
    }
    
}