/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.customer.viewer;

import java.awt.datatransfer.Transferable;
import java.io.IOException;
import javax.swing.Action;
import org.customer.domain.Customer;
import org.openide.actions.*;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.Lookup;
import org.openide.util.datatransfer.ExTransferable;

public class CustomerNode extends AbstractNode {

    private final CustomerList model;

    public CustomerNode(Children children, Lookup lookup, CustomerList model) {
        super(children, lookup);
        this.model = model;
    }

    @Override
    public String getDisplayName() {
        return getLookup().lookup(Customer.class).getName();
    }

    @Override
    public Action[] getActions(boolean context) {
        return new Action[]{
                    CutAction.get(CutAction.class),
                    CopyAction.get(CopyAction.class),
                    DeleteAction.get(DeleteAction.class),
                    MoveUpAction.get(MoveUpAction.class),
                    MoveDownAction.get(MoveDownAction.class)
                };
    }

    @Override
    public boolean canCut() {
        return true;
    }

    @Override
    public boolean canCopy() {
        return true;
    }

    @Override
    public boolean canDestroy() {
        return true;
    }

    @Override
    public void destroy() throws IOException {
        model.remove(getLookup().lookup(Customer.class));
    }

    @Override
    public Transferable clipboardCut() throws IOException {
        Transferable deflt = super.clipboardCut();
        ExTransferable added = ExTransferable.create(deflt);
        added.put(new ExTransferable.Single(CustomerFlavor.CUSTOMER_FLAVOR) {
            @Override
            protected Customer getData() {
                return getLookup().lookup(Customer.class);
            }
        });
        return added;
    }

    @Override
    public Transferable clipboardCopy() throws IOException {
        Transferable deflt = super.clipboardCopy();
        ExTransferable added = ExTransferable.create(deflt);
        added.put(new ExTransferable.Single(CustomerFlavor.CUSTOMER_FLAVOR) {
            @Override
            protected Customer getData() {
                return getLookup().lookup(Customer.class);
            }
        });
        return added;
    }
    
}