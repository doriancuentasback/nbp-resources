package org.netbeans.gradle.project.classpath;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.netbeans.api.queries.VisibilityQuery;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;

/**
 *
 * @author Martin Adamek & Geertjan Wielenga
 */
public class SourceRoots {

    private final FileObject projectRoot;

    public SourceRoots(FileObject projectRoot) {
        this.projectRoot = projectRoot;
    }

    public FileObject[] getRoots() {
        List<FileObject> result = new ArrayList<FileObject>();
        addGradleSourceRoots(projectRoot, result);
        return result.toArray(new FileObject[result.size()]);
    }

    public List<URL> getRootURLs() {
        List<URL> urls = new ArrayList<URL>();
        try {
            for (FileObject fileObject : getRoots()) {
                urls.add(FileUtil.toFile(fileObject).toURI().toURL());
            }
        } catch (MalformedURLException murle) {
            Exceptions.printStackTrace(murle);
        }
        return urls;
    }

    private void addGradleSourceRoots(FileObject projectRoot, List<FileObject> result) {
        addRoot(projectRoot, SourceCategory.SRC_JAVA, result);
        for (FileObject child : projectRoot.getChildren()) {
            if (child.isFolder()
                    && VisibilityQuery.getDefault().isVisible(child)
                    && !GrailsSources.KNOWN_FOLDERS.contains(child.getName())) {
                result.add(child);
            }
        }
    }

    private static void addRoot(FileObject projectRoot, SourceCategory category, List<FileObject> roots) {
        FileObject root = projectRoot.getFileObject(category.getRelativePath());
        if (root != null) {
            roots.add(root);
        }
    }

}
