package org.o.explorer;

import java.beans.IntrospectionException;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import org.o.api.MyObject;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

public class ObjectNode extends BeanNode implements PropertyChangeListener {

    MyObject bean;

    public ObjectNode(MyObject bean) throws IntrospectionException {
        super(bean, Children.createLazy(new ObjectCallable(bean)),
                Lookups.singleton(bean));
        this.bean = bean;
        setDisplayName(bean.getType());
        bean.addPropertyChangeListener(this);
    }

    @Override
    public Action getPreferredAction() {
        return null;
    }

    @Override
    public Action[] getActions(boolean context) {
        return new Action[]{new AddAction(bean)};
    }

    @Override
    public boolean canRename() {
        return true;
    }

    @Override
    public void setName(String s) {
        MyObject mo = getLookup().lookup(MyObject.class);
        String oldDisplayName = mo.getType();
        mo.setType(s);
        fireNameChange(oldDisplayName, s);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("ADD")) {
            setChildren(Children.create(new ObjectChildFactory(bean), false));
        } else if (evt.getPropertyName().equals("type")) {
            setDisplayName(bean.getType());
        }
    }
}
