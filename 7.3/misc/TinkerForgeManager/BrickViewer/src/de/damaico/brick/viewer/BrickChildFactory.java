package de.damaico.brick.viewer;

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
import de.damaico.brick.viewer.nodes.AmbientLightNode;
import de.damaico.brick.viewer.nodes.BrickMasterNode;
import de.damaico.brick.viewer.nodes.DistanceIRNode;
import de.damaico.brick.viewer.nodes.RotaryPotiNode;
import de.damaico.brick.viewer.nodes.TemperatureNode;
import de.damaico.brick.viewer.options.TinkerforgePanel;
import java.beans.IntrospectionException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.NbPreferences;

public class BrickChildFactory extends ChildFactory<DeviceIdentifier>
{

    private final String host = NbPreferences.forModule(TinkerforgePanel.class).get("hostProperty", "localhost");
    ;
    private final int port = NbPreferences.forModule(TinkerforgePanel.class).getInt("portProperty", 4223);
    IPConnection ipc;

    public BrickChildFactory()
    {
        Preferences forModule = NbPreferences.forModule(TinkerforgePanel.class);
    }

    //THIS METHOD IS AUTOMATICALLY CALLED IN THE BACKGROUND:
    @Override
    protected boolean createKeys(final List<DeviceIdentifier> list)
    {
        try
        {
            ipc = new IPConnection(host, port);
            ipc.enumerate(new IPConnection.EnumerateListener()
            {
                @Override
                public void enumerate(String uid, String name, short stackID, boolean isNew)
                {
                    if (isNew)
                    {
                        list.add(new DeviceIdentifier(name, uid, stackID));
                    }
                    else
                    {
                        refresh(false);
                    }
                }
            });

        }
        catch (IOException ex)
        {
        }
        finally
        {
            //ipc.enumerate(null);
        }
        return true;
    }

    @Override
    protected Node createWaitNode()
    {
        return null;
    }

    @Override
    protected Node[] createNodesForKey(DeviceIdentifier model)
    {
        ArrayList<Node> nodes = new ArrayList<Node>();

        Device device = null;
        DeviceIdentifier tmpDM = model;
        String cutted = tmpDM.getName().substring(0, tmpDM.getName().trim().length() - 4).trim();
        try
        {
            if (cutted.equalsIgnoreCase("AmbientLight Bricklet"))
            {
                device = new BrickletAmbientLight(tmpDM.getUid());
                nodes.add(new AmbientLightNode(device));
            }

            if (cutted.equalsIgnoreCase("AnalogIn Bricklet"))
            {
                device = new BrickletAnalogIn(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("AnalogOut Bricklet"))
            {
                device = new BrickletAnalogOut(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("Buzzer Bricklet"))
            {
                device = new BrickletPiezoBuzzer(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("Current12 Bricklet"))
            {
                device = new BrickletCurrent12(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("Current25 Bricklet"))
            {
                device = new BrickletCurrent25(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("DC Brick"))
            {
                device = new BrickDC(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("Distance IR Bricklet"))
            {
                device = new BrickletDistanceIR(tmpDM.getUid());
                nodes.add(new DistanceIRNode(device));
            }

            if (cutted.equalsIgnoreCase("Humidity Bricklet"))
            {
                device = new BrickletHumidity(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("IMU Brick"))
            {
                device = new BrickIMU(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("IO-16 Bricklet"))
            {
                device = new BrickletIO16(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("IO-4 Bricklet"))
            {
                device = new BrickletIO4(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("Joystick Bricklet"))
            {
                device = new BrickletJoystick(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("LCD16x2 Bricklet"))
            {
                device = new BrickletLCD16x2(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("LCD20x4 Bricklet"))
            {
                device = new BrickletLCD20x4(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("Master Brick"))
            {
                device = new BrickMaster(tmpDM.getUid());

                nodes.add(new BrickMasterNode(device));
            }

            if (cutted.equalsIgnoreCase("Poti Linear Bricklet"))
            {
                device = new BrickletLinearPoti(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("Rotary Poti Bricklet"))
            {
                device = new BrickletRotaryPoti(tmpDM.getUid());

                nodes.add(new RotaryPotiNode(device));
            }

            if (cutted.equalsIgnoreCase("Relay Dual Bricklet"))
            {
                device = new BrickletDualRelay(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("Servo Brick"))
            {
                device = new BrickServo(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("Stepper Brick"))
            {
                device = new BrickStepper(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("Temperature AmbientBricklet"))
            {
                device = new BrickletTemperature(tmpDM.getUid());
            }

            if (cutted.equalsIgnoreCase("Temperature Bricklet"))
            {
                device = new BrickletTemperature(tmpDM.getUid());
                nodes.add(new TemperatureNode(device));
            }

            if (cutted.equalsIgnoreCase("Temperature IR Bricklet"))
            {
                device = new BrickletTemperatureIR(tmpDM.getUid());

            }

            if (cutted.equalsIgnoreCase("Voltage Bricklet"))
            {
                device = new BrickletVoltage(tmpDM.getUid());

            }

            // Diese werden nicht erkannt:

            if (cutted.equalsIgnoreCase("Chibi Extension"))
            {
            }
            if (cutted.equalsIgnoreCase("StepDown Brick"))
            {
            }
            if (cutted.equalsIgnoreCase("RS485 Extension"))
            {
            }

            try
            {
                if (device != null && !(device instanceof BrickMaster))
                {
                    ipc.addDevice(device);
                }
            }
            catch (IPConnection.TimeoutException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
        catch (IntrospectionException ex)
        {
            Exceptions.printStackTrace(ex);
        }


        return (nodes.toArray(new Node[nodes.size()]));
    }
}
