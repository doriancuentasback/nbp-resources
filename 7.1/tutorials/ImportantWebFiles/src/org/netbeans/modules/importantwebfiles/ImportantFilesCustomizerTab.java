package org.netbeans.modules.importantwebfiles;

import java.awt.BorderLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.netbeans.spi.project.ui.support.ProjectCustomizer.Category;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;

@NbBundle.Messages({
    "LBL_Config_Murphy1=Murphy 1",
    "LBL_Config_Murphy2=Murphy 2 "})
public class ImportantFilesCustomizerTab implements ProjectCustomizer.CompositeCategoryProvider {

    private String name;

    @ProjectCustomizer.CompositeCategoryProvider.Registration(projectType = "org-netbeans-modules-web-project", position = 100)
    public static ImportantFilesCustomizerTab createMurphy1() {
        return new ImportantFilesCustomizerTab(Bundle.LBL_Config_Murphy1());
    }

    @ProjectCustomizer.CompositeCategoryProvider.Registration(projectType = "org-netbeans-modules-web-project", position = 110)
    public static ImportantFilesCustomizerTab createMurphy2() {
        return new ImportantFilesCustomizerTab(Bundle.LBL_Config_Murphy2());
    }

    private ImportantFilesCustomizerTab(String name) {
        this.name = name;
    }

    @Override
    public Category createCategory(Lookup lkp) {
        ProjectCustomizer.Category toReturn = null;
        if (Bundle.LBL_Config_Murphy1().equals(name)) {
            toReturn = ProjectCustomizer.Category.create(
                    Bundle.LBL_Config_Murphy1(),
                    Bundle.LBL_Config_Murphy1(),
                    null);
        } else {
            toReturn = ProjectCustomizer.Category.create(
                    Bundle.LBL_Config_Murphy2(),
                    Bundle.LBL_Config_Murphy2(), // NOI18N
                    null);
        }
        return toReturn;
    }

    @Override
    public JComponent createComponent(Category category, Lookup lkp) {
        String nm = category.getName();
        if (Bundle.LBL_Config_Murphy1().equals(nm)) {
            JPanel jPanel1 = new JPanel();
            jPanel1.setLayout(new BorderLayout());
            jPanel1.add(new JLabel(Bundle.LBL_Config_Murphy1()), BorderLayout.CENTER);
            return jPanel1;
        } else {
            JPanel jPanel2 = new JPanel();
            jPanel2.setLayout(new BorderLayout());
            jPanel2.add(new JLabel(Bundle.LBL_Config_Murphy2()), BorderLayout.CENTER);
            return jPanel2;
        }
    }

}