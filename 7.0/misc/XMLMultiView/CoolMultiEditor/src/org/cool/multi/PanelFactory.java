/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cool.multi;

import org.cool.multi.model.Toc;
import org.netbeans.modules.xml.multiview.ui.InnerPanelFactory;
import org.netbeans.modules.xml.multiview.ui.SectionInnerPanel;
import org.netbeans.modules.xml.multiview.ui.SectionView;
import org.netbeans.modules.xml.multiview.ui.ToolBarDesignEditor;

public class PanelFactory implements InnerPanelFactory {

    private TocDataObject dObj;
    private ToolBarDesignEditor editor;

    PanelFactory(ToolBarDesignEditor editor, TocDataObject dObj) {
        this.dObj = dObj;
        this.editor = editor;
    }

    @Override
    public SectionInnerPanel createInnerPanel(Object key) {
        return new TocPanel((SectionView) editor.getContentView(), (Toc) key);
    }

}