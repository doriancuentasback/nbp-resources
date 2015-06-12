package org.netbeans.google.translator;

import com.google.api.GoogleAPIException;
import com.google.api.translate.Language;
import com.google.api.translate.Translate;
import com.google.api.translate.TranslateV2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.EditorRegistry;
import org.openide.loaders.DataObject;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.awt.StatusDisplayer;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tools",
        id = "org.netbeans.google.translator.TranslateAction"
)
@ActionRegistration(
        displayName = "#CTL_TranslateAction"
)
@ActionReferences({
    @ActionReference(path = "Editors/text/html/Popup", position = 400),
    @ActionReference(path = "Editors/text/x-java/Popup", position = 400)
})
@Messages("CTL_TranslateAction=Translate")
public final class TranslateAction implements ActionListener {

    private final DataObject context;

    public TranslateAction(DataObject context) {
        this.context = context;
    }

@Override
public void actionPerformed(ActionEvent ev) {
    Language from = TranslatorPanel.from();
    Language to = TranslatorPanel.to();
    try {
        JTextComponent comp = EditorRegistry.lastFocusedComponent();
        String toChange = comp.getSelectedText();
        TranslateV2.setHttpReferrer("http://code.google.com/p/google-api-translate-java");
        TranslateV2.setKey("your-key-goes-here");
        String text = TranslateV2.DEFAULT.execute(toChange, from, to);
        comp.replaceSelection(text);
    } catch (java.lang.NullPointerException ex1) {
        StatusDisplayer.getDefault().setStatusText("Translation service can't help you...");
    } catch (GoogleAPIException ex) {
        Exceptions.printStackTrace(ex);
    }
}

}
