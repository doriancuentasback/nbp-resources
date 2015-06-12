package org.netbeans.dart.project;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;

/**
 *
 * @author geertjan
 */
public class DartProjectCustomizer implements ProjectCustomizer.CompositeCategoryProvider {

    private final String name;
    private Project project;

    private DartProjectCustomizer(String name) {
        this.name = name;
    }

    @Override
    public ProjectCustomizer.Category createCategory(Lookup lkp) {
        this.project = lkp.lookup(Project.class);
        return ProjectCustomizer.Category.create(name, name, null);
    }

    @Override
    public JComponent createComponent(ProjectCustomizer.Category ctgr, Lookup lkp) {
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new BorderLayout());
        JCheckBox cb = new JCheckBox("Enable Dart for" + ProjectUtils.getInformation(project).getDisplayName());
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        jPanel1.add(cb, BorderLayout.NORTH);
        return jPanel1;
    }

    @NbBundle.Messages({"LBL_Config=Dart"})
    @ProjectCustomizer.CompositeCategoryProvider.Registration(
            projectType = "org.netbeans.modules.web.clientproject",
            position = 450)
    public static DartProjectCustomizer createMyDemoConfigurationTab() {
        return new DartProjectCustomizer(Bundle.LBL_Config());
    }

}
