package org.prediction.control;

import org.openide.modules.OnStart;
import org.openide.windows.WindowManager;
import org.openide.windows.WindowSystemEvent;
import org.openide.windows.WindowSystemListener;

@OnStart
public class Installer implements Runnable, WindowSystemListener  {

    @Override
    public void run() {
        WindowManager.getDefault().addWindowSystemListener(this);
    }

    @Override
    public void beforeLoad(WindowSystemEvent wse) {
        WindowManager.getDefault().setRole("specify");
        WindowManager.getDefault().removeWindowSystemListener(this);
    }

    @Override
    public void afterLoad(WindowSystemEvent wse) {
    }

    @Override
    public void beforeSave(WindowSystemEvent wse) {
    }

    @Override
    public void afterSave(WindowSystemEvent wse) {
    }
    
}