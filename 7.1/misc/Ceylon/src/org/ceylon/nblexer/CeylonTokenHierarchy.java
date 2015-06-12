/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ceylon.nblexer;

import java.util.*;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author geertjan
 */
public class CeylonTokenHierarchy extends LanguageHierarchy<CeylonTokenId> {

    private static List<CeylonTokenId> tokens;
    private static Map<Integer, CeylonTokenId> idToToken;

    private static void init() {
	tokens = Arrays.<CeylonTokenId>asList(new CeylonTokenId[]{
		    new CeylonTokenId("ABSTRACTED_TYPE", "special", 4),
		    new CeylonTokenId("ADAPTED_TYPES", "special", 5),
		    new CeylonTokenId("ADD_ASSIGN_OP", "operator", 6),
		    new CeylonTokenId("AIDENTIFIER", "identifier", 7),
		    new CeylonTokenId("AND_ASSIGN_OP", "operator", 8),
		    new CeylonTokenId("AND_OP", "operator", 9),
		    new CeylonTokenId("APPLY_OP", "operator", 10),
		    new CeylonTokenId("ARRAY", "word", 11),
		    new CeylonTokenId("ASSIGN", "operator", 12),
		    new CeylonTokenId("ASSIGN_OP", "operator", 13),
		    new CeylonTokenId("ASTRING_LITERAL", "literal", 14),
		    new CeylonTokenId("BREAK", "word", 15),
		    new CeylonTokenId("CASE_CLAUSE", "definition", 16),
		    new CeylonTokenId("CASE_TYPES", "special", 17),
		    new CeylonTokenId("CATCH_CLAUSE", "definition", 18),
		    new CeylonTokenId("CHAR_LITERAL", "literal", 19),
		    new CeylonTokenId("CLASS_DEFINITION", "definition", 20),
		    new CeylonTokenId("COMMA", "punctuation", 21),
		    new CeylonTokenId("COMPARE_OP", "operator", 22),
		    new CeylonTokenId("COMPILER_ANNOTATION", "word", 23),
		    new CeylonTokenId("COMPLEMENT_ASSIGN_OP", "operator", 24),
		    new CeylonTokenId("COMPLEMENT_OP", "word", 25),
		    new CeylonTokenId("CONTINUE", "word", 26),
		    new CeylonTokenId("DECREMENT_OP", "operator", 27),
		    new CeylonTokenId("DEFAULT_OP", "operator", 28),
		    new CeylonTokenId("DIFFERENCE_OP", "operator", 29),
		    new CeylonTokenId("DIVIDE_ASSIGN_OP", "operator", 30),
		    new CeylonTokenId("Digit", "word", 31),
		    new CeylonTokenId("Digits", "word", 32),
		    new CeylonTokenId("ELLIPSIS", "word", 33),
		    new CeylonTokenId("ELSE_CLAUSE", "definition", 34),
		    new CeylonTokenId("ENTRY_OP", "operator", 35),
		    new CeylonTokenId("EQUAL_OP", "operator", 36),
		    new CeylonTokenId("EXISTS", "word", 37),
		    new CeylonTokenId("EXTENDS", "definition", 38),
		    new CeylonTokenId("EscapeSequence", "word", 39),
		    new CeylonTokenId("Exponent", "word", 40),
		    new CeylonTokenId("FINALLY_CLAUSE", "definition", 41),
		    new CeylonTokenId("FLOAT_LITERAL", "literal", 42),
		    new CeylonTokenId("FOR_CLAUSE", "definition", 43),
		    new CeylonTokenId("FUNCTION_MODIFIER", "modifier", 44),
		    new CeylonTokenId("FractionalMagnitude", "word", 45),
		    new CeylonTokenId("IDENTICAL_OP", "operator", 46),
		    new CeylonTokenId("IF_CLAUSE", "definition", 47),
		    new CeylonTokenId("IMPORT", "type", 48),
		    new CeylonTokenId("INCREMENT_OP", "operator", 49),
		    new CeylonTokenId("INDEX_OP", "operator", 50),
		    new CeylonTokenId("INTERFACE_DEFINITION", "definition", 51),
		    new CeylonTokenId("INTERSECTION_OP", "operator", 52),
		    new CeylonTokenId("INTERSECT_ASSIGN_OP", "operator", 53),
		    new CeylonTokenId("IN_OP", "operator", 54),
		    new CeylonTokenId("IS_OP", "operator", 55),
		    new CeylonTokenId("IdentifierPart", "word", 56),
		    new CeylonTokenId("IdentifierStart", "word", 57),
		    new CeylonTokenId("LARGER_OP", "operator", 58),
		    new CeylonTokenId("LARGE_AS_OP", "operator", 59),
		    new CeylonTokenId("LBRACE", "brace", 60),
		    new CeylonTokenId("LBRACKET", "bracket", 61),
		    new CeylonTokenId("LIDENTIFIER", "word", 62),
		    new CeylonTokenId("LINE_COMMENT", "word", 63),
		    new CeylonTokenId("LPAREN", "paren", 64),
		    new CeylonTokenId("Letter", "word", 65),
		    new CeylonTokenId("MEMBER_OP", "operator", 66),
		    new CeylonTokenId("MULTIPLY_ASSIGN_OP", "operator", 67),
		    new CeylonTokenId("MULTI_COMMENT", "word", 68),
		    new CeylonTokenId("Magnitude", "word", 69),
		    new CeylonTokenId("NATURAL_LITERAL", "literal", 70),
		    new CeylonTokenId("NONEMPTY", "word", 71),
		    new CeylonTokenId("NOT_EQUAL_OP", "operator", 72),
		    new CeylonTokenId("NOT_OP", "operator", 73),
		    new CeylonTokenId("NonCharacterChars", "word", 74),
		    new CeylonTokenId("NonStringChars", "word", 75),
		    new CeylonTokenId("OBJECT_DEFINITION", "word", 76),
		    new CeylonTokenId("OR_ASSIGN_OP", "operator", 77),
		    new CeylonTokenId("OR_OP", "operator", 78),
		    new CeylonTokenId("OUT", "word", 79),
		    new CeylonTokenId("OUTER", "word", 80),
		    new CeylonTokenId("PIDENTIFIER", "word", 81),
		    new CeylonTokenId("POWER_OP", "operator", 82),
		    new CeylonTokenId("PRODUCT_OP", "operator", 83),
		    new CeylonTokenId("QMARK", "word", 84),
		    new CeylonTokenId("QUOTED_LITERAL", "literal", 85),
		    new CeylonTokenId("QUOTIENT_OP", "operator", 86),
		    new CeylonTokenId("QuotedLiteralPart", "literal", 87),
		    new CeylonTokenId("RANGE_OP", "operator", 88),
		    new CeylonTokenId("RBRACE", "brace", 89),
		    new CeylonTokenId("RBRACKET", "bracket", 90),
		    new CeylonTokenId("REMAINDER_ASSIGN_OP", "operator", 91),
		    new CeylonTokenId("REMAINDER_OP", "operator", 92),
		    new CeylonTokenId("RETURN", "definition", 93),
		    new CeylonTokenId("RPAREN", "paren", 94),
		    new CeylonTokenId("SAFE_INDEX_OP", "operator", 95),
		    new CeylonTokenId("SAFE_MEMBER_OP", "operator", 96),
		    new CeylonTokenId("SATISFIES", "word", 97),
		    new CeylonTokenId("SEMICOLON", "punctuation", 98),
		    new CeylonTokenId("SMALLER_OP", "operator", 99),
		    new CeylonTokenId("SMALL_AS_OP", "operator", 100),
		    new CeylonTokenId("SPECIFY", "word", 101),
		    new CeylonTokenId("SPREAD_OP", "operator", 102),
		    new CeylonTokenId("STRING_LITERAL", "literal", 103),
		    new CeylonTokenId("SUBTRACT_ASSIGN_OP", "operator", 104),
		    new CeylonTokenId("SUM_OP", "operator", 105),
		    new CeylonTokenId("SUPER", "word", 106),
		    new CeylonTokenId("SWITCH_CLAUSE", "definition", 107),
		    new CeylonTokenId("StringPart", "word", 108),
		    new CeylonTokenId("THEN_CLAUSE", "definition", 109),
		    new CeylonTokenId("THIS", "word", 110),
		    new CeylonTokenId("THROW", "word", 111),
		    new CeylonTokenId("TRY_CLAUSE", "definition", 112),
		    new CeylonTokenId("TYPE_CONSTRAINT", "special", 113),
		    new CeylonTokenId("UIDENTIFIER", "identifier", 114),
		    new CeylonTokenId("UNION_ASSIGN_OP", "operator", 115),
		    new CeylonTokenId("UNION_OP", "operator", 116),
		    new CeylonTokenId("VALUE_MODIFIER", "modifier", 117),
		    new CeylonTokenId("VOID_MODIFIER", "modifier", 118),
		    new CeylonTokenId("WHILE_CLAUSE", "definition", 119),
		    new CeylonTokenId("WS", "whitespace", 120),
		    new CeylonTokenId("XOR_ASSIGN_OP", "operator", 121),
		    new CeylonTokenId("XOR_OP", "operator", 122)
		});
	idToToken = new HashMap<Integer, CeylonTokenId>();
	for (CeylonTokenId token : tokens) {
	    idToToken.put(token.ordinal(), token);
	}
    }

    static synchronized CeylonTokenId getToken(int id) {
	if (idToToken == null) {
	    init();
	}
	return idToToken.get(id);
    }

    @Override
    protected synchronized Collection<CeylonTokenId> createTokenIds() {
	if (tokens == null) {
	    init();
	}
	return tokens;
    }

    @Override
    protected synchronized Lexer<CeylonTokenId> createLexer(LexerRestartInfo<CeylonTokenId> info) {
	return new NBCeylonLexer(info);
    }

    @Override
    protected String mimeType() {
	return "text/x-ceylon";
    }

}