package org.dartlang;

import org.antlr.runtime.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class DartLexer implements Lexer<DartTokenId> {

    private final LexerRestartInfo<DartTokenId> info;

    private final GeneratedDartLexer gdl;

    public DartLexer(LexerRestartInfo<DartTokenId> info) {
        this.info = info;

        AntlrCharStream charStream = new AntlrCharStream(info.input(), "Dart");
        gdl = new GeneratedDartLexer(charStream);
    }

    @Override
    public org.netbeans.api.lexer.Token<DartTokenId> nextToken() {
        Token token = gdl.nextToken();
        if (token.getType() != GeneratedDartLexer.EOF) {
            DartTokenId tokenId = DartLanguageHierarchy.getToken(token.getType());
            return info.tokenFactory().createToken(tokenId);
        }
        return null;
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }
    
}