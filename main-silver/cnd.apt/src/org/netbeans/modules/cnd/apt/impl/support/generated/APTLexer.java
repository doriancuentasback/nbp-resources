// $ANTLR Sun-2.7.7(NoEx) (2006-01-29): "support/aptlexer.g" -> "APTLexer.java"$


package org.netbeans.modules.cnd.apt.impl.support.generated;

import org.netbeans.modules.cnd.apt.utils.APTUtils;
import org.netbeans.modules.cnd.apt.support.APTToken;
import org.netbeans.modules.cnd.apt.support.lang.APTLanguageSupport;


import java.io.InputStream;
import org.netbeans.modules.cnd.antlr.TokenStreamException;
import org.netbeans.modules.cnd.antlr.TokenStreamIOException;
import org.netbeans.modules.cnd.antlr.TokenStreamRecognitionException;
import org.netbeans.modules.cnd.antlr.CharStreamIOException;
import org.netbeans.modules.cnd.antlr.ANTLRException;
import java.io.Reader;
import java.util.Hashtable;
import org.netbeans.modules.cnd.antlr.CharScannerNoEx;
import org.netbeans.modules.cnd.antlr.InputBuffer;
import org.netbeans.modules.cnd.antlr.ByteBuffer;
import org.netbeans.modules.cnd.antlr.CharBuffer;
import org.netbeans.modules.cnd.antlr.Token;
import org.netbeans.modules.cnd.antlr.CommonToken;
import org.netbeans.modules.cnd.antlr.RecognitionException;
import org.netbeans.modules.cnd.antlr.NoViableAltForCharException;
import org.netbeans.modules.cnd.antlr.MismatchedCharException;
import org.netbeans.modules.cnd.antlr.TokenStream;
import org.netbeans.modules.cnd.antlr.ANTLRHashString;
import org.netbeans.modules.cnd.antlr.LexerSharedInputState;
import org.netbeans.modules.cnd.antlr.collections.impl.BitSet;
import org.netbeans.modules.cnd.antlr.SemanticException;
import java.util.Map;
import java.util.HashMap;

@org.netbeans.api.annotations.common.SuppressWarnings("DLS")
@SuppressWarnings({"unchecked", "cast", "fallthrough"})
final /*final class attribute gives us performance */

public class APTLexer extends org.netbeans.modules.cnd.antlr.CharScannerNoEx implements APTGeneratedTokenTypes, TokenStream
 {

    private boolean reportErrors;
    private Language lang;
    private Flavor flavor;
    private APTLexerCallback callback;
    public static enum Language {
        C,
        CPP,
        FORTRAN
    };
    public static enum Flavor {
        UNKNOWN,
        FORTRAN_FIXED,
        FORTRAN_FREE,
        CPP11
    };

    public interface APTLexerCallback {
        void onMakeToken(int tokType, int startColumn, int startLine);
    }

    public void setCallback(APTLexerCallback callback) {
        this.callback = callback;
    }

    public void init(String filename, int flags, String language, String flavor) {
        preprocPossible = true;
        preprocPending = false;
        reportErrors = true;

        setFilename(filename);

        if(language.equalsIgnoreCase(APTLanguageSupport.FORTRAN)) {
            this.lang = Language.FORTRAN;
        } else {
            this.lang = Language.CPP;
        }

        if(flavor.equalsIgnoreCase(APTLanguageSupport.FLAVOR_FORTRAN_FIXED)) {
            this.flavor = Flavor.FORTRAN_FIXED;
        } else if(flavor.equalsIgnoreCase(APTLanguageSupport.FLAVOR_FORTRAN_FREE)) {
            this.flavor = Flavor.FORTRAN_FREE;
        } else if(flavor.equalsIgnoreCase(APTLanguageSupport.FLAVOR_CPP11)) {
            this.flavor = Flavor.CPP11;
        } else {
            this.flavor = Flavor.UNKNOWN;
        }

//        if ((flags & CPPParser.CPP_SUPPRESS_ERRORS) > 0) {
//            reportErrors = false;
//        }
    }

    // overriden to avoid class loading
    @Override
    public void setTokenObjectClass(String cl) {
    }

    // Used instead of setTokenObjectClass method to avoid reflection usage
    @Override
    protected APTToken createToken(int type) {
        return APTUtils.createAPTToken(type);
    }

    @Override
    protected void setTokenText(Token _token, char buf[], int start, int count) {
        APTUtils.setTokenText((APTToken)_token, buf, start, count);
    }

    @Override
    public void traceIn(String rname) {
        traceDepth ++;
        traceIndent();
        char c = LA(1);
        Object ch = (c == '\n') ? "\\n" : c == '\t' ? "\\t" : ("" + c); // NOI18N
        System.out.println("> lexer " + rname + "; c==" + ch); // NOI18N
    }

    public void traceOut(String rname) {
        traceIndent();
        char c = LA(1);
        Object ch = c == '\n' ? "\\n" : c == '\t' ? "\\t" : ("" + c); // NOI18N
        System.out.println("< lexer " + rname + "; c==" + ch); // NOI18N
        traceDepth--;
    }

    private int errorCount = 0;

    public int getErrorCount() {
        return errorCount;
    }

    public void reportError(RecognitionException e) {

        if (reportErrors) {
            super.reportError(e);
        }
        errorCount++;
    }

    public void reportError(String s) {
        if (reportErrors) {
            super.reportError(s);
        }
        errorCount++;
    }

    private boolean isCPlusPlus() {
        return lang == Language.CPP;
    }

    private boolean isCPlusPlus11() {
        return isCPlusPlus() && flavor == Flavor.CPP11;
    }

/*
    protected void printf(String pattern, int i) {
        Printf.printf(pattern, new Object[] { new Integer(i) });
    }

    protected void printf(String pattern, int i, boolean b) {
        Printf.printf(pattern, new Object[] { new Integer(i), Boolean.valueOf(b) });
    }

    protected void printf(String pattern) {
        Printf.printf(pattern, new Object[] {});
    }
*/
	
    private static final int PREPROC_POSSIBLE = 0;

    private static final int PREPROC_PENDING = 1;

    private static final int AFTER_DEFINE = 2;
    /**
     * INCLUDE_STRING token is expected while in this state
     */ 
    private static final int AFTER_INLUDE = 3;


    /**
     *  A '#' character read while in this state would be treated as the
     *  start of a PrprocDirective. Other '#' chars would be treated as
     *  POUND chars.
     */	
    private boolean preprocPossible;
    private boolean isPreprocPossible() {
            return preprocPossible;
    }
    private void setPreprocPossible(boolean possible) {
            this.preprocPossible = possible;
    }

    /**
     *  Flag prevents token creating for APT light.
     */	
    private boolean onlyPreproc = false;
    private boolean isOnlyPreproc() {
        return onlyPreproc;
    }
    public void setOnlyPreproc(boolean onlyPreproc) {
        this.onlyPreproc = onlyPreproc;
    }

    /**
     *  EndOfLine read while in this state whould be treated as the end
     * of a PreprocDirective and token END_PREPROC_DIRECTIVE will be created
     */
    private boolean preprocPending;
    private boolean isPreprocPending() {
        return preprocPending;
    }
    private void setPreprocPending(boolean pending) {
        this.preprocPending = pending;
    }

    private boolean afterInclude = false;
    private boolean isAfterInclude() {
        return afterInclude;
    }
    private void setAfterInclude(boolean afterInclude) {
        this.afterInclude = afterInclude;
    }


    /**
     * ID read while in this state whould be treated as ID_DEFINED, 
     * need for not expanding ID in expresions like:
     * #if defined MACRO
     */
    private boolean afterPPDefined = false;
    private boolean ppDefinedAllowed = true;
    private boolean isAfterPPDefined() {
        return afterPPDefined;
    }
    private void setAfterPPDefined(boolean afterPPDefined) {
        this.afterPPDefined = afterPPDefined;
    }

    private boolean isPPDefinedAllowed() {
        return ppDefinedAllowed;
    }

    private void setPPDefinedAllowed(boolean ppDefinedAllowed) {
        this.ppDefinedAllowed = ppDefinedAllowed;
    }

    /**
     * ID read while in this state whould be treated as ID, but 
     * LA(1) will be checked to switch into "funLikeMacro" state upon 
     * (LA(1) == '(') without leading whitespace 
     * (need for FUN_LIKE_MACRO_LPAREN token)
     */
    private boolean afterDefine = false;
    private boolean isAfterDefine() {
        return afterDefine;
    }
    private void setAfterDefine(boolean afterDefine) {
        this.afterDefine = afterDefine;
    }

    /**
     * FUN_LIKE_MACRO_LPAREN token is expected while in this state
     */
    private boolean funLikeMacro = false;
    private boolean isFunLikeMacro() {
        return funLikeMacro;
    }
    private void setFunLikeMacro(boolean funLikeMacro) {
        this.funLikeMacro = funLikeMacro;
    }
    
    private void clearPrepProcFlags() {
        setFunLikeMacro(false);
        setAfterDefine(false);
        setAfterPPDefined(false);
        setAfterInclude(false);
        setPreprocPending(false);
    }

    @Override
    protected APTToken makeToken(int t) {
        if (callback != null) {
            callback.onMakeToken(t, getTokenStartColumn(), getTokenStartLine());
        }

        if (isOnlyPreproc() && isPreprocPossible()) {
           // do not create token if lexer builds light stream
            if (!(t==Token.EOF_TYPE || t==END_PREPROC_DIRECTIVE)){
                return null;
            }
        }
        // Our literal check
        int literalType = testLiteralsTable(0);
        APTToken k = APTUtils.createAPTToken(t, tokenStartOffset, offset, getTokenStartColumn(), getTokenStartLine(), inputState.getColumn(), inputState.getLine(), literalType);
        // it should be impossible to have preprocessor directive 
        // after valid token. preprocessor directive valid only
        // at start of line @see newline()
        if (t != COMMENT) { // block comment is valid anywhere
            setPreprocPossible(t == END_PREPROC_DIRECTIVE);
        }
        return k;
    }

    public void resetText() {
        super.resetText();
        tokenStartOffset = offset;
    }

    public void consume() {
        super.consume();
        if (guessing == 0) {
            offset++;
        }
    }

/*
    boolean wasTab;
    public void consume() throws CharStreamException {
        wasTab = false;
        super.consume();
        if (!wasTab) {
            offset++;
        }
    }

    public void tab() {
        wasTab = true;
        int c = getColumn();
        super.tab();
        offset += getColumn() - c;
    }
*/
    public int mark() {
        mkOffset = offset;
        return super.mark(); 
    }

    public void rewind(int mark) {
        super.rewind(mark);
        offset = mkOffset;
    }

    /*public int getOffset() {
        return offset;
    }*/

    int offset = 0;
    int tokenStartOffset = 0;
    int mkOffset = 0;

    public void newline() 
    {
        super.newline();
        if (!isPreprocPending()) {
            setPreprocPossible(true);
        }
    }

    private void deferredNewline() 
    {
        super.newline();
    }
public APTLexer(InputStream in) {
	this(new ByteBuffer(in));
}
public APTLexer(Reader in) {
	this(new CharBuffer(in));
}
public APTLexer(InputBuffer ib) {
	this(new LexerSharedInputState(), ib);
}
public APTLexer(char buf[]) {
	this(new LexerSharedInputState(), new CharBuffer(buf));
}
public APTLexer(LexerSharedInputState state, InputBuffer ib) {
	super(ib);
	caseSensitiveLiterals = true;
	setCaseSensitive(true);
	literals = LITERALS_TABLE;
}
private static final Map<ANTLRHashString, Integer> LITERALS_TABLE;
static {
	LITERALS_TABLE = new HashMap<ANTLRHashString, Integer>(256);
	LITERALS_TABLE.put(new ANTLRHashString("try", true), Integer.valueOf(180));
	LITERALS_TABLE.put(new ANTLRHashString("template", true), Integer.valueOf(116));
	LITERALS_TABLE.put(new ANTLRHashString("namespace", true), Integer.valueOf(119));
	LITERALS_TABLE.put(new ANTLRHashString("__has_nothrow_copy", true), Integer.valueOf(251));
	LITERALS_TABLE.put(new ANTLRHashString("_declspec", true), Integer.valueOf(156));
	LITERALS_TABLE.put(new ANTLRHashString("restrict", true), Integer.valueOf(210));
	LITERALS_TABLE.put(new ANTLRHashString("bool", true), Integer.valueOf(144));
	LITERALS_TABLE.put(new ANTLRHashString("__inline", true), Integer.valueOf(124));
	LITERALS_TABLE.put(new ANTLRHashString("auto", true), Integer.valueOf(131));
	LITERALS_TABLE.put(new ANTLRHashString("__forceinline", true), Integer.valueOf(237));
	LITERALS_TABLE.put(new ANTLRHashString("noexcept", true), Integer.valueOf(234));
	LITERALS_TABLE.put(new ANTLRHashString("__stdcall", true), Integer.valueOf(129));
	LITERALS_TABLE.put(new ANTLRHashString("static_assert", true), Integer.valueOf(230));
	LITERALS_TABLE.put(new ANTLRHashString("__volatile", true), Integer.valueOf(141));
	LITERALS_TABLE.put(new ANTLRHashString("__asm__", true), Integer.valueOf(186));
	LITERALS_TABLE.put(new ANTLRHashString("_Imaginary", true), Integer.valueOf(220));
	LITERALS_TABLE.put(new ANTLRHashString("bit", true), Integer.valueOf(221));
	LITERALS_TABLE.put(new ANTLRHashString("__is_trivial", true), Integer.valueOf(262));
	LITERALS_TABLE.put(new ANTLRHashString("__w64", true), Integer.valueOf(207));
	LITERALS_TABLE.put(new ANTLRHashString("int", true), Integer.valueOf(146));
	LITERALS_TABLE.put(new ANTLRHashString("__volatile__", true), Integer.valueOf(140));
	LITERALS_TABLE.put(new ANTLRHashString("virtual", true), Integer.valueOf(125));
	LITERALS_TABLE.put(new ANTLRHashString("void", true), Integer.valueOf(155));
	LITERALS_TABLE.put(new ANTLRHashString("typeof", true), Integer.valueOf(113));
	LITERALS_TABLE.put(new ANTLRHashString("unsigned", true), Integer.valueOf(151));
	LITERALS_TABLE.put(new ANTLRHashString("__is_abstract", true), Integer.valueOf(257));
	LITERALS_TABLE.put(new ANTLRHashString("_cdecl", true), Integer.valueOf(194));
	LITERALS_TABLE.put(new ANTLRHashString("throw", true), Integer.valueOf(167));
	LITERALS_TABLE.put(new ANTLRHashString("char32_t", true), Integer.valueOf(233));
	LITERALS_TABLE.put(new ANTLRHashString("catch", true), Integer.valueOf(181));
	LITERALS_TABLE.put(new ANTLRHashString("_asm", true), Integer.valueOf(185));
	LITERALS_TABLE.put(new ANTLRHashString("__has_nothrow_constructor", true), Integer.valueOf(252));
	LITERALS_TABLE.put(new ANTLRHashString("_Bool", true), Integer.valueOf(216));
	LITERALS_TABLE.put(new ANTLRHashString("export", true), Integer.valueOf(183));
	LITERALS_TABLE.put(new ANTLRHashString("static", true), Integer.valueOf(133));
	LITERALS_TABLE.put(new ANTLRHashString("__restrict", true), Integer.valueOf(211));
	LITERALS_TABLE.put(new ANTLRHashString("__null", true), Integer.valueOf(241));
	LITERALS_TABLE.put(new ANTLRHashString("dynamic_cast", true), Integer.valueOf(190));
	LITERALS_TABLE.put(new ANTLRHashString("union", true), Integer.valueOf(160));
	LITERALS_TABLE.put(new ANTLRHashString("__complex__", true), Integer.valueOf(212));
	LITERALS_TABLE.put(new ANTLRHashString("__unsigned__", true), Integer.valueOf(152));
	LITERALS_TABLE.put(new ANTLRHashString("continue", true), Integer.valueOf(177));
	LITERALS_TABLE.put(new ANTLRHashString("__is_polymorphic", true), Integer.valueOf(260));
	LITERALS_TABLE.put(new ANTLRHashString("inline", true), Integer.valueOf(121));
	LITERALS_TABLE.put(new ANTLRHashString("__signed", true), Integer.valueOf(150));
	LITERALS_TABLE.put(new ANTLRHashString("__pascal", true), Integer.valueOf(203));
	LITERALS_TABLE.put(new ANTLRHashString("do", true), Integer.valueOf(174));
	LITERALS_TABLE.put(new ANTLRHashString("struct", true), Integer.valueOf(159));
	LITERALS_TABLE.put(new ANTLRHashString("explicit", true), Integer.valueOf(126));
	LITERALS_TABLE.put(new ANTLRHashString("_far", true), Integer.valueOf(198));
	LITERALS_TABLE.put(new ANTLRHashString("signed", true), Integer.valueOf(148));
	LITERALS_TABLE.put(new ANTLRHashString("__has_virtual_destructor", true), Integer.valueOf(256));
	LITERALS_TABLE.put(new ANTLRHashString("if", true), Integer.valueOf(170));
	LITERALS_TABLE.put(new ANTLRHashString("override", true), Integer.valueOf(225));
	LITERALS_TABLE.put(new ANTLRHashString("thread_local", true), Integer.valueOf(229));
	LITERALS_TABLE.put(new ANTLRHashString("while", true), Integer.valueOf(173));
	LITERALS_TABLE.put(new ANTLRHashString("long", true), Integer.valueOf(147));
	LITERALS_TABLE.put(new ANTLRHashString("const", true), Integer.valueOf(135));
	LITERALS_TABLE.put(new ANTLRHashString("__imag__", true), Integer.valueOf(213));
	LITERALS_TABLE.put(new ANTLRHashString("__try", true), Integer.valueOf(239));
	LITERALS_TABLE.put(new ANTLRHashString("register", true), Integer.valueOf(132));
	LITERALS_TABLE.put(new ANTLRHashString("__cdecl", true), Integer.valueOf(195));
	LITERALS_TABLE.put(new ANTLRHashString("asm", true), Integer.valueOf(184));
	LITERALS_TABLE.put(new ANTLRHashString("__is_pod", true), Integer.valueOf(245));
	LITERALS_TABLE.put(new ANTLRHashString("reinterpret_cast", true), Integer.valueOf(192));
	LITERALS_TABLE.put(new ANTLRHashString("__inline__", true), Integer.valueOf(123));
	LITERALS_TABLE.put(new ANTLRHashString("__global", true), Integer.valueOf(215));
	LITERALS_TABLE.put(new ANTLRHashString("float", true), Integer.valueOf(153));
	LITERALS_TABLE.put(new ANTLRHashString("__alignof", true), Integer.valueOf(242));
	LITERALS_TABLE.put(new ANTLRHashString("_int64", true), Integer.valueOf(205));
	LITERALS_TABLE.put(new ANTLRHashString("typename", true), Integer.valueOf(130));
	LITERALS_TABLE.put(new ANTLRHashString("decltype", true), Integer.valueOf(227));
	LITERALS_TABLE.put(new ANTLRHashString("pascal", true), Integer.valueOf(201));
	LITERALS_TABLE.put(new ANTLRHashString("__attribute", true), Integer.valueOf(219));
	LITERALS_TABLE.put(new ANTLRHashString("sizeof", true), Integer.valueOf(189));
	LITERALS_TABLE.put(new ANTLRHashString("__const", true), Integer.valueOf(137));
	LITERALS_TABLE.put(new ANTLRHashString("break", true), Integer.valueOf(178));
	LITERALS_TABLE.put(new ANTLRHashString("mutable", true), Integer.valueOf(134));
	LITERALS_TABLE.put(new ANTLRHashString("_endasm", true), Integer.valueOf(188));
	LITERALS_TABLE.put(new ANTLRHashString("short", true), Integer.valueOf(145));
	LITERALS_TABLE.put(new ANTLRHashString("private", true), Integer.valueOf(166));
	LITERALS_TABLE.put(new ANTLRHashString("__clrcall", true), Integer.valueOf(238));
	LITERALS_TABLE.put(new ANTLRHashString("_inline", true), Integer.valueOf(122));
	LITERALS_TABLE.put(new ANTLRHashString("alignof", true), Integer.valueOf(111));
	LITERALS_TABLE.put(new ANTLRHashString("__near", true), Integer.valueOf(197));
	LITERALS_TABLE.put(new ANTLRHashString("delete", true), Integer.valueOf(204));
	LITERALS_TABLE.put(new ANTLRHashString("__is_union", true), Integer.valueOf(263));
	LITERALS_TABLE.put(new ANTLRHashString("__hidden", true), Integer.valueOf(223));
	LITERALS_TABLE.put(new ANTLRHashString("nullptr", true), Integer.valueOf(228));
	LITERALS_TABLE.put(new ANTLRHashString("__is_empty", true), Integer.valueOf(258));
	LITERALS_TABLE.put(new ANTLRHashString("__real__", true), Integer.valueOf(214));
	LITERALS_TABLE.put(new ANTLRHashString("__is_enum", true), Integer.valueOf(244));
	LITERALS_TABLE.put(new ANTLRHashString("const_cast", true), Integer.valueOf(138));
	LITERALS_TABLE.put(new ANTLRHashString("class", true), Integer.valueOf(158));
	LITERALS_TABLE.put(new ANTLRHashString("__builtin_va_list", true), Integer.valueOf(265));
	LITERALS_TABLE.put(new ANTLRHashString("__complex", true), Integer.valueOf(236));
	LITERALS_TABLE.put(new ANTLRHashString("public", true), Integer.valueOf(164));
	LITERALS_TABLE.put(new ANTLRHashString("__has_trivial_destructor", true), Integer.valueOf(255));
	LITERALS_TABLE.put(new ANTLRHashString("__has_nothrow_assign", true), Integer.valueOf(250));
	LITERALS_TABLE.put(new ANTLRHashString("__restrict__", true), Integer.valueOf(248));
	LITERALS_TABLE.put(new ANTLRHashString("_near", true), Integer.valueOf(196));
	LITERALS_TABLE.put(new ANTLRHashString("new", true), Integer.valueOf(193));
	LITERALS_TABLE.put(new ANTLRHashString("static_cast", true), Integer.valueOf(191));
	LITERALS_TABLE.put(new ANTLRHashString("goto", true), Integer.valueOf(176));
	LITERALS_TABLE.put(new ANTLRHashString("true", true), Integer.valueOf(162));
	LITERALS_TABLE.put(new ANTLRHashString("__int64", true), Integer.valueOf(206));
	LITERALS_TABLE.put(new ANTLRHashString("_Noreturn", true), Integer.valueOf(249));
	LITERALS_TABLE.put(new ANTLRHashString("__signed__", true), Integer.valueOf(149));
	LITERALS_TABLE.put(new ANTLRHashString("_pascal", true), Integer.valueOf(202));
	LITERALS_TABLE.put(new ANTLRHashString("return", true), Integer.valueOf(179));
	LITERALS_TABLE.put(new ANTLRHashString("__has_trivial_constructor", true), Integer.valueOf(247));
	LITERALS_TABLE.put(new ANTLRHashString("_stdcall", true), Integer.valueOf(128));
	LITERALS_TABLE.put(new ANTLRHashString("__finally", true), Integer.valueOf(240));
	LITERALS_TABLE.put(new ANTLRHashString("protected", true), Integer.valueOf(165));
	LITERALS_TABLE.put(new ANTLRHashString("__asm", true), Integer.valueOf(187));
	LITERALS_TABLE.put(new ANTLRHashString("false", true), Integer.valueOf(163));
	LITERALS_TABLE.put(new ANTLRHashString("__alignof__", true), Integer.valueOf(112));
	LITERALS_TABLE.put(new ANTLRHashString("__has_trivial_copy", true), Integer.valueOf(254));
	LITERALS_TABLE.put(new ANTLRHashString("__decltype", true), Integer.valueOf(235));
	LITERALS_TABLE.put(new ANTLRHashString("for", true), Integer.valueOf(175));
	LITERALS_TABLE.put(new ANTLRHashString("default", true), Integer.valueOf(169));
	LITERALS_TABLE.put(new ANTLRHashString("enum", true), Integer.valueOf(118));
	LITERALS_TABLE.put(new ANTLRHashString("case", true), Integer.valueOf(168));
	LITERALS_TABLE.put(new ANTLRHashString("__const__", true), Integer.valueOf(136));
	LITERALS_TABLE.put(new ANTLRHashString("volatile", true), Integer.valueOf(139));
	LITERALS_TABLE.put(new ANTLRHashString("using", true), Integer.valueOf(182));
	LITERALS_TABLE.put(new ANTLRHashString("extern", true), Integer.valueOf(120));
	LITERALS_TABLE.put(new ANTLRHashString("__attribute__", true), Integer.valueOf(209));
	LITERALS_TABLE.put(new ANTLRHashString("operator", true), Integer.valueOf(110));
	LITERALS_TABLE.put(new ANTLRHashString("_Complex", true), Integer.valueOf(217));
	LITERALS_TABLE.put(new ANTLRHashString("char16_t", true), Integer.valueOf(232));
	LITERALS_TABLE.put(new ANTLRHashString("typedef", true), Integer.valueOf(117));
	LITERALS_TABLE.put(new ANTLRHashString("double", true), Integer.valueOf(154));
	LITERALS_TABLE.put(new ANTLRHashString("__symbolic", true), Integer.valueOf(222));
	LITERALS_TABLE.put(new ANTLRHashString("__is_literal_type", true), Integer.valueOf(259));
	LITERALS_TABLE.put(new ANTLRHashString("__far", true), Integer.valueOf(199));
	LITERALS_TABLE.put(new ANTLRHashString("__underlying_type", true), Integer.valueOf(264));
	LITERALS_TABLE.put(new ANTLRHashString("__interrupt", true), Integer.valueOf(200));
	LITERALS_TABLE.put(new ANTLRHashString("__is_standard_layout", true), Integer.valueOf(261));
	LITERALS_TABLE.put(new ANTLRHashString("__is_class", true), Integer.valueOf(243));
	LITERALS_TABLE.put(new ANTLRHashString("final", true), Integer.valueOf(224));
	LITERALS_TABLE.put(new ANTLRHashString("__has_trivial_assign", true), Integer.valueOf(253));
	LITERALS_TABLE.put(new ANTLRHashString("friend", true), Integer.valueOf(127));
	LITERALS_TABLE.put(new ANTLRHashString("wchar_t", true), Integer.valueOf(143));
	LITERALS_TABLE.put(new ANTLRHashString("char", true), Integer.valueOf(142));
	LITERALS_TABLE.put(new ANTLRHashString("__is_base_of", true), Integer.valueOf(246));
	LITERALS_TABLE.put(new ANTLRHashString("__extension__", true), Integer.valueOf(208));
	LITERALS_TABLE.put(new ANTLRHashString("__typeof__", true), Integer.valueOf(114));
	LITERALS_TABLE.put(new ANTLRHashString("__typeof", true), Integer.valueOf(115));
	LITERALS_TABLE.put(new ANTLRHashString("switch", true), Integer.valueOf(172));
	LITERALS_TABLE.put(new ANTLRHashString("constexpr", true), Integer.valueOf(226));
	LITERALS_TABLE.put(new ANTLRHashString("this", true), Integer.valueOf(161));
	LITERALS_TABLE.put(new ANTLRHashString("__thread", true), Integer.valueOf(218));
	LITERALS_TABLE.put(new ANTLRHashString("__declspec", true), Integer.valueOf(157));
	LITERALS_TABLE.put(new ANTLRHashString("alignas", true), Integer.valueOf(231));
	LITERALS_TABLE.put(new ANTLRHashString("else", true), Integer.valueOf(171));
}

public Token nextToken() throws TokenStreamException {
	Token theRetToken=null;
tryAgain:
	for (;;) {
		Token _token = null;
		int _ttype = Token.INVALID_TYPE;
		resetText();
		loop0:  while (true) {
			char LA1_1 = LA(1);
			char LA2_1 = LA(2);
			
			switch ( LA1_1) {
			case ',':
			{
				mCOMMA(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '?':
			{
				mQUESTIONMARK(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case ';':
			{
				mSEMICOLON(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '(':
			{
				mLPAREN(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case ')':
			{
				mRPAREN(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '[':
			{
				mLSQUARE(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case ']':
			{
				mRSQUARE(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '{':
			{
				mLCURLY(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '}':
			{
				mRCURLY(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '~':
			{
				mTILDE(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '=':
			{
				mFIRST_ASSIGN(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '/':
			{
				mFIRST_DIVIDE(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '%':
			{
				mFIRST_MOD(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '&':
			{
				mFIRST_AMPERSAND(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '|':
			{
				mFIRST_OR(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '^':
			{
				mFIRST_BITWISEXOR(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case ':':
			{
				mFIRST_COLON(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '<':
			{
				mFIRST_LESS(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '@':
			{
				mAT(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '`':
			{
				mGRAVE_ACCENT(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '>':
			{
				mFIRST_GREATER(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '-':
			{
				mFIRST_MINUS(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '+':
			{
				mFIRST_PLUS(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '\t':  case '\n':  case '\u000c':  case '\r':
			case ' ':  case '\\':
			{
				mWhitespace(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '"':
			{
				mFIRST_QUOTATION(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '#':
			{
				mPREPROC_DIRECTIVE(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '\'':
			{
				mCHAR_LITERAL(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			case '.':  case '0':  case '1':  case '2':
			case '3':  case '4':  case '5':  case '6':
			case '7':  case '8':  case '9':
			{
				mNUMBER(true);
				if (matchError) {break loop0;}
				theRetToken=_returnToken;
				break;
			}
			default:
				if (((_tokenSet_0.member(LA1_1)) && (true))&&(lang == Language.FORTRAN && (inputState.getColumn() == 1 && (LA(2)=='\r' || LA(2)=='\n' || LA(2)==' ') || (flavor == Flavor.FORTRAN_FREE && LA(1) == '!') ))) {
					mFORTRAN_COMMENT(true);
					if (matchError) {break loop0;}
					theRetToken=_returnToken;
				}
				else if ((LA1_1=='*') && (true)) {
					mFIRST_STAR(true);
					if (matchError) {break loop0;}
					theRetToken=_returnToken;
				}
				else if ((LA1_1=='!') && (true)) {
					mFIRST_NOT(true);
					if (matchError) {break loop0;}
					theRetToken=_returnToken;
				}
				else if ((_tokenSet_1.member(LA1_1)) && (true)) {
					mID_LIKE(true);
					if (matchError) {break loop0;}
					theRetToken=_returnToken;
				}
			else {
				if (LA(1)==EOF_CHAR) {uponEOF(); _returnToken = makeToken(Token.EOF_TYPE);}
				else {matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {break loop0;}}
			}
			}
			if ( _returnToken==null ) continue tryAgain; // found SKIP token
			return _returnToken;
		}
		if (matchError) {
			throw new TokenStreamRecognitionException(matchException);
		}
	}
}

	//Call mode always true
	public final void mFORTRAN_COMMENT(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FORTRAN_COMMENT;
		int _saveIndex;
		
		if (!(lang == Language.FORTRAN && (inputState.getColumn() == 1 && (LA(2)=='\r' || LA(2)=='\n' || LA(2)==' ') || (flavor == Flavor.FORTRAN_FREE && LA(1) == '!') )))
		{matchError=true;
		matchException = new SemanticException("lang == Language.FORTRAN && (inputState.getColumn() == 1 && (LA(2)=='\\r' || LA(2)=='\\n' || LA(2)==' ') || (flavor == Flavor.FORTRAN_FREE && LA(1) == '!') )");
		if (matchError) {return ;}}
		{
		switch ( LA(1)) {
		case '!':
		{
			consume();
			break;
		}
		case 'C':  case 'c':
		{
			{
			switch ( LA(1)) {
			case 'c':
			{
				consume();
				break;
			}
			case 'C':
			{
				consume();
				break;
			}
			default:
			{
				matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
			}
			}
			}
			break;
		}
		case '*':
		{
			consume();
			break;
		}
		default:
		{
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		}
		}
		{
		_loop6:
		do {
			if ((_tokenSet_2.member(LA(1)))) {
				{
				match(_tokenSet_2);
				if (matchError) {return ;}
				}
			}
			else {
				break _loop6;
			}
			
		} while (true);
		}
		_ttype = FORTRAN_COMMENT;
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mCOMMA(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COMMA;
		int _saveIndex;
		
		match(',');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mQUESTIONMARK(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = QUESTIONMARK;
		int _saveIndex;
		
		match('?');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mSEMICOLON(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SEMICOLON;
		int _saveIndex;
		
		match(';');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mLPAREN(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LPAREN;
		int _saveIndex;
		
		match('(');
		if (matchError) {return ;}
		
		if (isFunLikeMacro()) {
		setFunLikeMacro(false);
		_ttype = FUN_LIKE_MACRO_LPAREN;
		}
		
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mRPAREN(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RPAREN;
		int _saveIndex;
		
		match(')');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mLSQUARE(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LSQUARE;
		int _saveIndex;
		
		match('[');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mRSQUARE(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RSQUARE;
		int _saveIndex;
		
		match(']');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mLCURLY(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LCURLY;
		int _saveIndex;
		
		match('{');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mRCURLY(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RCURLY;
		int _saveIndex;
		
		match('}');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mTILDE(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = TILDE;
		int _saveIndex;
		
		match('~');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mFIRST_ASSIGN(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_ASSIGN;
		int _saveIndex;
		
		match('=');
		if (matchError) {return ;}
		{
		if ((LA(1)=='=')) {
			consume();
			_ttype = EQUAL;
		}
		else {
			_ttype = ASSIGNEQUAL;
		}
		
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mFIRST_DIVIDE(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_DIVIDE;
		int _saveIndex;
		
		char LA1_2 = LA(1);
		char LA2_2 = LA(2);
		
		if (((LA1_2=='/') && (LA2_2=='*'))&&((lang == Language.CPP || lang == Language.C))) {
			mCOMMENT(false);
			if (matchError) {return ;}
			_ttype = COMMENT;
		}
		else if (((LA1_2=='/') && (LA2_2=='/'))&&(lang == Language.CPP)) {
			mCPP_COMMENT(false);
			if (matchError) {return ;}
			_ttype = CPP_COMMENT;
		}
		else if ((LA1_2=='/') && (true)) {
			consume();
			{
			if ((LA(1)=='=')) {
				consume();
				_ttype = DIVIDEEQUAL;
			}
			else {
				_ttype = DIVIDE;
			}
			
			}
		}
		else {
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mCOMMENT(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COMMENT;
		int _saveIndex;
		
		match("/*");
		if (matchError) {return ;}
		{
		_loop63:
		do {
			// nongreedy exit test
			if ((LA(1)=='*') && (LA(2)=='/')) break _loop63;
			char LA1_3 = LA(1);
			char LA2_3 = LA(2);
			
			if ((LA1_3=='\n'||LA1_3=='\r') && ((LA2_3 >= '\u0001' && LA2_3 <= '\ufffe'))) {
				mEndOfLine(false);
				if (matchError) {return ;}
				deferredNewline();
			}
			else if (((LA1_3 >= '\u0001' && LA1_3 <= '\ufffe')) && ((LA2_3 >= '\u0001' && LA2_3 <= '\ufffe'))) {
				matchNot(EOF_CHAR);
				if (matchError) {return ;}
			}
			else {
				break _loop63;
			}
			
		} while (true);
		}
		match("*/");
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mCPP_COMMENT(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CPP_COMMENT;
		int _saveIndex;
		
		match("//");
		if (matchError) {return ;}
		{
		_loop67:
		do {
			char LA1_4 = LA(1);
			char LA2_4 = LA(2);
			
			if ((LA1_4=='\\') && (LA2_4=='\n'||LA2_4=='\r')) {
				consume();
				mEndOfLine(false);
				if (matchError) {return ;}
				deferredNewline();
			}
			else if ((_tokenSet_2.member(LA1_4)) && (true)) {
				{
				match(_tokenSet_2);
				if (matchError) {return ;}
				}
			}
			else {
				break _loop67;
			}
			
		} while (true);
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always true
	public final void mFIRST_STAR(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_STAR;
		int _saveIndex;
		
		match('*');
		if (matchError) {return ;}
		{
		if ((LA(1)=='=')) {
			consume();
			_ttype = TIMESEQUAL;
		}
		else {
			_ttype = STAR;
		}
		
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mFIRST_MOD(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_MOD;
		int _saveIndex;
		
		match('%');
		if (matchError) {return ;}
		{
		switch ( LA(1)) {
		case '=':
		{
			consume();
			_ttype = MODEQUAL;
			break;
		}
		case '>':
		{
			consume();
			_ttype = RCURLY;
			break;
		}
		case ':':
		{
			consume();
			{
			char LA1_5 = LA(1);
			char LA2_5 = LA(2);
			
			if (((LA1_5=='%') && (LA2_5==':'))&&(isPreprocPending())) {
				consume();
				consume();
				_ttype = DBL_SHARP;
			}
			else if (( true )&&(isPreprocPending())) {
				_ttype = SHARP;
			}
			else if (( true )&&(!isPreprocPossible())) {
				_ttype = SHARP;
			}
			else if (( true )&&(isPreprocPossible())) {
				
				_ttype = PREPROC_DIRECTIVE;
				setPreprocPossible(false);
				setPreprocPending(true);
				setPPDefinedAllowed(true);
				
				{
				_loop27:
				do {
					char LA1_6 = LA(1);
					char LA2_6 = LA(2);
					
					if ((LA1_6=='/') && (LA2_6=='*')) {
						mCOMMENT(false);
						if (matchError) {return ;}
					}
					else if ((LA1_6=='\t'||LA1_6=='\u000c'||LA1_6==' ') && (true)) {
						mSpace(false);
						if (matchError) {return ;}
					}
					else {
						break _loop27;
					}
					
				} while (true);
				}
				{
				char LA1_7 = LA(1);
				char LA2_7 = LA(2);
				
				boolean synPredMatched30 = false;
				if (((LA1_7=='i') && (LA2_7=='n'))) {
					int _m30 = mark();
					guessing++;
					guess30:  while (true) {
						{
						match("include");
						if (matchError) {break guess30;}
						mPostPPKwdChar_g(false);
						if (matchError) {break guess30;}
						}
					synPredMatched30 = true;
					break;} // guess30
					if (matchError) {
					   resetMatchError();
					}
					rewind(_m30);
					guessing--;
				}
				if ( synPredMatched30 ) {
					match("include");
					if (matchError) {return ;}
					_ttype = INCLUDE; setAfterInclude(true); setPPDefinedAllowed(false);
				}
				else {
					boolean synPredMatched32 = false;
					if (((LA1_7=='i') && (LA2_7=='n'))) {
						int _m32 = mark();
						guessing++;
						guess32:  while (true) {
							{
							match("include_next");
							if (matchError) {break guess32;}
							mPostPPKwdChar_g(false);
							if (matchError) {break guess32;}
							}
						synPredMatched32 = true;
						break;} // guess32
						if (matchError) {
						   resetMatchError();
						}
						rewind(_m32);
						guessing--;
					}
					if ( synPredMatched32 ) {
						match("include_next");
						if (matchError) {return ;}
						_ttype = INCLUDE_NEXT; setAfterInclude(true); setPPDefinedAllowed(false);
					}
					else {
						boolean synPredMatched34 = false;
						if (((LA1_7=='d') && (LA2_7=='e'))) {
							int _m34 = mark();
							guessing++;
							guess34:  while (true) {
								{
								match("define");
								if (matchError) {break guess34;}
								mPostPPKwdChar_g(false);
								if (matchError) {break guess34;}
								}
							synPredMatched34 = true;
							break;} // guess34
							if (matchError) {
							   resetMatchError();
							}
							rewind(_m34);
							guessing--;
						}
						if ( synPredMatched34 ) {
							match("define");
							if (matchError) {return ;}
							_ttype = DEFINE; setAfterDefine(true); setPPDefinedAllowed(false);
						}
						else {
							boolean synPredMatched36 = false;
							if (((LA1_7=='i') && (LA2_7=='f'))) {
								int _m36 = mark();
								guessing++;
								guess36:  while (true) {
									{
									match("ifdef");
									if (matchError) {break guess36;}
									mPostPPKwdChar_g(false);
									if (matchError) {break guess36;}
									}
								synPredMatched36 = true;
								break;} // guess36
								if (matchError) {
								   resetMatchError();
								}
								rewind(_m36);
								guessing--;
							}
							if ( synPredMatched36 ) {
								match("ifdef");
								if (matchError) {return ;}
								_ttype = IFDEF; setPPDefinedAllowed(false);
							}
							else {
								boolean synPredMatched38 = false;
								if (((LA1_7=='i') && (LA2_7=='f'))) {
									int _m38 = mark();
									guessing++;
									guess38:  while (true) {
										{
										match("ifndef");
										if (matchError) {break guess38;}
										mPostPPKwdChar_g(false);
										if (matchError) {break guess38;}
										}
									synPredMatched38 = true;
									break;} // guess38
									if (matchError) {
									   resetMatchError();
									}
									rewind(_m38);
									guessing--;
								}
								if ( synPredMatched38 ) {
									match("ifndef");
									if (matchError) {return ;}
									_ttype = IFNDEF; setPPDefinedAllowed(false);
								}
								else {
									boolean synPredMatched40 = false;
									if (((LA1_7=='i') && (LA2_7=='f'))) {
										int _m40 = mark();
										guessing++;
										guess40:  while (true) {
											{
											match("if");
											if (matchError) {break guess40;}
											mPostPPKwdChar_g(false);
											if (matchError) {break guess40;}
											}
										synPredMatched40 = true;
										break;} // guess40
										if (matchError) {
										   resetMatchError();
										}
										rewind(_m40);
										guessing--;
									}
									if ( synPredMatched40 ) {
										match("if");
										if (matchError) {return ;}
										_ttype = IF;
									}
									else {
										boolean synPredMatched42 = false;
										if (((LA1_7=='u') && (LA2_7=='n'))) {
											int _m42 = mark();
											guessing++;
											guess42:  while (true) {
												{
												match("undef");
												if (matchError) {break guess42;}
												mPostPPKwdChar_g(false);
												if (matchError) {break guess42;}
												}
											synPredMatched42 = true;
											break;} // guess42
											if (matchError) {
											   resetMatchError();
											}
											rewind(_m42);
											guessing--;
										}
										if ( synPredMatched42 ) {
											match("undef");
											if (matchError) {return ;}
											_ttype = UNDEF; setPPDefinedAllowed(false);
										}
										else {
											boolean synPredMatched44 = false;
											if (((LA1_7=='e') && (LA2_7=='l'))) {
												int _m44 = mark();
												guessing++;
												guess44:  while (true) {
													{
													match("elif");
													if (matchError) {break guess44;}
													mPostPPKwdChar_g(false);
													if (matchError) {break guess44;}
													}
												synPredMatched44 = true;
												break;} // guess44
												if (matchError) {
												   resetMatchError();
												}
												rewind(_m44);
												guessing--;
											}
											if ( synPredMatched44 ) {
												match("elif");
												if (matchError) {return ;}
												_ttype = ELIF;
											}
											else {
												boolean synPredMatched46 = false;
												if (((LA1_7=='e') && (LA2_7=='l'))) {
													int _m46 = mark();
													guessing++;
													guess46:  while (true) {
														{
														match("else");
														if (matchError) {break guess46;}
														mPostPPKwdChar_g(false);
														if (matchError) {break guess46;}
														}
													synPredMatched46 = true;
													break;} // guess46
													if (matchError) {
													   resetMatchError();
													}
													rewind(_m46);
													guessing--;
												}
												if ( synPredMatched46 ) {
													match("else");
													if (matchError) {return ;}
													_ttype = ELSE;
												}
												else {
													boolean synPredMatched48 = false;
													if (((LA1_7=='e') && (LA2_7=='n'))) {
														int _m48 = mark();
														guessing++;
														guess48:  while (true) {
															{
															match("endif");
															if (matchError) {break guess48;}
															mPostPPKwdChar_g(false);
															if (matchError) {break guess48;}
															}
														synPredMatched48 = true;
														break;} // guess48
														if (matchError) {
														   resetMatchError();
														}
														rewind(_m48);
														guessing--;
													}
													if ( synPredMatched48 ) {
														match("endif");
														if (matchError) {return ;}
														_ttype = ENDIF;
													}
													else {
														boolean synPredMatched50 = false;
														if (((LA1_7=='p') && (LA2_7=='r'))) {
															int _m50 = mark();
															guessing++;
															guess50:  while (true) {
																{
																match("pragma");
																if (matchError) {break guess50;}
																mPostPPKwdChar_g(false);
																if (matchError) {break guess50;}
																}
															synPredMatched50 = true;
															break;} // guess50
															if (matchError) {
															   resetMatchError();
															}
															rewind(_m50);
															guessing--;
														}
														if ( synPredMatched50 ) {
															match("pragma");
															if (matchError) {return ;}
															_ttype = PRAGMA; setPPDefinedAllowed(false);
														}
														else {
															boolean synPredMatched52 = false;
															if (((LA1_7=='e') && (LA2_7=='r'))) {
																int _m52 = mark();
																guessing++;
																guess52:  while (true) {
																	{
																	match("error");
																	if (matchError) {break guess52;}
																	mPostPPKwdChar_g(false);
																	if (matchError) {break guess52;}
																	}
																synPredMatched52 = true;
																break;} // guess52
																if (matchError) {
																   resetMatchError();
																}
																rewind(_m52);
																guessing--;
															}
															if ( synPredMatched52 ) {
																match("error");
																if (matchError) {return ;}
																_ttype = ERROR;
																mDirectiveBody(false);
																if (matchError) {return ;}
															}
															else {
																boolean synPredMatched54 = false;
																if (((LA1_7=='l') && (LA2_7=='i'))) {
																	int _m54 = mark();
																	guessing++;
																	guess54:  while (true) {
																		{
																		match("line");
																		if (matchError) {break guess54;}
																		mPostPPKwdChar_g(false);
																		if (matchError) {break guess54;}
																		}
																	synPredMatched54 = true;
																	break;} // guess54
																	if (matchError) {
																	   resetMatchError();
																	}
																	rewind(_m54);
																	guessing--;
																}
																if ( synPredMatched54 ) {
																	match("line");
																	if (matchError) {return ;}
																	_ttype = LINE;
																	mDirectiveBody(false);
																	if (matchError) {return ;}
																}
																else {
																	mDirectiveBody(false);
																	if (matchError) {return ;}
																}
																}}}}}}}}}}}}
																}
																{
																_loop56:
																do {
																	if ((LA(1)=='\t'||LA(1)=='\u000c'||LA(1)==' ')) {
																		mSpace(false);
																		if (matchError) {return ;}
																	}
																	else {
																		break _loop56;
																	}
																	
																} while (true);
																}
															}
															else {
																matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
															}
															
															}
															break;
														}
														default:
															{
																_ttype = MOD;
															}
														}
														}
														if (_createToken && _token==null && _ttype!=Token.SKIP) {
															_returnToken = makeToken(_ttype);
															// Const text, no need to set text
														}
													}
													
	//Call mode always false
	protected final void mSpace(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = Space;
		int _saveIndex;
		
		{
		switch ( LA(1)) {
		case ' ':
		{
			consume();
			break;
		}
		case '\t':
		{
			consume();
			break;
		}
		case '\u000c':
		{
			consume();
			break;
		}
		default:
		{
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mPostPPKwdChar(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PostPPKwdChar;
		int _saveIndex;
		
		char LA1_8 = LA(1);
		char LA2_8 = LA(2);
		
		if ((LA1_8=='\n'||LA1_8=='\r')) {
			mEndOfLine(false);
			if (matchError) {return ;}
		}
		else if (( true )&&( !Character.isJavaIdentifierPart(LA(1)) )) {
		}
		else if (( true )&&( LA(1) == EOF_CHAR)) {
		}
		else {
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mDirectiveBody(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DirectiveBody;
		int _saveIndex;
		
		{
		_loop148:
		do {
			char LA1_9 = LA(1);
			char LA2_9 = LA(2);
			
			if ((LA1_9=='\\') && (LA2_9=='\n'||LA2_9=='\r')) {
				consume();
				{
				char LA1_10 = LA(1);
				char LA2_10 = LA(2);
				
				if ((LA1_10=='\r') && (LA2_10=='\n')) {
					match("\r\n");
					if (matchError) {return ;}
					offset--;
				}
				else if ((LA1_10=='\r') && (true)) {
					match("\r");
					if (matchError) {return ;}
				}
				else if ((LA1_10=='\n')) {
					match("\n");
					if (matchError) {return ;}
				}
				else {
					matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
				}
				
				}
				deferredNewline();
			}
			else if ((_tokenSet_2.member(LA1_9)) && (true)) {
				{
				match(_tokenSet_2);
				if (matchError) {return ;}
				}
			}
			else {
				break _loop148;
			}
			
		} while (true);
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always true
	public final void mFIRST_NOT(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_NOT;
		int _saveIndex;
		
		match('!');
		if (matchError) {return ;}
		{
		if ((LA(1)=='=')) {
			consume();
			_ttype = NOTEQUAL;
		}
		else {
			_ttype = NOT;
		}
		
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mFIRST_AMPERSAND(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_AMPERSAND;
		int _saveIndex;
		
		match('&');
		if (matchError) {return ;}
		{
		switch ( LA(1)) {
		case '&':
		{
			consume();
			_ttype = AND;
			break;
		}
		case '=':
		{
			consume();
			_ttype = BITWISEANDEQUAL;
			break;
		}
		default:
			{
				_ttype = AMPERSAND;
			}
		}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always false
	protected final void mEndOfLine(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EndOfLine;
		int _saveIndex;
		
		{
		char LA1_11 = LA(1);
		char LA2_11 = LA(2);
		
		if ((LA1_11=='\r') && (LA2_11=='\n')) {
			match("\r\n");
			if (matchError) {return ;}
			offset--;
		}
		else if ((LA1_11=='\r') && (true)) {
			consume();
		}
		else if ((LA1_11=='\n')) {
			consume();
		}
		else {
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always true
	public final void mFIRST_OR(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_OR;
		int _saveIndex;
		
		match('|');
		if (matchError) {return ;}
		{
		switch ( LA(1)) {
		case '=':
		{
			consume();
			_ttype = BITWISEOREQUAL;
			break;
		}
		case '|':
		{
			consume();
			_ttype = OR;
			break;
		}
		default:
			{
				_ttype = BITWISEOR;
			}
		}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mFIRST_BITWISEXOR(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_BITWISEXOR;
		int _saveIndex;
		
		match('^');
		if (matchError) {return ;}
		{
		if ((LA(1)=='=')) {
			consume();
			_ttype = BITWISEXOREQUAL;
		}
		else {
			_ttype = BITWISEXOR;
		}
		
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mFIRST_COLON(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_COLON;
		int _saveIndex;
		
		match(':');
		if (matchError) {return ;}
		{
		switch ( LA(1)) {
		case ':':
		{
			consume();
			_ttype = SCOPE;
			break;
		}
		case '>':
		{
			consume();
			_ttype = RSQUARE;
			break;
		}
		default:
			{
				_ttype = COLON;
			}
		}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mFIRST_LESS(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_LESS;
		int _saveIndex;
		
		{
		char LA1_12 = LA(1);
		char LA2_12 = LA(2);
		
		boolean synPredMatched78 = false;
		if (((LA1_12=='<') && (true))) {
			int _m78 = mark();
			guessing++;
			guess78:  while (true) {
				{
				if (!(isCPlusPlus11()))
				{matchError=true;
				if (matchError) {break guess78;}}
				match("<::");
				if (matchError) {break guess78;}
				{
				match(_tokenSet_3);
				if (matchError) {break guess78;}
				}
				}
			synPredMatched78 = true;
			break;} // guess78
			if (matchError) {
			   resetMatchError();
			}
			rewind(_m78);
			guessing--;
		}
		if ( synPredMatched78 ) {
			consume();
			_ttype = LESSTHAN;
		}
		else if ((LA1_12=='<') && (true)) {
			{
			match('<');
			if (matchError) {return ;}
			{
			char LA1_13 = LA(1);
			char LA2_13 = LA(2);
			
			if ((LA1_13=='=') && (true)) {
				consume();
				_ttype = LESSTHANOREQUALTO;
			}
			else if ((LA1_13=='%') && (true)) {
				consume();
				_ttype = LCURLY;
			}
			else if ((LA1_13==':') && (true)) {
				consume();
				_ttype = LSQUARE;
			}
			else if ((LA1_13=='<') && (true)) {
				consume();
				{
				if ((LA(1)=='=')) {
					consume();
					_ttype = SHIFTLEFTEQUAL;
				}
				else {
					_ttype = SHIFTLEFT;
				}
				
				}
			}
			else if (( true )&&(isAfterInclude())) {
				mH_char_sequence(false);
				if (matchError) {return ;}
				{
				if ((LA(1)=='>')) {
					consume();
				}
				else {
				}
				
				}
				_ttype = SYS_INCLUDE_STRING;setAfterInclude(false);
			}
			else {
				_ttype = LESSTHAN;
			}
			
			}
			}
		}
		else {
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mH_char_sequence(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = H_char_sequence;
		int _saveIndex;
		
		{
		_loop106:
		do {
			if ((_tokenSet_4.member(LA(1)))) {
				{
				match(_tokenSet_4);
				if (matchError) {return ;}
				}
			}
			else {
				break _loop106;
			}
			
		} while (true);
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always true
	public final void mAT(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AT;
		int _saveIndex;
		
		match('@');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mGRAVE_ACCENT(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = GRAVE_ACCENT;
		int _saveIndex;
		
		match('`');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mFIRST_GREATER(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_GREATER;
		int _saveIndex;
		
		match('>');
		if (matchError) {return ;}
		{
		switch ( LA(1)) {
		case '=':
		{
			consume();
			_ttype = GREATERTHANOREQUALTO;
			break;
		}
		case '>':
		{
			consume();
			{
			if ((LA(1)=='=')) {
				consume();
				_ttype = SHIFTRIGHTEQUAL;
			}
			else {
				_ttype = SHIFTRIGHT;
			}
			
			}
			break;
		}
		default:
			{
				_ttype = GREATERTHAN;
			}
		}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mFIRST_MINUS(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_MINUS;
		int _saveIndex;
		
		match('-');
		if (matchError) {return ;}
		{
		switch ( LA(1)) {
		case '=':
		{
			consume();
			_ttype = MINUSEQUAL;
			break;
		}
		case '-':
		{
			consume();
			_ttype = MINUSMINUS;
			break;
		}
		case '>':
		{
			consume();
			{
			if ((LA(1)=='*')) {
				consume();
				_ttype = POINTERTOMBR;
			}
			else {
				_ttype = POINTERTO;
			}
			
			}
			break;
		}
		default:
			{
				_ttype = MINUS;
			}
		}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mFIRST_PLUS(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_PLUS;
		int _saveIndex;
		
		match('+');
		if (matchError) {return ;}
		{
		switch ( LA(1)) {
		case '=':
		{
			consume();
			_ttype = PLUSEQUAL;
			break;
		}
		case '+':
		{
			consume();
			_ttype = PLUSPLUS;
			break;
		}
		default:
			{
				_ttype = PLUS;
			}
		}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_returnToken = makeToken(_ttype);
			// Const text, no need to set text
		}
	}
	
	//Call mode always true
	public final void mWhitespace(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = Whitespace;
		int _saveIndex;
		
		
		_ttype = Token.SKIP;
		
		{
		switch ( LA(1)) {
		case '\t':  case '\u000c':  case ' ':
		{
			{
			switch ( LA(1)) {
			case ' ':
			{
				consume();
				break;
			}
			case '\t':
			{
				consume();
				break;
			}
			case '\u000c':
			{
				consume();
				break;
			}
			default:
			{
				matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
			}
			}
			}
			break;
		}
		case '\n':  case '\r':
		{
			{
			char LA1_14 = LA(1);
			char LA2_14 = LA(2);
			
			if ((LA1_14=='\r') && (LA2_14=='\n')) {
				match("\r\n");
				if (matchError) {return ;}
				offset--;
			}
			else if ((LA1_14=='\r') && (true)) {
				consume();
			}
			else if ((LA1_14=='\n')) {
				consume();
			}
			else {
				matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
			}
			
			}
			
			if (isPreprocPending()) {
			_ttype = END_PREPROC_DIRECTIVE;
			clearPrepProcFlags();
			}
			newline(); 
			
			break;
		}
		case '\\':
		{
			consume();
			{
			if ((LA(1)=='\n'||LA(1)=='\r')) {
				{
				char LA1_15 = LA(1);
				char LA2_15 = LA(2);
				
				if ((LA1_15=='\r') && (LA2_15=='\n')) {
					match("\r\n");
					if (matchError) {return ;}
					offset--;
				}
				else if ((LA1_15=='\r') && (true)) {
					match("\r");
					if (matchError) {return ;}
				}
				else if ((LA1_15=='\n')) {
					match("\n");
					if (matchError) {return ;}
				}
				else {
					matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
				}
				
				}
				_ttype = Token.SKIP; deferredNewline();
			}
			else {
				_ttype = BACK_SLASH;
			}
			
			}
			break;
		}
		default:
		{
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always true
	public final void mFIRST_QUOTATION(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIRST_QUOTATION;
		int _saveIndex;
		
		match('"');
		if (matchError) {return ;}
		{
		char LA1_16 = LA(1);
		char LA2_16 = LA(2);
		
		if (((_tokenSet_2.member(LA1_16)) && (true))&&(isAfterInclude())) {
			mQ_char_sequence(false);
			if (matchError) {return ;}
			match('"');
			if (matchError) {return ;}
			setAfterInclude(false);_ttype = INCLUDE_STRING;
		}
		else {
			mSTRING_LITERAL_BODY(false);
			if (matchError) {return ;}
			_ttype = STRING_LITERAL;
		}
		
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mQ_char_sequence(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = Q_char_sequence;
		int _saveIndex;
		
		{
		_loop110:
		do {
			if ((_tokenSet_5.member(LA(1)))) {
				{
				match(_tokenSet_5);
				if (matchError) {return ;}
				}
			}
			else {
				break _loop110;
			}
			
		} while (true);
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mSTRING_LITERAL_BODY(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = STRING_LITERAL_BODY;
		int _saveIndex;
		
		{
		_loop166:
		do {
			if ((LA(1)=='\\')) {
				consume();
				{
				char LA1_17 = LA(1);
				char LA2_17 = LA(2);
				
				if ((LA1_17=='\n'||LA1_17=='\r')) {
					{
					char LA1_18 = LA(1);
					char LA2_18 = LA(2);
					
					if ((LA1_18=='\r') && (LA2_18=='\n')) {
						match("\r\n");
						if (matchError) {return ;}
						offset--;
					}
					else if ((LA1_18=='\r') && (true)) {
						match("\r");
						if (matchError) {return ;}
					}
					else if ((LA1_18=='\n')) {
						match("\n");
						if (matchError) {return ;}
					}
					else {
						matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
					}
					
					}
					deferredNewline();
				}
				else if ((LA1_17=='"') && (true)) {
					consume();
				}
				else if ((LA1_17=='\\') && (true)) {
					consume();
				}
				else {
				}
				
				}
			}
			else if ((_tokenSet_6.member(LA(1)))) {
				{
				match(_tokenSet_6);
				if (matchError) {return ;}
				}
			}
			else {
				break _loop166;
			}
			
		} while (true);
		}
		{
		if ((LA(1)=='"')) {
			consume();
			{
			if ((_tokenSet_7.member(LA(1)))) {
				mSuffix(false);
				if (matchError) {return ;}
			}
			else {
			}
			
			}
		}
		else if (( true )&&(LA(1)=='\r'||LA(1)=='\n')) {
		}
		else {
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always true
	public final void mPREPROC_DIRECTIVE(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PREPROC_DIRECTIVE;
		int _saveIndex;
		
		match('#');
		if (matchError) {return ;}
		{
		char LA1_19 = LA(1);
		char LA2_19 = LA(2);
		
		if (((LA1_19=='#') && (true))&&(isPreprocPending())) {
			consume();
			_ttype = DBL_SHARP;
		}
		else if (( true )&&(isPreprocPending())) {
			_ttype = SHARP;
		}
		else if (( true )&&(!isPreprocPossible())) {
			_ttype = SHARP;
		}
		else if (( true )&&(isPreprocPossible())) {
			
			_ttype = PREPROC_DIRECTIVE;
			setPreprocPossible(false);
			setPreprocPending(true);
			setPPDefinedAllowed(true);
			
			{
			_loop114:
			do {
				char LA1_20 = LA(1);
				char LA2_20 = LA(2);
				
				if ((LA1_20=='/') && (LA2_20=='*')) {
					mCOMMENT(false);
					if (matchError) {return ;}
				}
				else if ((LA1_20=='\t'||LA1_20=='\u000c'||LA1_20==' ') && (true)) {
					mSpace(false);
					if (matchError) {return ;}
				}
				else {
					break _loop114;
				}
				
			} while (true);
			}
			{
			char LA1_21 = LA(1);
			char LA2_21 = LA(2);
			
			boolean synPredMatched117 = false;
			if (((LA1_21=='i') && (LA2_21=='n'))) {
				int _m117 = mark();
				guessing++;
				guess117:  while (true) {
					{
					match("include");
					if (matchError) {break guess117;}
					mPostPPKwdChar_g(false);
					if (matchError) {break guess117;}
					}
				synPredMatched117 = true;
				break;} // guess117
				if (matchError) {
				   resetMatchError();
				}
				rewind(_m117);
				guessing--;
			}
			if ( synPredMatched117 ) {
				match("include");
				if (matchError) {return ;}
				_ttype = INCLUDE; setAfterInclude(true); setPPDefinedAllowed(false);
			}
			else {
				boolean synPredMatched119 = false;
				if (((LA1_21=='i') && (LA2_21=='n'))) {
					int _m119 = mark();
					guessing++;
					guess119:  while (true) {
						{
						match("include_next");
						if (matchError) {break guess119;}
						mPostPPKwdChar_g(false);
						if (matchError) {break guess119;}
						}
					synPredMatched119 = true;
					break;} // guess119
					if (matchError) {
					   resetMatchError();
					}
					rewind(_m119);
					guessing--;
				}
				if ( synPredMatched119 ) {
					match("include_next");
					if (matchError) {return ;}
					_ttype = INCLUDE_NEXT; setAfterInclude(true); setPPDefinedAllowed(false);
				}
				else {
					boolean synPredMatched121 = false;
					if (((LA1_21=='d') && (LA2_21=='e'))) {
						int _m121 = mark();
						guessing++;
						guess121:  while (true) {
							{
							match("define");
							if (matchError) {break guess121;}
							mPostPPKwdChar_g(false);
							if (matchError) {break guess121;}
							}
						synPredMatched121 = true;
						break;} // guess121
						if (matchError) {
						   resetMatchError();
						}
						rewind(_m121);
						guessing--;
					}
					if ( synPredMatched121 ) {
						match("define");
						if (matchError) {return ;}
						_ttype = DEFINE; setAfterDefine(true); setPPDefinedAllowed(false);
					}
					else {
						boolean synPredMatched123 = false;
						if (((LA1_21=='i') && (LA2_21=='f'))) {
							int _m123 = mark();
							guessing++;
							guess123:  while (true) {
								{
								match("ifdef");
								if (matchError) {break guess123;}
								mPostPPKwdChar_g(false);
								if (matchError) {break guess123;}
								}
							synPredMatched123 = true;
							break;} // guess123
							if (matchError) {
							   resetMatchError();
							}
							rewind(_m123);
							guessing--;
						}
						if ( synPredMatched123 ) {
							match("ifdef");
							if (matchError) {return ;}
							_ttype = IFDEF; setPPDefinedAllowed(false);
						}
						else {
							boolean synPredMatched125 = false;
							if (((LA1_21=='i') && (LA2_21=='f'))) {
								int _m125 = mark();
								guessing++;
								guess125:  while (true) {
									{
									match("ifndef");
									if (matchError) {break guess125;}
									mPostPPKwdChar_g(false);
									if (matchError) {break guess125;}
									}
								synPredMatched125 = true;
								break;} // guess125
								if (matchError) {
								   resetMatchError();
								}
								rewind(_m125);
								guessing--;
							}
							if ( synPredMatched125 ) {
								match("ifndef");
								if (matchError) {return ;}
								_ttype = IFNDEF; setPPDefinedAllowed(false);
							}
							else {
								boolean synPredMatched127 = false;
								if (((LA1_21=='i') && (LA2_21=='f'))) {
									int _m127 = mark();
									guessing++;
									guess127:  while (true) {
										{
										match("if");
										if (matchError) {break guess127;}
										mPostPPKwdChar_g(false);
										if (matchError) {break guess127;}
										}
									synPredMatched127 = true;
									break;} // guess127
									if (matchError) {
									   resetMatchError();
									}
									rewind(_m127);
									guessing--;
								}
								if ( synPredMatched127 ) {
									match("if");
									if (matchError) {return ;}
									_ttype = IF;
								}
								else {
									boolean synPredMatched129 = false;
									if (((LA1_21=='u') && (LA2_21=='n'))) {
										int _m129 = mark();
										guessing++;
										guess129:  while (true) {
											{
											match("undef");
											if (matchError) {break guess129;}
											mPostPPKwdChar_g(false);
											if (matchError) {break guess129;}
											}
										synPredMatched129 = true;
										break;} // guess129
										if (matchError) {
										   resetMatchError();
										}
										rewind(_m129);
										guessing--;
									}
									if ( synPredMatched129 ) {
										match("undef");
										if (matchError) {return ;}
										_ttype = UNDEF; setPPDefinedAllowed(false);
									}
									else {
										boolean synPredMatched131 = false;
										if (((LA1_21=='e') && (LA2_21=='l'))) {
											int _m131 = mark();
											guessing++;
											guess131:  while (true) {
												{
												match("elif");
												if (matchError) {break guess131;}
												mPostPPKwdChar_g(false);
												if (matchError) {break guess131;}
												}
											synPredMatched131 = true;
											break;} // guess131
											if (matchError) {
											   resetMatchError();
											}
											rewind(_m131);
											guessing--;
										}
										if ( synPredMatched131 ) {
											match("elif");
											if (matchError) {return ;}
											_ttype = ELIF;
										}
										else {
											boolean synPredMatched133 = false;
											if (((LA1_21=='e') && (LA2_21=='l'))) {
												int _m133 = mark();
												guessing++;
												guess133:  while (true) {
													{
													match("else");
													if (matchError) {break guess133;}
													mPostPPKwdChar_g(false);
													if (matchError) {break guess133;}
													}
												synPredMatched133 = true;
												break;} // guess133
												if (matchError) {
												   resetMatchError();
												}
												rewind(_m133);
												guessing--;
											}
											if ( synPredMatched133 ) {
												match("else");
												if (matchError) {return ;}
												_ttype = ELSE;
											}
											else {
												boolean synPredMatched135 = false;
												if (((LA1_21=='e') && (LA2_21=='n'))) {
													int _m135 = mark();
													guessing++;
													guess135:  while (true) {
														{
														match("endif");
														if (matchError) {break guess135;}
														mPostPPKwdChar_g(false);
														if (matchError) {break guess135;}
														}
													synPredMatched135 = true;
													break;} // guess135
													if (matchError) {
													   resetMatchError();
													}
													rewind(_m135);
													guessing--;
												}
												if ( synPredMatched135 ) {
													match("endif");
													if (matchError) {return ;}
													_ttype = ENDIF;
												}
												else {
													boolean synPredMatched137 = false;
													if (((LA1_21=='p') && (LA2_21=='r'))) {
														int _m137 = mark();
														guessing++;
														guess137:  while (true) {
															{
															match("pragma");
															if (matchError) {break guess137;}
															mPostPPKwdChar_g(false);
															if (matchError) {break guess137;}
															}
														synPredMatched137 = true;
														break;} // guess137
														if (matchError) {
														   resetMatchError();
														}
														rewind(_m137);
														guessing--;
													}
													if ( synPredMatched137 ) {
														match("pragma");
														if (matchError) {return ;}
														_ttype = PRAGMA; setPPDefinedAllowed(false);
													}
													else {
														boolean synPredMatched139 = false;
														if (((LA1_21=='e') && (LA2_21=='r'))) {
															int _m139 = mark();
															guessing++;
															guess139:  while (true) {
																{
																match("error");
																if (matchError) {break guess139;}
																mPostPPKwdChar_g(false);
																if (matchError) {break guess139;}
																}
															synPredMatched139 = true;
															break;} // guess139
															if (matchError) {
															   resetMatchError();
															}
															rewind(_m139);
															guessing--;
														}
														if ( synPredMatched139 ) {
															match("error");
															if (matchError) {return ;}
															_ttype = ERROR;
															mDirectiveBody(false);
															if (matchError) {return ;}
														}
														else {
															boolean synPredMatched141 = false;
															if (((LA1_21=='l') && (LA2_21=='i'))) {
																int _m141 = mark();
																guessing++;
																guess141:  while (true) {
																	{
																	match("line");
																	if (matchError) {break guess141;}
																	mPostPPKwdChar_g(false);
																	if (matchError) {break guess141;}
																	}
																synPredMatched141 = true;
																break;} // guess141
																if (matchError) {
																   resetMatchError();
																}
																rewind(_m141);
																guessing--;
															}
															if ( synPredMatched141 ) {
																match("line");
																if (matchError) {return ;}
																_ttype = LINE;
																mDirectiveBody(false);
																if (matchError) {return ;}
															}
															else {
																mDirectiveBody(false);
																if (matchError) {return ;}
															}
															}}}}}}}}}}}}
															}
															{
															_loop143:
															do {
																if ((LA(1)=='\t'||LA(1)=='\u000c'||LA(1)==' ')) {
																	mSpace(false);
																	if (matchError) {return ;}
																}
																else {
																	break _loop143;
																}
																
															} while (true);
															}
														}
														else {
															matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
														}
														
														}
														if (_createToken && _token==null && _ttype!=Token.SKIP) {
															_token = makeToken(_ttype);
															if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
														}
														_returnToken = _token;
													}
													
	//Call mode normal
	public final void mCHAR_LITERAL(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CHAR_LITERAL;
		int _saveIndex;
		
		match('\'');
		if (matchError) {return ;}
		mCHAR_LITERAL_BODY(false);
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mCHAR_LITERAL_BODY(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CHAR_LITERAL_BODY;
		int _saveIndex;
		
		{
		_loop157:
		do {
			if ((LA(1)=='\\')) {
				consume();
				{
				char LA1_22 = LA(1);
				char LA2_22 = LA(2);
				
				if ((LA1_22=='\n'||LA1_22=='\r')) {
					{
					char LA1_23 = LA(1);
					char LA2_23 = LA(2);
					
					if ((LA1_23=='\r') && (LA2_23=='\n')) {
						match("\r\n");
						if (matchError) {return ;}
						offset--;
					}
					else if ((LA1_23=='\r') && (true)) {
						match("\r");
						if (matchError) {return ;}
					}
					else if ((LA1_23=='\n')) {
						match("\n");
						if (matchError) {return ;}
					}
					else {
						matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
					}
					
					}
					deferredNewline();
				}
				else if ((LA1_22=='\'') && (true)) {
					consume();
				}
				else if ((LA1_22=='\\') && (true)) {
					consume();
				}
				else {
				}
				
				}
			}
			else if ((_tokenSet_8.member(LA(1)))) {
				{
				match(_tokenSet_8);
				if (matchError) {return ;}
				}
			}
			else {
				break _loop157;
			}
			
		} while (true);
		}
		{
		if ((LA(1)=='\'')) {
			consume();
			{
			if ((_tokenSet_7.member(LA(1)))) {
				mSuffix(false);
				if (matchError) {return ;}
			}
			else {
			}
			
			}
		}
		else if (( true )&&(LA(1)=='\r'||LA(1)=='\n')) {
		}
		else {
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mSuffix(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = Suffix;
		int _saveIndex;
		
		{
		{
		switch ( LA(1)) {
		case 'a':  case 'b':  case 'c':  case 'd':
		case 'e':  case 'f':  case 'g':  case 'h':
		case 'i':  case 'j':  case 'k':  case 'l':
		case 'm':  case 'n':  case 'o':  case 'p':
		case 'q':  case 'r':  case 's':  case 't':
		case 'u':  case 'v':  case 'w':  case 'x':
		case 'y':  case 'z':
		{
			consume();
			break;
		}
		case 'A':  case 'B':  case 'C':  case 'D':
		case 'E':  case 'F':  case 'G':  case 'H':
		case 'I':  case 'J':  case 'K':  case 'L':
		case 'M':  case 'N':  case 'O':  case 'P':
		case 'Q':  case 'R':  case 'S':  case 'T':
		case 'U':  case 'V':  case 'W':  case 'X':
		case 'Y':  case 'Z':
		{
			consume();
			break;
		}
		case '_':
		{
			consume();
			break;
		}
		default:
		{
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		}
		}
		{
		_loop205:
		do {
			switch ( LA(1)) {
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				consume();
				break;
			}
			case 'A':  case 'B':  case 'C':  case 'D':
			case 'E':  case 'F':  case 'G':  case 'H':
			case 'I':  case 'J':  case 'K':  case 'L':
			case 'M':  case 'N':  case 'O':  case 'P':
			case 'Q':  case 'R':  case 'S':  case 'T':
			case 'U':  case 'V':  case 'W':  case 'X':
			case 'Y':  case 'Z':
			{
				consume();
				break;
			}
			case '_':
			{
				consume();
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				consume();
				break;
			}
			default:
			{
				break _loop205;
			}
			}
		} while (true);
		}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mSTRING_LITERAL(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = STRING_LITERAL;
		int _saveIndex;
		
		match('"');
		if (matchError) {return ;}
		mSTRING_LITERAL_BODY(false);
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mRAW_STRING_LITERAL(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RAW_STRING_LITERAL;
		int _saveIndex;
		
		match('"');
		if (matchError) {return ;}
		mRAW_STRING_LITERAL_BODY(false);
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mRAW_STRING_LITERAL_BODY(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RAW_STRING_LITERAL_BODY;
		int _saveIndex;
		
		boolean end = false;
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = null; 
		
		
		{
		{
		_loop174:
		do {
			if ((_tokenSet_9.member(LA(1)))) {
				{
				match(_tokenSet_9);
				if (matchError) {return ;}
				}
				s1.append(LA(0));
			}
			else {
				break _loop174;
			}
			
		} while (true);
		}
		}
		match('(');
		if (matchError) {return ;}
		{
		_loop188:
		do {
			char LA1_24 = LA(1);
			char LA2_24 = LA(2);
			
			if ((LA1_24=='\n'||LA1_24=='\r')) {
				{
				switch ( LA(1)) {
				case '\r':
				{
					match("\r");
					if (matchError) {return ;}
					{
					char LA1_25 = LA(1);
					char LA2_25 = LA(2);
					
					if ((LA1_25=='\n') && (true)) {
						match("\n");
						if (matchError) {return ;}
						offset--;
					}
					else {
					}
					
					}
					break;
				}
				case '\n':
				{
					match("\n");
					if (matchError) {return ;}
					break;
				}
				default:
				{
					matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
				}
				}
				}
				deferredNewline();
			}
			else {
				boolean synPredMatched182 = false;
				if (((LA1_24==')') && (true))) {
					int _m182 = mark();
					guessing++;
					guess182:  while (true) {
						{
						match(')');
						if (matchError) {break guess182;}
						{
						_loop181:
						do {
							if ((_tokenSet_9.member(LA(1)))) {
								{
								match(_tokenSet_9);
								if (matchError) {break guess182;}
								}
							}
							else {
								break _loop181;
							}
							
						} while (true);
						}
						}
					synPredMatched182 = true;
					break;} // guess182
					if (matchError) {
					   resetMatchError();
					}
					rewind(_m182);
					guessing--;
				}
				if ( synPredMatched182 ) {
					s2 = new StringBuilder();
					match(')');
					if (matchError) {return ;}
					{
					_loop185:
					do {
						char LA1_26 = LA(1);
						char LA2_26 = LA(2);
						
						if ((_tokenSet_9.member(LA1_26)) && (true)) {
							{
							match(_tokenSet_9);
							if (matchError) {return ;}
							}
							s2.append(LA(0));
						}
						else {
							break _loop185;
						}
						
					} while (true);
					}
					{
					char LA1_27 = LA(1);
					char LA2_27 = LA(2);
					
					if (((LA1_27=='"') && (true))&&( LA(1)=='"' && !s1.toString().equals(s2.toString()))) {
						consume();
					}
					else {
						end = LA(1)=='"';
					}
					
					}
					s2 = null;
				}
				else if ((_tokenSet_5.member(LA1_24)) && (true)) {
					{
					match(_tokenSet_5);
					if (matchError) {return ;}
					}
				}
				else if (((LA1_24=='"') && (true))&&( !end )) {
					consume();
				}
				else {
					break _loop188;
				}
				}
			} while (true);
			}
			{
			if ((LA(1)=='"')) {
				consume();
				{
				if ((_tokenSet_7.member(LA(1)))) {
					mSuffix(false);
					if (matchError) {return ;}
				}
				else {
				}
				
				}
			}
			else if (( true )&&(LA(1)=='\r'||LA(1)=='\n')) {
			}
			else {
				matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
			}
			
			}
			if (_createToken && _token==null && _ttype!=Token.SKIP) {
				_token = makeToken(_ttype);
				if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
			}
			_returnToken = _token;
		}
		
	//Call mode normal
	protected final void mEscape(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = Escape;
		int _saveIndex;
		
		match('\\');
		if (matchError) {return ;}
		{
		switch ( LA(1)) {
		case 'a':
		{
			consume();
			break;
		}
		case 'b':
		{
			consume();
			break;
		}
		case 'e':
		{
			consume();
			break;
		}
		case 'f':
		{
			consume();
			break;
		}
		case 'n':
		{
			consume();
			break;
		}
		case 'r':
		{
			consume();
			break;
		}
		case 't':
		{
			consume();
			break;
		}
		case 'v':
		{
			consume();
			break;
		}
		case '"':
		{
			consume();
			break;
		}
		case '\'':
		{
			consume();
			break;
		}
		case '\\':
		{
			consume();
			break;
		}
		case '?':
		{
			consume();
			break;
		}
		case '%':
		{
			consume();
			break;
		}
		case '0':  case '1':  case '2':  case '3':
		{
			{
			matchRange('0','3');
			if (matchError) {return ;}
			}
			{
			char LA1_28 = LA(1);
			char LA2_28 = LA(2);
			
			if (((LA1_28 >= '0' && LA1_28 <= '9')) && (true)) {
				mDigit(false);
				if (matchError) {return ;}
			}
			else {
			}
			
			}
			{
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				mDigit(false);
				if (matchError) {return ;}
			}
			else {
			}
			
			}
			break;
		}
		case '4':  case '5':  case '6':  case '7':
		{
			{
			matchRange('4','7');
			if (matchError) {return ;}
			}
			{
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				mDigit(false);
				if (matchError) {return ;}
			}
			else {
			}
			
			}
			break;
		}
		case 'x':
		{
			consume();
			{
			int _cnt199=0;
			_loop199:
			do {
				switch ( LA(1)) {
				case '0':  case '1':  case '2':  case '3':
				case '4':  case '5':  case '6':  case '7':
				case '8':  case '9':
				{
					mDigit(false);
					if (matchError) {return ;}
					break;
				}
				case 'a':  case 'b':  case 'c':  case 'd':
				case 'e':  case 'f':
				{
					consume();
					break;
				}
				case 'A':  case 'B':  case 'C':  case 'D':
				case 'E':  case 'F':
				{
					consume();
					break;
				}
				default:
				{
					if ( _cnt199>=1 ) { break _loop199; } else {matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}}
				}
				}
				_cnt199++;
			} while (true);
			}
			break;
		}
		default:
		{
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mDigit(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = Digit;
		int _saveIndex;
		
		matchRange('0','9');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mExponent(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = Exponent;
		int _saveIndex;
		
		{
		switch ( LA(1)) {
		case 'e':
		{
			consume();
			break;
		}
		case 'E':
		{
			consume();
			break;
		}
		default:
		{
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		}
		}
		{
		switch ( LA(1)) {
		case '+':
		{
			consume();
			break;
		}
		case '-':
		{
			consume();
			break;
		}
		default:
			{
			}
		}
		}
		{
		_loop210:
		do {
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				mDigit(false);
				if (matchError) {return ;}
			}
			else {
				break _loop210;
			}
			
		} while (true);
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always true
	public final void mNUMBER(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NUMBER;
		int _saveIndex;
		
		{
		char LA1_29 = LA(1);
		char LA2_29 = LA(2);
		
		boolean synPredMatched217 = false;
		if ((((LA1_29 >= '0' && LA1_29 <= '9')) && (_tokenSet_10.member(LA2_29)))) {
			int _m217 = mark();
			guessing++;
			guess217:  while (true) {
				{
				{
				int _cnt215=0;
				_loop215:
				do {
					if (((LA(1) >= '0' && LA(1) <= '9'))) {
						mDigit_g(false);
						if (matchError) {break guess217;}
					}
					else {
						if ( _cnt215>=1 ) { break _loop215; } else {matchError=true;if (matchError) {break guess217;}}
					}
					
					_cnt215++;
				} while (true);
				}
				{
				switch ( LA(1)) {
				case '.':
				{
					consume();
					break;
				}
				case 'e':
				{
					consume();
					break;
				}
				case 'E':
				{
					consume();
					break;
				}
				default:
				{
					matchError=true;if (matchError) {break guess217;}
				}
				}
				}
				}
			synPredMatched217 = true;
			break;} // guess217
			if (matchError) {
			   resetMatchError();
			}
			rewind(_m217);
			guessing--;
		}
		if ( synPredMatched217 ) {
			{
			int _cnt219=0;
			_loop219:
			do {
				if (((LA(1) >= '0' && LA(1) <= '9'))) {
					mDigit(false);
					if (matchError) {return ;}
				}
				else {
					if ( _cnt219>=1 ) { break _loop219; } else {matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}}
				}
				
				_cnt219++;
			} while (true);
			}
			{
			switch ( LA(1)) {
			case '.':
			{
				consume();
				{
				_loop222:
				do {
					if (((LA(1) >= '0' && LA(1) <= '9'))) {
						mDigit(false);
						if (matchError) {return ;}
					}
					else {
						break _loop222;
					}
					
				} while (true);
				}
				{
				char LA1_30 = LA(1);
				char LA2_30 = LA(2);
				
				if ((LA1_30=='E'||LA1_30=='e') && (true)) {
					mExponent(false);
					if (matchError) {return ;}
				}
				else {
				}
				
				}
				_ttype = FLOATONE;
				break;
			}
			case 'E':  case 'e':
			{
				mExponent(false);
				if (matchError) {return ;}
				_ttype = FLOATTWO;
				break;
			}
			default:
			{
				matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
			}
			}
			}
			{
			if ((_tokenSet_7.member(LA(1)))) {
				mSuffix(false);
				if (matchError) {return ;}
			}
			else {
			}
			
			}
		}
		else if ((LA1_29=='.')) {
			consume();
			{
			switch ( LA(1)) {
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				{
				int _cnt227=0;
				_loop227:
				do {
					if (((LA(1) >= '0' && LA(1) <= '9'))) {
						mDigit(false);
						if (matchError) {return ;}
					}
					else {
						if ( _cnt227>=1 ) { break _loop227; } else {matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}}
					}
					
					_cnt227++;
				} while (true);
				}
				{
				char LA1_31 = LA(1);
				char LA2_31 = LA(2);
				
				if ((LA1_31=='E'||LA1_31=='e') && (true)) {
					mExponent(false);
					if (matchError) {return ;}
				}
				else {
				}
				
				}
				_ttype = FLOATONE;
				{
				if ((_tokenSet_7.member(LA(1)))) {
					mSuffix(false);
					if (matchError) {return ;}
				}
				else {
				}
				
				}
				break;
			}
			case '*':
			{
				consume();
				_ttype = DOTMBR;
				break;
			}
			default:
				if (((LA(1)=='.'))&&((LA(2)=='.'))) {
					match("..");
					if (matchError) {return ;}
					_ttype = ELLIPSIS;
				}
				else {
					_ttype = DOT;
				}
			}
			}
		}
		else if (((LA1_29 >= '1' && LA1_29 <= '9')) && (true)) {
			consume();
			{
			_loop231:
			do {
				if (((LA(1) >= '0' && LA(1) <= '9'))) {
					mDigit(false);
					if (matchError) {return ;}
				}
				else {
					break _loop231;
				}
				
			} while (true);
			}
			_ttype = DECIMALINT;
			{
			if ((_tokenSet_7.member(LA(1)))) {
				mSuffix(false);
				if (matchError) {return ;}
			}
			else {
			}
			
			}
		}
		else if ((LA1_29=='0') && (true)) {
			{
			match('0');
			if (matchError) {return ;}
			{
			char LA1_32 = LA(1);
			char LA2_32 = LA(2);
			
			boolean synPredMatched236 = false;
			if (((LA1_32=='X'||LA1_32=='x') && (true))) {
				int _m236 = mark();
				guessing++;
				guess236:  while (true) {
					{
					switch ( LA(1)) {
					case 'x':
					{
						consume();
						break;
					}
					case 'X':
					{
						consume();
						break;
					}
					default:
					{
						matchError=true;if (matchError) {break guess236;}
					}
					}
					}
				synPredMatched236 = true;
				break;} // guess236
				if (matchError) {
				   resetMatchError();
				}
				rewind(_m236);
				guessing--;
			}
			if ( synPredMatched236 ) {
				{
				switch ( LA(1)) {
				case 'x':
				{
					consume();
					break;
				}
				case 'X':
				{
					consume();
					break;
				}
				default:
				{
					matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
				}
				}
				}
				{
				_loop239:
				do {
					char LA1_33 = LA(1);
					char LA2_33 = LA(2);
					
					if (((LA1_33 >= 'a' && LA1_33 <= 'f')) && (true)) {
						consume();
					}
					else if (((LA1_33 >= 'A' && LA1_33 <= 'F')) && (true)) {
						consume();
					}
					else if (((LA1_33 >= '0' && LA1_33 <= '9'))) {
						mDigit(false);
						if (matchError) {return ;}
					}
					else {
						break _loop239;
					}
					
				} while (true);
				}
				_ttype = HEXADECIMALINT;
			}
			else {
				boolean synPredMatched241 = false;
				if (((LA1_32=='B'||LA1_32=='b') && (true))) {
					int _m241 = mark();
					guessing++;
					guess241:  while (true) {
						{
						switch ( LA(1)) {
						case 'b':
						{
							consume();
							break;
						}
						case 'B':
						{
							consume();
							break;
						}
						default:
						{
							matchError=true;if (matchError) {break guess241;}
						}
						}
						}
					synPredMatched241 = true;
					break;} // guess241
					if (matchError) {
					   resetMatchError();
					}
					rewind(_m241);
					guessing--;
				}
				if ( synPredMatched241 ) {
					{
					switch ( LA(1)) {
					case 'b':
					{
						consume();
						break;
					}
					case 'B':
					{
						consume();
						break;
					}
					default:
					{
						matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
					}
					}
					}
					{
					_loop244:
					do {
						switch ( LA(1)) {
						case '0':
						{
							consume();
							break;
						}
						case '1':
						{
							consume();
							break;
						}
						default:
						{
							break _loop244;
						}
						}
					} while (true);
					}
					_ttype = BINARYINT;
				}
				else {
					{
					_loop246:
					do {
						if (((LA(1) >= '0' && LA(1) <= '7'))) {
							consume();
						}
						else {
							break _loop246;
						}
						
					} while (true);
					}
					_ttype = OCTALINT;
				}
				}
				}
				}
				{
				if ((_tokenSet_7.member(LA(1)))) {
					mSuffix(false);
					if (matchError) {return ;}
				}
				else {
				}
				
				}
			}
			else {
				matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
			}
			
			}
			if (_createToken && _token==null && _ttype!=Token.SKIP) {
				_token = makeToken(_ttype);
				if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
			}
			_returnToken = _token;
		}
		
	//Call mode always true
	public final void mID_LIKE(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ID_LIKE;
		int _saveIndex;
		
		char LA1_34 = LA(1);
		char LA2_34 = LA(2);
		
		boolean synPredMatched250 = false;
		if ((((LA1_34=='d') && (LA2_34=='e'))&&(isPreprocPending()))) {
			int _m250 = mark();
			guessing++;
			guess250:  while (true) {
				{
				if (!(isPPDefinedAllowed()))
				{matchError=true;
				if (matchError) {break guess250;}}
				match("defined");
				if (matchError) {break guess250;}
				}
			synPredMatched250 = true;
			break;} // guess250
			if (matchError) {
			   resetMatchError();
			}
			rewind(_m250);
			guessing--;
		}
		if ( synPredMatched250 ) {
			match("defined");
			if (matchError) {return ;}
			{
			char LA1_35 = LA(1);
			char LA2_35 = LA(2);
			
			boolean synPredMatched253 = false;
			if (( true )) {
				int _m253 = mark();
				guessing++;
				guess253:  while (true) {
					{
					if ((LA(1)=='(')) {
						match("(");
						if (matchError) {break guess253;}
					}
					else {
						mPostPPKwdChar_g(false);
						if (matchError) {break guess253;}
					}
					
					}
				synPredMatched253 = true;
				break;} // guess253
				if (matchError) {
				   resetMatchError();
				}
				rewind(_m253);
				guessing--;
			}
			if ( synPredMatched253 ) {
				setAfterPPDefined(true); _ttype = DEFINED;
			}
			else {
				
				if (isAfterPPDefined()) {
				setAfterPPDefined(false);
				_ttype = ID_DEFINED;
				} else {
				_ttype = IDENT; 
				}
				
			}
			
			}
		}
		else {
			boolean synPredMatched255 = false;
			if (((LA1_34=='L') && (LA2_34=='R'))) {
				int _m255 = mark();
				guessing++;
				guess255:  while (true) {
					{
					match('L');
					if (matchError) {break guess255;}
					match('R');
					if (matchError) {break guess255;}
					match('"');
					if (matchError) {break guess255;}
					}
				synPredMatched255 = true;
				break;} // guess255
				if (matchError) {
				   resetMatchError();
				}
				rewind(_m255);
				guessing--;
			}
			if ( synPredMatched255 ) {
				consume();
				consume();
				mRAW_STRING_LITERAL(false);
				if (matchError) {return ;}
				_ttype = STRING_LITERAL;
			}
			else {
				boolean synPredMatched257 = false;
				if (((LA1_34=='u') && (LA2_34=='R'))) {
					int _m257 = mark();
					guessing++;
					guess257:  while (true) {
						{
						match('u');
						if (matchError) {break guess257;}
						match('R');
						if (matchError) {break guess257;}
						match('"');
						if (matchError) {break guess257;}
						}
					synPredMatched257 = true;
					break;} // guess257
					if (matchError) {
					   resetMatchError();
					}
					rewind(_m257);
					guessing--;
				}
				if ( synPredMatched257 ) {
					consume();
					consume();
					mRAW_STRING_LITERAL(false);
					if (matchError) {return ;}
					_ttype = STRING_LITERAL;
				}
				else {
					boolean synPredMatched259 = false;
					if (((LA1_34=='U') && (LA2_34=='R'))) {
						int _m259 = mark();
						guessing++;
						guess259:  while (true) {
							{
							match('U');
							if (matchError) {break guess259;}
							match('R');
							if (matchError) {break guess259;}
							match('"');
							if (matchError) {break guess259;}
							}
						synPredMatched259 = true;
						break;} // guess259
						if (matchError) {
						   resetMatchError();
						}
						rewind(_m259);
						guessing--;
					}
					if ( synPredMatched259 ) {
						consume();
						consume();
						mRAW_STRING_LITERAL(false);
						if (matchError) {return ;}
						_ttype = STRING_LITERAL;
					}
					else {
						boolean synPredMatched261 = false;
						if (((LA1_34=='u') && (LA2_34=='8'))) {
							int _m261 = mark();
							guessing++;
							guess261:  while (true) {
								{
								match('u');
								if (matchError) {break guess261;}
								match('8');
								if (matchError) {break guess261;}
								match('R');
								if (matchError) {break guess261;}
								match('"');
								if (matchError) {break guess261;}
								}
							synPredMatched261 = true;
							break;} // guess261
							if (matchError) {
							   resetMatchError();
							}
							rewind(_m261);
							guessing--;
						}
						if ( synPredMatched261 ) {
							consume();
							consume();
							match('R');
							if (matchError) {return ;}
							mRAW_STRING_LITERAL(false);
							if (matchError) {return ;}
							_ttype = STRING_LITERAL;
						}
						else {
							boolean synPredMatched263 = false;
							if (((LA1_34=='u') && (LA2_34=='8'))) {
								int _m263 = mark();
								guessing++;
								guess263:  while (true) {
									{
									match('u');
									if (matchError) {break guess263;}
									match('8');
									if (matchError) {break guess263;}
									match('"');
									if (matchError) {break guess263;}
									}
								synPredMatched263 = true;
								break;} // guess263
								if (matchError) {
								   resetMatchError();
								}
								rewind(_m263);
								guessing--;
							}
							if ( synPredMatched263 ) {
								consume();
								consume();
								mSTRING_LITERAL(false);
								if (matchError) {return ;}
								_ttype = STRING_LITERAL;
							}
							else if ((LA1_34=='L') && (LA2_34=='"'||LA2_34=='\'')) {
								consume();
								{
								switch ( LA(1)) {
								case '\'':
								{
									mCHAR_LITERAL(false);
									if (matchError) {return ;}
									_ttype = CHAR_LITERAL;
									break;
								}
								case '"':
								{
									mSTRING_LITERAL(false);
									if (matchError) {return ;}
									_ttype = STRING_LITERAL;
									break;
								}
								default:
								{
									matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
								}
								}
								}
							}
							else if ((LA1_34=='u') && (LA2_34=='"'||LA2_34=='\'')) {
								consume();
								{
								switch ( LA(1)) {
								case '\'':
								{
									mCHAR_LITERAL(false);
									if (matchError) {return ;}
									_ttype = CHAR_LITERAL;
									break;
								}
								case '"':
								{
									mSTRING_LITERAL(false);
									if (matchError) {return ;}
									_ttype = STRING_LITERAL;
									break;
								}
								default:
								{
									matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
								}
								}
								}
							}
							else if ((LA1_34=='U') && (LA2_34=='"'||LA2_34=='\'')) {
								consume();
								{
								switch ( LA(1)) {
								case '\'':
								{
									mCHAR_LITERAL(false);
									if (matchError) {return ;}
									_ttype = CHAR_LITERAL;
									break;
								}
								case '"':
								{
									mSTRING_LITERAL(false);
									if (matchError) {return ;}
									_ttype = STRING_LITERAL;
									break;
								}
								default:
								{
									matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
								}
								}
								}
							}
							else if ((LA1_34=='R') && (LA2_34=='"')) {
								consume();
								mRAW_STRING_LITERAL(false);
								if (matchError) {return ;}
								_ttype = STRING_LITERAL;
							}
							else if (((_tokenSet_1.member(LA1_34)) && (true))&&(!isAfterPPDefined())) {
								mIdentifier(false);
								if (matchError) {return ;}
								
								if (isAfterDefine()) {
								setAfterDefine(false);
								if (LA(1) == '(') {
								setFunLikeMacro(true);
								}
								}
								_ttype = IDENT;
								
							}
							else if ((_tokenSet_1.member(LA1_34)) && (true)) {
								mIdentifier(false);
								if (matchError) {return ;}
								setAfterPPDefined(false);_ttype = ID_DEFINED;
							}
							else {
								matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
							}
							}}}}}
							if (_createToken && _token==null && _ttype!=Token.SKIP) {
								_token = makeToken(_ttype);
								if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
							}
							_returnToken = _token;
						}
						
	//Call mode always false
	protected final void mIdentifier(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = Identifier;
		int _saveIndex;
		
		{
		{
		switch ( LA(1)) {
		case 'a':  case 'b':  case 'c':  case 'd':
		case 'e':  case 'f':  case 'g':  case 'h':
		case 'i':  case 'j':  case 'k':  case 'l':
		case 'm':  case 'n':  case 'o':  case 'p':
		case 'q':  case 'r':  case 's':  case 't':
		case 'u':  case 'v':  case 'w':  case 'x':
		case 'y':  case 'z':
		{
			consume();
			break;
		}
		case 'A':  case 'B':  case 'C':  case 'D':
		case 'E':  case 'F':  case 'G':  case 'H':
		case 'I':  case 'J':  case 'K':  case 'L':
		case 'M':  case 'N':  case 'O':  case 'P':
		case 'Q':  case 'R':  case 'S':  case 'T':
		case 'U':  case 'V':  case 'W':  case 'X':
		case 'Y':  case 'Z':
		{
			consume();
			break;
		}
		case '_':
		{
			consume();
			break;
		}
		case '$':
		{
			consume();
			break;
		}
		default:
		{
			matchError=true;matchException=new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());if (matchError) {return ;}
		}
		}
		}
		{
		_loop272:
		do {
			switch ( LA(1)) {
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				consume();
				break;
			}
			case 'A':  case 'B':  case 'C':  case 'D':
			case 'E':  case 'F':  case 'G':  case 'H':
			case 'I':  case 'J':  case 'K':  case 'L':
			case 'M':  case 'N':  case 'O':  case 'P':
			case 'Q':  case 'R':  case 'S':  case 'T':
			case 'U':  case 'V':  case 'W':  case 'X':
			case 'Y':  case 'Z':
			{
				consume();
				break;
			}
			case '_':
			{
				consume();
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				consume();
				break;
			}
			case '$':
			{
				consume();
				break;
			}
			default:
			{
				break _loop272;
			}
			}
		} while (true);
		}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode normal
	protected final void mID_DEFINED(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ID_DEFINED;
		int _saveIndex;
		
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode normal
	protected final void mPostInclChar(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PostInclChar;
		int _saveIndex;
		
		switch ( LA(1)) {
		case '"':
		{
			consume();
			break;
		}
		case '<':
		{
			consume();
			break;
		}
		default:
			{
				mPostPPKwdChar(false);
				if (matchError) {return ;}
			}
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode normal
	protected final void mPostIfChar(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PostIfChar;
		int _saveIndex;
		
		if (!( !Character.isJavaIdentifierPart(LA(1)) ))
		{matchError=true;
		matchException = new SemanticException(" !Character.isJavaIdentifierPart(LA(1)) ");
		if (matchError) {return ;}}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode normal
	protected final void mLAST_LEXER_FAKE_RULE(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LAST_LEXER_FAKE_RULE;
		int _saveIndex;
		
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mPostPPKwdChar_g(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PostPPKwdChar;
		int _saveIndex;
		
		char LA1_36 = LA(1);
		char LA2_36 = LA(2);
		
		if ((LA1_36=='\n'||LA1_36=='\r')) {
			mEndOfLine_g(false);
			if (matchError) {return ;}
		}
		else if (( true )&&( !Character.isJavaIdentifierPart(LA(1)) )) {
		}
		else if (( true )&&( LA(1) == EOF_CHAR)) {
		}
		else {
			matchError=true;if (matchError) {return ;}
		}
		
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mDigit_g(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = Digit;
		int _saveIndex;
		
		matchRange('0','9');
		if (matchError) {return ;}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	//Call mode always false
	protected final void mEndOfLine_g(boolean _createToken) {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EndOfLine;
		int _saveIndex;
		
		{
		char LA1_37 = LA(1);
		char LA2_37 = LA(2);
		
		if ((LA1_37=='\r') && (LA2_37=='\n')) {
			match("\r\n");
			if (matchError) {return ;}
		}
		else if ((LA1_37=='\r') && (true)) {
			consume();
		}
		else if ((LA1_37=='\n')) {
			consume();
		}
		else {
			matchError=true;if (matchError) {return ;}
		}
		
		}
		if (_createToken && _token==null && _ttype!=Token.SKIP) {
			_token = makeToken(_ttype);
			if (_token != null) setTokenText(_token, text.getBuffer(), _begin, text.length()-_begin);
		}
		_returnToken = _token;
	}
	
	
	private static final long[] mk_tokenSet_0() {
		long[] data = new long[1025];
		data[0]=4406636445696L;
		data[1]=34359738376L;
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = new long[1025];
		data[0]=68719476736L;
		data[1]=576460745995190270L;
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = new long[2048];
		data[0]=-9218L;
		for (int i = 1; i<=1022; i++) { data[i]=-1L; }
		data[1023]=9223372036854775807L;
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = new long[2048];
		data[0]=-4899916394579099650L;
		for (int i = 1; i<=1022; i++) { data[i]=-1L; }
		data[1023]=9223372036854775807L;
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = new long[2048];
		data[0]=-4611686018427397122L;
		for (int i = 1; i<=1022; i++) { data[i]=-1L; }
		data[1023]=9223372036854775807L;
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = new long[2048];
		data[0]=-17179878402L;
		for (int i = 1; i<=1022; i++) { data[i]=-1L; }
		data[1023]=9223372036854775807L;
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = new long[2048];
		data[0]=-17179878402L;
		data[1]=-268435457L;
		for (int i = 2; i<=1022; i++) { data[i]=-1L; }
		data[1023]=9223372036854775807L;
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = new long[1025];
		data[1]=576460745995190270L;
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = new long[2048];
		data[0]=-549755823106L;
		data[1]=-268435457L;
		for (int i = 2; i<=1022; i++) { data[i]=-1L; }
		data[1023]=9223372036854775807L;
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = new long[2048];
		data[0]=-3315714762242L;
		data[1]=-268435457L;
		for (int i = 2; i<=1022; i++) { data[i]=-1L; }
		data[1023]=9223372036854775807L;
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = new long[1025];
		data[0]=288019269919178752L;
		data[1]=137438953504L;
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	
	}
