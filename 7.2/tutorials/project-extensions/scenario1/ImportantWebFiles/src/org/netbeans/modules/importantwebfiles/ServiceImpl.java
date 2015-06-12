package org.netbeans.modules.importantwebfiles;

import javax.swing.JOptionPane;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.spi.project.ProjectServiceProvider;

@ProjectServiceProvider(
        service=Service.class,
        projectType="org-netbeans-modules-web-project")
public class ServiceImpl extends Service {

    static {
        JOptionPane.showMessageDialog(null, "===> loading ServiceImpl");
    }
    private final Project p;

    public ServiceImpl(Project p) {
        this.p = p;
        JOptionPane.showMessageDialog(null, "===> new ServiceImpl on " + p);
    }

    @Override
    public String m() {
        return ProjectUtils.getInformation(p).getDisplayName();
    }
    
}