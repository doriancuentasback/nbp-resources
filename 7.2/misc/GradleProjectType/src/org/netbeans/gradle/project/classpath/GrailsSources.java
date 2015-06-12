package org.netbeans.gradle.project.classpath;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.swing.Icon;
import javax.swing.event.ChangeListener;
import org.netbeans.api.java.project.JavaProjectConstants;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectManager;
import org.netbeans.api.project.SourceGroup;
import org.netbeans.api.project.Sources;
import org.netbeans.api.queries.SharabilityQuery;
import org.netbeans.api.queries.VisibilityQuery;
import org.openide.filesystems.FileChangeAdapter;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.filesystems.FileStateInvalidException;
import org.openide.filesystems.FileSystem;
import org.openide.filesystems.FileUtil;
import org.openide.util.ChangeSupport;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;

/**
 *
 * @author Martin Adamek
 */
public class GrailsSources extends FileChangeAdapter implements Sources {

    //  those are dirs in project root we already know and create specific source groups
    public static final List KNOWN_FOLDERS = Arrays.asList(
            "docs", // NOI18N
            "grails-app", // NOI18N
            "lib", // NOI18N
            "scripts", // NOI18N
            "src", // NOI18N
            "test", // NOI18N
            "web-app" // NOI18N
            );

    public static final List KNOWN_OR_IGNORED_FOLDERS_IN_TEST = Arrays.asList(
            "unit", // NOI18N
            "integration", // NOI18N
            "reports" // NOI18N
            );
    
    private final FileObject projectDir;
    private final Project project;
    private final ChangeSupport changeSupport = new ChangeSupport(this);

    private GrailsSources(Project project) {
        this.project = project;
        this.projectDir = project.getProjectDirectory();
    }

    public static GrailsSources create(Project project) {
        GrailsSources sources = new GrailsSources(project);
        sources.startFSListener();
        return sources;
    }

    private void startFSListener() {
        try {
            FileSystem fs = projectDir.getFileSystem();
            fs.addFileChangeListener(FileUtil.weakFileChangeListener(this, fs));
        } catch (FileStateInvalidException x) {
            Exceptions.printStackTrace(x);
        }
    }

    @Override
    public SourceGroup[] getSourceGroups(String type) {
        List<Group> result = new ArrayList<Group>();
        if (Sources.TYPE_GENERIC.equals(type)) {
            addGroup(projectDir, projectDir.getName(), result);
        } else if (JavaProjectConstants.SOURCES_TYPE_JAVA.equals(type)) {
            addGroup(SourceCategory.SRC_JAVA, "LBL_SrcJava", result);
            addUnknownGroups(KNOWN_OR_IGNORED_FOLDERS_IN_TEST, result, "test", "LBL_SomeTests");
        }
        return result.toArray(new SourceGroup[result.size()]);
    }

    @Override
    public void addChangeListener(ChangeListener listener) {
        changeSupport.addChangeListener(listener);
    }

    @Override
    public void removeChangeListener(ChangeListener listener) {
        changeSupport.removeChangeListener(listener);
    }

    @Override
    public void fileDeleted(FileEvent fe) {
        changeSupport.fireChange();
    }

    @Override
    public void fileFolderCreated(FileEvent fe) {
        changeSupport.fireChange();
    }

    @Override
    public void fileRenamed(FileRenameEvent fe) {
        changeSupport.fireChange();
    }

    private void addUnknownGroups(Collection<String> alreadyKnown, List<Group> result,
            String relativePath, String bundleKey) {
        FileObject folder = projectDir.getFileObject(relativePath);
        if (folder != null) {
            for (FileObject child : folder.getChildren()) {
                if (child.isFolder()
                        && VisibilityQuery.getDefault().isVisible(child)
                        && !alreadyKnown.contains(child.getName())) {

                    String name = child.getName();
                    String localizedName = Character.toUpperCase(name.charAt(0)) + name.substring(1);
                    if (bundleKey != null) {
                        localizedName = NbBundle.getMessage(GrailsSources.class, bundleKey, localizedName);
                    }
                    addGroup(child, localizedName, result);
                }
            }
        }
    }

    private void addGroup(FileObject fileObject, String displayName, List<Group> list) {
        if (fileObject != null) {
            list.add(new Group(fileObject, displayName));
        }
    }

    private void addGroup(SourceCategory sourceCategory, String bundleLabel, List<Group> list) {
        FileObject fileObject = projectDir.getFileObject(sourceCategory.getRelativePath());
        if (fileObject != null) {
            list.add(new Group(fileObject, NbBundle.getMessage(GrailsSources.class, bundleLabel)));
        }
    }

    private final class Group implements SourceGroup {

        private final FileObject loc;
        private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
        private final String displayName;

        public Group(FileObject loc, String displayName) {
            this.loc = loc;
            this.displayName = displayName;
        }

        @Override
        public FileObject getRootFolder() {
            return loc;
        }

        @Override
        public String getName() {
            String location = loc.getPath();
            return location.length() > 0 ? location : "generic"; // NOI18N
        }

        @Override
        public String getDisplayName() {
            return displayName;
        }

        @Override
        public Icon getIcon(boolean opened) {
            return null;
        }

        @Override
        public boolean contains(FileObject file) throws IllegalArgumentException {
            if (file == loc) {
                return true;
            }
            String path = FileUtil.getRelativePath(loc, file);
            if (path == null) {
                throw new IllegalArgumentException();
            }
            if (file.isFolder()) {
                path += File.separator; // NOI18N
            }
            if (file.isFolder() && file != projectDir && ProjectManager.getDefault().isProject(file)) {
                // #67450: avoid actually loading the nested project.
                return false;
            }
            File f = FileUtil.toFile(file);
            if (f != null && SharabilityQuery.getSharability(f) == SharabilityQuery.NOT_SHARABLE) {
                return false;
            } // else MIXED, UNKNOWN, or SHARABLE; or not a disk file
            return true;
        }

        @Override
        public void addPropertyChangeListener(PropertyChangeListener l) {
            pcs.addPropertyChangeListener(l);
        }

        @Override
        public void removePropertyChangeListener(PropertyChangeListener l) {
            pcs.removePropertyChangeListener(l);
        }

        @Override
        public String toString() {
            return "GrailsSources.Group[name=" + getName() + ",rootFolder=" + getRootFolder() + "]"; // NOI18N
        }
    }
}
