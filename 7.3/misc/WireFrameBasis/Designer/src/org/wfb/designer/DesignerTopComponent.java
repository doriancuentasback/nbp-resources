package org.wfb.designer;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.Action;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import org.netbeans.api.settings.ConvertAsProperties;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.PopupMenuProvider;
import org.netbeans.api.visual.action.SelectProvider;
import org.netbeans.api.visual.model.ObjectScene;
import org.netbeans.api.visual.widget.Widget;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.StatusDisplayer;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.util.Lookup.Result;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.TopComponent;
import org.wfb.domain.Item;
import org.wfb.domain.Row;
import org.wfb.domain.Table;
import org.wfb.utils.CentralLookup;

@ConvertAsProperties(
        dtd = "-//org.wfb.designer//Designer//EN",
        autostore = false)
@TopComponent.Description(
        preferredID = "DesignerTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "org.wfb.designer.DesignerTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_DesignerAction",
        preferredID = "DesignerTopComponent")
@NbBundle.Messages({
    "CTL_DesignerAction=Designer",
    "CTL_DesignerTopComponent=Designer",})
public class DesignerTopComponent extends TopComponent implements LookupListener, PropertyChangeListener {

    private ObjectScene scene;
    private BaseLayerWidget blw;
    
    private InstanceContent ic;

    public DesignerTopComponent() {
        setDisplayName(Bundle.CTL_DesignerTopComponent());
        setLayout(new BorderLayout());
        scene = new ObjectScene();
        blw = new BaseLayerWidget(scene, this);
        scene.addChild(blw);
        ic = new InstanceContent();
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                for (Widget w : blw.getChildren()) {
                    w.setPreferredBounds(new Rectangle(
                            w.getPreferredBounds().x,
                            w.getPreferredBounds().y,
                            getWidth() - 40,
                            w.getPreferredBounds().height));
                    scene.validate();
                }
            }
        });
        scene.getActions().addAction(ActionFactory.createPopupMenuAction(new PopupMenuProvider() {
            @Override
            public JPopupMenu getPopupMenu(Widget widget, Point point) {
                JPopupMenu jm = new JPopupMenu();
                List<? extends Action> tableActions = Utilities.actionsForPath("Actions/Root");
                for (Action action : tableActions) {
                    jm.add(action);
                }
                return jm;
            }
        }));
        JScrollPane pane = new JScrollPane(scene.createView());
        add(pane, BorderLayout.CENTER);
        associateLookup(new AbstractLookup(ic));
    }
    
    Result<Table> allTablesInCentralLookup;
    Result<Row> allRowsInCentralLookup;
    Result<Item> allItemsInCentralLookup;

    @Override
    protected void componentOpened() {
        allTablesInCentralLookup = CentralLookup.getDefault().lookupResult(Table.class);
        allTablesInCentralLookup.addLookupListener(this);
        allRowsInCentralLookup = CentralLookup.getDefault().lookupResult(Row.class);
        allRowsInCentralLookup.addLookupListener(this);
        allItemsInCentralLookup = CentralLookup.getDefault().lookupResult(Item.class);
        allItemsInCentralLookup.addLookupListener(this);
    }

    @Override
    protected void componentClosed() {
        allTablesInCentralLookup.removeLookupListener(this);
        allRowsInCentralLookup.removeLookupListener(this);
        allItemsInCentralLookup.removeLookupListener(this);
    }

    @Override
    public void resultChanged(LookupEvent le) {
        addOrDeleteTables();
        addOrDeleteRows();
        addOrDeleteItems();
        scene.validate();
    }
    int tableSizeTracker = 0;

    public void addOrDeleteTables() {
        Collection<? extends Table> allTables = allTablesInCentralLookup.allInstances();
        int tableSizeInCentralLookup = allTables.size();
        int total = 30;
        for (Widget t : blw.getChildren()) {
            if (t.getLookup().lookup(Table.class) != null) {
                total = total + t.getPreferredBounds().height + 20;
            }
        }
        StatusDisplayer.getDefault().setStatusText("T: " + total);
        if (tableSizeInCentralLookup > tableSizeTracker) {
            for (int i = 0; i < allTables.size(); i++) {
                final Table table = allTables.toArray(new Table[tableSizeInCentralLookup])[i];
                TableWidget tableWidget = new TableWidget(scene, table, this, i, total);
                if (!scene.getObjects().contains(table)) {
                    scene.addObject(table, tableWidget);
                    blw.addChild(tableWidget);
                    table.addPropertyChangeListener(this);
                    tableWidget.getActions().addAction(ActionFactory.createSelectAction(new SelectProvider() {
                        @Override
                        public boolean isAimingAllowed(Widget widget, Point point, boolean bln) {
                            return true;
                        }
                        @Override
                        public boolean isSelectionAllowed(Widget widget, Point point, boolean bln) {
                            return true;
                        }
                        @Override
                        public void select(Widget widget, Point point, boolean bln) {
                            ic.set(Collections.singleton(table), null);
                            StatusDisplayer.getDefault().setStatusText(table.getDisplayName() + " is selected");
                        }
                    }));
                }
            }
            tableSizeTracker++;
        } else if (tableSizeInCentralLookup < tableSizeTracker) {
            Table table = Utilities.actionsGlobalContext().lookup(Table.class);
            List<Widget> children = blw.getChildren();
            Widget tableWidget = scene.findWidget(table);
            if (tableWidget != null) {
                int yToBeRemoved = tableWidget.getBounds().height;
                int index = blw.getChildren().indexOf(tableWidget);
                for (int i = index; i < blw.getChildren().size(); i++) {
                    Widget object = blw.getChildren().get(i);
                    if (object.getLookup().lookup(Table.class) != null && object != blw.getChildren().get(index)) {
                        object.setPreferredBounds(new Rectangle(
                                object.getPreferredBounds().x,
                                object.getPreferredBounds().y - yToBeRemoved,
                                object.getPreferredBounds().width,
                                object.getPreferredBounds().height));
                    }
                }
                tableWidget.removeFromParent();
                scene.removeObject(table);
                tableSizeTracker--;
            }
        }
    }
    int rowSizeTracker = 0;

    public void addOrDeleteRows() {
        Collection<? extends Row> allRows = allRowsInCentralLookup.allInstances();
        int rowSizeInCentralLookup = allRows.size();
        List<Table> tableList = new ArrayList<Table>();
        tableList.addAll(allTablesInCentralLookup.allInstances());
        if (rowSizeInCentralLookup > rowSizeTracker) {
            for (int i = 0; i < allRows.size(); i++) {
                Table table = Utilities.actionsGlobalContext().lookup(Table.class);
                Widget tableWidget = scene.findWidget(table);
                final Row row = allRows.toArray(new Row[rowSizeInCentralLookup])[i];
                RowWidget rowWidget = new RowWidget(scene, row);
                if (!scene.getObjects().contains(row)) {
                    scene.addObject(row, rowWidget);
                    if (tableWidget != null) {
                        tableWidget.addChild(rowWidget);
                        rowWidget.getActions().addAction(ActionFactory.createSelectAction(new SelectProvider() {
                            @Override
                            public boolean isAimingAllowed(Widget widget, Point point, boolean bln) {
                                return true;
                            }
                            @Override
                            public boolean isSelectionAllowed(Widget widget, Point point, boolean bln) {
                                return true;
                            }
                            @Override
                            public void select(Widget widget, Point point, boolean bln) {
                                ic.set(Collections.singleton(row), null);
                                StatusDisplayer.getDefault().setStatusText(row.getDisplayName() + " is selected");
                            }
                        }));
                    }
                    recalculateTablesAfterAddingRows(tableWidget, table, tableList);
                }
            }
            rowSizeTracker++;
        } else if (rowSizeInCentralLookup < rowSizeTracker) {
            Row row = Utilities.actionsGlobalContext().lookup(Row.class);
            if (row.getItems().size() < 3) {
                Widget rowWidget = scene.findWidget(row);
                if (rowWidget != null) {
                    int yToBeRemoved = rowWidget.getBounds().height;
                    Widget tableWidget = rowWidget.getParentWidget();
                    tableWidget.setPreferredBounds(new Rectangle(
                            tableWidget.getPreferredBounds().x,
                            tableWidget.getPreferredBounds().y,
                            tableWidget.getPreferredBounds().width,
                            tableWidget.getPreferredBounds().height - yToBeRemoved));
                    int index = blw.getChildren().indexOf(tableWidget);
                    for (int i = index; i < blw.getChildren().size(); i++) {
                        Widget object = blw.getChildren().get(i);
                        if (object.getLookup().lookup(Table.class) != null && object != blw.getChildren().get(index)) {
                            object.setPreferredBounds(new Rectangle(
                                    object.getPreferredBounds().x,
                                    object.getPreferredBounds().y - yToBeRemoved,
                                    object.getPreferredBounds().width,
                                    object.getPreferredBounds().height));
                        }
                    }
                    rowWidget.removeFromParent();
                    scene.removeObject(row);
                    tableSizeTracker--;
                }
            }
            rowSizeTracker--;
        }
    }

    public void addOrDeleteItems() {
        Collection<? extends Item> allItems = allItemsInCentralLookup.allInstances();
        int itemSizeInCentralLookup = allItems.size();
        List<Item> itemList = new ArrayList<Item>();
        itemList.addAll(allItemsInCentralLookup.allInstances());
        for (int i = 0; i < itemList.size(); i++) {
            Row row = Utilities.actionsGlobalContext().lookup(Row.class);
            Widget rowWidget = scene.findWidget(row);
            int total = 0;
            if (rowWidget != null){
                for (Widget widget : rowWidget.getChildren()) {
                    total = total + widget.getPreferredBounds().width;
                }
                Item item = allItems.toArray(new Item[itemSizeInCentralLookup])[i];
                if (item != null && row != null) {
                    ItemWidget itemWidget = new ItemWidget(scene, item, total);
                    if (!scene.getObjects().contains(item)) {
                        scene.addObject(item, itemWidget);
                        rowWidget.addChild(itemWidget);
                    }
                }
            }
        }
    }

    private void recalculateTablesAfterAddingRows(Widget tableWidget, Table table, List<Table> tableList) {
        if (table.getRows().size() >= 3) {
            tableWidget.setPreferredBounds(new Rectangle(
                    tableWidget.getPreferredBounds().x,
                    tableWidget.getPreferredBounds().y,
                    tableWidget.getPreferredBounds().width,
                    tableWidget.getPreferredBounds().height + 20));
            int index = tableList.indexOf(table);
            for (int i = index + 1; i < tableList.size(); i++) {
                Widget widget = scene.findWidget(tableList.get(i));
                widget.setPreferredBounds(new Rectangle(
                        widget.getPreferredBounds().x,
                        widget.getPreferredBounds().y + 20,
                        widget.getPreferredBounds().width,
                        widget.getPreferredBounds().height));
            }
        }
    }

    private void recalculateTablesAfterRemovingRows(Widget tableWidget, Table table, List<Table> tableList) {
        StatusDisplayer.getDefault().setStatusText("Row total: " + table.getRows().size());
        if (table.getRows().size() >= 3) {
            tableWidget.setPreferredBounds(new Rectangle(
                    tableWidget.getPreferredBounds().x,
                    tableWidget.getPreferredBounds().y,
                    tableWidget.getPreferredBounds().width,
                    tableWidget.getPreferredBounds().height - 20));
            int index = tableList.indexOf(table);
            for (int i = index + 1; i < tableList.size(); i++) {
                Widget widget = scene.findWidget(tableList.get(i));
                widget.setPreferredBounds(new Rectangle(
                        widget.getPreferredBounds().x,
                        widget.getPreferredBounds().y - 20,
                        widget.getPreferredBounds().width,
                        widget.getPreferredBounds().height));
            }
        }
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

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
