/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tabbed.toolbar;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import org.openide.util.ImageUtilities;

/**
 *
 * @author geertjan
 */
public class MyPanel extends JPanel {
    
      //Paint the banner image into the menu bar:
    private final Paint bannerPaint = makeBannerPaint();

    MyPanel(MigLayout migLayout) {
        super(migLayout);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(bannerPaint);
        g2.fillRect(0, 0, getWidth(), getHeight());
    }

    private Paint makeBannerPaint() {
        //Pointing to an image in org/menu/bar:
        BufferedImage img = (BufferedImage) ImageUtilities.loadImage("org/tabbed/toolbar/banner.jpg");
        return new TexturePaint(img, new Rectangle(0, 0, img.getWidth(), img.getHeight()));
    }
    
}
