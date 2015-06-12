
package org.demo;

import java.util.ArrayList;
import org.openide.nodes.ChildFactory;
import org.openide.util.ChangeSupport;

public class Utils {

    private static ChangeSupport cs;
    
    public static ChangeSupport getChangeSupport(ChildFactory.Detachable<BusinessObject> kids) {
        if (cs == null) {
            cs = new ChangeSupport(kids);
        }
        return cs;
    }
    
    private static ArrayList createdArrayList;
    
    public static ArrayList getCreatedArrayList() {
        if (createdArrayList == null) {
            createdArrayList = new ArrayList();
        }
        return createdArrayList;
    }

    private static ArrayList selectedArrayList;
    
    public static ArrayList getSelectededArrayList() {
        if (selectedArrayList == null) {
            selectedArrayList = new ArrayList();
        }
        return selectedArrayList;
    }
    
}
