/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.abcfiletype;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import org.netbeans.core.spi.multiview.CloseOperationState;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.MultiViewElementCallback;
import org.openide.awt.UndoRedo;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;

@MultiViewElement.Registration(displayName = "#LBL_Abc_VISUAL2",
iconBase = "org/myorg/abcfiletype/Datasource.gif",
mimeType = "text/x-abc",
persistenceType = TopComponent.PERSISTENCE_NEVER,
preferredID = "AbcVisual2",
position = 3000)
@NbBundle.Messages({
    "LBL_Abc_VISUAL2=Visual2"
})
public class AbcVisualElement2 extends JPanel implements MultiViewElement {

    private AbcDataObject obj;
    private JToolBar toolbar = new JToolBar();
    private transient MultiViewElementCallback callback;

    public AbcVisualElement2(Lookup lkp) {
        obj = lkp.lookup(AbcDataObject.class);
        assert obj != null;
    }

    @Override
    public String getName() {
        return "AbcVisualElement2";
    }
    
    @Override
    public JComponent getVisualRepresentation() {
        return this;
    }

    @Override
    public JComponent getToolbarRepresentation() {
        return toolbar;
    }

    @Override
    public Action[] getActions() {
        return new Action[0];
    }

    @Override
    public Lookup getLookup() {
        return obj.getLookup();
    }

    @Override
    public void componentOpened() {
    }

    @Override
    public void componentClosed() {
    }

    @Override
    public void componentShowing() {
    }

    @Override
    public void componentHidden() {
    }

    @Override
    public void componentActivated() {
    }

    @Override
    public void componentDeactivated() {
    }

    @Override
    public UndoRedo getUndoRedo() {
        return UndoRedo.NONE;
    }

    @Override
    public void setMultiViewCallback(MultiViewElementCallback callback) {
        this.callback = callback;
    }

    @Override
    public CloseOperationState canCloseElement() {
        return CloseOperationState.STATE_OK;
    }
    
}