package org.netbeans.examples.api.povray;

import java.util.Properties;
import org.openide.filesystems.FileObject;

public abstract class RendererService {

    public static final String PROJECT_RENDERER_KEY_PREFIX = "renderer.";
    public static final String PRODUCTION_RENDERER_SETTINGS_NAME = "production";

    public abstract FileObject render(FileObject scene, String propertiesName);

    public abstract FileObject render(FileObject scene, Properties renderSettings);

    public abstract FileObject render(FileObject scene);

    public abstract FileObject render();

    public abstract String[] getAvailableRendererSettingsNames();

    public abstract Properties getRendererSettings(String name);

    public abstract String getPreferredRendererSettingsNames();

    public abstract String getDisplayName(String settingsName);
    
}
