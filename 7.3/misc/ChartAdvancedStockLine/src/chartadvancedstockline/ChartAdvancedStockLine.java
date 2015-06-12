package chartadvancedstockline;

import com.tinkerforge.BrickMaster;
import com.tinkerforge.BrickletLCD20x4;
import com.tinkerforge.BrickletRotaryPoti;
import com.tinkerforge.IPConnection;
import com.tinkerforge.IPConnection.TimeoutException;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ChartAdvancedStockLine extends Application {

    private static final String HOST = "localhost";
    private static final int PORT = 4223;
    private static final String MASTERBRICKUID = "9ee5edrmozP";
    private static final String LCDUID = "bjS";
    private static final String ROTIUID = "bc3";
    private static IPConnection ipc;
    private static BrickMaster master = new BrickMaster(MASTERBRICKUID);
    private static BrickletLCD20x4 lcd = new BrickletLCD20x4(LCDUID);
    private static BrickletRotaryPoti poti = new BrickletRotaryPoti(ROTIUID);
    private XYChart.Series<Number, Number> minuteDataSeries;
    private NumberAxis xAxis;
    private Timeline animation;
    private double hours = 0;
    private double minutes = 0;
    private double timeInHours = 0;
    private double prevY = 10;
    private double newExternalValu = 10;

    private void init(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setScene(new Scene(root));
        root.getChildren().add(createChart());
        animation = new Timeline();
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(1000 / 60), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                for (int count = 0; count < 5; count++) {
                    plotTime();
                }
            }
        }));
    }

    protected LineChart<Number, Number> createChart() {
        xAxis = new NumberAxis(0, 24, 3);
        final NumberAxis yAxis = new NumberAxis(0, 100, 10);
        final LineChart<Number, Number> lc = new LineChart<Number, Number>(xAxis, yAxis);
        lc.setId("lineStockDemo");
        lc.setCreateSymbols(false);
        lc.setAnimated(false);
        lc.setLegendVisible(false);
        lc.setTitle("ACME Company Stock");
        xAxis.setLabel("Time");
        xAxis.setForceZeroInRange(false);
        yAxis.setLabel("Share Price");
        yAxis.setTickLabelFormatter(new NumberAxis.DefaultFormatter(yAxis, "$", null));
        minuteDataSeries = new XYChart.Series<Number, Number>();
        minuteDataSeries.setName("Minute Data");
        minuteDataSeries.getData().add(new XYChart.Data<Number, Number>(timeInHours, prevY));
        lc.getData().add(minuteDataSeries);
        return lc;
    }

    private void plotTime() {
        minutes++;
        timeInHours = hours + ((1d / 60d) * minutes);
        if ((timeInHours % 1) == 0) {
            double oldY = newExternalValu;
            newExternalValu = prevY - 10 + (Math.random() * 20);
            prevY = oldY;
            while (newExternalValu < 10 || newExternalValu > 90) {
                newExternalValu = newExternalValu - 10 + (Math.random() * 20);
            }
        }
        double min = (timeInHours % 1);
        double minY = prevY + ((newExternalValu - prevY) * min) - 4 + (Math.random() * 8);
        minuteDataSeries.getData().add(new XYChart.Data<Number, Number>(timeInHours, minY));
    }

    public void play() {
        animation.play();
    }

    @Override
    public void stop() {
        animation.pause();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
        try {
            ipc = new IPConnection(HOST, PORT);
            ipc.addDevice(master);
            ipc.addDevice(lcd);
            ipc.addDevice(poti);
        } catch (TimeoutException ex) {
            Logger.getLogger(ChartAdvancedStockLine.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChartAdvancedStockLine.class.getName()).log(Level.SEVERE, null, ex);
        }
        poti.setPositionCallbackPeriod(50);
        poti.addListener(new BrickletRotaryPoti.PositionListener() {
            @Override
            public void position(short locposition) {
                newExternalValu = locposition;
                play();
                lcd.clearDisplay();
                Calendar cal = Calendar.getInstance();
                lcd.writeLine((short) 0, (short) 0, cal.getTime().toString());
                lcd.writeLine((short) 1, (short) 0, "Rotation: " + newExternalValu);
            }
        });
    }
}
