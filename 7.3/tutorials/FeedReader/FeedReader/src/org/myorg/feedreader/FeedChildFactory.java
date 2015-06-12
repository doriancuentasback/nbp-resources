package org.myorg.feedreader;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.NbCollections;

public class FeedChildFactory extends ChildFactory<SyndEntry> {

    private final SyndFeed feed;

    public FeedChildFactory(SyndFeed feed) {
        this.feed = feed;
    }

    @Override
    protected boolean createKeys(List<SyndEntry> list) {
        list.addAll(NbCollections.checkedListByCopy(feed.getEntries(), SyndEntry.class, true));
        return true;
    }

    @Override
    protected Node createNodeForKey(SyndEntry entry) {
        OneEntryNode node = null;
        try {
            node = new OneEntryNode(entry);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }

}