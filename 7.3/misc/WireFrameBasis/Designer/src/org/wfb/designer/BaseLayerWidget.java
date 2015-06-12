package org.wfb.designer;

import java.awt.Color;
import java.awt.Graphics2D;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Scene;
import org.openide.windows.TopComponent;

public class BaseLayerWidget extends LayerWidget {
    
    private final TopComponent tc;

    public BaseLayerWidget(Scene scene, TopComponent tc) {
        super(scene);
        this.tc = tc;
    }

    @Override
    protected void paintWidget() {
        Graphics2D drawingGraphics = getGraphics();
        drawingGraphics.setPaint(new Color(20, 170, 120));
        drawingGraphics.fillRect(0, 0, tc.getWidth(), tc.getHeight());
    }

}
