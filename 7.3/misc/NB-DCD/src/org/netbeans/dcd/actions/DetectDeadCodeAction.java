package org.netbeans.dcd.actions;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.netbeans.api.project.Project;
import org.netbeans.dcd.Parameters;
import org.netbeans.dcd.ui.DeadCodeDetectorUI;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Project",
        id = "org.netbeans.dcd.actions.DetectDeadCodeAction")
@ActionRegistration(
        displayName = "#CTL_DetectDeadCodeAction")
@ActionReferences({
    @ActionReference(path = "Projects/Actions", position = 1000),
//    @ActionReference(path = "Projects/org-netbeans-modules-apisupport-project-suite/Actions", position = 1000),
})
@Messages("CTL_DetectDeadCodeAction=Detect Dead Code")
public final class DetectDeadCodeAction implements ActionListener {

    private final List<Project> context;

    public DetectDeadCodeAction(List<Project> context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        List<File> directories = new ArrayList<File>();
        for (Project project : context) {
            directories.add(FileUtil.toFile(project.getProjectDirectory()));
        }
        Parameters p = new Parameters(
                directories, 
                true, 
                false, 
                false, 
                false, 
                null, 
                null);
        DeadCodeDetectorUI dcdui = new DeadCodeDetectorUI(p);
        DialogDescriptor dd = new DialogDescriptor(dcdui, "Dead Code Detector");
        Dialog dialog = DialogDisplayer.getDefault().createDialog(dd);
        dialog.setVisible(true);
    }

}
