/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.runway.pushkin;

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
public class Pushkin implements RunWay {

    @Override
    public String getName() {
        return "Pushkin";
    }

    @Override
    public String getDescription() {
        return "Pushkin runway";
    }

    @Override
    public int getNoOfPlanesPerDay() {
        return 10;
    }

    @Override
    public URL getImageLoc() {
        return Pushkin.class.getResource("pushkin.jpeg");
    }

    @Override
    public List<Engineer> getEngineers() {
        return Arrays.asList(new Engineer("Vladimir"), new Engineer("Alexander"));
    }
}
