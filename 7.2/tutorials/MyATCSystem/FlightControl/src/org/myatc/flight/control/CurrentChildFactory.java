/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myatc.flight.control;

import com.bbn.openmap.proj.coords.LatLonPoint;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.util.List;
import org.openide.explorer.ExplorerManager;
import org.openide.filesystems.FileUtil;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.windows.WindowManager;

/**
 *
 * @author Geertjan
 */
public class CurrentChildFactory extends ChildFactory.Detachable<String> implements LookupListener {

    Lookup.Result<Point2D> location;
    boolean latCorrect = false;
    boolean longCorrect = false;
    private final ExplorerManager em;

    CurrentChildFactory(ExplorerManager em) {
        this.em = em;
    }

    @Override
    protected boolean createKeys(List<String> list) {
        if (location.allInstances().iterator().hasNext()) {
            Point2D loc = location.allInstances().iterator().next();
            LatLonPoint latLonPoint = LatLonPoint.getFloat(loc);
            em.getRootContext().setDisplayName("Current: Long=" + latLonPoint.getLongitude() + "/Lat=" + latLonPoint.getLatitude() + "\n");
            try {
                List<String> lines = FileUtil.getConfigFile("CSV/cities").asLines();
                for (String line : lines) {
                    String[] split = line.split(",");
                    for (int i = 0; i < split.length; i++) {
                        String string = split[i];
                        if (i == 4) {
                            final String firstTwoCharsOfLon = String.valueOf(latLonPoint.getLongitude()).substring(0, 2);
                            if (string.startsWith(firstTwoCharsOfLon)) {
                                longCorrect = true;
                            } else {
                                longCorrect = false;
                            }
                        } else if (i == 5) {
                            final String firstTwoCharsOfLat = String.valueOf(latLonPoint.getLatitude()).substring(0, 2);
                            if (string.startsWith(firstTwoCharsOfLat)) {
                                latCorrect = true;
                            } else {
                                latCorrect = false;
                            }
                        }
                    }
                    if (latCorrect && longCorrect) {
                        list.add(line);
                        latCorrect = false;
                        longCorrect = false;
                    } else {
                    }
                }
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return true;
    }

    @Override
    protected Node createNodeForKey(String key) {
        Node node = new AbstractNode(Children.LEAF);
        node.setDisplayName(key);
        return node;
    }

    @Override
    public void resultChanged(LookupEvent le) {
        refresh(false);
    }

    @Override
    protected void addNotify() {
        location = WindowManager.getDefault().findTopComponent("MapTopComponent").getLookup().lookupResult(Point2D.class);
        location.addLookupListener(this);
    }

    @Override
    protected void removeNotify() {
        location.removeLookupListener(this);
    }
    
}
