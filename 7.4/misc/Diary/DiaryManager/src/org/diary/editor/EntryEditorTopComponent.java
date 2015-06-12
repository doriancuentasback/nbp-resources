package org.diary.editor;

import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.diary.domain.Entry;
import org.netbeans.api.actions.Editable;
import org.netbeans.spi.actions.AbstractSavable;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.NotifyDescriptor.Confirmation;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;
import org.openide.windows.TopComponent;

@TopComponent.Description(
        preferredID = "EntryEditorTopComponent",
        persistenceType = TopComponent.PERSISTENCE_ONLY_OPENED
)
@TopComponent.Registration(mode = "editor", openAtStartup = false)
@ActionID(category = "Window", id = "org.diary.explorer.EntryEditorTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@NbBundle.Messages({
    "CTL_EntryEditorTopComponent=Diary Editor"
})
public class EntryEditorTopComponent extends TopComponent {

    private final InstanceContent ic = new InstanceContent();
    private final JEditorPane jep;
    private final Entry entry;

    public EntryEditorTopComponent(Entry entry) {
        this.entry = entry;
        setDisplayName(entry.getName());
        setLayout(new BorderLayout());
        jep = new JEditorPane();
        jep.setText(entry.getContent());
        jep.getDocument().addDocumentListener(new ContentDocumentListener());
        add(jep, BorderLayout.CENTER);
        associateLookup(new ProxyLookup(new AbstractLookup(ic), Lookups.fixed(entry, new Editable() {
            @Override
            public void edit() {
            }
        })));
    }

    private class ContentSavable extends AbstractSavable {
        public ContentSavable() {
            register();
        }
        @Override
        protected String findDisplayName() {
            return entry.getName();
        }
        @Override
        protected void handleSave() throws IOException {
            Confirmation message = new NotifyDescriptor.Confirmation("Do you want to save \""
                    + entry.getName() + "\"?",
                    NotifyDescriptor.OK_CANCEL_OPTION,
                    NotifyDescriptor.QUESTION_MESSAGE);
            Object result = DialogDisplayer.getDefault().notify(message);
            if (NotifyDescriptor.YES_OPTION.equals(result)) {
                entry.setContent(jep.getText());
                tc().ic.remove(this);
                unregister();
            }
        }
        EntryEditorTopComponent tc() {
            return EntryEditorTopComponent.this;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ContentSavable) {
                ContentSavable m = (ContentSavable) obj;
                return tc() == m.tc();
            }
            return false;
        }
        @Override
        public int hashCode() {
            return tc().hashCode();
        }
    }

    private void modified() {
        if (getLookup().lookup(ContentSavable.class) == null) {
            ic.add(new ContentSavable());
        }
    }

    private class ContentDocumentListener implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent e) {
            modified();
        }
        @Override
        public void removeUpdate(DocumentEvent e) {
            modified();
        }
        @Override
        public void changedUpdate(DocumentEvent e) {
            modified();
        }
    }

}
