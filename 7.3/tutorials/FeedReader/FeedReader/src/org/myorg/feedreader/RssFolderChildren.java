package org.myorg.feedreader;

import java.io.IOException;
import org.openide.cookies.InstanceCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.loaders.InstanceDataObject;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

public class RssFolderChildren extends FilterNode.Children {

    RssFolderChildren(Node rssFolderNode) {
        super(rssFolderNode);
    }

    @Override
    protected Node[] createNodes(Node n) {
        FileObject fo = n.getLookup().lookup(FileObject.class);
        if (fo != null && fo.isFolder()) {
            try {
                return new Node[]{new RootNode(n)};
            } catch (DataObjectNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
        } else {
            Feed feed = getFeed(fo.getLookup());
            if (feed != null) {
                try {
                    return new Node[]{new OneFeedNode(n, feed.getSyndFeed())};
                } catch (IOException ioe) {
                    Exceptions.printStackTrace(ioe);
                }
            }
        }
        // best effort
        return new Node[]{new FilterNode(n)};
    }

    /** Looking up a feed */
    private static Feed getFeed(Lookup lkp) {
        InstanceCookie ck = lkp.lookup(InstanceDataObject.class);
        if (ck == null) {
            throw new IllegalStateException("Bogus file in feeds folder: " +
                     lkp.lookup(FileObject.class));
        }
        try {
            return (Feed) ck.instanceCreate();
        } catch (ClassNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return null;
    }
    
}