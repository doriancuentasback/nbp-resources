package org.netbeans.modules.newsnippets2;

import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.openide.text.ActiveEditorDrop;

public class BR implements ActiveEditorDrop {

    private String comment = "";

    public BR() {
    }

    private String createBody() {
        comment = getComment();
        String Br = "<!-- " + comment + " -->"
                + "\n        <br>";
        return Br;
    }

    @Override
    public boolean handleTransfer(JTextComponent targetComponent) {
        BRCustomizer c = new BRCustomizer(this, targetComponent);
        boolean accept = c.showDialog();
        if (accept) {
            String body = createBody();
            try {
                HTMLPaletteUtilities.insert(body, targetComponent);
            } catch (BadLocationException ble) {
                accept = false;
            }
        }
        return accept;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}