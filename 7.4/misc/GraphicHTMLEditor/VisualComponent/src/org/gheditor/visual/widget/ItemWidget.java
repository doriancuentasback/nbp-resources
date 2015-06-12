package org.gheditor.visual.widget;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.border.LineBorder;
import org.gheditor.visual.items.filesupport.Item;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.WidgetAction;
import org.netbeans.api.visual.border.BorderFactory;
import org.netbeans.api.visual.widget.LabelWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.openide.filesystems.FileObject;
import org.openide.util.Lookup;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;

public class ItemWidget extends LabelWidget {
    private final InstanceContent ic;
    private Lookup itemLookup;
    public ItemWidget(FileObject fo, Scene scene, Point point, Item item) {
        super(scene, item.getDisplayname());
        ic = new InstanceContent();
        ic.add(item);
        //Every widget that is dropped gets its own unique id:
        setLabel(item.getDisplayname());
        setPreferredSize(new Dimension(item.getWidth(), item.getHeight()));
        item.setX(point.x);
        item.setY(point.y);
        setPreferredLocation(point);
        // ResizeAction must be before the MoveAction:
        setBorder(new LineBorder(Color.BLACK, 1));
        ItemWidgetResizeProvider iwrp = new ItemWidgetResizeProvider(fo, this);
        getActions().addAction(ActionFactory.createResizeAction(iwrp, iwrp));
        getActions().addAction(ActionFactory.createMoveAction(ActionFactory.createFreeMoveStrategy(), new ItemWidgetMoveProvider(fo, this)));
//        WidgetAction hoverAction = ActionFactory.createHoverAction(new TwoStateHoverProvider() {
//            @Override
//            public void unsetHovering(Widget w) {
//                w.setBorder(BorderFactory.createLineBorder(1));
//            }
//            @Override
//            public void setHovering(Widget w) {
//                w.setBorder(BorderFactory.createResizeBorder(8, Color.BLACK, false));
//            }
//        });
//        getActions().addAction(hoverAction);
//        scene.getActions().addAction(hoverAction);
          getActions().addAction(mouseAction);
    }
    @Override
    public Lookup getLookup() {
        if (itemLookup == null) {
            itemLookup = new AbstractLookup(ic);
        }
        return itemLookup;
    }
    private final WidgetAction.Adapter mouseAction = new WidgetAction.Adapter() {
        @Override
        public State mouseClicked(Widget widget, WidgetMouseEvent event) {
            toggleResizeBorder();
            return State.CONSUMED;
        }
        @Override
        public State mouseMoved(Widget widget, WidgetMouseEvent event) {
            // System.out.println(event.getPoint());
            return State.CONSUMED;
        }
    };
    private boolean toggleResizeBorderFlag = true;
    private void toggleResizeBorder() {
        if (toggleResizeBorderFlag) {
            addResizeBorder();
        } else {
            removeResizeBorder();
        }
        toggleResizeBorderFlag = !toggleResizeBorderFlag;
    }
    private void addResizeBorder() {
        setBorder(BorderFactory.createResizeBorder(8, Color.BLACK, false));
        bringToFront();
        revalidate();
        repaint();
    }
    private void removeResizeBorder() {
        setBorder(BorderFactory.createLineBorder(1));
        revalidate();
        repaint();
        bringToBack();
    }
}
//Reference: http://myjscl.googlecode.com/svn-history/r59/trunk/src/pl/softech/gpw/candles/editorold/CandleWidget2.java