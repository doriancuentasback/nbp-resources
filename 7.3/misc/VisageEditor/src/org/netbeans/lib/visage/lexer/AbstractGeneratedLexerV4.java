
package org.netbeans.lib.visage.lexer;

import org.antlr.runtime.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Lexer base class provide user code for grammar. This code is called from antlr generated lexer. The main
 * purpose is to cover differences between visagec lexer customizations and this module.
 *
 * @author Rastislav Komara (<a href="mailto:rastislav .komara@sun.com">RKo</a>)
 */
public abstract class AbstractGeneratedLexerV4 extends Lexer {
    protected int previousTokenType;

    /**
     * A
     * @param charStream a
     * @param recognizerSharedState a
     */
    protected AbstractGeneratedLexerV4(CharStream charStream, RecognizerSharedState recognizerSharedState) {
        super(charStream, recognizerSharedState);
    }

    protected AbstractGeneratedLexerV4() {
    }

    protected AbstractGeneratedLexerV4(CharStream input) {
        super(input);
    }

    protected void checkIntLiteralRange(String text, int pos, int radix) {
    }
}
