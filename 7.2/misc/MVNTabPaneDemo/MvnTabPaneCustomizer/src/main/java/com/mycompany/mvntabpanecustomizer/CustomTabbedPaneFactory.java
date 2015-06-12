package com.mycompany.mvntabpanecustomizer;

import org.netbeans.core.windows.view.ui.tabcontrol.JTabbedPaneAdapter;
import org.netbeans.swing.tabcontrol.WinsysInfoForTabbedContainer;
import org.netbeans.swing.tabcontrol.customtabs.Tabbed;
import org.netbeans.swing.tabcontrol.customtabs.TabbedComponentFactory;
import org.netbeans.swing.tabcontrol.customtabs.TabbedType;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service = TabbedComponentFactory.class, position = 500)
public class CustomTabbedPaneFactory implements TabbedComponentFactory {

    @Override
    public Tabbed createTabbedComponent(TabbedType type, WinsysInfoForTabbedContainer info) {
        JTabbedPaneAdapter tabPane = new JTabbedPaneAdapter(type, info);
        tabPane.setUI(new PlasticTabbedPaneUI());
        return tabPane.getTabbed();
    }
    
}