package org.gheditor.visual.widget;

import java.awt.Point;
import org.gheditor.visual.utilities.SceneSerializer;
import org.gheditor.visual.utilities.SceneValidator;
import org.gheditor.visual.items.filesupport.Item;
import org.netbeans.api.visual.action.MoveProvider;
import org.netbeans.api.visual.widget.Widget;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

public class ItemWidgetMoveProvider implements MoveProvider {
    private Item item;
    private Point point;
    private final FileObject fo;
    private final ItemWidget iw;
    private final String originalLabel;
    public ItemWidgetMoveProvider(FileObject fo, ItemWidget iw) {
        this.fo = fo;
        this.iw = iw;
        this.originalLabel = iw.getLabel();
    }
    @Override
    public void movementStarted(Widget widget) {
    }
    @Override
    public void movementFinished(Widget widget) {
        item = widget.getLookup().lookup(Item.class);
        if (item != null && point != null) {
            item.setX(point.x);
            item.setY(point.y);
            SceneSerializer.serialize(widget.getScene(), item, FileUtil.toFile(fo));
//        StatusDisplayer.getDefault().setStatusText(
//                "New x and y: "
//                + item.getX()
//                + " / "
//                + item.getY());
        }
        iw.setLabel(originalLabel);
    }
    @Override
    public Point getOriginalLocation(Widget widget) {
        return widget.getPreferredLocation();
    }
    @Override
    public void setNewLocation(Widget widget, Point point) {
        iw.setLabel(widget.getLocation().x + "/" + widget.getLocation().y);
        item = widget.getLookup().lookup(Item.class);
        if (SceneValidator.validate(widget.getScene(), item, point)) {
            this.point = point;
            widget.setPreferredLocation(point);

        }
    }
}
