/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cool.multi;

import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.cool.multi.model.Toc;
import org.netbeans.modules.xml.multiview.DesignMultiViewDesc;
import org.netbeans.modules.xml.multiview.XmlMultiViewDataObject;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.Node;
import org.openide.nodes.Children;
import org.openide.util.Lookup;
import org.openide.util.ImageUtilities;

public class TocDataObject extends XmlMultiViewDataObject {

    private static final int TYPE_TOOLBAR = 0;

    public TocDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
//        CookieSet cookies = getCookieSet();
//        cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
    }

    @Override
    protected Node createNodeDelegate() {
        return new DataNode(this, Children.LEAF, getLookup());
    }

    @Override
    public Lookup getLookup() {
        return getCookieSet().getLookup();
    }

    public Toc getToc() {
        Toc toc = new Toc();
        try {
            JAXBContext jaxbCtx = JAXBContext.newInstance(toc.getClass().getPackage().getName());
            Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            toc = (Toc) unmarshaller.unmarshal(FileUtil.toFile(this.getPrimaryFile())); //NOI18N
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        return toc;
    }

    @Override
    protected DesignMultiViewDesc[] getMultiViewDesc() {
        return new DesignMultiViewDesc[]{new DesignView(this, TYPE_TOOLBAR)};
    }

    @Override
    protected String getPrefixMark() {
        return null;
    }
    
    private static class DesignView extends DesignMultiViewDesc {

        private int type;

        DesignView(TocDataObject dObj, int type) {
            super(dObj, "Design");
            this.type = type;
        }

        public org.netbeans.core.spi.multiview.MultiViewElement createElement() {
            TocDataObject dObj = (TocDataObject) getDataObject();
            return new TocToolBarMVElement(dObj);
        }

        public java.awt.Image getIcon() {
            return ImageUtilities.loadImage("org/cool/multi/icon.png"); //NOI18N
        }

        public String preferredID() {
            return "Toc_multiview_design" + String.valueOf(type);
        }
        
    }
    
}
