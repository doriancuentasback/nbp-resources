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
 * Portions Copyrighted 2007 Sun Microsystems, Inc.
 */

// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g 2009-03-31 17:11:27


package org.netbeans.lib.visage.lexer;

import com.sun.tools.mjavac.util.Context;
import com.sun.tools.mjavac.util.Log;
import org.antlr.runtime.*;
import org.visage.tools.util.MsgSym;


public class v4Lexer extends AbstractGeneratedLexerV4 {
    public static final int FUNCTION=28;
    public static final int PACKAGE=49;
    public static final int LT=89;
    public static final int STAR=95;
    public static final int WHILE=73;
    public static final int MOD=41;
    public static final int TranslationKeyBody=119;
    public static final int TRIGGER=66;
    public static final int NEW=43;
    public static final int INDEXOF=31;
    public static final int PUBLIC_READ=55;
    public static final int TIME_LITERAL=121;
    public static final int NOT=44;
    public static final int EOF=-1;
    public static final int RBRACE_QUOTE_STRING_LITERAL=115;
    public static final int BREAK=14;
    public static final int LBRACKET=75;
    public static final int RPAREN=81;
    public static final int IMPORT=30;
    public static final int STRING_LITERAL=112;
    public static final int FLOATING_POINT_LITERAL=127;
    public static final int INSERT=34;
    public static final int SUBSUB=107;
    public static final int Digits=125;
    public static final int BIND=12;
    public static final int STAREQ=100;
    public static final int RETURN=57;
    public static final int THIS=64;
    public static final int DoubleQuoteBody=109;
    public static final int TRANSLATION_KEY=120;
    public static final int VAR=71;
    public static final int SUPER=62;
    public static final int LAST=38;
    public static final int EQ=87;
    public static final int COMMENT=131;
    public static final int INTO=36;
    public static final int QUES=105;
    public static final int BOUND=13;
    public static final int EQEQ=86;
    public static final int RBRACE=117;
    public static final int POUND=77;
    public static final int LINE_COMMENT=133;
    public static final int PRIVATE=51;
    public static final int STATIC=60;
    public static final int NULL=45;
    public static final int NATIVEARRAY=42;
    public static final int ELSE=20;
    public static final int ON=46;
    public static final int DELETE=19;
    public static final int SLASHEQ=101;
    public static final int ASSERT=8;
    public static final int TRY=68;
    public static final int INVERSE=37;
    public static final int MIXIN=40;
    public static final int PUBLIC_INIT=53;
    public static final int WS=108;
    public static final int TYPEOF=70;
    public static final int INVALIDC=134;
    public static final int OR=47;
    public static final int JavaIDDigit=129;
    public static final int SIZEOF=59;
    public static final int GT=88;
    public static final int FROM=27;
    public static final int CATCH=15;
    public static final int REVERSE=58;
    public static final int FALSE=23;
    public static final int INIT=33;
    public static final int Letter=128;
    public static final int DECIMAL_LITERAL=122;
    public static final int THROW=65;
    public static final int PROTECTED=52;
    public static final int WHERE=72;
    public static final int CLASS=16;
    public static final int DEF=18;
    public static final int PLUSPLUS=79;
    public static final int LBRACE=114;
    public static final int ATTRIBUTE=10;
    public static final int LTEQ=91;
    public static final int SUBEQ=99;
    public static final int Exponent=126;
    public static final int FOR=26;
    public static final int STEP=61;
    public static final int SUB=94;
    public static final int DOTDOT=80;
    public static final int ABSTRACT=4;
    public static final int EXCLUSIVE=21;
    public static final int NextIsPercent=110;
    public static final int AND=6;
    public static final int PLUSEQ=98;
    public static final int LPAREN=76;
    public static final int IF=29;
    public static final int AT=9;
    public static final int AS=7;
    public static final int SLASH=96;
    public static final int IN=32;
    public static final int THEN=63;
    public static final int CONTINUE=17;
    public static final int COMMA=84;
    public static final int IDENTIFIER=130;
    public static final int REPLACE=56;
    public static final int TWEEN=69;
    public static final int DOC_COMMENT=132;
    public static final int QUOTE_LBRACE_STRING_LITERAL=113;
    public static final int PLUS=93;
    public static final int PIPE=78;
    public static final int HEX_LITERAL=124;
    public static final int RBRACKET=82;
    public static final int DOT=85;
    public static final int RBRACE_LBRACE_STRING_LITERAL=116;
    public static final int WITH=74;
    public static final int PERCENT=97;
    public static final int LAZY=39;
    public static final int LTGT=90;
    public static final int OCTAL_LITERAL=123;
    public static final int BEFORE=11;
    public static final int INSTANCEOF=35;
    public static final int GTEQ=92;
    public static final int AFTER=5;
    public static final int TRUE=67;
    public static final int SEMI=83;
    public static final int COLON=104;
    public static final int POSTINIT=50;
    public static final int NOTEQ=103;
    public static final int PERCENTEQ=102;
    public static final int FINALLY=24;
    public static final int OVERRIDE=48;
    public static final int FORMAT_STRING_LITERAL=118;
    public static final int SUCHTHAT=106;
    public static final int EXTENDS=22;
    public static final int PUBLIC=54;
    public static final int SingleQuoteBody=111;
    public static final int FIRST=25;


        // Constructor that creates a message log sink for the 
        // current context.
        // 
        public v4Lexer(Context context, CharStream input) {
        	this(input);
            this.log = Log.instance(context);
        }




    // delegates
    // delegators

    public v4Lexer() {;} 
    public v4Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public v4Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g"; }

    // $ANTLR start "ABSTRACT"
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:100:11: ( 'abstract' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:100:13: 'abstract'
            {
            match("abstract"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABSTRACT"

    // $ANTLR start "AFTER"
    public final void mAFTER() throws RecognitionException {
        try {
            int _type = AFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:101:9: ( 'after' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:101:11: 'after'
            {
            match("after"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AFTER"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:102:8: ( 'and' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:102:10: 'and'
            {
            match("and"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:103:7: ( 'as' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:103:9: 'as'
            {
            match("as"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "ASSERT"
    public final void mASSERT() throws RecognitionException {
        try {
            int _type = ASSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:104:10: ( 'assert' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:104:12: 'assert'
            {
            match("assert"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSERT"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:105:7: ( 'at' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:105:9: 'at'
            {
            match("at"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "ATTRIBUTE"
    public final void mATTRIBUTE() throws RecognitionException {
        try {
            int _type = ATTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:106:12: ( 'attribute' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:106:14: 'attribute'
            {
            match("attribute"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATTRIBUTE"

    // $ANTLR start "BEFORE"
    public final void mBEFORE() throws RecognitionException {
        try {
            int _type = BEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:107:10: ( 'before' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:107:12: 'before'
            {
            match("before"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEFORE"

    // $ANTLR start "BIND"
    public final void mBIND() throws RecognitionException {
        try {
            int _type = BIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:108:8: ( 'bind' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:108:10: 'bind'
            {
            match("bind"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIND"

    // $ANTLR start "BOUND"
    public final void mBOUND() throws RecognitionException {
        try {
            int _type = BOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:109:9: ( 'bound' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:109:11: 'bound'
            {
            match("bound"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOUND"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:110:9: ( 'break' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:110:11: 'break'
            {
            match("break"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:111:9: ( 'catch' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:111:11: 'catch'
            {
            match("catch"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CATCH"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:112:9: ( 'class' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:112:11: 'class'
            {
            match("class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:113:11: ( 'continue' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:113:13: 'continue'
            {
            match("continue"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:114:8: ( 'def' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:114:10: 'def'
            {
            match("def"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:115:10: ( 'delete' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:115:12: 'delete'
            {
            match("delete"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:116:8: ( 'else' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:116:10: 'else'
            {
            match("else"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "EXCLUSIVE"
    public final void mEXCLUSIVE() throws RecognitionException {
        try {
            int _type = EXCLUSIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:117:12: ( 'exclusive' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:117:14: 'exclusive'
            {
            match("exclusive"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCLUSIVE"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:118:11: ( 'extends' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:118:13: 'extends'
            {
            match("extends"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:119:9: ( 'false' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:119:11: 'false'
            {
            match("false"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FINALLY"
    public final void mFINALLY() throws RecognitionException {
        try {
            int _type = FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:120:11: ( 'finally' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:120:13: 'finally'
            {
            match("finally"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FINALLY"

    // $ANTLR start "FIRST"
    public final void mFIRST() throws RecognitionException {
        try {
            int _type = FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:121:9: ( 'first' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:121:11: 'first'
            {
            match("first"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIRST"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:122:8: ( 'for' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:122:10: 'for'
            {
            match("for"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:123:8: ( 'from' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:123:10: 'from'
            {
            match("from"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:124:11: ( 'function' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:124:13: 'function'
            {
            match("function"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:125:7: ( 'if' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:125:9: 'if'
            {
            match("if"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:126:10: ( 'import' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:126:12: 'import'
            {
            match("import"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "INDEXOF"
    public final void mINDEXOF() throws RecognitionException {
        try {
            int _type = INDEXOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:127:11: ( 'indexof' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:127:13: 'indexof'
            {
            match("indexof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEXOF"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:128:7: ( 'in' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:128:9: 'in'
            {
            match("in"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INIT"
    public final void mINIT() throws RecognitionException {
        try {
            int _type = INIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:129:8: ( 'init' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:129:10: 'init'
            {
            match("init"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INIT"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:130:10: ( 'insert' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:130:12: 'insert'
            {
            match("insert"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INSTANCEOF"
    public final void mINSTANCEOF() throws RecognitionException {
        try {
            int _type = INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:131:13: ( 'instanceof' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:131:15: 'instanceof'
            {
            match("instanceof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTANCEOF"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:132:8: ( 'into' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:132:10: 'into'
            {
            match("into"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "INVERSE"
    public final void mINVERSE() throws RecognitionException {
        try {
            int _type = INVERSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:133:11: ( 'inverse' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:133:13: 'inverse'
            {
            match("inverse"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INVERSE"

    // $ANTLR start "LAST"
    public final void mLAST() throws RecognitionException {
        try {
            int _type = LAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:134:8: ( 'last' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:134:10: 'last'
            {
            match("last"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAST"

    // $ANTLR start "LAZY"
    public final void mLAZY() throws RecognitionException {
        try {
            int _type = LAZY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:135:8: ( 'lazy' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:135:10: 'lazy'
            {
            match("lazy"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAZY"

    // $ANTLR start "MIXIN"
    public final void mMIXIN() throws RecognitionException {
        try {
            int _type = MIXIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:136:9: ( 'mixin' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:136:11: 'mixin'
            {
            match("mixin"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIXIN"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:137:8: ( 'mod' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:137:10: 'mod'
            {
            match("mod"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NATIVEARRAY"
    public final void mNATIVEARRAY() throws RecognitionException {
        try {
            int _type = NATIVEARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:138:14: ( 'nativearray' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:138:16: 'nativearray'
            {
            match("nativearray"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NATIVEARRAY"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:139:8: ( 'new' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:139:10: 'new'
            {
            match("new"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:140:8: ( 'not' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:140:10: 'not'
            {
            match("not"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:141:8: ( 'null' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:141:10: 'null'
            {
            match("null"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:142:7: ( 'on' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:142:9: 'on'
            {
            match("on"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:143:7: ( 'or' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:143:9: 'or'
            {
            match("or"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "OVERRIDE"
    public final void mOVERRIDE() throws RecognitionException {
        try {
            int _type = OVERRIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:144:11: ( 'override' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:144:13: 'override'
            {
            match("override"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OVERRIDE"

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:145:11: ( 'package' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:145:13: 'package'
            {
            match("package"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "POSTINIT"
    public final void mPOSTINIT() throws RecognitionException {
        try {
            int _type = POSTINIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:146:11: ( 'postinit' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:146:13: 'postinit'
            {
            match("postinit"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POSTINIT"

    // $ANTLR start "PRIVATE"
    public final void mPRIVATE() throws RecognitionException {
        try {
            int _type = PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:147:11: ( 'private' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:147:13: 'private'
            {
            match("private"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIVATE"

    // $ANTLR start "PROTECTED"
    public final void mPROTECTED() throws RecognitionException {
        try {
            int _type = PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:148:12: ( 'protected' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:148:14: 'protected'
            {
            match("protected"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROTECTED"

    // $ANTLR start "PUBLIC_INIT"
    public final void mPUBLIC_INIT() throws RecognitionException {
        try {
            int _type = PUBLIC_INIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:149:17: ( 'public-init' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:149:19: 'public-init'
            {
            match("public-init"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLIC_INIT"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:150:10: ( 'public' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:150:12: 'public'
            {
            match("public"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "PUBLIC_READ"
    public final void mPUBLIC_READ() throws RecognitionException {
        try {
            int _type = PUBLIC_READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:151:17: ( 'public-read' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:151:19: 'public-read'
            {
            match("public-read"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLIC_READ"

    // $ANTLR start "REPLACE"
    public final void mREPLACE() throws RecognitionException {
        try {
            int _type = REPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:152:11: ( 'replace' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:152:13: 'replace'
            {
            match("replace"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPLACE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:153:10: ( 'return' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:153:12: 'return'
            {
            match("return"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "REVERSE"
    public final void mREVERSE() throws RecognitionException {
        try {
            int _type = REVERSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:154:11: ( 'reverse' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:154:13: 'reverse'
            {
            match("reverse"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REVERSE"

    // $ANTLR start "SIZEOF"
    public final void mSIZEOF() throws RecognitionException {
        try {
            int _type = SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:155:10: ( 'sizeof' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:155:12: 'sizeof'
            {
            match("sizeof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIZEOF"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:156:10: ( 'static' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:156:12: 'static'
            {
            match("static"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "STEP"
    public final void mSTEP() throws RecognitionException {
        try {
            int _type = STEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:157:8: ( 'step' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:157:10: 'step'
            {
            match("step"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STEP"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:158:9: ( 'super' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:158:11: 'super'
            {
            match("super"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:159:8: ( 'then' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:159:10: 'then'
            {
            match("then"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:160:8: ( 'this' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:160:10: 'this'
            {
            match("this"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "THROW"
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:161:9: ( 'throw' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:161:11: 'throw'
            {
            match("throw"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THROW"

    // $ANTLR start "TRIGGER"
    public final void mTRIGGER() throws RecognitionException {
        try {
            int _type = TRIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:162:11: ( 'trigger' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:162:13: 'trigger'
            {
            match("trigger"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRIGGER"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:163:8: ( 'true' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:163:10: 'true'
            {
            match("true"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:164:8: ( 'try' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:164:10: 'try'
            {
            match("try"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "TWEEN"
    public final void mTWEEN() throws RecognitionException {
        try {
            int _type = TWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:165:9: ( 'tween' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:165:11: 'tween'
            {
            match("tween"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWEEN"

    // $ANTLR start "TYPEOF"
    public final void mTYPEOF() throws RecognitionException {
        try {
            int _type = TYPEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:166:10: ( 'typeof' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:166:12: 'typeof'
            {
            match("typeof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPEOF"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:167:8: ( 'var' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:167:10: 'var'
            {
            match("var"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:168:9: ( 'where' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:168:11: 'where'
            {
            match("where"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:169:9: ( 'while' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:169:11: 'while'
            {
            match("while"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:170:8: ( 'with' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:170:10: 'with'
            {
            match("with"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:175:10: ( '[' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:175:12: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:176:9: ( '(' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:176:11: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "POUND"
    public final void mPOUND() throws RecognitionException {
        try {
            int _type = POUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:177:8: ( '#' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:177:10: '#'
            {
            match('#'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POUND"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:178:7: ( '|' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:178:9: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "PLUSPLUS"
    public final void mPLUSPLUS() throws RecognitionException {
        try {
            int _type = PLUSPLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:179:10: ( '++' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:179:12: '++'
            {
            match("++"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSPLUS"

    // $ANTLR start "DOTDOT"
    public final void mDOTDOT() throws RecognitionException {
        try {
            int _type = DOTDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:180:9: ( '..' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:180:11: '..'
            {
            match(".."); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOTDOT"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:181:9: ( ')' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:181:11: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:182:10: ( ']' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:182:12: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:183:7: ( ';' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:183:9: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:184:8: ( ',' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:184:10: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:185:7: ( '.' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:185:9: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "EQEQ"
    public final void mEQEQ() throws RecognitionException {
        try {
            int _type = EQEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:186:7: ( '==' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:186:9: '=='
            {
            match("=="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQEQ"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:187:6: ( '=' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:187:8: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:188:6: ( '>' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:188:8: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:189:6: ( '<' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:189:8: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTGT"
    public final void mLTGT() throws RecognitionException {
        try {
            int _type = LTGT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:190:7: ( '<>' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:190:9: '<>'
            {
            match("<>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTGT"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:191:7: ( '<=' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:191:9: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:192:7: ( '>=' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:192:9: '>='
            {
            match(">="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:193:7: ( '+' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:193:9: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:194:7: ( '-' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:194:9: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:195:7: ( '*' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:195:9: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:196:8: ( '/' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:196:10: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:197:10: ( '%' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:197:12: '%'
            {
            match('%'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "PLUSEQ"
    public final void mPLUSEQ() throws RecognitionException {
        try {
            int _type = PLUSEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:198:9: ( '+=' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:198:11: '+='
            {
            match("+="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSEQ"

    // $ANTLR start "SUBEQ"
    public final void mSUBEQ() throws RecognitionException {
        try {
            int _type = SUBEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:199:8: ( '-=' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:199:10: '-='
            {
            match("-="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBEQ"

    // $ANTLR start "STAREQ"
    public final void mSTAREQ() throws RecognitionException {
        try {
            int _type = STAREQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:200:9: ( '*=' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:200:11: '*='
            {
            match("*="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAREQ"

    // $ANTLR start "SLASHEQ"
    public final void mSLASHEQ() throws RecognitionException {
        try {
            int _type = SLASHEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:201:10: ( '/=' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:201:12: '/='
            {
            match("/="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASHEQ"

    // $ANTLR start "PERCENTEQ"
    public final void mPERCENTEQ() throws RecognitionException {
        try {
            int _type = PERCENTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:202:11: ( '%=' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:202:13: '%='
            {
            match("%="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTEQ"

    // $ANTLR start "NOTEQ"
    public final void mNOTEQ() throws RecognitionException {
        try {
            int _type = NOTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:203:8: ( '!=' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:203:10: '!='
            {
            match("!="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQ"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:204:8: ( ':' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:204:10: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "QUES"
    public final void mQUES() throws RecognitionException {
        try {
            int _type = QUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:205:7: ( '?' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:205:9: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUES"

    // $ANTLR start "SUCHTHAT"
    public final void mSUCHTHAT() throws RecognitionException {
        try {
            int _type = SUCHTHAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:206:10: ( '=>' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:206:12: '=>'
            {
            match("=>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUCHTHAT"

    // $ANTLR start "SUBSUB"
    public final void mSUBSUB() throws RecognitionException {
        try {
            int _type = SUBSUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:207:9: ( '--' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:207:11: '--'
            {
            match("--"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBSUB"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:215:5: ( ( ( ' ' | '\\t' | '\\u000C' ) | ( '\\n' | '\\r' ) ) )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:215:8: ( ( ' ' | '\\t' | '\\u000C' ) | ( '\\n' | '\\r' ) )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( state.backtracking==0 ) {

              			_channel=HIDDEN;
              		
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            	// Record string start for error messages
            	//
            	int sPos = getCharIndex();
            	
            	// Record start position of expression strings for error messages
            	//
            	eStringStart = getCharIndex();


            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:246:2: ( '\"' DoubleQuoteBody ( '\"' | '{' NextIsPercent[DBL_QUOTE_CTX] | ( '\\n' | '\\r' ) ) | '\\'' SingleQuoteBody ( '\\'' | '{' NextIsPercent[SNG_QUOTE_CTX] | ( '\\n' | '\\r' | EOF ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:246:4: '\"' DoubleQuoteBody ( '\"' | '{' NextIsPercent[DBL_QUOTE_CTX] | ( '\\n' | '\\r' ) )
                    {
                    match('\"'); if (state.failed) return ;
                    mDoubleQuoteBody(); if (state.failed) return ;
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:248:5: ( '\"' | '{' NextIsPercent[DBL_QUOTE_CTX] | ( '\\n' | '\\r' ) )
                    int alt1=3;
                    switch ( input.LA(1) ) {
                    case '\"':
                        {
                        alt1=1;
                        }
                        break;
                    case '{':
                        {
                        alt1=2;
                        }
                        break;
                    case '\n':
                    case '\r':
                        {
                        alt1=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }

                    switch (alt1) {
                        case 1 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:249:8: '\"'
                            {
                            match('\"'); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                              					  		processString();
                              					  	
                            }

                            }
                            break;
                        case 2 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:255:8: '{' NextIsPercent[DBL_QUOTE_CTX]
                            {
                            match('{'); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                              							_type = QUOTE_LBRACE_STRING_LITERAL;
                              							processString(); 
                              						
                            }
                            mNextIsPercent(DBL_QUOTE_CTX); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:265:7: ( '\\n' | '\\r' )
                            {
                            if ( state.backtracking==0 ) {
                               input.mark(); 
                            }
                            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                                input.consume();
                            state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( state.backtracking==0 ) {

                              							// Don't consume the new line
                              							//
                              							input.rewind();
                              										
                              							// Report the error
                              							//
                              							log.error(sPos, MsgSym.MESSAGE_VISAGE_UNTERMINATED_STRING);
                              										
                              							// Always use a defined string as the value
                              							//
                              							setText(getText() + "\"");
                              										
                              							processString();
                              						
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:290:4: '\\'' SingleQuoteBody ( '\\'' | '{' NextIsPercent[SNG_QUOTE_CTX] | ( '\\n' | '\\r' | EOF ) )
                    {
                    match('\''); if (state.failed) return ;
                    mSingleQuoteBody(); if (state.failed) return ;
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:292:5: ( '\\'' | '{' NextIsPercent[SNG_QUOTE_CTX] | ( '\\n' | '\\r' | EOF ) )
                    int alt3=3;
                    switch ( input.LA(1) ) {
                    case '\'':
                        {
                        alt3=1;
                        }
                        break;
                    case '{':
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        alt3=3;}

                    switch (alt3) {
                        case 1 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:293:8: '\\''
                            {
                            match('\''); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                              					  		processString();
                              					  	
                            }

                            }
                            break;
                        case 2 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:299:8: '{' NextIsPercent[SNG_QUOTE_CTX]
                            {
                            match('{'); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                              							_type = QUOTE_LBRACE_STRING_LITERAL;
                              							processString(); 
                              						
                            }
                            mNextIsPercent(SNG_QUOTE_CTX); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:308:8: ( '\\n' | '\\r' | EOF )
                            {
                            if ( state.backtracking==0 ) {
                               input.mark(); 
                            }
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:310:7: ( '\\n' | '\\r' | EOF )
                            int alt2=3;
                            switch ( input.LA(1) ) {
                            case '\n':
                                {
                                alt2=1;
                                }
                                break;
                            case '\r':
                                {
                                alt2=2;
                                }
                                break;
                            default:
                                alt2=3;}

                            switch (alt2) {
                                case 1 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:310:8: '\\n'
                                    {
                                    match('\n'); if (state.failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:310:13: '\\r'
                                    {
                                    match('\r'); if (state.failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:310:18: EOF
                                    {
                                    match(EOF); if (state.failed) return ;

                                    }
                                    break;

                            }

                            if ( state.backtracking==0 ) {

                              							// Don't consume the new line
                              							//
                              							input.rewind();
                              							
                              							// Report the error
                              							//
                              							log.error(sPos, MsgSym.MESSAGE_VISAGE_UNTERMINATED_STRING);
                              							
                              							// Always use a defined string as the value
                              							//
                              							setText(getText() +"'");
                              							
                              							processString();
                              						
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "QUOTE_LBRACE_STRING_LITERAL"
    public final void mQUOTE_LBRACE_STRING_LITERAL() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:349:2: ( '\"' | '\\'' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\'' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "QUOTE_LBRACE_STRING_LITERAL"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:361:2: ( '{' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:361:4: '{'
            {
            match('{'); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               enterBrace(0, false); 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE_QUOTE_STRING_LITERAL"
    public final void mRBRACE_QUOTE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RBRACE_QUOTE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:374:2: ({...}? => ( '}' DoubleQuoteBody ( '\"' | ( '\\n' | '\\r' | EOF ) ) ) | {...}? => ( '}' SingleQuoteBody ( '\\'' | ( '\\n' | '\\r' | EOF ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='}') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {
                int LA9_1 = input.LA(2);

                if ( (( rightBraceLikeQuote(DBL_QUOTE_CTX) )) ) {
                    alt9=1;
                }
                else if ( (( rightBraceLikeQuote(SNG_QUOTE_CTX) )) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:374:4: {...}? => ( '}' DoubleQuoteBody ( '\"' | ( '\\n' | '\\r' | EOF ) ) )
                    {
                    if ( !(( rightBraceLikeQuote(DBL_QUOTE_CTX) )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "RBRACE_QUOTE_STRING_LITERAL", " rightBraceLikeQuote(DBL_QUOTE_CTX) ");
                    }
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:376:5: ( '}' DoubleQuoteBody ( '\"' | ( '\\n' | '\\r' | EOF ) ) )
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:377:9: '}' DoubleQuoteBody ( '\"' | ( '\\n' | '\\r' | EOF ) )
                    {
                    match('}'); if (state.failed) return ;
                    mDoubleQuoteBody(); if (state.failed) return ;
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:379:8: ( '\"' | ( '\\n' | '\\r' | EOF ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\"') ) {
                        alt6=1;
                    }
                    else {
                        alt6=2;}
                    switch (alt6) {
                        case 1 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:380:9: '\"'
                            {
                            match('\"'); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:382:9: ( '\\n' | '\\r' | EOF )
                            {
                            if ( state.backtracking==0 ) {
                               input.mark(); 
                            }
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:384:8: ( '\\n' | '\\r' | EOF )
                            int alt5=3;
                            switch ( input.LA(1) ) {
                            case '\n':
                                {
                                alt5=1;
                                }
                                break;
                            case '\r':
                                {
                                alt5=2;
                                }
                                break;
                            default:
                                alt5=3;}

                            switch (alt5) {
                                case 1 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:384:9: '\\n'
                                    {
                                    match('\n'); if (state.failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:384:14: '\\r'
                                    {
                                    match('\r'); if (state.failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:384:19: EOF
                                    {
                                    match(EOF); if (state.failed) return ;

                                    }
                                    break;

                            }

                            if ( state.backtracking==0 ) {

                              								log.error(eStringStart, MsgSym.MESSAGE_VISAGE_UNTERMINATED_STRING);
                              								input.rewind();
                              								setText(getText() + "\"");
                              							
                            }

                            }
                            break;

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      		  			leaveBrace(); 
                      		         	leaveQuote(); 
                      		         	processString(); 
                      		       	
                    }

                    }
                    break;
                case 2 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:399:4: {...}? => ( '}' SingleQuoteBody ( '\\'' | ( '\\n' | '\\r' | EOF ) ) )
                    {
                    if ( !(( rightBraceLikeQuote(SNG_QUOTE_CTX) )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "RBRACE_QUOTE_STRING_LITERAL", " rightBraceLikeQuote(SNG_QUOTE_CTX) ");
                    }
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:401:5: ( '}' SingleQuoteBody ( '\\'' | ( '\\n' | '\\r' | EOF ) ) )
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:402:8: '}' SingleQuoteBody ( '\\'' | ( '\\n' | '\\r' | EOF ) )
                    {
                    match('}'); if (state.failed) return ;
                    mSingleQuoteBody(); if (state.failed) return ;
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:404:7: ( '\\'' | ( '\\n' | '\\r' | EOF ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\'') ) {
                        alt8=1;
                    }
                    else {
                        alt8=2;}
                    switch (alt8) {
                        case 1 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:405:8: '\\''
                            {
                            match('\''); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:407:8: ( '\\n' | '\\r' | EOF )
                            {
                            if ( state.backtracking==0 ) {
                               input.mark(); 
                            }
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:408:7: ( '\\n' | '\\r' | EOF )
                            int alt7=3;
                            switch ( input.LA(1) ) {
                            case '\n':
                                {
                                alt7=1;
                                }
                                break;
                            case '\r':
                                {
                                alt7=2;
                                }
                                break;
                            default:
                                alt7=3;}

                            switch (alt7) {
                                case 1 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:408:8: '\\n'
                                    {
                                    match('\n'); if (state.failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:408:13: '\\r'
                                    {
                                    match('\r'); if (state.failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:408:18: EOF
                                    {
                                    match(EOF); if (state.failed) return ;

                                    }
                                    break;

                            }

                            if ( state.backtracking==0 ) {

                              							log.error(eStringStart, MsgSym.MESSAGE_VISAGE_UNTERMINATED_STRING);
                              							input.rewind();
                              							setText(getText() + "'");
                              						
                            }

                            }
                            break;

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      		  			leaveBrace(); 
                      		         	leaveQuote(); 
                      		         	processString(); 
                      		      	
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE_QUOTE_STRING_LITERAL"

    // $ANTLR start "RBRACE_LBRACE_STRING_LITERAL"
    public final void mRBRACE_LBRACE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RBRACE_LBRACE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:433:2: ({...}? => '}' DoubleQuoteBody '{' NextIsPercent[CUR_QUOTE_CTX] | {...}? => '}' SingleQuoteBody '{' NextIsPercent[CUR_QUOTE_CTX] )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:433:4: {...}? => '}' DoubleQuoteBody '{' NextIsPercent[CUR_QUOTE_CTX]
                    {
                    if ( !(( rightBraceLikeQuote(DBL_QUOTE_CTX) )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "RBRACE_LBRACE_STRING_LITERAL", " rightBraceLikeQuote(DBL_QUOTE_CTX) ");
                    }
                    match('}'); if (state.failed) return ;
                    mDoubleQuoteBody(); if (state.failed) return ;
                    match('{'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       
                      		  			leaveBrace(); 
                      					processString(); 
                      		    	
                    }
                    mNextIsPercent(CUR_QUOTE_CTX); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:444:4: {...}? => '}' SingleQuoteBody '{' NextIsPercent[CUR_QUOTE_CTX]
                    {
                    if ( !(( rightBraceLikeQuote(SNG_QUOTE_CTX) )) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "RBRACE_LBRACE_STRING_LITERAL", " rightBraceLikeQuote(SNG_QUOTE_CTX) ");
                    }
                    match('}'); if (state.failed) return ;
                    mSingleQuoteBody(); if (state.failed) return ;
                    match('{'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       
                      				  			leaveBrace(); 
                      				       		processString(); 
                      				       	
                    }
                    mNextIsPercent(CUR_QUOTE_CTX); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE_LBRACE_STRING_LITERAL"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:464:2: ({...}? => '}' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:464:4: {...}? => '}'
            {
            if ( !(( !rightBraceLikeQuote(CUR_QUOTE_CTX) )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "RBRACE", " !rightBraceLikeQuote(CUR_QUOTE_CTX) ");
            }
            match('}'); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               leaveBrace(); 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "DoubleQuoteBody"
    public final void mDoubleQuoteBody() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:474:2: ( (~ ( '}' | '{' | '\"' | '\\\\' | '\\n' | '\\r' ) | '\\\\' . | '}' )* )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:474:5: (~ ( '}' | '{' | '\"' | '\\\\' | '\\n' | '\\r' ) | '\\\\' . | '}' )*
            {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:474:5: (~ ( '}' | '{' | '\"' | '\\\\' | '\\n' | '\\r' ) | '\\\\' . | '}' )*
            loop11:
            do {
                int alt11=4;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='z')||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }
                else if ( (LA11_0=='\\') ) {
                    alt11=2;
                }
                else if ( (LA11_0=='}') ) {
                    alt11=3;
                }


                switch (alt11) {
            	case 1 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:475:6: ~ ( '}' | '{' | '\"' | '\\\\' | '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:476:6: '\\\\' .
            	    {
            	    match('\\'); if (state.failed) return ;
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:477:6: '}'
            	    {
            	    match('}'); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      					log.error(getCharIndex()-1, MsgSym.MESSAGE_VISAGE_UNESCAPED_RBRACE);
            	      				
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DoubleQuoteBody"

    // $ANTLR start "SingleQuoteBody"
    public final void mSingleQuoteBody() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:489:2: ( (~ ( '}' | '{' | '\\'' | '\\\\' | '\\n' | '\\r' ) | '\\\\' . | '}' )* )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:489:5: (~ ( '}' | '{' | '\\'' | '\\\\' | '\\n' | '\\r' ) | '\\\\' . | '}' )*
            {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:489:5: (~ ( '}' | '{' | '\\'' | '\\\\' | '\\n' | '\\r' ) | '\\\\' . | '}' )*
            loop12:
            do {
                int alt12=4;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='z')||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }
                else if ( (LA12_0=='\\') ) {
                    alt12=2;
                }
                else if ( (LA12_0=='}') ) {
                    alt12=3;
                }


                switch (alt12) {
            	case 1 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:490:6: ~ ( '}' | '{' | '\\'' | '\\\\' | '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:491:6: '\\\\' .
            	    {
            	    match('\\'); if (state.failed) return ;
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:492:6: '}'
            	    {
            	    match('}'); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      					log.error(getCharIndex()-1, MsgSym.MESSAGE_VISAGE_UNESCAPED_RBRACE);
            	      				
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "SingleQuoteBody"

    // $ANTLR start "NextIsPercent"
    public final void mNextIsPercent(int quoteContext) throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:507:2: ( ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )* '%' )=> | )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (synpred1_v4Lexer()) ) {
                alt13=1;
            }
            else if ( (true) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:507:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )* '%' )=>
                    {
                    if ( state.backtracking==0 ) {
                       enterBrace(quoteContext, true); 
                    }

                    }
                    break;
                case 2 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:511:5: 
                    {
                    if ( state.backtracking==0 ) {
                       enterBrace(quoteContext, false); 
                    }

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NextIsPercent"

    // $ANTLR start "FORMAT_STRING_LITERAL"
    public final void mFORMAT_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = FORMAT_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:521:2: ({...}? => '%' (~ ' ' )* )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:521:5: {...}? => '%' (~ ' ' )*
            {
            if ( !(( percentIsFormat() )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "FORMAT_STRING_LITERAL", " percentIsFormat() ");
            }
            match('%'); if (state.failed) return ;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:523:8: (~ ' ' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\u001F')||(LA14_0>='!' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:523:9: ~ ' '
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
              					processFormatString();
              	 				resetPercentIsFormat(); 
              	 			
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORMAT_STRING_LITERAL"

    // $ANTLR start "TRANSLATION_KEY"
    public final void mTRANSLATION_KEY() throws RecognitionException {
        try {
            int _type = TRANSLATION_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:536:2: ( '##' ( '[' TranslationKeyBody ']' )? )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:536:4: '##' ( '[' TranslationKeyBody ']' )?
            {
            match("##"); if (state.failed) return ;

            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:537:6: ( '[' TranslationKeyBody ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='[') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:538:10: '[' TranslationKeyBody ']'
                    {
                    match('['); if (state.failed) return ;
                    mTranslationKeyBody(); if (state.failed) return ;
                    match(']'); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      	processTranslationKey(); 
                      
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRANSLATION_KEY"

    // $ANTLR start "TranslationKeyBody"
    public final void mTranslationKeyBody() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:550:2: ( (~ ( '[' | ']' | '\\\\' ) | '\\\\' . )+ )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:550:4: (~ ( '[' | ']' | '\\\\' ) | '\\\\' . )+
            {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:550:4: (~ ( '[' | ']' | '\\\\' ) | '\\\\' . )+
            int cnt16=0;
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='Z')||(LA16_0>='^' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }
                else if ( (LA16_0=='\\') ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:550:5: ~ ( '[' | ']' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:550:25: '\\\\' .
            	    {
            	    match('\\'); if (state.failed) return ;
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "TranslationKeyBody"

    // $ANTLR start "TIME_LITERAL"
    public final void mTIME_LITERAL() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:568:25: ()
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:568:28: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "TIME_LITERAL"

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:576:27: ()
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:576:29: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "OCTAL_LITERAL"
    public final void mOCTAL_LITERAL() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:581:26: ()
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:581:29: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_LITERAL"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:589:24: ()
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:589:26: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "FLOATING_POINT_LITERAL"
    public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
        try {
            int _type = FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            	// Indicates out of range digit
            	//
            	boolean rangeError = false;
            	
            	// First character of rule
            	//
            	int		sPos = getCharIndex();
            	
            	// Is this going to be a negative numeric?
            	//
            	boolean negative = input.LT(-1) == '-';
            	

            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:621:5: ( '0' ( ( 'x' | 'X' ) ( ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )+ ({...}? => '.' ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )* | ) | ) | ( '0' .. '7' | '8' .. '9' )+ ({...}? => '.' ( Digits )? | ) | ( 'm' ( 's' )? | 's' | 'h' ) | {...}? => '.' ( Digits ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | ) | ) | ( '1' .. '9' ) ( Digits )? ({...}? => ( ( '.' (~ ( 'a' .. 'd' | 'f' .. 'z' | 'A' .. 'D' | 'F' .. 'Z' ) ) )=> '.' ( Digits )? ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | ) | ( ( 'm' ( 's' )? | 's' | 'h' ) | Exponent | ) ) | '.' ( Digits ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | '.' | ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt48=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt48=2;
                }
                break;
            case '.':
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:627:6: '0' ( ( 'x' | 'X' ) ( ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )+ ({...}? => '.' ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )* | ) | ) | ( '0' .. '7' | '8' .. '9' )+ ({...}? => '.' ( Digits )? | ) | ( 'm' ( 's' )? | 's' | 'h' ) | {...}? => '.' ( Digits ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | ) | )
                    {
                    match('0'); if (state.failed) return ;
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:628:7: ( ( 'x' | 'X' ) ( ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )+ ({...}? => '.' ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )* | ) | ) | ( '0' .. '7' | '8' .. '9' )+ ({...}? => '.' ( Digits )? | ) | ( 'm' ( 's' )? | 's' | 'h' ) | {...}? => '.' ( Digits ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | ) | )
                    int alt31=5;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='X'||LA31_0=='x') ) {
                        alt31=1;
                    }
                    else if ( ((LA31_0>='0' && LA31_0<='9')) ) {
                        alt31=2;
                    }
                    else if ( (LA31_0=='h'||LA31_0=='m'||LA31_0=='s') ) {
                        alt31=3;
                    }
                    else if ( (LA31_0=='.') && (( input.LA(2) != '.'))) {
                        alt31=4;
                    }
                    else {
                        alt31=5;}
                    switch (alt31) {
                        case 1 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:629:10: ( 'x' | 'X' ) ( ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )+ ({...}? => '.' ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )* | ) | )
                            {
                            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                                input.consume();
                            state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( state.backtracking==0 ) {

                                  			  	// Always set the type, so the parser is not confused
                                  			  	//
                                  			  	_type = HEX_LITERAL;
                                  			  
                            }
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:636:10: ( ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )+ ({...}? => '.' ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )* | ) | )
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||(LA20_0>='a' && LA20_0<='z')) ) {
                                alt20=1;
                            }
                            else {
                                alt20=2;}
                            switch (alt20) {
                                case 1 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:639:13: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )+ ({...}? => '.' ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )* | )
                                    {
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:639:13: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )+
                                    int cnt17=0;
                                    loop17:
                                    do {
                                        int alt17=3;
                                        int LA17_0 = input.LA(1);

                                        if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='F')||(LA17_0>='a' && LA17_0<='f')) ) {
                                            alt17=1;
                                        }
                                        else if ( ((LA17_0>='G' && LA17_0<='Z')||(LA17_0>='g' && LA17_0<='z')) ) {
                                            alt17=2;
                                        }


                                        switch (alt17) {
                                    	case 1 :
                                    	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:640:16: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                                    	    {
                                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                                    	        input.consume();
                                    	    state.failed=false;
                                    	    }
                                    	    else {
                                    	        if (state.backtracking>0) {state.failed=true; return ;}
                                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                                    	        recover(mse);
                                    	        throw mse;}


                                    	    }
                                    	    break;
                                    	case 2 :
                                    	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:641:16: ( 'g' .. 'z' | 'G' .. 'Z' )
                                    	    {
                                    	    if ( (input.LA(1)>='G' && input.LA(1)<='Z')||(input.LA(1)>='g' && input.LA(1)<='z') ) {
                                    	        input.consume();
                                    	    state.failed=false;
                                    	    }
                                    	    else {
                                    	        if (state.backtracking>0) {state.failed=true; return ;}
                                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                                    	        recover(mse);
                                    	        throw mse;}

                                    	    if ( state.backtracking==0 ) {

                                    	          			  	  			rangeError = true;	// Signal at least one bad digit
                                    	          			  	  		
                                    	    }

                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt17 >= 1 ) break loop17;
                                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                                EarlyExitException eee =
                                                    new EarlyExitException(17, input);
                                                throw eee;
                                        }
                                        cnt17++;
                                    } while (true);

                                    if ( state.backtracking==0 ) {

                                          			  	  		setText(getText().substring(2, getText().length()));
                                          			  	  		if	(rangeError)
                                          			  	  		{
                                          			  	  			// Error - malformed hex constant
                                          			  	  			//
                                          			  	  			log.error(sPos, MsgSym.MESSAGE_VISAGE_HEX_MALFORMED);
                                          			  	  			setText("0");
                                          			  	  		}
                                          			  	  		else
                                          			  	  		{
                                          			  	  			if (! checkIntLiteralRange(getText(), getCharIndex(), 16, negative))
                                          			  	  			{
                                          			  	  				setText("0");
                                          			  	  			}
                                      							}
                                          			  	  
                                    }
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:666:13: ({...}? => '.' ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )* | )
                                    int alt19=2;
                                    int LA19_0 = input.LA(1);

                                    if ( (LA19_0=='.') && (( input.LA(2) != '.'))) {
                                        alt19=1;
                                    }
                                    else {
                                        alt19=2;}
                                    switch (alt19) {
                                        case 1 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:670:16: {...}? => '.' ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )*
                                            {
                                            if ( !(( input.LA(2) != '.')) ) {
                                                if (state.backtracking>0) {state.failed=true; return ;}
                                                throw new FailedPredicateException(input, "FLOATING_POINT_LITERAL", " input.LA(2) != '.'");
                                            }
                                            if ( state.backtracking==0 ) {
                                               sPos = getCharIndex(); 
                                            }
                                            match('.'); if (state.failed) return ;
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:674:21: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | ( 'g' .. 'z' | 'G' .. 'Z' ) )*
                                            loop18:
                                            do {
                                                int alt18=2;
                                                int LA18_0 = input.LA(1);

                                                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||(LA18_0>='a' && LA18_0<='z')) ) {
                                                    alt18=1;
                                                }


                                                switch (alt18) {
                                            	case 1 :
                                            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:
                                            	    {
                                            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                                            	        input.consume();
                                            	    state.failed=false;
                                            	    }
                                            	    else {
                                            	        if (state.backtracking>0) {state.failed=true; return ;}
                                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                                            	        recover(mse);
                                            	        throw mse;}


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop18;
                                                }
                                            } while (true);

                                            if ( state.backtracking==0 ) {
                                               
                                                  			  	  					// Error - malformed hex constant
                                                  			  	  					//
                                                  			  	  					log.error(sPos, MsgSym.MESSAGE_VISAGE_HEX_FLOAT);
                                                  			  	  					setText("0");
                                                  			  	  				
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:688:13: 
                                            {
                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:692:12: 
                                    {
                                    if ( state.backtracking==0 ) {

                                          			  			log.error(getCharIndex()-1, MsgSym.MESSAGE_VISAGE_HEX_MISSING);
                                          			  			setText("0");
                                          			  		
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:705:9: ( '0' .. '7' | '8' .. '9' )+ ({...}? => '.' ( Digits )? | )
                            {
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:705:9: ( '0' .. '7' | '8' .. '9' )+
                            int cnt21=0;
                            loop21:
                            do {
                                int alt21=3;
                                int LA21_0 = input.LA(1);

                                if ( ((LA21_0>='0' && LA21_0<='7')) ) {
                                    alt21=1;
                                }
                                else if ( ((LA21_0>='8' && LA21_0<='9')) ) {
                                    alt21=2;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:706:12: '0' .. '7'
                            	    {
                            	    matchRange('0','7'); if (state.failed) return ;

                            	    }
                            	    break;
                            	case 2 :
                            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:708:12: '8' .. '9'
                            	    {
                            	    matchRange('8','9'); if (state.failed) return ;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          							rangeError = true; // Signal that at least one digit was wrong
                            	          						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt21 >= 1 ) break loop21;
                            	    if (state.backtracking>0) {state.failed=true; return ;}
                                        EarlyExitException eee =
                                            new EarlyExitException(21, input);
                                        throw eee;
                                }
                                cnt21++;
                            } while (true);

                            if ( state.backtracking==0 ) {

                                  					// Always set the type to octal, so the parser does not see
                                  					// a lexing error, even though the compiler knows there is an
                                  					// error.
                                  					//
                                  					_type = OCTAL_LITERAL;
                                  					
                                  					if	(rangeError)
                                  					{
                                  						log.error(sPos, MsgSym.MESSAGE_VISAGE_OCTAL_MALFORMED);
                                  						setText("0");
                                  					}
                                  					else
                                  					{
                                  						if	(! checkIntLiteralRange(getText(), getCharIndex(), 8, negative))
                                  						{
                                  							setText("0");
                                  						}
                                  					}
                                  				
                            }
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:735:10: ({...}? => '.' ( Digits )? | )
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0=='.') && (( input.LA(2) != '.'))) {
                                alt23=1;
                            }
                            else {
                                alt23=2;}
                            switch (alt23) {
                                case 1 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:739:15: {...}? => '.' ( Digits )?
                                    {
                                    if ( !(( input.LA(2) != '.')) ) {
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        throw new FailedPredicateException(input, "FLOATING_POINT_LITERAL", " input.LA(2) != '.'");
                                    }
                                    if ( state.backtracking==0 ) {
                                       sPos = getCharIndex(); 
                                    }
                                    match('.'); if (state.failed) return ;
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:743:19: ( Digits )?
                                    int alt22=2;
                                    int LA22_0 = input.LA(1);

                                    if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                                        alt22=1;
                                    }
                                    switch (alt22) {
                                        case 1 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:743:19: Digits
                                            {
                                            mDigits(); if (state.failed) return ;

                                            }
                                            break;

                                    }

                                    if ( state.backtracking==0 ) {
                                       
                                          			  	  				log.error(sPos, MsgSym.MESSAGE_VISAGE_OCTAL_FLOAT);
                                          			  	  				setText("0");
                                          			  	  			
                                    }

                                    }
                                    break;
                                case 2 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:750:13: 
                                    {
                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:755:9: ( 'm' ( 's' )? | 's' | 'h' )
                            {
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:755:9: ( 'm' ( 's' )? | 's' | 'h' )
                            int alt25=3;
                            switch ( input.LA(1) ) {
                            case 'm':
                                {
                                alt25=1;
                                }
                                break;
                            case 's':
                                {
                                alt25=2;
                                }
                                break;
                            case 'h':
                                {
                                alt25=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 0, input);

                                throw nvae;
                            }

                            switch (alt25) {
                                case 1 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:755:10: 'm' ( 's' )?
                                    {
                                    match('m'); if (state.failed) return ;
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:755:14: ( 's' )?
                                    int alt24=2;
                                    int LA24_0 = input.LA(1);

                                    if ( (LA24_0=='s') ) {
                                        alt24=1;
                                    }
                                    switch (alt24) {
                                        case 1 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:755:14: 's'
                                            {
                                            match('s'); if (state.failed) return ;

                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:755:21: 's'
                                    {
                                    match('s'); if (state.failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:755:27: 'h'
                                    {
                                    match('h'); if (state.failed) return ;

                                    }
                                    break;

                            }

                            if ( state.backtracking==0 ) {
                               _type = TIME_LITERAL; 
                            }

                            }
                            break;
                        case 4 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:762:9: {...}? => '.' ( Digits ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | )
                            {
                            if ( !(( input.LA(2) != '.')) ) {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                throw new FailedPredicateException(input, "FLOATING_POINT_LITERAL", " input.LA(2) != '.'");
                            }
                            match('.'); if (state.failed) return ;
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:763:10: ( Digits ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | )
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( ((LA30_0>='0' && LA30_0<='9')) ) {
                                alt30=1;
                            }
                            else {
                                alt30=2;}
                            switch (alt30) {
                                case 1 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:766:13: Digits ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | )
                                    {
                                    mDigits(); if (state.failed) return ;
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:766:20: ( Exponent )?
                                    int alt26=2;
                                    int LA26_0 = input.LA(1);

                                    if ( (LA26_0=='E'||LA26_0=='e') ) {
                                        alt26=1;
                                    }
                                    switch (alt26) {
                                        case 1 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:766:20: Exponent
                                            {
                                            mExponent(); if (state.failed) return ;

                                            }
                                            break;

                                    }

                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:768:14: ( ( 'm' ( 's' )? | 's' | 'h' ) | )
                                    int alt29=2;
                                    int LA29_0 = input.LA(1);

                                    if ( (LA29_0=='h'||LA29_0=='m'||LA29_0=='s') ) {
                                        alt29=1;
                                    }
                                    else {
                                        alt29=2;}
                                    switch (alt29) {
                                        case 1 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:769:18: ( 'm' ( 's' )? | 's' | 'h' )
                                            {
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:769:18: ( 'm' ( 's' )? | 's' | 'h' )
                                            int alt28=3;
                                            switch ( input.LA(1) ) {
                                            case 'm':
                                                {
                                                alt28=1;
                                                }
                                                break;
                                            case 's':
                                                {
                                                alt28=2;
                                                }
                                                break;
                                            case 'h':
                                                {
                                                alt28=3;
                                                }
                                                break;
                                            default:
                                                if (state.backtracking>0) {state.failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 28, 0, input);

                                                throw nvae;
                                            }

                                            switch (alt28) {
                                                case 1 :
                                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:769:19: 'm' ( 's' )?
                                                    {
                                                    match('m'); if (state.failed) return ;
                                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:769:23: ( 's' )?
                                                    int alt27=2;
                                                    int LA27_0 = input.LA(1);

                                                    if ( (LA27_0=='s') ) {
                                                        alt27=1;
                                                    }
                                                    switch (alt27) {
                                                        case 1 :
                                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:769:23: 's'
                                                            {
                                                            match('s'); if (state.failed) return ;

                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;
                                                case 2 :
                                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:769:30: 's'
                                                    {
                                                    match('s'); if (state.failed) return ;

                                                    }
                                                    break;
                                                case 3 :
                                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:769:36: 'h'
                                                    {
                                                    match('h'); if (state.failed) return ;

                                                    }
                                                    break;

                                            }

                                            if ( state.backtracking==0 ) {
                                               _type = TIME_LITERAL; 
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:775:14: 
                                            {
                                            if ( state.backtracking==0 ) {
                                               _type = FLOATING_POINT_LITERAL; 
                                            }

                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:780:12: 
                                    {
                                    if ( state.backtracking==0 ) {
                                       _type = FLOATING_POINT_LITERAL; 
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 5 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:786:9: 
                            {
                            if ( state.backtracking==0 ) {
                               
                                  					_type = DECIMAL_LITERAL;
                                  					if	(! checkIntLiteralRange(getText(), getCharIndex(), 10, negative))
                                  					{
                                  						setText("0");
                                  					}
                                  				
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:798:6: ( '1' .. '9' ) ( Digits )? ({...}? => ( ( '.' (~ ( 'a' .. 'd' | 'f' .. 'z' | 'A' .. 'D' | 'F' .. 'Z' ) ) )=> '.' ( Digits )? ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | ) | ( ( 'm' ( 's' )? | 's' | 'h' ) | Exponent | ) )
                    {
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:798:6: ( '1' .. '9' )
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:798:7: '1' .. '9'
                    {
                    matchRange('1','9'); if (state.failed) return ;

                    }

                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:798:17: ( Digits )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>='0' && LA32_0<='9')) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:798:17: Digits
                            {
                            mDigits(); if (state.failed) return ;

                            }
                            break;

                    }

                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:802:7: ({...}? => ( ( '.' (~ ( 'a' .. 'd' | 'f' .. 'z' | 'A' .. 'D' | 'F' .. 'Z' ) ) )=> '.' ( Digits )? ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | ) | ( ( 'm' ( 's' )? | 's' | 'h' ) | Exponent | ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0=='.') && (( input.LA(2) != '.'))) {
                        alt42=1;
                    }
                    else if ( (LA42_0=='E'||LA42_0=='e'||LA42_0=='h'||LA42_0=='m'||LA42_0=='s') ) {
                        alt42=2;
                    }
                    else if ( (( input.LA(2) != '.')) ) {
                        alt42=1;
                    }
                    else if ( (true) ) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:804:8: {...}? => ( ( '.' (~ ( 'a' .. 'd' | 'f' .. 'z' | 'A' .. 'D' | 'F' .. 'Z' ) ) )=> '.' ( Digits )? ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | )
                            {
                            if ( !(( input.LA(2) != '.')) ) {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                throw new FailedPredicateException(input, "FLOATING_POINT_LITERAL", " input.LA(2) != '.'");
                            }
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:806:9: ( ( '.' (~ ( 'a' .. 'd' | 'f' .. 'z' | 'A' .. 'D' | 'F' .. 'Z' ) ) )=> '.' ( Digits )? ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | )
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0=='.') && (synpred2_v4Lexer())) {
                                alt38=1;
                            }
                            else {
                                alt38=2;}
                            switch (alt38) {
                                case 1 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:815:11: ( '.' (~ ( 'a' .. 'd' | 'f' .. 'z' | 'A' .. 'D' | 'F' .. 'Z' ) ) )=> '.' ( Digits )? ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | )
                                    {
                                    match('.'); if (state.failed) return ;
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:816:16: ( Digits )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( ((LA33_0>='0' && LA33_0<='9')) ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:816:16: Digits
                                            {
                                            mDigits(); if (state.failed) return ;

                                            }
                                            break;

                                    }

                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:816:24: ( Exponent )?
                                    int alt34=2;
                                    int LA34_0 = input.LA(1);

                                    if ( (LA34_0=='E'||LA34_0=='e') ) {
                                        alt34=1;
                                    }
                                    switch (alt34) {
                                        case 1 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:816:24: Exponent
                                            {
                                            mExponent(); if (state.failed) return ;

                                            }
                                            break;

                                    }

                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:818:9: ( ( 'm' ( 's' )? | 's' | 'h' ) | )
                                    int alt37=2;
                                    int LA37_0 = input.LA(1);

                                    if ( (LA37_0=='h'||LA37_0=='m'||LA37_0=='s') ) {
                                        alt37=1;
                                    }
                                    else {
                                        alt37=2;}
                                    switch (alt37) {
                                        case 1 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:819:12: ( 'm' ( 's' )? | 's' | 'h' )
                                            {
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:819:12: ( 'm' ( 's' )? | 's' | 'h' )
                                            int alt36=3;
                                            switch ( input.LA(1) ) {
                                            case 'm':
                                                {
                                                alt36=1;
                                                }
                                                break;
                                            case 's':
                                                {
                                                alt36=2;
                                                }
                                                break;
                                            case 'h':
                                                {
                                                alt36=3;
                                                }
                                                break;
                                            default:
                                                if (state.backtracking>0) {state.failed=true; return ;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 36, 0, input);

                                                throw nvae;
                                            }

                                            switch (alt36) {
                                                case 1 :
                                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:819:13: 'm' ( 's' )?
                                                    {
                                                    match('m'); if (state.failed) return ;
                                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:819:17: ( 's' )?
                                                    int alt35=2;
                                                    int LA35_0 = input.LA(1);

                                                    if ( (LA35_0=='s') ) {
                                                        alt35=1;
                                                    }
                                                    switch (alt35) {
                                                        case 1 :
                                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:819:17: 's'
                                                            {
                                                            match('s'); if (state.failed) return ;

                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;
                                                case 2 :
                                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:819:24: 's'
                                                    {
                                                    match('s'); if (state.failed) return ;

                                                    }
                                                    break;
                                                case 3 :
                                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:819:30: 'h'
                                                    {
                                                    match('h'); if (state.failed) return ;

                                                    }
                                                    break;

                                            }

                                            if ( state.backtracking==0 ) {
                                               _type = TIME_LITERAL; 
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:825:11: 
                                            {
                                            if ( state.backtracking==0 ) {
                                               _type = FLOATING_POINT_LITERAL; 
                                            }

                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:829:11: 
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      				    			_type = DECIMAL_LITERAL; 
                                      				    			if (! checkIntLiteralRange(getText(), getCharIndex(), 10, negative))
                                      				    			{
                                      				    				setText("0");
                                      				    			}
                                      				    		
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:840:9: ( ( 'm' ( 's' )? | 's' | 'h' ) | Exponent | )
                            {
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:840:9: ( ( 'm' ( 's' )? | 's' | 'h' ) | Exponent | )
                            int alt41=3;
                            switch ( input.LA(1) ) {
                            case 'h':
                            case 'm':
                            case 's':
                                {
                                alt41=1;
                                }
                                break;
                            case 'E':
                            case 'e':
                                {
                                alt41=2;
                                }
                                break;
                            default:
                                alt41=3;}

                            switch (alt41) {
                                case 1 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:841:12: ( 'm' ( 's' )? | 's' | 'h' )
                                    {
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:841:12: ( 'm' ( 's' )? | 's' | 'h' )
                                    int alt40=3;
                                    switch ( input.LA(1) ) {
                                    case 'm':
                                        {
                                        alt40=1;
                                        }
                                        break;
                                    case 's':
                                        {
                                        alt40=2;
                                        }
                                        break;
                                    case 'h':
                                        {
                                        alt40=3;
                                        }
                                        break;
                                    default:
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 40, 0, input);

                                        throw nvae;
                                    }

                                    switch (alt40) {
                                        case 1 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:841:13: 'm' ( 's' )?
                                            {
                                            match('m'); if (state.failed) return ;
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:841:17: ( 's' )?
                                            int alt39=2;
                                            int LA39_0 = input.LA(1);

                                            if ( (LA39_0=='s') ) {
                                                alt39=1;
                                            }
                                            switch (alt39) {
                                                case 1 :
                                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:841:17: 's'
                                                    {
                                                    match('s'); if (state.failed) return ;

                                                    }
                                                    break;

                                            }


                                            }
                                            break;
                                        case 2 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:841:24: 's'
                                            {
                                            match('s'); if (state.failed) return ;

                                            }
                                            break;
                                        case 3 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:841:30: 'h'
                                            {
                                            match('h'); if (state.failed) return ;

                                            }
                                            break;

                                    }

                                    if ( state.backtracking==0 ) {
                                       _type = TIME_LITERAL; 
                                    }

                                    }
                                    break;
                                case 2 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:845:12: Exponent
                                    {
                                    mExponent(); if (state.failed) return ;
                                    if ( state.backtracking==0 ) {

                                      				    			_type = FLOATING_POINT_LITERAL;
                                      				    		
                                    }

                                    }
                                    break;
                                case 3 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:853:11: 
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      				    			_type = DECIMAL_LITERAL; 
                                      				    			if (! checkIntLiteralRange(getText(), getCharIndex(), 10, negative))
                                      				    			{
                                      				    				setText("0");
                                      				    			}
                                      				    		
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:864:6: '.' ( Digits ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | '.' | )
                    {
                    match('.'); if (state.failed) return ;
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:866:7: ( Digits ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | ) | '.' | )
                    int alt47=3;
                    switch ( input.LA(1) ) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        {
                        alt47=1;
                        }
                        break;
                    case '.':
                        {
                        alt47=2;
                        }
                        break;
                    default:
                        alt47=3;}

                    switch (alt47) {
                        case 1 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:868:10: Digits ( Exponent )? ( ( 'm' ( 's' )? | 's' | 'h' ) | )
                            {
                            mDigits(); if (state.failed) return ;
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:868:17: ( Exponent )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0=='E'||LA43_0=='e') ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:868:17: Exponent
                                    {
                                    mExponent(); if (state.failed) return ;

                                    }
                                    break;

                            }

                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:870:11: ( ( 'm' ( 's' )? | 's' | 'h' ) | )
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0=='h'||LA46_0=='m'||LA46_0=='s') ) {
                                alt46=1;
                            }
                            else {
                                alt46=2;}
                            switch (alt46) {
                                case 1 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:871:13: ( 'm' ( 's' )? | 's' | 'h' )
                                    {
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:871:13: ( 'm' ( 's' )? | 's' | 'h' )
                                    int alt45=3;
                                    switch ( input.LA(1) ) {
                                    case 'm':
                                        {
                                        alt45=1;
                                        }
                                        break;
                                    case 's':
                                        {
                                        alt45=2;
                                        }
                                        break;
                                    case 'h':
                                        {
                                        alt45=3;
                                        }
                                        break;
                                    default:
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 45, 0, input);

                                        throw nvae;
                                    }

                                    switch (alt45) {
                                        case 1 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:871:14: 'm' ( 's' )?
                                            {
                                            match('m'); if (state.failed) return ;
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:871:18: ( 's' )?
                                            int alt44=2;
                                            int LA44_0 = input.LA(1);

                                            if ( (LA44_0=='s') ) {
                                                alt44=1;
                                            }
                                            switch (alt44) {
                                                case 1 :
                                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:871:18: 's'
                                                    {
                                                    match('s'); if (state.failed) return ;

                                                    }
                                                    break;

                                            }


                                            }
                                            break;
                                        case 2 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:871:25: 's'
                                            {
                                            match('s'); if (state.failed) return ;

                                            }
                                            break;
                                        case 3 :
                                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:871:31: 'h'
                                            {
                                            match('h'); if (state.failed) return ;

                                            }
                                            break;

                                    }

                                    if ( state.backtracking==0 ) {
                                       _type = TIME_LITERAL; 
                                    }

                                    }
                                    break;
                                case 2 :
                                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:877:12: 
                                    {
                                    if ( state.backtracking==0 ) {
                                       _type = FLOATING_POINT_LITERAL; 
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:883:9: '.'
                            {
                            match('.'); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                                  					_type = DOTDOT;	// Yes, it was ..
                                  				
                            }

                            }
                            break;
                        case 3 :
                            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:891:9: 
                            {
                            if ( state.backtracking==0 ) {
                               _type = DOT; 
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOATING_POINT_LITERAL"

    // $ANTLR start "Digits"
    public final void mDigits() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:898:2: ( ( '0' .. '9' )+ )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:898:4: ( '0' .. '9' )+
            {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:898:4: ( '0' .. '9' )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>='0' && LA49_0<='9')) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:898:5: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Digits"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:903:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( Digits | ) )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:903:5: ( 'e' | 'E' ) ( '+' | '-' )? ( Digits | )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:903:15: ( '+' | '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0=='+'||LA50_0=='-') ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:905:4: ( Digits | )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>='0' && LA51_0<='9')) ) {
                alt51=1;
            }
            else {
                alt51=2;}
            switch (alt51) {
                case 1 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:906:7: Digits
                    {
                    mDigits(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:907:8: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      						log.error(getCharIndex()-1, MsgSym.MESSAGE_VISAGE_EXPONENT_MALFORMED); 
                      						setText("0.0");
                      					
                    }

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:923:2: ( Letter ( Letter | JavaIDDigit )* | '<<' (~ '>' | '>' ~ '>' )* ( '>' )* '>>' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0=='$'||(LA55_0>='A' && LA55_0<='Z')||LA55_0=='_'||(LA55_0>='a' && LA55_0<='z')||(LA55_0>='\u00C0' && LA55_0<='\u00D6')||(LA55_0>='\u00D8' && LA55_0<='\u00F6')||(LA55_0>='\u00F8' && LA55_0<='\u1FFF')||(LA55_0>='\u3040' && LA55_0<='\u318F')||(LA55_0>='\u3300' && LA55_0<='\u337F')||(LA55_0>='\u3400' && LA55_0<='\u3D2D')||(LA55_0>='\u4E00' && LA55_0<='\u9FFF')||(LA55_0>='\uF900' && LA55_0<='\uFAFF')) ) {
                alt55=1;
            }
            else if ( (LA55_0=='<') ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:923:4: Letter ( Letter | JavaIDDigit )*
                    {
                    mLetter(); if (state.failed) return ;
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:923:11: ( Letter | JavaIDDigit )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0=='$'||(LA52_0>='0' && LA52_0<='9')||(LA52_0>='A' && LA52_0<='Z')||LA52_0=='_'||(LA52_0>='a' && LA52_0<='z')||(LA52_0>='\u00C0' && LA52_0<='\u00D6')||(LA52_0>='\u00D8' && LA52_0<='\u00F6')||(LA52_0>='\u00F8' && LA52_0<='\u1FFF')||(LA52_0>='\u3040' && LA52_0<='\u318F')||(LA52_0>='\u3300' && LA52_0<='\u337F')||(LA52_0>='\u3400' && LA52_0<='\u3D2D')||(LA52_0>='\u4E00' && LA52_0<='\u9FFF')||(LA52_0>='\uF900' && LA52_0<='\uFAFF')) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:
                    	    {
                    	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:924:4: '<<' (~ '>' | '>' ~ '>' )* ( '>' )* '>>'
                    {
                    match("<<"); if (state.failed) return ;

                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:924:9: (~ '>' | '>' ~ '>' )*
                    loop53:
                    do {
                        int alt53=3;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0=='>') ) {
                            int LA53_1 = input.LA(2);

                            if ( ((LA53_1>='\u0000' && LA53_1<='=')||(LA53_1>='?' && LA53_1<='\uFFFF')) ) {
                                alt53=2;
                            }


                        }
                        else if ( ((LA53_0>='\u0000' && LA53_0<='=')||(LA53_0>='?' && LA53_0<='\uFFFF')) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:924:10: ~ '>'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:924:16: '>' ~ '>'
                    	    {
                    	    match('>'); if (state.failed) return ;
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:924:27: ( '>' )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0=='>') ) {
                            int LA54_1 = input.LA(2);

                            if ( (LA54_1=='>') ) {
                                int LA54_2 = input.LA(3);

                                if ( (LA54_2=='>') ) {
                                    alt54=1;
                                }


                            }


                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:924:27: '>'
                    	    {
                    	    match('>'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    match(">>"); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                       
                      				setText(getText().substring(2, getText().length()-2)); 
                      			
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:935:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "JavaIDDigit"
    public final void mJavaIDDigit() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:954:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||(input.LA(1)>='\u06F0' && input.LA(1)<='\u06F9')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09EF')||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A6F')||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||(input.LA(1)>='\u0BE7' && input.LA(1)<='\u0BEF')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u1040' && input.LA(1)<='\u1049') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "JavaIDDigit"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:979:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:979:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:979:14: ( options {greedy=false; } : . )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0=='*') ) {
                    int LA56_1 = input.LA(2);

                    if ( (LA56_1=='/') ) {
                        alt56=2;
                    }
                    else if ( ((LA56_1>='\u0000' && LA56_1<='.')||(LA56_1>='0' && LA56_1<='\uFFFF')) ) {
                        alt56=1;
                    }


                }
                else if ( ((LA56_0>='\u0000' && LA56_0<=')')||(LA56_0>='+' && LA56_0<='\uFFFF')) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:979:42: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            match("*/"); if (state.failed) return ;

            if ( state.backtracking==0 ) {

                              if (getText().startsWith("/**")) {
                                  _type = DOC_COMMENT;
                              }
                  		_channel=HIDDEN;
                  	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "DOC_COMMENT"
    public final void mDOC_COMMENT() throws RecognitionException {
        try {
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:991:2: ( '/**' )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:991:4: '/**'
            {
            match("/**"); if (state.failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end "DOC_COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:995:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? ( '\\n' | EOF ) )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:995:8: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? ( '\\n' | EOF )
            {
            match("//"); if (state.failed) return ;

            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:995:13: (~ ( '\\n' | '\\r' ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>='\u0000' && LA57_0<='\t')||(LA57_0>='\u000B' && LA57_0<='\f')||(LA57_0>='\u000E' && LA57_0<='\uFFFF')) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:995:13: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:995:27: ( '\\r' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0=='\r') ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:995:27: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;

            }

            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:995:33: ( '\\n' | EOF )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0=='\n') ) {
                alt59=1;
            }
            else {
                alt59=2;}
            switch (alt59) {
                case 1 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:995:34: '\\n'
                    {
                    match('\n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:995:39: EOF
                    {
                    match(EOF); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  		_channel=HIDDEN;
                  	
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "INVALIDC"
    public final void mINVALIDC() throws RecognitionException {
        try {
            int _type = INVALIDC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1010:2: ( . )
            // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1010:4: .
            {
            matchAny(); if (state.failed) return ;
            if ( state.backtracking==0 ) {

              			// We assume it isn't safe to print as otherwise we would have matched it
              			//	
              			String disp = getText();
              			
              			if	(disp == null) {
              			
              				// Something very strange happened
              				//
              				log.error(getCharIndex()-1, MsgSym.MESSAGE_VISAGE_BAD_CHARACTER, "<unknown>");
              				
              			} else {
              			
              				log.error(getCharIndex()-1, MsgSym.MESSAGE_VISAGE_BAD_CHARACTER, getCharErrorDisplay( disp.charAt(0) ) );
              			}
              		
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INVALIDC"

    public void mTokens() throws RecognitionException {
        // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:8: ( ABSTRACT | AFTER | AND | AS | ASSERT | AT | ATTRIBUTE | BEFORE | BIND | BOUND | BREAK | CATCH | CLASS | CONTINUE | DEF | DELETE | ELSE | EXCLUSIVE | EXTENDS | FALSE | FINALLY | FIRST | FOR | FROM | FUNCTION | IF | IMPORT | INDEXOF | IN | INIT | INSERT | INSTANCEOF | INTO | INVERSE | LAST | LAZY | MIXIN | MOD | NATIVEARRAY | NEW | NOT | NULL | ON | OR | OVERRIDE | PACKAGE | POSTINIT | PRIVATE | PROTECTED | PUBLIC_INIT | PUBLIC | PUBLIC_READ | REPLACE | RETURN | REVERSE | SIZEOF | STATIC | STEP | SUPER | THEN | THIS | THROW | TRIGGER | TRUE | TRY | TWEEN | TYPEOF | VAR | WHERE | WHILE | WITH | LBRACKET | LPAREN | POUND | PIPE | PLUSPLUS | DOTDOT | RPAREN | RBRACKET | SEMI | COMMA | DOT | EQEQ | EQ | GT | LT | LTGT | LTEQ | GTEQ | PLUS | SUB | STAR | SLASH | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | PERCENTEQ | NOTEQ | COLON | QUES | SUCHTHAT | SUBSUB | WS | STRING_LITERAL | LBRACE | RBRACE_QUOTE_STRING_LITERAL | RBRACE_LBRACE_STRING_LITERAL | RBRACE | FORMAT_STRING_LITERAL | TRANSLATION_KEY | FLOATING_POINT_LITERAL | IDENTIFIER | COMMENT | LINE_COMMENT | INVALIDC )
        int alt60=117;
        alt60 = dfa60.predict(input);
        switch (alt60) {
            case 1 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:10: ABSTRACT
                {
                mABSTRACT(); if (state.failed) return ;

                }
                break;
            case 2 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:19: AFTER
                {
                mAFTER(); if (state.failed) return ;

                }
                break;
            case 3 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:25: AND
                {
                mAND(); if (state.failed) return ;

                }
                break;
            case 4 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:29: AS
                {
                mAS(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:32: ASSERT
                {
                mASSERT(); if (state.failed) return ;

                }
                break;
            case 6 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:39: AT
                {
                mAT(); if (state.failed) return ;

                }
                break;
            case 7 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:42: ATTRIBUTE
                {
                mATTRIBUTE(); if (state.failed) return ;

                }
                break;
            case 8 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:52: BEFORE
                {
                mBEFORE(); if (state.failed) return ;

                }
                break;
            case 9 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:59: BIND
                {
                mBIND(); if (state.failed) return ;

                }
                break;
            case 10 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:64: BOUND
                {
                mBOUND(); if (state.failed) return ;

                }
                break;
            case 11 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:70: BREAK
                {
                mBREAK(); if (state.failed) return ;

                }
                break;
            case 12 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:76: CATCH
                {
                mCATCH(); if (state.failed) return ;

                }
                break;
            case 13 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:82: CLASS
                {
                mCLASS(); if (state.failed) return ;

                }
                break;
            case 14 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:88: CONTINUE
                {
                mCONTINUE(); if (state.failed) return ;

                }
                break;
            case 15 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:97: DEF
                {
                mDEF(); if (state.failed) return ;

                }
                break;
            case 16 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:101: DELETE
                {
                mDELETE(); if (state.failed) return ;

                }
                break;
            case 17 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:108: ELSE
                {
                mELSE(); if (state.failed) return ;

                }
                break;
            case 18 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:113: EXCLUSIVE
                {
                mEXCLUSIVE(); if (state.failed) return ;

                }
                break;
            case 19 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:123: EXTENDS
                {
                mEXTENDS(); if (state.failed) return ;

                }
                break;
            case 20 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:131: FALSE
                {
                mFALSE(); if (state.failed) return ;

                }
                break;
            case 21 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:137: FINALLY
                {
                mFINALLY(); if (state.failed) return ;

                }
                break;
            case 22 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:145: FIRST
                {
                mFIRST(); if (state.failed) return ;

                }
                break;
            case 23 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:151: FOR
                {
                mFOR(); if (state.failed) return ;

                }
                break;
            case 24 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:155: FROM
                {
                mFROM(); if (state.failed) return ;

                }
                break;
            case 25 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:160: FUNCTION
                {
                mFUNCTION(); if (state.failed) return ;

                }
                break;
            case 26 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:169: IF
                {
                mIF(); if (state.failed) return ;

                }
                break;
            case 27 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:172: IMPORT
                {
                mIMPORT(); if (state.failed) return ;

                }
                break;
            case 28 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:179: INDEXOF
                {
                mINDEXOF(); if (state.failed) return ;

                }
                break;
            case 29 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:187: IN
                {
                mIN(); if (state.failed) return ;

                }
                break;
            case 30 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:190: INIT
                {
                mINIT(); if (state.failed) return ;

                }
                break;
            case 31 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:195: INSERT
                {
                mINSERT(); if (state.failed) return ;

                }
                break;
            case 32 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:202: INSTANCEOF
                {
                mINSTANCEOF(); if (state.failed) return ;

                }
                break;
            case 33 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:213: INTO
                {
                mINTO(); if (state.failed) return ;

                }
                break;
            case 34 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:218: INVERSE
                {
                mINVERSE(); if (state.failed) return ;

                }
                break;
            case 35 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:226: LAST
                {
                mLAST(); if (state.failed) return ;

                }
                break;
            case 36 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:231: LAZY
                {
                mLAZY(); if (state.failed) return ;

                }
                break;
            case 37 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:236: MIXIN
                {
                mMIXIN(); if (state.failed) return ;

                }
                break;
            case 38 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:242: MOD
                {
                mMOD(); if (state.failed) return ;

                }
                break;
            case 39 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:246: NATIVEARRAY
                {
                mNATIVEARRAY(); if (state.failed) return ;

                }
                break;
            case 40 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:258: NEW
                {
                mNEW(); if (state.failed) return ;

                }
                break;
            case 41 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:262: NOT
                {
                mNOT(); if (state.failed) return ;

                }
                break;
            case 42 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:266: NULL
                {
                mNULL(); if (state.failed) return ;

                }
                break;
            case 43 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:271: ON
                {
                mON(); if (state.failed) return ;

                }
                break;
            case 44 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:274: OR
                {
                mOR(); if (state.failed) return ;

                }
                break;
            case 45 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:277: OVERRIDE
                {
                mOVERRIDE(); if (state.failed) return ;

                }
                break;
            case 46 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:286: PACKAGE
                {
                mPACKAGE(); if (state.failed) return ;

                }
                break;
            case 47 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:294: POSTINIT
                {
                mPOSTINIT(); if (state.failed) return ;

                }
                break;
            case 48 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:303: PRIVATE
                {
                mPRIVATE(); if (state.failed) return ;

                }
                break;
            case 49 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:311: PROTECTED
                {
                mPROTECTED(); if (state.failed) return ;

                }
                break;
            case 50 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:321: PUBLIC_INIT
                {
                mPUBLIC_INIT(); if (state.failed) return ;

                }
                break;
            case 51 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:333: PUBLIC
                {
                mPUBLIC(); if (state.failed) return ;

                }
                break;
            case 52 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:340: PUBLIC_READ
                {
                mPUBLIC_READ(); if (state.failed) return ;

                }
                break;
            case 53 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:352: REPLACE
                {
                mREPLACE(); if (state.failed) return ;

                }
                break;
            case 54 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:360: RETURN
                {
                mRETURN(); if (state.failed) return ;

                }
                break;
            case 55 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:367: REVERSE
                {
                mREVERSE(); if (state.failed) return ;

                }
                break;
            case 56 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:375: SIZEOF
                {
                mSIZEOF(); if (state.failed) return ;

                }
                break;
            case 57 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:382: STATIC
                {
                mSTATIC(); if (state.failed) return ;

                }
                break;
            case 58 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:389: STEP
                {
                mSTEP(); if (state.failed) return ;

                }
                break;
            case 59 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:394: SUPER
                {
                mSUPER(); if (state.failed) return ;

                }
                break;
            case 60 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:400: THEN
                {
                mTHEN(); if (state.failed) return ;

                }
                break;
            case 61 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:405: THIS
                {
                mTHIS(); if (state.failed) return ;

                }
                break;
            case 62 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:410: THROW
                {
                mTHROW(); if (state.failed) return ;

                }
                break;
            case 63 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:416: TRIGGER
                {
                mTRIGGER(); if (state.failed) return ;

                }
                break;
            case 64 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:424: TRUE
                {
                mTRUE(); if (state.failed) return ;

                }
                break;
            case 65 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:429: TRY
                {
                mTRY(); if (state.failed) return ;

                }
                break;
            case 66 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:433: TWEEN
                {
                mTWEEN(); if (state.failed) return ;

                }
                break;
            case 67 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:439: TYPEOF
                {
                mTYPEOF(); if (state.failed) return ;

                }
                break;
            case 68 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:446: VAR
                {
                mVAR(); if (state.failed) return ;

                }
                break;
            case 69 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:450: WHERE
                {
                mWHERE(); if (state.failed) return ;

                }
                break;
            case 70 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:456: WHILE
                {
                mWHILE(); if (state.failed) return ;

                }
                break;
            case 71 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:462: WITH
                {
                mWITH(); if (state.failed) return ;

                }
                break;
            case 72 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:467: LBRACKET
                {
                mLBRACKET(); if (state.failed) return ;

                }
                break;
            case 73 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:476: LPAREN
                {
                mLPAREN(); if (state.failed) return ;

                }
                break;
            case 74 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:483: POUND
                {
                mPOUND(); if (state.failed) return ;

                }
                break;
            case 75 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:489: PIPE
                {
                mPIPE(); if (state.failed) return ;

                }
                break;
            case 76 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:494: PLUSPLUS
                {
                mPLUSPLUS(); if (state.failed) return ;

                }
                break;
            case 77 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:503: DOTDOT
                {
                mDOTDOT(); if (state.failed) return ;

                }
                break;
            case 78 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:510: RPAREN
                {
                mRPAREN(); if (state.failed) return ;

                }
                break;
            case 79 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:517: RBRACKET
                {
                mRBRACKET(); if (state.failed) return ;

                }
                break;
            case 80 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:526: SEMI
                {
                mSEMI(); if (state.failed) return ;

                }
                break;
            case 81 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:531: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 82 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:537: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 83 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:541: EQEQ
                {
                mEQEQ(); if (state.failed) return ;

                }
                break;
            case 84 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:546: EQ
                {
                mEQ(); if (state.failed) return ;

                }
                break;
            case 85 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:549: GT
                {
                mGT(); if (state.failed) return ;

                }
                break;
            case 86 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:552: LT
                {
                mLT(); if (state.failed) return ;

                }
                break;
            case 87 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:555: LTGT
                {
                mLTGT(); if (state.failed) return ;

                }
                break;
            case 88 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:560: LTEQ
                {
                mLTEQ(); if (state.failed) return ;

                }
                break;
            case 89 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:565: GTEQ
                {
                mGTEQ(); if (state.failed) return ;

                }
                break;
            case 90 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:570: PLUS
                {
                mPLUS(); if (state.failed) return ;

                }
                break;
            case 91 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:575: SUB
                {
                mSUB(); if (state.failed) return ;

                }
                break;
            case 92 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:579: STAR
                {
                mSTAR(); if (state.failed) return ;

                }
                break;
            case 93 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:584: SLASH
                {
                mSLASH(); if (state.failed) return ;

                }
                break;
            case 94 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:590: PERCENT
                {
                mPERCENT(); if (state.failed) return ;

                }
                break;
            case 95 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:598: PLUSEQ
                {
                mPLUSEQ(); if (state.failed) return ;

                }
                break;
            case 96 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:605: SUBEQ
                {
                mSUBEQ(); if (state.failed) return ;

                }
                break;
            case 97 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:611: STAREQ
                {
                mSTAREQ(); if (state.failed) return ;

                }
                break;
            case 98 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:618: SLASHEQ
                {
                mSLASHEQ(); if (state.failed) return ;

                }
                break;
            case 99 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:626: PERCENTEQ
                {
                mPERCENTEQ(); if (state.failed) return ;

                }
                break;
            case 100 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:636: NOTEQ
                {
                mNOTEQ(); if (state.failed) return ;

                }
                break;
            case 101 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:642: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 102 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:648: QUES
                {
                mQUES(); if (state.failed) return ;

                }
                break;
            case 103 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:653: SUCHTHAT
                {
                mSUCHTHAT(); if (state.failed) return ;

                }
                break;
            case 104 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:662: SUBSUB
                {
                mSUBSUB(); if (state.failed) return ;

                }
                break;
            case 105 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:669: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 106 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:672: STRING_LITERAL
                {
                mSTRING_LITERAL(); if (state.failed) return ;

                }
                break;
            case 107 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:687: LBRACE
                {
                mLBRACE(); if (state.failed) return ;

                }
                break;
            case 108 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:694: RBRACE_QUOTE_STRING_LITERAL
                {
                mRBRACE_QUOTE_STRING_LITERAL(); if (state.failed) return ;

                }
                break;
            case 109 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:722: RBRACE_LBRACE_STRING_LITERAL
                {
                mRBRACE_LBRACE_STRING_LITERAL(); if (state.failed) return ;

                }
                break;
            case 110 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:751: RBRACE
                {
                mRBRACE(); if (state.failed) return ;

                }
                break;
            case 111 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:758: FORMAT_STRING_LITERAL
                {
                mFORMAT_STRING_LITERAL(); if (state.failed) return ;

                }
                break;
            case 112 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:780: TRANSLATION_KEY
                {
                mTRANSLATION_KEY(); if (state.failed) return ;

                }
                break;
            case 113 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:796: FLOATING_POINT_LITERAL
                {
                mFLOATING_POINT_LITERAL(); if (state.failed) return ;

                }
                break;
            case 114 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:819: IDENTIFIER
                {
                mIDENTIFIER(); if (state.failed) return ;

                }
                break;
            case 115 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:830: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;

                }
                break;
            case 116 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:838: LINE_COMMENT
                {
                mLINE_COMMENT(); if (state.failed) return ;

                }
                break;
            case 117 :
                // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:1:851: INVALIDC
                {
                mINVALIDC(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_v4Lexer
    public final void synpred1_v4Lexer_fragment() throws RecognitionException {   
        // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:507:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )* '%' )
        // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:507:5: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )* '%'
        {
        // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:507:5: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )*
        loop61:
        do {
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>='\t' && LA61_0<='\n')||(LA61_0>='\f' && LA61_0<='\r')||LA61_0==' ') ) {
                alt61=1;
            }


            switch (alt61) {
        	case 1 :
        	    // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:
        	    {
        	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
        	        input.consume();
        	    state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        recover(mse);
        	        throw mse;}


        	    }
        	    break;

        	default :
        	    break loop61;
            }
        } while (true);

        match('%'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_v4Lexer

    // $ANTLR start synpred2_v4Lexer
    public final void synpred2_v4Lexer_fragment() throws RecognitionException {   
        // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:815:11: ( '.' (~ ( 'a' .. 'd' | 'f' .. 'z' | 'A' .. 'D' | 'F' .. 'Z' ) ) )
        // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:815:12: '.' (~ ( 'a' .. 'd' | 'f' .. 'z' | 'A' .. 'D' | 'F' .. 'Z' ) )
        {
        match('.'); if (state.failed) return ;
        // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:815:16: (~ ( 'a' .. 'd' | 'f' .. 'z' | 'A' .. 'D' | 'F' .. 'Z' ) )
        // /Volumes/src/n/fx/visage/visage.lexer/src/org/netbeans/lib/visage/lexer/v4Lexer.g:815:17: ~ ( 'a' .. 'd' | 'f' .. 'z' | 'A' .. 'D' | 'F' .. 'Z' )
        {
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='@')||input.LA(1)=='E'||(input.LA(1)>='[' && input.LA(1)<='`')||input.LA(1)=='e'||(input.LA(1)>='{' && input.LA(1)<='\uFFFF') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }


        }
    }
    // $ANTLR end synpred2_v4Lexer

    public final boolean synpred2_v4Lexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_v4Lexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_v4Lexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_v4Lexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA10_eotS =
        "\11\uffff";
    static final String DFA10_eofS =
        "\11\uffff";
    static final String DFA10_minS =
        "\1\175\5\0\2\uffff\1\0";
    static final String DFA10_maxS =
        "\1\175\4\uffff\1\0\2\uffff\1\uffff";
    static final String DFA10_acceptS =
        "\6\uffff\1\1\1\2\1\uffff";
    static final String DFA10_specialS =
        "\1\2\1\6\1\5\1\1\1\0\1\4\2\uffff\1\3}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\12\2\1\uffff\2\2\1\uffff\24\2\1\7\4\2\1\6\64\2\1\3\36\2\1"+
            "\5\1\2\1\4\uff82\2",
            "\12\2\1\uffff\2\2\1\uffff\24\2\1\7\4\2\1\6\64\2\1\3\36\2\1"+
            "\5\1\2\1\4\uff82\2",
            "\0\10",
            "\12\2\1\uffff\2\2\1\uffff\24\2\1\7\4\2\1\6\64\2\1\3\36\2\1"+
            "\5\1\2\1\4\uff82\2",
            "\1\uffff",
            "",
            "",
            "\12\2\1\uffff\2\2\1\uffff\24\2\1\7\4\2\1\6\64\2\1\3\36\2\1"+
            "\5\1\2\1\4\uff82\2"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "432:1: RBRACE_LBRACE_STRING_LITERAL : ({...}? => '}' DoubleQuoteBody '{' NextIsPercent[CUR_QUOTE_CTX] | {...}? => '}' SingleQuoteBody '{' NextIsPercent[CUR_QUOTE_CTX] );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_4=='{') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 5;}

                        else if ( ((LA10_4>='\u0000' && LA10_4<='\t')||(LA10_4>='\u000B' && LA10_4<='\f')||(LA10_4>='\u000E' && LA10_4<='!')||(LA10_4>='#' && LA10_4<='&')||(LA10_4>='(' && LA10_4<='[')||(LA10_4>=']' && LA10_4<='z')||LA10_4=='|'||(LA10_4>='~' && LA10_4<='\uFFFF')) && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 2;}

                        else if ( (LA10_4=='\\') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 3;}

                        else if ( (LA10_4=='}') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 4;}

                        else if ( (LA10_4=='\'') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 6;}

                        else if ( (LA10_4=='\"') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 7;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA10_3>='\u0000' && LA10_3<='\uFFFF')) && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 8;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_0 = input.LA(1);

                         
                        int index10_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_0=='}') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 1;}

                         
                        input.seek(index10_0);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_8=='{') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 5;}

                        else if ( ((LA10_8>='\u0000' && LA10_8<='\t')||(LA10_8>='\u000B' && LA10_8<='\f')||(LA10_8>='\u000E' && LA10_8<='!')||(LA10_8>='#' && LA10_8<='&')||(LA10_8>='(' && LA10_8<='[')||(LA10_8>=']' && LA10_8<='z')||LA10_8=='|'||(LA10_8>='~' && LA10_8<='\uFFFF')) && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 2;}

                        else if ( (LA10_8=='\\') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 3;}

                        else if ( (LA10_8=='}') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 4;}

                        else if ( (LA10_8=='\'') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 6;}

                        else if ( (LA10_8=='\"') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 7;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( rightBraceLikeQuote(DBL_QUOTE_CTX) )) ) {s = 6;}

                        else if ( (( rightBraceLikeQuote(SNG_QUOTE_CTX) )) ) {s = 7;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_2=='{') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 5;}

                        else if ( ((LA10_2>='\u0000' && LA10_2<='\t')||(LA10_2>='\u000B' && LA10_2<='\f')||(LA10_2>='\u000E' && LA10_2<='!')||(LA10_2>='#' && LA10_2<='&')||(LA10_2>='(' && LA10_2<='[')||(LA10_2>=']' && LA10_2<='z')||LA10_2=='|'||(LA10_2>='~' && LA10_2<='\uFFFF')) && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 2;}

                        else if ( (LA10_2=='\\') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 3;}

                        else if ( (LA10_2=='}') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 4;}

                        else if ( (LA10_2=='\'') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 6;}

                        else if ( (LA10_2=='\"') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 7;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA10_1>='\u0000' && LA10_1<='\t')||(LA10_1>='\u000B' && LA10_1<='\f')||(LA10_1>='\u000E' && LA10_1<='!')||(LA10_1>='#' && LA10_1<='&')||(LA10_1>='(' && LA10_1<='[')||(LA10_1>=']' && LA10_1<='z')||LA10_1=='|'||(LA10_1>='~' && LA10_1<='\uFFFF')) && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 2;}

                        else if ( (LA10_1=='\\') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 3;}

                        else if ( (LA10_1=='}') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 4;}

                        else if ( (LA10_1=='{') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 5;}

                        else if ( (LA10_1=='\'') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 6;}

                        else if ( (LA10_1=='\"') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 7;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\1\uffff\21\64\2\uffff\1\143\1\uffff\1\147\1\151\4\uffff\1\161\1"+
        "\163\1\166\1\171\1\173\1\177\1\u0081\1\56\3\uffff\1\56\2\uffff\1"+
        "\u008c\4\uffff\3\64\1\u0096\1\u0098\1\uffff\17\64\1\u00ab\1\64\1"+
        "\u00b2\7\64\1\u00bb\1\u00bc\20\64\40\uffff\1\u00d7\10\uffff\1\u00d8"+
        "\1\uffff\1\u00d8\2\uffff\2\u00d8\2\uffff\2\64\1\u00e7\1\64\1\uffff"+
        "\1\64\1\uffff\7\64\1\u00f1\7\64\1\u00f9\2\64\1\uffff\6\64\1\uffff"+
        "\3\64\1\u0106\1\64\1\u0108\1\u0109\1\64\2\uffff\22\64\1\u011d\2"+
        "\64\1\u0120\3\64\3\uffff\1\u00d8\2\uffff\1\u0125\1\uffff\1\u0125"+
        "\2\uffff\1\u0127\1\uffff\1\u0127\1\uffff\2\64\1\uffff\3\64\1\u012e"+
        "\5\64\1\uffff\1\64\1\u0135\5\64\1\uffff\1\u013b\3\64\1\u013f\2\64"+
        "\1\u0142\1\64\1\u0144\1\u0145\1\64\1\uffff\1\64\2\uffff\1\u0148"+
        "\13\64\1\u0154\1\64\1\u0156\1\u0157\2\64\1\u015a\1\uffff\2\64\1"+
        "\uffff\2\64\1\u015f\2\uffff\1\u0125\1\uffff\1\u0127\1\64\1\u0163"+
        "\3\64\1\uffff\1\u0167\1\u0168\1\u0169\1\u016a\2\64\1\uffff\2\64"+
        "\1\u016f\1\64\1\u0171\1\uffff\3\64\1\uffff\2\64\1\uffff\1\64\2\uffff"+
        "\1\u0178\1\64\1\uffff\13\64\1\uffff\1\u0185\2\uffff\1\u0186\1\64"+
        "\1\uffff\1\u0188\1\64\1\u018a\1\u018b\3\uffff\1\64\1\uffff\1\u018d"+
        "\1\64\1\u018f\4\uffff\1\64\1\u0191\2\64\1\uffff\1\64\1\uffff\1\64"+
        "\1\u0196\1\64\1\u0198\2\64\1\uffff\6\64\1\u01a2\1\64\1\u01a4\1\64"+
        "\1\u01a6\1\u01a7\2\uffff\1\64\1\uffff\1\u01a9\2\uffff\1\64\1\uffff"+
        "\1\64\1\uffff\1\64\1\uffff\1\64\1\u01ae\1\u01af\1\64\1\uffff\1\u01b1"+
        "\1\uffff\1\64\1\u01b3\2\64\1\u01b6\1\64\1\u01b8\1\64\2\uffff\1\u01bc"+
        "\1\uffff\1\u01bd\2\uffff\1\u01be\1\uffff\1\u01bf\1\64\1\u01c1\1"+
        "\64\2\uffff\1\u01c3\1\uffff\1\64\1\uffff\1\64\1\u01c6\1\uffff\1"+
        "\u01c7\1\uffff\1\64\6\uffff\1\u01c9\1\uffff\1\u01ca\1\uffff\2\64"+
        "\2\uffff\1\u01cd\2\uffff\1\u01ce\1\64\2\uffff\1\u01d0\1\uffff";
    static final String DFA60_eofS =
        "\u01d1\uffff";
    static final String DFA60_minS =
        "\1\0\1\142\1\145\1\141\1\145\1\154\1\141\1\146\1\141\1\151\1\141"+
        "\1\156\1\141\1\145\1\151\1\150\1\141\1\150\2\uffff\1\43\1\uffff"+
        "\1\53\1\56\4\uffff\2\75\1\74\1\55\1\75\1\52\1\0\1\75\3\uffff\1\0"+
        "\2\uffff\1\0\4\uffff\1\163\1\164\1\144\2\44\1\uffff\1\146\1\156"+
        "\1\165\1\145\1\164\1\141\1\156\1\146\1\163\1\143\1\154\1\156\1\162"+
        "\1\157\1\156\1\44\1\160\1\44\1\163\1\170\1\144\1\164\1\167\1\164"+
        "\1\154\2\44\1\145\1\143\1\163\1\151\1\142\1\160\1\172\1\141\1\160"+
        "\1\145\1\151\1\145\1\160\1\162\1\145\1\164\40\uffff\1\0\10\uffff"+
        "\4\0\1\uffff\2\0\2\uffff\1\164\1\145\1\44\1\145\1\uffff\1\162\1"+
        "\uffff\1\157\1\144\1\156\1\141\1\143\1\163\1\164\1\44\2\145\1\154"+
        "\1\145\1\163\1\141\1\163\1\44\1\155\1\143\1\uffff\1\157\1\145\1"+
        "\164\1\145\1\157\1\145\1\uffff\1\164\1\171\1\151\1\44\1\151\2\44"+
        "\1\154\2\uffff\1\162\1\153\1\164\1\166\1\164\2\154\1\165\2\145\1"+
        "\164\1\160\1\145\1\156\1\163\1\157\1\147\1\145\1\44\2\145\1\44\1"+
        "\162\1\154\1\150\1\uffff\1\0\1\uffff\1\0\2\uffff\3\0\2\uffff\3\0"+
        "\1\uffff\2\162\1\uffff\1\162\1\151\1\162\1\44\1\144\1\153\1\150"+
        "\1\163\1\151\1\uffff\1\164\1\44\1\165\1\156\1\145\1\154\1\164\1"+
        "\uffff\1\44\1\164\1\162\1\170\1\44\1\162\1\141\1\44\1\162\2\44\1"+
        "\156\1\uffff\1\166\2\uffff\1\44\1\162\1\141\1\151\1\141\1\145\1"+
        "\151\1\141\2\162\1\157\1\151\1\44\1\162\2\44\1\167\1\147\1\44\1"+
        "\uffff\1\156\1\157\1\uffff\2\145\1\44\2\uffff\1\0\1\uffff\1\0\1"+
        "\141\1\44\1\164\1\142\1\145\1\uffff\4\44\1\156\1\145\1\uffff\1\163"+
        "\1\144\1\44\1\154\1\44\1\uffff\1\151\1\164\1\157\1\uffff\1\164\1"+
        "\156\1\uffff\1\163\2\uffff\1\44\1\145\1\uffff\1\151\1\147\1\156"+
        "\1\164\3\143\1\156\1\163\1\146\1\143\1\uffff\1\44\2\uffff\1\44\1"+
        "\145\1\uffff\1\44\1\146\2\44\3\uffff\1\143\1\uffff\1\44\1\165\1"+
        "\44\4\uffff\1\165\1\44\1\151\1\163\1\uffff\1\171\1\uffff\1\157\1"+
        "\44\1\146\1\44\1\143\1\145\1\uffff\1\141\1\144\1\145\1\151\1\145"+
        "\1\164\1\44\1\145\1\44\1\145\2\44\2\uffff\1\162\1\uffff\1\44\2\uffff"+
        "\1\164\1\uffff\1\164\1\uffff\1\145\1\uffff\1\166\2\44\1\156\1\uffff"+
        "\1\44\1\uffff\1\145\1\44\1\162\1\145\1\44\1\164\1\44\1\145\1\151"+
        "\1\uffff\1\44\1\uffff\1\44\2\uffff\1\44\1\uffff\1\44\1\145\1\44"+
        "\1\145\2\uffff\1\44\1\uffff\1\157\1\uffff\1\162\1\44\1\uffff\1\44"+
        "\1\uffff\1\144\6\uffff\1\44\1\uffff\1\44\1\uffff\1\146\1\141\2\uffff"+
        "\1\44\2\uffff\1\44\1\171\2\uffff\1\44\1\uffff";
    static final String DFA60_maxS =
        "\1\uffff\1\164\1\162\1\157\1\145\1\170\1\165\1\156\1\141\1\157\1"+
        "\165\1\166\1\165\1\145\1\165\1\171\1\141\1\151\2\uffff\1\43\1\uffff"+
        "\1\75\1\71\4\uffff\1\76\1\75\1\76\3\75\1\uffff\1\75\3\uffff\1\uffff"+
        "\2\uffff\1\uffff\4\uffff\1\163\1\164\1\144\2\ufaff\1\uffff\1\146"+
        "\1\156\1\165\1\145\1\164\1\141\1\156\1\154\1\163\1\164\1\154\2\162"+
        "\1\157\1\156\1\ufaff\1\160\1\ufaff\1\172\1\170\1\144\1\164\1\167"+
        "\1\164\1\154\2\ufaff\1\145\1\143\1\163\1\157\1\142\1\166\1\172\1"+
        "\145\1\160\1\162\1\171\1\145\1\160\1\162\1\151\1\164\40\uffff\1"+
        "\uffff\10\uffff\3\uffff\1\0\1\uffff\2\uffff\2\uffff\1\164\1\145"+
        "\1\ufaff\1\145\1\uffff\1\162\1\uffff\1\157\1\144\1\156\1\141\1\143"+
        "\1\163\1\164\1\ufaff\2\145\1\154\1\145\1\163\1\141\1\163\1\ufaff"+
        "\1\155\1\143\1\uffff\1\157\1\145\2\164\1\157\1\145\1\uffff\1\164"+
        "\1\171\1\151\1\ufaff\1\151\2\ufaff\1\154\2\uffff\1\162\1\153\1\164"+
        "\1\166\1\164\2\154\1\165\2\145\1\164\1\160\1\145\1\156\1\163\1\157"+
        "\1\147\1\145\1\ufaff\2\145\1\ufaff\1\162\1\154\1\150\1\uffff\1\0"+
        "\1\uffff\1\uffff\2\uffff\3\uffff\2\uffff\3\uffff\1\uffff\2\162\1"+
        "\uffff\1\162\1\151\1\162\1\ufaff\1\144\1\153\1\150\1\163\1\151\1"+
        "\uffff\1\164\1\ufaff\1\165\1\156\1\145\1\154\1\164\1\uffff\1\ufaff"+
        "\1\164\1\162\1\170\1\ufaff\1\162\1\141\1\ufaff\1\162\2\ufaff\1\156"+
        "\1\uffff\1\166\2\uffff\1\ufaff\1\162\1\141\1\151\1\141\1\145\1\151"+
        "\1\141\2\162\1\157\1\151\1\ufaff\1\162\2\ufaff\1\167\1\147\1\ufaff"+
        "\1\uffff\1\156\1\157\1\uffff\2\145\1\ufaff\2\uffff\1\uffff\1\uffff"+
        "\1\uffff\1\141\1\ufaff\1\164\1\142\1\145\1\uffff\4\ufaff\1\156\1"+
        "\145\1\uffff\1\163\1\144\1\ufaff\1\154\1\ufaff\1\uffff\1\151\1\164"+
        "\1\157\1\uffff\1\164\1\156\1\uffff\1\163\2\uffff\1\ufaff\1\145\1"+
        "\uffff\1\151\1\147\1\156\1\164\3\143\1\156\1\163\1\146\1\143\1\uffff"+
        "\1\ufaff\2\uffff\1\ufaff\1\145\1\uffff\1\ufaff\1\146\2\ufaff\3\uffff"+
        "\1\143\1\uffff\1\ufaff\1\165\1\ufaff\4\uffff\1\165\1\ufaff\1\151"+
        "\1\163\1\uffff\1\171\1\uffff\1\157\1\ufaff\1\146\1\ufaff\1\143\1"+
        "\145\1\uffff\1\141\1\144\1\145\1\151\1\145\1\164\1\ufaff\1\145\1"+
        "\ufaff\1\145\2\ufaff\2\uffff\1\162\1\uffff\1\ufaff\2\uffff\1\164"+
        "\1\uffff\1\164\1\uffff\1\145\1\uffff\1\166\2\ufaff\1\156\1\uffff"+
        "\1\ufaff\1\uffff\1\145\1\ufaff\1\162\1\145\1\ufaff\1\164\1\ufaff"+
        "\1\145\1\162\1\uffff\1\ufaff\1\uffff\1\ufaff\2\uffff\1\ufaff\1\uffff"+
        "\1\ufaff\1\145\1\ufaff\1\145\2\uffff\1\ufaff\1\uffff\1\157\1\uffff"+
        "\1\162\1\ufaff\1\uffff\1\ufaff\1\uffff\1\144\6\uffff\1\ufaff\1\uffff"+
        "\1\ufaff\1\uffff\1\146\1\141\2\uffff\1\ufaff\2\uffff\1\ufaff\1\171"+
        "\2\uffff\1\ufaff\1\uffff";
    static final String DFA60_acceptS =
        "\22\uffff\1\110\1\111\1\uffff\1\113\2\uffff\1\116\1\117\1\120\1"+
        "\121\10\uffff\1\145\1\146\1\151\1\uffff\1\152\1\153\1\uffff\2\161"+
        "\1\162\1\165\5\uffff\1\162\53\uffff\1\110\1\111\1\160\1\112\1\113"+
        "\1\114\1\137\1\132\1\115\1\122\1\161\1\116\1\117\1\120\1\121\1\123"+
        "\1\147\1\124\1\131\1\125\1\127\1\130\1\126\1\140\1\150\1\133\1\141"+
        "\1\134\1\142\1\163\1\164\1\135\1\uffff\1\136\1\157\1\144\1\145\1"+
        "\146\1\151\1\152\1\153\4\uffff\1\155\2\uffff\2\154\4\uffff\1\4\1"+
        "\uffff\1\6\22\uffff\1\32\6\uffff\1\35\10\uffff\1\53\1\54\31\uffff"+
        "\1\115\1\uffff\1\154\1\uffff\1\156\1\155\3\uffff\1\154\1\155\3\uffff"+
        "\1\154\2\uffff\1\3\11\uffff\1\17\7\uffff\1\27\14\uffff\1\46\1\uffff"+
        "\1\50\1\51\23\uffff\1\101\2\uffff\1\104\3\uffff\1\143\1\154\1\uffff"+
        "\1\154\6\uffff\1\11\6\uffff\1\21\5\uffff\1\30\3\uffff\1\36\2\uffff"+
        "\1\41\1\uffff\1\43\1\44\2\uffff\1\52\13\uffff\1\72\1\uffff\1\74"+
        "\1\75\2\uffff\1\100\4\uffff\1\107\2\154\1\uffff\1\2\3\uffff\1\12"+
        "\1\13\1\14\1\15\4\uffff\1\24\1\uffff\1\26\6\uffff\1\45\14\uffff"+
        "\1\73\1\76\1\uffff\1\102\1\uffff\1\105\1\106\1\uffff\1\5\1\uffff"+
        "\1\10\1\uffff\1\20\4\uffff\1\33\1\uffff\1\37\11\uffff\1\63\1\uffff"+
        "\1\66\1\uffff\1\70\1\71\1\uffff\1\103\4\uffff\1\23\1\25\1\uffff"+
        "\1\34\1\uffff\1\42\2\uffff\1\56\1\uffff\1\60\1\uffff\1\62\1\64\1"+
        "\65\1\67\1\77\1\1\1\uffff\1\16\1\uffff\1\31\2\uffff\1\55\1\57\1"+
        "\uffff\1\7\1\22\2\uffff\1\61\1\40\1\uffff\1\47";
    static final String DFA60_specialS =
        "\1\7\41\uffff\1\10\4\uffff\1\21\2\uffff\1\20\125\uffff\1\4\10\uffff"+
        "\1\3\1\24\1\23\1\22\1\uffff\1\16\1\17\107\uffff\1\13\1\uffff\1\2"+
        "\2\uffff\1\0\1\12\1\11\2\uffff\1\5\1\14\1\15\102\uffff\1\1\1\uffff"+
        "\1\6\u00a8\uffff}>";
    static final String[] DFA60_transitionS = {
            "\11\56\2\46\1\56\2\46\22\56\1\46\1\43\1\47\1\24\1\55\1\42\1"+
            "\56\1\50\1\23\1\30\1\40\1\26\1\33\1\37\1\27\1\41\1\53\11\54"+
            "\1\44\1\32\1\36\1\34\1\35\1\45\1\56\32\55\1\22\1\56\1\31\1\56"+
            "\1\55\1\56\1\1\1\2\1\3\1\4\1\5\1\6\2\55\1\7\2\55\1\10\1\11\1"+
            "\12\1\13\1\14\1\55\1\15\1\16\1\17\1\55\1\20\1\21\3\55\1\51\1"+
            "\25\1\52\102\56\27\55\1\56\37\55\1\56\u1f08\55\u1040\56\u0150"+
            "\55\u0170\56\u0080\55\u0080\56\u092e\55\u10d2\56\u5200\55\u5900"+
            "\56\u0200\55\u0500\56",
            "\1\57\3\uffff\1\60\7\uffff\1\61\4\uffff\1\62\1\63",
            "\1\65\3\uffff\1\66\5\uffff\1\67\2\uffff\1\70",
            "\1\71\12\uffff\1\72\2\uffff\1\73",
            "\1\74",
            "\1\75\13\uffff\1\76",
            "\1\77\7\uffff\1\100\5\uffff\1\101\2\uffff\1\102\2\uffff\1\103",
            "\1\104\6\uffff\1\105\1\106",
            "\1\107",
            "\1\110\5\uffff\1\111",
            "\1\112\3\uffff\1\113\11\uffff\1\114\5\uffff\1\115",
            "\1\116\3\uffff\1\117\3\uffff\1\120",
            "\1\121\15\uffff\1\122\2\uffff\1\123\2\uffff\1\124",
            "\1\125",
            "\1\126\12\uffff\1\127\1\130",
            "\1\131\11\uffff\1\132\4\uffff\1\133\1\uffff\1\134",
            "\1\135",
            "\1\136\1\137",
            "",
            "",
            "\1\142",
            "",
            "\1\145\21\uffff\1\146",
            "\1\150\1\uffff\12\152",
            "",
            "",
            "",
            "",
            "\1\157\1\160",
            "\1\162",
            "\1\64\1\165\1\164",
            "\1\170\17\uffff\1\167",
            "\1\172",
            "\1\175\4\uffff\1\176\15\uffff\1\174",
            "\40\u0082\1\uffff\34\u0082\1\u0080\uffc2\u0082",
            "\1\u0083",
            "",
            "",
            "",
            "\0\u0087",
            "",
            "",
            "\12\u0089\1\u0090\2\u0089\1\u0091\24\u0089\1\u008f\4\u0089"+
            "\1\u008e\64\u0089\1\u008a\36\u0089\1\u008d\1\u0089\1\u008b\uff82"+
            "\u0089",
            "",
            "",
            "",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22"+
            "\64\1\u0095\7\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08"+
            "\64\u1040\uffff\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e"+
            "\64\u10d2\uffff\u5200\64\u5900\uffff\u0200\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23"+
            "\64\1\u0097\6\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08"+
            "\64\u1040\uffff\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e"+
            "\64\u10d2\uffff\u5200\64\u5900\uffff\u0200\64",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\5\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a3\20\uffff\1\u00a4",
            "\1\u00a5",
            "\1\u00a6\3\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u00ac",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64"+
            "\1\u00ad\4\64\1\u00ae\11\64\1\u00af\1\u00b0\1\64\1\u00b1\4\64"+
            "\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u00b3\6\uffff\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0\5\uffff\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\3\uffff\1\u00c4\1\uffff\1\u00c5",
            "\1\u00c6",
            "\1\u00c7\3\uffff\1\u00c8",
            "\1\u00c9",
            "\1\u00ca\3\uffff\1\u00cb\10\uffff\1\u00cc",
            "\1\u00cd\13\uffff\1\u00ce\3\uffff\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3\3\uffff\1\u00d4",
            "\1\u00d5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\40\u0082\1\uffff\uffdf\u0082",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0089\1\u0090\2\u0089\1\u0091\24\u0089\1\u008f\4\u0089"+
            "\1\u008e\64\u0089\1\u008a\36\u0089\1\u008d\1\u0089\1\u008b\uff82"+
            "\u0089",
            "\0\u00d9",
            "\12\u0089\1\u0090\2\u0089\1\u0091\24\u0089\1\u008f\4\u0089"+
            "\1\u008e\64\u0089\1\u008a\36\u0089\1\u008d\1\u0089\1\u008b\uff82"+
            "\u0089",
            "\1\uffff",
            "",
            "\12\u00dc\1\u00df\2\u00dc\1\u00df\24\u00dc\1\u00df\71\u00dc"+
            "\1\u00dd\36\u00dc\1\u00db\1\u00dc\1\u00de\uff82\u00dc",
            "\12\u00e1\1\u00e4\2\u00e1\1\u00e4\31\u00e1\1\u00e4\64\u00e1"+
            "\1\u00e2\36\u00e1\1\u00e0\1\u00e1\1\u00e3\uff82\u00e1",
            "",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff\16\uffff\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0107",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u010a",
            "",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u011e",
            "\1\u011f",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "\1\uffff",
            "",
            "\12\u0089\1\u0090\2\u0089\1\u0091\24\u0089\1\u008f\4\u0089"+
            "\1\u008e\64\u0089\1\u008a\36\u0089\1\u008d\1\u0089\1\u008b\uff82"+
            "\u0089",
            "",
            "",
            "\12\u00dc\1\uffff\2\u00dc\1\uffff\24\u00dc\1\u00df\71\u00dc"+
            "\1\u00dd\36\u00dc\1\u00db\1\u00dc\1\u00de\uff82\u00dc",
            "\0\u0126",
            "\12\u00dc\1\uffff\2\u00dc\1\uffff\24\u00dc\1\u00df\71\u00dc"+
            "\1\u00dd\36\u00dc\1\u00db\1\u00dc\1\u00de\uff82\u00dc",
            "",
            "",
            "\12\u00e1\1\uffff\2\u00e1\1\uffff\31\u00e1\1\u00e4\64\u00e1"+
            "\1\u00e2\36\u00e1\1\u00e0\1\u00e1\1\u00e3\uff82\u00e1",
            "\0\u0128",
            "\12\u00e1\1\uffff\2\u00e1\1\uffff\31\u00e1\1\u00e4\64\u00e1"+
            "\1\u00e2\36\u00e1\1\u00e0\1\u00e1\1\u00e3\uff82\u00e1",
            "",
            "\1\u0129",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0140",
            "\1\u0141",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0143",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0146",
            "",
            "\1\u0147",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0155",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0158",
            "\1\u0159",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "",
            "\12\u00dc\1\u0160\2\u00dc\1\u0160\24\u00dc\1\u00df\71\u00dc"+
            "\1\u00dd\36\u00dc\1\u00db\1\u00dc\1\u00de\uff82\u00dc",
            "",
            "\12\u00e1\1\u0161\2\u00e1\1\u0161\31\u00e1\1\u00e4\64\u00e1"+
            "\1\u00e2\36\u00e1\1\u00e0\1\u00e1\1\u00e3\uff82\u00e1",
            "\1\u0162",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u016b",
            "\1\u016c",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0170",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0179",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0187",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0189",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "",
            "",
            "\1\u018c",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u018e",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "",
            "",
            "",
            "\1\u0190",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0192",
            "\1\u0193",
            "",
            "\1\u0194",
            "",
            "\1\u0195",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0197",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u0199",
            "\1\u019a",
            "",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\64\10\uffff\1\u01a1\2\uffff\12\64\7\uffff\32\64\4\uffff"+
            "\1\64\1\uffff\32\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08"+
            "\64\u1040\uffff\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e"+
            "\64\u10d2\uffff\u5200\64\u5900\uffff\u0200\64",
            "\1\u01a3",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u01a5",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "",
            "\1\u01a8",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "",
            "\1\u01aa",
            "",
            "\1\u01ab",
            "",
            "\1\u01ac",
            "",
            "\1\u01ad",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u01b0",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "\1\u01b2",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u01b4",
            "\1\u01b5",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u01b7",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u01b9",
            "\1\u01ba\10\uffff\1\u01bb",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u01c0",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u01c2",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "\1\u01c4",
            "",
            "\1\u01c5",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "\1\u01c8",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "\1\u01cb",
            "\1\u01cc",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            "\1\u01cf",
            "",
            "",
            "\1\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\105\uffff\27\64\1\uffff\37\64\1\uffff\u1f08\64\u1040\uffff"+
            "\u0150\64\u0170\uffff\u0080\64\u0080\uffff\u092e\64\u10d2\uffff"+
            "\u5200\64\u5900\uffff\u0200\64",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ABSTRACT | AFTER | AND | AS | ASSERT | AT | ATTRIBUTE | BEFORE | BIND | BOUND | BREAK | CATCH | CLASS | CONTINUE | DEF | DELETE | ELSE | EXCLUSIVE | EXTENDS | FALSE | FINALLY | FIRST | FOR | FROM | FUNCTION | IF | IMPORT | INDEXOF | IN | INIT | INSERT | INSTANCEOF | INTO | INVERSE | LAST | LAZY | MIXIN | MOD | NATIVEARRAY | NEW | NOT | NULL | ON | OR | OVERRIDE | PACKAGE | POSTINIT | PRIVATE | PROTECTED | PUBLIC_INIT | PUBLIC | PUBLIC_READ | REPLACE | RETURN | REVERSE | SIZEOF | STATIC | STEP | SUPER | THEN | THIS | THROW | TRIGGER | TRUE | TRY | TWEEN | TYPEOF | VAR | WHERE | WHILE | WITH | LBRACKET | LPAREN | POUND | PIPE | PLUSPLUS | DOTDOT | RPAREN | RBRACKET | SEMI | COMMA | DOT | EQEQ | EQ | GT | LT | LTGT | LTEQ | GTEQ | PLUS | SUB | STAR | SLASH | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | PERCENTEQ | NOTEQ | COLON | QUES | SUCHTHAT | SUBSUB | WS | STRING_LITERAL | LBRACE | RBRACE_QUOTE_STRING_LITERAL | RBRACE_LBRACE_STRING_LITERAL | RBRACE | FORMAT_STRING_LITERAL | TRANSLATION_KEY | FLOATING_POINT_LITERAL | IDENTIFIER | COMMENT | LINE_COMMENT | INVALIDC );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_220 = input.LA(1);

                         
                        int index60_220 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_220=='{') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 219;}

                        else if ( ((LA60_220>='\u0000' && LA60_220<='\t')||(LA60_220>='\u000B' && LA60_220<='\f')||(LA60_220>='\u000E' && LA60_220<='!')||(LA60_220>='#' && LA60_220<='[')||(LA60_220>=']' && LA60_220<='z')||LA60_220=='|'||(LA60_220>='~' && LA60_220<='\uFFFF')) && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 220;}

                        else if ( (LA60_220=='\\') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 221;}

                        else if ( (LA60_220=='}') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 222;}

                        else if ( (LA60_220=='\"') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 223;}

                        else s = 293;

                         
                        input.seek(index60_220);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_294 = input.LA(1);

                         
                        int index60_294 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_294=='{') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 219;}

                        else if ( ((LA60_294>='\u0000' && LA60_294<='\t')||(LA60_294>='\u000B' && LA60_294<='\f')||(LA60_294>='\u000E' && LA60_294<='!')||(LA60_294>='#' && LA60_294<='[')||(LA60_294>=']' && LA60_294<='z')||LA60_294=='|'||(LA60_294>='~' && LA60_294<='\uFFFF')) && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 220;}

                        else if ( (LA60_294=='\\') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 221;}

                        else if ( (LA60_294=='}') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 222;}

                        else if ( (LA60_294=='\"') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 223;}

                        else if ( (LA60_294=='\n'||LA60_294=='\r') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 352;}

                        else s = 293;

                         
                        input.seek(index60_294);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_217 = input.LA(1);

                         
                        int index60_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_217=='{') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 141;}

                        else if ( (LA60_217=='\'') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 142;}

                        else if ( (LA60_217=='\\') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 138;}

                        else if ( (LA60_217=='}') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 139;}

                        else if ( ((LA60_217>='\u0000' && LA60_217<='\t')||(LA60_217>='\u000B' && LA60_217<='\f')||(LA60_217>='\u000E' && LA60_217<='!')||(LA60_217>='#' && LA60_217<='&')||(LA60_217>='(' && LA60_217<='[')||(LA60_217>=']' && LA60_217<='z')||LA60_217=='|'||(LA60_217>='~' && LA60_217<='\uFFFF')) && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 137;}

                        else if ( (LA60_217=='\n') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 144;}

                        else if ( (LA60_217=='\r') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 145;}

                        else if ( (LA60_217=='\"') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 143;}

                        else s = 216;

                         
                        input.seek(index60_217);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA60_137 = input.LA(1);

                         
                        int index60_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_137=='{') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 141;}

                        else if ( ((LA60_137>='\u0000' && LA60_137<='\t')||(LA60_137>='\u000B' && LA60_137<='\f')||(LA60_137>='\u000E' && LA60_137<='!')||(LA60_137>='#' && LA60_137<='&')||(LA60_137>='(' && LA60_137<='[')||(LA60_137>=']' && LA60_137<='z')||LA60_137=='|'||(LA60_137>='~' && LA60_137<='\uFFFF')) && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 137;}

                        else if ( (LA60_137=='\\') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 138;}

                        else if ( (LA60_137=='}') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 139;}

                        else if ( (LA60_137=='\"') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 143;}

                        else if ( (LA60_137=='\'') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 142;}

                        else if ( (LA60_137=='\n') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 144;}

                        else if ( (LA60_137=='\r') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 145;}

                        else s = 216;

                         
                        input.seek(index60_137);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA60_128 = input.LA(1);

                         
                        int index60_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA60_128>='\u0000' && LA60_128<='\u001F')||(LA60_128>='!' && LA60_128<='\uFFFF')) && (( percentIsFormat() ))) {s = 130;}

                        else s = 215;

                         
                        input.seek(index60_128);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA60_225 = input.LA(1);

                         
                        int index60_225 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_225=='{') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 224;}

                        else if ( ((LA60_225>='\u0000' && LA60_225<='\t')||(LA60_225>='\u000B' && LA60_225<='\f')||(LA60_225>='\u000E' && LA60_225<='&')||(LA60_225>='(' && LA60_225<='[')||(LA60_225>=']' && LA60_225<='z')||LA60_225=='|'||(LA60_225>='~' && LA60_225<='\uFFFF')) && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 225;}

                        else if ( (LA60_225=='\\') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 226;}

                        else if ( (LA60_225=='}') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 227;}

                        else if ( (LA60_225=='\'') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 228;}

                        else s = 295;

                         
                        input.seek(index60_225);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA60_296 = input.LA(1);

                         
                        int index60_296 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_296=='\'') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 228;}

                        else if ( (LA60_296=='\n'||LA60_296=='\r') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 353;}

                        else if ( ((LA60_296>='\u0000' && LA60_296<='\t')||(LA60_296>='\u000B' && LA60_296<='\f')||(LA60_296>='\u000E' && LA60_296<='&')||(LA60_296>='(' && LA60_296<='[')||(LA60_296>=']' && LA60_296<='z')||LA60_296=='|'||(LA60_296>='~' && LA60_296<='\uFFFF')) && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 225;}

                        else if ( (LA60_296=='\\') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 226;}

                        else if ( (LA60_296=='}') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 227;}

                        else if ( (LA60_296=='{') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 224;}

                        else s = 295;

                         
                        input.seek(index60_296);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA60_0 = input.LA(1);

                        s = -1;
                        if ( (LA60_0=='a') ) {s = 1;}

                        else if ( (LA60_0=='b') ) {s = 2;}

                        else if ( (LA60_0=='c') ) {s = 3;}

                        else if ( (LA60_0=='d') ) {s = 4;}

                        else if ( (LA60_0=='e') ) {s = 5;}

                        else if ( (LA60_0=='f') ) {s = 6;}

                        else if ( (LA60_0=='i') ) {s = 7;}

                        else if ( (LA60_0=='l') ) {s = 8;}

                        else if ( (LA60_0=='m') ) {s = 9;}

                        else if ( (LA60_0=='n') ) {s = 10;}

                        else if ( (LA60_0=='o') ) {s = 11;}

                        else if ( (LA60_0=='p') ) {s = 12;}

                        else if ( (LA60_0=='r') ) {s = 13;}

                        else if ( (LA60_0=='s') ) {s = 14;}

                        else if ( (LA60_0=='t') ) {s = 15;}

                        else if ( (LA60_0=='v') ) {s = 16;}

                        else if ( (LA60_0=='w') ) {s = 17;}

                        else if ( (LA60_0=='[') ) {s = 18;}

                        else if ( (LA60_0=='(') ) {s = 19;}

                        else if ( (LA60_0=='#') ) {s = 20;}

                        else if ( (LA60_0=='|') ) {s = 21;}

                        else if ( (LA60_0=='+') ) {s = 22;}

                        else if ( (LA60_0=='.') ) {s = 23;}

                        else if ( (LA60_0==')') ) {s = 24;}

                        else if ( (LA60_0==']') ) {s = 25;}

                        else if ( (LA60_0==';') ) {s = 26;}

                        else if ( (LA60_0==',') ) {s = 27;}

                        else if ( (LA60_0=='=') ) {s = 28;}

                        else if ( (LA60_0=='>') ) {s = 29;}

                        else if ( (LA60_0=='<') ) {s = 30;}

                        else if ( (LA60_0=='-') ) {s = 31;}

                        else if ( (LA60_0=='*') ) {s = 32;}

                        else if ( (LA60_0=='/') ) {s = 33;}

                        else if ( (LA60_0=='%') ) {s = 34;}

                        else if ( (LA60_0=='!') ) {s = 35;}

                        else if ( (LA60_0==':') ) {s = 36;}

                        else if ( (LA60_0=='?') ) {s = 37;}

                        else if ( ((LA60_0>='\t' && LA60_0<='\n')||(LA60_0>='\f' && LA60_0<='\r')||LA60_0==' ') ) {s = 38;}

                        else if ( (LA60_0=='\"') ) {s = 39;}

                        else if ( (LA60_0=='\'') ) {s = 40;}

                        else if ( (LA60_0=='{') ) {s = 41;}

                        else if ( (LA60_0=='}') ) {s = 42;}

                        else if ( (LA60_0=='0') ) {s = 43;}

                        else if ( ((LA60_0>='1' && LA60_0<='9')) ) {s = 44;}

                        else if ( (LA60_0=='$'||(LA60_0>='A' && LA60_0<='Z')||LA60_0=='_'||(LA60_0>='g' && LA60_0<='h')||(LA60_0>='j' && LA60_0<='k')||LA60_0=='q'||LA60_0=='u'||(LA60_0>='x' && LA60_0<='z')||(LA60_0>='\u00C0' && LA60_0<='\u00D6')||(LA60_0>='\u00D8' && LA60_0<='\u00F6')||(LA60_0>='\u00F8' && LA60_0<='\u1FFF')||(LA60_0>='\u3040' && LA60_0<='\u318F')||(LA60_0>='\u3300' && LA60_0<='\u337F')||(LA60_0>='\u3400' && LA60_0<='\u3D2D')||(LA60_0>='\u4E00' && LA60_0<='\u9FFF')||(LA60_0>='\uF900' && LA60_0<='\uFAFF')) ) {s = 45;}

                        else if ( ((LA60_0>='\u0000' && LA60_0<='\b')||LA60_0=='\u000B'||(LA60_0>='\u000E' && LA60_0<='\u001F')||LA60_0=='&'||LA60_0=='@'||LA60_0=='\\'||LA60_0=='^'||LA60_0=='`'||(LA60_0>='~' && LA60_0<='\u00BF')||LA60_0=='\u00D7'||LA60_0=='\u00F7'||(LA60_0>='\u2000' && LA60_0<='\u303F')||(LA60_0>='\u3190' && LA60_0<='\u32FF')||(LA60_0>='\u3380' && LA60_0<='\u33FF')||(LA60_0>='\u3D2E' && LA60_0<='\u4DFF')||(LA60_0>='\uA000' && LA60_0<='\uF8FF')||(LA60_0>='\uFB00' && LA60_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA60_34 = input.LA(1);

                         
                        int index60_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_34=='=') ) {s = 128;}

                        else if ( ((LA60_34>='\u0000' && LA60_34<='\u001F')||(LA60_34>='!' && LA60_34<='<')||(LA60_34>='>' && LA60_34<='\uFFFF')) && (( percentIsFormat() ))) {s = 130;}

                        else s = 129;

                         
                        input.seek(index60_34);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA60_222 = input.LA(1);

                         
                        int index60_222 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_222=='\"') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 223;}

                        else if ( ((LA60_222>='\u0000' && LA60_222<='\t')||(LA60_222>='\u000B' && LA60_222<='\f')||(LA60_222>='\u000E' && LA60_222<='!')||(LA60_222>='#' && LA60_222<='[')||(LA60_222>=']' && LA60_222<='z')||LA60_222=='|'||(LA60_222>='~' && LA60_222<='\uFFFF')) && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 220;}

                        else if ( (LA60_222=='\\') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 221;}

                        else if ( (LA60_222=='}') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 222;}

                        else if ( (LA60_222=='{') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 219;}

                        else s = 293;

                         
                        input.seek(index60_222);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA60_221 = input.LA(1);

                         
                        int index60_221 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA60_221>='\u0000' && LA60_221<='\uFFFF')) && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 294;}

                         
                        input.seek(index60_221);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA60_215 = input.LA(1);

                         
                        int index60_215 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( percentIsFormat() )))) ) {s = 292;}

                        else if ( (( percentIsFormat() )) ) {s = 130;}

                         
                        input.seek(index60_215);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA60_226 = input.LA(1);

                         
                        int index60_226 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA60_226>='\u0000' && LA60_226<='\uFFFF')) && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 296;}

                         
                        input.seek(index60_226);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA60_227 = input.LA(1);

                         
                        int index60_227 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_227=='{') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 224;}

                        else if ( ((LA60_227>='\u0000' && LA60_227<='\t')||(LA60_227>='\u000B' && LA60_227<='\f')||(LA60_227>='\u000E' && LA60_227<='&')||(LA60_227>='(' && LA60_227<='[')||(LA60_227>=']' && LA60_227<='z')||LA60_227=='|'||(LA60_227>='~' && LA60_227<='\uFFFF')) && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 225;}

                        else if ( (LA60_227=='\\') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 226;}

                        else if ( (LA60_227=='}') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 227;}

                        else if ( (LA60_227=='\'') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 228;}

                        else s = 295;

                         
                        input.seek(index60_227);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA60_142 = input.LA(1);

                         
                        int index60_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_142=='{') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 219;}

                        else if ( ((LA60_142>='\u0000' && LA60_142<='\t')||(LA60_142>='\u000B' && LA60_142<='\f')||(LA60_142>='\u000E' && LA60_142<='!')||(LA60_142>='#' && LA60_142<='[')||(LA60_142>=']' && LA60_142<='z')||LA60_142=='|'||(LA60_142>='~' && LA60_142<='\uFFFF')) && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 220;}

                        else if ( (LA60_142=='\\') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 221;}

                        else if ( (LA60_142=='}') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 222;}

                        else if ( (LA60_142=='\n'||LA60_142=='\r'||LA60_142=='\"') && (( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) {s = 223;}

                        else s = 216;

                         
                        input.seek(index60_142);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA60_143 = input.LA(1);

                         
                        int index60_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_143=='{') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 224;}

                        else if ( ((LA60_143>='\u0000' && LA60_143<='\t')||(LA60_143>='\u000B' && LA60_143<='\f')||(LA60_143>='\u000E' && LA60_143<='&')||(LA60_143>='(' && LA60_143<='[')||(LA60_143>=']' && LA60_143<='z')||LA60_143=='|'||(LA60_143>='~' && LA60_143<='\uFFFF')) && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 225;}

                        else if ( (LA60_143=='\\') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 226;}

                        else if ( (LA60_143=='}') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 227;}

                        else if ( (LA60_143=='\n'||LA60_143=='\r'||LA60_143=='\'') && (( rightBraceLikeQuote(SNG_QUOTE_CTX) ))) {s = 228;}

                        else s = 216;

                         
                        input.seek(index60_143);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA60_42 = input.LA(1);

                         
                        int index60_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA60_42>='\u0000' && LA60_42<='\t')||(LA60_42>='\u000B' && LA60_42<='\f')||(LA60_42>='\u000E' && LA60_42<='!')||(LA60_42>='#' && LA60_42<='&')||(LA60_42>='(' && LA60_42<='[')||(LA60_42>=']' && LA60_42<='z')||LA60_42=='|'||(LA60_42>='~' && LA60_42<='\uFFFF')) && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 137;}

                        else if ( (LA60_42=='\\') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 138;}

                        else if ( (LA60_42=='}') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 139;}

                        else if ( (LA60_42=='{') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 141;}

                        else if ( (LA60_42=='\'') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 142;}

                        else if ( (LA60_42=='\"') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 143;}

                        else if ( (LA60_42=='\n') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 144;}

                        else if ( (LA60_42=='\r') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 145;}

                        else s = 140;

                         
                        input.seek(index60_42);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA60_39 = input.LA(1);

                        s = -1;
                        if ( ((LA60_39>='\u0000' && LA60_39<='\uFFFF')) ) {s = 135;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA60_140 = input.LA(1);

                         
                        int index60_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) ))) ) {s = 216;}

                        else if ( (( !rightBraceLikeQuote(CUR_QUOTE_CTX) )) ) {s = 218;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index60_140);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA60_139 = input.LA(1);

                         
                        int index60_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_139=='\"') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 143;}

                        else if ( (LA60_139=='\n') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 144;}

                        else if ( (LA60_139=='\r') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 145;}

                        else if ( ((LA60_139>='\u0000' && LA60_139<='\t')||(LA60_139>='\u000B' && LA60_139<='\f')||(LA60_139>='\u000E' && LA60_139<='!')||(LA60_139>='#' && LA60_139<='&')||(LA60_139>='(' && LA60_139<='[')||(LA60_139>=']' && LA60_139<='z')||LA60_139=='|'||(LA60_139>='~' && LA60_139<='\uFFFF')) && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 137;}

                        else if ( (LA60_139=='\\') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 138;}

                        else if ( (LA60_139=='}') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 139;}

                        else if ( (LA60_139=='{') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 141;}

                        else if ( (LA60_139=='\'') && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 142;}

                        else s = 216;

                         
                        input.seek(index60_139);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA60_138 = input.LA(1);

                         
                        int index60_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA60_138>='\u0000' && LA60_138<='\uFFFF')) && ((( rightBraceLikeQuote(SNG_QUOTE_CTX) )||( rightBraceLikeQuote(DBL_QUOTE_CTX) )))) {s = 217;}

                         
                        input.seek(index60_138);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
