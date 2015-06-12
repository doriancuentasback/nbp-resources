package org.gheditor.visual.widget;

import java.awt.Rectangle;
import org.gheditor.visual.utilities.SceneSerializer;
import org.gheditor.visual.items.filesupport.Item;
import org.netbeans.api.visual.action.ResizeProvider;
import org.netbeans.api.visual.action.ResizeStrategy;
import org.netbeans.api.visual.widget.Widget;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

public class ItemWidgetResizeProvider implements ResizeProvider, ResizeStrategy {
    private final FileObject fo;
    private final ItemWidget iw;
    private final String originalLabel;
    public ItemWidgetResizeProvider(FileObject fo, ItemWidget iw) {
        this.fo = fo;
        this.iw = iw;
        this.originalLabel = iw.getLabel();
    }
    @Override
    public void resizingStarted(Widget widget) {
    }
    @Override
    public void resizingFinished(Widget widget) {
        Item item = widget.getLookup().lookup(Item.class);
        int x = widget.getBounds().x;
        int y = widget.getBounds().y;
        StatusDisplayer.getDefault().setStatusText(
                "New x and y: "
                + x + " / "
                + y);
//        if (SceneValidator.validate(widget.getScene(), item, new Point(x, y))) {
            item.setWidth(widget.getBounds().width);
            item.setHeight(widget.getBounds().height);
            SceneSerializer.serialize(widget.getScene(), item, FileUtil.toFile(fo));
//        } 
        iw.setLabel(originalLabel);
    }
    @Override
    public Rectangle boundsSuggested(Widget widget, Rectangle original, Rectangle suggested, ControlPoint cp) {
        iw.setLabel(suggested.width+"/"+suggested.height);
        final Rectangle result = new Rectangle(suggested);
        return result;
    }
}
