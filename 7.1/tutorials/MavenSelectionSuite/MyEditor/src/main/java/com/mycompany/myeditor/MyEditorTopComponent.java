package com.mycompany.myeditor;

import com.mycompany.mavenselectionsuite.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.TopComponent;

@TopComponent.Description(preferredID = "MyEditorTopComponent",
persistenceType = TopComponent.PERSISTENCE_NEVER)
@TopComponent.Registration(mode = "editor", openAtStartup = false)
@ActionID(category = "Window", id = "com.mycompany.myeditor.MyEditorTopComponent")
@ActionReference(path = "Menu/Window")
@TopComponent.OpenActionRegistration(displayName = "#CTL_MyEditorAction")
@Messages({
    "CTL_MyEditorAction=MyEditor",
    "CTL_MyEditorTopComponent=MyEditor Window",
    "HINT_MyEditorTopComponent=This is a MyEditor window"
})
public final class MyEditorTopComponent extends TopComponent {

    private final InstanceContent content = new InstanceContent();

    public MyEditorTopComponent() {

        setName(Bundle.CTL_MyEditorTopComponent());
        setToolTipText(Bundle.HINT_MyEditorTopComponent());

        associateLookup(new AbstractLookup(content));
        
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

        final JTextField displayField = new JTextField();
        add(displayField);

        JButton replaceButton = new JButton("Replace");
        add(replaceButton);
        replaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Event obj = new Event();
                displayField.setText("Event #" + obj.getIndex() + " created at " + obj.getDate());
                setDisplayName("MyEditor " + obj.getIndex());
                content.set(Collections.singleton(obj), null);
            }
        });

    }

}