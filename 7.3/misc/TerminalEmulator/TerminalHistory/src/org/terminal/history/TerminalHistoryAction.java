package org.terminal.history;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "History",
        id = "org.terminal.history.TerminalHistoryAction")
@ActionRegistration(
        lazy = false,
        displayName = "#CTL_TerminalHistoryAction")
@ActionReference(path = "Menu/File", position = 0)
@Messages("CTL_TerminalHistoryAction=Terminal History")
public final class TerminalHistoryAction extends AbstractAction implements Presenter.Menu, FileChangeListener {

    private JMenu menu;

    public TerminalHistoryAction() {
        menu = new JMenu();
        menu.setText("Terminal History");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Does nothing. A JMenu is returned, with its own set of Actions.
    }

    @Override
    public JMenuItem getMenuPresenter() {
        FileObject terminalHistoryFolder = FileUtil.getConfigFile("terminalhistory");
        terminalHistoryFolder.addFileChangeListener(this);
        for (FileObject fo : terminalHistoryFolder.getChildren()) {
            JMenuItem item = new JMenuItem();
            AbstractAction aa = new AbstractAction(fo.getName()) {
                @Override
                public void actionPerformed(ActionEvent e) {
                }
            };
            item.setAction(aa);
            menu.add(item);
        }
        return menu;
    }

    @Override
    public void fileDataCreated(FileEvent fe) {
        JMenuItem item = new JMenuItem();
        AbstractAction aa = new AbstractAction(fe.getFile().getName()) {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        };
        item.setAction(aa);
        menu.add(item);
    }

    @Override
    public void fileFolderCreated(FileEvent fe) {
    }

    @Override
    public void fileChanged(FileEvent fe) {
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
    
}
