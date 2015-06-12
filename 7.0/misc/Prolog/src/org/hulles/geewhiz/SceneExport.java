/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hulles.geewhiz;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import org.netbeans.api.visual.vmd.VMDGraphScene;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.ErrorManager;

/**
 *
 * @author mark
 */
public class SceneExport {

    public SceneExport() {
    }
    
    public void exportScene(VMDGraphScene scene) {
        JComponent view;
        Dimension dim;
        BufferedImage bufImage;
        Graphics2D graphics;
        File file;
        
        view = scene.getView();
        dim = view.getSize();
        bufImage = new BufferedImage (dim.width, dim.height,
                BufferedImage.TYPE_4BYTE_ABGR);
        graphics = bufImage.createGraphics ();
        scene.paint (graphics);
        graphics.dispose ();
        file = getPNGSaveFile(view);
        if (file != null) {
            diagramToPNG(file, bufImage);
        }
    }
    
    private File getPNGSaveFile (JComponent view) {
        JFileChooser chooser;
        File file;
        
        //TODO: save selected directory as default for next time
        chooser = new JFileChooser();
        chooser.setDialogTitle("Export Scene As ...");
        chooser.setDialogType(JFileChooser.SAVE_DIALOG);
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(new FileFilter() {
            public boolean accept(File file) {
                if (file.isDirectory())
                    return true;
                return file.getName().toLowerCase().endsWith(".png");
            }
            public String getDescription () {
                return "Portable Network Graphics (.png)";
            }
        });
        if (chooser.showSaveDialog (view) != JFileChooser.APPROVE_OPTION) {
            return null;
        }
        
        file = chooser.getSelectedFile ();
        if (! file.getName ().toLowerCase ().endsWith (".png"))
            file = new File (file.getParentFile (), file.getName () + ".png");
        if (file.exists ()) {
            DialogDescriptor descriptor = new DialogDescriptor (
                    "File (" + file.getAbsolutePath () + 
                    ") already exists. Do you want to overwrite it?",
                    "File Exists", true, DialogDescriptor.YES_NO_OPTION,
                    DialogDescriptor.NO_OPTION, null);
            DialogDisplayer.getDefault().createDialog(descriptor).setVisible(true);
            if (descriptor.getValue() != DialogDescriptor.YES_OPTION) {
                return null;
            }
        }
        return file;
    }
    
    private void diagramToPNG(File file, BufferedImage bufImage) {
        
        try {
            ImageIO.write (bufImage, "png", file); // NOI18N
        } catch (IOException e) {
            ErrorManager.getDefault ().notify (e);
        }
    }
}
