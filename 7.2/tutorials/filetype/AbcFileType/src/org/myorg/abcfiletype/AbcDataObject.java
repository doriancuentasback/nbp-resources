/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.abcfiletype;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.text.MultiViewEditorElement;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.MIMEResolver;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.nodes.PropertySupport.ReadOnly;
import org.openide.nodes.Sheet;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

@Messages({
    "LBL_Abc_LOADER=Files of Abc"
})
@MIMEResolver.ExtensionRegistration(
    displayName = "#LBL_Abc_LOADER",
mimeType = "text/x-abc",
extension = {"abc", "ABC"})
@DataObject.Registration(
    mimeType = "text/x-abc",
iconBase = "org/myorg/abcfiletype/Datasource.gif",
displayName = "#LBL_Abc_LOADER",
position = 300)
@ActionReferences({
    @ActionReference(
        path = "Loaders/text/x-abc/Actions",
    id =
    @ActionID(category = "System", id = "org.openide.actions.OpenAction"),
    position = 100,
    separatorAfter = 200),
    @ActionReference(
        path = "Loaders/text/x-abc/Actions",
    id =
    @ActionID(category = "Edit", id = "org.openide.actions.CutAction"),
    position = 300),
    @ActionReference(
        path = "Loaders/text/x-abc/Actions",
    id =
    @ActionID(category = "Edit", id = "org.openide.actions.CopyAction"),
    position = 400,
    separatorAfter = 500),
    @ActionReference(
        path = "Loaders/text/x-abc/Actions",
    id =
    @ActionID(category = "Edit", id = "org.openide.actions.DeleteAction"),
    position = 600),
    @ActionReference(
        path = "Loaders/text/x-abc/Actions",
    id =
    @ActionID(category = "System", id = "org.openide.actions.RenameAction"),
    position = 700,
    separatorAfter = 800),
    @ActionReference(
        path = "Loaders/text/x-abc/Actions",
    id =
    @ActionID(category = "System", id = "org.openide.actions.SaveAsTemplateAction"),
    position = 900,
    separatorAfter = 1000),
    @ActionReference(
        path = "Loaders/text/x-abc/Actions",
    id =
    @ActionID(category = "System", id = "org.openide.actions.FileSystemAction"),
    position = 1100,
    separatorAfter = 1200),
    @ActionReference(
        path = "Loaders/text/x-abc/Actions",
    id =
    @ActionID(category = "System", id = "org.openide.actions.ToolsAction"),
    position = 1300),
    @ActionReference(
        path = "Loaders/text/x-abc/Actions",
    id =
    @ActionID(category = "System", id = "org.openide.actions.PropertiesAction"),
    position = 1400)
})
public class AbcDataObject extends MultiDataObject {

    public AbcDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        registerEditor("text/x-abc", true);
    }

    @Override
    protected int associateLookup() {
        return 1;
    }

    @Override
    protected Node createNodeDelegate() {
        return new AbcNode(this, Children.create(new AbcChildFactory(this), true), getLookup());
    }

    class AbcNode extends DataNode {

        public AbcNode(AbcDataObject aThis, Children kids, Lookup lookup) {
            super(aThis, kids, lookup);
        }

        @Override
        protected Sheet createSheet() {
            Sheet sheet = super.createSheet();
            Sheet.Set set = Sheet.createPropertiesSet();
            sheet.put(set);
            set.put(new LineCountProperty(this));
            return sheet;
        }

        private class LineCountProperty extends ReadOnly<Integer> {

            private final AbcNode node;

            public LineCountProperty(AbcNode node) {
                super("lineCount", Integer.class, "Line Count", "Number of Lines");
                this.node = node;
            }

            @Override
            public Integer getValue() throws IllegalAccessException, InvocationTargetException {
                int lineCount = 0;
                DataObject abcDobj = node.getDataObject();
                FileObject abcFo = abcDobj.getPrimaryFile();
                try {
                    lineCount = abcFo.asLines().size();
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
                return lineCount;
            }
        }
    }

    private static class AbcChildFactory extends ChildFactory<String> {

        private final AbcDataObject dObj;

        public AbcChildFactory(AbcDataObject dObj) {
            this.dObj = dObj;
        }

        @Override
        protected boolean createKeys(List list) {
            FileObject fObj = dObj.getPrimaryFile();
            try {
                List<String> dObjContent = fObj.asLines();
                list.addAll(dObjContent);
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
            return true;
        }

        @Override
        protected Node createNodeForKey(String key) {
            Node childNode = new AbstractNode(Children.LEAF);
            childNode.setDisplayName(key);
            return childNode;
        }
    }

    @MultiViewElement.Registration(
        displayName = "#LBL_Abc_EDITOR",
    iconBase = "org/myorg/abcfiletype/Datasource.gif",
    mimeType = "text/x-abc",
    persistenceType = TopComponent.PERSISTENCE_ONLY_OPENED,
    preferredID = "Abc",
    position = 1000)
    @Messages("LBL_Abc_EDITOR=Source")
    public static MultiViewEditorElement createEditor(Lookup lkp) {
        return new MultiViewEditorElement(lkp);
    }
}
