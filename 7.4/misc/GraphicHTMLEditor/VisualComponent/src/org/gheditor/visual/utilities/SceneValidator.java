package org.gheditor.visual.utilities;

import java.awt.Point;
import org.gheditor.visual.items.filesupport.Item;
import org.netbeans.api.visual.widget.Scene;

public class SceneValidator {

     public static boolean validate(Scene scene, Item item, Point point) {
        int sceneHeight = scene.getView().getBounds().height;
        int sceneWidth = scene.getView().getBounds().width;
        double yPoint = point.getLocation().getY();
        double xPoint = point.getLocation().getX();
        if (item.getType().equals("header")) {
            return yPoint < sceneHeight / 3 - item.getHeight()
                    && yPoint > 20
                    && xPoint > 20 
                    && xPoint < sceneWidth - item.getWidth(); 
        } else if (item.getType().equals("body")) {
            return yPoint < sceneHeight / 3 * 2 - item.getHeight()
                    && yPoint > sceneHeight / 3 + 20
                    && xPoint > 20 
                    && xPoint < sceneWidth - item.getWidth(); 
        } else if (item.getType().equals("footer")) {
            return yPoint > sceneHeight - sceneHeight / 3 + 20
                    && yPoint < sceneHeight - item.getHeight() 
                    && xPoint > 20 
                    && xPoint < sceneWidth - item.getWidth(); 
        }
        return false;
    }
    
}
