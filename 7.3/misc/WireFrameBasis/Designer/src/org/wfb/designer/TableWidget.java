package org.wfb.designer;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.Action;
import javax.swing.JPopupMenu;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.PopupMenuProvider;
import org.netbeans.api.visual.border.BorderFactory;
import org.netbeans.api.visual.layout.LayoutFactory;
import org.netbeans.api.visual.widget.LabelWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.openide.util.Lookup;
import org.openide.util.Utilities;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.TopComponent;
import org.wfb.domain.Table;

public class TableWidget extends LabelWidget {

    private Lookup lookup;
    private InstanceContent ic;

    public TableWidget(Scene scene, final Table table, TopComponent tc, int count, int total) {
        super(scene);
        ic = new InstanceContent();
        ic.add(table);
        String name = table.getDisplayName();
        setLabel(name);
        setToolTipText(name);
        setPreferredBounds(new Rectangle(20, total, tc.getWidth() - 40, 100));
        setBorder(BorderFactory.createLineBorder(2, Color.RED));
        setLayout(LayoutFactory.createVerticalFlowLayout(LayoutFactory.SerialAlignment.JUSTIFY, 0));
        getActions().addAction(ActionFactory.createPopupMenuAction(new PopupMenuProvider() {
            @Override
            public JPopupMenu getPopupMenu(Widget widget, Point point) {
                JPopupMenu jm = new JPopupMenu();
                List<? extends Action> tableActions = Utilities.actionsForPath("Actions/Table");
                for (Action action : tableActions) {
                    jm.add(action);
                }
                return jm;
            }
        }));
    }

    @Override
    public Lookup getLookup() {
        if (lookup == null) {
            lookup = new AbstractLookup(ic);
        }
        return lookup;
    }
    
}
