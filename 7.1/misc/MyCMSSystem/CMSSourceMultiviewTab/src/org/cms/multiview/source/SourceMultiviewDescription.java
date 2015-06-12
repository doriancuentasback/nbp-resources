/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cms.multiview.source;

import java.awt.Image;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import org.cms.api.Article;
import org.cms.utils.lookup.ContextAwareInstance;
import org.netbeans.core.spi.multiview.MultiViewDescription;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileSystem;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.util.HelpCtx;
import org.openide.util.Lookup;
import org.openide.windows.TopComponent;

/**
 *
 * @author geertjan
 */
public class SourceMultiviewDescription implements MultiViewDescription, ContextAwareInstance<SourceMultiviewDescription>, Serializable {

    public static final long serialVersionUID = 3L;

    private final Article article;
    
    public SourceMultiviewDescription() {
        this(null);
        
    }

    private SourceMultiviewDescription(Article article) {
        this.article = article;
    }
    
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ONLY_OPENED;
    }

    public String getDisplayName() {
        return "HTML";
    }

    public Image getIcon() {
        return null;//ImageUtilities.loadImage("/org/myorg/Generalfiletype/Datasource.gif");
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    public String preferredID() {
        return "source";
    }

//    public MultiViewElement createElement() {
//        return new SourceTopComponent();
//    }
    public MultiViewElement createElement() {
        assert article != null : "Can't create MultiViewElement without knowing the Article!";
        
        try {
            FileObject file = article2file(article);
            DataObject data = DataObject.find(file);
            return new ArticleSourceEditor(data.getLookup());
        } catch (IOException ioe) {
            // XXX: this is wrong, we should return an element that would simply tell the user that
            // the article can't be loaded
            return null;
        }
    }

    @Override
    public SourceMultiviewDescription createContextAwareInstance(Lookup context) {
        return new SourceMultiviewDescription(context.lookup(Article.class));
    }
    
    private static FileSystem articleFiles = null;
    private static synchronized FileObject article2file(Article article) throws IOException {
        if (articleFiles == null) {
            articleFiles = FileUtil.createMemoryFileSystem();
        }
        
        String articleFileName = article.getTitle() + ".html";
        FileObject file = articleFiles.findResource(articleFileName);
        if (file == null) {
            file = articleFiles.getRoot().createData(articleFileName);
            OutputStream os = file.getOutputStream();
            try {
                os.write(article.getContent().getBytes());
            } finally {
                os.close();
            }
        }
        
        return file;
    }

}
