/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.abcfiletype;

import java.awt.BorderLayout;
import java.awt.Point;
import java.util.List;
import javax.swing.JPanel;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.widget.LabelWidget;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Scene;
import org.openide.filesystems.FileChangeAdapter;
import org.openide.filesystems.FileEvent;

public class AbcVisualElementPanel extends JPanel {

    public AbcVisualElementPanel(final AbcDataObject dobj) {
        setLayout(new BorderLayout());
        final Scene scene = new Scene();
        final LayerWidget layer = new LayerWidget(scene);
        refresh(scene, layer, dobj);
        dobj.getPrimaryFile().addFileChangeListener(new FileChangeAdapter() {
            @Override
            public void fileChanged(FileEvent fe) {
                layer.removeChildren();
                refresh(scene, layer, dobj);
                scene.validate();
            }
        });
        scene.addChild(layer);
        add(scene.createView(), BorderLayout.CENTER);
    }

    private void refresh(Scene scene, LayerWidget layer, AbcDataObject dobj) {
        try {
            List<String> lines = dobj.getPrimaryFile().asLines();
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                LabelWidget widget = new LabelWidget(scene, line);
                widget.getActions().addAction(ActionFactory.createMoveAction());
                widget.setPreferredLocation(new Point(20, 90 * i));
                layer.addChild(widget);
            }
        } catch (Exception e) {
        }
    }
    
}
