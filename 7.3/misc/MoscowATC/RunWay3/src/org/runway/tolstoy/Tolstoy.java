/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.runway.tolstoy;

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
public class Tolstoy implements RunWay {

    @Override
    public String getName() {
        return "Tolstoy";
    }

    @Override
    public String getDescription() {
        return "Tolstoy runway";
    }

    @Override
    public URL getImageLoc() {
        return Tolstoy.class.getResource("tolstoy.jpg");
    }

    @Override
    public int getNoOfPlanesPerDay() {
        return 16;
    }

    @Override
    public List<Engineer> getEngineers() {
        return Arrays.asList(new Engineer("Boris"), new Engineer("Alexander"), new Engineer("Henry"));
    }
}
