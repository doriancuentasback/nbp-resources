package org.demo;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;

/**
 *
 * @author geertjan
 */
public class RightClickMeNode extends AbstractNode {
    private final ChildFactory.Detachable kids;

    public RightClickMeNode(ChildFactory.Detachable kids) {
        super(Children.create(kids, true));
        this.kids = kids;
    }

    @Override
    public Action[] getActions(boolean bln) {
        Action[] actions = new Action[]{
            new AbstractAction("Create Item") {
                public void actionPerformed(ActionEvent e) {
                    NotifyDescriptor.InputLine desc = 
                            new NotifyDescriptor.InputLine("Item:", "Create Item");
                    DialogDisplayer.getDefault().notify(desc);
                    String key = desc.getInputText();
                    if ("".equals(key)) {
                        return;
                    }
                    String value = desc.getInputText();
                    if(!Utils.getCreatedArrayList().contains(value)){
                        Utils.getCreatedArrayList().add(new BusinessObject(key));
                        Utils.getChangeSupport(kids).fireChange();
                    }
                }
            }
        };
        return actions;
    }

}
