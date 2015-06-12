package org.netbeans.testfairy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import javax.swing.SwingUtilities;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.netbeans.api.options.OptionsDisplayer;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.netbeans.testfairy.options.TestFairyPanel;
import org.openide.loaders.DataObject;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.awt.HtmlBrowser;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.util.NbPreferences;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OutputEvent;
import org.openide.windows.OutputListener;
import org.openide.windows.OutputWriter;

@ActionID(
        category = "Test",
        id = "org.netbeans.testfairy.SendToTestFairyAction"
)
@ActionRegistration(
        asynchronous = true,
        displayName = "#CTL_SendToTestFairyAction"
)
@ActionReference(path = "Loaders/application/x-java-archive/Actions", position = 100)
@Messages("CTL_SendToTestFairyAction=Send to TestFairy!")
public final class SendToTestFairyAction implements ActionListener {

    //http://stackoverflow.com/questions/20261183/java-http-post-form-and-file
    //http://www.programcreek.com/java-api-examples/index.php?api=java.io.BufferedInputStream
    //http://stackoverflow.com/questions/12516532/http-get-to-retrieve-compressed-files
    private File file;
    private static String targetURL = "https://app.testfairy.com/api/upload";

    public SendToTestFairyAction(DataObject context) {
        this.file = FileUtil.toFile(context.getPrimaryFile());
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        final String key = NbPreferences.forModule(TestFairyPanel.class).get("testFairyAPIKey", "<undefined>");
        if (key.equals("<undefined>")) {
            StatusDisplayer.getDefault().setStatusText("Define TestFairy API Key in Options window!");
            OptionsDisplayer.getDefault().open(OptionsDisplayer.ADVANCED + "/org-netbeans-testfairy-options-TestFairyOptionsPanelController", true);
        } else {
            ProgressHandle handle = ProgressHandleFactory.createHandle("Uploading to TestFairy...");
            handle.start();
            MultipartEntityBuilder meb = MultipartEntityBuilder.create().
                    setMode(HttpMultipartMode.BROWSER_COMPATIBLE).
                    addTextBody("api_key", key).
                    addPart("apk_file", new FileBody(file));
            HttpPost httpPost;
            try {
                httpPost = new HttpPost(new URL(targetURL).toURI());
                httpPost.setEntity(meb.build());
                DefaultHttpClient httpClient = new DefaultHttpClient();
                HttpResponse response = httpClient.execute(httpPost);
                printOutResponse(response.getEntity().getContent());
            } catch (URISyntaxException ex) {
                Exceptions.printStackTrace(ex);
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
            handle.finish();
        }
    }

    public void printOutResponse(InputStream is) throws IOException {
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            OutputWriter writer;
            InputOutput io = IOProvider.getDefault().getIO("TestFairy Output", false);
            writer = io.getOut();
            for (String s : jsonText.
                    replace("{", "").
                    replace("}", "").
                    replace("\"", "").
                    split(",")) {
                int index = s.indexOf(":");
                final String parsedUrl = s.substring(index + 1).replaceAll("\\\\", "");
                if (s.contains("build_url")) {
                    s = "build_url: " + parsedUrl;
                    openBrowser(writer, s, parsedUrl);
                } else if (s.contains("instrumented_url")) {
                    s = "instrumented_url: " + parsedUrl;
                    openBrowser(writer, s, parsedUrl);
                    downloadInstrumentedAPK(parsedUrl);
                } else if (s.contains("invite_testers_url")) {
                    s = "invite_testers_url: " + parsedUrl;
                    openBrowser(writer, s, parsedUrl);
                } else if (s.contains("icon_url")) {
                    s = "icon_url: " + parsedUrl;
                    openBrowser(writer, s, parsedUrl);
                } else {
                    writer.println(s);
                }
            }
        } finally {
            is.close();
        }
    }

    private void downloadInstrumentedAPK(String parsedUrl) {
        HttpGet httpGet;
        try {
            httpGet = new HttpGet(new URL(parsedUrl).toURI());
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpResponse response = httpClient.execute(httpGet);
            InputStream content = response.getEntity().getContent();
            BufferedInputStream bis = new BufferedInputStream(content);
            String testfairyFileName = file.getName().replace(".apk", "") + "-testfairy.apk";
            File testFairyfile = new File(file.getParentFile().getAbsolutePath() + File.separator + testfairyFileName);
            FileOutputStream out = new FileOutputStream(testFairyfile);
            byte[] buffer = new byte[16384];
            int read;
            while ((read = bis.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            try {
                bis.close();
                out.close();
            } catch (IOException e) {
            }
            StatusDisplayer.getDefault().setStatusText("Instrumented TestFairy file: " + file.getAbsolutePath());
        } catch (URISyntaxException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private void openBrowser(OutputWriter writer, String s, final String parsedUrl) throws IOException {
        writer.println(s, new OutputListener() {
            @Override
            public void outputLineSelected(OutputEvent oe) {
            }

            @Override
            public void outputLineAction(OutputEvent oe) {
                try {
                    HtmlBrowser.URLDisplayer.getDefault().showURL(new URL(parsedUrl));
                } catch (MalformedURLException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }

            @Override
            public void outputLineCleared(OutputEvent oe) {
            }
        });
    }

    private String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

}
