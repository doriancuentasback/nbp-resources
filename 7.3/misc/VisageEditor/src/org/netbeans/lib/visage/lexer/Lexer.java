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
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2008 Sun
 * Microsystems, Inc. All Rights Reserved.
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 */

package org.netbeans.lib.visage.lexer;

import com.sun.tools.mjavac.util.Context;
import com.sun.tools.mjavac.util.JCDiagnostic;
import com.sun.tools.mjavac.util.Log;
import com.sun.tools.mjavac.util.Convert;
import org.antlr.runtime.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.visage.tools.util.MsgSym;

/**
 * Lexer base class provide user code for grammar. This code is called from antlr generated lexer. The main
 * purpose is to cover differences between visagec lexer customizations and this module.
 *
 * @author Rastislav Komara (<a href="mailto:rastislav .komara@sun.com">RKo</a>)
 */
public abstract class Lexer extends org.antlr.runtime.Lexer {
    public final BraceQuoteTracker NULL_BQT = new BraceQuoteTracker(null, '\'', false); // NOI18N
    private BraceQuoteTracker quoteStack = NULL_BQT;
    /**
     * The log to be used for error diagnostics.
     */
    protected static Log log = new MyLog(new Context());
    private static final Logger logger = Logger.getLogger(Lexer.class.getName());
    private List<Token> tokens = new ArrayList<Token>();

    // quote context --
    static final int CUR_QUOTE_CTX      = 0;    // 0 = use current quote context
    static final int SNG_QUOTE_CTX      = 1;    // 1 = single quote quote context
    static final int DBL_QUOTE_CTX      = 2;    // 2 = double quote quote context

    // Recorded start of string with embedded expression
    //
    int eStringStart = 0;

    public void emit(Token token) {
        state.token = token;
        tokens.add(token);
    }

    public Token nextToken() {
        if (tokens.size() > 0) {
            return tokens.remove(0);

        }
        super.nextToken();
        if (tokens.size() == 0) {
            emit(Token.EOF_TOKEN);
        }
        return tokens.remove(0);
    }


    /**
     * Set the complete text of this token; it wipes any previous
     * changes to the text.
     */
    @Override
    public void setText(String text) {
//        super.setText(text);
    }

    protected Lexer(org.antlr.runtime.CharStream charStream, org.antlr.runtime.RecognizerSharedState recognizerSharedState) {
        super(charStream, recognizerSharedState);
    }

    protected Lexer() {
    }

    protected Lexer(CharStream input) {
        super(input);
    }


    /**
     * Gets 'braceQuoteTracker'.
     *
     * @return Value for property 'braceQuoteTracker'.
     */
    public BraceQuoteTracker getBraceQuoteTracker() {
        return quoteStack;
    }

    /**
     * Sets 'braceQuoteTracker'.
     *
     * @param stack Value to set for property 'braceQuoteTracker'.
     */
    public void setBraceQuoteTracker(BraceQuoteTracker stack) {
        quoteStack = stack;
    }

    /**
     * Gets 'sharedState'.
     *
     * @return Value for property 'sharedState'.
     */
    public RecognizerSharedState getSharedState() {
        return state;
    }



    /**
     * Trying to recover from error by consuming all characters until one matches correct follow token or EOF.
     *
     * @param re Exception from which we try to recover.
     */
    @Override
    public void recover(RecognitionException re) {
        logger.severe(getErrorMessage(re, getTokenNames()) + " Trying to recover from error. " + re.getClass().getSimpleName()); // NOI18N
        final BitSet bitSet = computeErrorRecoverySet();
        consumeUntil(input, bitSet);
        input.consume(); // consuming last character.
    }

    @Override
    public void reportError(RecognitionException e) {
        if (e instanceof FailedPredicateException) {
            if (logger.isLoggable(Level.WARNING))
                logger.warning(e.getClass().getSimpleName() + " found unexpected type " // NOI18N
                        + Integer.toString(e.getUnexpectedType()) + " trying to recover from buggy source code."); // NOI18N
            // we just skip this character. Maybe the next one will be OK. Preventing endless loop.
            input.consume();            
        } else {
            super.reportError(e);
        }
    }

    /**
     * Sets 'sharedState'.
     *
     * @param state Value to set for property 'sharedState'.
     */
    public void setSharedState(RecognizerSharedState state) {
        this.state = state;
    }

    /**
     * Creates new {@link Lexer.BraceQuoteTracker} instance. This is
     * factory like method to deal with non static inner class.
     *
     * @param prev            previous stack entry (stack top)
     * @param quote           quote char.
     * @param percentIsFormat true is PercentIsFormat[int] rules matches.
     * @return new instance of {@link Lexer.BraceQuoteTracker} which represents actual stack top.
     */
    BraceQuoteTracker createBQT(BraceQuoteTracker prev, char quote, boolean percentIsFormat) {
        if (prev == null) return NULL_BQT;
        return new BraceQuoteTracker(prev, quote, percentIsFormat);
    }

    protected void processString() {
    }

    protected void processTranslationKey() {
    }

    protected void enterBrace(int quote, boolean nextIsPercent) {
        quoteStack.enterBrace(quote, nextIsPercent);
    }

    protected void leaveQuote() {
        quoteStack.leaveQuote();
    }

    protected boolean rightBraceLikeQuote(int quote) {
        return quoteStack.rightBraceLikeQuote(quote);
    }

    protected void leaveBrace() {
        quoteStack.leaveBrace();
    }

    protected boolean percentIsFormat() {
        return quoteStack.percentIsFormat();
    }

    protected void resetPercentIsFormat() {
        quoteStack.resetPercentIsFormat();
    }

   /**
     * Returns and indicator of what level of nested expressions
     * the lexer is currently within.
     * @return 0 - start ste, no expressions are active. >1 indicates
     *             the level of nesting that the lexer is currently processing.
     */
    protected int getLexicalState() {
        return quoteStack.getLexicalState();
    }


    /**
     * Overrides the standard ANTLR 3.1 lexer error message generator
     * to provide a message that will make more sense to Visage programmers.
     * @param e The exception that the lexer raised because it could not decode
     *          what to do next.
     * @param tokenNames The ANTLR supplied list of token names as used in the lexer.
     * @return The string that shuold be used as the error message by the Visage compiler
     */
    @Override
    public String getErrorMessage(RecognitionException e, String[] tokenNames) {

        StringBuffer mb = new StringBuffer();

        // No viable alt means that somehow the lexer rule or the
        // lexer itself found a character that cannot match any
        // decisions points. In theory, as of the v4 lexer, this cannot
        // happen unless something went wrong in the gramamr analysis.
        // However, because there are predicates used for embedded string
        // expressions, and this can play with the analysis, we cater for it
        // anyway.
        //
        if (e instanceof NoViableAltException) {

            if (e.c == Token.EOF) {

                // Changes in the v4 lexer mean that it shoudl be virtually impossible
                // to trigger this error. However it is perhaps possible if the lexer
                // predicts a token, tries to match it and discovers EOF because this
                // is a file produced on Windows and has no terminating \n. Hence
                // we look for this EOF sceanrio and report it nicely.
                //
                mb.append("Sorry, I scanned to the end of your script from around line " + e.line + " but could not see how to process it. ");
                mb.append("This can happen if you forget a closing delimiter such as ''' '\"' or '{'");

            } else {


                // We managed to predict some lexer token that once we started
                // down the path, turned out not to be what we thought it was.
                // With the v4 lexer, this shoudl not be happening, but this message
                // is used as belt and braces protection.
                //
                mb.append("Sorry, but the character " + getCharErrorDisplay(e.c));
                mb.append("is not allowed in a Visage script. Well at least, not here.");
            }

        } else {

            // Any other kind of exception is something we cannot really deal with
            // here. So we gather ANTLR's assessment of the error state and
            // use that.
            //
            mb.append(super.getErrorMessage(e, tokenNames));
        }

        return mb.toString();
    }


    /**
     * Override for the ANTLR 3.x message display routine so that we can log
     * errors within the Visage compiler infrastructure.
     *
     * @param tokenNames ANTLR provided array of the lexer token names
     * @param e The excpetion that was raised by the lexer, for further action.
     */
    @Override
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {

        // Find out how we wish to describe this expcetion to the script author/user
        //
        String msg = getErrorMessage(e, tokenNames);

        // Record the error for later output or capture by development tools
        //
        log.error(getCharIndex(), MsgSym.MESSAGE_VISAGE_GENERALERROR, msg);
    }

    protected boolean checkIntLiteralRange(String text, int pos, int radix, boolean negative) {
        // Because Long.MIN_VALUE < -Long.MAX_VALUE we need to use the actual negative when present
        //
        String checkText = negative? "-" + text : text;

        // Correct start position for error display
        //
        pos = pos - checkText.length();

        try {

            Convert.string2long(checkText, radix);

        } catch (Exception e) {

            // Number form was too outrageous even for the converter
            //
            log.error(pos, MsgSym.MESSAGE_VISAGE_LITERAL_OUT_OF_RANGE, "Long", checkText);

            return false;
        }

        return true;
    }

    protected void checkIntLiteralRange(String text, int pos, int radix) {
//
//        long value = Convert.string2long(text, radix);
//
//        pos = pos - text.length();
//
//        if (previousTokenType == v3Lexer.SUB) {
//            value = -value;
//            if ( value < Integer.MIN_VALUE )
//                log.error(pos, MsgSym.MESSAGE_JAVAFX_LITERAL_OUT_OF_RANGE, "small", new String("-" + text));
//
//        } else if (value > Integer.MAX_VALUE) {
//            log.error(pos, MsgSym.MESSAGE_JAVAFX_LITERAL_OUT_OF_RANGE, "big", text);
//
//        } 
    }

    protected void processFormatString() {
        
    }

    /**
     * Track "He{"l{"l"}o"} world" quotes
     */
    /*static*/ class BraceQuoteTracker {
//        private /*static*/ Logger log = Logger.getLogger(Lexer.BraceQuoteTracker.class.getName());
        //        private BraceQuoteTracker quoteStack = null;
        private int braceDepth;
        private char quote;
        private boolean percentIsFormat;
        private Lexer.BraceQuoteTracker next;

        public BraceQuoteTracker(Lexer.BraceQuoteTracker prev, char quote, boolean percentIsFormat) {
            this.quote = quote;
            this.percentIsFormat = percentIsFormat;
            this.braceDepth = 1;
            this.next = prev;
        }

        /*static*/ void enterBrace(int quote, boolean percentIsFormat) {
            if (quote == 0) {  // exisiting string expression or non string expression
                if (quoteStack != NULL_BQT) {
//                    if (log.isLoggable(Level.INFO)) log.info("+B");
                    ++quoteStack.braceDepth;
                    quoteStack.percentIsFormat = percentIsFormat;
                }
            } else {
                quoteStack = new Lexer.BraceQuoteTracker(quoteStack, (char) quote, percentIsFormat); // push
//                if (log.isLoggable(Level.INFO)) log.info("+B PUSH => " + quoteStack);
            }
        }

        /**
         * Return quote kind if we are reentering a quote
         *
         * @return return quote on stack.
         */
        /*static*/ char leaveBrace() {
//            if (log.isLoggable(Level.INFO)) log.info("-B");
            if (quoteStack != NULL_BQT && --quoteStack.braceDepth == 0) {
                return quoteStack.quote;
            }
            return 0;
        }

        /*static*/ boolean rightBraceLikeQuote(int quote) {
            final boolean b = quoteStack != NULL_BQT && quoteStack.braceDepth == 1 && (quote == 0 || quoteStack.quote == (char) quote);
//            if (log.isLoggable(Level.INFO)) log.info("rightBraceLikeQuote: " + b);
            return b;
        }

        /*static*/ void leaveQuote() {
            assert (quoteStack != NULL_BQT && quoteStack.braceDepth == 0);
            quoteStack = quoteStack.next; // pop
//            if (log.isLoggable(Level.INFO)) log.info("+\" POP => " + quoteStack);
        }

        /*static*/ boolean percentIsFormat() {
            return quoteStack != NULL_BQT && quoteStack.percentIsFormat;
        }

        /*static*/ void resetPercentIsFormat() {
            quoteStack.percentIsFormat = false;
        }

        /*static*/ boolean inBraceQuote() {
            final boolean b = quoteStack != NULL_BQT;
//            if (log.isLoggable(Level.INFO)) log.info("inBraceQuote: " + b);
            return b;
        }


        /**
         * Encode the lexical state into an integer, to permit incremental lexing in IDEs that support it
         * @return Level of emdedded
         */
        int getLexicalState() {
            // This is a hack -- state is not invertible yet
            return (quoteStack == NULL_BQT) ? 0 : quoteStack.braceDepth;

        }

        /**
         * {@inheritDoc}
         */
        public String toString() {
            return "BQT[" + // NOI18N
                    "depth=" + braceDepth + // NOI18N
                    ", quote=" + Integer.toString(quote) + // NOI18N
                    ", pif=" + percentIsFormat + // NOI18N
                    ", next=" + next + // NOI18N
                    ']'; // NOI18N
        }


        /**
         * Gets 'braceDepth'.
         *
         * @return Value for property 'braceDepth'.
         */
        public int getBraceDepth() {
            return braceDepth;
        }

        /**
         * Gets 'quote'.
         *
         * @return Value for property 'quote'.
         */
        public char getQuote() {
            return quote;
        }

        /**
         * Gets 'percentIsFormat'.
         *
         * @return Value for property 'percentIsFormat'.
         */
        public boolean isPercentIsFormat() {
            return percentIsFormat;
        }

        /**
         * Gets 'next'.
         *
         * @return Value for property 'next'.
         */
        public Lexer.BraceQuoteTracker getNext() {
            return next;
        }

        /**
         * Sets brace depth for actual record. Brace depth should be counted from current depth in stack. But. If there
         * are 2 similar braces in sequence only depht is increased, not number of levels.
         *
         * @param depth the number of quotes in line.
         */
        void setBraceDepth(int depth) {
            this.braceDepth = depth;
        }
    }

    private static class MyLog extends Log {


        static Log instace(Context context) {
            if (context.get(logKey) != null) {
                context.put(logKey, (Log)null);
            }
            return new MyLog(context);
        }
        /**
         * Construct a log with default settings.
         *
         * @param context null
         */
        private MyLog(Context context) {
            super(context);
        }

        /**
         * Report an error, unless another error was already reported at same
         * source position.
         *
         * @param key  The key for the localized error message.
         * @param args Fields of the error message.
         */
        public void error(String key, Object... args) {
            error(null, key, args);
        }

        /**
         * Report an error, unless another error was already reported at same
         * source position.
         *
         * @param pos  The source position at which to report the error.
         * @param key  The key for the localized error message.
         * @param args Fields of the error message.
         */
        public void error(JCDiagnostic.DiagnosticPosition pos, String key, Object... args) {
            error(pos.getStartPosition(), key, args);
        }

        /**
         * Report an error, unless another error was already reported at same
         * source position.
         *
         * @param pos  The source position at which to report the error.
         * @param key  The key for the localized error message.
         * @param args Fields of the error message.
         */
        @Override
        public void error(int pos, String key, Object... args) {
           logger.fine("Lexer error: " + key + " @" + pos + "\tCaused by: " + Arrays.asList(args)); // NOI18N
        }
    }
}
