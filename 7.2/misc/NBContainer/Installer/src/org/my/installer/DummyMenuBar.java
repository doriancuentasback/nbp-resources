package org.my.installer;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class DummyMenuBar extends JMenuBar {

    public DummyMenuBar() {
        JMenu menu1 = new JMenu("dummy 1");
        menu1.add(new JMenuItem("item 1"));
        menu1.add(new JMenuItem("item 2"));
        JMenu menu2 = new JMenu("dummy 2");
        menu2.add(new JMenuItem("item 1"));
        add(menu1);
        add(menu2);
    }
    
}
