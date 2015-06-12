package org.myorg.feedreader;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.fetcher.FeedFetcher;
import com.sun.syndication.fetcher.impl.HashMapFeedInfoCache;
import com.sun.syndication.fetcher.impl.HttpURLFeedFetcher;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

public class Feed implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final FeedFetcher FEED_FETCHER =
            new HttpURLFeedFetcher(HashMapFeedInfoCache.getInstance());

    private transient SyndFeed syndFeed;
    private final URL url;
    private String name;

    public Feed(URL url) {
        this.url = url;
        name = url.toExternalForm();
    }

    public URL getURL() {
        return url;
    }

    public SyndFeed getSyndFeed() throws IOException {
        if (syndFeed == null) {
            try {
                syndFeed = FEED_FETCHER.retrieveFeed(url);
                String title = syndFeed.getTitle();
                if (title != null) {
                    name = title;
                }
            } catch (Exception ex) {
                throw new IOException(ex);
            }
        }
        return syndFeed;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Feed getSample() {
        try {
            return new Feed(new URL("http://planetnetbeans.org/rss20.xml"));
        } catch (MalformedURLException x) {
            throw new AssertionError(x);
        }
    }

}