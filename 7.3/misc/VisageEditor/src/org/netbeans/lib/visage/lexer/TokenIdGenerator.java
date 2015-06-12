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

package org.netbeans.lib.visage.lexer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Map;
import java.util.TreeMap;
import org.netbeans.api.visage.lexer.VSGTokenId;
import org.netbeans.api.lexer.Language;

/**
 * @author Rastislav Komara (<a href="mailto:moonko@netbeans.orgm">RKo</a>)
 * @todo documentation
 */
public class TokenIdGenerator {
    public static final String FORMAT = "\t{0}(\"{1}\", {2}), // NOI18N"; // NOI18N


    public static void main(String[] args) {
        String tokens = findArg("-tokens", args); // NOI18N
        if (tokens == null) {
            System.err.println("Use -tokens <tokens-file> to specify token input file."); // NOI18N
            System.exit(-1);
        }
        File tokenF = new File(tokens);
        if (!tokenF.exists()) {
            System.err.println("Tokens file " + tokenF + " does not exist."); // NOI18N
            System.exit(-1);
        }
        BufferedReader r = null;
        Language<VSGTokenId> language = VSGTokenId.language();
        Map<String, TokenIdDesc> name2Desc = new TreeMap<String, TokenIdDesc>();
        try {
            r = new BufferedReader(new FileReader(tokenF));
            MessageFormat f = new MessageFormat(FORMAT);
            String line;            
            while ((line = r.readLine()) != null) {
                if (line.startsWith("\'")) continue;
                String[] elements = line.split("=");
                String name = elements[0];
                String category;
                VSGTokenId id = language.tokenId(name);
                if (id != null) {
                    category = id.primaryCategory();
                } else {
                    category = VSGTokenId.UNKNOWN.primaryCategory();
                }
                name2Desc.put(name, new TokenIdDesc(name, category, Integer.parseInt(elements[1])));
            }
            for (TokenIdDesc desc : name2Desc.values()) {
                System.out.println(f.format(new Object[]{desc.name, desc.category, desc.intId}));
            }
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-2);
        } finally {
            if (r != null) try {
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static String findArg(String param, String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg.equals(param)) {
                if (i == args.length - 1)
                    throw new IllegalArgumentException("Parameter \"" + param + // NOI18N
                            "\" is not followed by a value"); // NOI18N
                return args[i + 1];
            }
        }
        return null;
    }

    private static final class TokenIdDesc {

        TokenIdDesc(String name, String category, int intId) {
            this.name = name;
            this.category = category;
            this.intId = intId;
        }

        final String name;

        final String category;

        final int intId;

    }

}
