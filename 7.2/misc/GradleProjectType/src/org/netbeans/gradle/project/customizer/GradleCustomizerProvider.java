package org.netbeans.gradle.project.customizer;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.gradle.project.GradleProject;
import org.netbeans.spi.project.ui.CustomizerProvider;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;

public class GradleCustomizerProvider implements CustomizerProvider {

    private final GradleProject project;
    public static final String CUSTOMIZER_FOLDER_PATH = 
            "Projects/org-gradle-project/Customizer";

    public GradleCustomizerProvider(GradleProject project) {
        this.project = project;
    }

    @Override
    public void showCustomizer() {
        OptionListener optionListener = new OptionListener(project);
        Dialog dialog = ProjectCustomizer.createCustomizerDialog(
                CUSTOMIZER_FOLDER_PATH,
                null,
                null,
                optionListener,
                null,
                null);
        dialog.setTitle(ProjectUtils.getInformation(project).getDisplayName());
        dialog.setVisible(true);
    }

    private class OptionListener extends WindowAdapter implements ActionListener {

        private GradleProject project;

        OptionListener(GradleProject project) {
            this.project = project;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Close and dispose the dialog
        }

        @Override
        public void windowClosed(WindowEvent e) {
        }

        @Override
        public void windowClosing(WindowEvent e) {
            // Close and dispose the dialog
        }
        
    }
    
}
