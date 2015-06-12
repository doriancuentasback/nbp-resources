package org.netbeans.r2d;

import com.tinkerforge.BrickMaster;
import com.tinkerforge.BrickletLCD20x4;
import com.tinkerforge.BrickletRotaryPoti;
import com.tinkerforge.IPConnection;
import javax.swing.Action;
import javax.swing.JMenuItem;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.openide.awt.Actions;
import org.openide.modules.OnStart;
import org.openide.util.Utilities;

@OnStart
public class Rotate2DeployRunnable implements Runnable {

    private static final String HOST = "localhost";
    private static final int PORT = 4223;
    private static final String MASTERBRICKUID = "abc";
    private static final String LCDUID = "abc";
    private static final String ROTIUID = "abc";
    private static IPConnection ipc;
    private static BrickMaster master = new BrickMaster(MASTERBRICKUID);
    private static BrickletLCD20x4 lcd = new BrickletLCD20x4(LCDUID);
    private static BrickletRotaryPoti poti = new BrickletRotaryPoti(ROTIUID);

    @Override
    public void run() {
        try {
            ipc = new IPConnection(HOST, PORT);
            ipc.addDevice(master);
            ipc.addDevice(lcd);
            ipc.addDevice(poti);
            poti.setPositionCallbackPeriod(50);
            poti.addListener(new BrickletRotaryPoti.PositionListener() {
                @Override
                public void position(final short position) {
                    lcd.backlightOn();
                    lcd.clearDisplay();
                    final Action runAction =
                            Actions.forID("Project", "org.netbeans.modules.project.ui.RunMainProject");
                    //The action must be invoked from menu item or toolbar button,
                    //see line 147 in org.netbeans.modules.project.ui.actions.LookupSensitiveAction:
                    JMenuItem jmi = new JMenuItem(runAction);
                    //When position is 100 (range is -150 to 150), deploy the app
                    //and print info about the project to the LCD display:
                    if (position == 100) {
                        jmi.doClick();
                        Project p = Utilities.actionsGlobalContext().lookup(Project.class);
                        lcd.writeLine((short) 0, (short) 0, "Deployed:");
                        lcd.writeLine((short) 1, (short) 0, ProjectUtils.getInformation(p).getDisplayName());
                    } else {
                        lcd.writeLine((short) 0, (short) 0, "Position: " + position);
                    }
                }
            });
        } catch (Exception e) {
        }
    }
    
}
