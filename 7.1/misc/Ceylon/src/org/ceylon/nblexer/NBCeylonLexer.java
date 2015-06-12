/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ceylon.nblexer;

import com.redhat.ceylon.compiler.typechecker.parser.CeylonLexer;
import org.netbeans.api.lexer.PartType;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author geertjan
 */
class NBCeylonLexer implements Lexer<CeylonTokenId> {

    private LexerRestartInfo<CeylonTokenId> info;
    private CeylonLexer ceylonLexer;

    public NBCeylonLexer(LexerRestartInfo<CeylonTokenId> info) {
	this.info = info;
	AntlrCharStream charStream = new AntlrCharStream(info.input(), "Ceylon");
	ceylonLexer = new CeylonLexer(charStream);
    }

    @Override
    public org.netbeans.api.lexer.Token<CeylonTokenId> nextToken() {
	org.antlr.runtime.Token token = ceylonLexer.nextToken();
	org.netbeans.api.lexer.Token<CeylonTokenId> resultToken = null;
	if (token.getType() != CeylonLexer.EOF) {
	    CeylonTokenId tokenId = CeylonTokenHierarchy.getToken(token.getType());
	    resultToken = info.tokenFactory().createToken(tokenId);
	} else if (info.input().readLength() > 0) // incomplete token, return as a comment
	{
	    CeylonTokenId tokenId = CeylonTokenHierarchy.getToken(CeylonLexer.LINE_COMMENT);
	    resultToken = info.tokenFactory().createToken(tokenId, info.input().readLength(), PartType.MIDDLE);
	}
	return resultToken;
    }

    @Override
    public Object state() {
	return null;
    }

    @Override
    public void release() {
    }
}