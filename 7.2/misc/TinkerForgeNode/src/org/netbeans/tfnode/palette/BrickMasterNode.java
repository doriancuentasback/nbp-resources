package org.netbeans.tfnode.palette;

import com.tinkerforge.BrickMaster;
import java.beans.IntrospectionException;
import org.netbeans.api.annotations.common.StaticResource;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

public class BrickMasterNode extends BeanNode {
    
    @StaticResource
    private static final String IMAGE = "org/netbeans/tfnode/palette/master.png";

    public BrickMasterNode(BrickMaster bm) throws IntrospectionException {
        super(bm, Children.LEAF, Lookups.singleton(bm));
        setIconBaseWithExtension(IMAGE);
    }
    
}
