/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.runway.dostoyevsky;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.openide.util.lookup.ServiceProvider;
import org.runway.api.Engineer;
import org.runway.api.RunWay;

/**
 *
 * @author geertjan
 */
@ServiceProvider(service = RunWay.class)
public class Dostoyevsky implements RunWay {

    @Override
    public String getName() {
        return "Dostoyevsky";
    }

    @Override
    public URL getImageLoc() {
        return Dostoyevsky.class.getResource("dostoyevsky.jpeg");
    }

    @Override
    public String getDescription() {
        return "Dostoyevsky runway";
    }

    @Override
    public int getNoOfPlanesPerDay() {
        return 5;
    }

    @Override
    public List<Engineer> getEngineers() {
        return Arrays.asList(new Engineer("Nicolai"));
    }
}
