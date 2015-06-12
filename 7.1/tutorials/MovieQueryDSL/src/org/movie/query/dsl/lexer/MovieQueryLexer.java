package org.movie.query.dsl.lexer;

import org.movie.query.dsl.generated.MovieQueryParserTokenManager;
import org.movie.query.dsl.generated.SimpleCharStream;
import org.movie.query.dsl.generated.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class MovieQueryLexer implements Lexer<MovieQueryTokenId> {

    private LexerRestartInfo<MovieQueryTokenId> info;

    MovieQueryLexer(LexerRestartInfo<MovieQueryTokenId> info) {
	this.info = info;
	SimpleCharStream stream = new SimpleCharStream(info.input());
	MovieQueryParserTokenManager.ReInit(stream);
    }

    @Override
    public org.netbeans.api.lexer.Token<MovieQueryTokenId> nextToken() {
	Token token = MovieQueryParserTokenManager.getNextToken();
	if (info.input().readLength() < 1) {
	    return null;
	}
	return info.tokenFactory().createToken(MovieQueryLanguageHierarchy.getValidToken(token.kind));
    }

    @Override
    public Object state() {
	return null;
    }

    @Override
    public void release() {
    }

}