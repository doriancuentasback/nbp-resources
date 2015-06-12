package org.cms.viewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.cms.api.Article;
import org.cms.utils.lookup.ContextAwareInstance;
import org.netbeans.core.spi.multiview.MultiViewDescription;
import org.netbeans.core.spi.multiview.MultiViewFactory;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle;
import org.openide.util.lookup.Lookups;
import org.openide.windows.CloneableTopComponent;
import org.openide.windows.Mode;
import org.openide.windows.WindowManager;

@ActionID(category = "Articles",
id = "org.cms.viewer.OpenCMSArticleAction")
@ActionRegistration(displayName = "#CTL_OpenCMSArticleAction")
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 3333)
})
@NbBundle.Messages("CTL_OpenCMSArticleAction=Open CMS Article")
public final class OpenCMSArticleAction implements ActionListener {

    private final Article context;

    public OpenCMSArticleAction(Article context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {

        //Loading the multiview windows:
        FileObject multiviewsFolder = FileUtil.getConfigFile("multiviews");
        FileObject[] kids = multiviewsFolder.getChildren();
        MultiViewDescription[] descriptionArray = new MultiViewDescription[kids.length];
        List<MultiViewDescription> listOfDescs = new ArrayList();
        for (FileObject kid : FileUtil.getOrder(Arrays.asList(kids), true)) {
            MultiViewDescription attribute = (MultiViewDescription) kid.getAttribute("multiview");
            if (attribute instanceof ContextAwareInstance) {
                attribute = ((ContextAwareInstance<MultiViewDescription>) attribute).createContextAwareInstance(Lookups.fixed(context));
            }
            listOfDescs.add(attribute);
        }
        for (int i = 0; i < listOfDescs.size(); i++) {
            descriptionArray[i] = listOfDescs.get(i);
        }

        CloneableTopComponent ctc = MultiViewFactory.createCloneableMultiView(descriptionArray, descriptionArray[0]);
        Mode mode = WindowManager.getDefault().findMode("editor");
        if (mode != null) {
            mode.dockInto(ctc);
            ctc.open();
            ctc.requestActive();
        }

    }
    
}
