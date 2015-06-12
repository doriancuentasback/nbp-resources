/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.query.dsl.lexer;

import java.util.*;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 *
 * EOF = 0; WHITESPACE = 1; AND = 2; OR = 3; MOVIE = 4; ACTOR = 5; DIRECTOR = 6;
 * KEYWORD = 7; LPAREN = 8; RPAREN = 9; EQUALS = 10; NOTEQUAL = 11; STRING = 12;
 * QUOTED_STRING = 13;
 *
 * @author geertjan
 */
public class MovieQueryLanguageHierarchy extends LanguageHierarchy<MovieQueryTokenId> {

    private static List<MovieQueryTokenId> tokens;
    private static Map<Integer, MovieQueryTokenId> idToToken;

    private static void init() {
	tokens = Arrays.<MovieQueryTokenId>asList(new MovieQueryTokenId[]{
		    new MovieQueryTokenId("EOF", "whitespace", 0),
		    new MovieQueryTokenId("WHITESPACE", "whitespace", 1),
		    new MovieQueryTokenId("AND", "word", 2),
		    new MovieQueryTokenId("OR", "word", 3),
		    new MovieQueryTokenId("MOVIE", "entity", 4),
		    new MovieQueryTokenId("ACTOR", "entity", 5),
		    new MovieQueryTokenId("DIRECTOR", "entity", 6),
		    new MovieQueryTokenId("KEYWORD", "key", 7),
		    new MovieQueryTokenId("QUOTE", "symbol", 8),
		    new MovieQueryTokenId("SINGLE_QUOTE", "symbol", 9),
		    new MovieQueryTokenId("SEMI", "symbol", 10),
		    new MovieQueryTokenId("COMMA", "symbol", 11),
		    new MovieQueryTokenId("LPAREN", "symbol", 12),
		    new MovieQueryTokenId("RPAREN", "symbol", 13),
		    new MovieQueryTokenId("EQUALS", "symbol", 14),
		    new MovieQueryTokenId("NOTEQUAL", "symbol", 15),
		    new MovieQueryTokenId("STRING", "string", 16),
		    new MovieQueryTokenId("QUOTED_STRING", "quoted", 17),
		});
	idToToken = new HashMap<Integer, MovieQueryTokenId>();
	for (MovieQueryTokenId token : tokens) {
	    idToToken.put(token.ordinal(), token);
	}
    }

    static synchronized MovieQueryTokenId getValidToken(int id) {
	if (idToToken == null) {
	    init();
	}
	return idToToken.get(id);
    }

    @Override
    protected synchronized Collection<MovieQueryTokenId> createTokenIds() {
	if (tokens == null) {
	    init();
	}
	return tokens;
    }

    @Override
    protected synchronized Lexer<MovieQueryTokenId> createLexer(LexerRestartInfo<MovieQueryTokenId> info) {
	return new MovieQueryLexer(info);
    }

    @Override
    protected String mimeType() {
	return "text/x-movie-query";
    }

}