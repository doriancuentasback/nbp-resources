package org.netbeans.tfnode;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.windows.Mode;
import org.openide.windows.WindowManager;

@NodeFactory.Registration(projectType = "org-netbeans-modules-java-j2seproject")
public class TinkerForgeNodeFactory implements NodeFactory {
    
    private Project project;

    @Override
    public NodeList<?> createNodes(Project prjct) {
        this.project = prjct;
        return NodeFactorySupport.fixedNodeList(new Node[]{new TinkerForgeNode()});
    }

    private class TinkerForgeNode extends AbstractNode {

        public TinkerForgeNode() {
            super(Children.LEAF);
            setDisplayName("TinkerForge Designer");
            setIconBaseWithExtension("org/netbeans/tfnode/palette/tinker.png");
        }

        @Override
        public Action getPreferredAction() {
            return new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Mode editorMode = WindowManager.getDefault().findMode("editor");
                    TinkerForgeDesignerTopComponent tfdtc = new TinkerForgeDesignerTopComponent(project);
                    editorMode.dockInto(tfdtc);
                    tfdtc.setDisplayName("TinkerForge Designer");
                    tfdtc.open();
                    tfdtc.requestActive();
                }
            };
        }
        
    }
    
}
