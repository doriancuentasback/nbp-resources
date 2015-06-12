package org.myorg.myeditor;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import javax.swing.*;
import org.myorg.myapi.Event;
import org.openide.ErrorManager;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.PropertySupport;
import org.openide.nodes.Sheet;
import org.openide.util.ImageUtilities;
import org.openide.util.WeakListeners;
import org.openide.util.actions.Presenter;
import org.openide.util.lookup.Lookups;

public class EventNode extends AbstractNode implements PropertyChangeListener {

    public EventNode(Event obj) {
        super(Children.create(new EventChildFactory(), true), Lookups.singleton(obj));
        obj.addPropertyChangeListener(WeakListeners.propertyChange(this, obj));
        setDisplayName("Event " + obj.getIndex());
    }

    public EventNode() {
        super(Children.create(new EventChildFactory(), true));
        setDisplayName("Root");
    }

    @Override
    protected Sheet createSheet() {

        Sheet sheet = Sheet.createDefault();
        Sheet.Set set = Sheet.createPropertiesSet();
        Sheet.Set set2 = Sheet.createPropertiesSet();
        set2.setDisplayName("Other");
        set2.setName("other");
        Event obj = getLookup().lookup(Event.class);

        try {

            Property indexProp = new PropertySupport.Reflection(obj, Integer.class, "getIndex", null);
            //Property dateProp = new PropertySupport.Reflection(obj, Date.class, "getDate", null);
            //Property dateProp = new PropertySupport.Reflection(obj, Date.class, "date");
            PropertySupport.Reflection dateProp = new PropertySupport.Reflection(obj, Date.class, "date");
            dateProp.setPropertyEditorClass(DatePropertyEditor.class);
            
            indexProp.setName("index");
            dateProp.setName("date");

            set.put(indexProp);
            set.put(dateProp);

            set2.put(dateProp);
            set2.setValue("tabName", "Other Tab");

        } catch (NoSuchMethodException ex) {
            ErrorManager.getDefault();
        }

        sheet.put(set);
        sheet.put(set2);
        return sheet;

    }

    @Override
    public String getHtmlDisplayName() {
        Event obj = getLookup().lookup(Event.class);
        if (obj != null) {
            return "<font color='!textText'>Event " + obj.getIndex() + "</font>"
                    + "<font color='!controlShadow'><i>" + obj.getDate() + "</i></font>";
        } else {
            return null;
        }
    }

    @Override
    public Action[] getActions(boolean popup) {
        return new Action[]{new MyAction()};
    }

    @Override
    public Image getIcon(int type) {
        return ImageUtilities.loadImage("org/myorg/myeditor/icon.png");
    }

    @Override
    public Image getOpenedIcon(int i) {
        return getIcon(i);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("date".equals(evt.getPropertyName())) {
            this.fireDisplayNameChange(null, getDisplayName());
        }
    }

    private class MyAction extends AbstractAction implements Presenter.Popup {

        public MyAction() {
            putValue(NAME, "Do Something");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Event obj = getLookup().lookup(Event.class);
            JOptionPane.showMessageDialog(null, "Hello from " + obj);
        }

        @Override
        public JMenuItem getPopupPresenter() {
            JMenu result = new JMenu("Submenu");  //remember JMenu is a subclass of JMenuItem
            result.add(new JMenuItem(this));
            result.add(new JMenuItem(this));
            return result;
        }
    }
}
