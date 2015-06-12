/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.damaico.parts.brick;

import de.damaico.brick.api.Brick;

/**
 *
 * @author pohl
 */
public class MasterBrick extends T
{

    @Override
    public String getUniqueName()
    {
        return "Master Brick";
    }

    @Override
    public String getImageResource()
    {
        return "de/damaico/brick/viewer/resources/rotary_poti.png";
    }
    
}
