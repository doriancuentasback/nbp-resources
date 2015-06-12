package org.demo;

import com.tinkerforge.BrickMaster;
import com.tinkerforge.BrickletLCD20x4;
import com.tinkerforge.BrickletRotaryPoti;
import com.tinkerforge.IPConnection;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import javax.inject.Named;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

@Named
public final class ChartController implements Serializable {

    private CartesianChartModel linearModel;
    private static final String HOST = "localhost";
    private static final int PORT = 4223;
    private static final String MASTERBRICKUID = "9ee5edrmozP";
    private static final String DIRUID = "bc3";
    private static final String LCDUID = "bjS";
    private static IPConnection ipc;
    private static BrickMaster master = new BrickMaster(MASTERBRICKUID);
    private static BrickletRotaryPoti broti = new BrickletRotaryPoti(DIRUID);
    private static BrickletLCD20x4 blcd = new BrickletLCD20x4(LCDUID);

    public ChartController() {
        createLinearModel();
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

    public BrickletRotaryPoti.PositionListener getRotiListener() {
        return new BrickletRotaryPoti.PositionListener() {
            @Override
            public void position(short position) {
                blcd.clearDisplay();
//                data.getData().put(index, position);
//                blcd.writeLine((short) 0, (short) 0, Integer.toString(index) + " current p: " + position);
            }
        };
    }
    
    

    private void createLinearModel() {
        linearModel = new CartesianChartModel();
        linearModel.getSeries().add(0, getStockChartData("Stock Chart 1"));
    }
    ChartSeries data;

    private ChartSeries getStockChartData(String label) {
        data = new ChartSeries();
        data.setLabel(label);
        for (int i = 1; i <= 20; i++) {
            data.getData().put(i, (int) (Math.random() * 1000));
        }
        return data;
    }

    public CartesianChartModel getLinearModel() {
        return linearModel;
    }
}
