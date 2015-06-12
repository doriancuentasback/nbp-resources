package org.netbeans.modules.importantwebfiles;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.netbeans.spi.project.ui.support.ProjectCustomizer.Category;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;

public class ImportantFilesCustomizerTab implements ProjectCustomizer.CompositeCategoryProvider {

    private final String name;

    private ImportantFilesCustomizerTab(String name) {
        this.name = name;
    }

    @Override
    public Category createCategory(Lookup lkp) {
        Category category = ProjectCustomizer.Category.create(name, name, null);
        category.setOkButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "OK clicked...");
            }
        });
        return category;
    }

    @Override
    public JComponent createComponent(Category category, Lookup lkp) {
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(new JLabel(name), BorderLayout.CENTER);
        return jPanel1;
    }

    @NbBundle.Messages({"LBL_Config=Configuration"})
    @ProjectCustomizer.CompositeCategoryProvider.Registration(
        projectType = "org-netbeans-modules-web-project",
    position = 10)
    public static ImportantFilesCustomizerTab createMyDemoConfigurationTab() {
        return new ImportantFilesCustomizerTab(Bundle.LBL_Config());
    }
}