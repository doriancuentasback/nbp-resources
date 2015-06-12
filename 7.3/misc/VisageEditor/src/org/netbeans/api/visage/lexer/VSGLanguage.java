/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.api.visage.lexer;

import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;

@LanguageRegistration(mimeType = "text/x-visage")
public class VSGLanguage extends DefaultLanguageConfig {

    @Override
    public Language getLexerLanguage() {
        return VSGTokenId.language();
    }

    @Override
    public String getDisplayName() {
        return null;
    }
    
}
    