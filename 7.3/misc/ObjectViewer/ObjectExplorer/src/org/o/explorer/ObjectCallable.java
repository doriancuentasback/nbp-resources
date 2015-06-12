package org.o.explorer;

import java.util.concurrent.Callable;
import java.util.logging.Logger;
import org.o.api.MyObject;
import org.openide.nodes.Children;

public class ObjectCallable implements Callable<Children> {

    private static final Logger LOG = Logger.getLogger(
            ObjectCallable.class.getName());
    private final MyObject key;

    public ObjectCallable(final MyObject key) {
        this.key = key;
    }

    @Override
    public Children call() throws Exception {
        if (!key.hasChildren()) {
            LOG.info("No children, returning leaf...");
            return Children.LEAF;
        } else {
            LOG.info("Children found, creating factory...");
            return Children.create(new ObjectChildFactory(key), false);
        }
    }
}
