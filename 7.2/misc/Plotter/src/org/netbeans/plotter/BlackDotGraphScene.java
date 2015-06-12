package org.netbeans.plotter;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.ConnectProvider;
import org.netbeans.api.visual.action.ConnectorState;
import org.netbeans.api.visual.action.MoveProvider;
import org.netbeans.api.visual.action.RectangularSelectDecorator;
import org.netbeans.api.visual.action.RectangularSelectProvider;
import org.netbeans.api.visual.action.WidgetAction;
import org.netbeans.api.visual.action.WidgetAction.WidgetMouseEvent;
import org.netbeans.api.visual.anchor.AnchorFactory;
import org.netbeans.api.visual.border.BorderFactory;
import org.netbeans.api.visual.graph.GraphScene;
import org.netbeans.api.visual.model.ObjectSceneEvent;
import org.netbeans.api.visual.model.ObjectSceneEventType;
import org.netbeans.api.visual.model.ObjectSceneListener;
import org.netbeans.api.visual.model.ObjectState;
import org.netbeans.api.visual.widget.ConnectionWidget;
import org.netbeans.api.visual.widget.LabelWidget;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.netbeans.api.visual.widget.general.IconNodeWidget;
import org.netbeans.plotter.BlackDotGraphScene.BlackDot;
import org.openide.awt.StatusDisplayer;
import org.openide.util.ImageUtilities;

public class BlackDotGraphScene extends GraphScene<BlackDot, String> {

    private static final Image IMAGE = ImageUtilities.loadImage(""
            + "org/netbeans/plotter/black_dot.png"); // NOI18N
    private BlackDot bd;
    private LayerWidget backgroundLayer;
    private LayerWidget interactionLayer;
    private LayerWidget connectionLayer;

    public BlackDotGraphScene() {
        
        addChild(backgroundLayer = new LayerWidget(this));
        addChild(connectionLayer = new LayerWidget(this));
        addChild(interactionLayer = new LayerWidget(this));
        
        getActions().addAction(0, new SceneCreateAction());
//        getActions().addAction(1,ActionFactory.createRectangularSelectAction(
//                this, backgroundLayer));
        
        getActions().addAction(1, ActionFactory.createRectangularSelectAction(
                new MyRectangularSelectDecorator(this), backgroundLayer,
                new MyRectangularSelectProvider(this)));

    }

    private class MyRectangularSelectDecorator implements RectangularSelectDecorator {

        private final Scene scene;

        public MyRectangularSelectDecorator(Scene scene) {
            this.scene = scene;
        }

        @Override
        public Widget createSelectionWidget() {
            LabelWidget lw = new LabelWidget(scene);
            lw.setBorder(BorderFactory.createDashedBorder(Color.BLACK, 3, 3));
            return lw;
        }
        
    }

    private class MyRectangularSelectProvider implements RectangularSelectProvider {
        
        private final Scene scene;

        private MyRectangularSelectProvider(Scene scene) {
            this.scene = scene;
            
        }

        @Override
        public void performSelection(Rectangle rectangle) {
            if (rectangle.width < 0) {
                rectangle.x += rectangle.width;
                rectangle.width *= -1;
            }
            if (rectangle.height < 0) {
                rectangle.y += rectangle.height;
                rectangle.height *= -1;
            }
            for (Object b : getObjects()) {
                BlackDotWidget w = (BlackDotWidget) findWidget(b);
                Rectangle r = new Rectangle(w.getBounds());
                r.setLocation(w.getLocation());
                if (r.intersects(rectangle)) {
                    selectedSet.add(b);
                } else {
                    selectedSet.remove(b);
                }
            }
            setSelectedObjects(selectedSet);
            Set<?> selectedObjects = getSelectedObjects();
            if (selectedObjects.size() == 4) {
                Widget w0 = null;
                Widget w1 = null;
                Widget w2 = null;
                Widget w3 = null;
                Object[] toArray = selectedObjects.toArray();
                for (int i = 0; i < selectedObjects.toArray().length; i++) {
                    Object o = toArray[i];
                    if (i == 0) {
                        w0 = findWidget(o);
                    } else if (i == 1) {
                        w1 = findWidget(o);
                        ConnectionWidget conn = new ConnectionWidget(scene);
                        conn.setTargetAnchor(AnchorFactory.createCircularAnchor(w0, 10));
                        conn.setSourceAnchor(AnchorFactory.createCircularAnchor(w1, 10));
                        connectionLayer.addChild(conn);
                    } else if (i == 2){
                        w2 = findWidget(o);
                        ConnectionWidget conn = new ConnectionWidget(scene);
                        conn.setTargetAnchor(AnchorFactory.createCircularAnchor(w0, 10));
                        conn.setSourceAnchor(AnchorFactory.createCircularAnchor(w2, 10));
                        connectionLayer.addChild(conn);
                    } else if (i == 3){
                        w3 = findWidget(o);
                        ConnectionWidget conn = new ConnectionWidget(scene);
                        conn.setTargetAnchor(AnchorFactory.createCircularAnchor(w1, 10));
                        conn.setSourceAnchor(AnchorFactory.createCircularAnchor(w3, 10));
                        connectionLayer.addChild(conn);
                        ConnectionWidget conn2 = new ConnectionWidget(scene);
                        conn2.setTargetAnchor(AnchorFactory.createCircularAnchor(w3, 10));
                        conn2.setSourceAnchor(AnchorFactory.createCircularAnchor(w2, 10));
                        connectionLayer.addChild(conn2);
                    }
                }
            }
            
        }
        
    }
    
    private Set<Object> selectedSet = new HashSet<Object>();

    private class SceneCreateAction extends WidgetAction.Adapter {
        @Override
        public WidgetAction.State mousePressed(Widget widget,
                WidgetAction.WidgetMouseEvent event) {
            if (event.getClickCount() == 2) {
                if (event.getButton() == MouseEvent.BUTTON1
                        || event.getButton() == MouseEvent.BUTTON2) {
                    bd = new BlackDot(IMAGE);
                    backgroundLayer.addChild(new BlackDotWidget(widget.getScene(), widget, event));
                    repaint();
                    return WidgetAction.State.CONSUMED;
                }
            }
            return WidgetAction.State.REJECTED;
        }
    }

    public class BlackDot {

        Image pic;

        BlackDot(Image IMAGE) {
            this.pic = IMAGE;
        }

        public Image getPic() {
            return pic;
        }

        public void setPic(Image pic) {
            this.pic = pic;
        }
        
    }

    private class BlackDotWidget extends IconNodeWidget implements ObjectSceneListener {

        Scene scene;

        public BlackDotWidget(final Scene scene, Widget widget, WidgetMouseEvent event) {
            super(scene);
            this.scene = scene;
            setImage(IMAGE);
            addObjectSceneListener(this, ObjectSceneEventType.OBJECT_SELECTION_CHANGED);
            getActions().addAction(ActionFactory.createExtendedConnectAction(
                    connectionLayer, new SingleBlackDotConnectProvider(scene)));
            getActions().addAction(createSelectAction());
            getActions().addAction(createObjectHoverAction());
            setPreferredLocation(widget.convertLocalToScene(event.getPoint()));
            addObject(bd, this);
            setSelectedObjects(new HashSet<Object>());
        }

        @Override
        public void objectAdded(ObjectSceneEvent ose, Object o) {
        }

        @Override
        public void objectRemoved(ObjectSceneEvent ose, Object o) {
        }

        @Override
        public void objectStateChanged(ObjectSceneEvent ose, Object o, ObjectState os, ObjectState os1) {
        }

        @Override
        public void selectionChanged(ObjectSceneEvent ose, Set<Object> oldSet, Set<Object> newSet) {
            if (newSet.size() == 4) {
                getActions().removeAction(1);
                getActions().addAction(1, ActionFactory.createMoveAction(
                        null, new MultiMoveProvider(scene)));
                StatusDisplayer.getDefault().setStatusText(newSet.size() + " = connect these automatically");
            } else if (newSet.size() > 1) {
                getActions().removeAction(1);
                getActions().addAction(1, ActionFactory.createMoveAction(
                        null, new MultiMoveProvider(scene)));
                StatusDisplayer.getDefault().setStatusText(newSet.size() + " = multiple selection");
            } else if (newSet.size() == 1) {
                getActions().removeAction(1);
                getActions().addAction(1, ActionFactory.createAlignWithMoveAction(
                        backgroundLayer, interactionLayer,
                        ActionFactory.createDefaultAlignWithMoveDecorator()));
                StatusDisplayer.getDefault().setStatusText(newSet.size() + " = single selection");
            }
        }

        @Override
        public void highlightingChanged(ObjectSceneEvent ose, Set<Object> set, Set<Object> set1) {
        }

        @Override
        public void hoverChanged(ObjectSceneEvent ose, Object o, Object o1) {
        }

        @Override
        public void focusChanged(ObjectSceneEvent ose, Object o, Object o1) {
        }

        private class SingleBlackDotConnectProvider implements ConnectProvider {

            private final Scene scene;

            private SingleBlackDotConnectProvider(Scene scene) {
                this.scene = scene;
            }

            @Override
            public boolean isSourceWidget(Widget source) {
                return source instanceof BlackDotWidget && source != null ? true : false;
            }

            @Override
            public ConnectorState isTargetWidget(Widget src, Widget trg) {
                return src != trg && trg instanceof BlackDotWidget
                        ? ConnectorState.ACCEPT : ConnectorState.REJECT;
            }

            @Override
            public boolean hasCustomTargetWidgetResolver(Scene arg0) {
                return false;
            }

            @Override
            public Widget resolveTargetWidget(Scene arg0, Point arg1) {
                return null;
            }

            @Override
            public void createConnection(Widget source, Widget target) {
                ConnectionWidget conn = new ConnectionWidget(scene);
                conn.setTargetAnchor(AnchorFactory.createCircularAnchor(target, 10));
                conn.setSourceAnchor(AnchorFactory.createCircularAnchor(source, 10));
                connectionLayer.addChild(conn);
            }
            
        }
        
    }

    private class MultiMoveProvider implements MoveProvider {

        private HashMap<Widget, Point> originals = new HashMap<Widget, Point>();
        private Point original;
        private final Scene scene;

        private MultiMoveProvider(Scene scene) {
            this.scene = scene;
        }

        @Override
        public void movementStarted(Widget widget) {
            Object object = findObject(widget);
            if (isObject(object)) {
                for (Object o : getSelectedObjects()) {

                    if (isObject(o)) {
                        Widget w = findWidget(o);
                        if (w != null) {
                            originals.put(w, w.getPreferredLocation());
                        }
                    }
                }
            } else {
                originals.put(widget, widget.getPreferredLocation());
            }
        }

        @Override
        public void movementFinished(Widget widget) {
            setSelectedObjects(new HashSet<Object>());
            originals.clear();
            original = null;
        }

        @Override
        public Point getOriginalLocation(Widget widget) {
            original = widget.getPreferredLocation();
            return original;
        }

        @Override
        public void setNewLocation(Widget widget, Point location) {
            int dx = location.x - original.x;
            int dy = location.y - original.y;
            for (Map.Entry<Widget, Point> entry : originals.entrySet()) {
                Point point = entry.getValue();
                entry.getKey().setPreferredLocation(new Point(point.x + dx, point.y + dy));
            }
        }
    }

    @Override
    protected Widget attachNodeWidget(BlackDot node) {
        return null;
    }

    @Override
    protected Widget attachEdgeWidget(String edge) {
        return null;
    }

    @Override
    protected void attachEdgeSourceAnchor(String edge,
            BlackDot oldSourceNode, BlackDot sourceNode) {
    }

    @Override
    protected void attachEdgeTargetAnchor(String edge,
            BlackDot oldTargetNode, BlackDot targetNode) {
    }
    
}
