// $ANTLR Sun-2.7.7(NoEx) (2006-01-29): "support/aptBigIntegerExpr.g" -> "APTBigIntegerExprParser.java"$


package org.netbeans.modules.cnd.apt.impl.support.generated;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.math.BigInteger;

import org.netbeans.modules.cnd.antlr.*;
import org.netbeans.modules.cnd.antlr.collections.*;
import org.netbeans.modules.cnd.antlr.debug.misc.*;
import org.netbeans.modules.cnd.apt.support.APTMacroCallback;
import org.netbeans.modules.cnd.apt.support.APTBaseToken;
import org.netbeans.modules.cnd.apt.support.APTToken;
import org.netbeans.modules.cnd.apt.utils.APTUtils;

import org.netbeans.modules.cnd.antlr.TokenBuffer;
import org.netbeans.modules.cnd.antlr.TokenStreamIOException;
import org.netbeans.modules.cnd.antlr.ANTLRException;
import org.netbeans.modules.cnd.antlr.LLkParserNoEx;
import org.netbeans.modules.cnd.antlr.Token;
import org.netbeans.modules.cnd.antlr.TokenStream;
import org.netbeans.modules.cnd.antlr.RecognitionException;
import org.netbeans.modules.cnd.antlr.NoViableAltException;
import org.netbeans.modules.cnd.antlr.MismatchedTokenException;
import org.netbeans.modules.cnd.antlr.SemanticException;
import org.netbeans.modules.cnd.antlr.collections.impl.BitSet;

@org.netbeans.api.annotations.common.SuppressWarnings({"UCF", "MS"})
@SuppressWarnings({"unchecked", "cast", "fallthrough"})
final /*final class attribute gives us performance */

public class APTBigIntegerExprParser extends org.netbeans.modules.cnd.antlr.LLkParserNoEx       implements APTBigIntegerExprParserTokenTypes
 {

    // value for ID with text "true" (i.e. it is 1 in C++ and 0 in C langs)
    private BigInteger trueIDValue = BigInteger.ZERO;
    private final static String TRUE = "true";// NOI18N
    private APTMacroCallback callback = null;
    private boolean bigValuesInUse = false;

    public APTBigIntegerExprParser(TokenStream lexer, APTMacroCallback callback, BigInteger trueIDValue) {
        super(lexer, 1, 16);
        tokenNames = _tokenNames;
        this.callback = callback;
        this.trueIDValue = trueIDValue;
    }

    private boolean isDefined(Token id) {
        if (id != null && callback != null) {
            return callback.isDefined((APTToken)id);
        }
        return false;
    }

    private boolean toBoolean(BigInteger r) {
        return BigInteger.ZERO.equals(r) ? false : true;
    }

    // Fixup: workaround is added due to bug in jdk6 Update 10 (see IZ#150693)
    private static BigInteger one = BigInteger.ONE;
    private static BigInteger zero = BigInteger.ZERO;
    private BigInteger toBigInteger(boolean b) {
        return b ? one : zero;
    }

    private BigInteger toBigInteger(String str) {
        BigInteger val = BigInteger.ZERO;
        try {
            str = remSuffix(str);
            if (str.length() > 1 && str.charAt(0) == '0') {
                char secondChar = str.charAt(1);
                if (secondChar == 'x' || secondChar == 'X') {
                    // hex
                    val = new BigInteger(str.substring(2), 16);
                } else {
                    // octal
                    val = new BigInteger(str.substring(1), 8);
                }
            } else {
                // decimal
                val = new BigInteger(str);
            }
        } catch (NumberFormatException ex) {
            //ex.printStackTrace(System.err);
        }
        return val;
    }

    private String remSuffix(String num) {
        int len = num.length();
        boolean stop;
        do {
            stop = true;
            if (len > 0) {
                char last = num.charAt(len - 1);
                // remove postfix like u, U, l, L
                if (last == 'u' || last == 'U' || last == 'l' || last == 'L') {
                    num = num.substring(0, len - 1);
                    len--;
                    stop = false;
                }
            }
        } while (!stop);
        return num;
    }

    private BigInteger binaryToBigInteger(String str) {
        str = remSuffix(str);
        BigInteger val = BigInteger.ZERO;
        try {
            val = new BigInteger(str, 2);
        } catch (NumberFormatException ex) {
            ex.printStackTrace(System.err);
        }
        return val;
    }
    
    private BigInteger charToBigInteger(CharSequence str) {
        int val;
        int len = str.length();
        if (len <= 2) {
            // empty '' or incorrect char
            val = 0;
        } else if (len == 3) {
            val = str.charAt(1);
        } else if (len == 4 && str.charAt(1) == '\\') {
            switch (str.charAt(2)) {
                case 'b':
                    val = '\b';
                    break;
                case 'f':
                    val = '\f';
                    break;
                case 'n':
                    val = '\n';
                    break;
                case 'r':
                    val = '\r';
                    break;
                case 't':
                    val = '\t';
                    break;
//                case '"':
//                    val = '\"';
//                    break;
//                case '\'':
//                    val = '\'';
//                    break;
//                case '\\':
//                    val = '\\';
//                    break;
                default:
                    // what to do with '\e'; '\v'; '\?'; ?
                    // for other like '\'' '\\' '\"' use symbol as is
                    val = str.charAt(2);
                    break;
            }
        } else {
            // for now just use the first char as well
            APTUtils.LOG.log(Level.INFO, "use fallback when convert character [{0}] to BigInteger\n", str); // NOI18N
            val = str.charAt(1);
        }
        if (APTUtils.LOG.isLoggable(Level.FINE)) {
            APTUtils.LOG.log(Level.FINE, "convert char [{0}] to BigInteger {1}\n", new Object[] { str, val}); // NOI18N
        }
        return BigInteger.valueOf(val);
    }

    private BigInteger evalID(Token id) {
        // each not expanded ID in expression is '0' by specification
        // but 'true' can be treated differently:
        //  in C++ as 1
        //  in C as 0
        if (id != null && TRUE.equals(id.getText())) {
            return trueIDValue;
        }
        return BigInteger.ZERO;
    }


protected APTBigIntegerExprParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public APTBigIntegerExprParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected APTBigIntegerExprParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public APTBigIntegerExprParser(TokenStream lexer) {
  this(lexer,1);
}

	public final void imaginaryTokenDefinitions() {
		
		
		loop0:  while (true) {
			match(SIGN_MINUS);
			if (matchError) {break loop0;}
			match(SIGN_PLUS);
			if (matchError) {break loop0;}
		break;} // loop0
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_0);
			resetMatchError();
		}
	}
	
	public final BigInteger  expr() {
		BigInteger r;
		
		r=BigInteger.ZERO;
		
		loop1:  while (true) {
			switch ( LA(1)) {
			case LPAREN:
			case PLUS:
			case MINUS:
			case NOT:
			case TILDE:
			case DEFINED:
			case HEXADECIMALINT:
			case OCTALINT:
			case DECIMALINT:
			case CHAR_LITERAL:
			case NUMBER:
			case IDENT:
			case BINARYINT:
			case LITERAL_true:
			case LITERAL_false:
			{
				r=ternCondExpr();
				if (matchError) {break loop1;}
				break;
			}
			case EOF:
			{
				consume();
				break;
			}
			default:
			{
				matchError=true;matchException= new NoViableAltException(LT(1), getFilename(), _tokenSet_1, tokenNames);if (matchError) {break loop1;}
			}
			}
		break;} // loop1
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_2);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  ternCondExpr() {
		BigInteger r;
		
		
		loop2:  while (true) {
			BigInteger b,c;
			r=orExpr();
			if (matchError) {break loop2;}
			{
			_loop5:
			do {
				if ((LA(1)==QUESTIONMARK)) {
					consume();
					b=ternCondExpr();
					if (matchError) {break loop2;}
					match(COLON);
					if (matchError) {break loop2;}
					c=ternCondExpr();
					if (matchError) {break loop2;}
					r = toBoolean(r)?b:c;
				}
				else {
					break _loop5;
				}
				
			} while (true);
			}
		break;} // loop2
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_3);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  orExpr() {
		BigInteger r;
		
		
		loop3:  while (true) {
			BigInteger b;
			r=andExpr();
			if (matchError) {break loop3;}
			{
			_loop8:
			do {
				if ((LA(1)==OR)) {
					consume();
					b=andExpr();
					if (matchError) {break loop3;}
					r=toBigInteger(toBoolean(r) || toBoolean(b));
				}
				else {
					break _loop8;
				}
				
			} while (true);
			}
		break;} // loop3
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_3);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  andExpr() {
		BigInteger r;
		
		
		loop4:  while (true) {
			BigInteger b;
			r=borExpr();
			if (matchError) {break loop4;}
			{
			_loop11:
			do {
				if ((LA(1)==AND)) {
					consume();
					b=borExpr();
					if (matchError) {break loop4;}
					r=toBigInteger(toBoolean(r) && toBoolean(b));
				}
				else {
					break _loop11;
				}
				
			} while (true);
			}
		break;} // loop4
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_4);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  borExpr() {
		BigInteger r;
		
		
		loop5:  while (true) {
			BigInteger b;
			r=xorExpr();
			if (matchError) {break loop5;}
			{
			_loop14:
			do {
				if ((LA(1)==BITWISEOR)) {
					consume();
					b=xorExpr();
					if (matchError) {break loop5;}
					r=r.or(b);
				}
				else {
					break _loop14;
				}
				
			} while (true);
			}
		break;} // loop5
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_5);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  xorExpr() {
		BigInteger r;
		
		
		loop6:  while (true) {
			BigInteger b;
			r=bandExpr();
			if (matchError) {break loop6;}
			{
			_loop17:
			do {
				if ((LA(1)==BITWISEXOR)) {
					consume();
					b=bandExpr();
					if (matchError) {break loop6;}
					r=r.xor(b);
				}
				else {
					break _loop17;
				}
				
			} while (true);
			}
		break;} // loop6
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_6);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  bandExpr() {
		BigInteger r;
		
		
		loop7:  while (true) {
			BigInteger b;
			r=eqExpr();
			if (matchError) {break loop7;}
			{
			_loop20:
			do {
				if ((LA(1)==AMPERSAND)) {
					consume();
					b=eqExpr();
					if (matchError) {break loop7;}
					r=r.and(b);
				}
				else {
					break _loop20;
				}
				
			} while (true);
			}
		break;} // loop7
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_7);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  eqExpr() {
		BigInteger r;
		
		
		loop8:  while (true) {
			BigInteger b;
			r=relExpr();
			if (matchError) {break loop8;}
			{
			_loop23:
			do {
				switch ( LA(1)) {
				case EQUAL:
				{
					consume();
					b=relExpr();
					if (matchError) {break loop8;}
					r= toBigInteger(r.equals(b));
					break;
				}
				case NOTEQUAL:
				{
					consume();
					b=relExpr();
					if (matchError) {break loop8;}
					r= toBigInteger(!r.equals(b));
					break;
				}
				default:
				{
					break _loop23;
				}
				}
			} while (true);
			}
		break;} // loop8
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_8);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  relExpr() {
		BigInteger r;
		
		
		loop9:  while (true) {
			BigInteger b;
			r=shiftExpr();
			if (matchError) {break loop9;}
			{
			_loop26:
			do {
				switch ( LA(1)) {
				case LESSTHAN:
				{
					consume();
					b=shiftExpr();
					if (matchError) {break loop9;}
					r= toBigInteger(r.compareTo(b) < 0);
					break;
				}
				case LESSTHANOREQUALTO:
				{
					consume();
					b=shiftExpr();
					if (matchError) {break loop9;}
					r= toBigInteger(r.compareTo(b) <= 0);
					break;
				}
				case GREATERTHAN:
				{
					consume();
					b=shiftExpr();
					if (matchError) {break loop9;}
					r= toBigInteger(r.compareTo(b) > 0);
					break;
				}
				case GREATERTHANOREQUALTO:
				{
					consume();
					b=shiftExpr();
					if (matchError) {break loop9;}
					r= toBigInteger(r.compareTo(b) >= 0);
					break;
				}
				default:
				{
					break _loop26;
				}
				}
			} while (true);
			}
		break;} // loop9
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_9);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  shiftExpr() {
		BigInteger r;
		
		
		loop10:  while (true) {
			BigInteger b;
			r=sumExpr();
			if (matchError) {break loop10;}
			{
			_loop29:
			do {
				switch ( LA(1)) {
				case SHIFTLEFT:
				{
					consume();
					b=sumExpr();
					if (matchError) {break loop10;}
					r= r.shiftLeft(b.intValue());
					break;
				}
				case SHIFTRIGHT:
				{
					consume();
					b=sumExpr();
					if (matchError) {break loop10;}
					r= r.shiftRight(b.intValue());
					break;
				}
				default:
				{
					break _loop29;
				}
				}
			} while (true);
			}
		break;} // loop10
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_10);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  sumExpr() {
		BigInteger r;
		
		
		loop11:  while (true) {
			BigInteger b;
			r=prodExpr();
			if (matchError) {break loop11;}
			{
			_loop32:
			do {
				switch ( LA(1)) {
				case PLUS:
				{
					consume();
					b=prodExpr();
					if (matchError) {break loop11;}
					r= r.add(b);
					break;
				}
				case MINUS:
				{
					consume();
					b=prodExpr();
					if (matchError) {break loop11;}
					r= r.subtract(b);
					break;
				}
				default:
				{
					break _loop32;
				}
				}
			} while (true);
			}
		break;} // loop11
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_11);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  prodExpr() {
		BigInteger r;
		
		
		loop12:  while (true) {
			BigInteger b;
			r=signExpr();
			if (matchError) {break loop12;}
			{
			_loop35:
			do {
				switch ( LA(1)) {
				case STAR:
				{
					consume();
					b=signExpr();
					if (matchError) {break loop12;}
					r=r.multiply(b);
					break;
				}
				case DIVIDE:
				{
					consume();
					b=signExpr();
					if (matchError) {break loop12;}
					r=r.divide(b);
					break;
				}
				case MOD:
				{
					consume();
					b=signExpr();
					if (matchError) {break loop12;}
					r=r.mod(b);
					break;
				}
				default:
				{
					break _loop35;
				}
				}
			} while (true);
			}
		break;} // loop12
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_12);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  signExpr() {
		BigInteger r;
		
		r=BigInteger.ZERO;
		
		loop13:  while (true) {
			switch ( LA(1)) {
			case MINUS:
			{
				consume();
				r=atom();
				if (matchError) {break loop13;}
				r=r.negate();
				break;
			}
			case PLUS:
			{
				consume();
				r=atom();
				if (matchError) {break loop13;}
				r= (r.signum()<0) ? BigInteger.ZERO.subtract(r) : r;
				break;
			}
			case NOT:
			{
				consume();
				r=atom();
				if (matchError) {break loop13;}
				r=toBigInteger(!toBoolean(r));
				break;
			}
			case TILDE:
			{
				consume();
				r=atom();
				if (matchError) {break loop13;}
				r=r.not();
				break;
			}
			case LPAREN:
			case DEFINED:
			case HEXADECIMALINT:
			case OCTALINT:
			case DECIMALINT:
			case CHAR_LITERAL:
			case NUMBER:
			case IDENT:
			case BINARYINT:
			case LITERAL_true:
			case LITERAL_false:
			{
				r=atom();
				if (matchError) {break loop13;}
				break;
			}
			default:
			{
				matchError=true;matchException= new NoViableAltException(LT(1), getFilename(), _tokenSet_13, tokenNames);if (matchError) {break loop13;}
			}
			}
		break;} // loop13
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_14);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  atom() {
		BigInteger r;
		
		r=BigInteger.ZERO;
		
		loop14:  while (true) {
			switch ( LA(1)) {
			case HEXADECIMALINT:
			case OCTALINT:
			case DECIMALINT:
			case CHAR_LITERAL:
			case NUMBER:
			case IDENT:
			case BINARYINT:
			case LITERAL_true:
			case LITERAL_false:
			{
				r=constant();
				if (matchError) {break loop14;}
				break;
			}
			case DEFINED:
			{
				r=defined();
				if (matchError) {break loop14;}
				break;
			}
			case LPAREN:
			{
				{
				match(LPAREN);
				if (matchError) {break loop14;}
				r=expr();
				if (matchError) {break loop14;}
				match(RPAREN);
				if (matchError) {break loop14;}
				}
				break;
			}
			default:
			{
				matchError=true;matchException= new NoViableAltException(LT(1), getFilename(), _tokenSet_16, tokenNames);if (matchError) {break loop14;}
			}
			}
		break;} // loop14
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_14);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  constant() {
		BigInteger r;
		
		Token  n = null;
		Token  id = null;
		Token  o = null;
		Token  d = null;
		Token  x = null;
		Token  b = null;
		Token  c = null;
		r=BigInteger.ZERO;
		
		loop15:  while (true) {
			{
			switch ( LA(1)) {
			case LITERAL_true:
			{
				consume();
				r=toBigInteger(true);
				break;
			}
			case LITERAL_false:
			{
				consume();
				r=toBigInteger(false);
				break;
			}
			case NUMBER:
			{
				n = LT(1);
				consume();
				r=toBigInteger(n.getText());
				break;
			}
			case IDENT:
			{
				id = LT(1);
				consume();
				r=evalID(id);
				break;
			}
			case OCTALINT:
			{
				o = LT(1);
				consume();
				r=toBigInteger(o.getText());
				break;
			}
			case DECIMALINT:
			{
				d = LT(1);
				consume();
				r=toBigInteger(d.getText());
				break;
			}
			case HEXADECIMALINT:
			{
				x = LT(1);
				consume();
				r=toBigInteger(x.
				getText());
				break;
			}
			case BINARYINT:
			{
				b = LT(1);
				consume();
				r=binaryToBigInteger(b.getText());
				break;
			}
			case CHAR_LITERAL:
			{
				c = LT(1);
				consume();
				r=charToBigInteger(c.getText());;
				break;
			}
			default:
			{
				matchError=true;matchException= new NoViableAltException(LT(1), getFilename(), _tokenSet_17, tokenNames);if (matchError) {break loop15;}
			}
			}
			}
		break;} // loop15
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_14);
			resetMatchError();
		}
		return r;
	}
	
	public final BigInteger  defined() {
		BigInteger r;
		
		Token  id_1 = null;
		Token  id_2 = null;
		r=BigInteger.ZERO;
		
		loop16:  while (true) {
			match(DEFINED);
			if (matchError) {break loop16;}
			{
			switch ( LA(1)) {
			case LPAREN:
			{
				{
				match(LPAREN);
				if (matchError) {break loop16;}
				id_1 = LT(1);
				match(ID_DEFINED);
				if (matchError) {break loop16;}
				match(RPAREN);
				if (matchError) {break loop16;}
				}
				r = toBigInteger(isDefined(id_1));
				break;
			}
			case ID_DEFINED:
			{
				id_2 = LT(1);
				consume();
				r = toBigInteger(isDefined(id_2));
				break;
			}
			default:
			{
				matchError=true;matchException= new NoViableAltException(LT(1), getFilename(), _tokenSet_18, tokenNames);if (matchError) {break loop16;}
			}
			}
			}
		break;} // loop16
		if (matchError) {
			reportError(matchException);
			recover(matchException,_tokenSet_14);
			resetMatchError();
		}
		return r;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"ELLIPSIS",
		"DOT",
		"ASSIGNEQUAL",
		"COLON",
		"COMMA",
		"QUESTIONMARK",
		"SEMICOLON",
		"POINTERTO",
		"LPAREN",
		"RPAREN",
		"LSQUARE",
		"RSQUARE",
		"LCURLY",
		"RCURLY",
		"EQUAL",
		"NOTEQUAL",
		"LESSTHANOREQUALTO",
		"LESSTHAN",
		"GREATERTHANOREQUALTO",
		"GREATERTHAN",
		"DIVIDE",
		"DIVIDEEQUAL",
		"PLUS",
		"PLUSEQUAL",
		"PLUSPLUS",
		"MINUS",
		"MINUSEQUAL",
		"MINUSMINUS",
		"STAR",
		"TIMESEQUAL",
		"MOD",
		"MODEQUAL",
		"SHIFTRIGHT",
		"SHIFTRIGHTEQUAL",
		"SHIFTLEFT",
		"SHIFTLEFTEQUAL",
		"AND",
		"NOT",
		"OR",
		"AMPERSAND",
		"BITWISEANDEQUAL",
		"TILDE",
		"BITWISEOR",
		"BITWISEOREQUAL",
		"BITWISEXOR",
		"BITWISEXOREQUAL",
		"POINTERTOMBR",
		"DOTMBR",
		"SCOPE",
		"AT",
		"DOLLAR",
		"BACK_SLASH",
		"DEFINED",
		"DBL_SHARP",
		"SHARP",
		"FUN_LIKE_MACRO_LPAREN",
		"GRAVE_ACCENT",
		"END_PREPROC_DIRECTIVE",
		"LAST_CONST_TEXT_TOKEN",
		"FLOATONE",
		"FLOATTWO",
		"HEXADECIMALINT",
		"OCTALINT",
		"DECIMALINT",
		"Whitespace",
		"EndOfLine",
		"Skip",
		"PreProcComment",
		"PPLiterals",
		"Space",
		"PreProcBlockComment",
		"PreProcLineComment",
		"Comment",
		"CPPComment",
		"CHAR_LITERAL",
		"STRING_LITERAL",
		"InterStringWhitespace",
		"StringPart",
		"Escape",
		"Digit",
		"Decimal",
		"LongSuffix",
		"UnsignedSuffix",
		"FloatSuffix",
		"Exponent",
		"Vocabulary",
		"NUMBER",
		"IDENT",
		"BINARYINT",
		"INCLUDE_STRING",
		"SYS_INCLUDE_STRING",
		"INCLUDE",
		"INCLUDE_NEXT",
		"DEFINE",
		"UNDEF",
		"IFDEF",
		"IFNDEF",
		"IF",
		"ELIF",
		"ELSE",
		"ENDIF",
		"PRAGMA",
		"LINE",
		"ERROR",
		"PREPROC_DIRECTIVE",
		"FIRST_LITERAL_TOKEN",
		"\"operator\"",
		"\"alignof\"",
		"\"__alignof__\"",
		"\"typeof\"",
		"\"__typeof__\"",
		"\"__typeof\"",
		"\"template\"",
		"\"typedef\"",
		"\"enum\"",
		"\"namespace\"",
		"\"extern\"",
		"\"inline\"",
		"\"_inline\"",
		"\"__inline__\"",
		"\"__inline\"",
		"\"virtual\"",
		"\"explicit\"",
		"\"friend\"",
		"\"_stdcall\"",
		"\"__stdcall\"",
		"\"typename\"",
		"\"auto\"",
		"\"register\"",
		"\"static\"",
		"\"mutable\"",
		"\"const\"",
		"\"__const__\"",
		"\"__const\"",
		"\"const_cast\"",
		"\"volatile\"",
		"\"__volatile__\"",
		"\"__volatile\"",
		"\"char\"",
		"\"wchar_t\"",
		"\"bool\"",
		"\"short\"",
		"\"int\"",
		"\"long\"",
		"\"signed\"",
		"\"__signed__\"",
		"\"__signed\"",
		"\"unsigned\"",
		"\"__unsigned__\"",
		"\"float\"",
		"\"double\"",
		"\"void\"",
		"\"_declspec\"",
		"\"__declspec\"",
		"\"class\"",
		"\"struct\"",
		"\"union\"",
		"\"this\"",
		"\"true\"",
		"\"false\"",
		"\"public\"",
		"\"protected\"",
		"\"private\"",
		"\"throw\"",
		"\"case\"",
		"\"default\"",
		"\"if\"",
		"\"else\"",
		"\"switch\"",
		"\"while\"",
		"\"do\"",
		"\"for\"",
		"\"goto\"",
		"\"continue\"",
		"\"break\"",
		"\"return\"",
		"\"try\"",
		"\"catch\"",
		"\"using\"",
		"\"export\"",
		"\"asm\"",
		"\"_asm\"",
		"\"__asm__\"",
		"\"__asm\"",
		"\"_endasm\"",
		"\"sizeof\"",
		"\"dynamic_cast\"",
		"\"static_cast\"",
		"\"reinterpret_cast\"",
		"\"new\"",
		"\"_cdecl\"",
		"\"__cdecl\"",
		"\"_near\"",
		"\"__near\"",
		"\"_far\"",
		"\"__far\"",
		"\"__interrupt\"",
		"\"pascal\"",
		"\"_pascal\"",
		"\"__pascal\"",
		"\"delete\"",
		"\"_int64\"",
		"\"__int64\"",
		"\"__w64\"",
		"\"__extension__\"",
		"\"__attribute__\"",
		"\"restrict\"",
		"\"__restrict\"",
		"\"__complex__\"",
		"\"__imag__\"",
		"\"__real__\"",
		"\"__global\"",
		"\"_Bool\"",
		"\"_Complex\"",
		"\"__thread\"",
		"\"__attribute\"",
		"\"_Imaginary\"",
		"\"bit\"",
		"\"__symbolic\"",
		"\"__hidden\"",
		"\"final\"",
		"\"override\"",
		"\"constexpr\"",
		"\"decltype\"",
		"\"nullptr\"",
		"\"thread_local\"",
		"\"static_assert\"",
		"\"alignas\"",
		"\"char16_t\"",
		"\"char32_t\"",
		"\"noexcept\"",
		"\"__decltype\"",
		"\"__complex\"",
		"\"__forceinline\"",
		"\"__clrcall\"",
		"\"__try\"",
		"\"__finally\"",
		"\"__null\"",
		"\"__alignof\"",
		"\"__is_class\"",
		"\"__is_enum\"",
		"\"__is_pod\"",
		"\"__is_base_of\"",
		"\"__has_trivial_constructor\"",
		"\"__restrict__\"",
		"\"_Noreturn\"",
		"\"__has_nothrow_assign\"",
		"\"__has_nothrow_copy\"",
		"\"__has_nothrow_constructor\"",
		"\"__has_trivial_assign\"",
		"\"__has_trivial_copy\"",
		"\"__has_trivial_destructor\"",
		"\"__has_virtual_destructor\"",
		"\"__is_abstract\"",
		"\"__is_empty\"",
		"\"__is_literal_type\"",
		"\"__is_polymorphic\"",
		"\"__is_standard_layout\"",
		"\"__is_trivial\"",
		"\"__is_union\"",
		"\"__underlying_type\"",
		"\"__builtin_va_list\"",
		"LAST_LITERAL_TOKEN",
		"LITERAL__BUILT_IN_TYPE__",
		"LITERAL__TYPE_QUALIFIER__",
		"LITERAL__STORAGE_CLASS_SPECIFIER__",
		"T_CLOSE",
		"T_BLOCK",
		"T_GE",
		"T_CONTAINS",
		"T_ABSTRACT",
		"T_CLASS",
		"T_NOPASS",
		"T_UNFORMATTED",
		"T_LESSTHAN",
		"T_ENDSUBROUTINE",
		"T_GT",
		"T_IDENT",
		"T_INTERFACE",
		"T_RETURN",
		"T_XYZ",
		"T_EOF",
		"T_CALL",
		"T_EOS",
		"T_GO",
		"T_AND",
		"T_PERCENT",
		"T_PRINT",
		"T_ALLOCATE_STMT_1",
		"T_SUBROUTINE",
		"T_CONTROL_EDIT_DESC",
		"T_ENUMERATOR",
		"Alphanumeric_Character",
		"T_DEFINED_OP",
		"T_KIND",
		"T_STOP",
		"T_GREATERTHAN_EQ",
		"T_CHAR_STRING_EDIT_DESC",
		"T_ALLOCATABLE",
		"T_ENDINTERFACE",
		"T_END",
		"T_ASTERISK",
		"T_PRIVATE",
		"T_DOUBLEPRECISION",
		"T_CASE",
		"T_IMPLICIT",
		"T_IF",
		"T_THEN",
		"T_DIMENSION",
		"T_GOTO",
		"T_ENDMODULE",
		"T_IN",
		"T_WRITE",
		"T_FORMATTED",
		"WS",
		"T_DATA",
		"T_FALSE",
		"T_WHERE",
		"T_ENDIF",
		"T_SLASH",
		"SQ_Rep_Char",
		"T_GENERIC",
		"T_RECURSIVE",
		"DQ_Rep_Char",
		"T_ELSEIF",
		"T_BLOCKDATA",
		"OCTAL_CONSTANT",
		"T_SELECTTYPE",
		"T_MINUS",
		"T_SELECT",
		"T_FINAL",
		"T_UNDERSCORE",
		"T_IMPORT",
		"T_USE",
		"T_FILE",
		"T_RPAREN",
		"T_INTENT",
		"T_ENDBLOCK",
		"T_ASSIGNMENT_STMT",
		"T_PAUSE",
		"T_BACKSPACE",
		"T_ENDFILE",
		"T_EQUALS",
		"T_NON_INTRINSIC",
		"T_SELECTCASE",
		"T_DIGIT_STRING",
		"T_COLON_COLON",
		"T_NON_OVERRIDABLE",
		"Special_Character",
		"T_INCLUDE",
		"T_OPEN",
		"T_POWER",
		"T_ASSOCIATE",
		"T_CHAR_CONSTANT",
		"T_OPERATOR",
		"T_TO",
		"T_ENDASSOCIATE",
		"T_EQ",
		"T_GREATERTHAN",
		"T_DATA_EDIT_DESC",
		"T_INQUIRE_STMT_2",
		"T_EQV",
		"HEX_CONSTANT",
		"Digit_String",
		"T_ELEMENTAL",
		"T_CHARACTER",
		"PREPROCESS_LINE",
		"T_NULLIFY",
		"T_REWIND",
		"T_ARITHMETIC_IF_STMT",
		"T_FORALL_CONSTRUCT_STMT",
		"T_BIND",
		"T_ENDFORALL",
		"T_DO",
		"T_WHERE_STMT",
		"T_POINTER",
		"T_PROGRAM",
		"T_ENDTYPE",
		"T_WAIT",
		"T_ELSE",
		"T_IF_STMT",
		"T_RBRACKET",
		"T_LPAREN",
		"T_EXTENDS",
		"T_OPTIONAL",
		"T_DOUBLE",
		"T_MODULE",
		"T_READ",
		"T_ALLOCATE",
		"T_INTEGER",
		"T_OR",
		"T_EQUIVALENCE",
		"T_PERIOD",
		"T_ENTRY",
		"T_LABEL_DO_TERMINAL",
		"T_REAL",
		"T_CYCLE",
		"T_PROCEDURE",
		"T_EQ_EQ",
		"T_SLASH_EQ",
		"T_ENDSELECT",
		"T_PURE",
		"T_TRUE",
		"T_NE",
		"T_INTRINSIC",
		"T_PASS",
		"T_REAL_CONSTANT",
		"LINE_COMMENT",
		"T_PERIOD_EXPONENT",
		"T_ENDWHERE",
		"MISC_CHAR",
		"T_FORMAT",
		"T_DEFAULT",
		"T_SLASH_SLASH",
		"T_NONE",
		"T_NAMELIST",
		"T_SEQUENCE",
		"T_PRECISION",
		"T_ASYNCHRONOUS",
		"T_COMMA",
		"T_RESULT",
		"T_ENDBLOCKDATA",
		"T_LOGICAL",
		"T_VALUE",
		"Letter",
		"T_FORALL",
		"T_SAVE",
		"T_HOLLERITH",
		"T_FLUSH",
		"T_WHILE",
		"T_INQUIRE",
		"T_DEFERRED",
		"T_FORALL_STMT",
		"T_ASSIGN",
		"T_LBRACKET",
		"T_EXTERNAL",
		"T_VOLATILE",
		"T_OUT",
		"CONTINUE_CHAR",
		"T_COLON",
		"T_COMPLEX",
		"T_PLUS",
		"T_STMT_FUNCTION",
		"T_ONLY",
		"T_PROTECTED",
		"T_COMMON",
		"T_INOUT",
		"T_NEQV",
		"T_PUBLIC",
		"T_ENDDO",
		"T_ENDPROGRAM",
		"T_ENDFUNCTION",
		"T_WHERE_CONSTRUCT_STMT",
		"T_ELSEWHERE",
		"T_ENUM",
		"T_PARAMETER",
		"T_TARGET",
		"T_DOUBLECOMPLEX",
		"T_PTR_ASSIGNMENT_STMT",
		"T_TYPE",
		"T_LESSTHAN_EQ",
		"T_DEALLOCATE",
		"T_LT",
		"T_FUNCTION",
		"T_EQ_GT",
		"T_ENDENUM",
		"BINARY_CONSTANT",
		"T_LE",
		"T_LEN",
		"T_CONTINUE",
		"T_NOT",
		"Rep_Char",
		"T_ASSIGNMENT",
		"T_EXIT",
		"FORTRAN_COMMENT",
		"FIRST_ASSIGN",
		"FIRST_DIVIDE",
		"FIRST_STAR",
		"FIRST_MOD",
		"FIRST_NOT",
		"FIRST_AMPERSAND",
		"COMMENT",
		"CPP_COMMENT",
		"FIRST_OR",
		"FIRST_BITWISEXOR",
		"FIRST_COLON",
		"FIRST_LESS",
		"FIRST_GREATER",
		"FIRST_MINUS",
		"FIRST_PLUS",
		"FIRST_QUOTATION",
		"H_char_sequence",
		"Q_char_sequence",
		"DirectiveBody",
		"CHAR_LITERAL_BODY",
		"STRING_LITERAL_BODY",
		"RAW_STRING_LITERAL",
		"RAW_STRING_LITERAL_BODY",
		"Suffix",
		"ID_LIKE",
		"ID_DEFINED",
		"Identifier",
		"PostPPKwdChar",
		"PostInclChar",
		"PostIfChar",
		"LAST_LEXER_FAKE_RULE",
		"SIGN_MINUS",
		"SIGN_PLUS"
	};
	
	public static final BitSet _tokenSet_0 = new BitSet(2L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_1 = new BitSet(72094978037256194L, 469778446L, 51539607552L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_2 = new BitSet(8192L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_3 = new BitSet(8832L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_4 = new BitSet(4398046519936L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_5 = new BitSet(5497558147712L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_6 = new BitSet(75866302325376L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_7 = new BitSet(357341279036032L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_8 = new BitSet(366137372058240L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_9 = new BitSet(366137372844672L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_10 = new BitSet(366137388573312L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_11 = new BitSet(366480985956992L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_12 = new BitSet(366481589936768L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_13 = new BitSet(72094978037256192L, 469778446L, 51539607552L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_14 = new BitSet(366503081550464L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_15 = new BitSet(4096L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_16 = new BitSet(72057594037932032L, 469778446L, 51539607552L, 0L, 0L, 0L, 0L, 0L);
	public static final BitSet _tokenSet_17 = new BitSet(0L, 469778446L, 51539607552L, 0L, 0L, 0L, 0L, 0L);
	private static final long[] mk_tokenSet_18() {
		long[] data = new long[16];
		data[0]=4096L;
		data[7]=72057594037927936L;
		return data;
	}
	public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
	
	}
