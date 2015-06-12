package org.news.browser;

import java.awt.event.ActionEvent;
import java.beans.IntrospectionException;
import java.io.Serializable;
import javax.swing.AbstractAction;
import javax.swing.Action;
import org.netbeans.core.api.multiview.MultiViews;
import org.news.domain.News;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.NbBundle;
import org.openide.util.lookup.Lookups;
import org.openide.windows.Mode;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

public class NewsNode extends BeanNode implements Serializable {

    public NewsNode(News news) throws IntrospectionException {
        super(news, Children.LEAF, Lookups.singleton(news));
        setDisplayName(news.getTitle());
    }

    @Override
    public Action[] getActions(boolean arg0) {
        return new Action[]{new OpenNewsAction()};
    }

    @Override
    public Action getPreferredAction() {
        return new OpenNewsAction();
    }

    @NbBundle.Messages("OpenNews=Open")
    private class OpenNewsAction extends AbstractAction {

        public OpenNewsAction() {
            super(Bundle.OpenNews());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            News news = getLookup().lookup(News.class);
            Mode editorMode = WindowManager.getDefault().findMode("editor");
            for (TopComponent tc : WindowManager.getDefault().getOpenedTopComponents(editorMode)) {
                if (tc.getDisplayName().equals(news.getTitle())) {
                    tc.requestActive();
                    return;
                }
            }
            TopComponent tc = MultiViews.createMultiView("application/x-newsnode", NewsNode.this);
            tc.open();
            tc.requestActive();
        }
        
    }
    
}
