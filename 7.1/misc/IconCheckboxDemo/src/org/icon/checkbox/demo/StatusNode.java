package org.icon.checkbox.demo;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.lang.reflect.InvocationTargetException;
import javax.swing.*;
import org.openide.explorer.propertysheet.ExPropertyEditor;
import org.openide.explorer.propertysheet.InplaceEditor;
import org.openide.explorer.propertysheet.PropertyEnv;
import org.openide.explorer.propertysheet.PropertyModel;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.PropertySupport;
import org.openide.nodes.Sheet;
import org.openide.util.ImageUtilities;
import org.openide.util.lookup.Lookups;

public class StatusNode extends AbstractNode {

    private Icon selected = new DiamondIcon(Color.RED, true);
    private Icon unselected = new DiamondIcon(Color.BLACK, false);

    public StatusNode(StatusObject statusObject) {
        super(Children.LEAF, Lookups.singleton(statusObject));
    }

    @Override
    protected Sheet createSheet() {
        Sheet sheet = Sheet.createDefault();
        Sheet.Set set = Sheet.createPropertiesSet();
        set.put(new StatusProperty(getLookup().lookup(StatusObject.class)));
        sheet.put(set);
        return sheet;
    }

    public class StatusProperty extends PropertySupport.ReadWrite<String> {

        private StatusObject statusObject;

        public StatusProperty(StatusObject statusObject) {
            super("visible", String.class, "visible", "Visibility of Object");
            this.statusObject = statusObject;
        }

        @Override
        public PropertyEditor getPropertyEditor() {
            return new StatusPropertyEditorSupport(statusObject);
        }

        @Override
        public String getValue() throws IllegalAccessException,
                InvocationTargetException {
            return String.valueOf(statusObject.isVisible());
        }

        @Override
        public void setValue(String newValue) throws IllegalAccessException,
                IllegalArgumentException, InvocationTargetException {
            statusObject.setVisible(Boolean.valueOf(newValue));
        }
        
    }

    private class StatusPropertyEditorSupport extends PropertyEditorSupport implements ExPropertyEditor, InplaceEditor.Factory {

        private StatusObject statusObject;

        private StatusPropertyEditorSupport(StatusObject statusObject) {
            this.statusObject = statusObject;
        }

        @Override
        public boolean isPaintable() {
            return true;
        }

        @Override
        public void paintValue(Graphics g, Rectangle r) {
            Image image;
            if (statusObject.isVisible()) {
                image = ImageUtilities.icon2Image(selected);
            } else {
                image = ImageUtilities.icon2Image(unselected);
            }
            ImageIcon icon = new ImageIcon(image);
            if (icon != null) {
                int iconWidth = icon.getIconWidth();
                int iconHeight = icon.getIconHeight();
                double scale = (double) iconWidth / iconHeight;
                if (iconWidth > r.width) {
                    iconWidth = r.width;
                    iconHeight = (int) (iconWidth / scale);
                }
                if (iconHeight > r.height) {
                    iconHeight = r.height;
                    iconWidth = (int) (iconHeight / scale);
                }
                int x;
                if (iconWidth < r.x) {
                    x = (r.x - iconWidth) / 2;
                } else {
                    x = -1;
                }
                int y;
                if (iconHeight < r.y) {
                    y = (r.y - iconHeight) / 2;
                } else {
                    y = 5;
                }
                Graphics g2 = g.create(r.x, r.y, r.width, r.height);
                g2.drawImage(icon.getImage(), x, y, iconWidth, iconHeight, null);
            }

        }

        @Override
        public void attachEnv(PropertyEnv env) {
            env.registerInplaceEditorFactory(this);
        }
        private InplaceEditor ed = null;

        @Override
        public InplaceEditor getInplaceEditor() {
            if (ed == null) {
                ed = new Inplace(statusObject);
            }
            return ed;
        }
        
    }

    public class Inplace implements InplaceEditor {

        private final JCheckBox cb = new JCheckBox(selected);
        private PropertyEditor editor = null;
        private final StatusObject c;

        private Inplace(final StatusObject c) {
            this.c = c;
        }

        @Override
        public void connect(PropertyEditor propertyEditor, PropertyEnv env) {
            editor = propertyEditor;
            reset();
        }

        @Override
        public JComponent getComponent() {
            cb.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    reset();
                }
            });
            return cb;
        }

        @Override
        public void clear() {
            editor = null;
            model = null;
        }

        @Override
        public Object getValue() {
            return String.valueOf(c.isVisible());
        }

        @Override
        public void setValue(Object object) {
            Boolean valueOf = Boolean.valueOf((String) object);
            c.setVisible(valueOf);
        }

        @Override
        public boolean supportsTextEntry() {
            return false;
        }

        @Override
        public void reset() {
            if (cb.isSelected()) {
                c.setVisible(true);
                cb.setIcon(selected);
                cb.setSelectedIcon(selected);
            } else {
                c.setVisible(false);
                cb.setIcon(unselected);
            }
        }

        @Override
        public KeyStroke[] getKeyStrokes() {
            return new KeyStroke[0];
        }

        @Override
        public PropertyEditor getPropertyEditor() {
            return editor;
        }

        @Override
        public PropertyModel getPropertyModel() {
            return model;
        }
        private PropertyModel model;

        @Override
        public void setPropertyModel(PropertyModel propertyModel) {
            this.model = propertyModel;
        }

        @Override
        public boolean isKnownComponent(Component component) {
            return component == cb || cb.isAncestorOf(component);
        }

        @Override
        public void addActionListener(ActionListener actionListener) {
        }

        @Override
        public void removeActionListener(ActionListener actionListener) {
        }
    }

    class DiamondIcon implements Icon {

        private Color color;
        private boolean selected;
        private int width;
        private int height;
        private Polygon poly;
        private static final int DEFAULT_WIDTH = 10;
        private static final int DEFAULT_HEIGHT = 10;

        public DiamondIcon(Color color) {
            this(color, true, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        }

        public DiamondIcon(Color color, boolean selected) {
            this(color, selected, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        }

        public DiamondIcon(Color color, boolean selected, int width, int height) {
            this.color = color;
            this.selected = selected;
            this.width = width;
            this.height = height;
            initPolygon();
        }

        private void initPolygon() {
            poly = new Polygon();
            int halfWidth = width / 2;
            int halfHeight = height / 2;
            poly.addPoint(0, halfHeight);
            poly.addPoint(halfWidth, 0);
            poly.addPoint(width, halfHeight);
            poly.addPoint(halfWidth, height);
        }

        @Override
        public int getIconHeight() {
            return height;
        }

        @Override
        public int getIconWidth() {
            return width;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            g.setColor(color);
            g.translate(x, y);
            if (selected) {
                g.fillPolygon(poly);
            } else {
                g.drawPolygon(poly);
            }
            g.translate(-x, -y);
        }
        
    }
    
}