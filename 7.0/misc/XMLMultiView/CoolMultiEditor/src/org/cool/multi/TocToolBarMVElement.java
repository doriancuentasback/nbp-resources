/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cool.multi;

import org.cool.multi.model.Toc;
import org.netbeans.modules.xml.multiview.ToolBarMultiViewElement;
import org.netbeans.modules.xml.multiview.ui.SectionPanel;
import org.netbeans.modules.xml.multiview.ui.SectionView;
import org.netbeans.modules.xml.multiview.ui.ToolBarDesignEditor;
import org.openide.nodes.Node;

/**
 *
 * @author geertjan
 */
class TocToolBarMVElement extends ToolBarMultiViewElement {

    private TocDataObject dObj;
    private SectionView view;
    private ToolBarDesignEditor comp;
    private PanelFactory factory;

    public TocToolBarMVElement(TocDataObject dObj) {

        super(dObj);
        this.dObj = dObj;
        comp = new ToolBarDesignEditor();
        factory = new PanelFactory(comp, dObj);
        setVisualEditor(comp);

    }

    public SectionView getSectionView() {

        return view;

    }

    public void componentShowing() {

        super.componentShowing();
        view = new TocView(dObj);
        comp.setContentView(view);
        view.open();

    }

    private class TocView extends SectionView {

        TocView(TocDataObject dObj) {
            super(factory);
            Toc toc = dObj.getToc();
            Node itemNode = new ItemNode(toc);
            SectionPanel topLevel = new SectionPanel(this, itemNode, toc);
            addSection(topLevel);
            setRoot(itemNode);
        }
    }

    private class ItemNode extends org.openide.nodes.AbstractNode {
        ItemNode(Toc toc) {
            super(org.openide.nodes.Children.LEAF);
            setDisplayName(dObj.getPrimaryFile().getNameExt());
        }
    }
    
}