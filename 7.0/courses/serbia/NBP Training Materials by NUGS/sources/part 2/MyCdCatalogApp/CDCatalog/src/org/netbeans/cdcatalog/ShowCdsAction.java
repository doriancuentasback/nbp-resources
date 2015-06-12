package org.netbeans.cdcatalog;

import org.netbeans.cdcatalog.utilities.CdDatabase;
import org.netbeans.cdcatalog.domain.CD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.openide.windows.IOProvider;

public final class ShowCdsAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        PrintWriter out = IOProvider.getDefault().getIO("Cds", false).getOut();
       // ArrayList<CD> cdDatabase = CDTopComponent.getDefault().getCdDatabase();
        ArrayList<CD> cdDatabase = CdDatabase.getInstance().getCds();
        for(CD cd : cdDatabase) {
            out.println(cd);
        }
    }
}
