/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ceylon.nblexer;

import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;

@LanguageRegistration(mimeType = "text/x-ceylon")
public class CeylonLanguage extends DefaultLanguageConfig {

    @Override
    public Language getLexerLanguage() {
        return CeylonTokenId.getLanguage();
    }

    @Override
    public String getDisplayName() {
        return "Ceylon";
    }

}