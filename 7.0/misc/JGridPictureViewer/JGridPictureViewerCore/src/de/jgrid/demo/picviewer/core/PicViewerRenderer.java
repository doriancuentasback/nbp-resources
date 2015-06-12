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

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

import de.jgrid.JGrid;
import de.jgrid.demo.picviewer.core.util.ImageUtilities;
import de.jgrid.renderer.GridCellRenderer;

public class PicViewerRenderer extends JComponent implements GridCellRenderer {

	private static final long serialVersionUID = 1L;
	
	private BufferedImage image;
	
	private boolean paintMarker = false;
	
	private float markerFraction;
	
	@Override
	public Component getGridCellRendererComponent(JGrid grid, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		image = null;
		paintMarker = false;
		if(value instanceof PicViewerObject) {
			image = ((PicViewerObject) value).getImage();
			markerFraction = ((PicViewerObject) value).getFraction();
			paintMarker = ((PicViewerObject) value).isMarker();
		}
		return this;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g.create();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		if(image != null) {
			int width = image.getWidth();
			int height = image.getHeight();
			
			float widthFactor = (float)getWidth() / (float)image.getWidth();
			float heightFactor = (float)getHeight() / (float)image.getHeight();
			if(widthFactor > heightFactor) {
				width = (int) ((float)image.getWidth() * widthFactor);
				height = (int) ((float)image.getHeight() * widthFactor);
			} else {
				width = (int) ((float)image.getWidth() * heightFactor);
				height = (int) ((float)image.getHeight() * heightFactor);
			}
			g2.drawImage(ImageUtilities.getOptimalScalingImage(image, width, height), (getWidth() - width) / 2, (getHeight() - height) / 2, null);
			
			if(paintMarker) {
				int x = (int) (getWidth() * markerFraction);
				g2.setStroke(new BasicStroke(3.5f));
				g2.setColor(new Color(50, 50, 50));
				g2.drawLine(x, 0, x, getHeight());
				
				g2.setStroke(new BasicStroke(2.5f));
				g2.setColor(new Color(248,211,80));
				g2.drawLine(x, 0, x, getHeight());	
			}
			g2.dispose();
		}
	}

	@Override
	public void validate() {
	}

	@Override
	public void invalidate() {
	}

	@Override
	public void repaint() {
	}

	@Override
	public void revalidate() {
	}

	@Override
	public void repaint(long tm, int x, int y, int width, int height) {
	}

	@Override
	public void repaint(Rectangle r) {
	}

	@Override
	public void firePropertyChange(String propertyName, byte oldValue,
			byte newValue) {
	}

	@Override
	public void firePropertyChange(String propertyName, char oldValue,
			char newValue) {
	}

	@Override
	public void firePropertyChange(String propertyName, short oldValue,
			short newValue) {
	}

	@Override
	public void firePropertyChange(String propertyName, int oldValue,
			int newValue) {
	}

	@Override
	public void firePropertyChange(String propertyName, long oldValue,
			long newValue) {
	}

	@Override
	public void firePropertyChange(String propertyName, float oldValue,
			float newValue) {
	}

	@Override
	public void firePropertyChange(String propertyName, double oldValue,
			double newValue) {
	}

	@Override
	public void firePropertyChange(String propertyName, boolean oldValue,
			boolean newValue) {
	}
	
	@Override
	protected void firePropertyChange(String propertyName, Object oldValue,
			Object newValue) {
	}
}
