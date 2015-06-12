/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.cdcatalog.validator.zeljko;

import org.netbeans.cdcatalog.domain.CD;
import org.netbeans.cdcatalog.validator.api.CDValidatorInterface;
import org.openide.util.lookup.ServiceProvider;



@ServiceProvider(service=CDValidatorInterface.class)
public class ZeljkoValidator implements CDValidatorInterface {

    @Override
    public boolean validate(CD cd) {
        if (cd.getArtist().equals("Zeljko")){
            return false;
        } else {
            return true;
        }
    }

}
