/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hulles.geewhiz;

import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.netbeans.api.visual.vmd.VMDGraphScene;
import org.netbeans.api.visual.vmd.VMDNodeWidget;
import org.netbeans.api.visual.vmd.VMDPinWidget;
import org.netbeans.api.visual.widget.LabelWidget;
import org.netbeans.api.visual.widget.Widget;
import org.openide.loaders.DataObject;
import org.openide.util.ImageUtilities;

/**
 *
 * @author mark
 */
public class VPrologGraphScene extends VMDGraphScene {
    private static final Image IMAGE_NODE = ImageUtilities.
            loadImage ("org/hulles/geewhiz/node.png"); // NOI18N
    private static final Image IMAGE_EXTERNAL = ImageUtilities.
            loadImage ("org/hulles/geewhiz/external.png"); // NOI18N
    private static final Image IMAGE_ITEM = ImageUtilities.
            loadImage ("org/hulles/geewhiz/item.gif"); // NOI18N
    private static int pinID = 1;
    private static int edgeID = 1;
    private List<PrologClause> clauses;

private HashMap<Widget, Object> widget2object = new HashMap<Widget, Object> ();

    /** Creates a new instance of VPrologGraphScene */
    public VPrologGraphScene() { // demo
        LabelWidget label;
        
        label = new LabelWidget (this, "There is no Prolog program available to diagram.");
        label.setPreferredLocation (new Point (100, 100));
        this.addChild (label);
//        layoutScene();
    }
    public VPrologGraphScene(DataObject dObj) {
        PrologAST pTree;
        List<PrologClause> embedded;
        String nodeID;
        Integer instances;
        String newPinID;
        PrologClause existingClause;
        String eNodeID;
        List<String> eNodes;
        SceneUtils sceneUtils;
        VMDNodeWidget node;
        String instanceString;
        
        sceneUtils = new SceneUtils(this);
        sceneUtils.addContextMenu();
        
        
        pTree = new PrologAST(dObj);
        clauses = pTree.getClauses();

        // create all primary nodes first so they're available
        //   to create edges to....
        for (PrologClause clause : clauses) {
            instances = clause.getInstanceCount();
            nodeID = makeNodeID(clause);
            instanceString = instances.toString() + (instances == 1 ? " instance" : " instances");
            node = createNode(this, randXPoint(), randYPoint(), 
                    IMAGE_NODE, nodeID, instanceString, null);
            sceneUtils.addEditor(clause, node);
        }
        // now create pins and edges
        eNodes = new ArrayList<String>();
        for (PrologClause clause : clauses) {
            nodeID = makeNodeID(clause);
            embedded = clause.getBody();
            for (PrologClause e : embedded) {
                eNodeID = makeNodeID(e);
                newPinID = "pin" + VPrologGraphScene.pinID++;
                createPin(this, nodeID, newPinID, 
                        IMAGE_ITEM, eNodeID, "Embedded");
                existingClause = PrologClause.findClause(clauses, e);
                if (existingClause == null) {
                    if (!eNodes.contains(eNodeID)) {
                    // externally defined (?)
                        createNode(this, randXPoint(), randYPoint(), 
                                IMAGE_NODE, eNodeID, "External",
                                Arrays.asList (IMAGE_EXTERNAL));
                        eNodes.add(eNodeID);
                    }
                }
                createEdge(this, newPinID, eNodeID);
            }
        }
        layoutScene();
    }

    public static String makeNodeID(PrologClause clause) {
        String name;
        Integer arity;
        
        name = clause.getName();
        arity = clause.getArity();
        return name + "/" + arity.toString();
    }
    
    private int randXPoint() {
        return (int) (Math.random() * 800);
    }
    
    private int randYPoint() {
        return (int) (Math.random() * 800);
    }
    
    private VMDNodeWidget createNode (VMDGraphScene scene, int x, int y, 
            Image image, String name, String type, List<Image> glyphs) {
        VMDNodeWidget widget;
        
        widget = (VMDNodeWidget) scene.addNode (name);
        widget.setPreferredLocation (new Point (x, y));
        widget.setNodeProperties (image, name, type, glyphs);
        scene.addPin (name, name + VMDGraphScene.PIN_ID_DEFAULT_SUFFIX);
        return widget;
    }

    private void createPin (VMDGraphScene scene, String nodeID, String pinID, 
            Image image, String name, String type) {
        VMDPinWidget pinWidget;
        
        pinWidget = (VMDPinWidget) scene.addPin (nodeID, pinID);
        pinWidget.setProperties (name, null);
    }

    private void createEdge (VMDGraphScene scene, String sourcePinID, 
            String targetNodeID) {
        String localEdgeId;
        
        localEdgeId = "edge" + VPrologGraphScene.edgeID ++;
        scene.addEdge (localEdgeId);
        scene.setEdgeSource (localEdgeId, sourcePinID);
        scene.setEdgeTarget (localEdgeId, targetNodeID + 
                VMDGraphScene.PIN_ID_DEFAULT_SUFFIX);
    }


}