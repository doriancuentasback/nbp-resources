/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hulles.geewhiz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mark
 */
public class PrologClause {
    private String name;
    private Integer arity;
    private List<PrologClause> body;
    private StringBuffer textBuffer;
    private Integer instanceCount;

    public PrologClause(String name, Integer arity) {
        this.name = name;
        this.arity = arity;
        this.body = new ArrayList<PrologClause>();
        this.textBuffer = new StringBuffer();
        this.instanceCount = 1;
    }

    public Integer getInstanceCount() {
        return instanceCount;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public String getText() {
        return textBuffer.toString();
    }

    public void setText(String text) {
        this.textBuffer = new StringBuffer(text);
    }
    
    public void appendText(String text) {
        this.textBuffer.append(text);
    }
    
    public void setBody (List<PrologClause> body) {
        this.body = body;
    }
    
    public void appendBody(PrologClause clause) {
        body.add(clause);
    }
    
    public Integer getArity() {
        return arity;
    }

    public List<PrologClause> getBody() {
        return body;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public static PrologClause findClause(List<PrologClause> clauses, PrologClause clause) {
        
        for (PrologClause c : clauses) {
            if (c.getName().equals(clause.getName())) {
                if (c.getArity().equals(clause.getArity())) {
                    return c;
                }
            }
        }
        return null;
    }
}
