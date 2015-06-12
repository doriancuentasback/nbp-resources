package org.netbeans.tfnode.palette;

import com.tinkerforge.BrickletLCD20x4;
import java.awt.event.ActionEvent;
import java.beans.IntrospectionException;
import javax.swing.AbstractAction;
import javax.swing.Action;
import org.netbeans.api.annotations.common.StaticResource;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

public class LCD2044Node extends BeanNode {

    @StaticResource
    private static final String IMAGE = "org/netbeans/tfnode/palette/lcd.png";
    private final InstanceContent ic;
    private final BrickletLCD20x4 lcdBricket;
    
    public LCD2044Node(BrickletLCD20x4 lcdBricklet, InstanceContent ic) throws IntrospectionException {
        super(lcdBricklet, Children.LEAF, new AbstractLookup(ic));
        this.ic = ic;
        this.lcdBricket = lcdBricklet;
        setIconBaseWithExtension(IMAGE);
    }

    @Override
    public Action getPreferredAction() {
        return new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                TopComponent lcdEditor = WindowManager.getDefault().findTopComponent("LCD20x4EditorTopComponent");
                lcdEditor.open();
                lcdEditor.requestActive();
                ic.add(lcdBricket);
            }
        };
    }

}
