/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.tfnode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.project.JavaProjectConstants;
import org.netbeans.api.java.project.classpath.ProjectClassPathModifier;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.api.project.SourceGroup;
import org.netbeans.api.project.Sources;
import org.netbeans.api.project.libraries.Library;
import org.netbeans.api.project.libraries.LibraryManager;
import org.netbeans.api.templates.TemplateRegistration;
import org.netbeans.spi.project.ui.templates.support.Templates;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObject;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
    category = "Tools",
id = "org.netbeans.tfnode.GenerateTinkerForgeAction")
@ActionRegistration(
    displayName = "#CTL_GenerateTinkerForgeAction", iconBase = "org/netbeans/tfnode/palette/tinker.png")
@ActionReferences({
    @ActionReference(path = "Menu/Tools", position = -100),
    @ActionReference(path = "Toolbars/Build", position = 0)
})
@Messages("CTL_GenerateTinkerForgeAction=Generate TinkerForge")
public final class GenerateTinkerForgeAction implements ActionListener {

    private final List<ProjectConnectionWrapper> context;

    public GenerateTinkerForgeAction(List<ProjectConnectionWrapper> context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        for (ProjectConnectionWrapper pcw : context) {
//            JOptionPane.showMessageDialog(null, 
//                    "In " + ProjectUtils.getInformation(pcw.getProject()).getDisplayName() +
//                    " Source: " +pcw.getConnectionWidget().getSourceAnchor().getRelatedWidget().getToolTipText() +
//                    " / Target: " +pcw.getConnectionWidget().getTargetAnchor().getRelatedWidget().getToolTipText()
//                    );
            Project p = pcw.getProject();
            SourceGroup[] groups = ProjectUtils.getSources(p).getSourceGroups(JavaProjectConstants.SOURCES_TYPE_JAVA);
            FileObject rootFolder = groups[0].getRootFolder();
            try {
                FileObject tinkerforge = rootFolder.getFileObject("tinkerforge");
                if (tinkerforge == null) {
                    tinkerforge = rootFolder.createFolder("tinkerforge");
                }
                String[] data = new String[]{""
                        + "private static " + pcw.getConnectionWidget().getSourceAnchor().getRelatedWidget().getToolTipText()  +" master = new " + pcw.getConnectionWidget().getSourceAnchor().getRelatedWidget().getToolTipText()+"(LCDUID);" ,
                        "private static " + pcw.getConnectionWidget().getTargetAnchor().getRelatedWidget().getToolTipText()  +" master = new " + pcw.getConnectionWidget().getTargetAnchor().getRelatedWidget().getToolTipText()+"(LCDUID);",
                };
                Map args = new HashMap();
                args.put("package", "tinkerforge");
                args.put("name", "DemoTinkerForge");
                args.put("bricks", data);
                FileObject fo = FileUtil.getConfigFile("Templates/Classes/tinkerforge.java");
                DataObject dTemplate = DataObject.find(fo);
                DataObject created = dTemplate.createFromTemplate(DataFolder.findFolder(tinkerforge), "DemoTinkerForge", args);
                created.getLookup().lookup(OpenCookie.class).open();
                addClasspath(p);
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }

    public boolean addClasspath(Project project) {
        Library tinkerForgerLib = LibraryManager.getDefault().getLibrary("TinkerForge"); // NOI18N
        if (tinkerForgerLib != null) {
            try {
                Sources sources = ProjectUtils.getSources(project);
                SourceGroup[] sourceGroups = sources.getSourceGroups(JavaProjectConstants.SOURCES_TYPE_JAVA);
                for (SourceGroup sourceGroup : sourceGroups) {
                    ProjectClassPathModifier.addLibraries(new Library[]{tinkerForgerLib}, sourceGroup.getRootFolder(), ClassPath.COMPILE);
                }
                return true;
            } catch (IOException | UnsupportedOperationException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return false;
    }

}
