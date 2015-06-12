/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.netbeans.modules.demo;

import com.sun.source.tree.*;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeKind;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.netbeans.api.java.source.JavaSource.Phase;
import org.netbeans.api.java.source.*;
import org.netbeans.spi.editor.codegen.CodeGenerator;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

public class DemoCodeGenerator implements CodeGenerator {

    JTextComponent textComp;

    /**
     * 
     * @param context containing JTextComponent and possibly other items registered by {@link CodeGeneratorContextProvider}
     */
    private DemoCodeGenerator(Lookup context) { // Good practice is not to save Lookup outside ctor
        textComp = context.lookup(JTextComponent.class);
    }

    public static class Factory implements CodeGenerator.Factory {

        public List<? extends CodeGenerator> create(Lookup context) {
            return Collections.singletonList(new DemoCodeGenerator(context));
        }
    }

    /**
     * The name which will be inserted inside Insert Code dialog
     */
    public String getDisplayName() {
        return "Sample Generator";
    }

    /**
     * This will be invoked when user chooses this Generator from Insert Code
     * dialog
     */
    public void invoke() {
        try {
            Document doc = textComp.getDocument();
            JavaSource javaSource = JavaSource.forDocument(doc);
            CancellableTask task = new CancellableTask<WorkingCopy>() {

                public void run(WorkingCopy workingCopy) throws IOException {
                    workingCopy.toPhase(Phase.RESOLVED);
                    CompilationUnitTree cut = workingCopy.getCompilationUnit();
                    TreeMaker make = workingCopy.getTreeMaker();
                    for (Tree typeDecl : cut.getTypeDecls()) {
                        if (Tree.Kind.CLASS == typeDecl.getKind()) {
                            ClassTree clazz = (ClassTree) typeDecl;
                            ModifiersTree methodModifiers =
                                    make.Modifiers(Collections.<Modifier>singleton(Modifier.PUBLIC),
                                    Collections.<AnnotationTree>emptyList());
                            VariableTree parameter =
                                    make.Variable(make.Modifiers(Collections.<Modifier>singleton(Modifier.FINAL),
                                    Collections.<AnnotationTree>emptyList()),
                                    "arg0",
                                    make.Identifier("Object"),
                                    null);
                            TypeElement element = workingCopy.getElements().getTypeElement("java.io.IOException");
                            ExpressionTree throwsClause = make.QualIdent(element);
                            MethodTree newMethod =
                                    make.Method(methodModifiers,
                                    "writeExternal",
                                    make.PrimitiveType(TypeKind.VOID),
                                    Collections.<TypeParameterTree>emptyList(),
                                    Collections.singletonList(parameter),
                                    Collections.<ExpressionTree>singletonList(throwsClause),
                                    "{ throw new UnsupportedOperationException(\"Not supported yet.\") }",
                                    null);
                            ClassTree modifiedClazz = make.addClassMember(clazz, newMethod);
                            workingCopy.rewrite(clazz, modifiedClazz);
                        }
                    }
                }

                public void cancel() {
                }
            };
            ModificationResult result = javaSource.runModificationTask(task);
            result.commit();
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }
    
}
