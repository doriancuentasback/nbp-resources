package org.netbeans.gradle.project;

import java.awt.EventQueue;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.gradle.tooling.BuildLauncher;
import org.gradle.tooling.GradleConnector;
import org.gradle.tooling.ProjectConnection;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.gradle.project.classpath.ClassPathProviderImpl;
import org.netbeans.gradle.project.classpath.SourceRoots;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.CopyOperationImplementation;
import org.netbeans.spi.project.DeleteOperationImplementation;
import org.netbeans.spi.project.ProjectState;
import org.netbeans.spi.project.ui.ProjectOpenedHook;
import org.netbeans.spi.project.ui.support.DefaultProjectOperations;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Cancellable;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;

public class GradleProject implements Project {

    @StaticResource()
    private final String IMAGELOC = "org/netbeans/gradle/project/resources/gradle.png";
    private final FileObject projectDir;
    private final ProjectState state;
    private Lookup lkp;
    private final ClassPathProviderImpl cpProvider;
    private SourceRoots sourceRoots;
    private SourceRoots testRoots;

    public GradleProject(FileObject projectDir, ProjectState state) {
        this.projectDir = projectDir;
        this.state = state;
        this.cpProvider = new ClassPathProviderImpl(
                getSourceRoots(),
                getTestSourceRoots(),
                FileUtil.toFile(projectDir), this);
    }

    public synchronized SourceRoots getSourceRoots() {
        if (this.sourceRoots == null) { //Local caching, no project metadata access
            this.sourceRoots = new SourceRoots(projectDir); //NOI18N
        }
        return this.sourceRoots;
    }

    public synchronized SourceRoots getTestSourceRoots() {
        if (this.testRoots == null) { //Local caching, no project metadata access
            this.testRoots = new SourceRoots(projectDir); //NOI18N
        }
        return this.testRoots;
    }

    @Override
    public FileObject getProjectDirectory() {
        return projectDir;
    }

    @Override
    public Lookup getLookup() {
        if (lkp == null) {
            lkp = Lookups.fixed(new Object[]{
                        this,
                        state, //allow outside code to mark the project as needing saving
                        new GradleProjectInformation(), //Project information implementation
                        new GradleActionProvider(), //Provides standard actions like Build and Clean
                        new OpenHook(),
                        new GradleProjectDeleteOperation(),
                        new GradleProjectCopyOperation(this),
                        new org.netbeans.gradle.project.customizer.GradleCustomizerProvider(this),
                        new GradleProjectLogicalViewProvider(this), //Logical view of project implementation
                        cpProvider,
                        org.netbeans.gradle.project.classpath.GrailsSources.create(this),
                        new org.netbeans.gradle.subproject.GradleSubprojectProvider(this)
                    });
        }
        return lkp;
    }

    private class OpenHook extends ProjectOpenedHook {
        //private org.netbeans.modules.gsfpath.api.classpath.ClassPath cp;
        @Override
        protected void projectOpened() {
            ClassPath[] sourceClasspaths = cpProvider.getProjectClassPaths(ClassPath.SOURCE);
            GlobalPathRegistry.getDefault().register(ClassPath.BOOT, cpProvider.getProjectClassPaths(ClassPath.BOOT));
            GlobalPathRegistry.getDefault().register(ClassPath.COMPILE, cpProvider.getProjectClassPaths(ClassPath.COMPILE));
            GlobalPathRegistry.getDefault().register(ClassPath.SOURCE, sourceClasspaths);

//            // GSF classpath
//            List<FileObject> roots = new ArrayList<FileObject>();
//            for (ClassPath classPath : sourceClasspaths) {
//                roots.addAll(Arrays.asList(classPath.getRoots()));
//            }
//            cp = ClassPathSupport.createClassPath(roots.toArray(new FileObject[roots.size()]));
//            org.netbeans.modules.gsfpath.api.classpath.GlobalPathRegistry.getDefault().register(
//                    org.netbeans.modules.gsfpath.api.classpath.ClassPath.SOURCE,
//                    new org.netbeans.modules.gsfpath.api.classpath.ClassPath[] { cp });
        }

        @Override
        protected void projectClosed() {
            GlobalPathRegistry.getDefault().unregister(ClassPath.BOOT, cpProvider.getProjectClassPaths(ClassPath.BOOT));
            GlobalPathRegistry.getDefault().unregister(ClassPath.COMPILE, cpProvider.getProjectClassPaths(ClassPath.COMPILE));
            GlobalPathRegistry.getDefault().unregister(ClassPath.SOURCE, cpProvider.getProjectClassPaths(ClassPath.SOURCE));

//            // GSF classpath
//            if (cp != null) {
//                org.netbeans.modules.gsfpath.api.classpath.GlobalPathRegistry.getDefault().unregister(
//                        org.netbeans.modules.gsfpath.api.classpath.ClassPath.SOURCE,
//                        new org.netbeans.modules.gsfpath.api.classpath.ClassPath[] { cp });
//            }
        }
    }

    private final class GradleActionProvider implements ActionProvider {

        private String[] supported = new String[]{
            ActionProvider.COMMAND_RUN,
            ActionProvider.COMMAND_DELETE,
            ActionProvider.COMMAND_COPY,};

        @Override
        public String[] getSupportedActions() {
            return supported;
        }

        @Override
        public void invokeAction(String string, Lookup lookup) throws IllegalArgumentException {
            if (string.equalsIgnoreCase(ActionProvider.COMMAND_DELETE)) {
                DefaultProjectOperations.performDefaultDeleteOperation(GradleProject.this);
            }
            if (string.equalsIgnoreCase(ActionProvider.COMMAND_RUN)) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        ProgressHandle h = ProgressHandleFactory.createHandle("Running...", new Cancellable() {
                            @Override
                            public boolean cancel() {
                                return true;
                            }
                        });
                        h.start();
                        GradleConnector gradleConnector = GradleConnector.newConnector();
                        gradleConnector.forProjectDirectory(FileUtil.toFile(getProjectDirectory()));
                        ProjectConnection projectConnection = gradleConnector.connect();
                        BuildLauncher buildLauncher = projectConnection.newBuild();
                        buildLauncher.forTasks("run");
                        buildLauncher.run();
                        h.finish();
                    }
                });
            }
            if (string.equalsIgnoreCase(ActionProvider.COMMAND_COPY)) {
                DefaultProjectOperations.performDefaultCopyOperation(GradleProject.this);
            }
        }

        @Override
        public boolean isActionEnabled(String command, Lookup lookup) throws IllegalArgumentException {
            if ((command.equals(ActionProvider.COMMAND_DELETE))) {
                return true;
            } else if ((command.equals(ActionProvider.COMMAND_COPY))) {
                return true;
            } else if ((command.equals(ActionProvider.COMMAND_RUN))) {
                return true;
            } else {
                throw new IllegalArgumentException(command);
            }
        }
    }

    private final class GradleProjectDeleteOperation implements DeleteOperationImplementation {

        @Override
        public void notifyDeleting() throws IOException {
        }

        @Override
        public void notifyDeleted() throws IOException {
        }

        @Override
        public List<FileObject> getMetadataFiles() {
            List<FileObject> dataFiles = new ArrayList<FileObject>();
            return dataFiles;
        }

        @Override
        public List<FileObject> getDataFiles() {
            List<FileObject> dataFiles = new ArrayList<FileObject>();
            return dataFiles;
        }
    }

    private final class GradleProjectCopyOperation implements CopyOperationImplementation {

        private final GradleProject project;
        private final FileObject projectDir;

        public GradleProjectCopyOperation(GradleProject project) {
            this.project = project;
            this.projectDir = project.getProjectDirectory();
        }

        @Override
        public List<FileObject> getMetadataFiles() {
            return Collections.EMPTY_LIST;
        }

        @Override
        public List<FileObject> getDataFiles() {
            return Collections.EMPTY_LIST;
        }

        @Override
        public void notifyCopying() throws IOException {
        }

        @Override
        public void notifyCopied(Project arg0, File arg1, String arg2) throws IOException {
        }
    }

    private final class GradleProjectInformation implements ProjectInformation {

        @Override
        public Icon getIcon() {
            return new ImageIcon(ImageUtilities.loadImage(IMAGELOC));
        }

        @Override
        public String getName() {
            return getProjectDirectory().getName();
        }

        @Override
        public String getDisplayName() {
            return getName();
        }

        @Override
        public void addPropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }

        @Override
        public void removePropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }

        @Override
        public Project getProject() {
            return GradleProject.this;
        }
    }
}
