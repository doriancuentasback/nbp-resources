package org.netbeans.paint;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JToolBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ColorComboBox;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

@TopComponent.Description(
        preferredID = "PaintTopComponent",
        iconBase = "/org/netbeans/paint/new_icon.png", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(
        mode = "editor", 
        openAtStartup = true)
@ActionID(
        category = "Window", 
        id = "org.netbeans.paint.PaintTopComponent")
@ActionReferences({
    @ActionReference(
        path = "Menu/Window", 
        position = 0),
    @ActionReference(
        path = "Toolbars/File", 
        position = 0)
})
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_NewCanvasAction")
@Messages({
        "CTL_NewCanvasAction=New Canvas",
        "LBL_Clear=Clear",
        "LBL_Foreground=Foreground",
        "LBL_BrushSize=Brush Size",
        "# {0} - image",
        "UnsavedImageNameFormat=Image {0}"})
public class PaintTopComponent extends TopComponent implements ActionListener, ChangeListener {

        private PaintCanvas canvas = new PaintCanvas(); //The component the user draws on
    private final JComponent preview = canvas.getBrushSizeView(); //A component in the toolbar that shows the paintbrush size
    private final JSlider brushSizeSlider = new JSlider(1, 24); //A slider to set the brush size
    private final JToolBar toolbar = new JToolBar(); //The toolbar
    private final ColorComboBox color = new ColorComboBox(); //Our color chooser component from the ColorChooser library
    private final JButton clear = new JButton(Bundle.LBL_Clear()); //A button to clear the canvas
    private final JLabel label = new JLabel(Bundle.LBL_Foreground()); //A label for the color chooser
    private final JLabel brushSizeLabel = new JLabel(Bundle.LBL_BrushSize()); //A label for the brush size slider
    private static int ct = 0; //A counter you use to provide names for new images

    public PaintTopComponent() {
        initComponents();
        setDisplayName(Bundle.UnsavedImageNameFormat(ct++));
    }

    private void initComponents() {
        
        setLayout(new BorderLayout());

        //Configure our components, attach listeners:
        color.addActionListener(this);
        clear.addActionListener(this);
        brushSizeSlider.setValue(canvas.getBrushDiameter());
        brushSizeSlider.addChangeListener(this);
        color.setSelectedColor(canvas.getColor());
        color.setMaximumSize(new Dimension(16, 16));

        //Install the toolbar and the painting component:
        add(toolbar, BorderLayout.NORTH);
        add(new JScrollPane(canvas), BorderLayout.CENTER);

        //Configure the toolbar:
        toolbar.setLayout(new FlowLayout(FlowLayout.LEFT, 7, 7));
        toolbar.setFloatable(false);

        //Now populate our toolbar:
        toolbar.add(label);
        toolbar.add(color);
        toolbar.add(brushSizeLabel);
        toolbar.add(brushSizeSlider);
        toolbar.add(preview);
        toolbar.add(clear);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            canvas.clear();
        } else if (e.getSource() instanceof ColorComboBox) {
            ColorComboBox cc = (ColorComboBox) e.getSource();
            canvas.setColor(cc.getSelectedColor());
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        canvas.setBrushDiameter(brushSizeSlider.getValue());
    }
    
}
