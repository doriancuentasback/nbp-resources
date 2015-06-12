package org.netbeans.gradle.subproject;

import java.awt.Image;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.gradle.project.classpath.ClassPathProviderImpl;
import org.netbeans.gradle.project.classpath.SourceRoots;
import org.netbeans.spi.project.ProjectState;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.netbeans.spi.project.ui.ProjectOpenedHook;
import org.netbeans.spi.project.ui.support.CommonProjectActions;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;

public class GradleSubProject implements Project {

    private final ClassPathProviderImpl cpProvider;
    private final FileObject projectDir;
    private final ProjectState state;
    private Lookup lkp;
    private SourceRoots sourceRoots;
    private SourceRoots testRoots;

    GradleSubProject(FileObject dir, ProjectState state) {
        this.projectDir = dir;
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
                        new Info(),
                        new OpenHook(),
                        cpProvider,
                        org.netbeans.gradle.project.classpath.GrailsSources.create(this),
                        new SrcSubProjectLogicalView(this)
                    });
        }
        return lkp;
    }

    class SrcSubProjectLogicalView implements LogicalViewProvider {

        @StaticResource
        public static final String SUB_ICON = "org/netbeans/gradle/subproject/icon.png";
        private final GradleSubProject project;

        public SrcSubProjectLogicalView(GradleSubProject project) {
            this.project = project;
        }

        @Override
        public Node createLogicalView() {
            try {
                //Obtain the project directory's node:
                FileObject projectDirectory = project.getProjectDirectory();
                DataFolder projectFolder = DataFolder.findFolder(projectDirectory);
                Node nodeOfProjectFolder = projectFolder.getNodeDelegate();
                //Decorate the project directory's node:
                return new ProjectNode(nodeOfProjectFolder, project);
            } catch (DataObjectNotFoundException donfe) {
                Exceptions.printStackTrace(donfe);
                //Fallback-the directory couldn't be created -
                //read-only filesystem or something evil happened
                return new AbstractNode(Children.LEAF);
            }
        }

        private final class ProjectNode extends FilterNode {

            final GradleSubProject project;

            public ProjectNode(Node node, GradleSubProject project) throws DataObjectNotFoundException {
                super(node,
                        NodeFactorySupport.createCompositeChildren(project, "Projects/org-gradle-subproject/Nodes"),
                        new ProxyLookup(
                        new Lookup[]{
                            Lookups.singleton(project),
                            node.getLookup()
                        }));
                this.project = project;
            }

            @Override
            public Action[] getActions(boolean arg0) {
                return new Action[]{
                            CommonProjectActions.newFileAction(),
                            CommonProjectActions.copyProjectAction(),
                            CommonProjectActions.deleteProjectAction(),
                            CommonProjectActions.customizeProjectAction(),
                            CommonProjectActions.closeProjectAction()
                        };
            }

            @Override
            public Image getIcon(int type) {
                return ImageUtilities.loadImage(SUB_ICON);
            }

            @Override
            public Image getOpenedIcon(int type) {
                return getIcon(type);
            }

            @Override
            public String getDisplayName() {
                return project.getProjectDirectory().getName();
            }
        }

        @Override
        public Node findPath(Node root, Object target) {
            //leave unimplemented for now
            return null;
        }
    }

    private final class Info implements ProjectInformation {

        @StaticResource
        public static final String SUB_ICON = "org/netbeans/gradle/subproject/icon.png";

        @Override
        public Icon getIcon() {
            return new ImageIcon(ImageUtilities.loadImage(SUB_ICON));
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
            return GradleSubProject.this;
        }
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
}
