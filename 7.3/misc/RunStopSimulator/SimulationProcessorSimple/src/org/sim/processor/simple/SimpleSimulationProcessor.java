package org.sim.processor.simple;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openide.filesystems.FileObject;
import org.openide.util.lookup.ServiceProvider;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OutputWriter;
import org.sim.api.SimulationProcessor;

/**
 *
 * @author geertjan
 */
@ServiceProvider(service = SimulationProcessor.class)
public class SimpleSimulationProcessor implements SimulationProcessor {

    @Override
    public void process(FileObject fo) {
        OutputWriter writer;
        InputOutput io = IOProvider.getDefault().getIO(fo.getNameExt(), false);
        io.select();
        writer = io.getOut();
        try {
            List<String> asLines = fo.asLines();
            for (String string : asLines) {
                writer.println(string);
            }
        } catch (IOException ex) {
            Logger.getLogger(SimpleSimulationProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
