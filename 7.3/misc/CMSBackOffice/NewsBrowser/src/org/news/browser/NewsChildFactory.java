/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.news.browser;

import java.beans.IntrospectionException;
import java.util.List;
import org.news.domain.News;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author Geertjan
 */
public class NewsChildFactory extends ChildFactory<News> {

    @Override
    protected boolean createKeys(List<News> list) {
        //connection to REST resources
        list.add(new News("World ends this year","Not a happy article.","var time=new Date().getHours();"));
        list.add(new News("Christmas comes early","Father Christmas interviews.","if (time<20)x = \"Good day\";"));
        list.add(new News("Strikes in Belgium","Interviews and discussions.","var x=\"\";"));
        return true;
    }

    @Override
    protected Node createNodeForKey(News t) {
        NewsNode nn = null;
        try {
            nn = new NewsNode(t);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return nn;
    }
    
    
    
}
