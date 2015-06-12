/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.runway.api;

import java.net.URL;
import java.util.List;

/**
 *
 * @author geertjan
 */
public interface RunWay {

    public String getName();

    public String getDescription();

    public int getNoOfPlanesPerDay();

    public URL getImageLoc();

    public List<Engineer> getEngineers();
}
