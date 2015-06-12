/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.damaico.brick.viewer.options;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JComponent;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.util.HelpCtx;
import org.openide.util.Lookup;

@OptionsPanelController.SubRegistration(
    location = "Advanced",
displayName = "#AdvancedOption_DisplayName_Tinkerforge",
keywords = "#AdvancedOption_Keywords_Tinkerforge",
keywordsCategory = "Advanced/Tinkerforge")
@org.openide.util.NbBundle.Messages(
{
    "AdvancedOption_DisplayName_Tinkerforge=Tinkerforge", "AdvancedOption_Keywords_Tinkerforge=Tinkerforge TF Brick Bricklet"
})
public final class TinkerforgeOptionsPanelController extends OptionsPanelController
{

    private TinkerforgePanel panel;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private boolean changed;

    public void update()
    {
        getPanel().load();
        changed = false;
    }

    public void applyChanges()
    {
        getPanel().store();
        changed = false;
    }

    public void cancel()
    {
        // need not do anything special, if no changes have been persisted yet
    }

    public boolean isValid()
    {
        return getPanel().valid();
    }

    @Override
    public boolean isChanged()
    {
        return changed;
    }

    @Override
    public HelpCtx getHelpCtx()
    {
        return null; // new HelpCtx("...ID") if you have a help set
    }

    @Override
    public JComponent getComponent(Lookup masterLookup)
    {
        return getPanel();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener l)
    {
        pcs.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l)
    {
        pcs.removePropertyChangeListener(l);
    }

    private TinkerforgePanel getPanel()
    {
        if (panel == null)
        {
            panel = new TinkerforgePanel(this);
        }
        return panel;
    }

    void changed()
    {
        if (!changed)
        {
            changed = true;
            pcs.firePropertyChange(OptionsPanelController.PROP_CHANGED, false, true);
        }
        pcs.firePropertyChange(OptionsPanelController.PROP_VALID, null, null);
    }
}
