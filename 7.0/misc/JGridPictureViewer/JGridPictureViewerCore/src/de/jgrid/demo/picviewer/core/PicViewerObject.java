/*
 * Created on Jan 22, 2011
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2011 Hendrik Ebbers
 */
package de.jgrid.demo.picviewer.core;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class PicViewerObject implements Cloneable {

    private List<BufferedImage> images;
    private float fraction;
    private int index;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<BufferedImage> getImages() {
        return images;
    }

    public void setImages(List<BufferedImage> images) {
        this.images = images;
    }
    private boolean marker;

    public PicViewerObject() {
        images = new ArrayList<BufferedImage>();
        setFraction(0.0f);
    }

    @Override
    protected Object clone() {
        PicViewerObject clone = new PicViewerObject();
        for (BufferedImage image : images) {
            clone.addImage(image);
        }
        clone.setFraction(getFraction());
        return clone;
    }

    public void addImage(BufferedImage image) {
        images.add(image);
        setFraction(getFraction());
    }

    public BufferedImage getImage() {
        return images.get(index);
    }

    public void setMarker(boolean marker) {
        this.marker = marker;
    }

    public boolean isMarker() {
        return marker;
    }

    public int getIndex() {
        return index;
    }

    public Object getValueForFraction() {
        return getImage();
    }

    public float getFraction() {
        return fraction;
    }

    public void setFraction(float fraction) {
        this.fraction = Math.max(0.0f, Math.min(1.0f, fraction));
        this.index = (int) (this.fraction * (float) (images.size()));
    }
}
