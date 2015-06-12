/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hulles.geewhiz;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.EditProvider;
import org.netbeans.api.visual.action.PopupMenuProvider;
import org.netbeans.api.visual.action.WidgetAction;
import org.netbeans.api.visual.vmd.VMDGraphScene;
import org.netbeans.api.visual.vmd.VMDNodeWidget;
import org.netbeans.api.visual.widget.Widget;

/**
 *
 * @author mark
 */
public class SceneUtils {
    private static final String EXPORT_SCENE = "export"; // NOI18N
    private static final String LAYOUT_SCENE = "layout"; // NOI18N
    private static final String PRINT_SCENE = "print"; // NOI18N
    private static final String SATELLITE_VIEW = "satellite"; // NOI18N
    private VPrologGraphScene scene = null;
    private VPrologSatelliteTopComponent viewer;
    
    public SceneUtils(VPrologGraphScene scene) {

        this.scene = scene;
        viewer = VPrologSatelliteTopComponent.findInstance();
        
    }

    public void addContextMenu() {
        WidgetAction popup;
        
        if (scene == null) {
            return;
        }
        
        popup = ActionFactory.createPopupMenuAction (new MyPopupProvider ());
        scene.getActions ().addAction (popup);
        // leave popup menu up (?)
        scene.createActions (LAYOUT_SCENE).addAction (popup);
    }

    private void exportScene() {
        SceneExport exporter;

        // TODO: thread
        exporter = new SceneExport();
        exporter.exportScene((VMDGraphScene) scene);
    }
    
    private void reLayoutScene() {
        
         newLayout();
    }
    
    private void printScene() {
        // not yet implemented
    }
    
    private void makeSatelliteView() {
        
        if (!viewer.isOpened()) {
            viewer.open();
        }
        viewer.setView(scene);
        viewer.requestActive();
    }

    public void addEditor(PrologClause clause, VMDNodeWidget node) {
        NodeEditor editor;
        WidgetAction nodeAction;

        editor = new NodeEditor(clause);
        nodeAction = ActionFactory.createEditAction(editor);
        node.getActions().addAction(nodeAction);
    }
    

    public void newLayout() {
        scene.layoutScene();
    }
    
    private class NodeEditor implements EditProvider {
        private NodeContents popup;
        private String popupName;
        private String popupText;
        
        public NodeEditor(PrologClause clause) {
            this.popup = null;
            this.popupName = VPrologGraphScene.makeNodeID(clause);
            this.popupText = clause.getText();
        }

        public void edit(Widget node) {

            // lazy edit window construction
            if (popup == null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        
                        popup = new NodeContents();
                        popup.changeTitle(popupName);
                        popup.setText(popupText);
                        popup.setVisible(true);
                    }
                });
            } else {
                if (!popup.isVisible()) {
                    popup.setVisible(true);
                }
            }
        }
            
    }

    private final class MyPopupProvider implements PopupMenuProvider, ActionListener {
        private JPopupMenu menu;

        public MyPopupProvider () {
            menu = new JPopupMenu ("Popup menu");
            JMenuItem item;

            item = new JMenuItem ("Print scene...");
            item.setActionCommand (PRINT_SCENE);
            item.addActionListener (this);
            menu.add (item);

            item = new JMenuItem ("Export scene to PNG...");
            item.setActionCommand (EXPORT_SCENE);
            item.addActionListener (this);
            menu.add (item);

            item = new JMenuItem ("Redo scene layout");
            item.setActionCommand (LAYOUT_SCENE);
            item.addActionListener (this);
            menu.add (item);

            item = new JMenuItem ("Show satellite view");
            item.setActionCommand (SATELLITE_VIEW);
            item.addActionListener (this);
            menu.add (item);

        }

        public JPopupMenu getPopupMenu (Widget widget, Point localLocation) {
            return menu;
        }

        public void actionPerformed (ActionEvent e) {
            String cmd;
            
            cmd = e.getActionCommand ();
            if (cmd.equals(EXPORT_SCENE)) {
                exportScene();
            } else if (cmd.equals(PRINT_SCENE)) {
                printScene();
            } else if (cmd.equals(LAYOUT_SCENE)) {
                reLayoutScene();
            } else if (cmd.equals(SATELLITE_VIEW)) {
                makeSatelliteView();
            }
        }

    }
    
}
