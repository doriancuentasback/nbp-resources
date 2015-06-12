package org.qb.domain;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.beans.IntrospectionException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectManager;
import org.netbeans.api.project.ui.OpenProjects;
import org.netbeans.modules.image.ImageOpenSupport;
import org.openide.awt.StatusDisplayer;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup.Result;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.NbPreferences;
import org.openide.util.Utilities;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;

public class QBChildFactory extends ChildFactory.Detachable<FileObject> implements LookupListener {

    private String rootPath;
    private boolean showHidden;
    private boolean previewImages;
    private boolean showLarge;
    private Result<File> stringResult;

    public QBChildFactory(String rootPath, boolean showHidden, boolean previewImages, boolean showLarge) {
        this.rootPath = rootPath;
        this.showHidden = showHidden;
        this.showLarge = showLarge;
        this.previewImages = previewImages;
    }

    @Override
    protected void addNotify() {
        stringResult = Utilities.actionsGlobalContext().lookupResult(File.class);
        stringResult.addLookupListener(this);
    }

    @Override
    protected void removeNotify() {
        stringResult.removeLookupListener(this);
    }

    @Override
    protected boolean createKeys(final List list) {
        File root = new File(rootPath);
        if (root.exists()) {
            File normalizedPath = FileUtil.normalizeFile(new File(rootPath));
            FileObject rootFO = FileUtil.toFileObject(normalizedPath);
            if (rootFO.getChildren() != null) {
                FileObject[] fos = rootFO.getChildren();
                List<String> names = new ArrayList();
                for (int i = 0; i < fos.length; i++) {
                    if (!showHidden && !fos[i].getName().startsWith(".")) {
                        names.add(fos[i].getName());
                    } else if (showHidden) {
                        names.add(fos[i].getName());
                    }
                }
                Collections.sort(names);
                for (String name : names) {
                    for (FileObject fo : fos) {
                        if (fo.getName().equals(name)) {
                            list.add(fo);
                        }
                    }
                }
            }
        } else {
            StatusDisplayer.getDefault().setStatusText(root + " does not exist.");
        }

        return true;
    }

    @Override
    protected Node createNodeForKey(FileObject key) {
        BeanNode node = null;
        try {
            node = new QBNode(key, new InstanceContent());
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }

    @Override
    public void resultChanged(LookupEvent ev) {
        Result<File> foundStrings = (Result<File>) ev.getSource();
        if (foundStrings.allInstances().iterator().hasNext()) {
            rootPath = foundStrings.allInstances().iterator().next().getPath();
        }
        refresh(true);
    }

    public class QBNode extends BeanNode {

        Image folder = ImageUtilities.loadImage("org/qb/resources/folder.png");
        Image file = ImageUtilities.loadImage("org/qb/resources/file.png");
//        Image statusOne = ImageUtilities.loadImage("org/qb/resources/moz-screenshot-2.png");
        Image statusOne = ImageUtilities.loadImage("org/qb/resources/nb.png");
        Image statusTwo = ImageUtilities.loadImage("org/qb/resources/moz-screenshot-3.png");
        private final InstanceContent ic;
        private final Map<Image, Image> cache = new WeakHashMap<Image, Image>();

        public QBNode(FileObject bean, InstanceContent ic) throws IntrospectionException {
            super(bean, Children.LEAF, new AbstractLookup(ic));
            this.ic = ic;
            ic.add(bean);
        }

        @Override
        public String getDisplayName() {
            String displayName = null;
            FileObject bean = getLookup().lookup(FileObject.class);
            if (!showLarge) {
                if (bean.getNameExt().length() > 6) {
                    displayName = bean.getNameExt().substring(0, 6) + "...";
                } else {
                    displayName = bean.getNameExt();
                }
            } else {
                displayName = bean.getNameExt();
            }
            return displayName;
        }

        @Override
        public Image getIcon(int type) {
            Image image = null;
            FileObject fo = getLookup().lookup(FileObject.class);
            if (fo.isFolder()) {
                image = folder;
                FileObject[] foKids = fo.getChildren();
                for (FileObject folderKid : foKids) {
                    if (folderKid.getName().equals("nbproject")) {
                        image = ImageUtilities.mergeImages(folder, statusOne,
                                0, 0);
                    }
                }
            } else {
                image = file;
                if (previewImages) {
                    try {
                        DataObject dobj = DataObject.find(fo);
                        if (dobj.getLookup().lookup(ImageOpenSupport.class) != null) {
                            String path = fo.getPath();
                            Image i = Toolkit.getDefaultToolkit().getImage(path);
                            image = getThumbnail(i);
                        }
                    } catch (DataObjectNotFoundException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
            }
            return image;
        }

        @Override
        public Action[] getActions(boolean context) {
            return new Action[]{};
        }

        @Override
        public Action getPreferredAction() {
            return new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    FileObject fo = getLookup().lookup(FileObject.class);
                    NbPreferences.forModule(QBChildFactory.class).put("rootPath", fo.getPath());
                    if (fo.isFolder()) {
                        ic.add(FileUtil.toFile(fo));
                        FileObject[] foKids = fo.getChildren();
                        for (FileObject folderKid : foKids) {
                            if (folderKid.getName().equals("nbproject")) {
                                try {
                                    Project findProject = ProjectManager.getDefault().findProject(fo);
                                    OpenProjects.getDefault().open(new Project[]{findProject}, false, true);
//                                                    TopComponent tc = WindowManager.getDefault().findTopComponent("projectTabLogical_tc");
//                                                    tc.open();
//                                                    tc.requestActive();
                                } catch (IOException ex) {
                                    Exceptions.printStackTrace(ex);
                                } catch (IllegalArgumentException ex) {
                                    Exceptions.printStackTrace(ex);
                                }
                            }
                        }
                    } else {
                        try {
                            DataObject dobj = DataObject.find(fo);
                            OpenCookie oc = dobj.getCookie(OpenCookie.class);
                            if (oc != null) {
                                oc.open();
                            } else {
                                StatusDisplayer.getDefault().setStatusText("No app found for opening this file!");
                            }
                        } catch (DataObjectNotFoundException ex) {
                            Exceptions.printStackTrace(ex);
                        }
                    }
                }
            };
        }

        private Image getThumbnail(Image image) {
            Image imageIcon = cache.get(image);
            if (imageIcon == null) {
                ImageIcon thumb = new ImageIcon(
                        image.getScaledInstance(
                        48, 48, Image.SCALE_SMOOTH));
                imageIcon = ImageUtilities.icon2Image(thumb);
                cache.put(image, imageIcon);
            }
            return imageIcon;
        }
    }
}
