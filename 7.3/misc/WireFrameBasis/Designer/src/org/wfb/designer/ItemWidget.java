package org.wfb.designer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import org.netbeans.api.visual.border.BorderFactory;
import org.netbeans.api.visual.widget.LabelWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.general.IconNodeWidget;
import org.openide.util.Lookup;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.wfb.domain.Item;

public class ItemWidget extends IconNodeWidget {

    private Lookup lookup;
    private InstanceContent ic;

    public ItemWidget(Scene scene, Item item, int total) {
        super(scene, TextOrientation.RIGHT_CENTER);
        ic = new InstanceContent();
        ic.add(item);
        String name = item.getDisplayName();
        setLabel(name);
        setToolTipText(name);
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(2, Color.BLACK));
//        setBackground(Color.CYAN);
        setPreferredBounds(new Rectangle(20+total, 20, 50, 20));
    }
  
    @Override
    public Lookup getLookup() {
        if (lookup == null) {
            lookup = new AbstractLookup(ic);
        }
        return lookup;
    }
    
}
