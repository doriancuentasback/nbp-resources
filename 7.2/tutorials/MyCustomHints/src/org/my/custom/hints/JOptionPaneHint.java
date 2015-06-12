package org.my.custom.hints;

import com.sun.source.tree.BlockTree;
import com.sun.source.tree.StatementTree;
import com.sun.source.util.TreePath;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.netbeans.api.java.source.CompilationInfo;
import org.netbeans.api.java.source.WorkingCopy;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.Fix;
import org.netbeans.spi.java.hints.ConstraintVariableType;
import org.netbeans.spi.java.hints.ErrorDescriptionFactory;
import org.netbeans.spi.java.hints.Hint;
import org.netbeans.spi.java.hints.HintContext;
import org.netbeans.spi.java.hints.JavaFix;
import org.netbeans.spi.java.hints.JavaFix.TransformationContext;
import org.netbeans.spi.java.hints.TriggerPattern;
import org.openide.util.NbBundle.Messages;

@Hint(displayName = "#DN_JOptionPaneHint",
description = "#DESC_JOptionPaneHint",
category = "general")
@Messages({
    "DN_JOptionPaneHint=JOptionPane.showMessageDialog",
    "DESC_JOptionPaneHint=Checks for JOptionPane.showMessageDialog."
})
public class JOptionPaneHint {

    @TriggerPattern(
            value = "$1.showMessageDialog",
    constraints =
    @ConstraintVariableType(
                    variable = "$1",
    type = "javax.swing.JOptionPane"))
    @Messages("ERR_JOptionPaneHint=Is JOptionPane.showMessageDialog needed?")
    public static ErrorDescription computeWarning(HintContext ctx) {
        Fix fix = new FixImpl(ctx.getInfo(), ctx.getPath()).toEditorFix();
        return ErrorDescriptionFactory.forName(
                ctx,
                ctx.getPath(),
                Bundle.ERR_JOptionPaneHint(),
                fix);
    }

    private static final class FixImpl extends JavaFix {

        public FixImpl(CompilationInfo info, TreePath tp) {
            super(info, tp);
        }

        @Override
        @Messages("FIX_ShowMessageDialogChecker=Remove the statement")
        protected String getText() {
            return Bundle.FIX_ShowMessageDialogChecker();
        }

        @Override
        protected void performRewrite(TransformationContext tc) throws Exception {
            WorkingCopy wc = tc.getWorkingCopy();
            TreePath statementPath = tc.getPath();
            TreePath blockPath = tc.getPath().getParentPath();
            while (!(blockPath.getLeaf() instanceof BlockTree)) {
                statementPath = blockPath;
                blockPath = blockPath.getParentPath();
                if (blockPath == null) {
                    return;
                }
            }
            BlockTree blockTree = (BlockTree) blockPath.getLeaf();
            List<? extends StatementTree> statements = blockTree.getStatements();
            List<StatementTree> newStatements = new ArrayList<StatementTree>();
            for (Iterator<? extends StatementTree> it = statements.iterator(); it.hasNext();) {
                StatementTree statement = it.next();
                if (statement != statementPath.getLeaf()) {
                    newStatements.add(statement);
                }
            }
            BlockTree newBlockTree = wc.getTreeMaker().Block(newStatements, blockTree.isStatic());
            wc.rewrite(blockTree, newBlockTree);
        }
    }
}
