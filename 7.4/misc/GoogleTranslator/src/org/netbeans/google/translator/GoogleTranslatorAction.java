package org.netbeans.google.translator;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "Tools",
        id = "org.netbeans.google.translator.GoogleTranslatorAction"
)
@ActionRegistration(
        lazy = false,
        displayName = "#CTL_GoogleTranslatorAction"
)
@ActionReference(path = "Toolbars/Translate", position = 0)
@Messages("CTL_GoogleTranslatorAction=GoogleTranslator")
public final class GoogleTranslatorAction extends AbstractAction implements Presenter.Toolbar{

    @Override
    public void actionPerformed(ActionEvent e) {
        // not used
    }

    @Override
    public Component getToolbarPresenter() {
        return new TranslatorPanel();
    }
    
}
