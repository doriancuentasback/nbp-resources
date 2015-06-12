package org.dartlang;

public enum TokenType {

    EOF(1, "keyword"),
    BREAK(4, "keyword"),
    CLASS(5, "keyword"),
    CONST(6, "language"),
    CONTINUE(7, "language"),
    DEFAULT(8, "keyword"),
    DO(9, "keyword"),
    ELSE(10, "language"),
    FALSE(11, "language"),
    FINAL(12, "language"),
    FOR(13, "language"),
    IF(14, "language"),
    IMPORT(15, "language"),
    IN(16, "keyword"),
    LIBRARY(17, "language"),
    NEW(18, "language"),
    NULL(19, "language"),
    PART(20, "language"),
    RETURN(21, "language"),
    STATIC(22, "language"),
    TRUE(23, "keyword"),
    VOID(24, "language"),
    WHILE(25, "language"),
    INT(26, "number"),
    ID(27, "keyword"),
    STRING(28, "string"),
    WHITESPACE(29, "whitespace"),
    COMMENT(30, "comment"),
    ML_COMMENT(31, "comment"),
    T__32(32, "separator"),
    T__33(33, "separator"),
    T__34(34, "separator"),
    T__35(35, "separator"),
    T__36(36, "separator"),
    T__37(37, "separator"),
    T__38(38, "separator"),
    T__39(39, "separator"),
    T__40(40, "separator"),
    T__41(41, "separator"),
    T__42(42, "separator"),
    T__43(43, "separator"),
    T__44(44, "separator"),
    T__45(45, "separator"),
    T__46(46, "separator"),
    T__47(47, "separator"),
    T__48(48, "separator"),
    T__49(49, "separator"),
    T__50(50, "separator"),
    T__51(51, "separator"),
    T__52(52, "separator"),
    T__53(53, "separator"),
    T__54(54, "separator"),
    T__55(55, "separator");

    public int id;
    public String category;
    public String text;

    private TokenType(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public static TokenType valueOf(int id) {
        TokenType[] values = values();
        for (TokenType value : values) {
            if (value.id == id) {
                return value;
            }
        }
        throw new IllegalArgumentException("The id " + id + " is not recognized");
    }

}
