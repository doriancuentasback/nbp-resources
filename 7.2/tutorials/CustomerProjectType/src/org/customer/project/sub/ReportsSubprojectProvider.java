package org.customer.project.sub;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.swing.event.ChangeListener;
import org.customer.project.CustomerProject;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectManager;
import org.netbeans.spi.project.SubprojectProvider;
import org.openide.filesystems.FileObject;
import org.openide.util.Exceptions;

public class ReportsSubprojectProvider implements SubprojectProvider {

    private final CustomerProject project;

    public ReportsSubprojectProvider(CustomerProject project) {
        this.project = project;
    }

    @Override
    public Set<? extends Project> getSubprojects() {
        return loadProjects(project.getProjectDirectory());
    }

    private Set loadProjects(FileObject dir) {
        Set newProjects = new HashSet();
        FileObject reportsFolder = dir.getFileObject("reports");
        if (reportsFolder != null) {
            for (FileObject childFolder : reportsFolder.getChildren()) {
                try {
                    Project subp = ProjectManager.getDefault().findProject(childFolder);
                    if (subp != null && subp instanceof ReportsSubProject) {
                        newProjects.add((ReportsSubProject) subp);
                    }
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                } catch (IllegalArgumentException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        }
        return Collections.unmodifiableSet(newProjects);
    }

    @Override
    public void addChangeListener(ChangeListener cl) {
    }

    @Override
    public void removeChangeListener(ChangeListener cl) {
    }
}
