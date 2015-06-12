/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tabbed.toolbar;

import java.awt.Dimension;
import java.util.Arrays;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import org.openide.awt.Actions;
import org.openide.cookies.InstanceCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

public abstract class ToolbarComponentProvider {
    
    public abstract JComponent createToolbar();
    
    public static ToolbarComponentProvider getDefault() {
        ToolbarComponentProvider provider = Lookup.getDefault().lookup(ToolbarComponentProvider.class);
        if (provider == null) {
            provider = new DefaultToolbarComponentProvider();
        }
        return provider;
    }
    
    private static class DefaultToolbarComponentProvider extends ToolbarComponentProvider {
        @Override
        public JComponent createToolbar() {
            JTabbedPane pane = new JTabbedPane();
            FileObject tbFolder = FileUtil.getConfigFile("Toolbars");
            for (FileObject oneTbFolder : FileUtil.getOrder(Arrays.asList(tbFolder.getChildren()), true)) {
                JPanel panel = new MyPanel(new MigLayout("align right"));
                if (oneTbFolder.isFolder()) {
                    pane.add(oneTbFolder.getName(), panel);
                    for (FileObject oneTb : FileUtil.getOrder(Arrays.asList(oneTbFolder.getChildren()), true)) {
                        try {
                            DataObject dob = DataObject.find(oneTb);
                            Object instanceObj;
                            InstanceCookie ck = dob.getCookie(InstanceCookie.class);
                            try {
                                instanceObj = ck.instanceCreate();
                            } catch (Exception ex) {
                                instanceObj = null;
                            }
                            if (instanceObj instanceof Action) {
                                JButton button = new JButton();
                                Actions.connect(button, (Action) instanceObj);
                                panel.add(button);
                            }
                        } catch (DataObjectNotFoundException ex) {
                            Exceptions.printStackTrace(ex);
                        }
                    }
                }
            }
            pane.setPreferredSize(new Dimension(100, 70));
            return pane;
        }
    }
    
}
