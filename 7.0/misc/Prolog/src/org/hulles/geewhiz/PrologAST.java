/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hulles.geewhiz;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import org.netbeans.api.languages.ASTItem;
import org.netbeans.api.languages.ASTNode;
import org.netbeans.api.languages.ASTToken;
import org.netbeans.modules.editor.NbEditorDocument;
//import org.netbeans.modules.languages.ParserManagerImpl;
import org.openide.cookies.EditorCookie;
import org.openide.loaders.DataObject;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OutputWriter;

/**
 *
 * @author mark
 */
public class PrologAST {
    private final static boolean verbose = false;
    private ASTNode rootNode = null;
    private DataObject dataObject;
    private OutputWriter outputWriter;
    private static ASTNode saveNode;

    public PrologAST(DataObject dataObject) {
        this.dataObject = dataObject;
        refresh();
    }

    private void refresh () {
//  TODO: put this in a Runnable?
        ASTNode root;
        
        root = getASTRoot ();
        if (root == rootNode) {
            return;
        }
        rootNode = root;
    }

    private ASTNode getASTRoot() {
        EditorCookie eCookie;
        Document doc;
//        ParserManagerImpl pImpl; 
       
        eCookie = dataObject.getLookup ().lookup(EditorCookie.class);
        if (eCookie == null) {
            return null;
        }
        doc = eCookie.getDocument ();
        if (doc == null || !(doc instanceof NbEditorDocument)) {
            return null;
        }
        
//        pImpl = ParserManagerImpl.getImpl(doc);
//        if (pImpl == null) {
//            return null;
//        }
//        return pImpl.getAST ();
         return null;
     }

    public List<PrologClause> getClauses() {
        List<PrologClause> clauses;
        PrologClause clause;
        PrologClause existingClause;
        List<ASTItem> children;
        ASTNode node = null;
        String nodeName;
        ASTNode bodyNode;
        String statementText;
        InputOutput io;

        if (verbose) {
            // get an output window tab using
            // starting example from I/O API javadoc
            io = IOProvider.getDefault().getIO("Prolog", false);
            io.select();
            outputWriter = io.getOut();
        }
        
        clauses = new ArrayList<PrologClause>();
        children = rootNode.getChildren();
        if (children == null) {
            return clauses;
        }
        dumpItems(children);
        for (ASTItem item : children) {
            if (item instanceof ASTNode) {
                node = (ASTNode) item;
                nodeName = node.getNT();
                if (nodeName.equals("Statement")) {
                    statementText = node.getAsText();
                    bodyNode = node.getNode("ListOfStructures");
                    clause = getClause(node);
                    if (clause == null) {
                        continue;
                    }
                    existingClause = PrologClause.findClause(clauses, clause);
                    if (existingClause == null) {
                        clause.setText(statementText);
                        addReferences(clause, saveNode);
                        if (bodyNode != null) {
                            addReferences(clause, bodyNode);
                        }
                        clauses.add(clause);
                    } else {
                        existingClause.appendText(statementText);
                        addReferences(existingClause, saveNode);
                        if (bodyNode != null) {
                            addReferences(existingClause, bodyNode);
                        }
                        existingClause.incrementInstanceCount();
                    }
                }
            }
        }
        dumpClauses(clauses);
        if (verbose) {
            outputWriter.close();
        }

        return clauses;
    }
    
    private PrologClause getClause(ASTNode node) {
        PrologClause clause;
        ASTNode functionNode;
        ASTNode functorNode;
        ASTNode argNode;
        ASTToken token;
        String functor;
        Integer arity;

        functionNode = findChildWithName(node, "Function");
        if (functionNode == null) {
            return null;
        }
        functorNode = functionNode.getNode("Functor");
        if (functorNode == null) {
            return null;
        }
        token = functorNode.getTokenType("identifier");
        if (token == null) {
            // built-in function
            return null;
        }
        argNode = functionNode.getNode("ListOfStructures");
        saveNode = argNode;
        if (argNode == null) {
            return null;
        }
        dumpNode(functorNode);
        dumpItems(functorNode.getChildren());
        functor = functorNode.getAsText();
        arity = getArity(argNode);
        clause = new PrologClause(functor, arity);
        return clause;
    }
    
    private void addReferences(PrologClause clause, ASTNode node) {
        List<ASTItem> children;
        PrologClause embeddedClause;
        ASTNode child;
        
        children = node.getChildren();
        if (children == null) {
            return;
        }
        for (ASTItem item : children) {
            if (item instanceof ASTNode) {
                child = (ASTNode) item;
                embeddedClause = getClause(child);
                while (embeddedClause != null) {
                    if (PrologClause.findClause(clause.getBody(), embeddedClause) == null) {
                        // only need one per customer
                        clause.appendBody(embeddedClause);
                    }
                    embeddedClause = getClause(saveNode);
                }
            }
        }
        return;
    }

    private ASTNode findChildWithName(ASTNode node, String name) {
    // find the (depth-first search) FIRST ASTnode with name in node's
    //  descendants
        List<ASTItem> children;
        ASTNode child;
        ASTNode retNode = null;
        
        children = node.getChildren();
        if (children == null) {
            return null;
        }
        for (ASTItem item : children) {
            if (item instanceof ASTNode) {
                child = (ASTNode) item;
                if (child.getNT().equals(name)) {
                    return child;
                }
                retNode = findChildWithName(child, name);
                if (retNode != null) {
                    return retNode;
                }
            }
        }
        return null;
    }
    
    private void dumpItems(List<ASTItem> items) {
        ASTNode node;
        
        if (!verbose) {
            return;
        }
        for (ASTItem item : items) {
            if (item instanceof ASTNode) {
                node = (ASTNode) item;
                dumpNode(node);
            } else {
/*                
                outputWriter.println("Item: " + item.toString());
                outputWriter.println("\tclass: " + item.getClass());
                outputWriter.println();
 */
            }
        }
    }
    
    private void dumpNode(ASTNode node) {

        if (!verbose) {
            return;
        }
        outputWriter.println("Node: " + node.getNT());
        outputWriter.println("\ttext: " + node.getAsText());
//        outputWriter.println("\tprint: " + node.print());
        outputWriter.println();
    }
    
    private Integer getArity(ASTNode node) {
        Integer arity = 0;
        List<ASTItem> children;
        ASTNode child;
        
        children = node.getChildren();
        if (children == null) {
            return null;
        }
        for (ASTItem item : children) {
            if (item instanceof ASTNode) {
                child = (ASTNode) item;
                if (child.getNT().equals("Structure")) {
                   arity++;
                }
            }
        }
        return arity;
    }

    private void dumpClauses(List<PrologClause> clauses) {
        List<PrologClause> eClauses; // embedded clauses
        
        if (!verbose) {
            return;
        }
        for (PrologClause c : clauses) {
            outputWriter.println("Predicate:" + c.getName());
            outputWriter.println("Arity:" + c.getArity());
            outputWriter.println("Instances:" + c.getInstanceCount());
            outputWriter.println("Text:" + c.getText());
            eClauses = c.getBody();
            for (PrologClause e : eClauses) {
                outputWriter.println("Embedded Predicate:" + e.getName() + "/" + e.getArity());
            }
            outputWriter.println();
        }
    }
}
