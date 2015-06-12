/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.census.palette;

import java.awt.Point;
import java.io.IOException;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.MoveProvider;
import org.netbeans.api.visual.widget.LabelWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.netbeans.spi.actions.AbstractSavable;
import org.openide.util.Lookup;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.TopComponent;

public class MyWidget extends LabelWidget {
    
    private MySavable mySavable;
    private Lookup lookup;
    private TopComponent tc;
    private InstanceContent ic;
    
    public MyWidget(Scene scene, String label, TopComponent tc) {
        super(scene, label);
        this.tc = tc;
        ic = new InstanceContent();
        getActions().addAction(ActionFactory.createMoveAction(null, new MoveStrategyProvider()));
    }
    
    @Override
    public Lookup getLookup() {
        if (lookup == null) {
            lookup = new AbstractLookup(ic);
        }
        return lookup;
    }
    
    private class MoveStrategyProvider implements MoveProvider {
        @Override
        public void movementStarted(Widget widget) {
        }
        @Override
        public void movementFinished(Widget widget) {
            modify();
        }
        @Override
        public Point getOriginalLocation(Widget widget) {
            return ActionFactory.createDefaultMoveProvider().getOriginalLocation(widget);
        }
        @Override
        public void setNewLocation(Widget widget, Point point) {
            ActionFactory.createDefaultMoveProvider().setNewLocation(widget, point);
        }
    }
    
    private void modify() {
        if (getLookup().lookup(MySavable.class) == null) {
            ic.add(mySavable = new MySavable());
        }
    }
    
    private class MySavable extends AbstractSavable {
        public MySavable() {
            register();
        }
        TopComponent tc() {
            return tc;
        }
        @Override
        protected String findDisplayName() {
            return getLabel();
        }
        @Override
        protected void handleSave() throws IOException {
            ic.remove(mySavable);
            unregister();
        }
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MySavable) {
                MySavable m = (MySavable) obj;
                return tc() == m.tc();
            }
            return false;
        }
        @Override
        public int hashCode() {
            return tc().hashCode();
        }
    }

}