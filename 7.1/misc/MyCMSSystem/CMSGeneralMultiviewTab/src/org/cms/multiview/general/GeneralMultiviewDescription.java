/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cms.multiview.general;

import java.awt.Image;
import java.io.Serializable;
import org.cms.api.Article;
import org.cms.utils.lookup.ContextAwareInstance;
import org.netbeans.core.spi.multiview.MultiViewDescription;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.openide.util.HelpCtx;
//import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.windows.TopComponent;

/**
 *
 * @author geertjan
 */

public class GeneralMultiviewDescription implements MultiViewDescription, ContextAwareInstance<GeneralMultiviewDescription>, Serializable {

    public static final long serialVersionUID = 3L;

    private final Article article;
    
    public GeneralMultiviewDescription() {
        this(null);
    }
    
    public GeneralMultiviewDescription(Article article) {
        this.article = article;
    }
    
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ONLY_OPENED;
    }

    public String getDisplayName() {
        return "General";
    }

    public Image getIcon() {
        return null;//ImageUtilities.loadImage("/org/myorg/Generalfiletype/Datasource.gif");
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    public String preferredID() {
       return "general";
    }

    public MultiViewElement createElement() {
        assert article != null : "Can't create MultiViewElement without knowing the Article!";
        return new GeneralTopComponent(article);
    }

    @Override
    public GeneralMultiviewDescription createContextAwareInstance(Lookup context) {
        return new GeneralMultiviewDescription(context.lookup(Article.class));
    }

}