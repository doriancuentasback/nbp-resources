// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g 2012-11-12 11:37:08

    package com.sun.scenario.effect.compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSLLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int DEC=18;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int LT=8;
    public static final int RGBA_FIELDS=50;
    public static final int STAR=4;
    public static final int T__65=65;
    public static final int WHILE=41;
    public static final int LETTER=60;
    public static final int LEFT_BRACKET=25;
    public static final int LTEQ=10;
    public static final int DO=42;
    public static final int FOR=43;
    public static final int AND=14;
    public static final int EOF=-1;
    public static final int BOOLCONSTANT=55;
    public static final int BREAK=46;
    public static final int PLUSEQ=21;
    public static final int TYPE=56;
    public static final int IF=39;
    public static final int INC=17;
    public static final int RIGHT_PAREN=24;
    public static final int SLASH=5;
    public static final int CONTINUE=45;
    public static final int COMMA=32;
    public static final int IDENTIFIER=52;
    public static final int STAREQ=19;
    public static final int EQUAL=33;
    public static final int GLUE_BLOCK=57;
    public static final int RETURN=48;
    public static final int RIGHT_BRACKET=26;
    public static final int TILDE=35;
    public static final int PLUS=6;
    public static final int RFIELD=58;
    public static final int VOID=49;
    public static final int DIGIT=61;
    public static final int DOT=31;
    public static final int COMMENT=63;
    public static final int UNROLL=44;
    public static final int EQEQ=12;
    public static final int RIGHT_BRACE=28;
    public static final int XOR=15;
    public static final int DASH=7;
    public static final int LINE_COMMENT=64;
    public static final int ELSE=40;
    public static final int XYZW_FIELDS=51;
    public static final int BANG=34;
    public static final int SEMICOLON=38;
    public static final int SLASHEQ=20;
    public static final int GTEQ=11;
    public static final int RIGHT_FRENCH=30;
    public static final int DASHEQ=22;
    public static final int COLON=37;
    public static final int NEQ=13;
    public static final int INTCONSTANT=53;
    public static final int WS=62;
    public static final int QUESTION=36;
    public static final int DISCARD=47;
    public static final int FLOATCONSTANT=54;
    public static final int LEFT_BRACE=27;
    public static final int OR=16;
    public static final int LEFT_FRENCH=29;
    public static final int LEFT_PAREN=23;
    public static final int GT=9;
    public static final int XFIELD=59;

        // allow tests to turn on quiet mode, to reduce spewage
        public static boolean quiet;

        public void emitErrorMessage(String error) {
            if (quiet) return;
            super.emitErrorMessage(error);
        }


    // delegates
    // delegators

    public JSLLexer() {;} 
    public JSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g"; }

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:16:6: ( '*' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:16:8: '*'
            {
            match('*'); 

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
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:17:7: ( '/' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:17:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:18:6: ( '+' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:18:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "DASH"
    public final void mDASH() throws RecognitionException {
        try {
            int _type = DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:19:6: ( '-' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:19:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DASH"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:20:4: ( '<' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:20:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:21:4: ( '>' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:21:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:22:6: ( '<=' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:22:8: '<='
            {
            match("<="); 


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
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:23:6: ( '>=' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:23:8: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "EQEQ"
    public final void mEQEQ() throws RecognitionException {
        try {
            int _type = EQEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:24:6: ( '==' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:24:8: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQEQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:25:5: ( '!=' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:25:7: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:26:5: ( '&&' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:26:7: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:27:5: ( '^^' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:27:7: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:28:4: ( '||' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:28:6: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:29:5: ( '++' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:29:7: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:30:5: ( '--' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:30:7: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "STAREQ"
    public final void mSTAREQ() throws RecognitionException {
        try {
            int _type = STAREQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:31:8: ( '*=' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:31:10: '*='
            {
            match("*="); 


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
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:32:9: ( '/=' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:32:11: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASHEQ"

    // $ANTLR start "PLUSEQ"
    public final void mPLUSEQ() throws RecognitionException {
        try {
            int _type = PLUSEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:33:8: ( '+=' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:33:10: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSEQ"

    // $ANTLR start "DASHEQ"
    public final void mDASHEQ() throws RecognitionException {
        try {
            int _type = DASHEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:34:8: ( '-=' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:34:10: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DASHEQ"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:35:12: ( '(' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:35:14: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:36:13: ( ')' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:36:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "LEFT_BRACKET"
    public final void mLEFT_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:37:14: ( '[' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:37:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_BRACKET"

    // $ANTLR start "RIGHT_BRACKET"
    public final void mRIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:38:15: ( ']' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:38:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_BRACKET"

    // $ANTLR start "LEFT_BRACE"
    public final void mLEFT_BRACE() throws RecognitionException {
        try {
            int _type = LEFT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:39:12: ( '{' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:39:14: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_BRACE"

    // $ANTLR start "RIGHT_BRACE"
    public final void mRIGHT_BRACE() throws RecognitionException {
        try {
            int _type = RIGHT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:40:13: ( '}' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:40:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_BRACE"

    // $ANTLR start "LEFT_FRENCH"
    public final void mLEFT_FRENCH() throws RecognitionException {
        try {
            int _type = LEFT_FRENCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:41:13: ( '<<' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:41:15: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_FRENCH"

    // $ANTLR start "RIGHT_FRENCH"
    public final void mRIGHT_FRENCH() throws RecognitionException {
        try {
            int _type = RIGHT_FRENCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:42:14: ( '>>' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:42:16: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_FRENCH"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:43:5: ( '.' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:43:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:44:7: ( ',' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:44:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:45:7: ( '=' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:45:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "BANG"
    public final void mBANG() throws RecognitionException {
        try {
            int _type = BANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:46:6: ( '!' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:46:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BANG"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:47:7: ( '~' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:47:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:48:10: ( '?' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:48:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:49:7: ( ':' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:49:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:50:11: ( ';' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:50:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:51:4: ( 'if' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:51:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:52:6: ( 'else' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:52:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:53:7: ( 'while' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:53:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:54:4: ( 'do' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:54:6: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:55:5: ( 'for' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:55:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "UNROLL"
    public final void mUNROLL() throws RecognitionException {
        try {
            int _type = UNROLL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:56:8: ( 'unroll' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:56:10: 'unroll'
            {
            match("unroll"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNROLL"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:57:10: ( 'continue' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:57:12: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:58:7: ( 'break' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:58:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "DISCARD"
    public final void mDISCARD() throws RecognitionException {
        try {
            int _type = DISCARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:59:9: ( 'discard' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:59:11: 'discard'
            {
            match("discard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISCARD"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:60:8: ( 'return' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:60:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:61:6: ( 'void' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:61:8: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:62:7: ( 'const' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:62:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:63:7: ( 'param' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:63:9: 'param'
            {
            match("param"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:64:7: ( 'lowp' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:64:9: 'lowp'
            {
            match("lowp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:65:7: ( 'mediump' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:65:9: 'mediump'
            {
            match("mediump"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:66:7: ( 'highp' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:66:9: 'highp'
            {
            match("highp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:585:9: ( 'float2' | 'float3' | 'float4' | 'float' | 'int2' | 'int3' | 'int4' | 'int' | 'bool2' | 'bool3' | 'bool4' | 'bool' | 'sampler' | 'lsampler' | 'fsampler' )
            int alt1=15;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:585:11: 'float2'
                    {
                    match("float2"); 


                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:586:11: 'float3'
                    {
                    match("float3"); 


                    }
                    break;
                case 3 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:587:11: 'float4'
                    {
                    match("float4"); 


                    }
                    break;
                case 4 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:588:11: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 5 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:589:11: 'int2'
                    {
                    match("int2"); 


                    }
                    break;
                case 6 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:590:11: 'int3'
                    {
                    match("int3"); 


                    }
                    break;
                case 7 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:591:11: 'int4'
                    {
                    match("int4"); 


                    }
                    break;
                case 8 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:592:11: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 9 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:593:11: 'bool2'
                    {
                    match("bool2"); 


                    }
                    break;
                case 10 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:594:11: 'bool3'
                    {
                    match("bool3"); 


                    }
                    break;
                case 11 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:595:11: 'bool4'
                    {
                    match("bool4"); 


                    }
                    break;
                case 12 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:596:11: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 13 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:597:11: 'sampler'
                    {
                    match("sampler"); 


                    }
                    break;
                case 14 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:598:11: 'lsampler'
                    {
                    match("lsampler"); 


                    }
                    break;
                case 15 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:599:11: 'fsampler'
                    {
                    match("fsampler"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "BOOLCONSTANT"
    public final void mBOOLCONSTANT() throws RecognitionException {
        try {
            int _type = BOOLCONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:603:9: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:603:11: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:604:11: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLCONSTANT"

    // $ANTLR start "RGBA_FIELDS"
    public final void mRGBA_FIELDS() throws RecognitionException {
        try {
            int _type = RGBA_FIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:608:9: ( DOT RFIELD RFIELD RFIELD RFIELD | DOT RFIELD RFIELD RFIELD | DOT RFIELD RFIELD | DOT RFIELD )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>='a' && LA3_1<='b')||LA3_1=='g'||LA3_1=='r') ) {
                    int LA3_2 = input.LA(3);

                    if ( ((LA3_2>='a' && LA3_2<='b')||LA3_2=='g'||LA3_2=='r') ) {
                        int LA3_4 = input.LA(4);

                        if ( ((LA3_4>='a' && LA3_4<='b')||LA3_4=='g'||LA3_4=='r') ) {
                            int LA3_6 = input.LA(5);

                            if ( ((LA3_6>='a' && LA3_6<='b')||LA3_6=='g'||LA3_6=='r') ) {
                                alt3=1;
                            }
                            else {
                                alt3=2;}
                        }
                        else {
                            alt3=3;}
                    }
                    else {
                        alt3=4;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:608:11: DOT RFIELD RFIELD RFIELD RFIELD
                    {
                    mDOT(); 
                    mRFIELD(); 
                    mRFIELD(); 
                    mRFIELD(); 
                    mRFIELD(); 

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:609:11: DOT RFIELD RFIELD RFIELD
                    {
                    mDOT(); 
                    mRFIELD(); 
                    mRFIELD(); 
                    mRFIELD(); 

                    }
                    break;
                case 3 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:610:11: DOT RFIELD RFIELD
                    {
                    mDOT(); 
                    mRFIELD(); 
                    mRFIELD(); 

                    }
                    break;
                case 4 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:611:11: DOT RFIELD
                    {
                    mDOT(); 
                    mRFIELD(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RGBA_FIELDS"

    // $ANTLR start "RFIELD"
    public final void mRFIELD() throws RecognitionException {
        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:615:10: ( 'r' | 'g' | 'b' | 'a' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='b')||input.LA(1)=='g'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RFIELD"

    // $ANTLR start "XYZW_FIELDS"
    public final void mXYZW_FIELDS() throws RecognitionException {
        try {
            int _type = XYZW_FIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:618:9: ( DOT XFIELD XFIELD XFIELD XFIELD | DOT XFIELD XFIELD XFIELD | DOT XFIELD XFIELD | DOT XFIELD )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>='w' && LA4_1<='z')) ) {
                    int LA4_2 = input.LA(3);

                    if ( ((LA4_2>='w' && LA4_2<='z')) ) {
                        int LA4_4 = input.LA(4);

                        if ( ((LA4_4>='w' && LA4_4<='z')) ) {
                            int LA4_6 = input.LA(5);

                            if ( ((LA4_6>='w' && LA4_6<='z')) ) {
                                alt4=1;
                            }
                            else {
                                alt4=2;}
                        }
                        else {
                            alt4=3;}
                    }
                    else {
                        alt4=4;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:618:11: DOT XFIELD XFIELD XFIELD XFIELD
                    {
                    mDOT(); 
                    mXFIELD(); 
                    mXFIELD(); 
                    mXFIELD(); 
                    mXFIELD(); 

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:619:11: DOT XFIELD XFIELD XFIELD
                    {
                    mDOT(); 
                    mXFIELD(); 
                    mXFIELD(); 
                    mXFIELD(); 

                    }
                    break;
                case 3 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:620:11: DOT XFIELD XFIELD
                    {
                    mDOT(); 
                    mXFIELD(); 
                    mXFIELD(); 

                    }
                    break;
                case 4 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:621:11: DOT XFIELD
                    {
                    mDOT(); 
                    mXFIELD(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XYZW_FIELDS"

    // $ANTLR start "XFIELD"
    public final void mXFIELD() throws RecognitionException {
        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:625:10: ( 'x' | 'y' | 'z' | 'w' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:
            {
            if ( (input.LA(1)>='w' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "XFIELD"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:628:9: ( LETTER ( LETTER | DIGIT )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:628:11: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:628:18: ( LETTER | DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='$'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:633:9: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "INTCONSTANT"
    public final void mINTCONSTANT() throws RecognitionException {
        try {
            int _type = INTCONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:639:13: ( ( '0' | '1' .. '9' ( DIGIT )* ) )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:639:15: ( '0' | '1' .. '9' ( DIGIT )* )
            {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:639:15: ( '0' | '1' .. '9' ( DIGIT )* )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='0') ) {
                alt7=1;
            }
            else if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:639:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:639:22: '1' .. '9' ( DIGIT )*
                    {
                    matchRange('1','9'); 
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:639:31: ( DIGIT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:639:31: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTCONSTANT"

    // $ANTLR start "FLOATCONSTANT"
    public final void mFLOATCONSTANT() throws RecognitionException {
        try {
            int _type = FLOATCONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:642:9: ( ( DIGIT )+ '.' ( DIGIT )* | '.' ( DIGIT )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                alt11=1;
            }
            else if ( (LA11_0=='.') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:642:11: ( DIGIT )+ '.' ( DIGIT )*
                    {
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:642:11: ( DIGIT )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:642:11: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    match('.'); 
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:642:22: ( DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:642:22: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:643:12: '.' ( DIGIT )+
                    {
                    match('.'); 
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:643:16: ( DIGIT )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:643:16: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOATCONSTANT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:647:9: ( '0' .. '9' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:647:11: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:649:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:649:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:653:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:653:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:653:14: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:653:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:657:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:657:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:657:12: (~ ( '\\n' | '\\r' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:657:12: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:657:26: ( '\\r' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:657:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "GLUE_BLOCK"
    public final void mGLUE_BLOCK() throws RecognitionException {
        try {
            int _type = GLUE_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:661:5: ( LEFT_FRENCH ( . )* RIGHT_FRENCH )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:661:7: LEFT_FRENCH ( . )* RIGHT_FRENCH
            {
            mLEFT_FRENCH(); 
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:661:19: ( . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='>') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='>') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='=')||(LA15_1>='?' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='=')||(LA15_0>='?' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:661:19: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            mRIGHT_FRENCH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GLUE_BLOCK"

    public void mTokens() throws RecognitionException {
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:8: ( STAR | SLASH | PLUS | DASH | LT | GT | LTEQ | GTEQ | EQEQ | NEQ | AND | XOR | OR | INC | DEC | STAREQ | SLASHEQ | PLUSEQ | DASHEQ | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_BRACE | RIGHT_BRACE | LEFT_FRENCH | RIGHT_FRENCH | DOT | COMMA | EQUAL | BANG | TILDE | QUESTION | COLON | SEMICOLON | IF | ELSE | WHILE | DO | FOR | UNROLL | CONTINUE | BREAK | DISCARD | RETURN | VOID | T__65 | T__66 | T__67 | T__68 | T__69 | TYPE | BOOLCONSTANT | RGBA_FIELDS | XYZW_FIELDS | IDENTIFIER | INTCONSTANT | FLOATCONSTANT | WS | COMMENT | LINE_COMMENT | GLUE_BLOCK )
        int alt16=62;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:10: STAR
                {
                mSTAR(); 

                }
                break;
            case 2 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:15: SLASH
                {
                mSLASH(); 

                }
                break;
            case 3 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:21: PLUS
                {
                mPLUS(); 

                }
                break;
            case 4 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:26: DASH
                {
                mDASH(); 

                }
                break;
            case 5 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:31: LT
                {
                mLT(); 

                }
                break;
            case 6 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:34: GT
                {
                mGT(); 

                }
                break;
            case 7 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:37: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 8 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:42: GTEQ
                {
                mGTEQ(); 

                }
                break;
            case 9 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:47: EQEQ
                {
                mEQEQ(); 

                }
                break;
            case 10 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:52: NEQ
                {
                mNEQ(); 

                }
                break;
            case 11 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:56: AND
                {
                mAND(); 

                }
                break;
            case 12 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:60: XOR
                {
                mXOR(); 

                }
                break;
            case 13 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:64: OR
                {
                mOR(); 

                }
                break;
            case 14 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:67: INC
                {
                mINC(); 

                }
                break;
            case 15 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:71: DEC
                {
                mDEC(); 

                }
                break;
            case 16 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:75: STAREQ
                {
                mSTAREQ(); 

                }
                break;
            case 17 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:82: SLASHEQ
                {
                mSLASHEQ(); 

                }
                break;
            case 18 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:90: PLUSEQ
                {
                mPLUSEQ(); 

                }
                break;
            case 19 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:97: DASHEQ
                {
                mDASHEQ(); 

                }
                break;
            case 20 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:104: LEFT_PAREN
                {
                mLEFT_PAREN(); 

                }
                break;
            case 21 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:115: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 

                }
                break;
            case 22 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:127: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 

                }
                break;
            case 23 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:140: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 

                }
                break;
            case 24 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:154: LEFT_BRACE
                {
                mLEFT_BRACE(); 

                }
                break;
            case 25 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:165: RIGHT_BRACE
                {
                mRIGHT_BRACE(); 

                }
                break;
            case 26 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:177: LEFT_FRENCH
                {
                mLEFT_FRENCH(); 

                }
                break;
            case 27 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:189: RIGHT_FRENCH
                {
                mRIGHT_FRENCH(); 

                }
                break;
            case 28 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:202: DOT
                {
                mDOT(); 

                }
                break;
            case 29 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:206: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 30 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:212: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 31 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:218: BANG
                {
                mBANG(); 

                }
                break;
            case 32 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:223: TILDE
                {
                mTILDE(); 

                }
                break;
            case 33 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:229: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 34 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:238: COLON
                {
                mCOLON(); 

                }
                break;
            case 35 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:244: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 36 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:254: IF
                {
                mIF(); 

                }
                break;
            case 37 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:257: ELSE
                {
                mELSE(); 

                }
                break;
            case 38 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:262: WHILE
                {
                mWHILE(); 

                }
                break;
            case 39 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:268: DO
                {
                mDO(); 

                }
                break;
            case 40 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:271: FOR
                {
                mFOR(); 

                }
                break;
            case 41 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:275: UNROLL
                {
                mUNROLL(); 

                }
                break;
            case 42 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:282: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 43 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:291: BREAK
                {
                mBREAK(); 

                }
                break;
            case 44 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:297: DISCARD
                {
                mDISCARD(); 

                }
                break;
            case 45 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:305: RETURN
                {
                mRETURN(); 

                }
                break;
            case 46 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:312: VOID
                {
                mVOID(); 

                }
                break;
            case 47 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:317: T__65
                {
                mT__65(); 

                }
                break;
            case 48 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:323: T__66
                {
                mT__66(); 

                }
                break;
            case 49 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:329: T__67
                {
                mT__67(); 

                }
                break;
            case 50 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:335: T__68
                {
                mT__68(); 

                }
                break;
            case 51 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:341: T__69
                {
                mT__69(); 

                }
                break;
            case 52 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:347: TYPE
                {
                mTYPE(); 

                }
                break;
            case 53 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:352: BOOLCONSTANT
                {
                mBOOLCONSTANT(); 

                }
                break;
            case 54 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:365: RGBA_FIELDS
                {
                mRGBA_FIELDS(); 

                }
                break;
            case 55 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:377: XYZW_FIELDS
                {
                mXYZW_FIELDS(); 

                }
                break;
            case 56 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:389: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 57 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:400: INTCONSTANT
                {
                mINTCONSTANT(); 

                }
                break;
            case 58 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:412: FLOATCONSTANT
                {
                mFLOATCONSTANT(); 

                }
                break;
            case 59 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:426: WS
                {
                mWS(); 

                }
                break;
            case 60 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:429: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 61 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:437: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 62 :
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:1:450: GLUE_BLOCK
                {
                mGLUE_BLOCK(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA1_eotS =
        "\13\uffff\1\21\6\uffff\1\27\1\33\10\uffff";
    static final String DFA1_eofS =
        "\34\uffff";
    static final String DFA1_minS =
        "\1\142\1\154\1\156\1\157\2\uffff\1\157\1\uffff\1\164\1\157\1\141"+
        "\1\62\1\154\1\164\4\uffff\2\62\10\uffff";
    static final String DFA1_maxS =
        "\2\163\1\156\1\157\2\uffff\1\157\1\uffff\1\164\1\157\1\141\1\64"+
        "\1\154\1\164\4\uffff\2\64\10\uffff";
    static final String DFA1_acceptS =
        "\4\uffff\1\15\1\16\1\uffff\1\17\6\uffff\1\5\1\6\1\7\1\10\2\uffff"+
        "\1\11\1\12\1\13\1\14\1\1\1\2\1\3\1\4";
    static final String DFA1_specialS =
        "\34\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\3\uffff\1\1\2\uffff\1\2\2\uffff\1\5\6\uffff\1\4",
            "\1\6\6\uffff\1\7",
            "\1\10",
            "\1\11",
            "",
            "",
            "\1\12",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16\1\17\1\20",
            "\1\22",
            "\1\23",
            "",
            "",
            "",
            "",
            "\1\24\1\25\1\26",
            "\1\30\1\31\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "584:1: TYPE : ( 'float2' | 'float3' | 'float4' | 'float' | 'int2' | 'int3' | 'int4' | 'int' | 'bool2' | 'bool3' | 'bool4' | 'bool' | 'sampler' | 'lsampler' | 'fsampler' );";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\1\55\1\61\1\64\1\67\1\72\1\75\1\77\1\101\11\uffff\1\102"+
        "\5\uffff\20\50\1\uffff\2\135\16\uffff\1\137\14\uffff\1\141\3\50"+
        "\1\145\22\50\1\uffff\1\135\3\uffff\1\173\2\50\1\uffff\1\50\1\177"+
        "\20\50\3\173\1\uffff\1\u0091\2\50\1\uffff\7\50\1\173\1\50\1\u009f"+
        "\1\50\1\u00a1\4\50\1\u00a6\1\uffff\1\u00a7\1\50\1\173\1\50\1\u00a6"+
        "\2\50\1\u00af\1\u00b0\3\173\1\50\1\uffff\1\u00b2\1\uffff\2\50\1"+
        "\u00b5\1\50\2\uffff\1\50\3\173\1\50\1\u00b9\1\50\2\uffff\1\u00bb"+
        "\1\uffff\2\50\1\uffff\1\50\1\u00bf\1\50\1\uffff\1\50\1\uffff\1\50"+
        "\1\u00c3\1\173\1\uffff\1\173\1\u00c4\1\173\2\uffff";
    static final String DFA16_eofS =
        "\u00c5\uffff";
    static final String DFA16_minS =
        "\1\11\1\75\1\52\1\53\1\55\1\74\3\75\11\uffff\1\60\5\uffff\1\146"+
        "\1\154\1\150\1\151\1\141\1\156\2\157\1\145\1\157\1\141\1\157\1\145"+
        "\1\151\1\141\1\162\1\uffff\2\56\16\uffff\1\0\14\uffff\1\44\1\164"+
        "\1\163\1\151\1\44\1\163\1\162\1\157\1\141\1\154\1\162\1\156\1\145"+
        "\1\157\1\164\1\151\1\162\1\167\1\141\1\144\1\147\1\155\1\165\1\uffff"+
        "\1\56\3\uffff\1\44\1\145\1\154\1\uffff\1\143\1\44\1\141\1\155\1"+
        "\163\1\157\1\163\1\141\1\154\1\165\1\144\1\141\1\160\1\155\1\151"+
        "\1\150\1\160\1\145\3\44\1\uffff\1\44\1\145\1\141\1\uffff\1\164\1"+
        "\160\1\145\1\154\1\151\1\164\1\153\1\44\1\162\1\44\1\155\1\44\1"+
        "\160\1\165\1\160\1\154\1\44\1\uffff\1\44\1\162\1\44\1\154\1\44\1"+
        "\154\1\156\5\44\1\156\1\uffff\1\44\1\uffff\1\154\1\155\1\44\1\145"+
        "\2\uffff\1\144\3\44\1\145\1\44\1\165\2\uffff\1\44\1\uffff\1\145"+
        "\1\160\1\uffff\1\162\1\44\1\162\1\uffff\1\145\1\uffff\1\162\2\44"+
        "\1\uffff\3\44\2\uffff";
    static final String DFA16_maxS =
        "\1\176\5\75\1\76\2\75\11\uffff\1\172\5\uffff\1\156\1\154\1\150\1"+
        "\157\1\163\1\156\1\157\1\162\1\145\1\157\1\141\1\163\1\145\1\151"+
        "\1\141\1\162\1\uffff\2\71\16\uffff\1\uffff\14\uffff\1\172\1\164"+
        "\1\163\1\151\1\172\1\163\1\162\1\157\1\141\1\154\1\162\1\156\1\145"+
        "\1\157\1\164\1\151\1\162\1\167\1\141\1\144\1\147\1\155\1\165\1\uffff"+
        "\1\71\3\uffff\1\172\1\145\1\154\1\uffff\1\143\1\172\1\141\1\155"+
        "\1\163\1\157\1\164\1\141\1\154\1\165\1\144\1\141\1\160\1\155\1\151"+
        "\1\150\1\160\1\145\3\172\1\uffff\1\172\1\145\1\141\1\uffff\1\164"+
        "\1\160\1\145\1\154\1\151\1\164\1\153\1\172\1\162\1\172\1\155\1\172"+
        "\1\160\1\165\1\160\1\154\1\172\1\uffff\1\172\1\162\1\172\1\154\1"+
        "\172\1\154\1\156\5\172\1\156\1\uffff\1\172\1\uffff\1\154\1\155\1"+
        "\172\1\145\2\uffff\1\144\3\172\1\145\1\172\1\165\2\uffff\1\172\1"+
        "\uffff\1\145\1\160\1\uffff\1\162\1\172\1\162\1\uffff\1\145\1\uffff"+
        "\1\162\2\172\1\uffff\3\172\2\uffff";
    static final String DFA16_acceptS =
        "\11\uffff\1\13\1\14\1\15\1\24\1\25\1\26\1\27\1\30\1\31\1\uffff\1"+
        "\35\1\40\1\41\1\42\1\43\20\uffff\1\70\2\uffff\1\73\1\20\1\1\1\21"+
        "\1\74\1\75\1\2\1\16\1\22\1\3\1\17\1\23\1\4\1\7\1\uffff\1\5\1\10"+
        "\1\33\1\6\1\11\1\36\1\12\1\37\1\34\1\67\1\66\1\72\27\uffff\1\71"+
        "\1\uffff\1\32\1\76\1\44\3\uffff\1\47\25\uffff\1\64\3\uffff\1\50"+
        "\21\uffff\1\45\15\uffff\1\56\1\uffff\1\61\4\uffff\1\65\1\46\7\uffff"+
        "\1\57\1\53\1\uffff\1\60\2\uffff\1\63\3\uffff\1\51\1\uffff\1\55\3"+
        "\uffff\1\54\3\uffff\1\62\1\52";
    static final String DFA16_specialS =
        "\71\uffff\1\0\u008b\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\53\1\uffff\2\53\22\uffff\1\53\1\10\2\uffff\1\50\1\uffff\1"+
            "\11\1\uffff\1\14\1\15\1\1\1\3\1\23\1\4\1\22\1\2\1\51\11\52\1"+
            "\26\1\27\1\5\1\7\1\6\1\25\1\uffff\32\50\1\16\1\uffff\1\17\1"+
            "\12\1\50\1\uffff\1\50\1\37\1\36\1\33\1\31\1\34\1\50\1\45\1\30"+
            "\2\50\1\43\1\44\2\50\1\42\1\50\1\40\1\46\1\47\1\35\1\41\1\32"+
            "\3\50\1\20\1\13\1\21\1\24",
            "\1\54",
            "\1\57\4\uffff\1\60\15\uffff\1\56",
            "\1\62\21\uffff\1\63",
            "\1\65\17\uffff\1\66",
            "\1\71\1\70",
            "\1\73\1\74",
            "\1\76",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\105\47\uffff\2\104\4\uffff\1\104\12\uffff\1\104\4\uffff"+
            "\4\103",
            "",
            "",
            "",
            "",
            "",
            "\1\106\7\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\113\5\uffff\1\112",
            "\1\117\12\uffff\1\115\2\uffff\1\114\3\uffff\1\116",
            "\1\120",
            "\1\121",
            "\1\123\2\uffff\1\122",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127\3\uffff\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\105\1\uffff\12\105",
            "\1\105\1\uffff\12\136",
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
            "\0\140",
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
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\105\1\uffff\12\136",
            "",
            "",
            "",
            "\1\50\13\uffff\2\50\1\170\1\171\1\172\5\50\7\uffff\32\50\4"+
            "\uffff\1\50\1\uffff\32\50",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\1\u0084",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\50\13\uffff\2\50\1\u009b\1\u009c\1\u009d\5\50\7\uffff\32"+
            "\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009e",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00a0",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00a8",
            "\1\50\13\uffff\2\50\1\u00a9\1\u00aa\1\u00ab\5\50\7\uffff\32"+
            "\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ac",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00ad",
            "\1\u00ae",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00b1",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00b6",
            "",
            "",
            "\1\u00b7",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00b8",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00ba",
            "",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( STAR | SLASH | PLUS | DASH | LT | GT | LTEQ | GTEQ | EQEQ | NEQ | AND | XOR | OR | INC | DEC | STAREQ | SLASHEQ | PLUSEQ | DASHEQ | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_BRACE | RIGHT_BRACE | LEFT_FRENCH | RIGHT_FRENCH | DOT | COMMA | EQUAL | BANG | TILDE | QUESTION | COLON | SEMICOLON | IF | ELSE | WHILE | DO | FOR | UNROLL | CONTINUE | BREAK | DISCARD | RETURN | VOID | T__65 | T__66 | T__67 | T__68 | T__69 | TYPE | BOOLCONSTANT | RGBA_FIELDS | XYZW_FIELDS | IDENTIFIER | INTCONSTANT | FLOATCONSTANT | WS | COMMENT | LINE_COMMENT | GLUE_BLOCK );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_57 = input.LA(1);

                        s = -1;
                        if ( ((LA16_57>='\u0000' && LA16_57<='\uFFFF')) ) {s = 96;}

                        else s = 95;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}