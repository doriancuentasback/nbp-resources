/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.customer.viewer;


import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;
import javax.swing.Action;
import org.customer.domain.Customer;
import org.openide.actions.PasteAction;
import org.openide.actions.ReorderAction;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Index;
import org.openide.nodes.Node;
import org.openide.nodes.NodeTransfer;
import org.openide.util.Exceptions;
import org.openide.util.datatransfer.PasteType;

/**
 *
 * @author eppleton
 */
public class DNDContainerNode extends AbstractNode {

    private final CustomerList model;

    public DNDContainerNode(final CustomerList model) {
        super(Children.create(new CustomerFactory(model), true));
        this.model = model;
        getCookieSet().add(new Index.Support() {
            @Override
            public Node[] getNodes() {
                return getChildren().getNodes(true);
            }
            @Override
            public int getNodesCount() {
                return getNodes().length;
            }
            @Override
            public void reorder(int[] perm) {
                model.reorder(perm);
            }
        });
    }

    @Override
    public Action[] getActions(boolean context) {
        return new Action[] {
            ReorderAction.get(ReorderAction.class),
            PasteAction.get(PasteAction.class),
        };
    }

    @Override
    public PasteType getDropType(final Transferable t, int arg1, int arg2) {
        if (t.isDataFlavorSupported(CustomerFlavor.CUSTOMER_FLAVOR)) {
            return new PasteType() {
                @Override
                public Transferable paste() throws IOException {
                    try {
                        model.add((Customer) t.getTransferData(CustomerFlavor.CUSTOMER_FLAVOR));
                        final Node node = NodeTransfer.node(t, NodeTransfer.DND_MOVE + NodeTransfer.CLIPBOARD_CUT);
                        if (node != null) {
                            node.destroy();
                        }
                    } catch (UnsupportedFlavorException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                    return null;
                }
            };
        } else {
            return null;
        }
    }

    @Override
    protected void createPasteTypes(Transferable t, List<PasteType> s) {
        super.createPasteTypes(t, s);
        PasteType p = getDropType(t, 0, 0);
        if (p != null) {
            s.add(p);
        }
    }

}
