package org.helloworld;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import org.openide.windows.IOProvider;

public final class HelloAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        PrintWriter out=IOProvider.getDefault().getIO("Hello", false).getOut();
        out.println("Hello world!");
    }
}
