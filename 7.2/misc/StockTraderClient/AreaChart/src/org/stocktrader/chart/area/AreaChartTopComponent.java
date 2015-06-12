/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stocktrader.chart.area;

import java.awt.BorderLayout;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.Chart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import org.stocktrader.api.SampleTableModel;
import org.stocktrader.api.StockTraderUtilities;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
    dtd = "-//org.stocktrader.chart.area//AreaChart//EN",
autostore = false)
@TopComponent.Description(
    preferredID = "AreaChartTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "properties", openAtStartup = true)
@ActionID(category = "Window", id = "org.stocktrader.chart.area.AreaChartTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_AreaChartAction",
preferredID = "AreaChartTopComponent")
@Messages({
    "CTL_AreaChartAction=AreaChart",
    "CTL_AreaChartTopComponent=AreaChart Window",
    "HINT_AreaChartTopComponent=This is a AreaChart window"
})
public final class AreaChartTopComponent extends TopComponent {

    private static ObservableList<AreaChart.Series> acData;
    private static JFXPanel chartFxPanel;
    private Chart chart;
    private static SampleTableModel tableModel;

    public AreaChartTopComponent() {
        initComponents();
        setName(Bundle.CTL_AreaChartTopComponent());
        setToolTipText(Bundle.HINT_AreaChartTopComponent());

        setLayout(new BorderLayout());
        init();

    }

    public void init() {
        tableModel = StockTraderUtilities.getSampleTableModel();
        chartFxPanel = new JFXPanel();
        add(chartFxPanel, BorderLayout.CENTER);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                createScene();
            }
        });
    }

    private void createScene() {
        chart = createAreaChart();
        chartFxPanel.setScene(new Scene(chart));
    }

    protected AreaChart<Number, Number> createAreaChart() {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(tableModel.getColumnNames()));
        xAxis.setLabel("Year");

        double tickUnit = tableModel.getTickUnit();

        NumberAxis yAxis = new NumberAxis();
        yAxis.setTickUnit(tickUnit);
        yAxis.setLabel("Units Sold");

        final AreaChart localChart = new AreaChart(xAxis, yAxis, getAreaChartData());
        localChart.setTitle("Electric Car Sales");
        tableModel.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    final int row = e.getFirstRow();
                    final int column = e.getColumn();
                    final Object value = ((SampleTableModel) e.getSource()).getValueAt(row, column);

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            XYChart.Series<String, Number> s = (XYChart.Series<String, Number>) localChart.getData().get(row);
                            AreaChart.Data data = s.getData().get(column);
                            data.setYValue(value);
                        }
                    });
                }
            }
        });
        return localChart;
    }

    public ObservableList<AreaChart.Series> getAreaChartData() {
        if (acData == null) {
            acData = FXCollections.<AreaChart.Series>observableArrayList();
            for (int row = 0; row < tableModel.getRowCount(); row++) {
                ObservableList<AreaChart.Data> series = FXCollections.<AreaChart.Data>observableArrayList();
                for (int column = 0; column < tableModel.getColumnCount(); column++) {
                    series.add(new AreaChart.Data(tableModel.getColumnName(column), tableModel.getValueAt(row, column)));
                }
                acData.add(new AreaChart.Series(series));
            }
        }
        return acData;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
