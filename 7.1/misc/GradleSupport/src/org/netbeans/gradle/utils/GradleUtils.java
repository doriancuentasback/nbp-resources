package org.netbeans.gradle.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.gradle.tooling.ModelBuilder;
import org.gradle.tooling.model.BuildableProject;
import org.gradle.tooling.model.Task;

import org.gradle.tooling.GradleConnector;
import org.gradle.tooling.ProjectConnection;
import org.gradle.tooling.model.ExternalDependency;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.SwingUtilities;
import org.gradle.tooling.BuildLauncher;
import org.gradle.tooling.internal.consumer.DefaultGradleConnector;
import org.gradle.tooling.model.DomainObjectSet;
import org.gradle.tooling.model.eclipse.EclipseProject;
import org.netbeans.gradle.support.options.GradlePanel;
import org.openide.util.NbPreferences;

/**
 *
 * @author Martin
 */
public class GradleUtils {

    private static Collection<? extends Task> tasks;
    private static ModelBuilder<BuildableProject> model;
    private static String gradleLoc = NbPreferences.forModule(GradlePanel.class).get("gradleLoc", "/home/geertjan/Downloads/gradle/gradle-1.0-milestone-6-20111117000012+0100");

    public static String getGradleLoc() {
        return gradleLoc;
    }

    public static Collection<? extends Task> getAllTasks(final File file) throws InterruptedException, InvocationTargetException {
        SwingUtilities.invokeAndWait(new Runnable() {

            @Override
            public void run() {
                ProjectConnection projectConnection = null;
                try {
                    GradleConnector gradleConnector = GradleConnector.newConnector();
                    gradleConnector.forProjectDirectory(file);
//                    gradleConnector.embedded(true);
//                    gradleConnector.useClasspathDistribution();
                    gradleConnector.useInstallation(new File(gradleLoc));
                    projectConnection = gradleConnector.connect();


//                    model = projectConnection.model(BuildableProject.class);
//                    model.get().getTasks();
                    BuildableProject project = projectConnection.getModel(BuildableProject.class);
                    tasks = model.get().getTasks();
                    for (Iterator<? extends Task> iterator = tasks.iterator(); iterator.hasNext();) {
                        Task task = iterator.next();
                        if (task.getName().toLowerCase().contains("eclipse")) {
                            iterator.remove();
                        }
                    }
                } finally {
                    if (projectConnection != null) {
                        projectConnection.close();
                    }
                }

            }
        });
        return tasks;
//        return Collections.EMPTY_LIST;
    }

    public static Collection<File> resolveDependencies(File projDir) {
        // Configure the connector and create the connection
        Collection<File> filesToReturn;
        GradleConnector connector = GradleConnector.newConnector();
        connector.forProjectDirectory(projDir);
        ProjectConnection connection = connector.connect();
        try {
//            // Load the Eclipse model for the project:
            EclipseProject project = connection.getModel(EclipseProject.class);
//            System.out.println("Project: " + project.getName());
//            System.out.println("Project directory: " + project.getProjectDirectory());
//            System.out.println("Source directories:");
//            for (EclipseSourceDirectory srcDir : project.getSourceDirectories()) {
//                System.out.println(srcDir.getPath());
//            }
//            System.out.println("Project classpath:");
            filesToReturn = new ArrayList<File>(project.getClasspath().size());
            for (ExternalDependency externalDependency : project.getClasspath()) {
                System.out.println("File added: " + externalDependency);
                filesToReturn.add(externalDependency.getFile());
//                System.out.println(externalDependency.getFile().getName());
            }
        } finally {
            // Clean up
            connection.close();
        }
        return filesToReturn;
    }

    public static void executeGradleTasks(final String[] gradleTasks, final File file) {
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                DefaultGradleConnector connector = (DefaultGradleConnector) GradleConnector.newConnector();
                connector.embedded(false);
                ProjectConnection conn = connector.forProjectDirectory(file).connect();
                try {
                    BuildLauncher launcher = conn.newBuild().forTasks(gradleTasks);
                    launcher.run();
                } finally {
                    conn.close();
                }
            }
        });
        t.start();

//        ProjectConnection projectConnection = null;
//        try {
//            GradleConnector gradleConnector = GradleConnector.newConnector();
//            gradleConnector.forProjectDirectory(file);
//            projectConnection = gradleConnector.connect();
//            BuildLauncher buildLauncher = projectConnection.newBuild();
//            buildLauncher.forTasks(gradleTasks);
////            buildLauncher.addProgressListener(new ProgressListener() {
////                @Override
////                public void statusChanged(ProgressEvent pe) {
////                    StatusDisplayer.getDefault().setStatusText(pe.getDescription());
////                }
////            });
////            InputOutput io = IOProvider.getDefault().getIO(gradleTasks[0], true);
////            io.select();
////            OutputWriter ow = io.getOut();
////            buildLauncher.setStandardOutput(new WriterOutputStream(ow));
//            buildLauncher.run();
//        } finally {
//            if (projectConnection != null) {
//                projectConnection.close();
//            }
//        }
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
