package org.dartlang;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;

public class DartTokenId implements TokenId {

    private static final Language<DartTokenId> language = new DartLanguageHierarchy().language();
    private final String name;
    private final String primaryCategory;
    private final int id;

    public DartTokenId(String name, String primaryCategory, int id) {
        this.name = name;
        this.primaryCategory = primaryCategory;
        this.id = id;
    }

    @Override
    public String primaryCategory() {
        return primaryCategory;
    }

    @Override
    public int ordinal() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    public static Language<DartTokenId> getLanguage() {
        return new DartLanguageHierarchy().language();
    }

}
