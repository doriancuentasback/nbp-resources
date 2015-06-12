package org.netbeans.sticky;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.*;
import org.netbeans.api.visual.action.ActionFactory;
import org.netbeans.api.visual.action.PopupMenuProvider;
import org.netbeans.api.visual.action.TwoStateHoverProvider;
import org.netbeans.api.visual.action.WidgetAction;
import org.netbeans.api.visual.border.BorderFactory;
import org.netbeans.api.visual.widget.ComponentWidget;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.netbeans.editor.SideBarFactory;
import org.openide.awt.StatusDisplayer;
import org.openide.text.NbDocument;
import org.openide.util.RequestProcessor;
import org.openide.util.RequestProcessor.Task;

/**
 * @author Geertjan Wielenga <geertjan.wielenga at oracle.com>
 */
public class StickyNoteSideBar extends JPanel {

    private Scene s = new Scene();
    private LayerWidget lw = new LayerWidget(s);
    private LayerWidget clw = new LayerWidget(s);
    private int ySpacer = 0;
    private final JTextComponent target;
    public static final int REFRESH_DELAY = 1000;
    private final RequestProcessor rp;

    public StickyNoteSideBar(final JTextComponent target) {
        setLayout(new BorderLayout());
        this.target = target;
        rp = new RequestProcessor(target.getName(), 1);
        refreshNotes();
        s.getActions().addAction(ActionFactory.createPopupMenuAction(new PopupMenuProvider() {
            @Override
            public JPopupMenu getPopupMenu(Widget widget, Point localLocation) {
                JPopupMenu jpm = new JPopupMenu();
                //TODO: Add "Save" action!
                //TODO: Add "Print" action!
                //TODO: Add "Export" action!
                JMenuItem refreshNotesItem = new JMenuItem("Refresh Notes");
                refreshNotesItem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        refreshNotes();
                    }
                });
                jpm.add(refreshNotesItem);
                JMenuItem addNewNoteItem = new JMenuItem("Add New Note");
                addNewNoteItem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lw.addChild(new StickyNoteWidget(s, target, new StickyNote(), ySpacer++, "Note: ", Color.YELLOW));
                        s.validate();
                    }
                });
                jpm.add(addNewNoteItem);
                return jpm;
            }
        }));
        setupAutoRefresh(target);
        s.addChild(lw);
        s.addChild(clw);
        JScrollPane jsp = new JScrollPane();
        jsp.setViewportView(s.createView());
        add(jsp, BorderLayout.CENTER);
    }

    private void setupAutoRefresh(final JTextComponent target) {
        target.getDocument().addDocumentListener(new DocumentListener() {
            private Task lastRefreshTask;
            @Override
            public void insertUpdate(DocumentEvent de) {
                doRefresh();
            }
            @Override
            public void removeUpdate(DocumentEvent de) {
                doRefresh();
            }
            @Override
            public void changedUpdate(DocumentEvent de) {
                doRefresh();
            }
            private void doRefresh() {
                if (lastRefreshTask != null && !lastRefreshTask.isFinished()) {
                    lastRefreshTask.schedule(REFRESH_DELAY);
                } else {
                    lastRefreshTask = rp.post(new Runnable() {

                        @Override
                        public void run() {
                            refreshNotes();
                        }
                    }, REFRESH_DELAY);
                }
            }
        });
    }

    private void refreshNotes() {
        ySpacer = 0;
        lw.removeChildren();
        final StyledDocument doc = (StyledDocument) target.getDocument();
        ElementIterator it = new ElementIterator(doc.getDefaultRootElement());
        Element e;
        while ((e = it.next()) != null) {
            if (e.isLeaf()) {
                int rangeStart = e.getStartOffset();
                int rangeEnd = e.getEndOffset();
                try {
                    String line = target.getText(rangeStart, rangeEnd - rangeStart);
                    if (line.trim().startsWith("//TODO")) {
                        int lineNo = NbDocument.findLineNumber(doc, rangeStart) + 1;
                        lw.addChild(new StickyNoteWidget(
                                s,
                                target,
                                new StickyNote(),
                                ySpacer++,
                                line.trim().replaceAll("//TODO", "Line " + lineNo),
                                Color.RED));
                    }
                } catch (BadLocationException ex) {
                }
            }
        }
        lw.addChild(new StickyNoteWidget(
                s,
                target,
                new StickyNote(),
                ySpacer++, "Note:", Color.YELLOW));
        s.validate();
    }

    private class StickyNoteWidget extends ComponentWidget {
        public StickyNoteWidget(
                Scene scene,
                final JTextComponent target,
                final StickyNote note,
                int ySpacer,
                String text,
                Color color) {
            super(scene, note);
            note.setText(text);
            note.setNoteColor(color);
            setPreferredLocation(new Point(10, ySpacer * 100));
            getActions().addAction(ActionFactory.createResizeAction());
            getActions().addAction(ActionFactory.createAlignWithMoveAction(lw, clw, null));
            WidgetAction hoverAction = ActionFactory.createHoverAction(new TwoStateHoverProvider() {
                @Override
                public void unsetHovering(Widget w) {
                    w.setBorder(BorderFactory.createEmptyBorder(5));
                }
                @Override
                public void setHovering(Widget w) {
                    w.setBorder(BorderFactory.createResizeBorder(5, Color.BLACK, false));
                }
            });
            getActions().addAction(hoverAction);
            getActions().addAction(ActionFactory.createPopupMenuAction(new PopupMenuProvider() {
                @Override
                public JPopupMenu getPopupMenu(final Widget widget, Point localLocation) {
                    JPopupMenu jpm = new JPopupMenu("");
                    JMenuItem jumpToLineItem = new JMenuItem("Jump to Line");
                    jumpToLineItem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int start = note.getText().indexOf(" ");
                            int end = note.getText().indexOf(":");
                            try {
                                String number = note.getText().substring(start, end).trim();
                                int offset = NbDocument.findLineOffset((StyledDocument) target.getDocument(), Integer.parseInt(number));
                                target.setCaretPosition(offset - 1);
                            } catch (Exception f) {
                                StatusDisplayer.getDefault().setStatusText("No line...");
                            }
                        }
                    });
                    jpm.add(jumpToLineItem);
                    JMenuItem changeColorItem = new JMenuItem("Change Color");
                    changeColorItem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JColorChooser cc = new JColorChooser(Color.yellow);
                            JDialog dialog = JColorChooser.createDialog(cc, "Choose Color", true, cc, null, null);
                            dialog.setVisible(true);
                            note.setNoteColor(cc.getColor());
                        }
                    });
                    jpm.add(changeColorItem);
                    JMenuItem deleteNoteItem = new JMenuItem("Delete Note");
                    deleteNoteItem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            lw.removeChild(widget);
                            s.validate();
                        }
                    });
                    jpm.add(deleteNoteItem);
//                    JMenuItem deleteAllItem = new JMenuItem("Delete Both");
//                    deleteAllItem.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            int start = note.getText().indexOf(" ");
//                            int end = note.getText().indexOf(":");
//                            try {
//                                String number = note.getText().substring(start, end).trim();
//                                int offset = NbDocument.findLineOffset((StyledDocument) target.getDocument(), Integer.parseInt(number));
//                                StyledDocument doc = (StyledDocument) target.getDocument();
//                                try {
//                                    doc.remove(offset - 1, ???);
//                                } catch (Exception f) {
//                                    Exceptions.printStackTrace(f);
//                                }
//                                target.setCaretPosition(offset);
//                                lw.removeChild(widget);
//                                s.validate();
//                            } catch (Exception f) {
//                                StatusDisplayer.getDefault().setStatusText("No line...");
//                            }
//
//                        }
//                    });
//                    jpm.add(deleteAllItem);
                    return jpm;
                }
            }));
            scene.getActions().addAction(hoverAction);
            scene.revalidate();
        }
    }

    public static final class NavigationSideBarFactory implements SideBarFactory {
        @Override
        public JComponent createSideBar(JTextComponent target) {
            return new StickyNoteSideBar(target);
        }
    }
    
}