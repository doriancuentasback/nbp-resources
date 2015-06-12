package org.terminal.container;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import javax.swing.DefaultSingleSelectionModel;
import javax.swing.JComponent;
import javax.swing.SingleSelectionModel;
import javax.swing.plaf.ComponentUI;
import org.netbeans.swing.tabcontrol.TabDisplayer;
import org.netbeans.swing.tabcontrol.TabDisplayerUI;

public class NoTabsTabDisplayerUI extends TabDisplayerUI {
    
    public NoTabsTabDisplayerUI(TabDisplayer displayer) {
        super(displayer);
    }
    
    public static ComponentUI createUI(JComponent jc) {
        assert jc instanceof TabDisplayer;
        return new NoTabsTabDisplayerUI((TabDisplayer) jc);
    }
    
    private static final int[] PTS = new int[] { 0, 0, 0 };
    @Override
    public Polygon getExactTabIndication(int i) {
        //Should never be called
        return new Polygon(PTS, PTS, PTS.length);
    }
    
    @Override
    public Polygon getInsertTabIndication(int i) {
        return new Polygon(PTS, PTS, PTS.length);
    }
    
    @Override
    public int tabForCoordinate(Point point) {
        return -1;
    }
    
    @Override
    public Rectangle getTabRect(int i, Rectangle rectangle) {
        return new Rectangle(0,0,0,0);
    }
    
    @Override
    protected SingleSelectionModel createSelectionModel() {
        return new DefaultSingleSelectionModel();
    }
    
    public java.lang.String getCommandAtPoint(Point point) {
        return null;
    }
    
    @Override
    public int dropIndexOfPoint(Point point) {
        return -1;
    }
    
    @Override
    public void registerShortcuts(javax.swing.JComponent jComponent) {
        //do nothing
    }
    
    @Override
    public void unregisterShortcuts(javax.swing.JComponent jComponent) {
        //do nothing
    }
    
    @Override
    protected void requestAttention(int i) {
        //do nothing
    }
    
    @Override
    protected void cancelRequestAttention(int i) {
        //do nothing
    }
    
    @Override
    public Dimension getPreferredSize(javax.swing.JComponent c) {
        return new Dimension(0, 0);
    }
    
    @Override
    public Dimension getMinimumSize(javax.swing.JComponent c) {
        return new Dimension(0, 0);
    }
    
    @Override
    public Dimension getMaximumSize(javax.swing.JComponent c) {
        return new Dimension(0, 0);
    }
}