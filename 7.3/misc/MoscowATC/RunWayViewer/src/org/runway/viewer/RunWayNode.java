package org.runway.viewer;

import java.awt.event.ActionEvent;
import java.beans.IntrospectionException;
import java.net.URL;
import javax.swing.AbstractAction;
import javax.swing.Action;
import org.netbeans.api.actions.Openable;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.URLMapper;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.Exceptions;
import org.openide.util.lookup.Lookups;
import org.runway.api.RunWay;

public class RunWayNode extends BeanNode {

    RunWay bean;

    public RunWayNode(RunWay bean) throws IntrospectionException {
        super(bean, Children.create(new EngineerChildFactory(bean), true), Lookups.singleton(bean));
        this.bean = bean;
        setName(bean.getName());
    }

    @Override
    public Action getPreferredAction() {
        return new AbstractAction("View Runway") {
            @Override
            public void actionPerformed(ActionEvent e) {
                URL iconBase = bean.getImageLoc();
                FileObject imageFO = URLMapper.findFileObject(iconBase);
                try {
                    DataObject imageObject = DataObject.find(imageFO);
                    Openable openable = imageObject.getLookup().lookup(Openable.class);
                    openable.open();
                } catch (DataObjectNotFoundException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        };
    }
}
