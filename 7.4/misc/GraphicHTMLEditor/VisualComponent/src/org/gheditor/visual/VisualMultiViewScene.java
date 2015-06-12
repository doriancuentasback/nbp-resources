package org.gheditor.visual;

import org.gheditor.visual.utilities.SceneValidator;
import org.gheditor.visual.utilities.SceneSerializer;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.datatransfer.Transferable;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
import org.gheditor.visual.items.filesupport.Item;
import org.gheditor.visual.widget.ItemWidget;
import org.netbeans.api.visual.action.AcceptProvider;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.ConnectorState;
import org.netbeans.api.visual.widget.LabelWidget;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.nodes.Node;
import org.openide.nodes.NodeTransfer;

public class VisualMultiViewScene extends Scene {

    public VisualMultiViewScene(final FileObject fo) {
        final LayerWidget mainLayer = new LayerWidget(this);
        getActions().addAction(ActionFactory.createAcceptAction(new AcceptProvider() {
            @Override
            public ConnectorState isAcceptable(Widget widget, Point point, Transferable t) {
                Node node = NodeTransfer.node(t, NodeTransfer.DND_COPY_OR_MOVE);
                if (node.getLookup().lookup(Item.class) != null) {
                    Item item = node.getLookup().lookup(Item.class);
                    JComponent view = getView();
                    Graphics2D g2 = (Graphics2D) view.getGraphics();
                    Rectangle visRect = view.getVisibleRect();
                    view.paintImmediately(visRect.x, visRect.y, visRect.width, visRect.height);
                    if (SceneValidator.validate(widget.getScene(), item, point)) {
                        g2.draw3DRect(point.x, point.y, item.getWidth(), item.getHeight(), true);
                        return ConnectorState.ACCEPT;
                    } else {
                        g2.draw3DRect(point.x, point.y, 0, 0, true);
                        return ConnectorState.REJECT;
                    }
                }
                return ConnectorState.REJECT;
            }
            @Override
            public void accept(Widget widget, Point point, Transferable t) {
                Node node = NodeTransfer.node(t, NodeTransfer.DND_COPY_OR_MOVE);
                if (node.getLookup().lookup(Item.class) != null) {
                    Item item = node.getLookup().lookup(Item.class);
                    // Creating a new Item, so that each Item that is dropped has a Unique ID:
                    Item droppedItem = new Item(
                            item.getType(),
                            item.getDisplayname(),
                            item.getWidth(),
                            item.getHeight(),
                            item.getX(),
                            item.getY(),
                            item.getIcon16());
                    ItemWidget itemWidget = new ItemWidget(
                            fo,
                            widget.getScene(),
                            point,
                            droppedItem);
                    mainLayer.addChild(itemWidget);
                    SceneSerializer.serialize(widget.getScene(), droppedItem, FileUtil.toFile(fo));
                    repaint();
                }
            }
        }));
        // Split the screen into three:
        Widget threeSplitLayout = new Widget(this);
        threeSplitLayout.setLayout(new VisualMultiViewSceneLayout());
        LabelWidget firstThird = new LabelWidget(this);
        firstThird.setBorder(new LineBorder(Color.BLACK, 1));
        threeSplitLayout.addChild(firstThird);
        LabelWidget secondThird = new LabelWidget(this);
        secondThird.setBorder(new LineBorder(Color.BLACK, 1));
        threeSplitLayout.addChild(secondThird);
        LabelWidget thirdThird = new LabelWidget(this);
        thirdThird.setBorder(new LineBorder(Color.BLACK, 1));
        threeSplitLayout.addChild(thirdThird);
        addChild(threeSplitLayout);
        // Add the main layer:
        addChild(mainLayer);
    }
}
