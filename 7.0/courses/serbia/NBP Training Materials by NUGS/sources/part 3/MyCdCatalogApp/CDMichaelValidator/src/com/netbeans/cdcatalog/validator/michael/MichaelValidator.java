/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.netbeans.cdcatalog.validator.michael;

import org.netbeans.cdcatalog.domain.CD;
import org.netbeans.cdcatalog.validator.api.CDValidatorInterface;
import org.openide.util.lookup.ServiceProvider;



@ServiceProvider(service=CDValidatorInterface.class)
public class MichaelValidator implements CDValidatorInterface {

    @Override
    public boolean validate(CD cd) {
        if (cd.getArtist().equals("Michael")){
            return false;
        } else {
            return true;
        }
    }

}
