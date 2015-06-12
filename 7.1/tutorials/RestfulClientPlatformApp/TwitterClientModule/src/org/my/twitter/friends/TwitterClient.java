/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.my.twitter.friends;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthSecrets;
import javax.ws.rs.core.MultivaluedMap;

/**
 * Jersey REST client generated for REST resource:Twitter OAuth
 * [statuses/friends_timeline.{format}]<br>
 *  USAGE:
 * <pre>
 *        TwitterClient client = new TwitterClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author geertjan
 */
public class TwitterClient {
    private WebResource webResource;
    private Client client;
    private static final String BASE_URI = "http://twitter.com";
    private static final String OAUTH_BASE_URL = "http://twitter.com/oauth";
    /**
     * Please, specify the consumer_key string obtained from service API pages
     */
    private static final String CONSUMER_KEY = "ry99ZRkQUWiQauJx5F4QyQ";
    /**
     * Please, specify the consumer_secret string obtained from service API pages
     */
    private static final String CONSUMER_SECRET = "ZrEu68SlLJZlUAfQ8NzRHbDXQArVpbgXjPCWMg0atGY";
    private OAuthParameters oauth_params;
    private OAuthSecrets oauth_secrets;
    private OAuthClientFilter oauth_filter;

    public TwitterClient(String format) {
        com.sun.jersey.api.client.config.ClientConfig config = new com.sun.jersey.api.client.config.DefaultClientConfig();
        client = Client.create(config);
        String resourcePath = java.text.MessageFormat.format("statuses/friends_timeline.{0}", new Object[]{format});
        webResource = client.resource(BASE_URI).path(resourcePath);
    }

    public void setResourcePath(String format) {
        String resourcePath = java.text.MessageFormat.format("statuses/friends_timeline.{0}", new Object[]{format});
        webResource = client.resource(BASE_URI).path(resourcePath);
    }

    /**
     * @param responseType Class representing the response
     * @param since query parameter
     * @param since_id query parameter
     * @param page query parameter
     * @param count query parameter
     * @return response object (instance of responseType class)
     */
    public <T> T getFriendsTimeline(Class<T> responseType, String since, String since_id, String page, String count) throws UniformInterfaceException {
        String[] queryParamNames = new String[]{"since", "since_id", "page", "count"};
        String[] queryParamValues = new String[]{since, since_id, page, count};
        return webResource.queryParams(getQueryOrFormParams(queryParamNames, queryParamValues)).accept(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    private MultivaluedMap getQueryOrFormParams(String[] paramNames, String[] paramValues) {
        MultivaluedMap<String, String> qParams = new com.sun.jersey.api.representation.Form();
        for (int i = 0; i < paramNames.length; i++) {
            if (paramValues[i] != null) {
                qParams.add(paramNames[i], paramValues[i]);
            }
        }
        return qParams;
    }

    public void close() {
        client.destroy();
    }

    /**
     * You need to call this method at the beginning to authorize the application to work with user data.
     * The method obtains the OAuth access token string, that is appended to each API request later.
     */
    public static void login() throws UniformInterfaceException {
        Form requestTokenResponse = getOAuthRequestToken();
        String oauth_verifier = authorizeConsumer(requestTokenResponse);
        Form accessTokenResponse = getOAuthAccessToken(requestTokenResponse, oauth_verifier);
        java.util.prefs.Preferences prefs = org.openide.util.NbPreferences.forModule(TwitterClient.class);
        prefs.put("oauth_token", accessTokenResponse.getFirst("oauth_token"));
        prefs.put("oauth_token_secret", accessTokenResponse.getFirst("oauth_token_secret"));
    }

    public static void logout() {
        java.util.prefs.Preferences prefs = org.openide.util.NbPreferences.forModule(TwitterClient.class);
        prefs.remove("oauth_token");
        prefs.remove("oauth_token_secret");
    }

    private static Form getOAuthRequestToken() throws UniformInterfaceException {
        Client reqTokenClient = new Client();
        WebResource resource = reqTokenClient.resource(OAUTH_BASE_URL).path("request_token");
        OAuthParameters o_params = new OAuthParameters().consumerKey(CONSUMER_KEY).signatureMethod(com.sun.jersey.oauth.signature.HMAC_SHA1.NAME).version("1.0").nonce().timestamp();
        OAuthSecrets o_secrets = new OAuthSecrets().consumerSecret(CONSUMER_SECRET);
        OAuthClientFilter o_filter = new OAuthClientFilter(reqTokenClient.getProviders(), o_params, o_secrets);
        resource.addFilter(o_filter);
        return resource.get(Form.class);
    }

    private static Form getOAuthAccessToken(Form requestTokenResponse, String oauth_verifier) throws UniformInterfaceException {
        Client accessTokenClient = new Client();
        WebResource resource = accessTokenClient.resource(OAUTH_BASE_URL).path("access_token");
        OAuthParameters o_params = new OAuthParameters().consumerKey(CONSUMER_KEY).token(requestTokenResponse.getFirst("oauth_token")).signatureMethod(com.sun.jersey.oauth.signature.HMAC_SHA1.NAME).version("1.0").nonce().timestamp().verifier(oauth_verifier);
        OAuthSecrets o_secrets = new OAuthSecrets().consumerSecret(CONSUMER_SECRET).tokenSecret(requestTokenResponse.getFirst("oauth_token_secret"));
        OAuthClientFilter o_filter = new OAuthClientFilter(accessTokenClient.getProviders(), o_params, o_secrets);
        resource.addFilter(o_filter);
        return resource.get(Form.class);
    }

    /**
     * The method sets the OAuth parameters for webResource.
     * The method needs to be called after login() method, or when the webResource path is changed
     */
    public void initOAuth() {
        java.util.prefs.Preferences prefs = org.openide.util.NbPreferences.forModule(this.getClass());
        String oauth_token = prefs.get("oauth_token", null);
        String oauth_token_secret = prefs.get("oauth_token_secret", null);
        if (oauth_token == null || oauth_token_secret == null) {
            org.openide.DialogDisplayer.getDefault().notify(new org.openide.NotifyDescriptor.Message("You have to call the login() method first to authorize the application to access user data."));
        } else {
            oauth_params = new OAuthParameters().consumerKey(CONSUMER_KEY).token(oauth_token).signatureMethod(com.sun.jersey.oauth.signature.HMAC_SHA1.NAME).version("1.0").nonce().timestamp();
            oauth_secrets = new OAuthSecrets().consumerSecret(CONSUMER_SECRET).tokenSecret(oauth_token_secret);
            oauth_filter = new OAuthClientFilter(client.getProviders(), oauth_params, oauth_secrets);
            webResource.addFilter(oauth_filter);
        }
    }

    /**
     * The method increases OAuth nonce and timestamp parameters to make each request unique.
     * The method should be called when repetitive requests are sent to service API provider:
     * <pre>
     * client.initOauth();
     * client.getXXX(...);
     * client.makeOAuthRequestUnique();
     * client.getYYY(...);
     * client.makeOAuthRequestUnique();
     * client.getZZZ(...);
     * </pre>
     */
    public void makeOAuthRequestUnique() {
        if (oauth_params != null) {
            oauth_params.nonce().timestamp();
        }
    }

    private static java.lang.String authorizeConsumer(Form requestTokenResponse) {
        class DialogPanel extends javax.swing.JPanel {

            private javax.swing.JTextField verifierTextField;

            DialogPanel(final String url) {
                java.awt.GridBagConstraints gridBagConstraints;
                javax.swing.JLabel topLabel = new javax.swing.JLabel();
                verifierTextField = new javax.swing.JTextField();
                javax.swing.JLabel verifierLabel = new javax.swing.JLabel();
                javax.swing.JLabel bottomLabel = new javax.swing.JLabel();
                javax.swing.JButton urlButton = new javax.swing.JButton();
                setLayout(new java.awt.GridBagLayout());
                topLabel.setText("Click the URL link below to open the browser, and authorize the application to access your data:"); // NOI18N
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                add(topLabel, gridBagConstraints);
                urlButton.setForeground(java.awt.Color.BLUE);
                urlButton.setBorderPainted(false);
                urlButton.setContentAreaFilled(false);
                String urlText = url.toString();
                String text = "<html><b><u>" + urlText + "</u></b></html>";
                urlButton.setText(text);
                urlButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                urlButton.addActionListener(new java.awt.event.ActionListener() {

                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        try {
                            org.openide.awt.HtmlBrowser.URLDisplayer.getDefault().showURLExternal(new java.net.URL(url));
                        } catch (java.net.MalformedURLException ex) {
                            java.util.logging.Logger.getLogger(DialogPanel.class.getName()).log(java.util.logging.Level.WARNING, "incorrect URL string", ex);
                        }
                    }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                add(urlButton, gridBagConstraints);
                verifierLabel.setText("Type oauth_verifier string, taken from authorization(callback) page: "); // NOI18N
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
                add(verifierLabel, gridBagConstraints);
                verifierTextField.setText(""); // NOI18N
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
                add(verifierTextField, gridBagConstraints);
                bottomLabel.setText("After you allow the application to access your data, press OK.");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                add(bottomLabel, gridBagConstraints);
            }

            public String getVerifier() {
                return verifierTextField.getText().trim();
            }
        }
        String oauth_verifier = null;
        String loginUrl = "http://twitter.com/oauth/authorize?oauth_token=" + requestTokenResponse.getFirst("oauth_token");
        DialogPanel dialogPanel = new DialogPanel(loginUrl);
        org.openide.DialogDescriptor dd = new org.openide.DialogDescriptor(dialogPanel, "OAuth Authentication Dialog");
        org.openide.DialogDisplayer.getDefault().notify(dd);
        if (dd.getValue() == org.openide.DialogDescriptor.OK_OPTION) {
            oauth_verifier = dialogPanel.getVerifier();
        }
        return oauth_verifier;
    }
    
}
