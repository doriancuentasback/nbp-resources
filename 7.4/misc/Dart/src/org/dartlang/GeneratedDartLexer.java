// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g 2013-11-04 14:58:07
package org.dartlang;

import org.antlr.runtime.*;

public class GeneratedDartLexer extends Lexer {

    public static final int CLASS = 5;
    public static final int WHILE = 25;
    public static final int CONST = 6;
    public static final int PART = 20;
    public static final int NEW = 18;
    public static final int FOR = 13;
    public static final int DO = 9;
    public static final int LIBRARY = 17;
    public static final int ID = 27;
    public static final int EOF = -1;
    public static final int BREAK = 4;
    public static final int IF = 14;
    public static final int T__55 = 55;
    public static final int ML_COMMENT = 31;
    public static final int FINAL = 12;
    public static final int IMPORT = 15;
    public static final int T__51 = 51;
    public static final int T__52 = 52;
    public static final int IN = 16;
    public static final int T__53 = 53;
    public static final int T__54 = 54;
    public static final int CONTINUE = 7;
    public static final int RETURN = 21;
    public static final int VOID = 24;
    public static final int COMMENT = 30;
    public static final int T__50 = 50;
    public static final int T__42 = 42;
    public static final int T__43 = 43;
    public static final int T__40 = 40;
    public static final int T__41 = 41;
    public static final int T__46 = 46;
    public static final int T__47 = 47;
    public static final int T__44 = 44;
    public static final int T__45 = 45;
    public static final int STATIC = 22;
    public static final int T__48 = 48;
    public static final int T__49 = 49;
    public static final int NULL = 19;
    public static final int DEFAULT = 8;
    public static final int ELSE = 10;
    public static final int WHITESPACE = 29;
    public static final int INT = 26;
    public static final int TRUE = 23;
    public static final int T__32 = 32;
    public static final int T__33 = 33;
    public static final int T__34 = 34;
    public static final int T__35 = 35;
    public static final int T__36 = 36;
    public static final int T__37 = 37;
    public static final int T__38 = 38;
    public static final int T__39 = 39;
    public static final int FALSE = 11;
    public static final int STRING = 28;

    // delegates
    // delegators
    public GeneratedDartLexer() {;
    }

    public GeneratedDartLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public GeneratedDartLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);

    }

    public String getGrammarFileName() {
        return "/home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g";
    }

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:7:7: ( 'break' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:7:9: 'break'
            {
                match("break");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:8:7: ( 'class' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:8:9: 'class'
            {
                match("class");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:9:7: ( 'const' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:9:9: 'const'
            {
                match("const");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:10:10: ( 'continue' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:10:12: 'continue'
            {
                match("continue");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:11:9: ( 'default' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:11:11: 'default'
            {
                match("default");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:12:4: ( 'do' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:12:6: 'do'
            {
                match("do");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:13:6: ( 'else' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:13:8: 'else'
            {
                match("else");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:14:7: ( 'false' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:14:9: 'false'
            {
                match("false");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FINAL"
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:15:7: ( 'final' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:15:9: 'final'
            {
                match("final");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "FINAL"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:16:5: ( 'for' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:16:7: 'for'
            {
                match("for");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:17:4: ( 'if' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:17:6: 'if'
            {
                match("if");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:18:8: ( 'import' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:18:10: 'import'
            {
                match("import");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:19:4: ( 'in' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:19:6: 'in'
            {
                match("in");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "LIBRARY"
    public final void mLIBRARY() throws RecognitionException {
        try {
            int _type = LIBRARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:20:9: ( 'library' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:20:11: 'library'
            {
                match("library");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "LIBRARY"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:21:5: ( 'new' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:21:7: 'new'
            {
                match("new");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:22:6: ( 'null' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:22:8: 'null'
            {
                match("null");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "PART"
    public final void mPART() throws RecognitionException {
        try {
            int _type = PART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:23:6: ( 'part' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:23:8: 'part'
            {
                match("part");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "PART"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:24:8: ( 'return' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:24:10: 'return'
            {
                match("return");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:25:8: ( 'static' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:25:10: 'static'
            {
                match("static");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:26:6: ( 'true' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:26:8: 'true'
            {
                match("true");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:27:6: ( 'void' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:27:8: 'void'
            {
                match("void");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:28:7: ( 'while' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:28:9: 'while'
            {
                match("while");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:29:7: ( '(' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:29:9: '('
            {
                match('(');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:30:7: ( ')' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:30:9: ')'
            {
                match(')');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:31:7: ( ',' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:31:9: ','
            {
                match(',');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:32:7: ( ';' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:32:9: ';'
            {
                match(';');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:33:7: ( '=' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:33:9: '='
            {
                match('=');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:34:7: ( '{' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:34:9: '{'
            {
                match('{');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:35:7: ( '}' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:35:9: '}'
            {
                match('}');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:36:7: ( '||' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:36:9: '||'
            {
                match("||");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:37:7: ( '&&' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:37:9: '&&'
            {
                match("&&");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:38:7: ( '|' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:38:9: '|'
            {
                match('|');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:39:7: ( '^' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:39:9: '^'
            {
                match('^');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:40:7: ( '&' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:40:9: '&'
            {
                match('&');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:41:7: ( '+' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:41:9: '+'
            {
                match('+');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:42:7: ( '-' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:42:9: '-'
            {
                match('-');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:43:7: ( '*' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:43:9: '*'
            {
                match('*');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:44:7: ( '/' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:44:9: '/'
            {
                match('/');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:45:7: ( '%' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:45:9: '%'
            {
                match('%');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:46:7: ( '~/' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:46:9: '~/'
            {
                match("~/");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:47:7: ( '<<' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:47:9: '<<'
            {
                match("<<");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:48:7: ( '>' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:48:9: '>'
            {
                match('>');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:49:7: ( '==' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:49:9: '=='
            {
                match("==");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:50:7: ( '!=' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:50:9: '!='
            {
                match("!=");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:51:7: ( '===' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:51:9: '==='
            {
                match("===");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:52:7: ( '!==' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:52:9: '!=='
            {
                match("!==");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:45:5: ( ( '0' .. '9' )+ )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:45:7: ( '0' .. '9' )+
            {
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:45:7: ( '0' .. '9' )+
                int cnt1 = 0;
                loop1:
                do {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);

                    if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
                        alt1 = 1;
                    }

                    switch (alt1) {
                        case 1: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:45:7: '0' .. '9'
                        {
                            matchRange('0', '9');

                        }
                        break;

                        default:
                            if (cnt1 >= 1) {
                                break loop1;
                            }
                            EarlyExitException eee
                                    = new EarlyExitException(1, input);
                            throw eee;
                    }
                    cnt1++;
                } while (true);

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:46:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:46:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();

                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }

                // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:46:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
                loop2:
                do {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);

                    if (((LA2_0 >= '0' && LA2_0 <= '9') || (LA2_0 >= 'A' && LA2_0 <= 'Z') || (LA2_0 >= 'a' && LA2_0 <= 'z'))) {
                        alt2 = 1;
                    }

                    switch (alt2) {
                        case 1: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();

                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }

                        }
                        break;

                        default:
                            break loop2;
                    }
                } while (true);

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:47:8: ( '\\\"' ( options {greedy=false; } : . )* '\\\"' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:47:10: '\\\"' ( options {greedy=false; } : . )* '\\\"'
            {
                match('\"');
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:47:15: ( options {greedy=false; } : . )*
                loop3:
                do {
                    int alt3 = 2;
                    int LA3_0 = input.LA(1);

                    if ((LA3_0 == '\"')) {
                        alt3 = 2;
                    } else if (((LA3_0 >= '\u0000' && LA3_0 <= '!') || (LA3_0 >= '#' && LA3_0 <= '\uFFFF'))) {
                        alt3 = 1;
                    }

                    switch (alt3) {
                        case 1: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:47:42: .
                        {
                            matchAny();

                        }
                        break;

                        default:
                            break loop3;
                    }
                } while (true);

                match('\"');
                setText(getText().substring(1, getText().length() - 1));

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:48:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:48:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
                // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:48:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
                int cnt4 = 0;
                loop4:
                do {
                    int alt4 = 2;
                    int LA4_0 = input.LA(1);

                    if (((LA4_0 >= '\t' && LA4_0 <= '\n') || (LA4_0 >= '\f' && LA4_0 <= '\r') || LA4_0 == ' ')) {
                        alt4 = 1;
                    }

                    switch (alt4) {
                        case 1: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:
                        {
                            if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || (input.LA(1) >= '\f' && input.LA(1) <= '\r') || input.LA(1) == ' ') {
                                input.consume();

                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }

                        }
                        break;

                        default:
                            if (cnt4 >= 1) {
                                break loop4;
                            }
                            EarlyExitException eee
                                    = new EarlyExitException(4, input);
                            throw eee;
                    }
                    cnt4++;
                } while (true);

                _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:49:9: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:49:11: '//' (~ ( '\\n' | '\\r' ) )*
            {
                match("//");

                // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:49:16: (~ ( '\\n' | '\\r' ) )*
                loop5:
                do {
                    int alt5 = 2;
                    int LA5_0 = input.LA(1);

                    if (((LA5_0 >= '\u0000' && LA5_0 <= '\t') || (LA5_0 >= '\u000B' && LA5_0 <= '\f') || (LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF'))) {
                        alt5 = 1;
                    }

                    switch (alt5) {
                        case 1: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:49:17: ~ ( '\\n' | '\\r' )
                        {
                            if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f') || (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
                                input.consume();

                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }

                        }
                        break;

                        default:
                            break loop5;
                    }
                } while (true);

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:50:12: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:50:16: '/*' ( options {greedy=false; } : . )* '*/'
            {
                match("/*");

                // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:50:21: ( options {greedy=false; } : . )*
                loop6:
                do {
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);

                    if ((LA6_0 == '*')) {
                        int LA6_1 = input.LA(2);

                        if ((LA6_1 == '/')) {
                            alt6 = 2;
                        } else if (((LA6_1 >= '\u0000' && LA6_1 <= '.') || (LA6_1 >= '0' && LA6_1 <= '\uFFFF'))) {
                            alt6 = 1;
                        }

                    } else if (((LA6_0 >= '\u0000' && LA6_0 <= ')') || (LA6_0 >= '+' && LA6_0 <= '\uFFFF'))) {
                        alt6 = 1;
                    }

                    switch (alt6) {
                        case 1: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:50:48: .
                        {
                            matchAny();

                        }
                        break;

                        default:
                            break loop6;
                    }
                } while (true);

                match("*/");

                _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    public void mTokens() throws RecognitionException {
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:8: ( BREAK | CLASS | CONST | CONTINUE | DEFAULT | DO | ELSE | FALSE | FINAL | FOR | IF | IMPORT | IN | LIBRARY | NEW | NULL | PART | RETURN | STATIC | TRUE | VOID | WHILE | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | INT | ID | STRING | WHITESPACE | COMMENT | ML_COMMENT )
        int alt7 = 52;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:10: BREAK
            {
                mBREAK();

            }
            break;
            case 2: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:16: CLASS
            {
                mCLASS();

            }
            break;
            case 3: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:22: CONST
            {
                mCONST();

            }
            break;
            case 4: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:28: CONTINUE
            {
                mCONTINUE();

            }
            break;
            case 5: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:37: DEFAULT
            {
                mDEFAULT();

            }
            break;
            case 6: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:45: DO
            {
                mDO();

            }
            break;
            case 7: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:48: ELSE
            {
                mELSE();

            }
            break;
            case 8: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:53: FALSE
            {
                mFALSE();

            }
            break;
            case 9: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:59: FINAL
            {
                mFINAL();

            }
            break;
            case 10: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:65: FOR
            {
                mFOR();

            }
            break;
            case 11: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:69: IF
            {
                mIF();

            }
            break;
            case 12: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:72: IMPORT
            {
                mIMPORT();

            }
            break;
            case 13: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:79: IN
            {
                mIN();

            }
            break;
            case 14: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:82: LIBRARY
            {
                mLIBRARY();

            }
            break;
            case 15: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:90: NEW
            {
                mNEW();

            }
            break;
            case 16: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:94: NULL
            {
                mNULL();

            }
            break;
            case 17: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:99: PART
            {
                mPART();

            }
            break;
            case 18: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:104: RETURN
            {
                mRETURN();

            }
            break;
            case 19: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:111: STATIC
            {
                mSTATIC();

            }
            break;
            case 20: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:118: TRUE
            {
                mTRUE();

            }
            break;
            case 21: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:123: VOID
            {
                mVOID();

            }
            break;
            case 22: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:128: WHILE
            {
                mWHILE();

            }
            break;
            case 23: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:134: T__32
            {
                mT__32();

            }
            break;
            case 24: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:140: T__33
            {
                mT__33();

            }
            break;
            case 25: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:146: T__34
            {
                mT__34();

            }
            break;
            case 26: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:152: T__35
            {
                mT__35();

            }
            break;
            case 27: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:158: T__36
            {
                mT__36();

            }
            break;
            case 28: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:164: T__37
            {
                mT__37();

            }
            break;
            case 29: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:170: T__38
            {
                mT__38();

            }
            break;
            case 30: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:176: T__39
            {
                mT__39();

            }
            break;
            case 31: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:182: T__40
            {
                mT__40();

            }
            break;
            case 32: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:188: T__41
            {
                mT__41();

            }
            break;
            case 33: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:194: T__42
            {
                mT__42();

            }
            break;
            case 34: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:200: T__43
            {
                mT__43();

            }
            break;
            case 35: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:206: T__44
            {
                mT__44();

            }
            break;
            case 36: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:212: T__45
            {
                mT__45();

            }
            break;
            case 37: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:218: T__46
            {
                mT__46();

            }
            break;
            case 38: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:224: T__47
            {
                mT__47();

            }
            break;
            case 39: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:230: T__48
            {
                mT__48();

            }
            break;
            case 40: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:236: T__49
            {
                mT__49();

            }
            break;
            case 41: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:242: T__50
            {
                mT__50();

            }
            break;
            case 42: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:248: T__51
            {
                mT__51();

            }
            break;
            case 43: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:254: T__52
            {
                mT__52();

            }
            break;
            case 44: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:260: T__53
            {
                mT__53();

            }
            break;
            case 45: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:266: T__54
            {
                mT__54();

            }
            break;
            case 46: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:272: T__55
            {
                mT__55();

            }
            break;
            case 47: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:278: INT
            {
                mINT();

            }
            break;
            case 48: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:282: ID
            {
                mID();

            }
            break;
            case 49: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:285: STRING
            {
                mSTRING();

            }
            break;
            case 50: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:292: WHITESPACE
            {
                mWHITESPACE();

            }
            break;
            case 51: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:303: COMMENT
            {
                mCOMMENT();

            }
            break;
            case 52: // /home/geertjan/NetBeansProjects/api-samples/versions/7.4/misc/DartAntlrGen/src/dartantlrgen/Dart.g:1:311: ML_COMMENT
            {
                mML_COMMENT();

            }
            break;

        }

    }

    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS
            = "\1\uffff\16\43\4\uffff\1\74\2\uffff\1\76\1\100\4\uffff\1\103\11"
            + "\uffff\4\43\1\111\4\43\1\116\1\43\1\120\11\43\1\133\10\uffff\1\135"
            + "\4\43\1\uffff\3\43\1\146\1\uffff\1\43\1\uffff\1\43\1\151\7\43\4"
            + "\uffff\5\43\1\166\2\43\1\uffff\2\43\1\uffff\1\173\1\174\2\43\1\177"
            + "\1\u0080\1\43\1\u0082\1\u0083\1\u0084\2\43\1\uffff\1\u0087\1\u0088"
            + "\2\43\2\uffff\2\43\2\uffff\1\u008d\3\uffff\2\43\2\uffff\1\u0090"
            + "\1\43\1\u0092\1\u0093\1\uffff\1\43\1\u0095\1\uffff\1\u0096\2\uffff"
            + "\1\u0097\3\uffff";
    static final String DFA7_eofS
            = "\u0098\uffff";
    static final String DFA7_minS
            = "\1\11\1\162\1\154\1\145\1\154\1\141\1\146\1\151\1\145\1\141\1\145"
            + "\1\164\1\162\1\157\1\150\4\uffff\1\75\2\uffff\1\174\1\46\4\uffff"
            + "\1\52\4\uffff\1\75\4\uffff\1\145\1\141\1\156\1\146\1\60\1\163\1"
            + "\154\1\156\1\162\1\60\1\160\1\60\1\142\1\167\1\154\1\162\1\164\1"
            + "\141\1\165\2\151\1\75\10\uffff\1\75\1\141\2\163\1\141\1\uffff\1"
            + "\145\1\163\1\141\1\60\1\uffff\1\157\1\uffff\1\162\1\60\1\154\1\164"
            + "\1\165\1\164\1\145\1\144\1\154\4\uffff\1\153\1\163\1\164\1\151\1"
            + "\165\1\60\1\145\1\154\1\uffff\1\162\1\141\1\uffff\2\60\1\162\1\151"
            + "\2\60\1\145\3\60\1\156\1\154\1\uffff\2\60\1\164\1\162\2\uffff\1"
            + "\156\1\143\2\uffff\1\60\3\uffff\1\165\1\164\2\uffff\1\60\1\171\2"
            + "\60\1\uffff\1\145\1\60\1\uffff\1\60\2\uffff\1\60\3\uffff";
    static final String DFA7_maxS
            = "\1\176\1\162\2\157\1\154\1\157\1\156\1\151\1\165\1\141\1\145\1\164"
            + "\1\162\1\157\1\150\4\uffff\1\75\2\uffff\1\174\1\46\4\uffff\1\57"
            + "\4\uffff\1\75\4\uffff\1\145\1\141\1\156\1\146\1\172\1\163\1\154"
            + "\1\156\1\162\1\172\1\160\1\172\1\142\1\167\1\154\1\162\1\164\1\141"
            + "\1\165\2\151\1\75\10\uffff\1\75\1\141\1\163\1\164\1\141\1\uffff"
            + "\1\145\1\163\1\141\1\172\1\uffff\1\157\1\uffff\1\162\1\172\1\154"
            + "\1\164\1\165\1\164\1\145\1\144\1\154\4\uffff\1\153\1\163\1\164\1"
            + "\151\1\165\1\172\1\145\1\154\1\uffff\1\162\1\141\1\uffff\2\172\1"
            + "\162\1\151\2\172\1\145\3\172\1\156\1\154\1\uffff\2\172\1\164\1\162"
            + "\2\uffff\1\156\1\143\2\uffff\1\172\3\uffff\1\165\1\164\2\uffff\1"
            + "\172\1\171\2\172\1\uffff\1\145\1\172\1\uffff\1\172\2\uffff\1\172"
            + "\3\uffff";
    static final String DFA7_acceptS
            = "\17\uffff\1\27\1\30\1\31\1\32\1\uffff\1\34\1\35\2\uffff\1\41\1\43"
            + "\1\44\1\45\1\uffff\1\47\1\50\1\51\1\52\1\uffff\1\57\1\60\1\61\1"
            + "\62\26\uffff\1\33\1\36\1\40\1\37\1\42\1\63\1\64\1\46\5\uffff\1\6"
            + "\4\uffff\1\13\1\uffff\1\15\11\uffff\1\55\1\53\1\56\1\54\10\uffff"
            + "\1\12\2\uffff\1\17\14\uffff\1\7\4\uffff\1\20\1\21\2\uffff\1\24\1"
            + "\25\1\uffff\1\1\1\2\1\3\2\uffff\1\10\1\11\4\uffff\1\26\2\uffff\1"
            + "\14\1\uffff\1\22\1\23\1\uffff\1\5\1\16\1\4";
    static final String DFA7_specialS
            = "\u0098\uffff}>";
    static final String[] DFA7_transitionS = {
        "\2\45\1\uffff\2\45\22\uffff\1\45\1\41\1\44\2\uffff\1\35\1\27"
        + "\1\uffff\1\17\1\20\1\33\1\31\1\21\1\32\1\uffff\1\34\12\42\1"
        + "\uffff\1\22\1\37\1\23\1\40\2\uffff\32\43\3\uffff\1\30\2\uffff"
        + "\1\43\1\1\1\2\1\3\1\4\1\5\2\43\1\6\2\43\1\7\1\43\1\10\1\43\1"
        + "\11\1\43\1\12\1\13\1\14\1\43\1\15\1\16\3\43\1\24\1\26\1\25\1"
        + "\36",
        "\1\46",
        "\1\47\2\uffff\1\50",
        "\1\51\11\uffff\1\52",
        "\1\53",
        "\1\54\7\uffff\1\55\5\uffff\1\56",
        "\1\57\6\uffff\1\60\1\61",
        "\1\62",
        "\1\63\17\uffff\1\64",
        "\1\65",
        "\1\66",
        "\1\67",
        "\1\70",
        "\1\71",
        "\1\72",
        "",
        "",
        "",
        "",
        "\1\73",
        "",
        "",
        "\1\75",
        "\1\77",
        "",
        "",
        "",
        "",
        "\1\102\4\uffff\1\101",
        "",
        "",
        "",
        "",
        "\1\104",
        "",
        "",
        "",
        "",
        "\1\105",
        "\1\106",
        "\1\107",
        "\1\110",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\1\112",
        "\1\113",
        "\1\114",
        "\1\115",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\1\117",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\1\121",
        "\1\122",
        "\1\123",
        "\1\124",
        "\1\125",
        "\1\126",
        "\1\127",
        "\1\130",
        "\1\131",
        "\1\132",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\134",
        "\1\136",
        "\1\137",
        "\1\140\1\141",
        "\1\142",
        "",
        "\1\143",
        "\1\144",
        "\1\145",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "",
        "\1\147",
        "",
        "\1\150",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\1\152",
        "\1\153",
        "\1\154",
        "\1\155",
        "\1\156",
        "\1\157",
        "\1\160",
        "",
        "",
        "",
        "",
        "\1\161",
        "\1\162",
        "\1\163",
        "\1\164",
        "\1\165",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\1\167",
        "\1\170",
        "",
        "\1\171",
        "\1\172",
        "",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\1\175",
        "\1\176",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\1\u0081",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\1\u0085",
        "\1\u0086",
        "",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\1\u0089",
        "\1\u008a",
        "",
        "",
        "\1\u008b",
        "\1\u008c",
        "",
        "",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "",
        "",
        "",
        "\1\u008e",
        "\1\u008f",
        "",
        "",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\1\u0091",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "",
        "\1\u0094",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "",
        "",
        "\12\43\7\uffff\32\43\6\uffff\32\43",
        "",
        "",
        ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }

        public String getDescription() {
            return "1:1: Tokens : ( BREAK | CLASS | CONST | CONTINUE | DEFAULT | DO | ELSE | FALSE | FINAL | FOR | IF | IMPORT | IN | LIBRARY | NEW | NULL | PART | RETURN | STATIC | TRUE | VOID | WHILE | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | INT | ID | STRING | WHITESPACE | COMMENT | ML_COMMENT );";
        }
    }

}
