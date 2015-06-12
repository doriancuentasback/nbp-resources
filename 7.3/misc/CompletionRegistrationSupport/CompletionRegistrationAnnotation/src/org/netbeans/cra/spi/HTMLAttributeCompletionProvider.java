package org.netbeans.cra.spi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;
import org.openide.text.NbDocument;
import org.openide.util.Exceptions;

/**
 * <p> Fourni la complétion pour l'attribut lang. </p>
 *
 * <p> Les codes sont issus de la norme ISO639-1 et sont stockés dans un fichier
 * CSV. </p>
 *
 * @author oschmitt
 */
public final class HTMLAttributeCompletionProvider implements CompletionProvider {

    private Set<String> codes;
    private final Map map;

    static HTMLAttributeCompletionProvider create(Map m) {
        return new HTMLAttributeCompletionProvider(m);
    }

    public HTMLAttributeCompletionProvider(Map m) {
        this.map = m;
        codes = new TreeSet<String>();
        try {
            String content = m.get("content").toString();
            String contentType = m.get("contentType").toString();
            loadContent(content, contentType);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private void loadContent(String content, String contentType) throws IOException {
        if (contentType.equals("csv")) {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream(content);
            if (inputStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    codes.add(line);
                }
            }
        } else if (contentType.equals("json")) {
            try {
                URL url = new URL(content);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("Accept", "application/json");
                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : "
                            + conn.getResponseCode());
                }
                BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
                JSONArray array = (JSONArray) JSONValue.parse(br);
                JSONArray next = (JSONArray) array.get(1);
                for (int i = 0; i < next.size(); i++) {
                    String iso2Code = (String) ((JSONObject) next.get(i)).get("iso2Code");
                    String name = (String) ((JSONObject) next.get(i)).get("name");
                    codes.add(iso2Code+"/"+name);
                }
                conn.disconnect();
            } catch (MalformedURLException e) {
                Exceptions.printStackTrace(e);
            } catch (IOException e) {
                Exceptions.printStackTrace(e);
            }
        } else if (contentType.equals("basic")) {
            codes.addAll(Arrays.asList(content.split(",")));
        }
    }

    @Override
    public CompletionTask createTask(int queryType, JTextComponent jTextComponent) {

        int position = jTextComponent.getCaretPosition();
        String text = jTextComponent.getText();
        StyledDocument styledDocument = (StyledDocument) jTextComponent.getDocument();
        int lineNumber = NbDocument.findLineNumber(styledDocument, position);
        Element lineElement = styledDocument.getDefaultRootElement().getElement(lineNumber);
        int startOffset = lineElement.getStartOffset();
        int endOffset = lineElement.getEndOffset();
        String lineOfText = text.substring(startOffset, endOffset);
        int column = NbDocument.findLineColumn(styledDocument, position);

        HTMLAttributeMatcher htmlam = new HTMLAttributeMatcher(map);

        if (htmlam.containsRef(lineOfText)) {

            final HTMLAttribute langAttribute = htmlam.getValue(lineOfText, column);
            if (langAttribute == null) {
                return null;
            } else {
                langAttribute.setLineOffset(startOffset);
                return new AsyncCompletionTask(new AsyncCompletionQuery() {
                    @Override
                    protected void query(CompletionResultSet completionResultSet,
                            Document document, int caretOffset) {

                        for (String code : codes) {
                            if (code.startsWith(langAttribute.getValue())) {
                                completionResultSet.addItem(new HTMLAttributeCompletionItem(map, langAttribute, code));
                            }
                        }
                        completionResultSet.finish();
                    }
                });
            }

        } else {
            return null;
        }
    }

    @Override
    public int getAutoQueryTypes(JTextComponent jTextComponent, String string) {
        return 0;
    }
}
