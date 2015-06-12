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
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2007 Sun
 * Microsystems, Inc. All Rights Reserved.
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 */


package org.netbeans.modules.javascript.editing;

import org.mozilla.nb.javascript.Context;

/**
 * Test the "mark occurrences" feature in JavaScript
 *
 * @author Tor Norbye
 */

public class JsOccurrenceFinderTest extends JsTestBase {
    
    public JsOccurrenceFinderTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        SupportedBrowsers.getInstance().setLanguageVersion(Context.VERSION_DEFAULT);
    }

    public void testMarks() throws Exception {
        String caretLine = "function myfunc(p^aram1, param2) {";
        checkOccurrences("testfiles/semantic4.js", caretLine, true);
    }

    public void testMarks2() throws Exception {
        String caretLine = "function myfunc(param1, pa^ram2) {";
        checkOccurrences("testfiles/semantic4.js", caretLine, true);
    }

    public void testMarks3() throws Exception {
        String caretLine = "Spry.Effect.Registry.prototype.getRegisteredEffect = function(elem^ent, effect)";
        checkOccurrences("testfiles/SpryEffects.js", caretLine, true);
    }

    public void testMarkExits() throws Exception {
        String caretLine = "Spry.Effect.Registry.prototype.getRegisteredEffect = func^tion(element, effect)";
        checkOccurrences("testfiles/SpryEffects.js", caretLine, false);
    }
    
    public void testMarkExits2() throws Exception {
        String caretLine = "Spry.Effect.Registry.prototype.effectsAreTheSame = funct^ion(effectA, effectB)";
        checkOccurrences("testfiles/SpryEffects.js", caretLine, false);
    }

    public void testMarkExits3() throws Exception {
        String caretLine = "inspect: funct^ion(object) {";
        checkOccurrences("testfiles/occurrences.js", caretLine, false);
    }

    public void testMarkExits4() throws Exception {
        String caretLine = "function myf^unc(param1, param2)";
        checkOccurrences("testfiles/semantic4.js", caretLine, false);
    }
    
    public void testCatchVars() throws Exception {
        String caretLine = "puts(e^)";
        checkOccurrences("testfiles/occurrences2.js", caretLine, false);
    }

    public void test137522() throws Exception {
        checkOccurrences("testfiles/137522.js", "updated.each(function(it^em)", true); //);false /* true */);
    }
    
    public void testJavaScript17Stuff1() throws Exception {
        SupportedBrowsers.getInstance().setLanguageVersion(Context.VERSION_1_7);
        checkOccurrences("testfiles/javascript17.js", "yi^eld i;", true);
    }

    public void testJavaScript17Stuff2() throws Exception {
        SupportedBrowsers.getInstance().setLanguageVersion(Context.VERSION_1_7);
        checkOccurrences("testfiles/javascript17.js", "function f^ib() {", true);
    }
    
    // TODO - test function calls
}