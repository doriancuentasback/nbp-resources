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


import java.io.*;
import java.util.HashMap;
import org.netbeans.api.visage.lexer.VSGTokenId;

/**
 * @author Rastislav Komara (<a href="mailto:moonko@netbeans.orgm">RKo</a>)
 * This class is for verification of grammar file vs. {@link org.netbeans.api.visage.lexer.VisageTokenId} enum.
 *
 * @todo Change to implement Ant task in future.
 */
@SuppressWarnings({"ALL"})
public class GrammarVerifier {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.exit(-2);                
        }

        final String s = args[0];
        File f = new File(s);
        if (!f.exists()) {
            System.exit(-3);
        }

        try {
            BufferedReader r = new BufferedReader(new FileReader(f));
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            String line;
            while ((line = r.readLine()) != null) {
                if (line.startsWith("\'")) continue; // NOI18N
                String[] elements = line.split("="); // NOI18N
                if (elements.length < 2) {
                    System.err.println("Zero elements: '" + line + "'"); // NOI18N
                    continue;
                }
                map.put(elements[0].trim(), Integer.parseInt(elements[1].trim()));
            }

            final VSGTokenId[] tokenIds = VSGTokenId.values();
            for (VSGTokenId id : tokenIds) {
                if (map.containsKey(id.name())) {
                    final Integer integer = map.get(id.name());
                    if (id.getTokenType() != integer) {
                        System.err.println("The token " + id + " has not correct id."); // NOI18N
                        System.exit(-100);
                    }
                    map.remove(id.name());
                } else if (id != VSGTokenId.UNKNOWN) {
                    System.err.println("The token " + id + " has not been found."); // NOI18N
                    System.exit(-100);
                } 
            }
            if (!map.isEmpty()) {
                System.err.printf("There are tokens missing in %s enum. \n", VSGTokenId.class.getName()); // NOI18N
                System.exit(-100);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
