package org.demo;

import com.tinkerforge.BrickMaster;
import com.tinkerforge.BrickletDistanceIR;
import com.tinkerforge.BrickletJoystick.PositionListener;
import com.tinkerforge.BrickletLCD20x4;
import com.tinkerforge.BrickletRotaryPoti;
import com.tinkerforge.IPConnection;
import com.tinkerforge.IPConnection.TimeoutException;
import java.awt.Toolkit;
import java.io.Serializable;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.LineChartSeries;

@Named
@RequestScoped
public class ChartBean implements Serializable {

    private static final String HOST = "localhost";
    private static final int PORT = 4223;
    private static final String MASTERBRICKUID = "9ee5edrmozP";
    private static final String DIRUID = "bc3";
    private static final String LCDUID = "bjS";
    private static IPConnection ipc;
    private static BrickMaster master = new BrickMaster(MASTERBRICKUID);
    private static BrickletRotaryPoti broti = new BrickletRotaryPoti(DIRUID);
    private static BrickletLCD20x4 blcd = new BrickletLCD20x4(LCDUID);
    private CartesianChartModel linearModel;
    Toolkit toolkit;
    Timer timer;
    int index;
    LineChartSeries series = new LineChartSeries();

    public ChartBean() {
        init();
        createLinearModel();
    }

    public CartesianChartModel getLinearModel() {
        return linearModel;
    }

    public BrickletRotaryPoti.PositionListener getRotiListener() {
        return new BrickletRotaryPoti.PositionListener() {
            @Override
            public void position(short position) {
                blcd.clearDisplay();
                series.getData().put(index++, position);
                blcd.writeLine((short) 0, (short) 0, Integer.toString(index) + " current p: " + position);
            }
        };
    }

    private void init() {
        try {
            ipc = new IPConnection(HOST, PORT);
            ipc.addDevice(master);
            ipc.addDevice(blcd);
            ipc.addDevice(broti);
            blcd.backlightOn();
            broti.setPositionCallbackPeriod(1000);
            broti.addListener(getRotiListener());
        } catch (Exception e) {
        }
    }

    private void createLinearModel() {
        linearModel = new CartesianChartModel();
        series.setLabel("Distance Measurement");
        series.set(1, 2);
        series.set(2, 1);
        linearModel.addSeries(series);
    }

}
