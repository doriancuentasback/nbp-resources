// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g 2012-11-12 11:37:07

    package com.sun.scenario.effect.compiler;

    import com.sun.scenario.effect.compiler.model.*;
    import com.sun.scenario.effect.compiler.tree.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class JSLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STAR", "SLASH", "PLUS", "DASH", "LT", "GT", "LTEQ", "GTEQ", "EQEQ", "NEQ", "AND", "XOR", "OR", "INC", "DEC", "STAREQ", "SLASHEQ", "PLUSEQ", "DASHEQ", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_FRENCH", "RIGHT_FRENCH", "DOT", "COMMA", "EQUAL", "BANG", "TILDE", "QUESTION", "COLON", "SEMICOLON", "IF", "ELSE", "WHILE", "DO", "FOR", "UNROLL", "CONTINUE", "BREAK", "DISCARD", "RETURN", "VOID", "RGBA_FIELDS", "XYZW_FIELDS", "IDENTIFIER", "INTCONSTANT", "FLOATCONSTANT", "BOOLCONSTANT", "TYPE", "GLUE_BLOCK", "RFIELD", "XFIELD", "LETTER", "DIGIT", "WS", "COMMENT", "LINE_COMMENT", "'const'", "'param'", "'lowp'", "'mediump'", "'highp'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int DEC=18;
    public static final int RGBA_FIELDS=50;
    public static final int LT=8;
    public static final int T__67=67;
    public static final int STAR=4;
    public static final int T__65=65;
    public static final int WHILE=41;
    public static final int LETTER=60;
    public static final int LEFT_BRACKET=25;
    public static final int LTEQ=10;
    public static final int FOR=43;
    public static final int DO=42;
    public static final int AND=14;
    public static final int BOOLCONSTANT=55;
    public static final int EOF=-1;
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
    public static final int COMMENT=63;
    public static final int UNROLL=44;
    public static final int DOT=31;
    public static final int EQEQ=12;
    public static final int RIGHT_BRACE=28;
    public static final int XOR=15;
    public static final int DASH=7;
    public static final int LINE_COMMENT=64;
    public static final int ELSE=40;
    public static final int XYZW_FIELDS=51;
    public static final int SEMICOLON=38;
    public static final int BANG=34;
    public static final int SLASHEQ=20;
    public static final int GTEQ=11;
    public static final int DASHEQ=22;
    public static final int RIGHT_FRENCH=30;
    public static final int COLON=37;
    public static final int WS=62;
    public static final int INTCONSTANT=53;
    public static final int NEQ=13;
    public static final int DISCARD=47;
    public static final int QUESTION=36;
    public static final int FLOATCONSTANT=54;
    public static final int LEFT_BRACE=27;
    public static final int OR=16;
    public static final int LEFT_FRENCH=29;
    public static final int LEFT_PAREN=23;
    public static final int GT=9;
    public static final int XFIELD=59;

    // delegates
    // delegators


        public JSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public JSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return JSLParser.tokenNames; }
    public String getGrammarFileName() { return "/home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g"; }


        private SymbolTable symbols = new SymbolTable();
        private TreeMaker tm = new TreeMaker(symbols);

        public SymbolTable getSymbolTable() {
            return symbols;
        }

        // fail on first error for now
        // TODO: collect errors and recover...
        protected void mismatch(IntStream input, int tokenType, BitSet follow) throws RecognitionException {
            MismatchedTokenException ex = new MismatchedTokenException(tokenType, input);
            System.err.println("Token mismatch at " + ex.line + ":" + ex.charPositionInLine);
            throw ex;
        }
        
        public void recoverFromMismatchedSet(IntStream input, int ttype, BitSet follow)
            throws RecognitionException {
            throw new MissingTokenException(ttype, input, null);
        }



    // $ANTLR start "field_selection"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:136:1: field_selection returns [String fields] : (r= RGBA_FIELDS | x= XYZW_FIELDS );
    public final String field_selection() throws RecognitionException {
        String fields = null;

        Token r=null;
        Token x=null;

        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:137:9: (r= RGBA_FIELDS | x= XYZW_FIELDS )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RGBA_FIELDS) ) {
                alt1=1;
            }
            else if ( (LA1_0==XYZW_FIELDS) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return fields;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:137:11: r= RGBA_FIELDS
                    {
                    r=(Token)match(input,RGBA_FIELDS,FOLLOW_RGBA_FIELDS_in_field_selection780); if (state.failed) return fields;
                    if ( state.backtracking==0 ) {
                       fields = (r!=null?r.getText():null); 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:138:11: x= XYZW_FIELDS
                    {
                    x=(Token)match(input,XYZW_FIELDS,FOLLOW_XYZW_FIELDS_in_field_selection796); if (state.failed) return fields;
                    if ( state.backtracking==0 ) {
                       fields = (x!=null?x.getText():null); 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return fields;
    }
    // $ANTLR end "field_selection"


    // $ANTLR start "primary_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:141:1: primary_expression returns [Expr expr] : ( IDENTIFIER | INTCONSTANT | FLOATCONSTANT | BOOLCONSTANT | LEFT_PAREN e= expression RIGHT_PAREN );
    public final Expr primary_expression() throws RecognitionException {
        Expr expr = null;

        Token IDENTIFIER1=null;
        Token INTCONSTANT2=null;
        Token FLOATCONSTANT3=null;
        Token BOOLCONSTANT4=null;
        Expr e = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:142:9: ( IDENTIFIER | INTCONSTANT | FLOATCONSTANT | BOOLCONSTANT | LEFT_PAREN e= expression RIGHT_PAREN )
            int alt2=5;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt2=1;
                }
                break;
            case INTCONSTANT:
                {
                alt2=2;
                }
                break;
            case FLOATCONSTANT:
                {
                alt2=3;
                }
                break;
            case BOOLCONSTANT:
                {
                alt2=4;
                }
                break;
            case LEFT_PAREN:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:142:11: IDENTIFIER
                    {
                    IDENTIFIER1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression827); if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.variable((IDENTIFIER1!=null?IDENTIFIER1.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:143:11: INTCONSTANT
                    {
                    INTCONSTANT2=(Token)match(input,INTCONSTANT,FOLLOW_INTCONSTANT_in_primary_expression844); if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.literal(Type.INT, Integer.valueOf((INTCONSTANT2!=null?INTCONSTANT2.getText():null))); 
                    }

                    }
                    break;
                case 3 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:144:11: FLOATCONSTANT
                    {
                    FLOATCONSTANT3=(Token)match(input,FLOATCONSTANT,FOLLOW_FLOATCONSTANT_in_primary_expression860); if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.literal(Type.FLOAT, Float.valueOf((FLOATCONSTANT3!=null?FLOATCONSTANT3.getText():null))); 
                    }

                    }
                    break;
                case 4 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:145:11: BOOLCONSTANT
                    {
                    BOOLCONSTANT4=(Token)match(input,BOOLCONSTANT,FOLLOW_BOOLCONSTANT_in_primary_expression874); if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.literal(Type.BOOL, Boolean.valueOf((BOOLCONSTANT4!=null?BOOLCONSTANT4.getText():null))); 
                    }

                    }
                    break;
                case 5 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:146:11: LEFT_PAREN e= expression RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_primary_expression889); if (state.failed) return expr;
                    pushFollow(FOLLOW_expression_in_primary_expression893);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_primary_expression895); if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.parenExpr(e); 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "primary_expression"


    // $ANTLR start "primary_or_call"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:149:1: primary_or_call returns [Expr expr] : (e= primary_expression | f= function_call );
    public final Expr primary_or_call() throws RecognitionException {
        Expr expr = null;

        Expr e = null;

        Expr f = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:150:9: (e= primary_expression | f= function_call )
            int alt3=2;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==LEFT_PAREN) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||(LA3_1>=STAR && LA3_1<=DASHEQ)||(LA3_1>=RIGHT_PAREN && LA3_1<=RIGHT_BRACKET)||(LA3_1>=COMMA && LA3_1<=EQUAL)||(LA3_1>=QUESTION && LA3_1<=SEMICOLON)||(LA3_1>=RGBA_FIELDS && LA3_1<=XYZW_FIELDS)) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case LEFT_PAREN:
            case INTCONSTANT:
            case FLOATCONSTANT:
            case BOOLCONSTANT:
                {
                alt3=1;
                }
                break;
            case VOID:
            case TYPE:
                {
                alt3=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:150:11: e= primary_expression
                    {
                    pushFollow(FOLLOW_primary_expression_in_primary_or_call928);
                    e=primary_expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = e; 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:151:11: f= function_call
                    {
                    pushFollow(FOLLOW_function_call_in_primary_or_call944);
                    f=function_call();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = f; 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "primary_or_call"


    // $ANTLR start "postfix_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:166:1: postfix_expression returns [Expr expr] : (e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET fs= field_selection | e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET | e= primary_or_call fs= field_selection | e= primary_or_call INC | e= primary_or_call DEC | e= primary_or_call );
    public final Expr postfix_expression() throws RecognitionException {
        Expr expr = null;

        Expr e = null;

        Expr ae = null;

        String fs = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:167:9: (e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET fs= field_selection | e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET | e= primary_or_call fs= field_selection | e= primary_or_call INC | e= primary_or_call DEC | e= primary_or_call )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:167:11: e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET fs= field_selection
                    {
                    pushFollow(FOLLOW_primary_or_call_in_postfix_expression994);
                    e=primary_or_call();

                    state._fsp--;
                    if (state.failed) return expr;
                    match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_postfix_expression996); if (state.failed) return expr;
                    pushFollow(FOLLOW_expression_in_postfix_expression1000);
                    ae=expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_postfix_expression1002); if (state.failed) return expr;
                    pushFollow(FOLLOW_field_selection_in_postfix_expression1006);
                    fs=field_selection();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.fieldSelect(tm.arrayAccess(e, ae), fs); 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:169:11: e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET
                    {
                    pushFollow(FOLLOW_primary_or_call_in_postfix_expression1036);
                    e=primary_or_call();

                    state._fsp--;
                    if (state.failed) return expr;
                    match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_postfix_expression1038); if (state.failed) return expr;
                    pushFollow(FOLLOW_expression_in_postfix_expression1042);
                    ae=expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_postfix_expression1044); if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.arrayAccess(e, ae); 
                    }

                    }
                    break;
                case 3 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:171:11: e= primary_or_call fs= field_selection
                    {
                    pushFollow(FOLLOW_primary_or_call_in_postfix_expression1074);
                    e=primary_or_call();

                    state._fsp--;
                    if (state.failed) return expr;
                    pushFollow(FOLLOW_field_selection_in_postfix_expression1078);
                    fs=field_selection();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.fieldSelect(e, fs); 
                    }

                    }
                    break;
                case 4 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:173:11: e= primary_or_call INC
                    {
                    pushFollow(FOLLOW_primary_or_call_in_postfix_expression1108);
                    e=primary_or_call();

                    state._fsp--;
                    if (state.failed) return expr;
                    match(input,INC,FOLLOW_INC_in_postfix_expression1110); if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.unary(UnaryOpType.INC, e); 
                    }

                    }
                    break;
                case 5 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:175:11: e= primary_or_call DEC
                    {
                    pushFollow(FOLLOW_primary_or_call_in_postfix_expression1140);
                    e=primary_or_call();

                    state._fsp--;
                    if (state.failed) return expr;
                    match(input,DEC,FOLLOW_DEC_in_postfix_expression1142); if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.unary(UnaryOpType.DEC, e); 
                    }

                    }
                    break;
                case 6 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:177:11: e= primary_or_call
                    {
                    pushFollow(FOLLOW_primary_or_call_in_postfix_expression1172);
                    e=primary_or_call();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = e; 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "postfix_expression"


    // $ANTLR start "function_call"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:186:1: function_call returns [Expr expr] : (id= IDENTIFIER LEFT_PAREN (p= function_call_parameter_list )? RIGHT_PAREN | ts= type_specifier LEFT_PAREN (p= function_call_parameter_list )? RIGHT_PAREN );
    public final Expr function_call() throws RecognitionException {
        Expr expr = null;

        Token id=null;
        List<Expr> p = null;

        JSLParser.type_specifier_return ts = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:187:9: (id= IDENTIFIER LEFT_PAREN (p= function_call_parameter_list )? RIGHT_PAREN | ts= type_specifier LEFT_PAREN (p= function_call_parameter_list )? RIGHT_PAREN )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENTIFIER) ) {
                alt7=1;
            }
            else if ( (LA7_0==VOID||LA7_0==TYPE) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:187:11: id= IDENTIFIER LEFT_PAREN (p= function_call_parameter_list )? RIGHT_PAREN
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_call1224); if (state.failed) return expr;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function_call1226); if (state.failed) return expr;
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:187:37: (p= function_call_parameter_list )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=PLUS && LA5_0<=DASH)||(LA5_0>=INC && LA5_0<=DEC)||LA5_0==LEFT_PAREN||LA5_0==BANG||LA5_0==VOID||(LA5_0>=IDENTIFIER && LA5_0<=TYPE)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:0:0: p= function_call_parameter_list
                            {
                            pushFollow(FOLLOW_function_call_parameter_list_in_function_call1230);
                            p=function_call_parameter_list();

                            state._fsp--;
                            if (state.failed) return expr;

                            }
                            break;

                    }

                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function_call1233); if (state.failed) return expr;
                    if ( state.backtracking==0 ) {

                                      expr = tm.call((id!=null?id.getText():null), p!=null ? p : null);
                                  
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:191:11: ts= type_specifier LEFT_PAREN (p= function_call_parameter_list )? RIGHT_PAREN
                    {
                    pushFollow(FOLLOW_type_specifier_in_function_call1261);
                    ts=type_specifier();

                    state._fsp--;
                    if (state.failed) return expr;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function_call1263); if (state.failed) return expr;
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:191:41: (p= function_call_parameter_list )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=PLUS && LA6_0<=DASH)||(LA6_0>=INC && LA6_0<=DEC)||LA6_0==LEFT_PAREN||LA6_0==BANG||LA6_0==VOID||(LA6_0>=IDENTIFIER && LA6_0<=TYPE)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:0:0: p= function_call_parameter_list
                            {
                            pushFollow(FOLLOW_function_call_parameter_list_in_function_call1267);
                            p=function_call_parameter_list();

                            state._fsp--;
                            if (state.failed) return expr;

                            }
                            break;

                    }

                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function_call1270); if (state.failed) return expr;
                    if ( state.backtracking==0 ) {

                                      Type type = Type.fromToken((ts!=null?input.toString(ts.start,ts.stop):null));
                                      expr = tm.vectorCtor(type, p!=null ? p : null);
                                  
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "function_call"


    // $ANTLR start "function_call_parameter_list"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:198:1: function_call_parameter_list returns [List<Expr> exprList = new ArrayList<Expr>()] : a= assignment_expression ( COMMA a= assignment_expression )* ;
    public final List<Expr> function_call_parameter_list() throws RecognitionException {
        List<Expr> exprList =  new ArrayList<Expr>();

        Expr a = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:199:9: (a= assignment_expression ( COMMA a= assignment_expression )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:199:11: a= assignment_expression ( COMMA a= assignment_expression )*
            {
            pushFollow(FOLLOW_assignment_expression_in_function_call_parameter_list1323);
            a=assignment_expression();

            state._fsp--;
            if (state.failed) return exprList;
            if ( state.backtracking==0 ) {
               exprList.add(a); 
            }
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:200:11: ( COMMA a= assignment_expression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:200:12: COMMA a= assignment_expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_function_call_parameter_list1338); if (state.failed) return exprList;
            	    pushFollow(FOLLOW_assignment_expression_in_function_call_parameter_list1342);
            	    a=assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return exprList;
            	    if ( state.backtracking==0 ) {
            	      exprList.add(a); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return exprList;
    }
    // $ANTLR end "function_call_parameter_list"


    // $ANTLR start "unary_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:204:1: unary_expression returns [Expr expr] : (p= postfix_expression | INC u= unary_expression | DEC u= unary_expression | PLUS u= unary_expression | DASH u= unary_expression | BANG u= unary_expression );
    public final Expr unary_expression() throws RecognitionException {
        Expr expr = null;

        Expr p = null;

        Expr u = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:205:9: (p= postfix_expression | INC u= unary_expression | DEC u= unary_expression | PLUS u= unary_expression | DASH u= unary_expression | BANG u= unary_expression )
            int alt9=6;
            switch ( input.LA(1) ) {
            case LEFT_PAREN:
            case VOID:
            case IDENTIFIER:
            case INTCONSTANT:
            case FLOATCONSTANT:
            case BOOLCONSTANT:
            case TYPE:
                {
                alt9=1;
                }
                break;
            case INC:
                {
                alt9=2;
                }
                break;
            case DEC:
                {
                alt9=3;
                }
                break;
            case PLUS:
                {
                alt9=4;
                }
                break;
            case DASH:
                {
                alt9=5;
                }
                break;
            case BANG:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:205:11: p= postfix_expression
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expression1396);
                    p=postfix_expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = p; 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:206:11: INC u= unary_expression
                    {
                    match(input,INC,FOLLOW_INC_in_unary_expression1414); if (state.failed) return expr;
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1420);
                    u=unary_expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.unary(UnaryOpType.INC,     u); 
                    }

                    }
                    break;
                case 3 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:207:11: DEC u= unary_expression
                    {
                    match(input,DEC,FOLLOW_DEC_in_unary_expression1434); if (state.failed) return expr;
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1440);
                    u=unary_expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.unary(UnaryOpType.DEC,     u); 
                    }

                    }
                    break;
                case 4 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:208:11: PLUS u= unary_expression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unary_expression1454); if (state.failed) return expr;
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1459);
                    u=unary_expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.unary(UnaryOpType.PLUS,    u); 
                    }

                    }
                    break;
                case 5 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:209:11: DASH u= unary_expression
                    {
                    match(input,DASH,FOLLOW_DASH_in_unary_expression1473); if (state.failed) return expr;
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1478);
                    u=unary_expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.unary(UnaryOpType.MINUS,   u); 
                    }

                    }
                    break;
                case 6 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:210:11: BANG u= unary_expression
                    {
                    match(input,BANG,FOLLOW_BANG_in_unary_expression1492); if (state.failed) return expr;
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1497);
                    u=unary_expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.unary(UnaryOpType.NOT,     u); 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "unary_expression"


    // $ANTLR start "multiplicative_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:219:1: multiplicative_expression returns [Expr expr] : a= unary_expression ( STAR b= multiplicative_expression | SLASH b= multiplicative_expression )* ;
    public final Expr multiplicative_expression() throws RecognitionException {
        Expr expr = null;

        Expr a = null;

        Expr b = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:220:9: (a= unary_expression ( STAR b= multiplicative_expression | SLASH b= multiplicative_expression )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:220:11: a= unary_expression ( STAR b= multiplicative_expression | SLASH b= multiplicative_expression )*
            {
            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1536);
            a=unary_expression();

            state._fsp--;
            if (state.failed) return expr;
            if ( state.backtracking==0 ) {
               expr = a; 
            }
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:221:11: ( STAR b= multiplicative_expression | SLASH b= multiplicative_expression )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==STAR) ) {
                    int LA10_1 = input.LA(2);

                    if ( (synpred21_JSL()) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==SLASH) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred22_JSL()) ) {
                        alt10=2;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:221:12: STAR b= multiplicative_expression
            	    {
            	    match(input,STAR,FOLLOW_STAR_in_multiplicative_expression1551); if (state.failed) return expr;
            	    pushFollow(FOLLOW_multiplicative_expression_in_multiplicative_expression1556);
            	    b=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.MUL, expr, b); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:222:12: SLASH b= multiplicative_expression
            	    {
            	    match(input,SLASH,FOLLOW_SLASH_in_multiplicative_expression1571); if (state.failed) return expr;
            	    pushFollow(FOLLOW_multiplicative_expression_in_multiplicative_expression1575);
            	    b=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.DIV, expr, b); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "multiplicative_expression"


    // $ANTLR start "additive_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:226:1: additive_expression returns [Expr expr] : a= multiplicative_expression ( PLUS b= multiplicative_expression | DASH b= multiplicative_expression )* ;
    public final Expr additive_expression() throws RecognitionException {
        Expr expr = null;

        Expr a = null;

        Expr b = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:227:9: (a= multiplicative_expression ( PLUS b= multiplicative_expression | DASH b= multiplicative_expression )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:227:11: a= multiplicative_expression ( PLUS b= multiplicative_expression | DASH b= multiplicative_expression )*
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1629);
            a=multiplicative_expression();

            state._fsp--;
            if (state.failed) return expr;
            if ( state.backtracking==0 ) {
               expr = a; 
            }
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:228:11: ( PLUS b= multiplicative_expression | DASH b= multiplicative_expression )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==PLUS) ) {
                    alt11=1;
                }
                else if ( (LA11_0==DASH) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:228:12: PLUS b= multiplicative_expression
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_additive_expression1644); if (state.failed) return expr;
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1648);
            	    b=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.ADD, expr, b); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:229:12: DASH b= multiplicative_expression
            	    {
            	    match(input,DASH,FOLLOW_DASH_in_additive_expression1663); if (state.failed) return expr;
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1667);
            	    b=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.SUB, expr, b); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "additive_expression"


    // $ANTLR start "relational_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:233:1: relational_expression returns [Expr expr] : a= additive_expression ( LTEQ b= additive_expression | GTEQ b= additive_expression | LT b= additive_expression | GT b= additive_expression )* ;
    public final Expr relational_expression() throws RecognitionException {
        Expr expr = null;

        Expr a = null;

        Expr b = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:234:9: (a= additive_expression ( LTEQ b= additive_expression | GTEQ b= additive_expression | LT b= additive_expression | GT b= additive_expression )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:234:11: a= additive_expression ( LTEQ b= additive_expression | GTEQ b= additive_expression | LT b= additive_expression | GT b= additive_expression )*
            {
            pushFollow(FOLLOW_additive_expression_in_relational_expression1713);
            a=additive_expression();

            state._fsp--;
            if (state.failed) return expr;
            if ( state.backtracking==0 ) {
               expr = a; 
            }
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:235:11: ( LTEQ b= additive_expression | GTEQ b= additive_expression | LT b= additive_expression | GT b= additive_expression )*
            loop12:
            do {
                int alt12=5;
                switch ( input.LA(1) ) {
                case LTEQ:
                    {
                    alt12=1;
                    }
                    break;
                case GTEQ:
                    {
                    alt12=2;
                    }
                    break;
                case LT:
                    {
                    alt12=3;
                    }
                    break;
                case GT:
                    {
                    alt12=4;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:235:12: LTEQ b= additive_expression
            	    {
            	    match(input,LTEQ,FOLLOW_LTEQ_in_relational_expression1728); if (state.failed) return expr;
            	    pushFollow(FOLLOW_additive_expression_in_relational_expression1732);
            	    b=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.LTEQ, expr, b); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:236:12: GTEQ b= additive_expression
            	    {
            	    match(input,GTEQ,FOLLOW_GTEQ_in_relational_expression1747); if (state.failed) return expr;
            	    pushFollow(FOLLOW_additive_expression_in_relational_expression1751);
            	    b=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.GTEQ, expr, b); 
            	    }

            	    }
            	    break;
            	case 3 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:237:12: LT b= additive_expression
            	    {
            	    match(input,LT,FOLLOW_LT_in_relational_expression1766); if (state.failed) return expr;
            	    pushFollow(FOLLOW_additive_expression_in_relational_expression1772);
            	    b=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.LT,   expr, b); 
            	    }

            	    }
            	    break;
            	case 4 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:238:12: GT b= additive_expression
            	    {
            	    match(input,GT,FOLLOW_GT_in_relational_expression1787); if (state.failed) return expr;
            	    pushFollow(FOLLOW_additive_expression_in_relational_expression1793);
            	    b=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.GT,   expr, b); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "relational_expression"


    // $ANTLR start "equality_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:242:1: equality_expression returns [Expr expr] : a= relational_expression ( EQEQ b= relational_expression | NEQ b= relational_expression )* ;
    public final Expr equality_expression() throws RecognitionException {
        Expr expr = null;

        Expr a = null;

        Expr b = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:243:9: (a= relational_expression ( EQEQ b= relational_expression | NEQ b= relational_expression )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:243:11: a= relational_expression ( EQEQ b= relational_expression | NEQ b= relational_expression )*
            {
            pushFollow(FOLLOW_relational_expression_in_equality_expression1839);
            a=relational_expression();

            state._fsp--;
            if (state.failed) return expr;
            if ( state.backtracking==0 ) {
               expr = a; 
            }
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:244:11: ( EQEQ b= relational_expression | NEQ b= relational_expression )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==EQEQ) ) {
                    alt13=1;
                }
                else if ( (LA13_0==NEQ) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:244:12: EQEQ b= relational_expression
            	    {
            	    match(input,EQEQ,FOLLOW_EQEQ_in_equality_expression1854); if (state.failed) return expr;
            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1858);
            	    b=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.EQEQ, expr, b); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:245:13: NEQ b= relational_expression
            	    {
            	    match(input,NEQ,FOLLOW_NEQ_in_equality_expression1874); if (state.failed) return expr;
            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1878);
            	    b=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.NEQ,  expr, b); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "equality_expression"


    // $ANTLR start "logical_and_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:249:1: logical_and_expression returns [Expr expr] : a= equality_expression ( AND b= equality_expression )* ;
    public final Expr logical_and_expression() throws RecognitionException {
        Expr expr = null;

        Expr a = null;

        Expr b = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:250:9: (a= equality_expression ( AND b= equality_expression )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:250:11: a= equality_expression ( AND b= equality_expression )*
            {
            pushFollow(FOLLOW_equality_expression_in_logical_and_expression1932);
            a=equality_expression();

            state._fsp--;
            if (state.failed) return expr;
            if ( state.backtracking==0 ) {
               expr = a; 
            }
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:251:11: ( AND b= equality_expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==AND) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:251:12: AND b= equality_expression
            	    {
            	    match(input,AND,FOLLOW_AND_in_logical_and_expression1947); if (state.failed) return expr;
            	    pushFollow(FOLLOW_equality_expression_in_logical_and_expression1951);
            	    b=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.AND, expr, b); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "logical_and_expression"


    // $ANTLR start "logical_xor_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:255:1: logical_xor_expression returns [Expr expr] : a= logical_and_expression ( XOR b= logical_and_expression )* ;
    public final Expr logical_xor_expression() throws RecognitionException {
        Expr expr = null;

        Expr a = null;

        Expr b = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:256:9: (a= logical_and_expression ( XOR b= logical_and_expression )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:256:11: a= logical_and_expression ( XOR b= logical_and_expression )*
            {
            pushFollow(FOLLOW_logical_and_expression_in_logical_xor_expression2005);
            a=logical_and_expression();

            state._fsp--;
            if (state.failed) return expr;
            if ( state.backtracking==0 ) {
               expr = a; 
            }
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:257:11: ( XOR b= logical_and_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==XOR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:257:12: XOR b= logical_and_expression
            	    {
            	    match(input,XOR,FOLLOW_XOR_in_logical_xor_expression2020); if (state.failed) return expr;
            	    pushFollow(FOLLOW_logical_and_expression_in_logical_xor_expression2024);
            	    b=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.XOR, expr, b); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "logical_xor_expression"


    // $ANTLR start "logical_or_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:261:1: logical_or_expression returns [Expr expr] : a= logical_xor_expression ( OR b= logical_xor_expression )* ;
    public final Expr logical_or_expression() throws RecognitionException {
        Expr expr = null;

        Expr a = null;

        Expr b = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:262:9: (a= logical_xor_expression ( OR b= logical_xor_expression )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:262:11: a= logical_xor_expression ( OR b= logical_xor_expression )*
            {
            pushFollow(FOLLOW_logical_xor_expression_in_logical_or_expression2078);
            a=logical_xor_expression();

            state._fsp--;
            if (state.failed) return expr;
            if ( state.backtracking==0 ) {
               expr = a; 
            }
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:263:11: ( OR b= logical_xor_expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:263:12: OR b= logical_xor_expression
            	    {
            	    match(input,OR,FOLLOW_OR_in_logical_or_expression2093); if (state.failed) return expr;
            	    pushFollow(FOLLOW_logical_xor_expression_in_logical_or_expression2097);
            	    b=logical_xor_expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    if ( state.backtracking==0 ) {
            	       expr = tm.binary(BinaryOpType.OR, expr, b); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "logical_or_expression"


    // $ANTLR start "ternary_part"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:267:1: ternary_part : QUESTION expression COLON assignment_expression ;
    public final void ternary_part() throws RecognitionException {
        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:268:9: ( QUESTION expression COLON assignment_expression )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:268:11: QUESTION expression COLON assignment_expression
            {
            match(input,QUESTION,FOLLOW_QUESTION_in_ternary_part2145); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_ternary_part2147);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_ternary_part2149); if (state.failed) return ;
            pushFollow(FOLLOW_assignment_expression_in_ternary_part2151);
            assignment_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end "ternary_part"


    // $ANTLR start "conditional_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:272:1: conditional_expression returns [Expr expr] : a= logical_or_expression ( ternary_part )? ;
    public final Expr conditional_expression() throws RecognitionException {
        Expr expr = null;

        Expr a = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:273:9: (a= logical_or_expression ( ternary_part )? )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:273:11: a= logical_or_expression ( ternary_part )?
            {
            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression2183);
            a=logical_or_expression();

            state._fsp--;
            if (state.failed) return expr;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:273:35: ( ternary_part )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==QUESTION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:0:0: ternary_part
                    {
                    pushFollow(FOLLOW_ternary_part_in_conditional_expression2185);
                    ternary_part();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               expr = a; 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "conditional_expression"


    // $ANTLR start "assignment_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:276:1: assignment_expression returns [Expr expr] : (a= unary_expression op= assignment_operator b= assignment_expression | c= conditional_expression );
    public final Expr assignment_expression() throws RecognitionException {
        Expr expr = null;

        Expr a = null;

        JSLParser.assignment_operator_return op = null;

        Expr b = null;

        Expr c = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:277:9: (a= unary_expression op= assignment_operator b= assignment_expression | c= conditional_expression )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:277:11: a= unary_expression op= assignment_operator b= assignment_expression
                    {
                    pushFollow(FOLLOW_unary_expression_in_assignment_expression2219);
                    a=unary_expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    pushFollow(FOLLOW_assignment_operator_in_assignment_expression2223);
                    op=assignment_operator();

                    state._fsp--;
                    if (state.failed) return expr;
                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression2227);
                    b=assignment_expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = tm.binary(BinaryOpType.forSymbol((op!=null?input.toString(op.start,op.stop):null)), a, b); 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:279:11: c= conditional_expression
                    {
                    pushFollow(FOLLOW_conditional_expression_in_assignment_expression2257);
                    c=conditional_expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    if ( state.backtracking==0 ) {
                       expr = c; 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "assignment_expression"

    public static class assignment_operator_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "assignment_operator"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:283:1: assignment_operator : ( EQUAL | STAREQ | SLASHEQ | PLUSEQ | DASHEQ );
    public final JSLParser.assignment_operator_return assignment_operator() throws RecognitionException {
        JSLParser.assignment_operator_return retval = new JSLParser.assignment_operator_return();
        retval.start = input.LT(1);

        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:284:9: ( EQUAL | STAREQ | SLASHEQ | PLUSEQ | DASHEQ )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:
            {
            if ( (input.LA(1)>=STAREQ && input.LA(1)<=DASHEQ)||input.LA(1)==EQUAL ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment_operator"


    // $ANTLR start "expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:297:1: expression returns [Expr expr] : e= assignment_expression ;
    public final Expr expression() throws RecognitionException {
        Expr expr = null;

        Expr e = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:298:9: (e= assignment_expression )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:298:11: e= assignment_expression
            {
            pushFollow(FOLLOW_assignment_expression_in_expression2383);
            e=assignment_expression();

            state._fsp--;
            if (state.failed) return expr;
            if ( state.backtracking==0 ) {
               expr = e; 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "expression"


    // $ANTLR start "function_prototype"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:301:1: function_prototype returns [Function func] : t= type_specifier id= IDENTIFIER LEFT_PAREN (p= parameter_declaration_list )? RIGHT_PAREN ;
    public final Function function_prototype() throws RecognitionException {
        Function func = null;

        Token id=null;
        JSLParser.type_specifier_return t = null;

        List<Param> p = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:302:9: (t= type_specifier id= IDENTIFIER LEFT_PAREN (p= parameter_declaration_list )? RIGHT_PAREN )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:302:11: t= type_specifier id= IDENTIFIER LEFT_PAREN (p= parameter_declaration_list )? RIGHT_PAREN
            {
            pushFollow(FOLLOW_type_specifier_in_function_prototype2416);
            t=type_specifier();

            state._fsp--;
            if (state.failed) return func;
            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_prototype2420); if (state.failed) return func;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function_prototype2422); if (state.failed) return func;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:302:54: (p= parameter_declaration_list )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==VOID||LA19_0==TYPE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:0:0: p= parameter_declaration_list
                    {
                    pushFollow(FOLLOW_parameter_declaration_list_in_function_prototype2426);
                    p=parameter_declaration_list();

                    state._fsp--;
                    if (state.failed) return func;

                    }
                    break;

            }

            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function_prototype2429); if (state.failed) return func;
            if ( state.backtracking==0 ) {

                              Type type = Type.fromToken((t!=null?input.toString(t.start,t.stop):null));
                              func = symbols.declareFunction((id!=null?id.getText():null), type, (p != null) ? p : null);
                          
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return func;
    }
    // $ANTLR end "function_prototype"


    // $ANTLR start "parameter_declaration"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:309:1: parameter_declaration returns [Param param] : t= type_specifier id= IDENTIFIER ;
    public final Param parameter_declaration() throws RecognitionException {
        Param param = null;

        Token id=null;
        JSLParser.type_specifier_return t = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:310:9: (t= type_specifier id= IDENTIFIER )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:310:11: t= type_specifier id= IDENTIFIER
            {
            pushFollow(FOLLOW_type_specifier_in_parameter_declaration2482);
            t=type_specifier();

            state._fsp--;
            if (state.failed) return param;
            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_declaration2486); if (state.failed) return param;
            if ( state.backtracking==0 ) {

                              Type type = Type.fromToken((t!=null?input.toString(t.start,t.stop):null));
                              param = new Param((id!=null?id.getText():null), type);
                          
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return param;
    }
    // $ANTLR end "parameter_declaration"


    // $ANTLR start "parameter_declaration_list"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:317:1: parameter_declaration_list returns [List<Param> paramList = new ArrayList<Param>()] : p= parameter_declaration ( COMMA p= parameter_declaration )* ;
    public final List<Param> parameter_declaration_list() throws RecognitionException {
        List<Param> paramList =  new ArrayList<Param>();

        Param p = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:318:9: (p= parameter_declaration ( COMMA p= parameter_declaration )* )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:318:11: p= parameter_declaration ( COMMA p= parameter_declaration )*
            {
            pushFollow(FOLLOW_parameter_declaration_in_parameter_declaration_list2531);
            p=parameter_declaration();

            state._fsp--;
            if (state.failed) return paramList;
            if ( state.backtracking==0 ) {
               paramList.add(p); 
            }
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:319:11: ( COMMA p= parameter_declaration )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:319:12: COMMA p= parameter_declaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_parameter_declaration_list2546); if (state.failed) return paramList;
            	    pushFollow(FOLLOW_parameter_declaration_in_parameter_declaration_list2550);
            	    p=parameter_declaration();

            	    state._fsp--;
            	    if (state.failed) return paramList;
            	    if ( state.backtracking==0 ) {
            	       paramList.add(p); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return paramList;
    }
    // $ANTLR end "parameter_declaration_list"

    public static class declaration_identifier_and_init_return extends ParserRuleReturnScope {
        public String name;
        public Expr arrayInit;
        public Expr init;
    };

    // $ANTLR start "declaration_identifier_and_init"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:322:1: declaration_identifier_and_init returns [String name, Expr arrayInit, Expr init] : id= IDENTIFIER ( LEFT_BRACKET ae= constant_expression RIGHT_BRACKET )? ( EQUAL e= initializer )? ;
    public final JSLParser.declaration_identifier_and_init_return declaration_identifier_and_init() throws RecognitionException {
        JSLParser.declaration_identifier_and_init_return retval = new JSLParser.declaration_identifier_and_init_return();
        retval.start = input.LT(1);

        Token id=null;
        Expr ae = null;

        Expr e = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:323:9: (id= IDENTIFIER ( LEFT_BRACKET ae= constant_expression RIGHT_BRACKET )? ( EQUAL e= initializer )? )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:323:11: id= IDENTIFIER ( LEFT_BRACKET ae= constant_expression RIGHT_BRACKET )? ( EQUAL e= initializer )?
            {
            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration_identifier_and_init2594); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.name = (id!=null?id.getText():null); 
            }
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:324:11: ( LEFT_BRACKET ae= constant_expression RIGHT_BRACKET )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LEFT_BRACKET) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:324:12: LEFT_BRACKET ae= constant_expression RIGHT_BRACKET
                    {
                    match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_declaration_identifier_and_init2609); if (state.failed) return retval;
                    pushFollow(FOLLOW_constant_expression_in_declaration_identifier_and_init2613);
                    ae=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.arrayInit = ae; 
                    }
                    match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_declaration_identifier_and_init2617); if (state.failed) return retval;

                    }
                    break;

            }

            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:325:11: ( EQUAL e= initializer )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EQUAL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:325:12: EQUAL e= initializer
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_declaration_identifier_and_init2632); if (state.failed) return retval;
                    pushFollow(FOLLOW_initializer_in_declaration_identifier_and_init2636);
                    e=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.init = e; 
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration_identifier_and_init"


    // $ANTLR start "single_declaration"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:328:1: single_declaration returns [VarDecl decl] : t= fully_specified_type d= declaration_identifier_and_init ;
    public final VarDecl single_declaration() throws RecognitionException {
        VarDecl decl = null;

        JSLParser.fully_specified_type_return t = null;

        JSLParser.declaration_identifier_and_init_return d = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:329:9: (t= fully_specified_type d= declaration_identifier_and_init )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:329:11: t= fully_specified_type d= declaration_identifier_and_init
            {
            pushFollow(FOLLOW_fully_specified_type_in_single_declaration2671);
            t=fully_specified_type();

            state._fsp--;
            if (state.failed) return decl;
            pushFollow(FOLLOW_declaration_identifier_and_init_in_single_declaration2675);
            d=declaration_identifier_and_init();

            state._fsp--;
            if (state.failed) return decl;
            if ( state.backtracking==0 ) {

                            int arraySize = -1;
                            Expr ainit = (d!=null?d.arrayInit:null);
                            if (ainit != null) {
                                if (ainit instanceof LiteralExpr) {
                                    Object val = ((LiteralExpr)ainit).getValue();
                                    if (!(val instanceof Integer)) {
                                        throw new RuntimeException("Array size must be an integer");
                                    }
                                    arraySize = ((Integer)val).intValue();
                                } else if (ainit instanceof VariableExpr) {
                                    Variable var = ((VariableExpr)ainit).getVariable();
                                    Object val = var.getConstValue();
                                    if (!(val instanceof Integer) || var.getQualifier() != Qualifier.CONST) {
                                        throw new RuntimeException("Array size must be a constant integer");
                                    }
                                    arraySize = ((Integer)val).intValue();
                                }
                            }

                            Object constValue = null;
                            if ((t!=null?t.qual:null) == Qualifier.CONST) {
                                Expr cinit = (d!=null?d.init:null);
                                if (cinit == null) {
                                    throw new RuntimeException("Constant value must be initialized");
                                }
                                // TODO: for now, allow some basic expressions on the rhs
                                // of the constant declaration...
                                //if (!(cinit instanceof LiteralExpr)) {
                                //    throw new RuntimeException("Constant initializer must be a literal (for now)");
                                //}
                                Type ctype = cinit.getResultType();
                                if (ctype != (t!=null?t.type:null)) {
                                    throw new RuntimeException("Constant type must match that of initializer");
                                }
                                if (cinit instanceof LiteralExpr) {
                                    constValue = ((LiteralExpr)cinit).getValue();
                                } else {
                                    // TODO: This is gross, but to support complex constant
                                    // initializers (such as "const FOO = BAR / 42.0;") we
                                    // will just save the full text of the rhs and hope that
                                    // the backend does the right thing with it.  The real
                                    // solution obviously would be to evaluate the expression
                                    // now and reduce it to a single value.
                                    constValue = (d!=null?d.init:null).toString();
                                }
                            }

                            Variable var =
                                symbols.declareVariable((d!=null?d.name:null),
                                                        (t!=null?t.type:null), (t!=null?t.qual:null), (t!=null?t.precision:null),
                                                        arraySize, constValue);
                            decl = tm.varDecl(var, (d!=null?d.init:null));
                        
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return decl;
    }
    // $ANTLR end "single_declaration"


    // $ANTLR start "declaration"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:386:1: declaration returns [List<VarDecl> declList = new ArrayList<VarDecl>()] : s= single_declaration ( COMMA d= declaration_identifier_and_init )* SEMICOLON ;
    public final List<VarDecl> declaration() throws RecognitionException {
        List<VarDecl> declList =  new ArrayList<VarDecl>();

        VarDecl s = null;

        JSLParser.declaration_identifier_and_init_return d = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:387:9: (s= single_declaration ( COMMA d= declaration_identifier_and_init )* SEMICOLON )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:387:11: s= single_declaration ( COMMA d= declaration_identifier_and_init )* SEMICOLON
            {
            pushFollow(FOLLOW_single_declaration_in_declaration2726);
            s=single_declaration();

            state._fsp--;
            if (state.failed) return declList;
            if ( state.backtracking==0 ) {
               declList.add(s); 
            }
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:388:11: ( COMMA d= declaration_identifier_and_init )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:388:12: COMMA d= declaration_identifier_and_init
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_declaration2741); if (state.failed) return declList;
            	    pushFollow(FOLLOW_declaration_identifier_and_init_in_declaration2745);
            	    d=declaration_identifier_and_init();

            	    state._fsp--;
            	    if (state.failed) return declList;
            	    if ( state.backtracking==0 ) {

            	                    Variable base = s.getVariable();
            	                    Variable var =
            	                        symbols.declareVariable((d!=null?d.name:null),
            	                                                base.getType(),
            	                                                base.getQualifier(),
            	                                                base.getPrecision());
            	                    declList.add(tm.varDecl(var, (d!=null?d.init:null)));
            	                
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declaration2772); if (state.failed) return declList;

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return declList;
    }
    // $ANTLR end "declaration"

    public static class fully_specified_type_return extends ParserRuleReturnScope {
        public Qualifier qual;
        public Precision precision;
        public Type type;
    };

    // $ANTLR start "fully_specified_type"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:404:1: fully_specified_type returns [Qualifier qual, Precision precision, Type type] : (tq= type_qualifier tp= type_precision ts= type_specifier | tq= type_qualifier ts= type_specifier | tp= type_precision ts= type_specifier | ts= type_specifier );
    public final JSLParser.fully_specified_type_return fully_specified_type() throws RecognitionException {
        JSLParser.fully_specified_type_return retval = new JSLParser.fully_specified_type_return();
        retval.start = input.LT(1);

        JSLParser.type_qualifier_return tq = null;

        JSLParser.type_precision_return tp = null;

        JSLParser.type_specifier_return ts = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:405:9: (tq= type_qualifier tp= type_precision ts= type_specifier | tq= type_qualifier ts= type_specifier | tp= type_precision ts= type_specifier | ts= type_specifier )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 65:
            case 66:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==VOID||LA24_1==TYPE) ) {
                    alt24=2;
                }
                else if ( ((LA24_1>=67 && LA24_1<=69)) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case 67:
            case 68:
            case 69:
                {
                alt24=3;
                }
                break;
            case VOID:
            case TYPE:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:405:11: tq= type_qualifier tp= type_precision ts= type_specifier
                    {
                    pushFollow(FOLLOW_type_qualifier_in_fully_specified_type2814);
                    tq=type_qualifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_precision_in_fully_specified_type2818);
                    tp=type_precision();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_specifier_in_fully_specified_type2822);
                    ts=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                      retval.qual = Qualifier.fromToken((tq!=null?input.toString(tq.start,tq.stop):null));
                                      retval.precision = Precision.fromToken((tp!=null?input.toString(tp.start,tp.stop):null));
                                      retval.type = Type.fromToken((ts!=null?input.toString(ts.start,ts.stop):null));
                                  
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:411:11: tq= type_qualifier ts= type_specifier
                    {
                    pushFollow(FOLLOW_type_qualifier_in_fully_specified_type2850);
                    tq=type_qualifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_specifier_in_fully_specified_type2854);
                    ts=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                      retval.qual = Qualifier.fromToken((tq!=null?input.toString(tq.start,tq.stop):null));
                                      retval.type = Type.fromToken((ts!=null?input.toString(ts.start,ts.stop):null));
                                  
                    }

                    }
                    break;
                case 3 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:416:11: tp= type_precision ts= type_specifier
                    {
                    pushFollow(FOLLOW_type_precision_in_fully_specified_type2882);
                    tp=type_precision();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_specifier_in_fully_specified_type2886);
                    ts=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                      retval.precision = Precision.fromToken((tp!=null?input.toString(tp.start,tp.stop):null));
                                      retval.type = Type.fromToken((ts!=null?input.toString(ts.start,ts.stop):null));
                                  
                    }

                    }
                    break;
                case 4 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:421:11: ts= type_specifier
                    {
                    pushFollow(FOLLOW_type_specifier_in_fully_specified_type2914);
                    ts=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                      retval.type = Type.fromToken((ts!=null?input.toString(ts.start,ts.stop):null));
                                  
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fully_specified_type"

    public static class type_qualifier_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "type_qualifier"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:427:1: type_qualifier : ( 'const' | 'param' );
    public final JSLParser.type_qualifier_return type_qualifier() throws RecognitionException {
        JSLParser.type_qualifier_return retval = new JSLParser.type_qualifier_return();
        retval.start = input.LT(1);

        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:428:9: ( 'const' | 'param' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:
            {
            if ( (input.LA(1)>=65 && input.LA(1)<=66) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_qualifier"

    public static class type_precision_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "type_precision"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:432:1: type_precision : ( 'lowp' | 'mediump' | 'highp' );
    public final JSLParser.type_precision_return type_precision() throws RecognitionException {
        JSLParser.type_precision_return retval = new JSLParser.type_precision_return();
        retval.start = input.LT(1);

        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:433:9: ( 'lowp' | 'mediump' | 'highp' )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:
            {
            if ( (input.LA(1)>=67 && input.LA(1)<=69) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_precision"

    public static class type_specifier_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "type_specifier"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:438:1: type_specifier : type_specifier_nonarray ( array_brackets )? ;
    public final JSLParser.type_specifier_return type_specifier() throws RecognitionException {
        JSLParser.type_specifier_return retval = new JSLParser.type_specifier_return();
        retval.start = input.LT(1);

        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:439:9: ( type_specifier_nonarray ( array_brackets )? )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:439:11: type_specifier_nonarray ( array_brackets )?
            {
            pushFollow(FOLLOW_type_specifier_nonarray_in_type_specifier3055);
            type_specifier_nonarray();

            state._fsp--;
            if (state.failed) return retval;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:439:35: ( array_brackets )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LEFT_BRACKET) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:0:0: array_brackets
                    {
                    pushFollow(FOLLOW_array_brackets_in_type_specifier3057);
                    array_brackets();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_specifier"


    // $ANTLR start "array_brackets"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:442:1: array_brackets : LEFT_BRACKET constant_expression RIGHT_BRACKET ;
    public final void array_brackets() throws RecognitionException {
        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:443:9: ( LEFT_BRACKET constant_expression RIGHT_BRACKET )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:443:11: LEFT_BRACKET constant_expression RIGHT_BRACKET
            {
            match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_array_brackets3091); if (state.failed) return ;
            pushFollow(FOLLOW_constant_expression_in_array_brackets3093);
            constant_expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_array_brackets3095); if (state.failed) return ;

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end "array_brackets"


    // $ANTLR start "type_specifier_nonarray"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:446:1: type_specifier_nonarray : ( TYPE | VOID );
    public final void type_specifier_nonarray() throws RecognitionException {
        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:447:9: ( TYPE | VOID )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:
            {
            if ( input.LA(1)==VOID||input.LA(1)==TYPE ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_specifier_nonarray"


    // $ANTLR start "initializer"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:451:1: initializer returns [Expr expr] : e= assignment_expression ;
    public final Expr initializer() throws RecognitionException {
        Expr expr = null;

        Expr e = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:452:9: (e= assignment_expression )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:452:11: e= assignment_expression
            {
            pushFollow(FOLLOW_assignment_expression_in_initializer3178);
            e=assignment_expression();

            state._fsp--;
            if (state.failed) return expr;
            if ( state.backtracking==0 ) {
               expr = e; 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "initializer"


    // $ANTLR start "declaration_statement"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:455:1: declaration_statement returns [Stmt stmt] : d= declaration ;
    public final Stmt declaration_statement() throws RecognitionException {
        Stmt stmt = null;

        List<VarDecl> d = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:456:9: (d= declaration )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:456:11: d= declaration
            {
            pushFollow(FOLLOW_declaration_in_declaration_statement3219);
            d=declaration();

            state._fsp--;
            if (state.failed) return stmt;
            if ( state.backtracking==0 ) {
               stmt = tm.declStmt(d); 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "declaration_statement"


    // $ANTLR start "statement"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:459:1: statement returns [Stmt stmt] : (c= compound_statement | s= simple_statement );
    public final Stmt statement() throws RecognitionException {
        Stmt stmt = null;

        Stmt c = null;

        Stmt s = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:460:9: (c= compound_statement | s= simple_statement )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LEFT_BRACE) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=PLUS && LA26_0<=DASH)||(LA26_0>=INC && LA26_0<=DEC)||LA26_0==LEFT_PAREN||LA26_0==BANG||(LA26_0>=SEMICOLON && LA26_0<=IF)||(LA26_0>=WHILE && LA26_0<=VOID)||(LA26_0>=IDENTIFIER && LA26_0<=TYPE)||(LA26_0>=65 && LA26_0<=69)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return stmt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:460:11: c= compound_statement
                    {
                    pushFollow(FOLLOW_compound_statement_in_statement3260);
                    c=compound_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = c; 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:461:11: s= simple_statement
                    {
                    pushFollow(FOLLOW_simple_statement_in_statement3276);
                    s=simple_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = s; 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "statement"


    // $ANTLR start "simple_statement"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:467:1: simple_statement returns [Stmt stmt] : (d= declaration_statement | e= expression_statement | s= selection_statement | i= iteration_statement | j= jump_statement );
    public final Stmt simple_statement() throws RecognitionException {
        Stmt stmt = null;

        Stmt d = null;

        Stmt e = null;

        Stmt s = null;

        Stmt i = null;

        Stmt j = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:468:9: (d= declaration_statement | e= expression_statement | s= selection_statement | i= iteration_statement | j= jump_statement )
            int alt27=5;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:468:11: d= declaration_statement
                    {
                    pushFollow(FOLLOW_declaration_statement_in_simple_statement3314);
                    d=declaration_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = d; 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:469:11: e= expression_statement
                    {
                    pushFollow(FOLLOW_expression_statement_in_simple_statement3330);
                    e=expression_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = e; 
                    }

                    }
                    break;
                case 3 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:470:11: s= selection_statement
                    {
                    pushFollow(FOLLOW_selection_statement_in_simple_statement3347);
                    s=selection_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = s; 
                    }

                    }
                    break;
                case 4 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:471:11: i= iteration_statement
                    {
                    pushFollow(FOLLOW_iteration_statement_in_simple_statement3365);
                    i=iteration_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = i; 
                    }

                    }
                    break;
                case 5 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:472:11: j= jump_statement
                    {
                    pushFollow(FOLLOW_jump_statement_in_simple_statement3383);
                    j=jump_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = j; 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "simple_statement"


    // $ANTLR start "compound_statement"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:475:1: compound_statement returns [Stmt stmt] : LEFT_BRACE (s= statement )* RIGHT_BRACE ;
    public final Stmt compound_statement() throws RecognitionException {
        Stmt stmt = null;

        Stmt s = null;



            List<Stmt> stmtList = new ArrayList<Stmt>();

        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:479:9: ( LEFT_BRACE (s= statement )* RIGHT_BRACE )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:479:11: LEFT_BRACE (s= statement )* RIGHT_BRACE
            {
            match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_compound_statement3434); if (state.failed) return stmt;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:479:22: (s= statement )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=PLUS && LA28_0<=DASH)||(LA28_0>=INC && LA28_0<=DEC)||LA28_0==LEFT_PAREN||LA28_0==LEFT_BRACE||LA28_0==BANG||(LA28_0>=SEMICOLON && LA28_0<=IF)||(LA28_0>=WHILE && LA28_0<=VOID)||(LA28_0>=IDENTIFIER && LA28_0<=TYPE)||(LA28_0>=65 && LA28_0<=69)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:479:23: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compound_statement3439);
            	    s=statement();

            	    state._fsp--;
            	    if (state.failed) return stmt;
            	    if ( state.backtracking==0 ) {
            	       stmtList.add(s); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_compound_statement3445); if (state.failed) return stmt;
            if ( state.backtracking==0 ) {
               stmt = tm.compoundStmt(stmtList); 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "compound_statement"


    // $ANTLR start "statement_no_new_scope"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:483:1: statement_no_new_scope returns [Stmt stmt] : (c= compound_statement_no_new_scope | s= simple_statement );
    public final Stmt statement_no_new_scope() throws RecognitionException {
        Stmt stmt = null;

        Stmt c = null;

        Stmt s = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:484:9: (c= compound_statement_no_new_scope | s= simple_statement )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LEFT_BRACE) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=PLUS && LA29_0<=DASH)||(LA29_0>=INC && LA29_0<=DEC)||LA29_0==LEFT_PAREN||LA29_0==BANG||(LA29_0>=SEMICOLON && LA29_0<=IF)||(LA29_0>=WHILE && LA29_0<=VOID)||(LA29_0>=IDENTIFIER && LA29_0<=TYPE)||(LA29_0>=65 && LA29_0<=69)) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return stmt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:484:11: c= compound_statement_no_new_scope
                    {
                    pushFollow(FOLLOW_compound_statement_no_new_scope_in_statement_no_new_scope3496);
                    c=compound_statement_no_new_scope();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = c; 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:485:11: s= simple_statement
                    {
                    pushFollow(FOLLOW_simple_statement_in_statement_no_new_scope3512);
                    s=simple_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = s; 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "statement_no_new_scope"


    // $ANTLR start "compound_statement_no_new_scope"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:488:1: compound_statement_no_new_scope returns [Stmt stmt] : LEFT_BRACE (s= statement )* RIGHT_BRACE ;
    public final Stmt compound_statement_no_new_scope() throws RecognitionException {
        Stmt stmt = null;

        Stmt s = null;



            List<Stmt> stmtList = new ArrayList<Stmt>();

        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:492:9: ( LEFT_BRACE (s= statement )* RIGHT_BRACE )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:492:11: LEFT_BRACE (s= statement )* RIGHT_BRACE
            {
            match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_compound_statement_no_new_scope3571); if (state.failed) return stmt;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:492:22: (s= statement )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=PLUS && LA30_0<=DASH)||(LA30_0>=INC && LA30_0<=DEC)||LA30_0==LEFT_PAREN||LA30_0==LEFT_BRACE||LA30_0==BANG||(LA30_0>=SEMICOLON && LA30_0<=IF)||(LA30_0>=WHILE && LA30_0<=VOID)||(LA30_0>=IDENTIFIER && LA30_0<=TYPE)||(LA30_0>=65 && LA30_0<=69)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:492:23: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compound_statement_no_new_scope3576);
            	    s=statement();

            	    state._fsp--;
            	    if (state.failed) return stmt;
            	    if ( state.backtracking==0 ) {
            	       stmtList.add(s); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_compound_statement_no_new_scope3582); if (state.failed) return stmt;
            if ( state.backtracking==0 ) {
               stmt = tm.compoundStmt(stmtList); 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "compound_statement_no_new_scope"


    // $ANTLR start "expression_statement"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:496:1: expression_statement returns [Stmt stmt] : ( SEMICOLON | e= expression SEMICOLON );
    public final Stmt expression_statement() throws RecognitionException {
        Stmt stmt = null;

        Expr e = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:497:9: ( SEMICOLON | e= expression SEMICOLON )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEMICOLON) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=PLUS && LA31_0<=DASH)||(LA31_0>=INC && LA31_0<=DEC)||LA31_0==LEFT_PAREN||LA31_0==BANG||LA31_0==VOID||(LA31_0>=IDENTIFIER && LA31_0<=TYPE)) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return stmt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:497:11: SEMICOLON
                    {
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expression_statement3631); if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = tm.exprStmt(null); 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:498:11: e= expression SEMICOLON
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement3660);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return stmt;
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expression_statement3662); if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = tm.exprStmt(e); 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "expression_statement"


    // $ANTLR start "constant_expression"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:501:1: constant_expression returns [Expr expr] : c= conditional_expression ;
    public final Expr constant_expression() throws RecognitionException {
        Expr expr = null;

        Expr c = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:502:9: (c= conditional_expression )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:502:11: c= conditional_expression
            {
            pushFollow(FOLLOW_conditional_expression_in_constant_expression3703);
            c=conditional_expression();

            state._fsp--;
            if (state.failed) return expr;
            if ( state.backtracking==0 ) {
               expr = c; 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "constant_expression"


    // $ANTLR start "selection_statement"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:505:1: selection_statement returns [Stmt stmt] : IF LEFT_PAREN e= expression RIGHT_PAREN a= statement ( ELSE b= statement )? ;
    public final Stmt selection_statement() throws RecognitionException {
        Stmt stmt = null;

        Expr e = null;

        Stmt a = null;

        Stmt b = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:506:9: ( IF LEFT_PAREN e= expression RIGHT_PAREN a= statement ( ELSE b= statement )? )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:506:11: IF LEFT_PAREN e= expression RIGHT_PAREN a= statement ( ELSE b= statement )?
            {
            match(input,IF,FOLLOW_IF_in_selection_statement3734); if (state.failed) return stmt;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_selection_statement3736); if (state.failed) return stmt;
            pushFollow(FOLLOW_expression_in_selection_statement3740);
            e=expression();

            state._fsp--;
            if (state.failed) return stmt;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_selection_statement3742); if (state.failed) return stmt;
            pushFollow(FOLLOW_statement_in_selection_statement3746);
            a=statement();

            state._fsp--;
            if (state.failed) return stmt;
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:506:62: ( ELSE b= statement )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ELSE) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred62_JSL()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:506:63: ELSE b= statement
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_selection_statement3749); if (state.failed) return stmt;
                    pushFollow(FOLLOW_statement_in_selection_statement3753);
                    b=statement();

                    state._fsp--;
                    if (state.failed) return stmt;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               stmt = tm.selectStmt(e, a, (b != null) ? b : null); 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "selection_statement"


    // $ANTLR start "condition"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:511:1: condition returns [Expr expr] : e= expression ;
    public final Expr condition() throws RecognitionException {
        Expr expr = null;

        Expr e = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:512:9: (e= expression )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:512:11: e= expression
            {
            pushFollow(FOLLOW_expression_in_condition3803);
            e=expression();

            state._fsp--;
            if (state.failed) return expr;
            if ( state.backtracking==0 ) {
              expr = e; 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return expr;
    }
    // $ANTLR end "condition"


    // $ANTLR start "iteration_statement"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:516:1: iteration_statement returns [Stmt stmt] : ( WHILE LEFT_PAREN c= condition RIGHT_PAREN snns= statement_no_new_scope | DO s= statement WHILE LEFT_PAREN e= expression RIGHT_PAREN SEMICOLON | u= unroll_modifier FOR LEFT_PAREN init= for_init_statement rem= for_rest_statement RIGHT_PAREN snns= statement_no_new_scope | FOR LEFT_PAREN init= for_init_statement rem= for_rest_statement RIGHT_PAREN snns= statement_no_new_scope );
    public final Stmt iteration_statement() throws RecognitionException {
        Stmt stmt = null;

        Expr c = null;

        Stmt snns = null;

        Stmt s = null;

        Expr e = null;

        JSLParser.unroll_modifier_return u = null;

        Stmt init = null;

        JSLParser.for_rest_statement_return rem = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:517:9: ( WHILE LEFT_PAREN c= condition RIGHT_PAREN snns= statement_no_new_scope | DO s= statement WHILE LEFT_PAREN e= expression RIGHT_PAREN SEMICOLON | u= unroll_modifier FOR LEFT_PAREN init= for_init_statement rem= for_rest_statement RIGHT_PAREN snns= statement_no_new_scope | FOR LEFT_PAREN init= for_init_statement rem= for_rest_statement RIGHT_PAREN snns= statement_no_new_scope )
            int alt33=4;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt33=1;
                }
                break;
            case DO:
                {
                alt33=2;
                }
                break;
            case UNROLL:
                {
                alt33=3;
                }
                break;
            case FOR:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return stmt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:517:11: WHILE LEFT_PAREN c= condition RIGHT_PAREN snns= statement_no_new_scope
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_iteration_statement3835); if (state.failed) return stmt;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_iteration_statement3837); if (state.failed) return stmt;
                    pushFollow(FOLLOW_condition_in_iteration_statement3841);
                    c=condition();

                    state._fsp--;
                    if (state.failed) return stmt;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_iteration_statement3843); if (state.failed) return stmt;
                    pushFollow(FOLLOW_statement_no_new_scope_in_iteration_statement3847);
                    snns=statement_no_new_scope();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = tm.whileStmt(c, snns); 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:519:11: DO s= statement WHILE LEFT_PAREN e= expression RIGHT_PAREN SEMICOLON
                    {
                    match(input,DO,FOLLOW_DO_in_iteration_statement3875); if (state.failed) return stmt;
                    pushFollow(FOLLOW_statement_in_iteration_statement3879);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    match(input,WHILE,FOLLOW_WHILE_in_iteration_statement3881); if (state.failed) return stmt;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_iteration_statement3883); if (state.failed) return stmt;
                    pushFollow(FOLLOW_expression_in_iteration_statement3887);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return stmt;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_iteration_statement3889); if (state.failed) return stmt;
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_iteration_statement3891); if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = tm.doWhileStmt(s, e); 
                    }

                    }
                    break;
                case 3 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:521:11: u= unroll_modifier FOR LEFT_PAREN init= for_init_statement rem= for_rest_statement RIGHT_PAREN snns= statement_no_new_scope
                    {
                    pushFollow(FOLLOW_unroll_modifier_in_iteration_statement3921);
                    u=unroll_modifier();

                    state._fsp--;
                    if (state.failed) return stmt;
                    match(input,FOR,FOLLOW_FOR_in_iteration_statement3923); if (state.failed) return stmt;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_iteration_statement3925); if (state.failed) return stmt;
                    pushFollow(FOLLOW_for_init_statement_in_iteration_statement3929);
                    init=for_init_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    pushFollow(FOLLOW_for_rest_statement_in_iteration_statement3933);
                    rem=for_rest_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_iteration_statement3935); if (state.failed) return stmt;
                    pushFollow(FOLLOW_statement_no_new_scope_in_iteration_statement3939);
                    snns=statement_no_new_scope();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = tm.forStmt(init, (rem!=null?rem.cond:null), (rem!=null?rem.expr:null), snns, (u!=null?u.max:0), (u!=null?u.check:0)); 
                    }

                    }
                    break;
                case 4 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:523:11: FOR LEFT_PAREN init= for_init_statement rem= for_rest_statement RIGHT_PAREN snns= statement_no_new_scope
                    {
                    match(input,FOR,FOLLOW_FOR_in_iteration_statement3967); if (state.failed) return stmt;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_iteration_statement3969); if (state.failed) return stmt;
                    pushFollow(FOLLOW_for_init_statement_in_iteration_statement3973);
                    init=for_init_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    pushFollow(FOLLOW_for_rest_statement_in_iteration_statement3977);
                    rem=for_rest_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_iteration_statement3979); if (state.failed) return stmt;
                    pushFollow(FOLLOW_statement_no_new_scope_in_iteration_statement3983);
                    snns=statement_no_new_scope();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = tm.forStmt(init, (rem!=null?rem.cond:null), (rem!=null?rem.expr:null), snns, -1, -1); 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "iteration_statement"

    public static class unroll_modifier_return extends ParserRuleReturnScope {
        public int max;
        public int check;
    };

    // $ANTLR start "unroll_modifier"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:527:1: unroll_modifier returns [int max, int check] : UNROLL LEFT_PAREN m= INTCONSTANT COMMA c= INTCONSTANT RIGHT_PAREN ;
    public final JSLParser.unroll_modifier_return unroll_modifier() throws RecognitionException {
        JSLParser.unroll_modifier_return retval = new JSLParser.unroll_modifier_return();
        retval.start = input.LT(1);

        Token m=null;
        Token c=null;

        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:528:9: ( UNROLL LEFT_PAREN m= INTCONSTANT COMMA c= INTCONSTANT RIGHT_PAREN )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:528:11: UNROLL LEFT_PAREN m= INTCONSTANT COMMA c= INTCONSTANT RIGHT_PAREN
            {
            match(input,UNROLL,FOLLOW_UNROLL_in_unroll_modifier4028); if (state.failed) return retval;
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_unroll_modifier4030); if (state.failed) return retval;
            m=(Token)match(input,INTCONSTANT,FOLLOW_INTCONSTANT_in_unroll_modifier4034); if (state.failed) return retval;
            match(input,COMMA,FOLLOW_COMMA_in_unroll_modifier4036); if (state.failed) return retval;
            c=(Token)match(input,INTCONSTANT,FOLLOW_INTCONSTANT_in_unroll_modifier4040); if (state.failed) return retval;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_unroll_modifier4042); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.max = Integer.valueOf((m!=null?m.getText():null)); retval.check = Integer.valueOf((c!=null?c.getText():null)); 
            }

            }

            retval.stop = input.LT(-1);

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unroll_modifier"


    // $ANTLR start "for_init_statement"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:532:1: for_init_statement returns [Stmt stmt] : (e= expression_statement | d= declaration_statement );
    public final Stmt for_init_statement() throws RecognitionException {
        Stmt stmt = null;

        Stmt e = null;

        Stmt d = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:533:9: (e= expression_statement | d= declaration_statement )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:533:11: e= expression_statement
                    {
                    pushFollow(FOLLOW_expression_statement_in_for_init_statement4089);
                    e=expression_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = e; 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:534:11: d= declaration_statement
                    {
                    pushFollow(FOLLOW_declaration_statement_in_for_init_statement4106);
                    d=declaration_statement();

                    state._fsp--;
                    if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = d; 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "for_init_statement"

    public static class for_rest_statement_return extends ParserRuleReturnScope {
        public Expr cond;
        public Expr expr;
    };

    // $ANTLR start "for_rest_statement"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:537:1: for_rest_statement returns [Expr cond, Expr expr] : (c= condition SEMICOLON (e= expression )? | SEMICOLON (e= expression )? );
    public final JSLParser.for_rest_statement_return for_rest_statement() throws RecognitionException {
        JSLParser.for_rest_statement_return retval = new JSLParser.for_rest_statement_return();
        retval.start = input.LT(1);

        Expr c = null;

        Expr e = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:538:9: (c= condition SEMICOLON (e= expression )? | SEMICOLON (e= expression )? )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=PLUS && LA37_0<=DASH)||(LA37_0>=INC && LA37_0<=DEC)||LA37_0==LEFT_PAREN||LA37_0==BANG||LA37_0==VOID||(LA37_0>=IDENTIFIER && LA37_0<=TYPE)) ) {
                alt37=1;
            }
            else if ( (LA37_0==SEMICOLON) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:538:11: c= condition SEMICOLON (e= expression )?
                    {
                    pushFollow(FOLLOW_condition_in_for_rest_statement4147);
                    c=condition();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_for_rest_statement4149); if (state.failed) return retval;
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:538:34: (e= expression )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=PLUS && LA35_0<=DASH)||(LA35_0>=INC && LA35_0<=DEC)||LA35_0==LEFT_PAREN||LA35_0==BANG||LA35_0==VOID||(LA35_0>=IDENTIFIER && LA35_0<=TYPE)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:0:0: e= expression
                            {
                            pushFollow(FOLLOW_expression_in_for_rest_statement4153);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       retval.cond = c; if (e != null) retval.expr = e; 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:539:11: SEMICOLON (e= expression )?
                    {
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_for_rest_statement4168); if (state.failed) return retval;
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:539:22: (e= expression )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=PLUS && LA36_0<=DASH)||(LA36_0>=INC && LA36_0<=DEC)||LA36_0==LEFT_PAREN||LA36_0==BANG||LA36_0==VOID||(LA36_0>=IDENTIFIER && LA36_0<=TYPE)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:0:0: e= expression
                            {
                            pushFollow(FOLLOW_expression_in_for_rest_statement4172);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       if (e != null) retval.expr = e; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_rest_statement"


    // $ANTLR start "jump_statement"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:542:1: jump_statement returns [Stmt stmt] : ( CONTINUE SEMICOLON | BREAK SEMICOLON | DISCARD SEMICOLON | RETURN SEMICOLON | RETURN e= expression SEMICOLON );
    public final Stmt jump_statement() throws RecognitionException {
        Stmt stmt = null;

        Expr e = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:543:9: ( CONTINUE SEMICOLON | BREAK SEMICOLON | DISCARD SEMICOLON | RETURN SEMICOLON | RETURN e= expression SEMICOLON )
            int alt38=5;
            switch ( input.LA(1) ) {
            case CONTINUE:
                {
                alt38=1;
                }
                break;
            case BREAK:
                {
                alt38=2;
                }
                break;
            case DISCARD:
                {
                alt38=3;
                }
                break;
            case RETURN:
                {
                int LA38_4 = input.LA(2);

                if ( (LA38_4==SEMICOLON) ) {
                    alt38=4;
                }
                else if ( ((LA38_4>=PLUS && LA38_4<=DASH)||(LA38_4>=INC && LA38_4<=DEC)||LA38_4==LEFT_PAREN||LA38_4==BANG||LA38_4==VOID||(LA38_4>=IDENTIFIER && LA38_4<=TYPE)) ) {
                    alt38=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return stmt;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return stmt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:543:11: CONTINUE SEMICOLON
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement4212); if (state.failed) return stmt;
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_jump_statement4214); if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = tm.continueStmt(); 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:544:11: BREAK SEMICOLON
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_jump_statement4239); if (state.failed) return stmt;
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_jump_statement4241); if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = tm.breakStmt(); 
                    }

                    }
                    break;
                case 3 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:545:11: DISCARD SEMICOLON
                    {
                    match(input,DISCARD,FOLLOW_DISCARD_in_jump_statement4269); if (state.failed) return stmt;
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_jump_statement4271); if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = tm.discardStmt(); 
                    }

                    }
                    break;
                case 4 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:546:11: RETURN SEMICOLON
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_jump_statement4297); if (state.failed) return stmt;
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_jump_statement4299); if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = tm.returnStmt(null); 
                    }

                    }
                    break;
                case 5 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:547:11: RETURN e= expression SEMICOLON
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_jump_statement4326); if (state.failed) return stmt;
                    pushFollow(FOLLOW_expression_in_jump_statement4330);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return stmt;
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_jump_statement4332); if (state.failed) return stmt;
                    if ( state.backtracking==0 ) {
                       stmt = tm.returnStmt(e); 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "jump_statement"


    // $ANTLR start "translation_unit"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:553:1: translation_unit returns [ProgramUnit prog] : (e= external_declaration )+ ;
    public final ProgramUnit translation_unit() throws RecognitionException {
        ProgramUnit prog = null;

        List<ExtDecl> e = null;



            List<ExtDecl> declList = new ArrayList<ExtDecl>();

        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:557:9: ( (e= external_declaration )+ )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:557:11: (e= external_declaration )+
            {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:557:11: (e= external_declaration )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==VOID||(LA39_0>=TYPE && LA39_0<=GLUE_BLOCK)||(LA39_0>=65 && LA39_0<=69)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:557:12: e= external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit4382);
            	    e=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return prog;
            	    if ( state.backtracking==0 ) {
            	       declList.addAll(e); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return prog;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            if ( state.backtracking==0 ) {
               prog = tm.programUnit(declList); 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return prog;
    }
    // $ANTLR end "translation_unit"


    // $ANTLR start "external_declaration"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:561:1: external_declaration returns [List<ExtDecl> res = new ArrayList<ExtDecl>()] : (f= function_definition | d= declaration | g= glue_block );
    public final List<ExtDecl> external_declaration() throws RecognitionException {
        List<ExtDecl> res =  new ArrayList<ExtDecl>();

        FuncDef f = null;

        List<VarDecl> d = null;

        GlueBlock g = null;


        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:562:9: (f= function_definition | d= declaration | g= glue_block )
            int alt40=3;
            switch ( input.LA(1) ) {
            case VOID:
            case TYPE:
                {
                int LA40_1 = input.LA(2);

                if ( (synpred75_JSL()) ) {
                    alt40=1;
                }
                else if ( (synpred76_JSL()) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return res;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt40=2;
                }
                break;
            case GLUE_BLOCK:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return res;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:562:11: f= function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_external_declaration4440);
                    f=function_definition();

                    state._fsp--;
                    if (state.failed) return res;
                    if ( state.backtracking==0 ) {
                       res.add(f); 
                    }

                    }
                    break;
                case 2 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:563:11: d= declaration
                    {
                    pushFollow(FOLLOW_declaration_in_external_declaration4456);
                    d=declaration();

                    state._fsp--;
                    if (state.failed) return res;
                    if ( state.backtracking==0 ) {
                       res.addAll(d); 
                    }

                    }
                    break;
                case 3 :
                    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:564:11: g= glue_block
                    {
                    pushFollow(FOLLOW_glue_block_in_external_declaration4480);
                    g=glue_block();

                    state._fsp--;
                    if (state.failed) return res;
                    if ( state.backtracking==0 ) {
                       res.add(g); 
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return res;
    }
    // $ANTLR end "external_declaration"


    // $ANTLR start "function_definition"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:570:1: function_definition returns [FuncDef def] : p= function_prototype s= compound_statement_no_new_scope ;
    public final FuncDef function_definition() throws RecognitionException {
        FuncDef def = null;

        Function p = null;

        Stmt s = null;



        	symbols.enterFrame();

        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:574:9: (p= function_prototype s= compound_statement_no_new_scope )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:574:11: p= function_prototype s= compound_statement_no_new_scope
            {
            pushFollow(FOLLOW_function_prototype_in_function_definition4530);
            p=function_prototype();

            state._fsp--;
            if (state.failed) return def;
            pushFollow(FOLLOW_compound_statement_no_new_scope_in_function_definition4534);
            s=compound_statement_no_new_scope();

            state._fsp--;
            if (state.failed) return def;
            if ( state.backtracking==0 ) {
               def = tm.funcDef(p, s); 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {

                    symbols.exitFrame();

        }
        return def;
    }
    // $ANTLR end "function_definition"


    // $ANTLR start "glue_block"
    // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:580:1: glue_block returns [GlueBlock block] : g= GLUE_BLOCK ;
    public final GlueBlock glue_block() throws RecognitionException {
        GlueBlock block = null;

        Token g=null;

        try {
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:581:9: (g= GLUE_BLOCK )
            // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:581:11: g= GLUE_BLOCK
            {
            g=(Token)match(input,GLUE_BLOCK,FOLLOW_GLUE_BLOCK_in_glue_block4571); if (state.failed) return block;
            if ( state.backtracking==0 ) {
               block = tm.glueBlock((g!=null?g.getText():null).substring(2, (g!=null?g.getText():null).length()-2)); 
            }

            }

        }

            catch (RecognitionException ex) {
                throw ex;
            }
        finally {
        }
        return block;
    }
    // $ANTLR end "glue_block"

    // $ANTLR start synpred7_JSL
    public final void synpred7_JSL_fragment() throws RecognitionException {   
        Expr e = null;

        Expr ae = null;

        String fs = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:167:11: (e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET fs= field_selection )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:167:11: e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET fs= field_selection
        {
        pushFollow(FOLLOW_primary_or_call_in_synpred7_JSL994);
        e=primary_or_call();

        state._fsp--;
        if (state.failed) return ;
        match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_synpred7_JSL996); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred7_JSL1000);
        ae=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_synpred7_JSL1002); if (state.failed) return ;
        pushFollow(FOLLOW_field_selection_in_synpred7_JSL1006);
        fs=field_selection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_JSL

    // $ANTLR start synpred8_JSL
    public final void synpred8_JSL_fragment() throws RecognitionException {   
        Expr e = null;

        Expr ae = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:169:11: (e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:169:11: e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET
        {
        pushFollow(FOLLOW_primary_or_call_in_synpred8_JSL1036);
        e=primary_or_call();

        state._fsp--;
        if (state.failed) return ;
        match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_synpred8_JSL1038); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred8_JSL1042);
        ae=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_synpred8_JSL1044); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_JSL

    // $ANTLR start synpred9_JSL
    public final void synpred9_JSL_fragment() throws RecognitionException {   
        Expr e = null;

        String fs = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:171:11: (e= primary_or_call fs= field_selection )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:171:11: e= primary_or_call fs= field_selection
        {
        pushFollow(FOLLOW_primary_or_call_in_synpred9_JSL1074);
        e=primary_or_call();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_field_selection_in_synpred9_JSL1078);
        fs=field_selection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_JSL

    // $ANTLR start synpred10_JSL
    public final void synpred10_JSL_fragment() throws RecognitionException {   
        Expr e = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:173:11: (e= primary_or_call INC )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:173:11: e= primary_or_call INC
        {
        pushFollow(FOLLOW_primary_or_call_in_synpred10_JSL1108);
        e=primary_or_call();

        state._fsp--;
        if (state.failed) return ;
        match(input,INC,FOLLOW_INC_in_synpred10_JSL1110); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_JSL

    // $ANTLR start synpred11_JSL
    public final void synpred11_JSL_fragment() throws RecognitionException {   
        Expr e = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:175:11: (e= primary_or_call DEC )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:175:11: e= primary_or_call DEC
        {
        pushFollow(FOLLOW_primary_or_call_in_synpred11_JSL1140);
        e=primary_or_call();

        state._fsp--;
        if (state.failed) return ;
        match(input,DEC,FOLLOW_DEC_in_synpred11_JSL1142); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_JSL

    // $ANTLR start synpred21_JSL
    public final void synpred21_JSL_fragment() throws RecognitionException {   
        Expr b = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:221:12: ( STAR b= multiplicative_expression )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:221:12: STAR b= multiplicative_expression
        {
        match(input,STAR,FOLLOW_STAR_in_synpred21_JSL1551); if (state.failed) return ;
        pushFollow(FOLLOW_multiplicative_expression_in_synpred21_JSL1556);
        b=multiplicative_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_JSL

    // $ANTLR start synpred22_JSL
    public final void synpred22_JSL_fragment() throws RecognitionException {   
        Expr b = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:222:12: ( SLASH b= multiplicative_expression )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:222:12: SLASH b= multiplicative_expression
        {
        match(input,SLASH,FOLLOW_SLASH_in_synpred22_JSL1571); if (state.failed) return ;
        pushFollow(FOLLOW_multiplicative_expression_in_synpred22_JSL1575);
        b=multiplicative_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_JSL

    // $ANTLR start synpred35_JSL
    public final void synpred35_JSL_fragment() throws RecognitionException {   
        Expr a = null;

        JSLParser.assignment_operator_return op = null;

        Expr b = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:277:11: (a= unary_expression op= assignment_operator b= assignment_expression )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:277:11: a= unary_expression op= assignment_operator b= assignment_expression
        {
        pushFollow(FOLLOW_unary_expression_in_synpred35_JSL2219);
        a=unary_expression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_assignment_operator_in_synpred35_JSL2223);
        op=assignment_operator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_assignment_expression_in_synpred35_JSL2227);
        b=assignment_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_JSL

    // $ANTLR start synpred54_JSL
    public final void synpred54_JSL_fragment() throws RecognitionException {   
        Stmt d = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:468:11: (d= declaration_statement )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:468:11: d= declaration_statement
        {
        pushFollow(FOLLOW_declaration_statement_in_synpred54_JSL3314);
        d=declaration_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_JSL

    // $ANTLR start synpred55_JSL
    public final void synpred55_JSL_fragment() throws RecognitionException {   
        Stmt e = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:469:11: (e= expression_statement )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:469:11: e= expression_statement
        {
        pushFollow(FOLLOW_expression_statement_in_synpred55_JSL3330);
        e=expression_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_JSL

    // $ANTLR start synpred62_JSL
    public final void synpred62_JSL_fragment() throws RecognitionException {   
        Stmt b = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:506:63: ( ELSE b= statement )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:506:63: ELSE b= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred62_JSL3749); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred62_JSL3753);
        b=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_JSL

    // $ANTLR start synpred66_JSL
    public final void synpred66_JSL_fragment() throws RecognitionException {   
        Stmt e = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:533:11: (e= expression_statement )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:533:11: e= expression_statement
        {
        pushFollow(FOLLOW_expression_statement_in_synpred66_JSL4089);
        e=expression_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_JSL

    // $ANTLR start synpred75_JSL
    public final void synpred75_JSL_fragment() throws RecognitionException {   
        FuncDef f = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:562:11: (f= function_definition )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:562:11: f= function_definition
        {
        pushFollow(FOLLOW_function_definition_in_synpred75_JSL4440);
        f=function_definition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_JSL

    // $ANTLR start synpred76_JSL
    public final void synpred76_JSL_fragment() throws RecognitionException {   
        List<VarDecl> d = null;


        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:563:11: (d= declaration )
        // /home/geertjan/NetBeansProjects/api-samples/versions/7.3/misc/JSL-ANTLR-Generator/src/jsl/antlr/generator/JSL.g:563:11: d= declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred76_JSL4456);
        d=declaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_JSL

    // Delegated rules

    public final boolean synpred21_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_JSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_JSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\15\uffff";
    static final String DFA4_minS =
        "\1\27\6\0\6\uffff";
    static final String DFA4_maxS =
        "\1\70\6\0\6\uffff";
    static final String DFA4_acceptS =
        "\7\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String DFA4_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\6\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\5\31\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "166:1: postfix_expression returns [Expr expr] : (e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET fs= field_selection | e= primary_or_call LEFT_BRACKET ae= expression RIGHT_BRACKET | e= primary_or_call fs= field_selection | e= primary_or_call INC | e= primary_or_call DEC | e= primary_or_call );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_JSL()) ) {s = 7;}

                        else if ( (synpred8_JSL()) ) {s = 8;}

                        else if ( (synpred9_JSL()) ) {s = 9;}

                        else if ( (synpred10_JSL()) ) {s = 10;}

                        else if ( (synpred11_JSL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_JSL()) ) {s = 7;}

                        else if ( (synpred8_JSL()) ) {s = 8;}

                        else if ( (synpred9_JSL()) ) {s = 9;}

                        else if ( (synpred10_JSL()) ) {s = 10;}

                        else if ( (synpred11_JSL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_JSL()) ) {s = 7;}

                        else if ( (synpred8_JSL()) ) {s = 8;}

                        else if ( (synpred9_JSL()) ) {s = 9;}

                        else if ( (synpred10_JSL()) ) {s = 10;}

                        else if ( (synpred11_JSL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_JSL()) ) {s = 7;}

                        else if ( (synpred8_JSL()) ) {s = 8;}

                        else if ( (synpred9_JSL()) ) {s = 9;}

                        else if ( (synpred10_JSL()) ) {s = 10;}

                        else if ( (synpred11_JSL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_JSL()) ) {s = 7;}

                        else if ( (synpred8_JSL()) ) {s = 8;}

                        else if ( (synpred9_JSL()) ) {s = 9;}

                        else if ( (synpred10_JSL()) ) {s = 10;}

                        else if ( (synpred11_JSL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_JSL()) ) {s = 7;}

                        else if ( (synpred8_JSL()) ) {s = 8;}

                        else if ( (synpred9_JSL()) ) {s = 9;}

                        else if ( (synpred10_JSL()) ) {s = 10;}

                        else if ( (synpred11_JSL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\16\uffff";
    static final String DFA18_eofS =
        "\16\uffff";
    static final String DFA18_minS =
        "\1\6\13\0\2\uffff";
    static final String DFA18_maxS =
        "\1\70\13\0\2\uffff";
    static final String DFA18_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA18_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\11\1\12\11\uffff\1\7\1\10\4\uffff\1\5\12\uffff\1\13\16\uffff"+
            "\1\6\2\uffff\1\1\1\2\1\3\1\4\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "276:1: assignment_expression returns [Expr expr] : (a= unary_expression op= assignment_operator b= assignment_expression | c= conditional_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_JSL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_JSL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_JSL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_JSL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_JSL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_JSL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_JSL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_JSL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_JSL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_10 = input.LA(1);

                         
                        int index18_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_JSL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index18_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_11 = input.LA(1);

                         
                        int index18_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_JSL()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index18_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\30\uffff";
    static final String DFA27_eofS =
        "\30\uffff";
    static final String DFA27_minS =
        "\1\6\2\uffff\1\0\24\uffff";
    static final String DFA27_maxS =
        "\1\105\2\uffff\1\0\24\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\12\uffff\1\3\1\4\3\uffff\1\5\3\uffff";
    static final String DFA27_specialS =
        "\3\uffff\1\0\24\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\4\11\uffff\2\4\4\uffff\1\4\12\uffff\1\4\3\uffff\1\4\1\17"+
            "\1\uffff\4\20\4\24\1\3\2\uffff\4\4\1\3\10\uffff\5\1",
            "",
            "",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "467:1: simple_statement returns [Stmt stmt] : (d= declaration_statement | e= expression_statement | s= selection_statement | i= iteration_statement | j= jump_statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_3 = input.LA(1);

                         
                        int index27_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_JSL()) ) {s = 1;}

                        else if ( (synpred55_JSL()) ) {s = 4;}

                         
                        input.seek(index27_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\17\uffff";
    static final String DFA34_eofS =
        "\17\uffff";
    static final String DFA34_minS =
        "\1\6\6\uffff\1\0\7\uffff";
    static final String DFA34_maxS =
        "\1\105\6\uffff\1\0\7\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\13\uffff\1\2\1\uffff";
    static final String DFA34_specialS =
        "\7\uffff\1\0\7\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\1\11\uffff\2\1\4\uffff\1\1\12\uffff\1\1\3\uffff\1\1\12\uffff"+
            "\1\7\2\uffff\4\1\1\7\10\uffff\5\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "532:1: for_init_statement returns [Stmt stmt] : (e= expression_statement | d= declaration_statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_JSL()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_RGBA_FIELDS_in_field_selection780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XYZW_FIELDS_in_field_selection796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTCONSTANT_in_primary_expression844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATCONSTANT_in_primary_expression860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLCONSTANT_in_primary_expression874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_primary_expression889 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_expression_in_primary_expression893 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_primary_expression895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_primary_or_call928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_primary_or_call944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_or_call_in_postfix_expression994 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_postfix_expression996 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_expression_in_postfix_expression1000 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_postfix_expression1002 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_field_selection_in_postfix_expression1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_or_call_in_postfix_expression1036 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_postfix_expression1038 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_expression_in_postfix_expression1042 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_postfix_expression1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_or_call_in_postfix_expression1074 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_field_selection_in_postfix_expression1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_or_call_in_postfix_expression1108 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_INC_in_postfix_expression1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_or_call_in_postfix_expression1140 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DEC_in_postfix_expression1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_or_call_in_postfix_expression1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_call1224 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function_call1226 = new BitSet(new long[]{0x01F20004018600C0L});
    public static final BitSet FOLLOW_function_call_parameter_list_in_function_call1230 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function_call1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_function_call1261 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function_call1263 = new BitSet(new long[]{0x01F20004018600C0L});
    public static final BitSet FOLLOW_function_call_parameter_list_in_function_call1267 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function_call1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_function_call_parameter_list1323 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_function_call_parameter_list1338 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_assignment_expression_in_function_call_parameter_list1342 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unary_expression1414 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unary_expression1434 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression1454 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DASH_in_unary_expression1473 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_unary_expression1492 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1536 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_STAR_in_multiplicative_expression1551 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_multiplicative_expression_in_multiplicative_expression1556 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_SLASH_in_multiplicative_expression1571 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_multiplicative_expression_in_multiplicative_expression1575 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1629 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression1644 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1648 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_DASH_in_additive_expression1663 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1667 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression1713 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_LTEQ_in_relational_expression1728 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression1732 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_GTEQ_in_relational_expression1747 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression1751 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_LT_in_relational_expression1766 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression1772 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_GT_in_relational_expression1787 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression1793 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1839 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_EQEQ_in_equality_expression1854 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1858 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_NEQ_in_equality_expression1874 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1878 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_equality_expression_in_logical_and_expression1932 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression1947 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_equality_expression_in_logical_and_expression1951 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_xor_expression2005 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_XOR_in_logical_xor_expression2020 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_xor_expression2024 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_logical_xor_expression_in_logical_or_expression2078 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression2093 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_logical_xor_expression_in_logical_or_expression2097 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_QUESTION_in_ternary_part2145 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_expression_in_ternary_part2147 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_COLON_in_ternary_part2149 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_assignment_expression_in_ternary_part2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression2183 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ternary_part_in_conditional_expression2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_assignment_expression2219 = new BitSet(new long[]{0x0000000200780000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression2223 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_function_prototype2416 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_prototype2420 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function_prototype2422 = new BitSet(new long[]{0x01F2000001800000L});
    public static final BitSet FOLLOW_parameter_declaration_list_in_function_prototype2426 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function_prototype2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_parameter_declaration2482 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter_declaration2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declaration_list2531 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_declaration_list2546 = new BitSet(new long[]{0x01F2000000800000L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declaration_list2550 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_declaration_identifier_and_init2594 = new BitSet(new long[]{0x0000000202000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_declaration_identifier_and_init2609 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_constant_expression_in_declaration_identifier_and_init2613 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_declaration_identifier_and_init2617 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_EQUAL_in_declaration_identifier_and_init2632 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_initializer_in_declaration_identifier_and_init2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_specified_type_in_single_declaration2671 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_declaration_identifier_and_init_in_single_declaration2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_declaration_in_declaration2726 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_COMMA_in_declaration2741 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_declaration_identifier_and_init_in_declaration2745 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_declaration2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_fully_specified_type2814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_type_precision_in_fully_specified_type2818 = new BitSet(new long[]{0x01F2000000800000L});
    public static final BitSet FOLLOW_type_specifier_in_fully_specified_type2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_fully_specified_type2850 = new BitSet(new long[]{0x01F2000000800000L});
    public static final BitSet FOLLOW_type_specifier_in_fully_specified_type2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_precision_in_fully_specified_type2882 = new BitSet(new long[]{0x01F2000000800000L});
    public static final BitSet FOLLOW_type_specifier_in_fully_specified_type2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_fully_specified_type2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_qualifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_precision0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_nonarray_in_type_specifier3055 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_array_brackets_in_type_specifier3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_array_brackets3091 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_constant_expression_in_array_brackets3093 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_array_brackets3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_specifier_nonarray0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declaration_statement3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_statement_in_statement3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statement_in_simple_statement3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_simple_statement3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_simple_statement3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_simple_statement3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_simple_statement3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_compound_statement3434 = new BitSet(new long[]{0x01F3FEC4188600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_statement_in_compound_statement3439 = new BitSet(new long[]{0x01F3FEC4188600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_compound_statement3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_no_new_scope_in_statement_no_new_scope3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_statement_in_statement_no_new_scope3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_compound_statement_no_new_scope3571 = new BitSet(new long[]{0x01F3FEC4188600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_statement_in_compound_statement_no_new_scope3576 = new BitSet(new long[]{0x01F3FEC4188600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_compound_statement_no_new_scope3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_expression_statement3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement3660 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_expression_statement3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement3734 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_selection_statement3736 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_expression_in_selection_statement3740 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_selection_statement3742 = new BitSet(new long[]{0x01F3FEC4088600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_statement_in_selection_statement3746 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement3749 = new BitSet(new long[]{0x01F3FEC4088600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_statement_in_selection_statement3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_condition3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement3835 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_iteration_statement3837 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_condition_in_iteration_statement3841 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_iteration_statement3843 = new BitSet(new long[]{0x01F3FEC4088600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_statement_no_new_scope_in_iteration_statement3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_iteration_statement3875 = new BitSet(new long[]{0x01F3FEC4088600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_statement_in_iteration_statement3879 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_WHILE_in_iteration_statement3881 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_iteration_statement3883 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_expression_in_iteration_statement3887 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_iteration_statement3889 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_iteration_statement3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unroll_modifier_in_iteration_statement3921 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement3923 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_iteration_statement3925 = new BitSet(new long[]{0x01F20044008600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_for_init_statement_in_iteration_statement3929 = new BitSet(new long[]{0x01F20044008600C0L});
    public static final BitSet FOLLOW_for_rest_statement_in_iteration_statement3933 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_iteration_statement3935 = new BitSet(new long[]{0x01F3FEC4088600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_statement_no_new_scope_in_iteration_statement3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_iteration_statement3967 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_iteration_statement3969 = new BitSet(new long[]{0x01F20044008600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_for_init_statement_in_iteration_statement3973 = new BitSet(new long[]{0x01F20044008600C0L});
    public static final BitSet FOLLOW_for_rest_statement_in_iteration_statement3977 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_iteration_statement3979 = new BitSet(new long[]{0x01F3FEC4088600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_statement_no_new_scope_in_iteration_statement3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNROLL_in_unroll_modifier4028 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_unroll_modifier4030 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTCONSTANT_in_unroll_modifier4034 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_COMMA_in_unroll_modifier4036 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTCONSTANT_in_unroll_modifier4040 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_unroll_modifier4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_for_init_statement4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statement_in_for_init_statement4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_for_rest_statement4147 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_for_rest_statement4149 = new BitSet(new long[]{0x01F20004008600C2L});
    public static final BitSet FOLLOW_expression_in_for_rest_statement4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_for_rest_statement4168 = new BitSet(new long[]{0x01F20004008600C2L});
    public static final BitSet FOLLOW_expression_in_for_rest_statement4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement4212 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_jump_statement4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement4239 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_jump_statement4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISCARD_in_jump_statement4269 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_jump_statement4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement4297 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_jump_statement4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement4326 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_expression_in_jump_statement4330 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_jump_statement4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit4382 = new BitSet(new long[]{0x03F2000000800002L,0x000000000000003EL});
    public static final BitSet FOLLOW_function_definition_in_external_declaration4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_external_declaration4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_glue_block_in_external_declaration4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_prototype_in_function_definition4530 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_compound_statement_no_new_scope_in_function_definition4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GLUE_BLOCK_in_glue_block4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_or_call_in_synpred7_JSL994 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_synpred7_JSL996 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_expression_in_synpred7_JSL1000 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_synpred7_JSL1002 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_field_selection_in_synpred7_JSL1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_or_call_in_synpred8_JSL1036 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_synpred8_JSL1038 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_expression_in_synpred8_JSL1042 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_synpred8_JSL1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_or_call_in_synpred9_JSL1074 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_field_selection_in_synpred9_JSL1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_or_call_in_synpred10_JSL1108 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_INC_in_synpred10_JSL1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_or_call_in_synpred11_JSL1140 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DEC_in_synpred11_JSL1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_synpred21_JSL1551 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_multiplicative_expression_in_synpred21_JSL1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASH_in_synpred22_JSL1571 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_multiplicative_expression_in_synpred22_JSL1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_synpred35_JSL2219 = new BitSet(new long[]{0x0000000200780000L});
    public static final BitSet FOLLOW_assignment_operator_in_synpred35_JSL2223 = new BitSet(new long[]{0x01F20004008600C0L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred35_JSL2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statement_in_synpred54_JSL3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_synpred55_JSL3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred62_JSL3749 = new BitSet(new long[]{0x01F3FEC4088600C0L,0x000000000000003EL});
    public static final BitSet FOLLOW_statement_in_synpred62_JSL3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_synpred66_JSL4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_synpred75_JSL4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred76_JSL4456 = new BitSet(new long[]{0x0000000000000002L});

}