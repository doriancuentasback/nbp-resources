package org.netbeans.tfnode.palette;

import com.tinkerforge.BrickDC;
import com.tinkerforge.BrickIMU;
import com.tinkerforge.BrickMaster;
import com.tinkerforge.BrickServo;
import com.tinkerforge.BrickStepper;
import com.tinkerforge.BrickletAmbientLight;
import com.tinkerforge.BrickletAnalogIn;
import com.tinkerforge.BrickletAnalogOut;
import com.tinkerforge.BrickletCurrent12;
import com.tinkerforge.BrickletCurrent25;
import com.tinkerforge.BrickletDistanceIR;
import com.tinkerforge.BrickletDualRelay;
import com.tinkerforge.BrickletHumidity;
import com.tinkerforge.BrickletIO16;
import com.tinkerforge.BrickletIO4;
import com.tinkerforge.BrickletJoystick;
import com.tinkerforge.BrickletLCD16x2;
import com.tinkerforge.BrickletLCD20x4;
import com.tinkerforge.BrickletLinearPoti;
import com.tinkerforge.BrickletPiezoBuzzer;
import com.tinkerforge.BrickletRotaryPoti;
import com.tinkerforge.BrickletTemperature;
import com.tinkerforge.BrickletTemperatureIR;
import com.tinkerforge.BrickletVoltage;
import com.tinkerforge.Device;
import com.tinkerforge.IPConnection;
import com.tinkerforge.IPConnection.TimeoutException;
import java.beans.IntrospectionException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.lookup.InstanceContent;

public class BrickChildFactory extends ChildFactory<DeviceIdentifier> {

    private final String host = "localhost";
    private final int port = 4223;
    IPConnection ipc;

    //THIS METHOD IS AUTOMATICALLY CALLED IN THE BACKGROUND:
    @Override
    protected boolean createKeys(final List<DeviceIdentifier> list) {
        try {
            ipc = new IPConnection(host, port);
            ipc.enumerate(new IPConnection.EnumerateListener() {
                @Override
                public void enumerate(String uid, String name, short stackID, boolean isNew) {
                    if (isNew) {
                        list.add(new DeviceIdentifier(name, uid, stackID));
                    } else {
                        refresh(false);
                    }
                }
            });
        } catch (IOException ex) {
        }
        return true;
    }

    @Override
    protected Node createWaitNode() {
        return null;
    }

    @Override
    protected Node[] createNodesForKey(DeviceIdentifier model) {
        ArrayList<Node> nodes = new ArrayList<>();
        try {
            Device device = null;
            DeviceIdentifier tmpDM = model;
            String cutted = tmpDM.getName().substring(0, tmpDM.getName().trim().length() - 4).trim();
            switch (cutted) {
                case "Ambient Light Bricklet":
                    device = new BrickletAmbientLight(tmpDM.getUid());
                    nodes.add(new AmbientLightNode(device));
                    break;
                case "AnalogIn Bricklet":
                    device = new BrickletAnalogIn(tmpDM.getUid());
                    break;
                case "AnalogOut Bricklet":
                    device = new BrickletAnalogOut(tmpDM.getUid());
                    break;
                case "Buzzer Bricklet":
                    device = new BrickletPiezoBuzzer(tmpDM.getUid());
                    break;
                case "Current12 Bricklet":
                    device = new BrickletCurrent12(tmpDM.getUid());
                    break;
                case "Current25 Bricklet":
                    device = new BrickletCurrent25(tmpDM.getUid());
                    break;
                case "DC Brick":
                    device = new BrickDC(tmpDM.getUid());
                    break;
                case "Distance IR Bricklet":
                    device = new BrickletDistanceIR(tmpDM.getUid());
                    nodes.add(new DistanceIRNode(device));
                    break;
                case "Humidity Bricklet":
                    device = new BrickletHumidity(tmpDM.getUid());
                    break;
                case "IMU Brick":
                    device = new BrickIMU(tmpDM.getUid());
                    break;
                case "IO-16 Bricklet":
                    device = new BrickletIO16(tmpDM.getUid());
                    break;
                case "IO-4 Bricklet":
                    device = new BrickletIO4(tmpDM.getUid());
                    break;
                case "Joystick Bricklet":
                    device = new BrickletJoystick(tmpDM.getUid());
                    break;
                case "LCD 16x2 Bricklet":
                    device = new BrickletLCD16x2(tmpDM.getUid());
                    break;
                case "LCD 20x4 Bricklet":
                    BrickletLCD20x4 lcdBricklet = new BrickletLCD20x4(tmpDM.getUid());
                    device = lcdBricklet;
                    InstanceContent ic = new InstanceContent();
                    nodes.add(new LCD2044Node(lcdBricklet, ic));
                    break;
                case "Master Brick":
                    BrickMaster brickMaster = new BrickMaster(tmpDM.getUid());
                    device = brickMaster;
                    nodes.add(new BrickMasterNode(brickMaster));
                    break;
                case "Poti Linear Bricklet":
                    device = new BrickletLinearPoti(tmpDM.getUid());
                    break;
                case "Rotary Poti Bricklet":
                    device = new BrickletRotaryPoti(tmpDM.getUid());
                    break;
                case "Relay Dual Bricklet":
                    device = new BrickletDualRelay(tmpDM.getUid());
                    break;
                case "Servo Brick":
                    device = new BrickServo(tmpDM.getUid());
                    break;
                case "Stepper Brick":
                    device = new BrickStepper(tmpDM.getUid());
                    break;
                case "Temperature AmbientBricklet":
                    device = new BrickletTemperature(tmpDM.getUid());
                    break;
                case "Temperature IR Bricklet":
                    device = new BrickletTemperatureIR(tmpDM.getUid());
                    break;
                case "Voltage Bricklet":
                    device = new BrickletVoltage(tmpDM.getUid());
                    break;
                case "Chibi Extension":
                case "StepDown Brick":
                case "RS485 Extension":
            }
            try {
                if (device != null) {
                    ipc.addDevice(device);
                }
            } catch (TimeoutException ex) {
                Exceptions.printStackTrace(ex);
            }
            model.setDeviceType(device);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return (nodes.toArray(new Node[nodes.size()]));
    }
}
