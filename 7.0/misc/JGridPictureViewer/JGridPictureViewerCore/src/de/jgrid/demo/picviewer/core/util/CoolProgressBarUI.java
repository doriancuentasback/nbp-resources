package de.jgrid.demo.picviewer.core.util;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class CoolProgressBarUI extends BasicProgressBarUI {

	private BufferedImage offScreenImage;	
	private BufferedImage textOffScreenImage;	
	private BufferedImage barOffScreenImage;	
	
	int lineWidth = 5;
	
	private int lineStartwidth = 0; 
	
	private Timer timer;
	
	@Override
	public void installUI(JComponent c) {
		super.installUI(c);
		timer = new Timer(80, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lineStartwidth < lineWidth * 3) {
					lineStartwidth++;
				} else {
					lineStartwidth = 0;
				}
				progressBar.repaint();
			}
		});
		timer.setRepeats(true);
		timer.start();
	}
	
	@Override
	public void uninstallUI(JComponent c) {
		timer.stop();
		timer = null;
		super.uninstallUI(c);
	}
	
	public void paintBar(Graphics g, JComponent c, Rectangle barBounds) {
		if (barOffScreenImage == null || barOffScreenImage.getWidth() != barBounds.getWidth()
				|| barOffScreenImage.getHeight() != barBounds.getHeight()) {
			barOffScreenImage = new BufferedImage(c.getWidth(), c.getHeight(),
					BufferedImage.TYPE_INT_ARGB);
		}
		
		Graphics2D g2 = barOffScreenImage.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		// Clear
		g2.setComposite(AlphaComposite.Clear);
		g2.fillRect(0, 0, offScreenImage.getWidth(), offScreenImage
						.getHeight());

		g2.setComposite(AlphaComposite.SrcOver);
		g2.setColor(Color.BLACK);
		g2.fillRoundRect(0, 0, barBounds.width, barBounds.height, 20, 20);

		g2.setComposite(AlphaComposite.SrcIn);
		GradientPaint grad = new GradientPaint(0, 0, new Color(progressBar.getForeground().getRed(), progressBar.getForeground().getGreen(), progressBar.getForeground().getBlue(), 220), 0, barBounds.height, new Color(progressBar.getForeground().getRed(), progressBar.getForeground().getGreen(), progressBar.getForeground().getBlue(), 130));
		g2.setPaint(grad);
		g2.fillRoundRect(0, 0, barBounds.width, barBounds.height, 20, 20);
		
		g2.setComposite(AlphaComposite.DstOut);
		g2.setColor(new Color(250, 250, 250, 110));
		
		for (int actWidth = - lineStartwidth; actWidth < barBounds.width + lineWidth*3 + barBounds.height; actWidth=actWidth+lineWidth*3) {
			g2.setStroke(new BasicStroke(lineWidth));
			g2.drawLine(actWidth, 0, actWidth - barBounds.height, barBounds.height);
		}
		
		g2.setComposite(AlphaComposite.SrcOver);
		grad = new GradientPaint(0, 0, new Color(255, 255, 255, 130), 0, barBounds.height, new Color(0, 0, 0, 0));
		g2.setPaint(grad);
		g2.setStroke(new BasicStroke(1.2f));
		g2.drawRoundRect(0, 0, barBounds.width, barBounds.height, 20, 20);
		
		g2.dispose();
		
		
		g.drawImage(barOffScreenImage, barBounds.x, barBounds.y, null);
	}
	
	public void paintText(Graphics g, JComponent c) {
		String t = progressBar.getString();
		g.setFont(progressBar.getFont());
		int textWidth = g.getFontMetrics().stringWidth(t);
		int textHeigth = g.getFontMetrics().getHeight() - (g.getFontMetrics().getHeight() - g.getFontMetrics().getDescent());
		
		
		if (textOffScreenImage == null || textOffScreenImage.getWidth() != c.getWidth()
				|| textOffScreenImage.getHeight() != c.getHeight()) {
			textOffScreenImage = new BufferedImage(c.getWidth(), c.getHeight(),
					BufferedImage.TYPE_INT_ARGB);
		}
		
		Graphics2D g2 = textOffScreenImage.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		// Clear
		g2.setComposite(AlphaComposite.Clear);
		g2.fillRect(0, 0, textOffScreenImage.getWidth(), textOffScreenImage
						.getHeight());
		
		g2.setComposite(AlphaComposite.SrcOver);
		g2.setColor(Color.BLACK);
		g2.drawString(t, (c.getWidth() - textWidth) / 2, c.getHeight() / 2 - textHeigth / 2 + textHeigth);
		g2.dispose();
		
		int radius = 2;
		int size = radius * 2 + 1;
		float wieght = 1.0f / (size * size);
		float[] data = new float[size * size];
		for (int i = 0; i < data.length; i++) {
			data[i] = wieght;
		}
		Kernel kernel = new Kernel(size, size, data);
		ConvolveOp op = new ConvolveOp(kernel);
		textOffScreenImage = op.filter(textOffScreenImage, null);
		g.drawImage(textOffScreenImage, 0, 0, null);
		
		g.setColor(Color.white);
		g.drawString(t, (c.getWidth() - textWidth) / 2, c.getHeight() / 2 - textHeigth / 2 + textHeigth);
		
	}
	
	@Override
	public Dimension getPreferredSize(JComponent c) {
		return new Dimension(super.getPreferredSize(c).width * 2, c.getFontMetrics(c.getFont()).getHeight() + 20);
	}
	
	@Override
	public void paint(Graphics g, JComponent c) {
		if (offScreenImage == null || offScreenImage.getWidth() != c.getWidth()
				|| offScreenImage.getHeight() != c.getHeight()) {
			offScreenImage = new BufferedImage(c.getWidth(), c.getHeight(),
					BufferedImage.TYPE_INT_ARGB);
		}
		Graphics2D g2 = offScreenImage.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		// Clear
		g2.setComposite(AlphaComposite.Clear);
		g2.fillRect(0, 0, offScreenImage.getWidth(), offScreenImage
						.getHeight());

		// CLip
		g2.setComposite(AlphaComposite.SrcOver);
		g2.setColor(new Color(60, 60, 60));
		g2.fillRoundRect(2, 2, c.getWidth() - 4, c.getHeight() - 4, 20, 20);

		// Content
		g2.setComposite(AlphaComposite.SrcIn);
		
		//Border
		g2.setColor(new Color(0, 0, 0));
		g2.drawRoundRect(2, 2, c.getWidth() - 4, c.getHeight() - 3, 20, 20);

		g2.setStroke(new BasicStroke(1.5f));
		g2.setColor(new Color(100, 100, 100, 100));
		g2.drawRoundRect(2, 1, c.getWidth() - 4, c.getHeight() - 3, 20, 20);
		g2.dispose();
		
		g.drawImage(offScreenImage, 0, 0, null);
		
		paintBar(g, c, new Rectangle(4, 4, (int) ((double)(c.getWidth() - 8) * progressBar.getPercentComplete()), c.getHeight() - 8));
		paintText(g, c);
	}
	
	
	
	public static void main(String[] args) {
		JFrame testFrame = new JFrame("CoolProgress");
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JProgressBar bar = new JProgressBar();
		bar.setValue(64);
		
		
		
		Timer timer = new Timer(100, new ActionListener() {

			boolean add = true;
			int val = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(add) {
					if(val < 100) {
						val++;
					} else {
						add = !add;
						val--;
					}
				} else {
					if(val > 0) {
						val--;
					} else {
						add = !add;
						val++;
					}
				}
				bar.setValue(val);
				bar.setString(val + " % geladen");
			}
		});
		timer.setRepeats(true);
		timer.start();
		
		bar.setForeground(Color.ORANGE);
		bar.setUI(new CoolProgressBarUI());
		
		testFrame.getContentPane().setLayout(new FlowLayout(SwingUtilities.CENTER, 20, 20));
		
		testFrame.getContentPane().add(bar);
		testFrame.setResizable(false);
		testFrame.pack();
		testFrame.setLocationRelativeTo(null);
		testFrame.setBackground(Color.DARK_GRAY);
		testFrame.setVisible(true);
	}
}
