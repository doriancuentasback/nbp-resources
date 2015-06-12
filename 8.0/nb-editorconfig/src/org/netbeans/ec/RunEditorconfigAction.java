package org.netbeans.ec;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import org.editorconfig.core.EditorConfig;
import org.editorconfig.core.EditorConfigException;
import org.editorconfig.core.PythonException;
import org.netbeans.api.editor.settings.SimpleValueNames;
import org.netbeans.modules.editor.indent.spi.CodeStylePreferences;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OutputWriter;
@ActionID(
        category = "Tools",
        id = "org.netbeans.ec.RunEditorconfigAction"
)
@ActionRegistration(
        iconBase = "org/netbeans/ec/editorconfig.png",
        displayName = "#CTL_RunEditorconfigAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Source", position = 200),
    @ActionReference(path = "Toolbars/Clipboard", position = 0)
})
@Messages("CTL_RunEditorconfigAction=Run EditorConfig")
public final class RunEditorconfigAction implements ActionListener {
    private final DataObject dobj;
    public RunEditorconfigAction(DataObject dobj) {
        this.dobj = dobj;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        InputOutput io = IOProvider.getDefault().getIO("EditorConfig", true);
        io.select();
        OutputWriter writer = io.getOut();
        StatusDisplayer.getDefault().setStatusText(dobj.getPrimaryFile().getPath());
        EditorConfig ec;
        try {
            ec = new EditorConfig();
            List<EditorConfig.OutPair> l = null;
            l = ec.getProperties(dobj.getPrimaryFile().getPath());
            for (int i = 0; i < l.size(); ++i) {
                writer.println(l.get(i).getKey() + "=" + l.get(i).getVal());
                if (l.get(i).getKey().equals("indent_size")) {
                    doIndentSize(
                            dobj.getPrimaryFile(),
                            Integer.valueOf(l.get(i).getVal()));
                }
            }
            writer.close();
        } catch (PythonException ex) {
            Exceptions.printStackTrace(ex);
        } catch (EditorConfigException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
    public static final String indentSize = SimpleValueNames.INDENT_SHIFT_WIDTH;
    private void doIndentSize(FileObject file, int value) {
        Preferences prefs = CodeStylePreferences.get(file, file.getMIMEType()).getPreferences();
        prefs.putInt(indentSize, value);
        try {
            prefs.flush();
        } catch (BackingStoreException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
