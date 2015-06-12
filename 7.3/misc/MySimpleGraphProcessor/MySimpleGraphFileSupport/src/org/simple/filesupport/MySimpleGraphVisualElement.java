package org.simple.filesupport;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import org.netbeans.core.spi.multiview.CloseOperationState;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.MultiViewElementCallback;
import org.openide.awt.UndoRedo;
import org.openide.filesystems.FileChangeAdapter;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import org.openide.xml.XMLUtil;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

@MultiViewElement.Registration(
        displayName = "#LBL_MySimpleGraph_VISUAL",
        iconBase = "org/simple/filesupport/icon.png",
        mimeType = "text/x-graph+xml",
        persistenceType = TopComponent.PERSISTENCE_NEVER,
        preferredID = "MySimpleGraphVisual",
        position = 2000)
@Messages("LBL_MySimpleGraph_VISUAL=Chart")
public final class MySimpleGraphVisualElement extends JPanel implements MultiViewElement {

    private MySimpleGraphDataObject obj;
    private transient MultiViewElementCallback callback;
    private List<String> names;
    private List<String> values;
    private String caption = "";
    private FileObject fo;

    public MySimpleGraphVisualElement(Lookup lkp) {
        obj = lkp.lookup(MySimpleGraphDataObject.class);
        assert obj != null;
        initComponents();
        setLayout(new BorderLayout());
        parseFile();
        initJavaFX();
    }

    public void initJavaFX() {
        final JFXPanel chartFxPanel = new JFXPanel();
        add(chartFxPanel, BorderLayout.CENTER);
        Platform.setImplicitExit(false);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene scene = new Scene(createBarChart());
                chartFxPanel.setScene(scene);
            }
        });
    }

    private void parseFile() {
        fo = obj.getPrimaryFile();
        names = new ArrayList();
        values = new ArrayList();
        InputSource source;
        try {
            source = new InputSource(fo.getInputStream());
            Document doc = XMLUtil.parse(source, false, false, null, null);
            NodeList graphNodeList = doc.getElementsByTagName("graph");
            NamedNodeMap graphNodeMap = graphNodeList.item(0).getAttributes();
            for (int j = 0; j < graphNodeMap.getLength(); j++) {
                Node attrNode = graphNodeMap.item(j);
                String attrName = attrNode.getNodeName();
                if (attrName.equals("caption")) {
                    caption = attrNode.getNodeValue();
                }
            }
            NodeList setNodeList = doc.getElementsByTagName("set");
            for (int i = 0; i < setNodeList.getLength(); i++) {
                Node setNode = setNodeList.item(i);
                NamedNodeMap map = setNode.getAttributes();
                for (int j = 0; j < map.getLength(); j++) {
                    Node attrNode = map.item(j);
                    String attrName = attrNode.getNodeName();
                    if (attrName.equals("name")) {
                        names.add(attrNode.getNodeValue());
                    } else if (attrName.equals("value")) {
                        values.add(attrNode.getNodeValue());
                    }
                }
            }
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } catch (SAXException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private BarChart createBarChart() {
        final ObservableList<BarChart.Series> bcData = FXCollections.<BarChart.Series>observableArrayList();
        for (int column = 0; column < names.size(); column++) {
            ObservableList<BarChart.Data> series = FXCollections.<BarChart.Data>observableArrayList();
            series.add(new BarChart.Data(names.get(column), Integer.parseInt(values.get(column))));
            bcData.add(new BarChart.Series(series));
        }
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.observableArrayList(names));
        NumberAxis yAxis = new NumberAxis();
        yAxis.setTickUnit(10000);
        final BarChart chart = new BarChart(xAxis, yAxis, bcData);
        chart.setTitle(caption);
        fo.addFileChangeListener(new FileChangeAdapter() {
            @Override
            public void fileChanged(FileEvent fe) {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        parseFile();
                        for (int column = 0; column < values.size(); column++) {
                            XYChart.Series<String, Number> s = (XYChart.Series<String, Number>) chart.getData().get(column);
                            BarChart.Data data = s.getData().get(0);
                            data.setYValue(Integer.parseInt(values.get(column)));
                        }
                    }
                });
            }
        });
        return chart;
    }

    @Override
    public String getName() {
        return "MySimpleGraphVisualElement";
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
    public JComponent getVisualRepresentation() {
        return this;
    }

    @Override
    public JComponent getToolbarRepresentation() {
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);
        return toolBar;
    }

    @Override
    public Action[] getActions() {
        return new Action[0];
    }

    @Override
    public Lookup getLookup() {
        return obj.getLookup();
    }

    @Override
    public void componentOpened() {
    }

    @Override
    public void componentClosed() {
    }

    @Override
    public void componentShowing() {
    }

    @Override
    public void componentHidden() {
    }

    @Override
    public void componentActivated() {
    }

    @Override
    public void componentDeactivated() {
    }

    @Override
    public UndoRedo getUndoRedo() {
        return UndoRedo.NONE;
    }

    @Override
    public void setMultiViewCallback(MultiViewElementCallback callback) {
        this.callback = callback;
    }

    @Override
    public CloseOperationState canCloseElement() {
        return CloseOperationState.STATE_OK;
    }
}
