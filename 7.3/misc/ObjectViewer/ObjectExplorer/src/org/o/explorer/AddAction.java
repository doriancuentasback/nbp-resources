package org.o.explorer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.o.api.MyObject;

public class AddAction extends AbstractAction {

    private final MyObject bean;

    public AddAction(final MyObject bean) {
        super("Add");
        this.bean = bean;
    }

    @Override
    public void actionPerformed(final ActionEvent evt) {
        bean.addChild(new MyObject(String.valueOf(System.currentTimeMillis())));
    }
}
