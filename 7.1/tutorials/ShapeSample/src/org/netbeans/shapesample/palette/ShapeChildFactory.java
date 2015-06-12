package org.netbeans.shapesample.palette;

import java.util.List;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;

public class ShapeChildFactory extends ChildFactory<Shape> {

    private final Category category;

    ShapeChildFactory(Category category) {
        this.category = category;
    }

    @Override
    protected boolean createKeys(List<Shape> list) {
        list.add(new Shape(0, category.getName(), "org/netbeans/shapesample/palette/image1.png"));
        list.add(new Shape(1, category.getName(), "org/netbeans/shapesample/palette/image2.png"));
        list.add(new Shape(2, category.getName(), "org/netbeans/shapesample/palette/image3.png"));
        return true;
    }

    @Override
    protected Node createNodeForKey(Shape key) {
        return new ShapeNode(key);
    }

    public class ShapeNode extends AbstractNode {
        public ShapeNode(Shape key) {
            super(Children.LEAF);
            setIconBaseWithExtension(key.getImage());
        }
    }
    
}