/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.cdcatalog.viewer;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;
import java.util.prefs.Preferences;
import org.netbeans.cdcatalog.domain.CD;
import org.netbeans.cdcatalog.utilities.CdDatabase;
import org.netbeans.cdcatalog.validator.api.CDValidatorInterface;
import org.openide.awt.StatusDisplayer;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.NbPreferences;

public class CDChildFactory extends ChildFactory<CD>
        implements PreferenceChangeListener {

    public CDChildFactory() {
        Preferences refreshPref = NbPreferences.forModule(CD.class);
        refreshPref.addPreferenceChangeListener(this);
    }

    @Override
    protected boolean createKeys(List<CD> list) {
        ArrayList<CD> cdDatabase = CdDatabase.getInstance().getCds();
        for (CD cd : cdDatabase) {
            boolean allOK = true;
            Collection<? extends CDValidatorInterface> allValidators 
                    = Lookup.getDefault().
                    lookupAll(CDValidatorInterface.class);
            for (CDValidatorInterface oneValidator : allValidators) {
                if (!oneValidator.validate(cd)) {
                    allOK = false;
                }
            }
            if (allOK) {
                list.add(cd);
            } else {
                StatusDisplayer.getDefault().setStatusText("Failed: " + cd.getArtist());
            }
        }
        return true;
    }

    @Override
    protected Node createNodeForKey(CD key) {
        Node cdNode = null;
        try {
            cdNode = new CDNode(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return cdNode;
    }

    @Override
    public void preferenceChange(PreferenceChangeEvent evt) {
        refresh(true);
        NbPreferences.forModule(CD.class).putBoolean(
                "refresh", false);
    }
}
