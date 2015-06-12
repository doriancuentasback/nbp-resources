
package org.netbeans.cra.spi;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * <p>Classe utilitaire pour extraire l'attribut lang.</p>
 * 
 * @author oschmitt
 */
public final class HTMLAttributeMatcher {
    
    public static String LANG_PATTERN;

    public HTMLAttributeMatcher(Map map) {
        LANG_PATTERN = "(" + map.get("attribute").toString() + ")=\"([a-z]*)\"";
    }

    public boolean containsRef(String line) {
        if (line == null) {
            return false;
        }
        Scanner scanner = new Scanner(line);

        return scanner.findInLine(LANG_PATTERN) != null;
    }
    
    
    public HTMLAttribute getValue(String line, int caret) {

        Scanner scanner = new Scanner(line);
        while (true) {
            scanner.findInLine(LANG_PATTERN);
            try {
                MatchResult matchResult = scanner.match();
                if (matchResult != null) {
                    String attr = matchResult.group(1);
                    String value = matchResult.group(2);
                    int start = matchResult.start(2);
                    int end = matchResult.end(2);
                    if ((caret >= start)
                            && (caret <= end)) {
                        HTMLAttribute langAttribute = new HTMLAttribute();
                        langAttribute.setStart(start);
                        langAttribute.setEnd(end);
                        langAttribute.setValue(value);
                        return langAttribute;
                    }
                }
            } catch (IllegalStateException ise) {
                return null;
            }
        }
    }
}
