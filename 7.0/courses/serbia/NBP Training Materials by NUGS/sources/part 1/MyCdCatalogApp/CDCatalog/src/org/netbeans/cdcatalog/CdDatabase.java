/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.cdcatalog;

import java.util.ArrayList;

public class CdDatabase {

    private static CdDatabase instance;
    private ArrayList<CD> cds = new ArrayList<CD>();

    private CdDatabase() {

    }

    public static CdDatabase getInstance() {
        if (instance == null) {
            instance = new CdDatabase();
        }

        return instance;
    }

    public void addCd(CD cd) {
        cds.add(cd);
    }

    public ArrayList<CD> getCds() {
        return cds;
    }




}
