/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.census.palette;

import java.beans.IntrospectionException;
import java.util.List;
import java.util.Locale;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author rejun001
 */
public class CategoryChildFactory extends ChildFactory<String> {

    @Override
    protected boolean createKeys(List<String> list) {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            list.add(String.valueOf(letter));
        }
        return true;
    }

    @Override
    protected Node createNodeForKey(String category) {
        Node node = new AbstractNode(Children.create(new CountryChildFactory(category), true));
        node.setDisplayName(category);
        return node;
    }

    private class CountryChildFactory extends ChildFactory<Country> {

        private String category;

        public CountryChildFactory(String category) {
            this.category = category;
        }

        @Override
        protected boolean createKeys(List<Country> list) {
            Locale[] locales = Locale.getAvailableLocales();
            for (Locale locale : locales) {
                if (locale.getDisplayCountry().startsWith(category)) {
                    Country country = new Country();
                    country.setName(locale.getDisplayCountry());
                    list.add(country);
                }
            }
            return true;
        }

        @Override
        protected Node createNodeForKey(Country country) {
            CountryNode node = null;
            try {
                node = new CountryNode(country);
            } catch (IntrospectionException ex) {
                Exceptions.printStackTrace(ex);
            }
            return node;
        }
    }
}
