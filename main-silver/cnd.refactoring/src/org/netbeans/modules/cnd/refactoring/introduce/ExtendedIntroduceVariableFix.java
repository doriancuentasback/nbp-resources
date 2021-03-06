/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.cnd.refactoring.introduce;

import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.netbeans.modules.cnd.api.model.CsmOffsetable;
import org.netbeans.modules.cnd.api.model.deep.CsmStatement;
import org.netbeans.modules.cnd.refactoring.actions.RefactoringKind;
import org.netbeans.modules.cnd.refactoring.hints.IntroduceVariableFix;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.util.NbBundle;
import org.openide.util.Pair;

final class ExtendedIntroduceVariableFix extends IntroduceVariableFix {
    private final int numDuplicates;
    private final RefactoringKind kind;
    private boolean replaceOccurrences = false;
    private final List<Pair<Integer, Integer>> occurrences;
    private String type;

    public ExtendedIntroduceVariableFix(CsmStatement st, CsmOffsetable expression, List<Pair<Integer, Integer>> occurrences, Document doc, JTextComponent comp, FileObject fo) {
        super(st, expression, doc, comp, fo);
        kind = RefactoringKind.CREATE_VARIABLE;
        this.occurrences = occurrences;
        numDuplicates = occurrences.size();
    }

    public String getKeyExt() {
        switch (kind) {
            case CREATE_CONSTANT:
                return "IntroduceConstant"; //NOI18N
            case CREATE_VARIABLE:
                return "IntroduceVariable"; //NOI18N
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public String getText() {
        return NbBundle.getMessage(ExtendedIntroduceVariableFix.class, "FIX_" + getKeyExt()); //NOI18N
    }

    @Override
    protected boolean isInstanceRename() {
        return false;
    }

    @Override
    protected List<Pair<Integer, Integer>> replaceOccurrences() {
        if (!replaceOccurrences) {
            return Collections.emptyList();
        } else {
            return occurrences;
        }
    }

    @Override
    protected String getType() {
        return type;
    }

    @Override
    protected String suggestName() {
        String guessedName = super.suggestName();
        type = super.getType();
        JButton btnOk = new JButton(NbBundle.getMessage(ExtendedIntroduceVariableFix.class, "LBL_Ok"));
        JButton btnCancel = new JButton(NbBundle.getMessage(ExtendedIntroduceVariableFix.class, "LBL_Cancel"));
        IntroduceVariablePanel panel = new IntroduceVariablePanel(numDuplicates, type, guessedName, kind == RefactoringKind.CREATE_CONSTANT, btnOk);
        String caption = NbBundle.getMessage(ExtendedIntroduceVariableFix.class, "CAP_" + getKeyExt()); //NOI18N
        DialogDescriptor dd = new DialogDescriptor(panel, caption, true, new Object[]{btnOk, btnCancel}, btnOk, DialogDescriptor.DEFAULT_ALIGN, null, null);
        if (DialogDisplayer.getDefault().notify(dd) != btnOk) {
            return null; //cancel
        }
        guessedName = panel.getVariableName();
        replaceOccurrences = panel.isReplaceAll();
        type = panel.getType();
        return guessedName;
    }
}

