package org.netbeans.sticky;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JComponent;
import javax.swing.JEditorPane;

/**
 * @author Gerrit Grunwald <han.solo at muenster.de>
 */
public final class StickyNote extends JComponent {
    // <editor-fold defaultstate="collapsed" desc="Variable declarations">
    public static final String TEXT_PROPERTY = "text";
    private Color noteColor;
    private Font handwritingFont;
    private Font textFont;
    private Font customFont;
    private boolean handwritingFontEnabled;
    private boolean customFontEnabled;
    private JEditorPane notePane;
    private PropertyChangeSupport propertySupport;
    private final Rectangle INNER_BOUNDS = new Rectangle(0, 0, 90, 90);
    private final Point2D CENTER;
    private BufferedImage noteImage;
    private BufferedImage pushPinImage;
    private boolean pushPinVisible;
    private boolean square;
    private transient final ComponentListener COMPONENT_LISTENER = new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent event) {
            final int SIZE = getWidth() <= getHeight() ? getWidth() : getHeight();
            Container parent = getParent();
            if ((parent != null) && (parent.getLayout() == null)) {
                if (SIZE < getMinimumSize().width || SIZE < getMinimumSize().height) {
                    setSize(getMinimumSize());
                } else if(square) {
					setSize(SIZE, SIZE);
				} else {
                    setSize(getWidth(), getHeight());
                }
            } else {
                if (SIZE < getMinimumSize().width || SIZE < getMinimumSize().height) {
                    setPreferredSize(getMinimumSize());
                } else if(square) {
					setPreferredSize(new Dimension(SIZE, SIZE));
				} else {
                    setPreferredSize(new Dimension(getWidth(), getHeight()));
                }
            }
            calcInnerBounds();
            init(getInnerBounds().width, getInnerBounds().height);
        }
    };
    // </editor-fold>>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public StickyNote() {
        super();
        textFont = new Font("Verdana", Font.PLAIN, (int)(0.065 * INNER_BOUNDS.width));
        try {
            handwritingFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("resources/schoolbell.ttf"));
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(handwritingFont);
            handwritingFont = handwritingFont.deriveFont(0.065f * INNER_BOUNDS.width).deriveFont(Font.PLAIN);
            //handwritingFont = new Font("SchoolBell", Font.PLAIN, (int)(0.065 * INNER_BOUNDS.width));
            handwritingFontEnabled = true;
        } catch (FontFormatException exception) {
            handwritingFont = textFont;
            handwritingFontEnabled = false;
        } catch (java.io.IOException exception) {
            handwritingFont = textFont;
            handwritingFontEnabled = false;
        }
        customFont = textFont;
        noteColor = new Color(0xF1F5C1);
        propertySupport = new PropertyChangeSupport(this);
        CENTER = new Point2D.Double();
        noteImage = createImage(INNER_BOUNDS.width, INNER_BOUNDS.height, Transparency.TRANSLUCENT);
        pushPinImage = createImage(INNER_BOUNDS.width, INNER_BOUNDS.height, Transparency.TRANSLUCENT);
        notePane = new JEditorPane();
        notePane.setBounds((int) (0.15918367346938775 * INNER_BOUNDS.width), (int) (0.09387755102040816 * INNER_BOUNDS.height), (int) (0.6530612244897959 * INNER_BOUNDS.width), (int) (0.6530612244897959 * INNER_BOUNDS.height));
        notePane.setOpaque(false);
        notePane.setBackground(new Color(0, 0, 0, 0));
        notePane.setForeground(new Color(51, 51,51));
        notePane.setEditable(true);
        if (handwritingFontEnabled) {
            notePane.setFont(handwritingFont);
        } else {
            notePane.setFont(textFont);
        }
        add(notePane);
        pushPinVisible = true;
        square = true;
        setPreferredSize(new Dimension(INNER_BOUNDS.width, INNER_BOUNDS.height));
        addComponentListener(COMPONENT_LISTENER);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Initialization">
    public final void init(final int WIDTH, final int HEIGHT) {
        if (WIDTH <= 1 || HEIGHT <= 1) {
            return;
        }
        if (noteImage != null) {
            noteImage.flush();
        }
        noteImage = createNoteImage(WIDTH, HEIGHT);

        if (pushPinImage != null) {
            pushPinImage.flush();
        }
        pushPinImage = createPushPinImage(WIDTH, HEIGHT);
        CENTER.setLocation(WIDTH / 2.0, HEIGHT / 2.0);
        textFont = textFont.deriveFont(0.065f * INNER_BOUNDS.width).deriveFont(Font.PLAIN);
//        handwritingFont = handwritingFont.deriveFont(0.065f * INNER_BOUNDS.width).deriveFont(Font.PLAIN);
        handwritingFont = handwritingFont.deriveFont(0.12f * INNER_BOUNDS.width).deriveFont(Font.PLAIN);
        customFont = customFont.deriveFont(0.065f * INNER_BOUNDS.width).deriveFont(Font.PLAIN);
        notePane.setBounds((int) (0.15918367346938775 * noteImage.getWidth()), (int) (0.09387755102040816 * noteImage.getHeight()), (int) (0.6530612244897959 * noteImage.getWidth()), (int) (0.6530612244897959 * noteImage.getHeight()));
        if (customFontEnabled) {
            notePane.setFont(customFont);
        } else if (handwritingFontEnabled) {
            notePane.setFont(handwritingFont);
        } else {
            notePane.setFont(textFont);
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Visualization">
    @Override
    protected void paintComponent(Graphics g) {
        // Create the Graphics2D object
        final Graphics2D G2 = (Graphics2D) g.create();

        // Set the rendering hints
        G2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		G2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        G2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        G2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        // Take insets into account (e.g. used by borders)
        G2.translate(getInnerBounds().x, getInnerBounds().y);

        G2.drawImage(noteImage, 0, 0, null);

        if(pushPinVisible) {
            G2.drawImage(pushPinImage, 0, 0, null);
        }

        // Dispose the temp graphics object
        G2.dispose();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public String getText() {
        return notePane.getText();
    }

    public void setText(final String TEXT) {
        String oldText = notePane.getText();
        notePane.setText(TEXT);
        propertySupport.firePropertyChange(TEXT_PROPERTY, oldText, TEXT);
        repaint(getInnerBounds());
    }

    public Color getTextColor() {
        return notePane.getForeground();
    }

    public void setTextColor(final Color TEXT_COLOR) {
        notePane.setForeground(TEXT_COLOR);
        repaint(getInnerBounds());
    }

    public Color getNoteColor() {
        return noteColor;
    }

    public void setNoteColor(final Color NOTE_COLOR) {
        noteColor = NOTE_COLOR;
        init(getInnerBounds().width, getInnerBounds().height);
        repaint(getInnerBounds());
    }

    public boolean isHandwritingFontEnabled() {
        return handwritingFontEnabled;
    }

    public void setHandwritingFontEnabled(final boolean HANDWRITING_FONT_ENABLED) {
        handwritingFontEnabled = HANDWRITING_FONT_ENABLED;
        init(getInnerBounds().width, getInnerBounds().height);
        repaint(getInnerBounds());
    }

    public boolean isCustomFontEnabled() {
        return customFontEnabled;
    }

    public void setCustomFontEnabled(final boolean CUSTOM_FONT_ENABLED) {
        customFontEnabled = CUSTOM_FONT_ENABLED;
        init(getInnerBounds().width, getInnerBounds().height);
        repaint(getInnerBounds());
    }

    public Font getCustomFont() {
        return customFont;
    }

    public void setCustomFont(final Font CUSTOM_FONT) {
        customFont = CUSTOM_FONT;
        init(getInnerBounds().width, getInnerBounds().height);
        repaint(getInnerBounds());
    }

    public boolean isPushPinVisible() {
        return pushPinVisible;
    }

    public void setPushPinVisible(final boolean PUSHPIN_VISIBLE) {
        pushPinVisible = PUSHPIN_VISIBLE;
        init(getInnerBounds().width, getInnerBounds().height);
        repaint(getInnerBounds());
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Listener related">
    @Override
    public void addPropertyChangeListener(final PropertyChangeListener LISTENER) {
        if (isShowing()) {
            propertySupport.addPropertyChangeListener(LISTENER);
        }
    }

    @Override
    public void removePropertyChangeListener(final PropertyChangeListener LISTENER) {
        propertySupport.removePropertyChangeListener(LISTENER);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Size related">
    /**
    * Calculates the area that is available for painting the display
    */
    private void calcInnerBounds() {
        final Insets INSETS = getInsets();
        INNER_BOUNDS.setBounds(INSETS.left, INSETS.top, getWidth() - INSETS.left - INSETS.right, getHeight() - INSETS.top - INSETS.bottom);
    }

    /**
     * Returns a rectangle representing the available space for drawing the
     * component taking the insets into account (e.g. given through borders etc.)
     * @return a rectangle that represents the area available for rendering the component
     */
    private Rectangle getInnerBounds() {
        return INNER_BOUNDS;
    }

    @Override
    public java.awt.Dimension getMinimumSize() {
        /* Return the default size of the component
         * which will be used by ui-editors for initialization
         */
        return new Dimension(90, 90);
    }

	@Override
	public void setPreferredSize(final Dimension DIM) {
	    final int SIZE = DIM.width <= DIM.height ? DIM.width : DIM.height;
	    if (square) {
	        super.setPreferredSize(new Dimension(SIZE, SIZE));
	    } else {
	        super.setPreferredSize(DIM);
	    }
	    calcInnerBounds();
	    init(getInnerBounds().width, getInnerBounds().height);
	}

	@Override
	public void setSize(final int WIDTH, final int HEIGHT) {
	    final int SIZE = WIDTH <= HEIGHT ? WIDTH : HEIGHT;
	    if (square) {
	        super.setSize(SIZE, SIZE);
	    } else {
	        super.setSize(WIDTH, HEIGHT);
	    }
	    calcInnerBounds();
	    init(getInnerBounds().width, getInnerBounds().height);
	}

	@Override
	public void setSize(final Dimension DIM) {
	    final int SIZE = DIM.width <= DIM.height ? DIM.width : DIM.height;
	    if (square) {
	        super.setSize(new Dimension(SIZE, SIZE));
	    } else {
	        super.setSize(DIM);
	    }
	    calcInnerBounds();
	    init(getInnerBounds().width, getInnerBounds().height);
	}

	@Override
	public void setBounds(final Rectangle BOUNDS) {
	    final int SIZE = BOUNDS.width <= BOUNDS.height ? BOUNDS.width : BOUNDS.height;
	    if (square) {
	        super.setBounds(BOUNDS.x, BOUNDS.y, SIZE, SIZE);
	    } else {
	        super.setBounds(BOUNDS);
	    }
	    calcInnerBounds();
	    init(getInnerBounds().width, getInnerBounds().height);
	}

	@Override
	public void setBounds(final int X, final int Y, final int WIDTH, final int HEIGHT) {
	    final int SIZE = WIDTH <= HEIGHT ? WIDTH : HEIGHT;
	    if (square) {
	        super.setBounds(X, Y, SIZE, SIZE);
	    } else {
	        super.setBounds(X, Y, WIDTH, HEIGHT);
	    }
	    calcInnerBounds();
	    init(getInnerBounds().width, getInnerBounds().height);
	}
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Image related">
    /**
     * Returns a compatible image of the given size and transparency
     * @param WIDTH
     * @param HEIGHT
     * @param TRANSPARENCY
     * @return a compatible image of the given size and transparency
     */
    private BufferedImage createImage(final int WIDTH, final int HEIGHT, final int TRANSPARENCY) {
        final GraphicsConfiguration GFX_CONF = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        if (WIDTH <= 0 || HEIGHT <= 0) {
            return GFX_CONF.createCompatibleImage(1, 1, TRANSPARENCY);
        }
        final BufferedImage IMAGE = GFX_CONF.createCompatibleImage(WIDTH, HEIGHT, TRANSPARENCY);
        return IMAGE;
    }

    public BufferedImage createNoteImage(final int WIDTH, final int HEIGHT) {
        final GraphicsConfiguration GFX_CONF = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        if (WIDTH <= 0 || HEIGHT <= 0) {
            return GFX_CONF.createCompatibleImage(1, 1, java.awt.Transparency.TRANSLUCENT);
        }
        final BufferedImage IMAGE = GFX_CONF.createCompatibleImage(WIDTH, HEIGHT, Transparency.TRANSLUCENT);
        final Graphics2D G2 = IMAGE.createGraphics();
        G2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        G2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        G2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        G2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        final int IMAGE_WIDTH = IMAGE.getWidth();
        final int IMAGE_HEIGHT = IMAGE.getHeight();
        final GeneralPath SHADOW = new GeneralPath();
        SHADOW.setWindingRule(Path2D.WIND_EVEN_ODD);
        SHADOW.moveTo(0.04897959183673469 * IMAGE_WIDTH, 0.09387755102040816 * IMAGE_HEIGHT);
        SHADOW.lineTo(0.8448979591836735 * IMAGE_WIDTH, 0.061224489795918366 * IMAGE_HEIGHT);
        SHADOW.curveTo(0.8448979591836735 * IMAGE_WIDTH, 0.061224489795918366 * IMAGE_HEIGHT, 0.8448979591836735 * IMAGE_WIDTH, 0.24897959183673468 * IMAGE_HEIGHT, 0.8693877551020408 * IMAGE_WIDTH, 0.44081632653061226 * IMAGE_HEIGHT);
        SHADOW.curveTo(0.8979591836734694 * IMAGE_WIDTH, 0.6408163265306123 * IMAGE_HEIGHT, 0.9591836734693877 * IMAGE_WIDTH, 0.7918367346938775 * IMAGE_HEIGHT, 0.9591836734693877 * IMAGE_WIDTH, 0.7918367346938775 * IMAGE_HEIGHT);
        SHADOW.curveTo(0.9591836734693877 * IMAGE_WIDTH, 0.7918367346938775 * IMAGE_HEIGHT, 0.7836734693877551 * IMAGE_WIDTH, 0.8816326530612245 * IMAGE_HEIGHT, 0.5510204081632653 * IMAGE_WIDTH, 0.8938775510204081 * IMAGE_HEIGHT);
        SHADOW.curveTo(0.31020408163265306 * IMAGE_WIDTH, 0.9061224489795918 * IMAGE_HEIGHT, 0.10612244897959183 * IMAGE_WIDTH, 0.8693877551020408 * IMAGE_HEIGHT, 0.10612244897959183 * IMAGE_WIDTH, 0.8693877551020408 * IMAGE_HEIGHT);
        SHADOW.curveTo(0.10612244897959183 * IMAGE_WIDTH, 0.8693877551020408 * IMAGE_HEIGHT, 0.08163265306122448 * IMAGE_WIDTH, 0.673469387755102 * IMAGE_HEIGHT, 0.0653061224489796 * IMAGE_WIDTH, 0.4775510204081633 * IMAGE_HEIGHT);
        SHADOW.curveTo(0.04897959183673469 * IMAGE_WIDTH, 0.2938775510204082 * IMAGE_HEIGHT, 0.04897959183673469 * IMAGE_WIDTH, 0.09387755102040816 * IMAGE_HEIGHT, 0.04897959183673469 * IMAGE_WIDTH, 0.09387755102040816 * IMAGE_HEIGHT);
        SHADOW.closePath();
        G2.setPaint(new LinearGradientPaint(new Point2D.Double(0.563265306122449 * IMAGE_WIDTH, 0.37142857142857144 * IMAGE_HEIGHT), new Point2D.Double(0.08976347809529568 * IMAGE_WIDTH, 0.8617540679859377 * IMAGE_HEIGHT), new float[]{0.0f, 1.0f}, new Color[]{new Color(0.2f, 0.2f, 0.2f, 0.7490196078f), new Color(0f, 0f, 0f, 0f)}));
        G2.fill(SHADOW);

        // Generate note color shadings
        final float NOTE_COLOR_HUE = Color.RGBtoHSB(noteColor.getRed(), noteColor.getGreen(), noteColor.getBlue(), null)[0];

        final Color[] COLORS = {
            new Color(Color.HSBtoRGB(NOTE_COLOR_HUE, 0.23f, 0.91f)),
            new Color(Color.HSBtoRGB(NOTE_COLOR_HUE, 0.15f, 0.96f)),
            new Color(Color.HSBtoRGB(NOTE_COLOR_HUE, 0.15f, 0.96f)),
            new Color(Color.HSBtoRGB(NOTE_COLOR_HUE, 0.32f, 0.81f))
        };

        final GeneralPath NOTE = new GeneralPath();
        NOTE.setWindingRule(Path2D.WIND_EVEN_ODD);
        NOTE.moveTo(0.05714285714285714 * IMAGE_WIDTH, 0.061224489795918366 * IMAGE_HEIGHT);
        NOTE.lineTo(0.8448979591836735 * IMAGE_WIDTH, 0.061224489795918366 * IMAGE_HEIGHT);
        NOTE.curveTo(0.8448979591836735 * IMAGE_WIDTH, 0.061224489795918366 * IMAGE_HEIGHT, 0.8448979591836735 * IMAGE_WIDTH, 0.24897959183673468 * IMAGE_HEIGHT, 0.8693877551020408 * IMAGE_WIDTH, 0.44081632653061226 * IMAGE_HEIGHT);
        NOTE.curveTo(0.8979591836734694 * IMAGE_WIDTH, 0.6408163265306123 * IMAGE_HEIGHT, 0.9591836734693877 * IMAGE_WIDTH, 0.7918367346938775 * IMAGE_HEIGHT, 0.9591836734693877 * IMAGE_WIDTH, 0.7918367346938775 * IMAGE_HEIGHT);
        NOTE.curveTo(0.9591836734693877 * IMAGE_WIDTH, 0.7918367346938775 * IMAGE_HEIGHT, 0.7224489795918367 * IMAGE_WIDTH, 0.8448979591836735 * IMAGE_HEIGHT, 0.49387755102040815 * IMAGE_WIDTH, 0.8571428571428571 * IMAGE_HEIGHT);
        NOTE.curveTo(0.2530612244897959 * IMAGE_WIDTH, 0.8693877551020408 * IMAGE_HEIGHT, 0.1469387755102041 * IMAGE_WIDTH, 0.7836734693877551 * IMAGE_HEIGHT, 0.1469387755102041 * IMAGE_WIDTH, 0.7836734693877551 * IMAGE_HEIGHT);
        NOTE.curveTo(0.1469387755102041 * IMAGE_WIDTH, 0.7836734693877551 * IMAGE_HEIGHT, 0.10204081632653061 * IMAGE_WIDTH, 0.673469387755102 * IMAGE_HEIGHT, 0.08571428571428572 * IMAGE_WIDTH, 0.4775510204081633 * IMAGE_HEIGHT);
        NOTE.curveTo(0.06938775510204082 * IMAGE_WIDTH, 0.2938775510204082 * IMAGE_HEIGHT, 0.05714285714285714 * IMAGE_WIDTH, 0.061224489795918366 * IMAGE_HEIGHT, 0.05714285714285714 * IMAGE_WIDTH, 0.061224489795918366 * IMAGE_HEIGHT);
        NOTE.closePath();
        G2.setPaint(new LinearGradientPaint(new Point2D.Double(0.7387755102040816 * IMAGE_WIDTH, 0.08571428571428572 * IMAGE_HEIGHT), new Point2D.Double(0.15895485003785634 * IMAGE_WIDTH, 0.7767176405277312 * IMAGE_HEIGHT), new float[]{0.0f, 0.33f, 0.67f, 1.0f}, COLORS));
        G2.fill(NOTE);

        G2.dispose();
        return IMAGE;
    }

    public BufferedImage createPushPinImage(final int WIDTH, final int HEIGHT) {
        final GraphicsConfiguration GFX_CONF = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        if (WIDTH <= 0 || HEIGHT <= 0) {
            return GFX_CONF.createCompatibleImage(1, 1, java.awt.Transparency.TRANSLUCENT);
        }
        final BufferedImage IMAGE = GFX_CONF.createCompatibleImage(WIDTH, HEIGHT, Transparency.TRANSLUCENT);
        final Graphics2D G2 = IMAGE.createGraphics();
        G2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        G2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        G2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        G2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        final int IMAGE_WIDTH = IMAGE.getWidth();
        final int IMAGE_HEIGHT = IMAGE.getHeight();
        final GeneralPath SHADOW = new GeneralPath();
        SHADOW.setWindingRule(Path2D.WIND_NON_ZERO);
        SHADOW.moveTo(0.7877551020408163 * IMAGE_WIDTH, 0.1510204081632653 * IMAGE_HEIGHT);
        SHADOW.curveTo(0.7673469387755102 * IMAGE_WIDTH, 0.1469387755102041 * IMAGE_HEIGHT, 0.7551020408163265 * IMAGE_WIDTH, 0.12653061224489795 * IMAGE_HEIGHT, 0.7591836734693878 * IMAGE_WIDTH, 0.10204081632653061 * IMAGE_HEIGHT);
        SHADOW.curveTo(0.763265306122449 * IMAGE_WIDTH, 0.08163265306122448 * IMAGE_HEIGHT, 0.7836734693877551 * IMAGE_WIDTH, 0.0653061224489796 * IMAGE_HEIGHT, 0.8040816326530612 * IMAGE_WIDTH, 0.06938775510204082 * IMAGE_HEIGHT);
        SHADOW.curveTo(0.8244897959183674 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT, 0.8367346938775511 * IMAGE_WIDTH, 0.09387755102040816 * IMAGE_HEIGHT, 0.8326530612244898 * IMAGE_WIDTH, 0.11836734693877551 * IMAGE_HEIGHT);
        SHADOW.curveTo(0.8285714285714286 * IMAGE_WIDTH, 0.13877551020408163 * IMAGE_HEIGHT, 0.8081632653061225 * IMAGE_WIDTH, 0.15510204081632653 * IMAGE_HEIGHT, 0.7877551020408163 * IMAGE_WIDTH, 0.1510204081632653 * IMAGE_HEIGHT);
        SHADOW.closePath();
        G2.setPaint(new Color(0f, 0f, 0f, 0.2f));
        G2.fill(SHADOW);

        final GeneralPath NEEDLE = new GeneralPath();
        NEEDLE.setWindingRule(Path2D.WIND_NON_ZERO);
        NEEDLE.moveTo(0.7877551020408163 * IMAGE_WIDTH, 0.12244897959183673 * IMAGE_HEIGHT);
        NEEDLE.curveTo(0.7959183673469388 * IMAGE_WIDTH, 0.10612244897959183 * IMAGE_HEIGHT, 0.8040816326530612 * IMAGE_WIDTH, 0.08571428571428572 * IMAGE_HEIGHT, 0.8081632653061225 * IMAGE_WIDTH, 0.06938775510204082 * IMAGE_HEIGHT);
        NEEDLE.curveTo(0.8081632653061225 * IMAGE_WIDTH, 0.06938775510204082 * IMAGE_HEIGHT, 0.8081632653061225 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT, 0.8122448979591836 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT);
        NEEDLE.curveTo(0.8122448979591836 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT, 0.8163265306122449 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT, 0.8163265306122449 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT);
        NEEDLE.curveTo(0.8163265306122449 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT, 0.8163265306122449 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT, 0.8163265306122449 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT);
        NEEDLE.curveTo(0.8163265306122449 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT, 0.7918367346938775 * IMAGE_WIDTH, 0.12244897959183673 * IMAGE_HEIGHT, 0.7918367346938775 * IMAGE_WIDTH, 0.12244897959183673 * IMAGE_HEIGHT);
        NEEDLE.curveTo(0.7918367346938775 * IMAGE_WIDTH, 0.12244897959183673 * IMAGE_HEIGHT, 0.7918367346938775 * IMAGE_WIDTH, 0.12244897959183673 * IMAGE_HEIGHT, 0.7918367346938775 * IMAGE_WIDTH, 0.12244897959183673 * IMAGE_HEIGHT);
        NEEDLE.curveTo(0.7918367346938775 * IMAGE_WIDTH, 0.12653061224489795 * IMAGE_HEIGHT, 0.7918367346938775 * IMAGE_WIDTH, 0.12653061224489795 * IMAGE_HEIGHT, 0.7877551020408163 * IMAGE_WIDTH, 0.12653061224489795 * IMAGE_HEIGHT);
        NEEDLE.curveTo(0.7877551020408163 * IMAGE_WIDTH, 0.12244897959183673 * IMAGE_HEIGHT, 0.7877551020408163 * IMAGE_WIDTH, 0.12244897959183673 * IMAGE_HEIGHT, 0.7877551020408163 * IMAGE_WIDTH, 0.12244897959183673 * IMAGE_HEIGHT);
        NEEDLE.closePath();
        G2.setPaint(new LinearGradientPaint(new Point2D.Double(0.7959183673469388 * IMAGE_WIDTH, 0.10612244897959183 * IMAGE_HEIGHT), new Point2D.Double(0.7994531649134059 * IMAGE_WIDTH, 0.10816326530612246 * IMAGE_HEIGHT), new float[]{0.0f, 1.0f}, new Color[]{new Color(0.2f, 0.2f, 0.2f, 1f), new Color(0.6f, 0.6f, 0.6f, 1f)}));
        G2.fill(NEEDLE);

        final GeneralPath BASE = new GeneralPath();
        BASE.setWindingRule(Path2D.WIND_EVEN_ODD);
        BASE.moveTo(0.7755102040816326 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT);
        BASE.curveTo(0.7795918367346939 * IMAGE_WIDTH, 0.05714285714285714 * IMAGE_HEIGHT, 0.8 * IMAGE_WIDTH, 0.04897959183673469 * IMAGE_HEIGHT, 0.8163265306122449 * IMAGE_WIDTH, 0.05714285714285714 * IMAGE_HEIGHT);
        BASE.curveTo(0.8326530612244898 * IMAGE_WIDTH, 0.0653061224489796 * IMAGE_HEIGHT, 0.8448979591836735 * IMAGE_WIDTH, 0.08163265306122448 * IMAGE_HEIGHT, 0.8408163265306122 * IMAGE_WIDTH, 0.09795918367346938 * IMAGE_HEIGHT);
        BASE.curveTo(0.8326530612244898 * IMAGE_WIDTH, 0.11020408163265306 * IMAGE_HEIGHT, 0.8122448979591836 * IMAGE_WIDTH, 0.11836734693877551 * IMAGE_HEIGHT, 0.7959183673469388 * IMAGE_WIDTH, 0.11020408163265306 * IMAGE_HEIGHT);
        BASE.curveTo(0.7795918367346939 * IMAGE_WIDTH, 0.10204081632653061 * IMAGE_HEIGHT, 0.7673469387755102 * IMAGE_WIDTH, 0.08571428571428572 * IMAGE_HEIGHT, 0.7755102040816326 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT);
        BASE.closePath();
        G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.8122448979591836 * IMAGE_WIDTH, 0.08163265306122448 * IMAGE_HEIGHT), (0.0326530612244898f * IMAGE_WIDTH), new float[]{0.0f, 0.26f, 0.27f, 1.0f}, new Color[]{new Color(1f, 1f, 1f, 1f), new Color(1f, 1f, 1f, 1f), new Color(1f, 1f, 1f, 1f), new Color(0.5294117647f, 0.5294117647f, 0.5294117647f, 1f)}));
        G2.fill(BASE);

        final GeneralPath HANDLE = new GeneralPath();
        HANDLE.setWindingRule(Path2D.WIND_EVEN_ODD);
        HANDLE.moveTo(0.8 * IMAGE_WIDTH, 0.036734693877551024 * IMAGE_HEIGHT);
        HANDLE.curveTo(0.8040816326530612 * IMAGE_WIDTH, 0.04081632653061224 * IMAGE_HEIGHT, 0.8081632653061225 * IMAGE_WIDTH, 0.04897959183673469 * IMAGE_HEIGHT, 0.8081632653061225 * IMAGE_WIDTH, 0.04897959183673469 * IMAGE_HEIGHT);
        HANDLE.curveTo(0.8081632653061225 * IMAGE_WIDTH, 0.04897959183673469 * IMAGE_HEIGHT, 0.8081632653061225 * IMAGE_WIDTH, 0.053061224489795916 * IMAGE_HEIGHT, 0.8040816326530612 * IMAGE_WIDTH, 0.05714285714285714 * IMAGE_HEIGHT);
        HANDLE.curveTo(0.8 * IMAGE_WIDTH, 0.0653061224489796 * IMAGE_HEIGHT, 0.7959183673469388 * IMAGE_WIDTH, 0.0653061224489796 * IMAGE_HEIGHT, 0.7959183673469388 * IMAGE_WIDTH, 0.0653061224489796 * IMAGE_HEIGHT);
        HANDLE.curveTo(0.7959183673469388 * IMAGE_WIDTH, 0.0653061224489796 * IMAGE_HEIGHT, 0.7959183673469388 * IMAGE_WIDTH, 0.06938775510204082 * IMAGE_HEIGHT, 0.7959183673469388 * IMAGE_WIDTH, 0.07755102040816327 * IMAGE_HEIGHT);
        HANDLE.curveTo(0.8 * IMAGE_WIDTH, 0.08163265306122448 * IMAGE_HEIGHT, 0.8040816326530612 * IMAGE_WIDTH, 0.08163265306122448 * IMAGE_HEIGHT, 0.8081632653061225 * IMAGE_WIDTH, 0.08571428571428572 * IMAGE_HEIGHT);
        HANDLE.curveTo(0.8122448979591836 * IMAGE_WIDTH, 0.08571428571428572 * IMAGE_HEIGHT, 0.8163265306122449 * IMAGE_WIDTH, 0.08571428571428572 * IMAGE_HEIGHT, 0.8204081632653061 * IMAGE_WIDTH, 0.08571428571428572 * IMAGE_HEIGHT);
        HANDLE.curveTo(0.8244897959183674 * IMAGE_WIDTH, 0.08571428571428572 * IMAGE_HEIGHT, 0.8285714285714286 * IMAGE_WIDTH, 0.08163265306122448 * IMAGE_HEIGHT, 0.8285714285714286 * IMAGE_WIDTH, 0.08163265306122448 * IMAGE_HEIGHT);
        HANDLE.curveTo(0.8285714285714286 * IMAGE_WIDTH, 0.08163265306122448 * IMAGE_HEIGHT, 0.8244897959183674 * IMAGE_WIDTH, 0.07346938775510205 * IMAGE_HEIGHT, 0.8285714285714286 * IMAGE_WIDTH, 0.0653061224489796 * IMAGE_HEIGHT);
        HANDLE.curveTo(0.8326530612244898 * IMAGE_WIDTH, 0.061224489795918366 * IMAGE_HEIGHT, 0.8367346938775511 * IMAGE_WIDTH, 0.05714285714285714 * IMAGE_HEIGHT, 0.8367346938775511 * IMAGE_WIDTH, 0.05714285714285714 * IMAGE_HEIGHT);
        HANDLE.lineTo(0.8408163265306122 * IMAGE_WIDTH, 0.053061224489795916 * IMAGE_HEIGHT);
        HANDLE.lineTo(0.8448979591836735 * IMAGE_WIDTH, 0.04897959183673469 * IMAGE_HEIGHT);
        HANDLE.lineTo(0.8040816326530612 * IMAGE_WIDTH, 0.02857142857142857 * IMAGE_HEIGHT);
        HANDLE.curveTo(0.8040816326530612 * IMAGE_WIDTH, 0.02857142857142857 * IMAGE_HEIGHT, 0.8 * IMAGE_WIDTH, 0.036734693877551024 * IMAGE_HEIGHT, 0.8 * IMAGE_WIDTH, 0.036734693877551024 * IMAGE_HEIGHT);
        HANDLE.closePath();
        G2.setPaint(new LinearGradientPaint(new Point2D.Double(0.8040816326530612 * IMAGE_WIDTH, 0.05714285714285714 * IMAGE_HEIGHT), new Point2D.Double(0.82645417447288 * IMAGE_WIDTH, 0.06710375452430532 * IMAGE_HEIGHT), new float[]{0.0f, 1.0f}, new Color[]{new Color(0.5215686275f, 0.5215686275f, 0.5215686275f, 1f), new Color(0.7137254902f, 0.7137254902f, 0.7137254902f, 1f)}));
        G2.fill(HANDLE);

        final GeneralPath TOP_FRAME = new GeneralPath();
        TOP_FRAME.setWindingRule(Path2D.WIND_EVEN_ODD);
        TOP_FRAME.moveTo(0.8 * IMAGE_WIDTH, 0.024489795918367346 * IMAGE_HEIGHT);
        TOP_FRAME.curveTo(0.8040816326530612 * IMAGE_WIDTH, 0.0163265306122449 * IMAGE_HEIGHT, 0.8204081632653061 * IMAGE_WIDTH, 0.012244897959183673 * IMAGE_HEIGHT, 0.8367346938775511 * IMAGE_WIDTH, 0.02040816326530612 * IMAGE_HEIGHT);
        TOP_FRAME.curveTo(0.8489795918367347 * IMAGE_WIDTH, 0.02857142857142857 * IMAGE_HEIGHT, 0.8612244897959184 * IMAGE_WIDTH, 0.04081632653061224 * IMAGE_HEIGHT, 0.8571428571428571 * IMAGE_WIDTH, 0.053061224489795916 * IMAGE_HEIGHT);
        TOP_FRAME.curveTo(0.8530612244897959 * IMAGE_WIDTH, 0.061224489795918366 * IMAGE_HEIGHT, 0.8367346938775511 * IMAGE_WIDTH, 0.0653061224489796 * IMAGE_HEIGHT, 0.8204081632653061 * IMAGE_WIDTH, 0.05714285714285714 * IMAGE_HEIGHT);
        TOP_FRAME.curveTo(0.8040816326530612 * IMAGE_WIDTH, 0.04897959183673469 * IMAGE_HEIGHT, 0.7959183673469388 * IMAGE_WIDTH, 0.0326530612244898 * IMAGE_HEIGHT, 0.8 * IMAGE_WIDTH, 0.024489795918367346 * IMAGE_HEIGHT);
        TOP_FRAME.closePath();
        G2.setPaint(new Color(0.5490196078f, 0.5490196078f, 0.5490196078f, 1f));
        G2.fill(TOP_FRAME);

        final GeneralPath TOP = new GeneralPath();
        TOP.setWindingRule(Path2D.WIND_EVEN_ODD);
        TOP.moveTo(0.8040816326530612 * IMAGE_WIDTH, 0.024489795918367346 * IMAGE_HEIGHT);
        TOP.curveTo(0.8081632653061225 * IMAGE_WIDTH, 0.0163265306122449 * IMAGE_HEIGHT, 0.8204081632653061 * IMAGE_WIDTH, 0.0163265306122449 * IMAGE_HEIGHT, 0.8326530612244898 * IMAGE_WIDTH, 0.02040816326530612 * IMAGE_HEIGHT);
        TOP.curveTo(0.8489795918367347 * IMAGE_WIDTH, 0.02857142857142857 * IMAGE_HEIGHT, 0.8571428571428571 * IMAGE_WIDTH, 0.04081632653061224 * IMAGE_HEIGHT, 0.8530612244897959 * IMAGE_WIDTH, 0.04897959183673469 * IMAGE_HEIGHT);
        TOP.curveTo(0.8489795918367347 * IMAGE_WIDTH, 0.061224489795918366 * IMAGE_HEIGHT, 0.8326530612244898 * IMAGE_WIDTH, 0.061224489795918366 * IMAGE_HEIGHT, 0.8204081632653061 * IMAGE_WIDTH, 0.053061224489795916 * IMAGE_HEIGHT);
        TOP.curveTo(0.8081632653061225 * IMAGE_WIDTH, 0.044897959183673466 * IMAGE_HEIGHT, 0.8 * IMAGE_WIDTH, 0.0326530612244898 * IMAGE_HEIGHT, 0.8040816326530612 * IMAGE_WIDTH, 0.024489795918367346 * IMAGE_HEIGHT);
        TOP.closePath();
        G2.setPaint(new LinearGradientPaint(new Point2D.Double(0.8367346938775511 * IMAGE_WIDTH, 0.05714285714285714 * IMAGE_HEIGHT), new Point2D.Double(0.8184730486782295 * IMAGE_WIDTH, 0.016126530473189345 * IMAGE_HEIGHT), new float[]{0.0f, 1.0f}, new Color[]{new Color(1f, 1f, 1f, 1f), new Color(0.8784313725f, 0.8784313725f, 0.8784313725f, 1f)}));
        G2.fill(TOP);

        G2.dispose();
        return IMAGE;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Misc">
	@Override
	public String toString() {
		return "StickyNote2";
	}
    // </editor-fold>
}

