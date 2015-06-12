package org.netbeans.tfnode.palette;

import com.tinkerforge.Device;
import java.beans.IntrospectionException;
import org.netbeans.api.annotations.common.StaticResource;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

public class AmbientLightNode extends BeanNode {

    @StaticResource
    private static final String IMAGE = "org/netbeans/tfnode/palette/ambientLight.png";
    
    public AmbientLightNode(Device di) throws IntrospectionException {
        super(di, Children.LEAF, Lookups.singleton(di));
        setIconBaseWithExtension(IMAGE);
    }

}
