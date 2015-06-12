package org.dartlang;

import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;

@LanguageRegistration(mimeType = "text/x-dart")
public class DartLanguage extends DefaultLanguageConfig {

    @Override
    public Language getLexerLanguage() {
        return DartTokenId.getLanguage();
    }

    @Override
    public String getDisplayName() {
        return "Dart";
    }
    
}
