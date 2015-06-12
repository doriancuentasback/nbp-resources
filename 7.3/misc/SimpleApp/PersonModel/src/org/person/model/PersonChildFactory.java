/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.person.model;

import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.person.domain.Person;

/**
 *
 * @author geertjan
 */
public class PersonChildFactory extends ChildFactory<Person> {

    @Override
    protected boolean createKeys(List<Person> list) {
        list.add(new Person("student"));
        list.add(new Person("teacher"));
        list.add(new Person("professor"));
        return true;
    }

    @Override
    protected Node createNodeForKey(Person key) {
        PersonNode node = null;
        try {
            node = new PersonNode(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }
    
}
