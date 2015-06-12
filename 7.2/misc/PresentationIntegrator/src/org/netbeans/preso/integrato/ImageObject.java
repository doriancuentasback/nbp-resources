/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.preso.integrato;

import java.awt.image.BufferedImage;
import java.util.Scanner;

/**
 *
 * @author geertjan
 */
public class ImageObject {
    
    BufferedImage image;
    //TODO hello
    int i;

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public ImageObject(BufferedImage image, int i) {
        this.image = image;
        this.i = i;
    }
    
}
