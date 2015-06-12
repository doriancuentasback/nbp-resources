package org.sim.filesupport;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Action;
import javax.xml.transform.Source;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.netbeans.spi.xml.cookies.CheckXMLSupport;
import org.netbeans.spi.xml.cookies.DataObjectAdapters;
import org.netbeans.spi.xml.cookies.TransformableSupport;
import org.netbeans.spi.xml.cookies.ValidateXMLSupport;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.filesystems.MIMEResolver;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.DataShadow;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.nodes.Node.Cookie;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.ProxyLookup;
import org.sim.api.CentralLookup;
import org.sim.api.SimulationProcessor;
import org.sim.api.Startable;
import org.sim.api.Stoppable;
import org.xml.sax.InputSource;

@Messages({
    "LBL_Sim_LOADER=Files of Sim"
})
@MIMEResolver.NamespaceRegistration(
        displayName = "#LBL_Sim_LOADER",
        mimeType = "text/x-sim+xml",
        elementName = "Simulation")
@DataObject.Registration(
        mimeType = "text/x-sim+xml",
        iconBase = "org/sim/filesupport/icon.png",
        displayName = "#LBL_Sim_LOADER",
        position = 300)
@ActionReferences({
    @ActionReference(
            path = "Loaders/text/x-sim+xml/Actions",
            id =
            @ActionID(category = "System", id = "org.openide.actions.OpenAction"),
            position = 100,
            separatorAfter = 200),
    @ActionReference(
            path = "Loaders/text/x-sim+xml/Actions",
            id =
            @ActionID(category = "Edit", id = "org.openide.actions.CutAction"),
            position = 300),
    @ActionReference(
            path = "Loaders/text/x-sim+xml/Actions",
            id =
            @ActionID(category = "Edit", id = "org.openide.actions.CopyAction"),
            position = 400,
            separatorAfter = 500),
    @ActionReference(
            path = "Loaders/text/x-sim+xml/Actions",
            id =
            @ActionID(category = "Edit", id = "org.openide.actions.DeleteAction"),
            position = 600),
    @ActionReference(
            path = "Loaders/text/x-sim+xml/Actions",
            id =
            @ActionID(category = "System", id = "org.openide.actions.RenameAction"),
            position = 700,
            separatorAfter = 800),
    @ActionReference(
            path = "Loaders/text/x-sim+xml/Actions",
            id =
            @ActionID(category = "System", id = "org.openide.actions.SaveAsTemplateAction"),
            position = 900,
            separatorAfter = 1000),
    @ActionReference(
            path = "Loaders/text/x-sim+xml/Actions",
            id =
            @ActionID(category = "System", id = "org.openide.actions.FileSystemAction"),
            position = 1100,
            separatorAfter = 1200),
    @ActionReference(
            path = "Loaders/text/x-sim+xml/Actions",
            id =
            @ActionID(category = "System", id = "org.openide.actions.ToolsAction"),
            position = 1300),
    @ActionReference(
            path = "Loaders/text/x-sim+xml/Actions",
            id =
            @ActionID(category = "System", id = "org.openide.actions.PropertiesAction"),
            position = 1400)
})
public class SimDataObject extends MultiDataObject {

    private InstanceContent content = new InstanceContent();
    private Lookup lookup;
    private MyStartable myStartable = new MyStartable();
    private MyStoppable myStoppable = new MyStoppable();
    private Timer timer;
    private ProgressHandle ph;

    public SimDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        registerEditor("text/x-sim+xml", false);
        lookup = new ProxyLookup(getCookieSet().getLookup(), new AbstractLookup(content));
        content.add(super.getCookieSet());
        content.add(myStartable);
        InputSource is = DataObjectAdapters.inputSource(this);
        Source source = DataObjectAdapters.source(this);
        content.add(new CheckXMLSupport(is));
        content.add(new ValidateXMLSupport(is));
        content.add(new TransformableSupport(source));
    }

    private class MyRealTimeSimulatorTask extends TimerTask {

        private int times = 0;

        @Override
        public void run() {
            times++;
            if (times <= 9) {
                content.remove(myStartable);
                ph.progress("Processing...", times);
            } else if (times == 10) {
                content.add(myStartable);
                content.remove(myStoppable);
                ph.finish();
            }
        }
    }

    private class MyStartable implements Startable {

        @Override
        public void start() {
            timer = new Timer("Simulator");
            content.add(myStoppable);
            for (SimulationProcessor sp : Lookup.getDefault().lookupAll(SimulationProcessor.class)) {
                sp.process(getPrimaryFile());
            }
            //Simulate a lengthy process and start the progress bar:
            MyRealTimeSimulatorTask t = new MyRealTimeSimulatorTask();
            ph = ProgressHandleFactory.createHandle("Processing " + getPrimaryFile().getNameExt());
            ph.start();
            ph.switchToDeterminate(10);
            timer.schedule(t, 0, 1 * 1000);
        }
    }

    private class MyStoppable implements Stoppable {

        @Override
        public void stop() {
            content.add(myStartable);
            content.remove(myStoppable);
            timer.cancel();
            ph.finish();
        }
    }

    @Override
    protected int associateLookup() {
        return 1;
    }

    @Override
    protected Node createNodeDelegate() {
        CentralLookup.getDefault().add(this);
        return new DataNode(this, Children.create(new FileLineChildFactory(this), true), getLookup());
    }

    private class FileLineChildFactory extends ChildFactory<String> {

        private final SimDataObject dobj;

        public FileLineChildFactory(SimDataObject dobj) {
            this.dobj = dobj;
        }

        @Override
        protected boolean createKeys(List<String> list) {
            try {
                for (String string : dobj.getPrimaryFile().asLines()) {
                    if (!string.isEmpty()) {
                        list.add(string);
                    }
                }
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
            return true;
        }

        @Override
        protected Node createNodeForKey(String key) {
            BeanNode node = null;
            try {
                node = new BeanNode(key) {
                    @Override
                    public Action[] getActions(boolean context) {
                        List<? extends Action> simActions = Utilities.actionsForPath("Actions/Simulation");
                        return simActions.toArray(new Action[simActions.size()]);
                    }

                    @Override
                    public Action getPreferredAction() {
                        return FileUtil.getConfigObject("Actions/Simulation/org-sim-filesupport-JumpToLineAction.instance", Action.class);
                    }
                };
                node.setDisplayName(key);
            } catch (IntrospectionException ex) {
                Exceptions.printStackTrace(ex);
            }
            return node;
        }
    }

    @Override
    public Lookup getLookup() {
        return lookup;
    }

    @Override
    public <T extends Cookie> T getCookie(Class<T> type) {
        return lookup.lookup(type);
    }

    @Override
    protected <T extends Cookie> T getCookie(DataShadow shadow, Class<T> clazz) {
        return getCookie(clazz);
    }
}
