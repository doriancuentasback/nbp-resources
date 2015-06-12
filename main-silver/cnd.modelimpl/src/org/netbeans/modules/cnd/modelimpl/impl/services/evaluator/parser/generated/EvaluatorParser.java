// $ANTLR 3.4 D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g 2015-06-11 15:15:47

package org.netbeans.modules.cnd.modelimpl.impl.services.evaluator.parser.generated;

import java.util.HashMap;
import org.netbeans.modules.cnd.modelimpl.impl.services.evaluator.VariableProvider;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked", "cast", "fallthrough"})
public class EvaluatorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ELLIPSIS", "DOT", "ASSIGNEQUAL", "COLON", "COMMA", "QUESTIONMARK", "SEMICOLON", "POINTERTO", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", "EQUAL", "NOTEQUAL", "LESSTHANOREQUALTO", "LESSTHAN", "GREATERTHANOREQUALTO", "GREATERTHAN", "DIVIDE", "DIVIDEEQUAL", "PLUS", "PLUSEQUAL", "PLUSPLUS", "MINUS", "MINUSEQUAL", "MINUSMINUS", "STAR", "TIMESEQUAL", "MOD", "MODEQUAL", "SHIFTRIGHT", "SHIFTRIGHTEQUAL", "SHIFTLEFT", "SHIFTLEFTEQUAL", "AND", "NOT", "OR", "AMPERSAND", "BITWISEANDEQUAL", "TILDE", "BITWISEOR", "BITWISEOREQUAL", "BITWISEXOR", "BITWISEXOREQUAL", "POINTERTOMBR", "DOTMBR", "SCOPE", "AT", "DOLLAR", "BACK_SLASH", "DEFINED", "DBL_SHARP", "SHARP", "FUN_LIKE_MACRO_LPAREN", "GRAVE_ACCENT", "END_PREPROC_DIRECTIVE", "LAST_CONST_TEXT_TOKEN", "FLOATONE", "FLOATTWO", "HEXADECIMALINT", "OCTALINT", "DECIMALINT", "Whitespace", "EndOfLine", "Skip", "PreProcComment", "PPLiterals", "Space", "PreProcBlockComment", "PreProcLineComment", "Comment", "CPPComment", "CHAR_LITERAL", "STRING_LITERAL", "InterStringWhitespace", "StringPart", "Escape", "Digit", "Decimal", "LongSuffix", "UnsignedSuffix", "FloatSuffix", "Exponent", "Vocabulary", "NUMBER", "IDENT", "BINARYINT", "INCLUDE_STRING", "SYS_INCLUDE_STRING", "INCLUDE", "INCLUDE_NEXT", "DEFINE", "UNDEF", "IFDEF", "IFNDEF", "IF", "ELIF", "ELSE", "ENDIF", "PRAGMA", "LINE", "ERROR", "PREPROC_DIRECTIVE", "FIRST_LITERAL_TOKEN", "LITERAL_OPERATOR", "LITERAL_alignof", "LITERAL___alignof__", "LITERAL_typeof", "LITERAL___typeof__", "LITERAL___typeof", "LITERAL_template", "LITERAL_typedef", "LITERAL_enum", "LITERAL_namespace", "LITERAL_extern", "LITERAL_inline", "LITERAL__inline", "LITERAL___inline__", "LITERAL___inline", "LITERAL_virtual", "LITERAL_explicit", "LITERAL_friend", "LITERAL__stdcall", "LITERAL___stdcall", "LITERAL_typename", "LITERAL_auto", "LITERAL_register", "LITERAL_static", "LITERAL_mutable", "LITERAL_const", "LITERAL___const__", "LITERAL___const", "LITERAL_const_cast", "LITERAL_volatile", "LITERAL___volatile__", "LITERAL___volatile", "LITERAL_char", "LITERAL_wchar_t", "LITERAL_bool", "LITERAL_short", "LITERAL_int", "LITERAL_long", "LITERAL_signed", "LITERAL___signed__", "LITERAL___signed", "LITERAL_unsigned", "LITERAL___unsigned__", "LITERAL_float", "LITERAL_double", "LITERAL_void", "LITERAL__declspec", "LITERAL___declspec", "LITERAL_class", "LITERAL_struct", "LITERAL_union", "LITERAL_this", "LITERAL_true", "LITERAL_false", "LITERAL_public", "LITERAL_protected", "LITERAL_private", "LITERAL_throw", "LITERAL_case", "LITERAL_default", "LITERAL_if", "LITERAL_else", "LITERAL_switch", "LITERAL_while", "LITERAL_do", "LITERAL_for", "LITERAL_goto", "LITERAL_continue", "LITERAL_break", "LITERAL_return", "LITERAL_try", "LITERAL_catch", "LITERAL_using", "LITERAL_export", "LITERAL_asm", "LITERAL__asm", "LITERAL___asm__", "LITERAL___asm", "LITERAL__endasm", "LITERAL_sizeof", "LITERAL_dynamic_cast", "LITERAL_static_cast", "LITERAL_reinterpret_cast", "LITERAL_new", "LITERAL__cdecl", "LITERAL___cdecl", "LITERAL__near", "LITERAL___near", "LITERAL__far", "LITERAL___far", "LITERAL___interrupt", "LITERAL_pascal", "LITERAL__pascal", "LITERAL___pascal", "LITERAL_delete", "LITERAL__int64", "LITERAL___int64", "LITERAL___w64", "LITERAL___extension__", "LITERAL___attribute__", "LITERAL_restrict", "LITERAL___restrict", "LITERAL___complex__", "LITERAL___imag", "LITERAL___real", "LITERAL___global", "LITERAL__Bool", "LITERAL__Complex", "LITERAL___thread", "LITERAL___attribute", "LITERAL__Imaginary", "LITERAL_bit", "LITERAL___symbolic", "LITERAL___hidden", "LITERAL_final", "LITERAL_override", "LITERAL_constexpr", "LITERAL_decltype", "LITERAL_nullptr", "LITERAL_thread_local", "LITERAL_static_assert", "LITERAL_alignas", "LITERAL_char16_t", "LITERAL_char32_t", "LITERAL_noexcept", "LITERAL___decltype", "LITERAL___complex", "LITERAL___forceinline", "LITERAL___clrcall", "LITERAL___try", "LITERAL___finally", "LITERAL___null", "LITERAL___alignof", "LITERAL___is_class", "LITERAL___is_enum", "LITERAL___is_pod", "LITERAL___is_base_of", "LITERAL___has_trivial_constructor", "LITERAL___restrict__", "LITERAL__Noreturn", "LITERAL___has_nothrow_assign", "LITERAL___has_nothrow_copy", "LITERAL___has_nothrow_constructor", "LITERAL___has_trivial_assign", "LITERAL___has_trivial_copy", "LITERAL___has_trivial_destructor", "LITERAL___has_virtual_destructor", "LITERAL___is_abstract", "LITERAL___is_empty", "LITERAL___is_literal_type", "LITERAL___is_polymorphic", "LITERAL___is_standard_layout", "LITERAL___is_trivial", "LITERAL___is_union", "LITERAL___underlying_type", "LITERAL___builtin_va_list", "LAST_LITERAL_TOKEN", "LITERAL__BUILT_IN_TYPE__", "LITERAL__TYPE_QUALIFIER__", "LITERAL__STORAGE_CLASS_SPECIFIER__", "T_CLOSE", "T_BLOCK", "T_GE", "T_CONTAINS", "T_ABSTRACT", "T_CLASS", "T_NOPASS", "T_UNFORMATTED", "T_LESSTHAN", "T_ENDSUBROUTINE", "T_GT", "T_IDENT", "T_INTERFACE", "T_RETURN", "T_XYZ", "T_EOF", "T_CALL", "T_EOS", "T_GO", "T_AND", "T_PERCENT", "T_PRINT", "T_ALLOCATE_STMT_1", "T_SUBROUTINE", "T_CONTROL_EDIT_DESC", "T_ENUMERATOR", "Alphanumeric_Character", "T_DEFINED_OP", "T_KIND", "T_STOP", "T_GREATERTHAN_EQ", "T_CHAR_STRING_EDIT_DESC", "T_ALLOCATABLE", "T_ENDINTERFACE", "T_END", "T_ASTERISK", "T_PRIVATE", "T_DOUBLEPRECISION", "T_CASE", "T_IMPLICIT", "T_IF", "T_THEN", "T_DIMENSION", "T_GOTO", "T_ENDMODULE", "T_IN", "T_WRITE", "T_FORMATTED", "WS", "T_DATA", "T_FALSE", "T_WHERE", "T_ENDIF", "T_SLASH", "SQ_Rep_Char", "T_GENERIC", "T_RECURSIVE", "DQ_Rep_Char", "T_ELSEIF", "T_BLOCKDATA", "OCTAL_CONSTANT", "T_SELECTTYPE", "T_MINUS", "T_SELECT", "T_FINAL", "T_UNDERSCORE", "T_IMPORT", "T_USE", "T_FILE", "T_RPAREN", "T_INTENT", "T_ENDBLOCK", "T_ASSIGNMENT_STMT", "T_PAUSE", "T_BACKSPACE", "T_ENDFILE", "T_EQUALS", "T_NON_INTRINSIC", "T_SELECTCASE", "T_DIGIT_STRING", "T_COLON_COLON", "T_NON_OVERRIDABLE", "Special_Character", "T_INCLUDE", "T_OPEN", "T_POWER", "T_ASSOCIATE", "T_CHAR_CONSTANT", "T_OPERATOR", "T_TO", "T_ENDASSOCIATE", "T_EQ", "T_GREATERTHAN", "T_DATA_EDIT_DESC", "T_INQUIRE_STMT_2", "T_EQV", "HEX_CONSTANT", "Digit_String", "T_ELEMENTAL", "T_CHARACTER", "PREPROCESS_LINE", "T_NULLIFY", "T_REWIND", "T_ARITHMETIC_IF_STMT", "T_FORALL_CONSTRUCT_STMT", "T_BIND", "T_ENDFORALL", "T_DO", "T_WHERE_STMT", "T_POINTER", "T_PROGRAM", "T_ENDTYPE", "T_WAIT", "T_ELSE", "T_IF_STMT", "T_RBRACKET", "T_LPAREN", "T_EXTENDS", "T_OPTIONAL", "T_DOUBLE", "T_MODULE", "T_READ", "T_ALLOCATE", "T_INTEGER", "T_OR", "T_EQUIVALENCE", "T_PERIOD", "T_ENTRY", "T_LABEL_DO_TERMINAL", "T_REAL", "T_CYCLE", "T_PROCEDURE", "T_EQ_EQ", "T_SLASH_EQ", "T_ENDSELECT", "T_PURE", "T_TRUE", "T_NE", "T_INTRINSIC", "T_PASS", "T_REAL_CONSTANT", "LINE_COMMENT", "T_PERIOD_EXPONENT", "T_ENDWHERE", "MISC_CHAR", "T_FORMAT", "T_DEFAULT", "T_SLASH_SLASH", "T_NONE", "T_NAMELIST", "T_SEQUENCE", "T_PRECISION", "T_ASYNCHRONOUS", "T_COMMA", "T_RESULT", "T_ENDBLOCKDATA", "T_LOGICAL", "T_VALUE", "Letter", "T_FORALL", "T_SAVE", "T_HOLLERITH", "T_FLUSH", "T_WHILE", "T_INQUIRE", "T_DEFERRED", "T_FORALL_STMT", "T_ASSIGN", "T_LBRACKET", "T_EXTERNAL", "T_VOLATILE", "T_OUT", "CONTINUE_CHAR", "T_COLON", "T_COMPLEX", "T_PLUS", "T_STMT_FUNCTION", "T_ONLY", "T_PROTECTED", "T_COMMON", "T_INOUT", "T_NEQV", "T_PUBLIC", "T_ENDDO", "T_ENDPROGRAM", "T_ENDFUNCTION", "T_WHERE_CONSTRUCT_STMT", "T_ELSEWHERE", "T_ENUM", "T_PARAMETER", "T_TARGET", "T_DOUBLECOMPLEX", "T_PTR_ASSIGNMENT_STMT", "T_TYPE", "T_LESSTHAN_EQ", "T_DEALLOCATE", "T_LT", "T_FUNCTION", "T_EQ_GT", "T_ENDENUM", "BINARY_CONSTANT", "T_LE", "T_LEN", "T_CONTINUE", "T_NOT", "Rep_Char", "T_ASSIGNMENT", "T_EXIT", "FORTRAN_COMMENT", "FIRST_ASSIGN", "FIRST_DIVIDE", "FIRST_STAR", "FIRST_MOD", "FIRST_NOT", "FIRST_AMPERSAND", "COMMENT", "CPP_COMMENT", "FIRST_OR", "FIRST_BITWISEXOR", "FIRST_COLON", "FIRST_LESS", "FIRST_GREATER", "FIRST_MINUS", "FIRST_PLUS", "FIRST_QUOTATION", "H_char_sequence", "Q_char_sequence", "DirectiveBody", "CHAR_LITERAL_BODY", "STRING_LITERAL_BODY", "RAW_STRING_LITERAL", "RAW_STRING_LITERAL_BODY", "Suffix", "ID_LIKE", "ID_DEFINED", "Identifier", "PostPPKwdChar", "PostInclChar", "PostIfChar", "LAST_LEXER_FAKE_RULE"
    };

    public static final int EOF=-1;
    public static final int ELLIPSIS=4;
    public static final int DOT=5;
    public static final int ASSIGNEQUAL=6;
    public static final int COLON=7;
    public static final int COMMA=8;
    public static final int QUESTIONMARK=9;
    public static final int SEMICOLON=10;
    public static final int POINTERTO=11;
    public static final int LPAREN=12;
    public static final int RPAREN=13;
    public static final int LSQUARE=14;
    public static final int RSQUARE=15;
    public static final int LCURLY=16;
    public static final int RCURLY=17;
    public static final int EQUAL=18;
    public static final int NOTEQUAL=19;
    public static final int LESSTHANOREQUALTO=20;
    public static final int LESSTHAN=21;
    public static final int GREATERTHANOREQUALTO=22;
    public static final int GREATERTHAN=23;
    public static final int DIVIDE=24;
    public static final int DIVIDEEQUAL=25;
    public static final int PLUS=26;
    public static final int PLUSEQUAL=27;
    public static final int PLUSPLUS=28;
    public static final int MINUS=29;
    public static final int MINUSEQUAL=30;
    public static final int MINUSMINUS=31;
    public static final int STAR=32;
    public static final int TIMESEQUAL=33;
    public static final int MOD=34;
    public static final int MODEQUAL=35;
    public static final int SHIFTRIGHT=36;
    public static final int SHIFTRIGHTEQUAL=37;
    public static final int SHIFTLEFT=38;
    public static final int SHIFTLEFTEQUAL=39;
    public static final int AND=40;
    public static final int NOT=41;
    public static final int OR=42;
    public static final int AMPERSAND=43;
    public static final int BITWISEANDEQUAL=44;
    public static final int TILDE=45;
    public static final int BITWISEOR=46;
    public static final int BITWISEOREQUAL=47;
    public static final int BITWISEXOR=48;
    public static final int BITWISEXOREQUAL=49;
    public static final int POINTERTOMBR=50;
    public static final int DOTMBR=51;
    public static final int SCOPE=52;
    public static final int AT=53;
    public static final int DOLLAR=54;
    public static final int BACK_SLASH=55;
    public static final int DEFINED=56;
    public static final int DBL_SHARP=57;
    public static final int SHARP=58;
    public static final int FUN_LIKE_MACRO_LPAREN=59;
    public static final int GRAVE_ACCENT=60;
    public static final int END_PREPROC_DIRECTIVE=61;
    public static final int LAST_CONST_TEXT_TOKEN=62;
    public static final int FLOATONE=63;
    public static final int FLOATTWO=64;
    public static final int HEXADECIMALINT=65;
    public static final int OCTALINT=66;
    public static final int DECIMALINT=67;
    public static final int Whitespace=68;
    public static final int EndOfLine=69;
    public static final int Skip=70;
    public static final int PreProcComment=71;
    public static final int PPLiterals=72;
    public static final int Space=73;
    public static final int PreProcBlockComment=74;
    public static final int PreProcLineComment=75;
    public static final int Comment=76;
    public static final int CPPComment=77;
    public static final int CHAR_LITERAL=78;
    public static final int STRING_LITERAL=79;
    public static final int InterStringWhitespace=80;
    public static final int StringPart=81;
    public static final int Escape=82;
    public static final int Digit=83;
    public static final int Decimal=84;
    public static final int LongSuffix=85;
    public static final int UnsignedSuffix=86;
    public static final int FloatSuffix=87;
    public static final int Exponent=88;
    public static final int Vocabulary=89;
    public static final int NUMBER=90;
    public static final int IDENT=91;
    public static final int BINARYINT=92;
    public static final int INCLUDE_STRING=93;
    public static final int SYS_INCLUDE_STRING=94;
    public static final int INCLUDE=95;
    public static final int INCLUDE_NEXT=96;
    public static final int DEFINE=97;
    public static final int UNDEF=98;
    public static final int IFDEF=99;
    public static final int IFNDEF=100;
    public static final int IF=101;
    public static final int ELIF=102;
    public static final int ELSE=103;
    public static final int ENDIF=104;
    public static final int PRAGMA=105;
    public static final int LINE=106;
    public static final int ERROR=107;
    public static final int PREPROC_DIRECTIVE=108;
    public static final int FIRST_LITERAL_TOKEN=109;
    public static final int LITERAL_OPERATOR=110;
    public static final int LITERAL_alignof=111;
    public static final int LITERAL___alignof__=112;
    public static final int LITERAL_typeof=113;
    public static final int LITERAL___typeof__=114;
    public static final int LITERAL___typeof=115;
    public static final int LITERAL_template=116;
    public static final int LITERAL_typedef=117;
    public static final int LITERAL_enum=118;
    public static final int LITERAL_namespace=119;
    public static final int LITERAL_extern=120;
    public static final int LITERAL_inline=121;
    public static final int LITERAL__inline=122;
    public static final int LITERAL___inline__=123;
    public static final int LITERAL___inline=124;
    public static final int LITERAL_virtual=125;
    public static final int LITERAL_explicit=126;
    public static final int LITERAL_friend=127;
    public static final int LITERAL__stdcall=128;
    public static final int LITERAL___stdcall=129;
    public static final int LITERAL_typename=130;
    public static final int LITERAL_auto=131;
    public static final int LITERAL_register=132;
    public static final int LITERAL_static=133;
    public static final int LITERAL_mutable=134;
    public static final int LITERAL_const=135;
    public static final int LITERAL___const__=136;
    public static final int LITERAL___const=137;
    public static final int LITERAL_const_cast=138;
    public static final int LITERAL_volatile=139;
    public static final int LITERAL___volatile__=140;
    public static final int LITERAL___volatile=141;
    public static final int LITERAL_char=142;
    public static final int LITERAL_wchar_t=143;
    public static final int LITERAL_bool=144;
    public static final int LITERAL_short=145;
    public static final int LITERAL_int=146;
    public static final int LITERAL_long=147;
    public static final int LITERAL_signed=148;
    public static final int LITERAL___signed__=149;
    public static final int LITERAL___signed=150;
    public static final int LITERAL_unsigned=151;
    public static final int LITERAL___unsigned__=152;
    public static final int LITERAL_float=153;
    public static final int LITERAL_double=154;
    public static final int LITERAL_void=155;
    public static final int LITERAL__declspec=156;
    public static final int LITERAL___declspec=157;
    public static final int LITERAL_class=158;
    public static final int LITERAL_struct=159;
    public static final int LITERAL_union=160;
    public static final int LITERAL_this=161;
    public static final int LITERAL_true=162;
    public static final int LITERAL_false=163;
    public static final int LITERAL_public=164;
    public static final int LITERAL_protected=165;
    public static final int LITERAL_private=166;
    public static final int LITERAL_throw=167;
    public static final int LITERAL_case=168;
    public static final int LITERAL_default=169;
    public static final int LITERAL_if=170;
    public static final int LITERAL_else=171;
    public static final int LITERAL_switch=172;
    public static final int LITERAL_while=173;
    public static final int LITERAL_do=174;
    public static final int LITERAL_for=175;
    public static final int LITERAL_goto=176;
    public static final int LITERAL_continue=177;
    public static final int LITERAL_break=178;
    public static final int LITERAL_return=179;
    public static final int LITERAL_try=180;
    public static final int LITERAL_catch=181;
    public static final int LITERAL_using=182;
    public static final int LITERAL_export=183;
    public static final int LITERAL_asm=184;
    public static final int LITERAL__asm=185;
    public static final int LITERAL___asm__=186;
    public static final int LITERAL___asm=187;
    public static final int LITERAL__endasm=188;
    public static final int LITERAL_sizeof=189;
    public static final int LITERAL_dynamic_cast=190;
    public static final int LITERAL_static_cast=191;
    public static final int LITERAL_reinterpret_cast=192;
    public static final int LITERAL_new=193;
    public static final int LITERAL__cdecl=194;
    public static final int LITERAL___cdecl=195;
    public static final int LITERAL__near=196;
    public static final int LITERAL___near=197;
    public static final int LITERAL__far=198;
    public static final int LITERAL___far=199;
    public static final int LITERAL___interrupt=200;
    public static final int LITERAL_pascal=201;
    public static final int LITERAL__pascal=202;
    public static final int LITERAL___pascal=203;
    public static final int LITERAL_delete=204;
    public static final int LITERAL__int64=205;
    public static final int LITERAL___int64=206;
    public static final int LITERAL___w64=207;
    public static final int LITERAL___extension__=208;
    public static final int LITERAL___attribute__=209;
    public static final int LITERAL_restrict=210;
    public static final int LITERAL___restrict=211;
    public static final int LITERAL___complex__=212;
    public static final int LITERAL___imag=213;
    public static final int LITERAL___real=214;
    public static final int LITERAL___global=215;
    public static final int LITERAL__Bool=216;
    public static final int LITERAL__Complex=217;
    public static final int LITERAL___thread=218;
    public static final int LITERAL___attribute=219;
    public static final int LITERAL__Imaginary=220;
    public static final int LITERAL_bit=221;
    public static final int LITERAL___symbolic=222;
    public static final int LITERAL___hidden=223;
    public static final int LITERAL_final=224;
    public static final int LITERAL_override=225;
    public static final int LITERAL_constexpr=226;
    public static final int LITERAL_decltype=227;
    public static final int LITERAL_nullptr=228;
    public static final int LITERAL_thread_local=229;
    public static final int LITERAL_static_assert=230;
    public static final int LITERAL_alignas=231;
    public static final int LITERAL_char16_t=232;
    public static final int LITERAL_char32_t=233;
    public static final int LITERAL_noexcept=234;
    public static final int LITERAL___decltype=235;
    public static final int LITERAL___complex=236;
    public static final int LITERAL___forceinline=237;
    public static final int LITERAL___clrcall=238;
    public static final int LITERAL___try=239;
    public static final int LITERAL___finally=240;
    public static final int LITERAL___null=241;
    public static final int LITERAL___alignof=242;
    public static final int LITERAL___is_class=243;
    public static final int LITERAL___is_enum=244;
    public static final int LITERAL___is_pod=245;
    public static final int LITERAL___is_base_of=246;
    public static final int LITERAL___has_trivial_constructor=247;
    public static final int LITERAL___restrict__=248;
    public static final int LITERAL__Noreturn=249;
    public static final int LITERAL___has_nothrow_assign=250;
    public static final int LITERAL___has_nothrow_copy=251;
    public static final int LITERAL___has_nothrow_constructor=252;
    public static final int LITERAL___has_trivial_assign=253;
    public static final int LITERAL___has_trivial_copy=254;
    public static final int LITERAL___has_trivial_destructor=255;
    public static final int LITERAL___has_virtual_destructor=256;
    public static final int LITERAL___is_abstract=257;
    public static final int LITERAL___is_empty=258;
    public static final int LITERAL___is_literal_type=259;
    public static final int LITERAL___is_polymorphic=260;
    public static final int LITERAL___is_standard_layout=261;
    public static final int LITERAL___is_trivial=262;
    public static final int LITERAL___is_union=263;
    public static final int LITERAL___underlying_type=264;
    public static final int LITERAL___builtin_va_list=265;
    public static final int LAST_LITERAL_TOKEN=266;
    public static final int LITERAL__BUILT_IN_TYPE__=267;
    public static final int LITERAL__TYPE_QUALIFIER__=268;
    public static final int LITERAL__STORAGE_CLASS_SPECIFIER__=269;
    public static final int T_CLOSE=270;
    public static final int T_BLOCK=271;
    public static final int T_GE=272;
    public static final int T_CONTAINS=273;
    public static final int T_ABSTRACT=274;
    public static final int T_CLASS=275;
    public static final int T_NOPASS=276;
    public static final int T_UNFORMATTED=277;
    public static final int T_LESSTHAN=278;
    public static final int T_ENDSUBROUTINE=279;
    public static final int T_GT=280;
    public static final int T_IDENT=281;
    public static final int T_INTERFACE=282;
    public static final int T_RETURN=283;
    public static final int T_XYZ=284;
    public static final int T_EOF=285;
    public static final int T_CALL=286;
    public static final int T_EOS=287;
    public static final int T_GO=288;
    public static final int T_AND=289;
    public static final int T_PERCENT=290;
    public static final int T_PRINT=291;
    public static final int T_ALLOCATE_STMT_1=292;
    public static final int T_SUBROUTINE=293;
    public static final int T_CONTROL_EDIT_DESC=294;
    public static final int T_ENUMERATOR=295;
    public static final int Alphanumeric_Character=296;
    public static final int T_DEFINED_OP=297;
    public static final int T_KIND=298;
    public static final int T_STOP=299;
    public static final int T_GREATERTHAN_EQ=300;
    public static final int T_CHAR_STRING_EDIT_DESC=301;
    public static final int T_ALLOCATABLE=302;
    public static final int T_ENDINTERFACE=303;
    public static final int T_END=304;
    public static final int T_ASTERISK=305;
    public static final int T_PRIVATE=306;
    public static final int T_DOUBLEPRECISION=307;
    public static final int T_CASE=308;
    public static final int T_IMPLICIT=309;
    public static final int T_IF=310;
    public static final int T_THEN=311;
    public static final int T_DIMENSION=312;
    public static final int T_GOTO=313;
    public static final int T_ENDMODULE=314;
    public static final int T_IN=315;
    public static final int T_WRITE=316;
    public static final int T_FORMATTED=317;
    public static final int WS=318;
    public static final int T_DATA=319;
    public static final int T_FALSE=320;
    public static final int T_WHERE=321;
    public static final int T_ENDIF=322;
    public static final int T_SLASH=323;
    public static final int SQ_Rep_Char=324;
    public static final int T_GENERIC=325;
    public static final int T_RECURSIVE=326;
    public static final int DQ_Rep_Char=327;
    public static final int T_ELSEIF=328;
    public static final int T_BLOCKDATA=329;
    public static final int OCTAL_CONSTANT=330;
    public static final int T_SELECTTYPE=331;
    public static final int T_MINUS=332;
    public static final int T_SELECT=333;
    public static final int T_FINAL=334;
    public static final int T_UNDERSCORE=335;
    public static final int T_IMPORT=336;
    public static final int T_USE=337;
    public static final int T_FILE=338;
    public static final int T_RPAREN=339;
    public static final int T_INTENT=340;
    public static final int T_ENDBLOCK=341;
    public static final int T_ASSIGNMENT_STMT=342;
    public static final int T_PAUSE=343;
    public static final int T_BACKSPACE=344;
    public static final int T_ENDFILE=345;
    public static final int T_EQUALS=346;
    public static final int T_NON_INTRINSIC=347;
    public static final int T_SELECTCASE=348;
    public static final int T_DIGIT_STRING=349;
    public static final int T_COLON_COLON=350;
    public static final int T_NON_OVERRIDABLE=351;
    public static final int Special_Character=352;
    public static final int T_INCLUDE=353;
    public static final int T_OPEN=354;
    public static final int T_POWER=355;
    public static final int T_ASSOCIATE=356;
    public static final int T_CHAR_CONSTANT=357;
    public static final int T_OPERATOR=358;
    public static final int T_TO=359;
    public static final int T_ENDASSOCIATE=360;
    public static final int T_EQ=361;
    public static final int T_GREATERTHAN=362;
    public static final int T_DATA_EDIT_DESC=363;
    public static final int T_INQUIRE_STMT_2=364;
    public static final int T_EQV=365;
    public static final int HEX_CONSTANT=366;
    public static final int Digit_String=367;
    public static final int T_ELEMENTAL=368;
    public static final int T_CHARACTER=369;
    public static final int PREPROCESS_LINE=370;
    public static final int T_NULLIFY=371;
    public static final int T_REWIND=372;
    public static final int T_ARITHMETIC_IF_STMT=373;
    public static final int T_FORALL_CONSTRUCT_STMT=374;
    public static final int T_BIND=375;
    public static final int T_ENDFORALL=376;
    public static final int T_DO=377;
    public static final int T_WHERE_STMT=378;
    public static final int T_POINTER=379;
    public static final int T_PROGRAM=380;
    public static final int T_ENDTYPE=381;
    public static final int T_WAIT=382;
    public static final int T_ELSE=383;
    public static final int T_IF_STMT=384;
    public static final int T_RBRACKET=385;
    public static final int T_LPAREN=386;
    public static final int T_EXTENDS=387;
    public static final int T_OPTIONAL=388;
    public static final int T_DOUBLE=389;
    public static final int T_MODULE=390;
    public static final int T_READ=391;
    public static final int T_ALLOCATE=392;
    public static final int T_INTEGER=393;
    public static final int T_OR=394;
    public static final int T_EQUIVALENCE=395;
    public static final int T_PERIOD=396;
    public static final int T_ENTRY=397;
    public static final int T_LABEL_DO_TERMINAL=398;
    public static final int T_REAL=399;
    public static final int T_CYCLE=400;
    public static final int T_PROCEDURE=401;
    public static final int T_EQ_EQ=402;
    public static final int T_SLASH_EQ=403;
    public static final int T_ENDSELECT=404;
    public static final int T_PURE=405;
    public static final int T_TRUE=406;
    public static final int T_NE=407;
    public static final int T_INTRINSIC=408;
    public static final int T_PASS=409;
    public static final int T_REAL_CONSTANT=410;
    public static final int LINE_COMMENT=411;
    public static final int T_PERIOD_EXPONENT=412;
    public static final int T_ENDWHERE=413;
    public static final int MISC_CHAR=414;
    public static final int T_FORMAT=415;
    public static final int T_DEFAULT=416;
    public static final int T_SLASH_SLASH=417;
    public static final int T_NONE=418;
    public static final int T_NAMELIST=419;
    public static final int T_SEQUENCE=420;
    public static final int T_PRECISION=421;
    public static final int T_ASYNCHRONOUS=422;
    public static final int T_COMMA=423;
    public static final int T_RESULT=424;
    public static final int T_ENDBLOCKDATA=425;
    public static final int T_LOGICAL=426;
    public static final int T_VALUE=427;
    public static final int Letter=428;
    public static final int T_FORALL=429;
    public static final int T_SAVE=430;
    public static final int T_HOLLERITH=431;
    public static final int T_FLUSH=432;
    public static final int T_WHILE=433;
    public static final int T_INQUIRE=434;
    public static final int T_DEFERRED=435;
    public static final int T_FORALL_STMT=436;
    public static final int T_ASSIGN=437;
    public static final int T_LBRACKET=438;
    public static final int T_EXTERNAL=439;
    public static final int T_VOLATILE=440;
    public static final int T_OUT=441;
    public static final int CONTINUE_CHAR=442;
    public static final int T_COLON=443;
    public static final int T_COMPLEX=444;
    public static final int T_PLUS=445;
    public static final int T_STMT_FUNCTION=446;
    public static final int T_ONLY=447;
    public static final int T_PROTECTED=448;
    public static final int T_COMMON=449;
    public static final int T_INOUT=450;
    public static final int T_NEQV=451;
    public static final int T_PUBLIC=452;
    public static final int T_ENDDO=453;
    public static final int T_ENDPROGRAM=454;
    public static final int T_ENDFUNCTION=455;
    public static final int T_WHERE_CONSTRUCT_STMT=456;
    public static final int T_ELSEWHERE=457;
    public static final int T_ENUM=458;
    public static final int T_PARAMETER=459;
    public static final int T_TARGET=460;
    public static final int T_DOUBLECOMPLEX=461;
    public static final int T_PTR_ASSIGNMENT_STMT=462;
    public static final int T_TYPE=463;
    public static final int T_LESSTHAN_EQ=464;
    public static final int T_DEALLOCATE=465;
    public static final int T_LT=466;
    public static final int T_FUNCTION=467;
    public static final int T_EQ_GT=468;
    public static final int T_ENDENUM=469;
    public static final int BINARY_CONSTANT=470;
    public static final int T_LE=471;
    public static final int T_LEN=472;
    public static final int T_CONTINUE=473;
    public static final int T_NOT=474;
    public static final int Rep_Char=475;
    public static final int T_ASSIGNMENT=476;
    public static final int T_EXIT=477;
    public static final int FORTRAN_COMMENT=478;
    public static final int FIRST_ASSIGN=479;
    public static final int FIRST_DIVIDE=480;
    public static final int FIRST_STAR=481;
    public static final int FIRST_MOD=482;
    public static final int FIRST_NOT=483;
    public static final int FIRST_AMPERSAND=484;
    public static final int COMMENT=485;
    public static final int CPP_COMMENT=486;
    public static final int FIRST_OR=487;
    public static final int FIRST_BITWISEXOR=488;
    public static final int FIRST_COLON=489;
    public static final int FIRST_LESS=490;
    public static final int FIRST_GREATER=491;
    public static final int FIRST_MINUS=492;
    public static final int FIRST_PLUS=493;
    public static final int FIRST_QUOTATION=494;
    public static final int H_char_sequence=495;
    public static final int Q_char_sequence=496;
    public static final int DirectiveBody=497;
    public static final int CHAR_LITERAL_BODY=498;
    public static final int STRING_LITERAL_BODY=499;
    public static final int RAW_STRING_LITERAL=500;
    public static final int RAW_STRING_LITERAL_BODY=501;
    public static final int Suffix=502;
    public static final int ID_LIKE=503;
    public static final int ID_DEFINED=504;
    public static final int Identifier=505;
    public static final int PostPPKwdChar=506;
    public static final int PostInclChar=507;
    public static final int PostIfChar=508;
    public static final int LAST_LEXER_FAKE_RULE=509;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public EvaluatorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public EvaluatorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return EvaluatorParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g"; }


        /** Map variable name to Integer object holding value */
        HashMap memory = new HashMap();

        VariableProvider vp;

        public void setVariableProvider(VariableProvider vp) {
            this.vp = vp;
        }

        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            // do nothing
        }

        private boolean checkParams(int...params) {
            for (int param : params) {
                if (param == Integer.MAX_VALUE) {
                    return false;
                }
            }
            return true;
        }

        private int safePlus(int first, int second) {
            return checkParams(first, second) ? first + second : Integer.MAX_VALUE;
        }

        private int safeMinus(int first, int second) {
            return checkParams(first, second) ? first - second : Integer.MAX_VALUE;
        }

        private int safeMul(int first, int second) {
            return checkParams(first, second) ? first * second : Integer.MAX_VALUE;
        }



    // $ANTLR start "prog"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:51:1: prog : expr ;
    public final void prog() throws RecognitionException {
        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:51:5: ( expr )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:51:7: expr
            {
            pushFollow(FOLLOW_expr_in_prog37);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "expr"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:53:1: expr returns [int value] : e= equalityExpr ( PLUS e= equalityExpr | MINUS e= equalityExpr )* ;
    public final int expr() throws RecognitionException {
        int value = 0;


        int e =0;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:54:5: (e= equalityExpr ( PLUS e= equalityExpr | MINUS e= equalityExpr )* )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:54:9: e= equalityExpr ( PLUS e= equalityExpr | MINUS e= equalityExpr )*
            {
            pushFollow(FOLLOW_equalityExpr_in_expr57);
            e=equalityExpr();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value = e;}

            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:55:9: ( PLUS e= equalityExpr | MINUS e= equalityExpr )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PLUS) ) {
                    alt1=1;
                }
                else if ( (LA1_0==MINUS) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:55:13: PLUS e= equalityExpr
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_expr73); if (state.failed) return value;

            	    pushFollow(FOLLOW_equalityExpr_in_expr77);
            	    e=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {value = safePlus(value, e);}

            	    }
            	    break;
            	case 2 :
            	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:56:13: MINUS e= equalityExpr
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_expr93); if (state.failed) return value;

            	    pushFollow(FOLLOW_equalityExpr_in_expr97);
            	    e=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {value = safeMinus(value, e);}

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expr"



    // $ANTLR start "equalityExpr"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:60:1: equalityExpr returns [int value] : e= multExpr ( EQUAL e= multExpr | NOTEQUAL e= multExpr )* ;
    public final int equalityExpr() throws RecognitionException {
        int value = 0;


        int e =0;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:61:5: (e= multExpr ( EQUAL e= multExpr | NOTEQUAL e= multExpr )* )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:62:9: e= multExpr ( EQUAL e= multExpr | NOTEQUAL e= multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_equalityExpr143);
            e=multExpr();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value = e;}

            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:63:9: ( EQUAL e= multExpr | NOTEQUAL e= multExpr )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==EQUAL) ) {
                    alt2=1;
                }
                else if ( (LA2_0==NOTEQUAL) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:63:11: EQUAL e= multExpr
            	    {
            	    match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpr157); if (state.failed) return value;

            	    pushFollow(FOLLOW_multExpr_in_equalityExpr163);
            	    e=multExpr();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {value = (value == e) ? 1 : 0;}

            	    }
            	    break;
            	case 2 :
            	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:64:11: NOTEQUAL e= multExpr
            	    {
            	    match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equalityExpr177); if (state.failed) return value;

            	    pushFollow(FOLLOW_multExpr_in_equalityExpr183);
            	    e=multExpr();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {value = (value != e) ? 1 : 0;}

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "equalityExpr"



    // $ANTLR start "multExpr"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:68:1: multExpr returns [int value] : e= unaryExpr ( STAR e= unaryExpr )* ;
    public final int multExpr() throws RecognitionException {
        int value = 0;


        int e =0;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:69:5: (e= unaryExpr ( STAR e= unaryExpr )* )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:69:9: e= unaryExpr ( STAR e= unaryExpr )*
            {
            pushFollow(FOLLOW_unaryExpr_in_multExpr221);
            e=unaryExpr();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value = e;}

            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:69:42: ( STAR e= unaryExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==STAR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:69:43: STAR e= unaryExpr
            	    {
            	    match(input,STAR,FOLLOW_STAR_in_multExpr226); if (state.failed) return value;

            	    pushFollow(FOLLOW_unaryExpr_in_multExpr230);
            	    e=unaryExpr();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {value = safeMul(value, e);}

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "unaryExpr"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:72:1: unaryExpr returns [int value] : (e= atom | NOT e= unaryExpr );
    public final int unaryExpr() throws RecognitionException {
        int value = 0;


        int e =0;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:73:5: (e= atom | NOT e= unaryExpr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN||LA4_0==SCOPE||LA4_0==DECIMALINT||LA4_0==IDENT||LA4_0==LITERAL_const||(LA4_0 >= LITERAL_true && LA4_0 <= LITERAL_false)||LA4_0==LITERAL_sizeof||LA4_0==LITERAL_static_cast) ) {
                alt4=1;
            }
            else if ( (LA4_0==NOT) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:73:9: e= atom
                    {
                    pushFollow(FOLLOW_atom_in_unaryExpr259);
                    e=atom();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = e;}

                    }
                    break;
                case 2 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:74:9: NOT e= unaryExpr
                    {
                    match(input,NOT,FOLLOW_NOT_in_unaryExpr271); if (state.failed) return value;

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr275);
                    e=unaryExpr();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = (e == 0 ? 1 : 0);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "unaryExpr"



    // $ANTLR start "atom"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:77:1: atom returns [int value] : ( DECIMALINT | ( function_call )=> function_call | variable | LPAREN expr RPAREN | LITERAL_sizeof balance_lparen_rparen | LITERAL_static_cast LESSTHAN (~ GREATERTHAN )* GREATERTHAN LPAREN expr RPAREN | LITERAL_true | LITERAL_false );
    public final int atom() throws RecognitionException {
        int value = 0;


        Token DECIMALINT1=null;
        Token LITERAL_true7=null;
        Token LITERAL_false8=null;
        int function_call2 =0;

        int variable3 =0;

        int expr4 =0;

        String balance_lparen_rparen5 =null;

        int expr6 =0;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:78:5: ( DECIMALINT | ( function_call )=> function_call | variable | LPAREN expr RPAREN | LITERAL_sizeof balance_lparen_rparen | LITERAL_static_cast LESSTHAN (~ GREATERTHAN )* GREATERTHAN LPAREN expr RPAREN | LITERAL_true | LITERAL_false )
            int alt6=8;
            switch ( input.LA(1) ) {
            case DECIMALINT:
                {
                alt6=1;
                }
                break;
            case SCOPE:
                {
                int LA6_2 = input.LA(2);

                if ( (synpred1_Evaluator()) ) {
                    alt6=2;
                }
                else if ( (true) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA6_3 = input.LA(2);

                if ( (synpred1_Evaluator()) ) {
                    alt6=2;
                }
                else if ( (true) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;

                }
                }
                break;
            case LITERAL_const:
                {
                alt6=3;
                }
                break;
            case LPAREN:
                {
                alt6=4;
                }
                break;
            case LITERAL_sizeof:
                {
                alt6=5;
                }
                break;
            case LITERAL_static_cast:
                {
                alt6=6;
                }
                break;
            case LITERAL_true:
                {
                alt6=7;
                }
                break;
            case LITERAL_false:
                {
                alt6=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:79:9: DECIMALINT
                    {
                    DECIMALINT1=(Token)match(input,DECIMALINT,FOLLOW_DECIMALINT_in_atom309); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = (((DECIMALINT1!=null?DECIMALINT1.getText():null)) == null) ? 0 : Integer.parseInt(((DECIMALINT1!=null?DECIMALINT1.getText():null)).replaceAll("[a-z,A-Z,_].*", "")) ;}

                    }
                    break;
                case 2 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:80:9: ( function_call )=> function_call
                    {
                    pushFollow(FOLLOW_function_call_in_atom327);
                    function_call2=function_call();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = function_call2;}

                    }
                    break;
                case 3 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:81:9: variable
                    {
                    pushFollow(FOLLOW_variable_in_atom339);
                    variable3=variable();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = variable3;}

                    }
                    break;
                case 4 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:82:9: LPAREN expr RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_atom351); if (state.failed) return value;

                    pushFollow(FOLLOW_expr_in_atom353);
                    expr4=expr();

                    state._fsp--;
                    if (state.failed) return value;

                    match(input,RPAREN,FOLLOW_RPAREN_in_atom355); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = expr4;}

                    }
                    break;
                case 5 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:83:9: LITERAL_sizeof balance_lparen_rparen
                    {
                    match(input,LITERAL_sizeof,FOLLOW_LITERAL_sizeof_in_atom367); if (state.failed) return value;

                    pushFollow(FOLLOW_balance_lparen_rparen_in_atom369);
                    balance_lparen_rparen5=balance_lparen_rparen();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = vp==null ? 0 : vp.getSizeOfValue(balance_lparen_rparen5);}

                    }
                    break;
                case 6 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:84:9: LITERAL_static_cast LESSTHAN (~ GREATERTHAN )* GREATERTHAN LPAREN expr RPAREN
                    {
                    match(input,LITERAL_static_cast,FOLLOW_LITERAL_static_cast_in_atom381); if (state.failed) return value;

                    match(input,LESSTHAN,FOLLOW_LESSTHAN_in_atom383); if (state.failed) return value;

                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:84:38: (~ GREATERTHAN )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= ELLIPSIS && LA5_0 <= GREATERTHANOREQUALTO)||(LA5_0 >= DIVIDE && LA5_0 <= LAST_LEXER_FAKE_RULE)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:
                    	    {
                    	    if ( (input.LA(1) >= ELLIPSIS && input.LA(1) <= GREATERTHANOREQUALTO)||(input.LA(1) >= DIVIDE && input.LA(1) <= LAST_LEXER_FAKE_RULE) ) {
                    	        input.consume();
                    	        state.errorRecovery=false;
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return value;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_atom391); if (state.failed) return value;

                    match(input,LPAREN,FOLLOW_LPAREN_in_atom393); if (state.failed) return value;

                    pushFollow(FOLLOW_expr_in_atom395);
                    expr6=expr();

                    state._fsp--;
                    if (state.failed) return value;

                    match(input,RPAREN,FOLLOW_RPAREN_in_atom397); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = expr6;}

                    }
                    break;
                case 7 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:85:9: LITERAL_true
                    {
                    LITERAL_true7=(Token)match(input,LITERAL_true,FOLLOW_LITERAL_true_in_atom409); if (state.failed) return value;

                    if ( state.backtracking==0 ) {
                                value = vp==null?0:vp.getValue((LITERAL_true7!=null?LITERAL_true7.getText():null));
                            }

                    }
                    break;
                case 8 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:89:9: LITERAL_false
                    {
                    LITERAL_false8=(Token)match(input,LITERAL_false,FOLLOW_LITERAL_false_in_atom429); if (state.failed) return value;

                    if ( state.backtracking==0 ) {
                                value = vp==null?0:vp.getValue((LITERAL_false8!=null?LITERAL_false8.getText():null));
                            }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "atom"



    // $ANTLR start "function_call"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:95:1: function_call returns [int value] : id= qualified_id args= balance_lparen_rparen ;
    public final int function_call() throws RecognitionException {
        int value = 0;


        String id =null;

        String args =null;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:96:5: (id= qualified_id args= balance_lparen_rparen )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:97:9: id= qualified_id args= balance_lparen_rparen
            {
            pushFollow(FOLLOW_qualified_id_in_function_call472);
            id=qualified_id();

            state._fsp--;
            if (state.failed) return value;

            pushFollow(FOLLOW_balance_lparen_rparen_in_function_call487);
            args=balance_lparen_rparen();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) { value = vp==null ? 0 : vp.getFunCallValue(id + args); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "function_call"



    // $ANTLR start "variable"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:102:1: variable returns [int value] : ( LITERAL_const )* id= qualified_id ;
    public final int variable() throws RecognitionException {
        int value = 0;


        String id =null;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:103:5: ( ( LITERAL_const )* id= qualified_id )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:104:9: ( LITERAL_const )* id= qualified_id
            {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:104:9: ( LITERAL_const )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LITERAL_const) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:104:10: LITERAL_const
            	    {
            	    match(input,LITERAL_const,FOLLOW_LITERAL_const_in_variable527); if (state.failed) return value;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            pushFollow(FOLLOW_qualified_id_in_variable543);
            id=qualified_id();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) { value = vp==null ? 0 : vp.getValue(id); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "variable"



    // $ANTLR start "qualified_id"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:109:1: qualified_id returns [String q = \"\"] : so= scope_override ( IDENT (inner= balance_less_greater )? ) ;
    public final String qualified_id() throws RecognitionException {
        String q =  "";


        Token IDENT9=null;
        String so =null;

        String inner =null;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:110:5: (so= scope_override ( IDENT (inner= balance_less_greater )? ) )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:111:9: so= scope_override ( IDENT (inner= balance_less_greater )? )
            {
            pushFollow(FOLLOW_scope_override_in_qualified_id587);
            so=scope_override();

            state._fsp--;
            if (state.failed) return q;

            if ( state.backtracking==0 ) { q += (so != null)? so : ""; }

            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:113:9: ( IDENT (inner= balance_less_greater )? )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:114:13: IDENT (inner= balance_less_greater )?
            {
            IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualified_id621); if (state.failed) return q;

            if ( state.backtracking==0 ) {q += (IDENT9!=null?IDENT9.getText():null);}

            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:116:13: (inner= balance_less_greater )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LESSTHAN) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:117:17: inner= balance_less_greater
                    {
                    pushFollow(FOLLOW_balance_less_greater_in_qualified_id671);
                    inner=balance_less_greater();

                    state._fsp--;
                    if (state.failed) return q;

                    if ( state.backtracking==0 ) {q += inner;}

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return q;
    }
    // $ANTLR end "qualified_id"



    // $ANTLR start "scope_override"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:122:1: scope_override returns [String s = \"\"] : ( SCOPE )? ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )? ;
    public final String scope_override() throws RecognitionException {
        String s =  "";


        String sp =null;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:123:5: ( ( SCOPE )? ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )? )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:124:9: ( SCOPE )? ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )?
            {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:124:9: ( SCOPE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==SCOPE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:125:13: SCOPE
                    {
                    match(input,SCOPE,FOLLOW_SCOPE_in_scope_override741); if (state.failed) return s;

                    if ( state.backtracking==0 ) { s += "::";}

                    }
                    break;

            }


            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:127:9: ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IDENT) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred2_Evaluator()) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:128:13: ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part
                    {
                    pushFollow(FOLLOW_scope_override_part_in_scope_override794);
                    sp=scope_override_part();

                    state._fsp--;
                    if (state.failed) return s;

                    if ( state.backtracking==0 ) {
                                        s += (sp != null) ? sp : "";
                                }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "scope_override"



    // $ANTLR start "scope_override_part"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:135:1: scope_override_part returns [String s = \"\"] : IDENT (inner= balance_less_greater )? SCOPE ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )? ;
    public final String scope_override_part() throws RecognitionException {
        String s =  "";


        Token IDENT10=null;
        String inner =null;

        String sp =null;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:136:5: ( IDENT (inner= balance_less_greater )? SCOPE ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )? )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:137:9: IDENT (inner= balance_less_greater )? SCOPE ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )?
            {
            IDENT10=(Token)match(input,IDENT,FOLLOW_IDENT_in_scope_override_part848); if (state.failed) return s;

            if ( state.backtracking==0 ) {
                        s += (IDENT10!=null?IDENT10.getText():null);
                    }

            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:141:9: (inner= balance_less_greater )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LESSTHAN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:142:13: inner= balance_less_greater
                    {
                    pushFollow(FOLLOW_balance_less_greater_in_scope_override_part886);
                    inner=balance_less_greater();

                    state._fsp--;
                    if (state.failed) return s;

                    if ( state.backtracking==0 ) {s += inner;}

                    }
                    break;

            }


            match(input,SCOPE,FOLLOW_SCOPE_in_scope_override_part909); if (state.failed) return s;

            if ( state.backtracking==0 ) {
                        s += "::";
                    }

            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:149:9: ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENT) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred3_Evaluator()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:149:10: ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part
                    {
                    pushFollow(FOLLOW_scope_override_part_in_scope_override_part947);
                    sp=scope_override_part();

                    state._fsp--;
                    if (state.failed) return s;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                        s += (sp != null) ? sp : "";
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "scope_override_part"



    // $ANTLR start "balance_less_greater"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:155:1: balance_less_greater returns [String s = \"\"] : LESSTHAN ( ( LESSTHAN )=>inner= balance_less_greater |other= (~ GREATERTHAN ) )* GREATERTHAN ;
    public final String balance_less_greater() throws RecognitionException {
        String s =  "";


        Token other=null;
        String inner =null;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:156:5: ( LESSTHAN ( ( LESSTHAN )=>inner= balance_less_greater |other= (~ GREATERTHAN ) )* GREATERTHAN )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:157:9: LESSTHAN ( ( LESSTHAN )=>inner= balance_less_greater |other= (~ GREATERTHAN ) )* GREATERTHAN
            {
            match(input,LESSTHAN,FOLLOW_LESSTHAN_in_balance_less_greater988); if (state.failed) return s;

            if ( state.backtracking==0 ) {s += "<";}

            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:158:9: ( ( LESSTHAN )=>inner= balance_less_greater |other= (~ GREATERTHAN ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==LESSTHAN) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred4_Evaluator()) ) {
                        alt13=1;
                    }
                    else if ( (true) ) {
                        alt13=2;
                    }


                }
                else if ( ((LA13_0 >= ELLIPSIS && LA13_0 <= LESSTHANOREQUALTO)||LA13_0==GREATERTHANOREQUALTO||(LA13_0 >= DIVIDE && LA13_0 <= LAST_LEXER_FAKE_RULE)) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:159:13: ( LESSTHAN )=>inner= balance_less_greater
            	    {
            	    pushFollow(FOLLOW_balance_less_greater_in_balance_less_greater1023);
            	    inner=balance_less_greater();

            	    state._fsp--;
            	    if (state.failed) return s;

            	    if ( state.backtracking==0 ) {s += inner;}

            	    }
            	    break;
            	case 2 :
            	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:161:13: other= (~ GREATERTHAN )
            	    {
            	    other=(Token)input.LT(1);

            	    if ( (input.LA(1) >= ELLIPSIS && input.LA(1) <= GREATERTHANOREQUALTO)||(input.LA(1) >= DIVIDE && input.LA(1) <= LAST_LEXER_FAKE_RULE) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return s;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    if ( state.backtracking==0 ) {s += (other!=null?other.getText():null);}

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_balance_less_greater1079); if (state.failed) return s;

            if ( state.backtracking==0 ) {s += "> ";}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "balance_less_greater"



    // $ANTLR start "balance_lparen_rparen"
    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:166:1: balance_lparen_rparen returns [String s = \"\"] : LPAREN ( ( LPAREN )=>inner= balance_lparen_rparen | ( GREATERTHAN )=> GREATERTHAN |other= (~ RPAREN ) )* RPAREN ;
    public final String balance_lparen_rparen() throws RecognitionException {
        String s =  "";


        Token other=null;
        String inner =null;


        try {
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:167:5: ( LPAREN ( ( LPAREN )=>inner= balance_lparen_rparen | ( GREATERTHAN )=> GREATERTHAN |other= (~ RPAREN ) )* RPAREN )
            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:168:9: LPAREN ( ( LPAREN )=>inner= balance_lparen_rparen | ( GREATERTHAN )=> GREATERTHAN |other= (~ RPAREN ) )* RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_balance_lparen_rparen1110); if (state.failed) return s;

            if ( state.backtracking==0 ) {s += "(";}

            // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:169:9: ( ( LPAREN )=>inner= balance_lparen_rparen | ( GREATERTHAN )=> GREATERTHAN |other= (~ RPAREN ) )*
            loop14:
            do {
                int alt14=4;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==LPAREN) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred5_Evaluator()) ) {
                        alt14=1;
                    }
                    else if ( (true) ) {
                        alt14=3;
                    }


                }
                else if ( (LA14_0==GREATERTHAN) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred6_Evaluator()) ) {
                        alt14=2;
                    }
                    else if ( (true) ) {
                        alt14=3;
                    }


                }
                else if ( ((LA14_0 >= ELLIPSIS && LA14_0 <= POINTERTO)||(LA14_0 >= LSQUARE && LA14_0 <= GREATERTHANOREQUALTO)||(LA14_0 >= DIVIDE && LA14_0 <= LAST_LEXER_FAKE_RULE)) ) {
                    alt14=3;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:170:13: ( LPAREN )=>inner= balance_lparen_rparen
            	    {
            	    pushFollow(FOLLOW_balance_lparen_rparen_in_balance_lparen_rparen1145);
            	    inner=balance_lparen_rparen();

            	    state._fsp--;
            	    if (state.failed) return s;

            	    if ( state.backtracking==0 ) {s += inner;}

            	    }
            	    break;
            	case 2 :
            	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:174:13: ( GREATERTHAN )=> GREATERTHAN
            	    {
            	    match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_balance_lparen_rparen1202); if (state.failed) return s;

            	    if ( state.backtracking==0 ) {s += "> ";}

            	    }
            	    break;
            	case 3 :
            	    // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:176:13: other= (~ RPAREN )
            	    {
            	    other=(Token)input.LT(1);

            	    if ( (input.LA(1) >= ELLIPSIS && input.LA(1) <= LPAREN)||(input.LA(1) >= LSQUARE && input.LA(1) <= LAST_LEXER_FAKE_RULE) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return s;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    if ( state.backtracking==0 ) {s += (other!=null?other.getText():null);}

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_balance_lparen_rparen1258); if (state.failed) return s;

            if ( state.backtracking==0 ) {s += ")";}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "balance_lparen_rparen"

    // $ANTLR start synpred1_Evaluator
    public final void synpred1_Evaluator_fragment() throws RecognitionException {
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:80:9: ( function_call )
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:80:10: function_call
        {
        pushFollow(FOLLOW_function_call_in_synpred1_Evaluator322);
        function_call();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Evaluator

    // $ANTLR start synpred2_Evaluator
    public final void synpred2_Evaluator_fragment() throws RecognitionException {
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:128:13: ( IDENT ( balance_less_greater )? SCOPE )
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:128:14: IDENT ( balance_less_greater )? SCOPE
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred2_Evaluator779); if (state.failed) return ;

        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:128:20: ( balance_less_greater )?
        int alt15=2;
        int LA15_0 = input.LA(1);

        if ( (LA15_0==LESSTHAN) ) {
            alt15=1;
        }
        switch (alt15) {
            case 1 :
                // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:128:21: balance_less_greater
                {
                pushFollow(FOLLOW_balance_less_greater_in_synpred2_Evaluator782);
                balance_less_greater();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,SCOPE,FOLLOW_SCOPE_in_synpred2_Evaluator786); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Evaluator

    // $ANTLR start synpred3_Evaluator
    public final void synpred3_Evaluator_fragment() throws RecognitionException {
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:149:10: ( IDENT ( balance_less_greater )? SCOPE )
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:149:11: IDENT ( balance_less_greater )? SCOPE
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred3_Evaluator932); if (state.failed) return ;

        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:149:17: ( balance_less_greater )?
        int alt16=2;
        int LA16_0 = input.LA(1);

        if ( (LA16_0==LESSTHAN) ) {
            alt16=1;
        }
        switch (alt16) {
            case 1 :
                // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:149:18: balance_less_greater
                {
                pushFollow(FOLLOW_balance_less_greater_in_synpred3_Evaluator935);
                balance_less_greater();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,SCOPE,FOLLOW_SCOPE_in_synpred3_Evaluator939); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Evaluator

    // $ANTLR start synpred4_Evaluator
    public final void synpred4_Evaluator_fragment() throws RecognitionException {
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:159:13: ( LESSTHAN )
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:159:14: LESSTHAN
        {
        match(input,LESSTHAN,FOLLOW_LESSTHAN_in_synpred4_Evaluator1015); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Evaluator

    // $ANTLR start synpred5_Evaluator
    public final void synpred5_Evaluator_fragment() throws RecognitionException {
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:170:13: ( LPAREN )
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:170:14: LPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred5_Evaluator1137); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Evaluator

    // $ANTLR start synpred6_Evaluator
    public final void synpred6_Evaluator_fragment() throws RecognitionException {
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:174:13: ( GREATERTHAN )
        // D:\\projects\\nbp\\main-silver\\cnd.modelimpl\\src\\org\\netbeans\\modules\\cnd\\modelimpl\\impl\\services\\evaluator\\parser/Evaluator.g:174:14: GREATERTHAN
        {
        match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_synpred6_Evaluator1198); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Evaluator

    // Delegated rules

    public final boolean synpred2_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_expr_in_prog37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_expr57 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_PLUS_in_expr73 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0xA000000C00000080L});
    public static final BitSet FOLLOW_equalityExpr_in_expr77 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_MINUS_in_expr93 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0xA000000C00000080L});
    public static final BitSet FOLLOW_equalityExpr_in_expr97 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_multExpr_in_equalityExpr143 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpr157 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0xA000000C00000080L});
    public static final BitSet FOLLOW_multExpr_in_equalityExpr163 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equalityExpr177 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0xA000000C00000080L});
    public static final BitSet FOLLOW_multExpr_in_equalityExpr183 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr221 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_STAR_in_multExpr226 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0xA000000C00000080L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr230 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_atom_in_unaryExpr259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpr271 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0xA000000C00000080L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMALINT_in_atom309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_atom327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_atom339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom351 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0xA000000C00000080L});
    public static final BitSet FOLLOW_expr_in_atom353 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_atom355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_sizeof_in_atom367 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_balance_lparen_rparen_in_atom369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_static_cast_in_atom381 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LESSTHAN_in_atom383 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_GREATERTHAN_in_atom391 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_atom393 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0xA000000C00000080L});
    public static final BitSet FOLLOW_expr_in_atom395 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_atom397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_true_in_atom409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_false_in_atom429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_id_in_function_call472 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_balance_lparen_rparen_in_function_call487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_const_in_variable527 = new BitSet(new long[]{0x0010000000000000L,0x0000000008000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_qualified_id_in_variable543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_override_in_qualified_id587 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IDENT_in_qualified_id621 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_balance_less_greater_in_qualified_id671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_scope_override741 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_scope_override_part_in_scope_override794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_scope_override_part848 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_balance_less_greater_in_scope_override_part886 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SCOPE_in_scope_override_part909 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_scope_override_part_in_scope_override_part947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_balance_less_greater988 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_balance_less_greater_in_balance_less_greater1023 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_set_in_balance_less_greater1053 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_GREATERTHAN_in_balance_less_greater1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_balance_lparen_rparen1110 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_balance_lparen_rparen_in_balance_lparen_rparen1145 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_GREATERTHAN_in_balance_lparen_rparen1202 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_set_in_balance_lparen_rparen1232 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_RPAREN_in_balance_lparen_rparen1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_synpred1_Evaluator322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred2_Evaluator779 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_balance_less_greater_in_synpred2_Evaluator782 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SCOPE_in_synpred2_Evaluator786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred3_Evaluator932 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_balance_less_greater_in_synpred3_Evaluator935 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SCOPE_in_synpred3_Evaluator939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_synpred4_Evaluator1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred5_Evaluator1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHAN_in_synpred6_Evaluator1198 = new BitSet(new long[]{0x0000000000000002L});

}