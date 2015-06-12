package org.myapp.core;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.openide.modules.OnStart;

@OnStart
public class Startable implements Runnable {
    @Override
    public void run() {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//            UIManager.put("nb.dark.theme", Boolean.TRUE);
//            UIManager.put("NbMainWindow.showCustomBackground", Boolean.TRUE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Startable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Startable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Startable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Startable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
