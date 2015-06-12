/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2008 Sun Microsystems, Inc.
 */

package org.netbeans.lib.visage.lexer;

import org.netbeans.api.visage.lexer.VSGStringTokenId;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerInput;
import org.netbeans.spi.lexer.LexerRestartInfo;
import org.netbeans.spi.lexer.TokenFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Lexical analyzer for java string language.
 *
 * @author Miloslav Metelka
 * @version 1.00
 */

public class VSGStringLexer implements Lexer<VSGStringTokenId> {
    private static Logger log = Logger.getLogger(VSGStringLexer.class.getName());
    private static final int EOF = LexerInput.EOF;

    private LexerInput input;

    private TokenFactory<VSGStringTokenId> tokenFactory;
    private final boolean forceStringLiteralOnly;
    private boolean rl_slStartPossible = false; // represent possible start of RBRACE_LBRACE_STRING_LITERAL.

    public VSGStringLexer(LexerRestartInfo<VSGStringTokenId> info, boolean forceStringLiteralOnly) {
        this.forceStringLiteralOnly = forceStringLiteralOnly;
        this.input = info.input();
        this.tokenFactory = info.tokenFactory();
        assert (info.state() == null); // passed argument always null
    }

    public Object state() {
        return null;
    }

    public Token<VSGStringTokenId> nextToken() {
        while (true) {
            int ch = input.read();
            if (log.isLoggable(Level.FINE))
                log.fine("Reading character: " + (ch == EOF ? "<EOF>" : Character.toString((char) ch)));
            switch (ch) {
                case EOF:
                    if (input.readLength() > 0)
                        return token(VSGStringTokenId.TEXT);
                    else
                        return null;
                case '\\': //NOI18N
                    if (input.readLength() > 1) {// already read some text
                        input.backup(1);
                        return tokenFactory.createToken(VSGStringTokenId.TEXT, input.readLength());
                    }
                    switch (ch = input.read()) {
                        case '{': //NOI18N
                            return token(VSGStringTokenId.CODE_OPENING_BRACE_ESCAPE);
                        case '}': //NOI18N
                            return token(VSGStringTokenId.CODE_ENCLOSING_BRACE_ESCAPE);
                        case 'b': //NOI18N
                            return token(VSGStringTokenId.BACKSPACE);
                        case 'f': //NOI18N
                            return token(VSGStringTokenId.FORM_FEED);
                        case 'n': //NOI18N
                            return token(VSGStringTokenId.NEWLINE);
                        case 'r': //NOI18N
                            return token(VSGStringTokenId.CR);
                        case 't': //NOI18N
                            return token(VSGStringTokenId.TAB);
                        case '\'': //NOI18N
                            return token(VSGStringTokenId.SINGLE_QUOTE);
                        case '"': //NOI18N
                            return token(VSGStringTokenId.DOUBLE_QUOTE);
                        case '\\': //NOI18N
                            return token(VSGStringTokenId.BACKSLASH);
                        case 'u': //NOI18N
                            while ('u' == (ch = input.read())) {
                            }//NOI18N

                            for (int i = 0; ; i++) {
                                ch = Character.toLowerCase(ch);

                                if ((ch < '0' || ch > '9') && (ch < 'a' || ch > 'f')) { //NOI18N
                                    input.backup(1);
                                    return token(VSGStringTokenId.UNICODE_ESCAPE_INVALID);
                                }

                                if (i == 3) { // four digits checked, valid sequence
                                    return token(VSGStringTokenId.UNICODE_ESCAPE);
                                }

                                ch = input.read();
                            }

                        case '0':
                        case '1':
                        case '2':
                        case '3': //NOI18N
                            switch (input.read()) {
                                case '0':
                                case '1':
                                case '2':
                                case '3': //NOI18N
                                case '4':
                                case '5':
                                case '6':
                                case '7': //NOI18N
                                    switch (input.read()) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3': //NOI18N
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7': //NOI18N
                                            return token(VSGStringTokenId.OCTAL_ESCAPE);
                                    }
                                    input.backup(1);
                                    return token(VSGStringTokenId.OCTAL_ESCAPE_INVALID);
                            }
                            input.backup(1);
                            return token(VSGStringTokenId.OCTAL_ESCAPE_INVALID);
                    }
                    input.backup(1);
                    return token(VSGStringTokenId.ESCAPE_SEQUENCE_INVALID);
                case '{':
                    if (input.readLength() > 1 || forceStringLiteralOnly) {// already read some text
                        input.backup(1);
                        return tokenFactory.createToken(VSGStringTokenId.TEXT, input.readLength());
                    }
                    rl_slStartPossible = false;
                    return tokenFactory.createToken(VSGStringTokenId.CODE_OPENING_BRACE, input.readLength());

                case '}':
                    if (input.readLength() > 1 || forceStringLiteralOnly || rl_slStartPossible) {
                        return tokenFactory.createToken(VSGStringTokenId.TEXT, input.readLength());
                    } else {
                        //this character is code enclosing bracket only if it is first read character!
                        rl_slStartPossible = true;
                        return tokenFactory.createToken(VSGStringTokenId.CODE_ENCLOSING_BRACE, input.readLength());
                    }

            } // end of switch (ch)
        } // end of while(true)
    }

    private Token<VSGStringTokenId> token(VSGStringTokenId id) {
        return tokenFactory.createToken(id);
    }

    public void release() {
    }

}