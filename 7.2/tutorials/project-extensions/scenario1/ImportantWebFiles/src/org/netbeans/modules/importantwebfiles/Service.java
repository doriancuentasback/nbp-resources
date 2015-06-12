package org.netbeans.modules.importantwebfiles;

import javax.swing.JOptionPane;

public abstract class Service {

    static {
        JOptionPane.showMessageDialog(null, "===> loading Service");
    }

    public abstract String m();
    
}