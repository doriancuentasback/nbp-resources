/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hulles.geewhiz;

import org.netbeans.api.languages.ASTNode;
import org.netbeans.api.languages.ASTPath;
import org.netbeans.api.languages.SyntaxContext;

/**
 *
 * @author mark
 */
public class PrologNBS {
    
    public static String statementIcon (SyntaxContext context) {
        ASTPath path = context.getASTPath ();
        ASTNode node = (ASTNode) path.getLeaf ();
        node = node.getNode ("ListOfStructures");
        if (node != null) {
            return "/org/netbeans/modules/languages/resources/variable.gif";
        }

        return "/org/netbeans/modules/languages/resources/method.gif";
    }

}