// $ANTLR Sun-2.7.7(NoEx) (2006-01-29): "support/aptlexer.g" -> "APTLexer.java"$


package org.netbeans.modules.cnd.apt.impl.support.generated;

import org.netbeans.modules.cnd.apt.utils.APTUtils;
import org.netbeans.modules.cnd.apt.support.APTToken;
import org.netbeans.modules.cnd.apt.support.lang.APTLanguageSupport;


public interface APTGeneratedTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int ELLIPSIS = 4;
	int DOT = 5;
	int ASSIGNEQUAL = 6;
	int COLON = 7;
	int COMMA = 8;
	int QUESTIONMARK = 9;
	int SEMICOLON = 10;
	int POINTERTO = 11;
	int LPAREN = 12;
	int RPAREN = 13;
	int LSQUARE = 14;
	int RSQUARE = 15;
	int LCURLY = 16;
	int RCURLY = 17;
	int EQUAL = 18;
	int NOTEQUAL = 19;
	int LESSTHANOREQUALTO = 20;
	int LESSTHAN = 21;
	int GREATERTHANOREQUALTO = 22;
	int GREATERTHAN = 23;
	int DIVIDE = 24;
	int DIVIDEEQUAL = 25;
	int PLUS = 26;
	int PLUSEQUAL = 27;
	int PLUSPLUS = 28;
	int MINUS = 29;
	int MINUSEQUAL = 30;
	int MINUSMINUS = 31;
	int STAR = 32;
	int TIMESEQUAL = 33;
	int MOD = 34;
	int MODEQUAL = 35;
	int SHIFTRIGHT = 36;
	int SHIFTRIGHTEQUAL = 37;
	int SHIFTLEFT = 38;
	int SHIFTLEFTEQUAL = 39;
	int AND = 40;
	int NOT = 41;
	int OR = 42;
	int AMPERSAND = 43;
	int BITWISEANDEQUAL = 44;
	int TILDE = 45;
	int BITWISEOR = 46;
	int BITWISEOREQUAL = 47;
	int BITWISEXOR = 48;
	int BITWISEXOREQUAL = 49;
	int POINTERTOMBR = 50;
	int DOTMBR = 51;
	int SCOPE = 52;
	int AT = 53;
	int DOLLAR = 54;
	int BACK_SLASH = 55;
	int DEFINED = 56;
	int DBL_SHARP = 57;
	int SHARP = 58;
	int FUN_LIKE_MACRO_LPAREN = 59;
	int GRAVE_ACCENT = 60;
	int END_PREPROC_DIRECTIVE = 61;
	int LAST_CONST_TEXT_TOKEN = 62;
	int FLOATONE = 63;
	int FLOATTWO = 64;
	int HEXADECIMALINT = 65;
	int OCTALINT = 66;
	int DECIMALINT = 67;
	int Whitespace = 68;
	int EndOfLine = 69;
	int Skip = 70;
	int PreProcComment = 71;
	int PPLiterals = 72;
	int Space = 73;
	int PreProcBlockComment = 74;
	int PreProcLineComment = 75;
	int Comment = 76;
	int CPPComment = 77;
	int CHAR_LITERAL = 78;
	int STRING_LITERAL = 79;
	int InterStringWhitespace = 80;
	int StringPart = 81;
	int Escape = 82;
	int Digit = 83;
	int Decimal = 84;
	int LongSuffix = 85;
	int UnsignedSuffix = 86;
	int FloatSuffix = 87;
	int Exponent = 88;
	int Vocabulary = 89;
	int NUMBER = 90;
	int IDENT = 91;
	int BINARYINT = 92;
	int INCLUDE_STRING = 93;
	int SYS_INCLUDE_STRING = 94;
	int INCLUDE = 95;
	int INCLUDE_NEXT = 96;
	int DEFINE = 97;
	int UNDEF = 98;
	int IFDEF = 99;
	int IFNDEF = 100;
	int IF = 101;
	int ELIF = 102;
	int ELSE = 103;
	int ENDIF = 104;
	int PRAGMA = 105;
	int LINE = 106;
	int ERROR = 107;
	int PREPROC_DIRECTIVE = 108;
	int FIRST_LITERAL_TOKEN = 109;
	int LITERAL_OPERATOR = 110;
	int LITERAL_alignof = 111;
	int LITERAL___alignof__ = 112;
	int LITERAL_typeof = 113;
	int LITERAL___typeof__ = 114;
	int LITERAL___typeof = 115;
	int LITERAL_template = 116;
	int LITERAL_typedef = 117;
	int LITERAL_enum = 118;
	int LITERAL_namespace = 119;
	int LITERAL_extern = 120;
	int LITERAL_inline = 121;
	int LITERAL__inline = 122;
	int LITERAL___inline__ = 123;
	int LITERAL___inline = 124;
	int LITERAL_virtual = 125;
	int LITERAL_explicit = 126;
	int LITERAL_friend = 127;
	int LITERAL__stdcall = 128;
	int LITERAL___stdcall = 129;
	int LITERAL_typename = 130;
	int LITERAL_auto = 131;
	int LITERAL_register = 132;
	int LITERAL_static = 133;
	int LITERAL_mutable = 134;
	int LITERAL_const = 135;
	int LITERAL___const__ = 136;
	int LITERAL___const = 137;
	int LITERAL_const_cast = 138;
	int LITERAL_volatile = 139;
	int LITERAL___volatile__ = 140;
	int LITERAL___volatile = 141;
	int LITERAL_char = 142;
	int LITERAL_wchar_t = 143;
	int LITERAL_bool = 144;
	int LITERAL_short = 145;
	int LITERAL_int = 146;
	int LITERAL_long = 147;
	int LITERAL_signed = 148;
	int LITERAL___signed__ = 149;
	int LITERAL___signed = 150;
	int LITERAL_unsigned = 151;
	int LITERAL___unsigned__ = 152;
	int LITERAL_float = 153;
	int LITERAL_double = 154;
	int LITERAL_void = 155;
	int LITERAL__declspec = 156;
	int LITERAL___declspec = 157;
	int LITERAL_class = 158;
	int LITERAL_struct = 159;
	int LITERAL_union = 160;
	int LITERAL_this = 161;
	int LITERAL_true = 162;
	int LITERAL_false = 163;
	int LITERAL_public = 164;
	int LITERAL_protected = 165;
	int LITERAL_private = 166;
	int LITERAL_throw = 167;
	int LITERAL_case = 168;
	int LITERAL_default = 169;
	int LITERAL_if = 170;
	int LITERAL_else = 171;
	int LITERAL_switch = 172;
	int LITERAL_while = 173;
	int LITERAL_do = 174;
	int LITERAL_for = 175;
	int LITERAL_goto = 176;
	int LITERAL_continue = 177;
	int LITERAL_break = 178;
	int LITERAL_return = 179;
	int LITERAL_try = 180;
	int LITERAL_catch = 181;
	int LITERAL_using = 182;
	int LITERAL_export = 183;
	int LITERAL_asm = 184;
	int LITERAL__asm = 185;
	int LITERAL___asm__ = 186;
	int LITERAL___asm = 187;
	int LITERAL__endasm = 188;
	int LITERAL_sizeof = 189;
	int LITERAL_dynamic_cast = 190;
	int LITERAL_static_cast = 191;
	int LITERAL_reinterpret_cast = 192;
	int LITERAL_new = 193;
	int LITERAL__cdecl = 194;
	int LITERAL___cdecl = 195;
	int LITERAL__near = 196;
	int LITERAL___near = 197;
	int LITERAL__far = 198;
	int LITERAL___far = 199;
	int LITERAL___interrupt = 200;
	int LITERAL_pascal = 201;
	int LITERAL__pascal = 202;
	int LITERAL___pascal = 203;
	int LITERAL_delete = 204;
	int LITERAL__int64 = 205;
	int LITERAL___int64 = 206;
	int LITERAL___w64 = 207;
	int LITERAL___extension__ = 208;
	int LITERAL___attribute__ = 209;
	int LITERAL_restrict = 210;
	int LITERAL___restrict = 211;
	int LITERAL___complex__ = 212;
	int LITERAL___imag = 213;
	int LITERAL___real = 214;
	int LITERAL___global = 215;
	int LITERAL__Bool = 216;
	int LITERAL__Complex = 217;
	int LITERAL___thread = 218;
	int LITERAL___attribute = 219;
	int LITERAL__Imaginary = 220;
	int LITERAL_bit = 221;
	int LITERAL___symbolic = 222;
	int LITERAL___hidden = 223;
	int LITERAL_final = 224;
	int LITERAL_override = 225;
	int LITERAL_constexpr = 226;
	int LITERAL_decltype = 227;
	int LITERAL_nullptr = 228;
	int LITERAL_thread_local = 229;
	int LITERAL_static_assert = 230;
	int LITERAL_alignas = 231;
	int LITERAL_char16_t = 232;
	int LITERAL_char32_t = 233;
	int LITERAL_noexcept = 234;
	int LITERAL___decltype = 235;
	int LITERAL___complex = 236;
	int LITERAL___forceinline = 237;
	int LITERAL___clrcall = 238;
	int LITERAL___try = 239;
	int LITERAL___finally = 240;
	int LITERAL___null = 241;
	int LITERAL___alignof = 242;
	int LITERAL___is_class = 243;
	int LITERAL___is_enum = 244;
	int LITERAL___is_pod = 245;
	int LITERAL___is_base_of = 246;
	int LITERAL___has_trivial_constructor = 247;
	int LITERAL___restrict__ = 248;
	int LITERAL__Noreturn = 249;
	int LITERAL___has_nothrow_assign = 250;
	int LITERAL___has_nothrow_copy = 251;
	int LITERAL___has_nothrow_constructor = 252;
	int LITERAL___has_trivial_assign = 253;
	int LITERAL___has_trivial_copy = 254;
	int LITERAL___has_trivial_destructor = 255;
	int LITERAL___has_virtual_destructor = 256;
	int LITERAL___is_abstract = 257;
	int LITERAL___is_empty = 258;
	int LITERAL___is_literal_type = 259;
	int LITERAL___is_polymorphic = 260;
	int LITERAL___is_standard_layout = 261;
	int LITERAL___is_trivial = 262;
	int LITERAL___is_union = 263;
	int LITERAL___underlying_type = 264;
	int LITERAL___builtin_va_list = 265;
	int LAST_LITERAL_TOKEN = 266;
	int LITERAL__BUILT_IN_TYPE__ = 267;
	int LITERAL__TYPE_QUALIFIER__ = 268;
	int LITERAL__STORAGE_CLASS_SPECIFIER__ = 269;
	int T_CLOSE = 270;
	int T_BLOCK = 271;
	int T_GE = 272;
	int T_CONTAINS = 273;
	int T_ABSTRACT = 274;
	int T_CLASS = 275;
	int T_NOPASS = 276;
	int T_UNFORMATTED = 277;
	int T_LESSTHAN = 278;
	int T_ENDSUBROUTINE = 279;
	int T_GT = 280;
	int T_IDENT = 281;
	int T_INTERFACE = 282;
	int T_RETURN = 283;
	int T_XYZ = 284;
	int T_EOF = 285;
	int T_CALL = 286;
	int T_EOS = 287;
	int T_GO = 288;
	int T_AND = 289;
	int T_PERCENT = 290;
	int T_PRINT = 291;
	int T_ALLOCATE_STMT_1 = 292;
	int T_SUBROUTINE = 293;
	int T_CONTROL_EDIT_DESC = 294;
	int T_ENUMERATOR = 295;
	int Alphanumeric_Character = 296;
	int T_DEFINED_OP = 297;
	int T_KIND = 298;
	int T_STOP = 299;
	int T_GREATERTHAN_EQ = 300;
	int T_CHAR_STRING_EDIT_DESC = 301;
	int T_ALLOCATABLE = 302;
	int T_ENDINTERFACE = 303;
	int T_END = 304;
	int T_ASTERISK = 305;
	int T_PRIVATE = 306;
	int T_DOUBLEPRECISION = 307;
	int T_CASE = 308;
	int T_IMPLICIT = 309;
	int T_IF = 310;
	int T_THEN = 311;
	int T_DIMENSION = 312;
	int T_GOTO = 313;
	int T_ENDMODULE = 314;
	int T_IN = 315;
	int T_WRITE = 316;
	int T_FORMATTED = 317;
	int WS = 318;
	int T_DATA = 319;
	int T_FALSE = 320;
	int T_WHERE = 321;
	int T_ENDIF = 322;
	int T_SLASH = 323;
	int SQ_Rep_Char = 324;
	int T_GENERIC = 325;
	int T_RECURSIVE = 326;
	int DQ_Rep_Char = 327;
	int T_ELSEIF = 328;
	int T_BLOCKDATA = 329;
	int OCTAL_CONSTANT = 330;
	int T_SELECTTYPE = 331;
	int T_MINUS = 332;
	int T_SELECT = 333;
	int T_FINAL = 334;
	int T_UNDERSCORE = 335;
	int T_IMPORT = 336;
	int T_USE = 337;
	int T_FILE = 338;
	int T_RPAREN = 339;
	int T_INTENT = 340;
	int T_ENDBLOCK = 341;
	int T_ASSIGNMENT_STMT = 342;
	int T_PAUSE = 343;
	int T_BACKSPACE = 344;
	int T_ENDFILE = 345;
	int T_EQUALS = 346;
	int T_NON_INTRINSIC = 347;
	int T_SELECTCASE = 348;
	int T_DIGIT_STRING = 349;
	int T_COLON_COLON = 350;
	int T_NON_OVERRIDABLE = 351;
	int Special_Character = 352;
	int T_INCLUDE = 353;
	int T_OPEN = 354;
	int T_POWER = 355;
	int T_ASSOCIATE = 356;
	int T_CHAR_CONSTANT = 357;
	int T_OPERATOR = 358;
	int T_TO = 359;
	int T_ENDASSOCIATE = 360;
	int T_EQ = 361;
	int T_GREATERTHAN = 362;
	int T_DATA_EDIT_DESC = 363;
	int T_INQUIRE_STMT_2 = 364;
	int T_EQV = 365;
	int HEX_CONSTANT = 366;
	int Digit_String = 367;
	int T_ELEMENTAL = 368;
	int T_CHARACTER = 369;
	int PREPROCESS_LINE = 370;
	int T_NULLIFY = 371;
	int T_REWIND = 372;
	int T_ARITHMETIC_IF_STMT = 373;
	int T_FORALL_CONSTRUCT_STMT = 374;
	int T_BIND = 375;
	int T_ENDFORALL = 376;
	int T_DO = 377;
	int T_WHERE_STMT = 378;
	int T_POINTER = 379;
	int T_PROGRAM = 380;
	int T_ENDTYPE = 381;
	int T_WAIT = 382;
	int T_ELSE = 383;
	int T_IF_STMT = 384;
	int T_RBRACKET = 385;
	int T_LPAREN = 386;
	int T_EXTENDS = 387;
	int T_OPTIONAL = 388;
	int T_DOUBLE = 389;
	int T_MODULE = 390;
	int T_READ = 391;
	int T_ALLOCATE = 392;
	int T_INTEGER = 393;
	int T_OR = 394;
	int T_EQUIVALENCE = 395;
	int T_PERIOD = 396;
	int T_ENTRY = 397;
	int T_LABEL_DO_TERMINAL = 398;
	int T_REAL = 399;
	int T_CYCLE = 400;
	int T_PROCEDURE = 401;
	int T_EQ_EQ = 402;
	int T_SLASH_EQ = 403;
	int T_ENDSELECT = 404;
	int T_PURE = 405;
	int T_TRUE = 406;
	int T_NE = 407;
	int T_INTRINSIC = 408;
	int T_PASS = 409;
	int T_REAL_CONSTANT = 410;
	int LINE_COMMENT = 411;
	int T_PERIOD_EXPONENT = 412;
	int T_ENDWHERE = 413;
	int MISC_CHAR = 414;
	int T_FORMAT = 415;
	int T_DEFAULT = 416;
	int T_SLASH_SLASH = 417;
	int T_NONE = 418;
	int T_NAMELIST = 419;
	int T_SEQUENCE = 420;
	int T_PRECISION = 421;
	int T_ASYNCHRONOUS = 422;
	int T_COMMA = 423;
	int T_RESULT = 424;
	int T_ENDBLOCKDATA = 425;
	int T_LOGICAL = 426;
	int T_VALUE = 427;
	int Letter = 428;
	int T_FORALL = 429;
	int T_SAVE = 430;
	int T_HOLLERITH = 431;
	int T_FLUSH = 432;
	int T_WHILE = 433;
	int T_INQUIRE = 434;
	int T_DEFERRED = 435;
	int T_FORALL_STMT = 436;
	int T_ASSIGN = 437;
	int T_LBRACKET = 438;
	int T_EXTERNAL = 439;
	int T_VOLATILE = 440;
	int T_OUT = 441;
	int CONTINUE_CHAR = 442;
	int T_COLON = 443;
	int T_COMPLEX = 444;
	int T_PLUS = 445;
	int T_STMT_FUNCTION = 446;
	int T_ONLY = 447;
	int T_PROTECTED = 448;
	int T_COMMON = 449;
	int T_INOUT = 450;
	int T_NEQV = 451;
	int T_PUBLIC = 452;
	int T_ENDDO = 453;
	int T_ENDPROGRAM = 454;
	int T_ENDFUNCTION = 455;
	int T_WHERE_CONSTRUCT_STMT = 456;
	int T_ELSEWHERE = 457;
	int T_ENUM = 458;
	int T_PARAMETER = 459;
	int T_TARGET = 460;
	int T_DOUBLECOMPLEX = 461;
	int T_PTR_ASSIGNMENT_STMT = 462;
	int T_TYPE = 463;
	int T_LESSTHAN_EQ = 464;
	int T_DEALLOCATE = 465;
	int T_LT = 466;
	int T_FUNCTION = 467;
	int T_EQ_GT = 468;
	int T_ENDENUM = 469;
	int BINARY_CONSTANT = 470;
	int T_LE = 471;
	int T_LEN = 472;
	int T_CONTINUE = 473;
	int T_NOT = 474;
	int Rep_Char = 475;
	int T_ASSIGNMENT = 476;
	int T_EXIT = 477;
	int FORTRAN_COMMENT = 478;
	int FIRST_ASSIGN = 479;
	int FIRST_DIVIDE = 480;
	int FIRST_STAR = 481;
	int FIRST_MOD = 482;
	int FIRST_NOT = 483;
	int FIRST_AMPERSAND = 484;
	int COMMENT = 485;
	int CPP_COMMENT = 486;
	int FIRST_OR = 487;
	int FIRST_BITWISEXOR = 488;
	int FIRST_COLON = 489;
	int FIRST_LESS = 490;
	int FIRST_GREATER = 491;
	int FIRST_MINUS = 492;
	int FIRST_PLUS = 493;
	int FIRST_QUOTATION = 494;
	int H_char_sequence = 495;
	int Q_char_sequence = 496;
	int DirectiveBody = 497;
	int CHAR_LITERAL_BODY = 498;
	int STRING_LITERAL_BODY = 499;
	int RAW_STRING_LITERAL = 500;
	int RAW_STRING_LITERAL_BODY = 501;
	int Suffix = 502;
	int ID_LIKE = 503;
	int ID_DEFINED = 504;
	int Identifier = 505;
	int PostPPKwdChar = 506;
	int PostInclChar = 507;
	int PostIfChar = 508;
	int LAST_LEXER_FAKE_RULE = 509;
}
