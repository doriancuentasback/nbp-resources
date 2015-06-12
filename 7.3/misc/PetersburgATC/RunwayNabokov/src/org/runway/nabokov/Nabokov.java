/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.runway.nabokov;

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
public class Nabokov implements RunWay {

    @Override
    public String getName() {
        return "Nabokov";
    }

    @Override
    public String getDescription() {
        return "Nabokov runway";
    }

    @Override
    public int getNoOfPlanesPerDay() {
        return 2;
    }

    @Override
    public URL getImageLoc() {
        return Nabokov.class.getResource("nabokov.jpg");
    }

    @Override
    public List<Engineer> getEngineers() {
        return Arrays.asList(new Engineer("Vasily"), new Engineer("Harold"));
    }
}
