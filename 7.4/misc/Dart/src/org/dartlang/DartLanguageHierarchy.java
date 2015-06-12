package org.dartlang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

class DartLanguageHierarchy extends LanguageHierarchy<DartTokenId> {

    private static final List<DartTokenId> tokens = new ArrayList<DartTokenId>();
    private static final Map<Integer, DartTokenId> idToToken = new HashMap<Integer, DartTokenId>();

    static {
        TokenType[] tokenTypes = TokenType.values();
        for (TokenType tokenType : tokenTypes) {
            tokens.add(new DartTokenId(tokenType.name(), tokenType.category, tokenType.id));
        }
        for (DartTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized DartTokenId getToken(int id) {
        return idToToken.get(id);
    }

    @Override
    protected synchronized Collection<DartTokenId> createTokenIds() {
        return tokens;
    }

    @Override
    protected synchronized Lexer<DartTokenId> createLexer(LexerRestartInfo<DartTokenId> info) {
        return new DartLexer(info);
    }

    @Override
    protected String mimeType() {
        return "text/x-dart";
    }
    
}