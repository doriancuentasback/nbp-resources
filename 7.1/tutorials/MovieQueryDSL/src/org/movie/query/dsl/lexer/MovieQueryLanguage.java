/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.query.dsl.lexer;

import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;

@LanguageRegistration(mimeType = "text/x-movie-query")
public class MovieQueryLanguage extends DefaultLanguageConfig {

    @Override
    public Language getLexerLanguage() {
	return new MovieQueryLanguageHierarchy().language();
    }

    @Override
    public String getDisplayName() {
	return "Movie Query";
    }

}
