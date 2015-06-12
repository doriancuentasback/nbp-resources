/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.cdcatalog.viewer;

import java.beans.IntrospectionException;
import org.netbeans.cdcatalog.domain.CD;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

public class CDNode extends BeanNode {

    public CDNode(CD bean) throws IntrospectionException {
        super(bean, Children.LEAF, Lookups.singleton(bean));
        setDisplayName(bean.getTitle());
        setShortDescription(bean.getArtist());
    }
    
}
