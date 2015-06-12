package tinkerforge;

import com.tinkerforge.BrickMaster;
import com.tinkerforge.BrickletAmbientLight;
import com.tinkerforge.BrickletDistanceIR;
import com.tinkerforge.BrickletLCD20x4;
import com.tinkerforge.IPConnection;

public class DemoTinkerForge {
    
    private static final String HOST = "localhost";
    private static final int PORT = 4223;
    
    private static final String MASTERBRICKUID = "9ee5edrmozP";
    private static final String DIRUID = "bdS";
    private static final String LCDUID = "bjS";
    
    private static IPConnection ipc;
    
    private static BrickMaster master = new BrickMaster(MASTERBRICKUID);
    private static BrickletDistanceIR bdir = new BrickletDistanceIR(DIRUID);
    private static BrickletLCD20x4 blcd = new BrickletLCD20x4(LCDUID);
    
    public static void main(String[] args) {
        try {
            ipc = new IPConnection(HOST, PORT);
            ipc.addDevice(master);
            ipc.addDevice(blcd);
            ipc.addDevice(bdir);
        } catch (Exception e) {
        }
    }

}
