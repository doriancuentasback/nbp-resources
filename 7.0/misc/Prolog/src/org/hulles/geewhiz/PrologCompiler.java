/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hulles.geewhiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;
import java.util.prefs.Preferences;
import org.openide.awt.StatusDisplayer;
import org.openide.cookies.LineCookie;
import org.openide.cookies.SaveCookie;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.text.Line;
import org.openide.util.Exceptions;
import org.openide.util.NbPreferences;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OutputEvent;
import org.openide.windows.OutputListener;
import org.openide.windows.OutputWriter;

/**
 *
 * @author mark
 */
public class PrologCompiler {
    private DataObject dataObject;
    private String fileName;
    private String compilerName;
    private String compilerArgs;
    
    public PrologCompiler() {
        Preferences pref;
        
        this.dataObject = null;
        pref = NbPreferences.forModule(PrologPanel.class);
        this.compilerName = pref.get("compilerName", "");
        this.compilerArgs = pref.get("compilerArgs", "");
        
        pref.addPreferenceChangeListener(new PreferenceChangeListener() {
            public void preferenceChange(PreferenceChangeEvent evt) {
                if (evt.getKey().equals("compilerName")) {
                    compilerName = (evt.getNewValue());
                } else if (evt.getKey().equals("compilerArgs")) {
                    compilerArgs = (evt.getNewValue());
                }
            }
        });
    }
    
    public void compileDataObject(DataObject dObj) {
        ProcessBuilder procBuilder;
        Process process;
        List<String> cmd;
        Map<String, String> env;
        String line;
        InputOutput io;
        OutputWriter outputWriter;
        SaveCookie sCookie;

        
        // set DataObject and file name
        this.dataObject = dObj;
        File file = FileUtil.toFile(dObj.getPrimaryFile());
        this.fileName = file.getAbsolutePath();
        
        // save file first if it's been modified
        sCookie = dObj.getCookie (SaveCookie.class);
        if (sCookie != null) {
            try {
                sCookie.save();
                StatusDisplayer.getDefault().setStatusText("Save finished");
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        
        // get an output window tab
        io = IOProvider.getDefault().getIO("Prolog", false);
        io.select();
        outputWriter = io.getOut();

        // first see if we have a compiler available
        if (this.compilerName.isEmpty()) {
            outputWriter.println("You need to set up the compiler first.");
            outputWriter.println("In the main menu go to 'Tools / Options / Miscellaneous / Prolog'.");
            whiteLines(outputWriter);
            outputWriter.close();
            return;
        }

        // construct the SWI Prolog process command
        cmd = new ArrayList<String>();
        cmd.add(this.compilerName);
        cmd.add(this.compilerArgs);
        cmd.add(fileName);
        
        procBuilder = new ProcessBuilder(cmd);
        procBuilder.redirectErrorStream(true);
        try {
            process = procBuilder.start();
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            // TODO: might want to clear the output window first...
            outputWriter.printf("Output of running %s is:\n\n", commandString(cmd));
            while ((line = br.readLine()) != null) {
                if (lineIsNotable(line)) {
                    outputWriter.println(line, listener);
                } else {
                    outputWriter.println(line);
                }
            }
        } catch (IOException ex) {
            outputWriter.println("Error occurred running Prolog compiler. Check options.");
            outputWriter.println("In the main menu go to 'Tools / Options / Miscellaneous / Prolog'.");
            outputWriter.printf("Command string is %s.\n", commandString(cmd));
     //       Exceptions.printStackTrace(ex);
        } finally {
            whiteLines(outputWriter);
            outputWriter.close();
        }
    }

    private OutputListener listener = new OutputListener() {
        public void outputLineAction(OutputEvent ev) {
            String outputLine;
            Line editorLine;
            LineCookie lCookie;
            int lineNumber;
            int columnNumber;
            
            outputLine = ev.getLine();
            lineNumber = parseLineNumber(outputLine);
            columnNumber = parseColumnNumber(outputLine);
//            System.out.printf("Showing line %d column %d.\n", lineNumber, columnNumber);
            lCookie = dataObject.getCookie (LineCookie.class);
            editorLine = lCookie.getLineSet ().getOriginal (lineNumber-1);
            editorLine.show (Line.SHOW_GOTO, columnNumber);

            StatusDisplayer.getDefault().setStatusText("Fix me!");
        }
        public void outputLineSelected(OutputEvent ev) {
            // Let's not do anything special.
        }
        public void outputLineCleared(OutputEvent ev) {
            // Leave it blank, no state to remove.
        }

    };
    
    private boolean lineIsNotable(String line) {
        boolean result = false;
        
        if (line.startsWith("Warning:") || line.startsWith("ERROR:")) {
            result = true;
        }
        return result;
    }
    
/*
 * SAMPLE SWI PROLOG LINES:
ERROR: /home/mark/NetBeansProjects/BraveNewWorld/src/bravenewworld/sieve.pro:16:0: Syntax error: Operator expected
Warning: (/home/mark/NetBeansProjects/BraveNewWorld/src/bravenewworld/sieve.pro:18): Singleton variables: [P]
*/
    
    private int parseLineNumber(String line) {
        int fpos;
        int startpos;
        int lineNumber;
        Character ch;
        StringBuffer numBuf;
        
        fpos = line.indexOf(this.fileName);
        // assuming there are no colons in file name!
        startpos = line.indexOf(":", fpos);
        if (startpos == -1) {
            // lineNumber is converted to lineNumber - 1
            //     this causes an exception in caller if this is 0
            //     so return 1 instead
            return 1;
        }
        numBuf = new StringBuffer();
        for (int i = startpos+1; i < line.length(); i++) {
            ch = line.charAt(i);
            if (Character.isDigit(ch)) {
                numBuf.append(ch);
            } else {
                break;
            }
        }
        lineNumber = Integer.parseInt(numBuf.toString());
        return lineNumber;
    }
    
    private int parseColumnNumber(String line) {
        int fpos;
        int startpos;
        int colNumber;
        Character ch;
        StringBuffer numBuf;
        int colstart = -1;
        
        fpos = line.indexOf(this.fileName);
        // assuming there are no colons in file name!
        startpos = line.indexOf(":", fpos);
        if (startpos == -1) {
            return 0;
        }
        for (int i = startpos+1; i < line.length(); i++) {
            ch = line.charAt(i);
            if (Character.isDigit(ch)) {
                // skip line number
            } else {
                colstart = i;
                break;
            }
        }
        if ((colstart == -1) || (line.charAt(colstart) != ':')) {
            return 0;
        }
        numBuf = new StringBuffer();
        for (int i = colstart+1; i < line.length(); i++) {
            ch = line.charAt(i);
            if (Character.isDigit(ch)) {
                numBuf.append(ch);
            } else {
                break;
            }
        }
        colNumber = Integer.parseInt(numBuf.toString());
        return colNumber;
    }
    
    private void whiteLines(OutputWriter ow) {
        final int limit = 3;
        
        for(int i = 0; i < limit; i++) {
            ow.println();
        }
    }
    
    private String commandString(List<String> cmds) {
        StringBuffer sBuf;
        
        sBuf = new StringBuffer();
        for (String cmd : cmds) {
            sBuf.append(cmd);
            sBuf.append(' ');
        }
        // leave extra space on the end
        return sBuf.toString();
    }
}
