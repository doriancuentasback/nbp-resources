package org.terminal.container;

import java.awt.BorderLayout;
import org.netbeans.modules.terminal.api.TerminalContainer;
import org.openide.windows.TopComponent;
import org.openide.windows.IOContainer;

public class TerminalTopComponent extends TopComponent {

    private final TerminalContainer tc;

    public TerminalTopComponent() {
        setLayout(new BorderLayout());
        tc = TerminalContainer.create(TerminalTopComponent.this, "Local");
        add(tc, BorderLayout.CENTER);
    }

    public IOContainer getIOContainer() {
        return tc.ioContainer();
    }

    @Override
    protected void componentActivated() {
        super.componentActivated();
        tc.componentActivated();
    }

    @Override
    protected void componentDeactivated() {
        super.componentDeactivated();
        tc.componentDeactivated();
    }

}
