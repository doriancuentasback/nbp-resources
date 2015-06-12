package org.gheditor.visual.items.filesupport;

import java.io.IOException;
import java.util.Properties;
import java.util.UUID;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.MIMEResolver;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.Lookups;

@Messages({
    "LBL_Item_LOADER=Files of Item"
})
@MIMEResolver.ExtensionRegistration(
        displayName = "#LBL_Item_LOADER",
        mimeType = "text/x-palette-item",
        extension = "item"
)
@DataObject.Registration(
        mimeType = "text/x-palette-item",
        displayName = "#LBL_Item_LOADER",
        position = 300
)
public class ItemDataObject extends MultiDataObject {
    Properties props;
    public ItemDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        registerEditor("text/x-palette-item", false);
        props = new Properties();
        props.load(pf.getInputStream());
    }
    @Override
    protected int associateLookup() {
        return 1;
    }
    @Override
    protected Node createNodeDelegate() {
        int w = Integer.parseInt(props.getProperty("width"));
        int h = Integer.parseInt(props.getProperty("height"));
        String name = props.getProperty("displayName");
        String type = props.getProperty("type");
        String icon16 = props.getProperty("icon16");
        Item item = new Item(type, name, w, h, 0, 0, icon16);
        AbstractNode paletteNode = 
                new AbstractNode(Children.LEAF, 
                Lookups.singleton(item));
        paletteNode.setDisplayName(props.getProperty("displayName"));
        paletteNode.setIconBaseWithExtension(props.getProperty("icon16"));
        return paletteNode;
    }
}
