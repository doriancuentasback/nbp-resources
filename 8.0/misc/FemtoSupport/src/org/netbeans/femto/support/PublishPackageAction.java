package org.netbeans.femto.support;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import org.netbeans.api.java.queries.AccessibilityQuery;
import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.spi.project.support.ant.AntProjectHelper;
import org.netbeans.spi.project.support.ant.EditableProperties;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.awt.Actions;
import org.openide.filesystems.FileLock;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;
import org.openide.util.WeakListeners;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "Edit",
        id = "org.netbeans.access.PublishPackageAction"
)
@ActionRegistration(
        lazy = false,
        displayName = "#CTL_PublishPackageAction"
)
@ActionReference(
        path = "Projects/package/Actions",
        position = 0)
@Messages("CTL_PublishPackageAction=Publish")
public final class PublishPackageAction extends AbstractAction implements Presenter.Popup, LookupListener {
    private DataObject context;
    private Lookup.Result<DataObject> dataObjects;
    private boolean publishable = true;
    private Project project;
    public PublishPackageAction() {
        dataObjects = Utilities.actionsGlobalContext().lookupResult(DataObject.class);
        dataObjects.addLookupListener(
                WeakListeners.create(LookupListener.class, this, dataObjects));
    }
    @Override
    public void actionPerformed(ActionEvent ev) {
        DataObject localContext = Utilities.actionsGlobalContext().lookup(DataObject.class);
        project = FileOwnerQuery.getOwner(localContext.getPrimaryFile());
        FileObject projectprop =
            project.getProjectDirectory().getFileObject(AntProjectHelper.PROJECT_PROPERTIES_PATH);
        EditableProperties ep;
        try {
            ep = loadProperties(projectprop);
            FileObject pkg = localContext.getPrimaryFile();
            String path = pkg.getPath();
            String packageName =
                   path.substring(path.lastIndexOf("src/")).replace("src/", "").replace("/", ".");
            if (ep.containsKey(ENABLEFOR_JAVA_CARD)) {
                if (publishable &&
                  !ep.get(ENABLEFOR_JAVA_CARD).contains(packageName)) {
                    ep.setProperty(ENABLEFOR_JAVA_CARD,ep.get(ENABLEFOR_JAVA_CARD) + packageName + ",");
                } else if (!publishable &&
                   ep.get(ENABLEFOR_JAVA_CARD).contains(packageName)) {
                    ep.setProperty(ENABLEFOR_JAVA_CARD,ep.get(ENABLEFOR_JAVA_CARD).replace(packageName + ",", ""));
                }
            } else if (publishable) {
                ep.setProperty(ENABLEFOR_JAVA_CARD, packageName + ",");
            }
            storeProperties(projectprop, ep);
            Node node = localContext.getNodeDelegate();
            uglyNodeIconRefresh(node);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
    private static final String ENABLEFOR_JAVA_CARD = "enableforJavaCard";
    private void uglyNodeIconRefresh(Node found) {
        try {
            Method m1 = Node.class.getDeclaredMethod("fireIconChange");
            m1.setAccessible(true);
            Method m2 = Node.class.getDeclaredMethod("fireOpenedIconChange");
            m2.setAccessible(true);
            m2.invoke(found);
            m1.invoke(found);
        } catch (NoSuchMethodException ex) {
            Exceptions.printStackTrace(ex);
        } catch (SecurityException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IllegalAccessException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IllegalArgumentException ex) {
            Exceptions.printStackTrace(ex);
        } catch (InvocationTargetException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
    private static EditableProperties loadProperties(FileObject propsFO) throws IOException {
        InputStream propsIS = propsFO.getInputStream();
        EditableProperties props = new EditableProperties(true);
        try {
            props.load(propsIS);
        } finally {
            propsIS.close();
        }
        return props;
    }
    public static void storeProperties(FileObject propsFO, EditableProperties props) throws IOException {
        FileLock lock = propsFO.lock();
        try {
            OutputStream os = propsFO.getOutputStream(lock);
            try {
                props.store(os);
            } finally {
                os.close();
            }
        } finally {
            lock.releaseLock();
        }
    }
    @Override
    public void resultChanged(LookupEvent ev) {
        Collection<? extends DataObject> dos = dataObjects.allInstances();
        if (dos.size() == 1) {
            DataObject currentDataObject = dos.iterator().next();
            FileObject selectedPkgIter = currentDataObject.getPrimaryFile();
            if (selectedPkgIter.isFolder()) {
                Boolean isPublic = AccessibilityQuery.isPubliclyAccessible(selectedPkgIter);
                if (isPublic) {
                    putValue("popupText", "Unpublish " + currentDataObject.getPrimaryFile().getName());
                    publishable = false;
                } else {
                    putValue("popupText", "Publish " + currentDataObject.getPrimaryFile().getName());
                    publishable = true;
                }
                context = currentDataObject;
            }
        }
    }
    @Override
    public JMenuItem getPopupPresenter() {
        if (!publishable) {
            JMenu jm = new JMenu("Configure JavaCard");
            jm.add(new JMenuItem(new AbstractAction("Properties") {
                @Override
                public void actionPerformed(ActionEvent e) {
//                    JCProjectProperties jcpp = new JCProjectProperties();
                    Dialog dialog = ProjectCustomizer.createCustomizerDialog(
                            "Projects/org-netbeans-modules-javacard-clslibproject/Customizer",
                            null,
                            null,
                            new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                }
                            },
                            null);
                    dialog.setTitle(ProjectUtils.getInformation(project).getDisplayName());
                    dialog.setVisible(true);
//                    JComponent panel = FileUtil.getConfigObject("Projects/org-netbeans-modules-javacard-clslibproject/Customizer/Sources.instance", JComponent.class);
//                    DialogDescriptor dd = new DialogDescriptor(panel, "Sources");
//                    DialogDisplayer.getDefault().createDialog(dd).setVisible(true);
                }
            }));
            jm.add(new JMenuItem("Unpublish"));
            return jm;
        } else {
            return new JMenuItem(new AbstractAction("Enable for JavaCard") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Actions.forID("Edit", "org.netbeans.access.PublishPackageAction").actionPerformed(e);
                }
            });
        }
    }
}