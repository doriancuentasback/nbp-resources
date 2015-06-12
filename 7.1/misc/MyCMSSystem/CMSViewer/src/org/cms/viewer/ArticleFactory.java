/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cms.viewer;

import java.util.List;
import javax.swing.Action;
import org.cms.api.Article;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Utilities;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;

/**
 *
 * @author geertjan
 */
class ArticleFactory extends ChildFactory<Article> {

    @Override
    protected boolean createKeys(List<Article> toPopulate) {
        Article a1 = new Article("Test Article", setContent("Test Article"), setGroovy("Test Article"));
        Article a2 = new Article("jhgjhg", setContent("jhgjhg"), setGroovy("Test Article"));
        Article a3 = new Article("Std", setContent("Std"), setGroovy("Test Article"));
        toPopulate.add(a1);
        toPopulate.add(a2);
        toPopulate.add(a3);
        return true;
    }

    @Override
    protected Node createNodeForKey(Article key) {
        return new ArticleNode(key, new InstanceContent());
    }

    private class ArticleNode extends AbstractNode {

        private ArticleNode(final Article article, InstanceContent content) {
            super(Children.LEAF, new AbstractLookup(content));
            setDisplayName(article.getTitle());
            content.add(article);
        }

        //Double-click on the node and this is performed:
        @Override
        public Action getPreferredAction() {
            return Utilities.actionsForPath("Actions/Articles/").get(0);
        }

        @Override
        public Action[] getActions(boolean context) {
            return new Action[]{Utilities.actionsForPath("Actions/Articles/").get(0)};
        }
    }

    private String setContent(String text) {
        return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"
                + "<html>\n"
                + "  <head>\n"
                + "     <title>\n"
                + "     </title>\n"
                + "  </head>\n"
                + "  <body>\n"
                + "    <h1>\n"
                + "       hello " + text + "\n"
                + "    </h1>\n"
                + "  </body>\n"
                + "</html>\n";
    }

    private String setGroovy(String text) {
        return "def scores = [80, 90, 70]\n\n\"\"\"Maximum: ${scores.max()}\n"
                + "Minimum: ${scores.min()}\"\"\"";
    }
    
}
