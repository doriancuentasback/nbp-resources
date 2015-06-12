package org.netbeans.gradle.subproject;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.swing.event.ChangeListener;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectManager;
import org.netbeans.gradle.project.GradleProject;
import org.netbeans.spi.project.SubprojectProvider;
import org.openide.filesystems.FileObject;
import org.openide.util.Exceptions;

public class GradleSubprojectProvider implements SubprojectProvider {

    private final GradleProject project;

    public GradleSubprojectProvider(GradleProject project) {
        this.project = project;
    }

    @Override
    public Set<? extends Project> getSubprojects() {
        return loadProjects(project.getProjectDirectory());
    }

    private Set<GradleSubProject> loadProjects(FileObject dir) {
        Set<GradleSubProject> newProjects = new HashSet<GradleSubProject>();
        FileObject[] appFolders = dir.getChildren();
        for (FileObject appFolder : appFolders) {
            if (appFolder.getFileObject("/src/main/java") != null) {
                try {
                    Project subp = ProjectManager.getDefault().findProject(appFolder);
                    if (subp != null && subp instanceof GradleSubProject) {
                        newProjects.add((GradleSubProject) subp);
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
