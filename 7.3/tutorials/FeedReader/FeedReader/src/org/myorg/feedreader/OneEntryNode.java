package org.myorg.feedreader;

import com.sun.syndication.feed.synd.SyndContent;
import com.sun.syndication.feed.synd.SyndEntry;
import java.awt.BorderLayout;
import java.beans.IntrospectionException;
import javax.swing.Action;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import org.openide.actions.OpenAction;
import org.openide.cookies.OpenCookie;
import org.openide.nodes.BeanNode;
import org.openide.nodes.FilterNode;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;
import org.openide.windows.TopComponent;

class OneEntryNode extends FilterNode {

    private final SyndEntry entry;

    public OneEntryNode(SyndEntry entry) throws IntrospectionException {
        super(  new BeanNode<SyndEntry>(entry), 
                Children.LEAF,
                Lookups.fixed(new EntryOpenCookie(entry)));
        this.entry = entry;
    }

    /**
     * Using HtmlDisplayName ensures any HTML in RSS entry titles are properly
     * handled, escaped, entities resolved, etc.
     */
    @Override
    public String getHtmlDisplayName() {
        return entry.getTitle();
    }

    /**
     * Making a tooltip out of the entry's description
     */
    @Override
    public String getShortDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("Author: ").append(entry.getAuthor()).append("; ");
        if (entry.getPublishedDate() != null) {
            sb.append("Published: ").append(entry.getPublishedDate().toString());
        }
        return sb.toString();
    }

    /**
     * Providing the Open action on a feed entry
     */
    @Override
    public Action[] getActions(boolean popup) {
        return new Action[]{SystemAction.get(OpenAction.class)};
    }

    @Override
    public Action getPreferredAction() {
        return getActions(false)[0];
    }

    /**
     * Specifying what should happen when the user invokes the Open action
     */
    private static class EntryOpenCookie implements OpenCookie {

        private final SyndEntry entry;

        EntryOpenCookie(SyndEntry entry) {
            this.entry = entry;
        }

        @Override
        public void open() {
            BrowserTopComponent btc = new BrowserTopComponent(entry);
            btc.open();
            btc.requestActive();
        }
        
    }

    public static final class BrowserTopComponent extends TopComponent {
        public BrowserTopComponent(SyndEntry entry) {
            setName(entry.getTitle());
            setLayout(new BorderLayout());
            JEditorPane editorPane = new JEditorPane();
            editorPane.setEditable(false);
            SyndContent description = entry.getDescription();
            if (description != null) {
                editorPane.setContentType("text/html");
                editorPane.setText(description.getValue());
            }
            add(new JScrollPane(editorPane), BorderLayout.CENTER);
            putClientProperty(/*PrintManager.PRINT_PRINTABLE*/"print.printable", true);
        }
    }
    
}