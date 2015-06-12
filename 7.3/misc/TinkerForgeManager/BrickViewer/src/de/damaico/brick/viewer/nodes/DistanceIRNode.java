package de.damaico.brick.viewer.nodes;

import com.tinkerforge.Device;
import java.beans.IntrospectionException;
import org.netbeans.api.annotations.common.StaticResource;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

public class DistanceIRNode extends BeanNode {
    
    @StaticResource
    private static final String IMAGE = "de/damaico/brick/viewer/resources/distance.png";

    public DistanceIRNode(Device di) throws IntrospectionException {
        super(di, Children.LEAF, Lookups.singleton(di));
        setIconBaseWithExtension(IMAGE);
    }
    
}
