/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.gradle;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import org.gradle.tooling.*;
import org.gradle.tooling.model.BuildableProject;
import org.gradle.tooling.model.DomainObjectSet;
import org.gradle.tooling.model.Task;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.*;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Cancellable;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OutputWriter;

/**
 *
 * @author geertjan
 */
class TaskChildFactory extends ChildFactory<Task> implements FileChangeListener {

    private final GradleDataObject dobj;

    public TaskChildFactory(GradleDataObject dobj) {
        this.dobj = dobj;
        dobj.getPrimaryFile().addFileChangeListener(this);
    }

    @Override
    protected boolean createKeys(List<Task> list) {
        ProgressHandle h = ProgressHandleFactory.createHandle("Loading tasks...", new Cancellable() {
            @Override
            public boolean cancel() {
                return true;
            }
        });
        h.start();
        ProjectConnection projectConnection = null;
        GradleConnector gradleConnector = GradleConnector.newConnector();
        gradleConnector.forProjectDirectory(FileUtil.toFile(dobj.getPrimaryFile().getParent()));
        projectConnection = gradleConnector.connect();
        BuildableProject bp = projectConnection.getModel(BuildableProject.class);
        DomainObjectSet<? extends Task> tasks = bp.getTasks();
        for (Task task : tasks) {
            if (!task.getName().toLowerCase().contains("eclipse")) {
                list.add(task);
            }
        }
        projectConnection.close();
        h.finish();
        return true;
    }

    @Override
    protected Node createNodeForKey(final Task key) {
        AbstractNode taskNode = new AbstractNode(Children.LEAF) {
            @Override
            public Action getPreferredAction() {
                return new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ProjectConnection projectConnection = null;
                        try {
                            GradleConnector gradleConnector = GradleConnector.newConnector();
                            gradleConnector.forProjectDirectory(FileUtil.toFile(dobj.getPrimaryFile().getParent()));
//                            gradleConnector.useInstallation(new File(gradleLoc));
                            projectConnection = gradleConnector.connect();
                            BuildLauncher buildLauncher = projectConnection.newBuild();
                            buildLauncher.forTasks(key.getName());
                            buildLauncher.addProgressListener(new ProgressListener() {
                                @Override
                                public void statusChanged(ProgressEvent pe) {
                                    StatusDisplayer.getDefault().setStatusText(pe.getDescription());
                                }
                            });
                            InputOutput io = IOProvider.getDefault().getIO(key.getName(), true);
                            io.select();
                            OutputWriter ow = io.getOut();
                            buildLauncher.setStandardOutput(new WriterOutputStream(ow));
                            buildLauncher.run();
                            FileUtil.refreshAll();
                        } finally {
                            if (projectConnection != null) {
                                projectConnection.close();
                            }
                        }
                    }
                };
            }
        };
        taskNode.setDisplayName(key.getName());
        taskNode.setIconBaseWithExtension("org/netbeans/gradle/gear.png");
        return taskNode;
    }

    @Override
    public void fileFolderCreated(FileEvent fe) {
    }

    @Override
    public void fileDataCreated(FileEvent fe) {
    }

    @Override
    public void fileChanged(FileEvent fe) {
        refresh(false);
    }

    @Override
    public void fileDeleted(FileEvent fe) {
    }

    @Override
    public void fileRenamed(FileRenameEvent fre) {
    }

    @Override
    public void fileAttributeChanged(FileAttributeEvent fae) {
    }

    private static class WriterOutputStream extends OutputStream {

        protected Writer _writer;
        protected String _encoding;
        private byte[] _buf = new byte[1];

        /*
         * ------------------------------------------------------------
         */
        public WriterOutputStream(Writer writer, String encoding) {
            _writer = writer;
            _encoding = encoding;
        }

        /*
         * ------------------------------------------------------------
         */
        public WriterOutputStream(Writer writer) {
            _writer = writer;
        }

        /*
         * ------------------------------------------------------------
         */
        public void close()
                throws IOException {
            _writer.close();
            _writer = null;
            _encoding = null;
        }

        /*
         * ------------------------------------------------------------
         */
        public void flush()
                throws IOException {
            _writer.flush();
        }

        /*
         * ------------------------------------------------------------
         */
        public void write(byte[] b)
                throws IOException {
            if (_encoding == null) {
                _writer.write(new String(b));
            } else {
                _writer.write(new String(b, _encoding));
            }
        }

        /*
         * ------------------------------------------------------------
         */
        public void write(byte[] b, int off, int len)
                throws IOException {
            if (_encoding == null) {
                _writer.write(new String(b, off, len));
            } else {
                _writer.write(new String(b, off, len, _encoding));
            }
        }

        /*
         * ------------------------------------------------------------
         */
        public synchronized void write(int b)
                throws IOException {
            _buf[0] = (byte) b;
            write(_buf);
        }
    }
}
