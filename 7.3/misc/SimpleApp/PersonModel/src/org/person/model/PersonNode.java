/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.person.model;

import java.beans.IntrospectionException;
import java.util.List;
import java.util.Set;
import javax.swing.Action;
import org.netbeans.api.actions.Openable;
import org.openide.filesystems.FileUtil;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.Utilities;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
import org.person.domain.Person;
import org.person.domain.capabilities.Synchronizable;
import org.person.editor.PersonEditorTopComponent;

/**
 *
 * @author geertjan
 */
public class PersonNode extends BeanNode<Person> {

    public PersonNode(Person person) throws IntrospectionException {
        this(person, new InstanceContent());
    }

    private PersonNode(final Person person, InstanceContent ic) throws IntrospectionException {
        super(person, Children.LEAF, new AbstractLookup(ic));
        ic.add(new Openable() {
            @Override
            public void open() {
                TopComponent tc = findTopComponent(person);
                if (tc == null) {
                    tc = new PersonEditorTopComponent(person);
                    tc.open();
                }
                tc.requestActive();
            }
        });
        ic.add(new Synchronizable() {
            @Override
            public Person getPerson() {
                return person;
            }
        });
        setDisplayName(person.getType());
    }

    private TopComponent findTopComponent(Person person) {
        Set<TopComponent> openTopComponents = WindowManager.getDefault().getRegistry().getOpened();
        for (TopComponent tc : openTopComponents) {
            if (tc.getLookup().lookup(Person.class) == person) {
                return tc;
            }
        }
        return null;
    }

    @Override
    public Action getPreferredAction() {
        return FileUtil.getConfigObject("Actions/PersonActions/org-person-viewer-PersonOpenAction.instance", Action.class);
    }
    
    @Override
    public Action[] getActions(boolean context) {
        List<? extends Action> personActions = Utilities.actionsForPath("Actions/PersonActions");
        return personActions.toArray(new Action[personActions.size()]);
    }
    
}
