package org.gheditor.visual;

import java.awt.Rectangle;
import java.util.List;
import org.netbeans.api.visual.layout.Layout;
import org.netbeans.api.visual.widget.Widget;

class VisualMultiViewSceneLayout implements Layout {
    @Override
    public void layout(Widget widget) {
        for (Widget child : widget.getChildren()) {
            child.resolveBounds(null, null);
        }
    }
    @Override
    public boolean requiresJustification(Widget widget) {
        return true;
    }
    @Override
    public void justify(Widget widget) {
        int width = widget.getScene().getView().getBounds().width-2;
        int height = widget.getScene().getView().getBounds().height-20;
        Rectangle sceneBounds = new Rectangle(width,height);
        List<Widget> children = widget.getChildren();
        children.get(0).resolveBounds(
                null,
                new Rectangle(
                        sceneBounds.x,
                        sceneBounds.y,
                        sceneBounds.width,
                        sceneBounds.height / 3));
        children.get(1).resolveBounds(
                null,
                new Rectangle(
                        sceneBounds.x,
                        sceneBounds.y + sceneBounds.height/3,
                        sceneBounds.width,
                        sceneBounds.height / 3));
        children.get(2).resolveBounds(
                null,
                new Rectangle(
                        sceneBounds.x,
                        height-sceneBounds.height/3,
                        sceneBounds.width,
                        sceneBounds.height / 3));
       
    }
}
