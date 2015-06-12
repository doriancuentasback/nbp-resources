/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2008 Sun Microsystems, Inc.
 */

package org.netbeans.api.visage.lexer;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;
import org.netbeans.lib.visage.lexer.VSGStringLexer;

/**
 * Token ids for java string language
 * (embedded in java string or character literals).
 *
 * @author Miloslav Metelka
 * @author Rastislav Komara (<a href="mailto:moonko@netbeans.org">RKo</a>)
 * @version 1.00
 */
public enum VSGStringTokenId implements TokenId {

    TEXT("string"), //NOI18N
    BACKSPACE("string-escape"), //NOI18N
    FORM_FEED("string-escape"), //NOI18N
    NEWLINE("string-escape"), //NOI18N
    CR("string-escape"), //NOI18N
    TAB("string-escape"), //NOI18N
    CODE_OPENING_BRACE("symbol"), //NOI18N
    CODE_ENCLOSING_BRACE("symbol"), //NOI18N
    CODE_OPENING_BRACE_ESCAPE("string-escape"), //NOI18N
    CODE_ENCLOSING_BRACE_ESCAPE("string-escape"), //NOI18N
    SINGLE_QUOTE("string-escape"), //NOI18N
    DOUBLE_QUOTE("string-escape"), //NOI18N
    BACKSLASH("string-escape"), //NOI18N
    OCTAL_ESCAPE("string-escape"), //NOI18N
    OCTAL_ESCAPE_INVALID("string-escape-invalid"), //NOI18N
    UNICODE_ESCAPE("string-escape"), //NOI18N
    UNICODE_ESCAPE_INVALID("string-escape-invalid"), //NOI18N
    ESCAPE_SEQUENCE_INVALID("string-escape-invalid"); //NOI18N

    private final String primaryCategory;

    VSGStringTokenId() {
        this(null);
    }

    VSGStringTokenId(String primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public String primaryCategory() {
        return primaryCategory;
    }

    private static final Language<VSGStringTokenId> language = new MyLanguageHierarchy(false).language();
    private static final Language<VSGStringTokenId> language_STO = new MyLanguageHierarchy(true).language();

    public static Language<VSGStringTokenId> language() {
        return language(false);
    }

    public static Language<VSGStringTokenId> language(boolean forceStringOnly) {
        return forceStringOnly ? language_STO : language;
    }

    private static class MyLanguageHierarchy extends LanguageHierarchy<VSGStringTokenId> {
        private final boolean forceStringOnly;

        private MyLanguageHierarchy(boolean forceStringOnly) {
            this.forceStringOnly = forceStringOnly;
        }

        @Override
        protected Collection<VSGStringTokenId> createTokenIds() {
            return EnumSet.allOf(VSGStringTokenId.class);
        }

        @Override
        protected Map<String, Collection<VSGStringTokenId>> createTokenCategories() {
            return null; // no extra categories
        }

        @Override
        protected Lexer<VSGStringTokenId> createLexer(LexerRestartInfo<VSGStringTokenId> info) {
            return new VSGStringLexer(info, forceStringOnly);
        }

        @Override
        protected String mimeType() {
            return "text/x-java-string"; //NOI18N
        }
    }
}