package org.terminal.container;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.netbeans.lib.terminalemulator.ActiveTerm;
import org.netbeans.lib.terminalemulator.TermInputListener;
import org.netbeans.modules.nativeexecution.api.ExecutionEnvironment;
import org.netbeans.modules.nativeexecution.api.ExecutionEnvironmentFactory;
import org.netbeans.modules.nativeexecution.api.HostInfo;
import org.netbeans.modules.nativeexecution.api.NativeProcessBuilder;
import org.netbeans.modules.nativeexecution.api.execution.NativeExecutionDescriptor;
import org.netbeans.modules.nativeexecution.api.execution.NativeExecutionService;
import org.netbeans.modules.nativeexecution.api.pty.PtySupport;
import org.netbeans.modules.nativeexecution.api.util.ConnectionManager;
import org.netbeans.modules.nativeexecution.api.util.HostInfoUtils;
import org.netbeans.modules.terminal.ioprovider.Terminal;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.util.RequestProcessor;
import org.openide.windows.IOContainer;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OnShowing;
import org.openide.windows.WindowManager;

@OnShowing
public class Installer implements Runnable {

    private static final RequestProcessor RP = new RequestProcessor("Terminal Action RP", 100); // NOI18N
    Terminal terminal;
    StringBuilder sb = new StringBuilder();

    @Override
    public void run() {

        UIManager.put("EditorTabDisplayerUI", "org.terminal.container.NoTabsTabDisplayerUI");

        TerminalTopComponent emulator = new TerminalTopComponent();

        WindowManager.getDefault().findMode("editor").dockInto(emulator);

        emulator.open();
        emulator.requestActive();

        IOContainer ioContainer = emulator.getIOContainer();

        ExecutionEnvironment env = ExecutionEnvironmentFactory.getLocal();
        if (env != null) {
            String homeDir = System.getProperty("user.home").toString();
            openTerminalImpl(ioContainer, "tabtitle", env, homeDir, true);
        }

    }

    public void openTerminalImpl(final IOContainer ioContainer, final String tabTitle, final ExecutionEnvironment env, final String dir, final boolean silentMode) {
      
        final IOProvider term = IOProvider.get("Terminal"); // NOI18N

        if (term != null) {

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    if (SwingUtilities.isEventDispatchThread()) {
                        ioContainer.requestActive();
                    } else {
                        doWork();
                    }
                }

                private void doWork() {

                    if (!ConnectionManager.getInstance().isConnectedTo(env)) {
                        try {
                            ConnectionManager.getInstance().connectTo(env);
                        } catch (IOException ex) {
                        } catch (ConnectionManager.CancellationException ex) {
                            return;
                        }
                    }

                    final HostInfo hostInfo;
                    try {
                        hostInfo = HostInfoUtils.getHostInfo(env);
                        boolean isSupported = PtySupport.isSupportedFor(env);
                        if (!isSupported) {
                            if (!silentMode) {
                                String message;
                                if (hostInfo.getOSFamily() == HostInfo.OSFamily.WINDOWS) {
                                    message = NbBundle.getMessage(Installer.class, "LocalTerminalNotSupported.error.nocygwin"); // NOI18N
                                } else {
                                    message = NbBundle.getMessage(Installer.class, "LocalTerminalNotSupported.error"); // NOI18N
                                }
                                NotifyDescriptor nd = new NotifyDescriptor.Message(message, NotifyDescriptor.INFORMATION_MESSAGE);
                                DialogDisplayer.getDefault().notify(nd);
                            }
                            return;
                        }
                    } catch (IOException ex) {
                        Exceptions.printStackTrace(ex);
                        return;
                    } catch (ConnectionManager.CancellationException ex) {
                        Exceptions.printStackTrace(ex);
                        return;
                    }

                    final AtomicReference<InputOutput> ioRef = new AtomicReference<InputOutput>();
                    try {
                        ioRef.set(term.getIO(tabTitle, null, ioContainer));
                        NativeProcessBuilder npb = NativeProcessBuilder.newProcessBuilder(env);
                        String shell = hostInfo.getLoginShell();
                        if (dir != null) {
                            npb.setWorkingDirectory(dir);
                        }
                        npb.setExecutable(shell);
                        NativeExecutionDescriptor descr;
                        descr = new NativeExecutionDescriptor().controllable(true).frontWindow(true).inputVisible(true).inputOutput(ioRef.get());
                        descr.postExecution(new Runnable() {
                            @Override
                            public void run() {
                                ioRef.get().closeInputOutput();
                            }
                        });
                        NativeExecutionService es = NativeExecutionService.newService(npb, descr, "Terminal Emulator"); // NOI18N
                        Future<Integer> result = es.run();
                        SwingUtilities.invokeLater(this);
                    } catch (java.util.concurrent.CancellationException ex) {
                        Exceptions.printStackTrace(ex);
                    }

                    try {
                        SwingUtilities.invokeAndWait(new Runnable() {
                            @Override
                            public void run() {
                                terminal = (Terminal) ioContainer.getSelected();
                                ActiveTerm at = terminal.term();
                                at.addInputListener(new TermInputListener() {
                                    @Override
                                    public void sendChar(char c) {
                                        final char tmp[] = new char[1];
                                        tmp[0] = c;
                                        String s = new String(tmp);
                                        try {
                                            int extendedKeyCodeForChar = KeyEvent.getExtendedKeyCodeForChar(c);
                                            if (extendedKeyCodeForChar != 0) {
                                                sb.append(s);
                                            } else {
                                                FileUtil.getConfigFile("terminalhistory").createData(sb.toString());
                                                sb.replace(0, sb.length(), "");
                                            }
                                        } catch (Exception x) {
                                        }
                                    }
                                    @Override
                                    public void sendChars(char[] c, int offset, int count) {
                                    }
                                });
                            }
                        });
                    } catch (InterruptedException ex) {
                        Exceptions.printStackTrace(ex);
                    } catch (InvocationTargetException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
            };

            RP.post(runnable);

        }

    }

}