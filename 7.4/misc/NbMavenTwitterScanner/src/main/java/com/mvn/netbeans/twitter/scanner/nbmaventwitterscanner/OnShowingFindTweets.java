package com.mvn.netbeans.twitter.scanner.nbmaventwitterscanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import org.openide.awt.HtmlBrowser.URLDisplayer;
import org.openide.awt.NotificationDisplayer;
import org.openide.awt.StatusDisplayer;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.NbBundle;
import org.openide.util.RequestProcessor;
import org.openide.windows.OnShowing;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@NbBundle.Messages({
    "DN_Name=Tweets",
    "DESC_Name=Messages from Twitter"
})
@OnShowing
public class OnShowingFindTweets implements Runnable {

    private static RequestProcessor RP;
    private final RequestProcessor.Task REFRESHER;
    private static int REFRESH_DELAY;
    private final Set<Status> statusHistory;

    public OnShowingFindTweets() {
        RP = new RequestProcessor(OnShowingFindTweets.class);
        REFRESHER = RP.create(this);
        REFRESH_DELAY = 10000;
        statusHistory = new HashSet<Status>();
    }
    
    @Override
    public void run() {
        StatusDisplayer.getDefault().setStatusText("Looking for more Tweets...");
        refreshTweets();
        REFRESHER.schedule(REFRESH_DELAY);
    }

    public void refreshTweets() {
        ConfigurationBuilder configBuilder = new ConfigurationBuilder();
        configBuilder.setDebugEnabled(true);
        configBuilder.setOAuthConsumerKey("kXiJN8FooyOdX2l21v1Q");
        configBuilder.setOAuthConsumerSecret("LMr08GBRlhNPqEFK2CLqy6xQTH5Qiee2zQdE72uqI");
        configBuilder.setOAuthAccessToken("19857029-3JFq3vKdPZ2MmdrnENX8zSieYqaSKv9WwOkuzZ4m8");
        configBuilder.setOAuthAccessTokenSecret("43LF9U13hVwyiS3dSnX3XY9wmEG4zAq5ovPGEn0bmk");
        TwitterFactory tf = new TwitterFactory(configBuilder.build());
        Twitter twitter = tf.getInstance();
        Query query = new Query("netbeans");
        QueryResult result;
        try {
            result = twitter.search(query);
            for (final Status status : result.getTweets()) {
                if (!statusHistory.contains(status)) {
                    final String url = "http://twitter.com/" + status.getUser().getScreenName() + "/status/" + status.getId();
                    NotificationDisplayer.getDefault().notify(
                            "@" + status.getUser().getScreenName() + ": " + status.getText(),
                            ImageUtilities.loadImageIcon("com/mvn/netbeans/twitter/scanner/nbmaventwitterscanner/icon.png", false),
                            //description:
                            url,
                            //action listener:
                            new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    try {
                                        URLDisplayer.getDefault().showURL(
                                        new URL(url));
                                    } catch (MalformedURLException eee) {
                                    }
                                }
                            });
                    statusHistory.add(status);
                }
            }
        } catch (TwitterException ex) {
            Exceptions.printStackTrace(ex);
        }
        
    }

}
