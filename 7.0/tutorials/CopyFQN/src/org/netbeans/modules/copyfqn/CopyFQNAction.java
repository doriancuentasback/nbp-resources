package org.netbeans.modules.copyfqn;

import com.sun.source.tree.ClassTree;
import com.sun.source.util.TreePathScanner;
import java.io.IOException;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.EditorRegistry;
import org.netbeans.api.java.source.CompilationController;
import org.netbeans.api.java.source.CompilationInfo;
import org.netbeans.api.java.source.JavaSource;
import org.netbeans.api.java.source.JavaSource.Phase;
import org.netbeans.api.java.source.Task;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CookieAction;

public final class CopyFQNAction extends CookieAction {

    private static String kind;

    @Override
    protected void performAction(Node[] activatedNodes) {
        DataObject dataObject = activatedNodes[0].getLookup().lookup(org.openide.loaders.DataObject.class);
        FileObject fileObject = dataObject.getPrimaryFile();
        JavaSource javaSource = JavaSource.forFileObject(fileObject);
        if (javaSource == null) {
            StatusDisplayer.getDefault().setStatusText("Not a Java file: " + fileObject.getPath());
        } else {
            try {
                javaSource.runUserActionTask(new Task<CompilationController>() {

                    @Override
                    public void run(CompilationController compilationController) throws Exception {
                        compilationController.toPhase(Phase.ELEMENTS_RESOLVED);
                        Document document = compilationController.getDocument();
                        if (document != null) {
                            new MemberVisitor(compilationController).scan(compilationController.getCompilationUnit(), null);
                        } else {
                            StatusDisplayer.getDefault().setStatusText("The Java file is closed!");
                        }
                    }
                }, true);
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }

    private static class MemberVisitor extends TreePathScanner<Void, Void> {

        private CompilationInfo info;

        public MemberVisitor(CompilationInfo info) {
            this.info = info;
        }

        @Override
        public Void visitClass(ClassTree t, Void v) {
            JTextComponent editor = EditorRegistry.lastFocusedComponent();
            try {
                if (editor.getDocument() == info.getDocument()) {
                    int dot = editor.getCaret().getDot();
                    com.sun.source.util.TreePath tp = info.getTreeUtilities().pathFor(dot);
                    Element el = info.getTrees().getElement(tp);
                    if (el == null) {
                        StatusDisplayer.getDefault().setStatusText("Cannot resolve class!");
                    } else {
                        kind = el.getKind().toString();
                        JOptionPane.showMessageDialog(null, el.getSimpleName() + " (" + el.getKind().toString() + ")");
                    }
                }
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
            return null;
        }
    }

    @Override
    protected boolean enable(Node[] activatedNodes) {
        if (super.enable(activatedNodes)) {
            DataObject dataObject = activatedNodes[0].getLookup().lookup(org.openide.loaders.DataObject.class);
            FileObject fileObject = dataObject.getPrimaryFile();
            JavaSource javaSource = JavaSource.forFileObject(fileObject);
            if (javaSource == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    protected int mode() {
        return CookieAction.MODE_EXACTLY_ONE;
    }

@Override
public String getName() {
    return NbBundle.getMessage(CopyFQNAction.class, "CTL_CopyFQNAction", kind);
}

    @Override
    protected Class[] cookieClasses() {
        return new Class[]{
                    DataObject.class
                };
    }

    @Override
    protected String iconResource() {
        return "org/netbeans/modules/copyfqn/icon.png";
    }

    @Override
    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }
}
