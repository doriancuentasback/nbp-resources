package org.netbeans.examples.api.povray;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
    
    private Map scenes2listeners = new HashMap();

    public final void addChangeListener(FileObject scene, ChangeListener l) {

        //Get the string name of the scene file—there is no need to hold
        //the FileObject itself in memory forever, we can let it be garbage
        //collected, and just hold the string path, which is less expensive
        String scenePath = scene.getName();

        //Make sure what we're doing is thread safe
        synchronized (scenes2listeners) {

            //We will use a weak reference to listeners, rather than have a
            //remove listener method.  This will allow our nodes to be garbage
            //collected if they are hidden
            Reference listenerRef = new WeakReference(l);
            List listeners = (List) scenes2listeners.get(scenePath);
            if (listeners == null) {
                listeners = new LinkedList();
                //Map the listener list for this path to the path
                scenes2listeners.put(scenePath, listeners);
            }

            //Add the weak reference to the list of listeners interested in
            //this scene
            listeners.add(listenerRef);

        }

        //Call our callback method—probably the implementation will start
        //listening to deletions of the image file, because we will need to
        //fire those too.  Do this outside of the synchronized block—never
        //call foreign code under a lock
        listenerAdded(scene, l);
    }

    protected void listenerAdded(FileObject scene, ChangeListener l) {
        //do nothing, should be overridden.  Here we should start listening
        //for changes in the image file (particularly deletion)
    }

    protected void noLongerListeningTo(FileObject scene) {
        //detach any listeners for image files being created/destroyed here
    }

    /**
     * Fire a change event to any listeners that care about changes for the
     * passed scene file. If the scene file is null, fire changes to all
     * listeners for all files.
     *
     * @param scene a POV-Ray scene or include file
     */
    protected final void fireSceneChange(FileObject scene) {

        String scenePath = scene == null ? null : scene.getName();
        List fireTo = null;

        //Use the 3-state (null, false, true) nature of a Boolean to decide if
        //we have really stopped listening
        Boolean stillListening = null;

        synchronized (scenes2listeners) {
            //Get the list of paths -> weak references -> listeners for this
            //scene
            List listeners;
            if (scenePath != null) {
                listeners = (List) scenes2listeners.get(scenePath);
            } else {
                listeners = new ArrayList();
                for (Iterator i = scenes2listeners.keySet().iterator(); i.hasNext();) {
                    String path = (String) i.next();
                    List curr = (List) scenes2listeners.get(path);
                    if (curr != null) {
                        listeners.addAll(curr);
                    }
                }
            }
            if (listeners != null && !listeners.isEmpty()) {
                //Create a list to put the listeners we will fire to into
                fireTo = new ArrayList(3);
                for (Iterator i = listeners.iterator(); i.hasNext();) {
                    Reference ref = (Reference) i.next();
                    //Get the next change listener for this path
                    ChangeListener l = (ChangeListener) ref.get();
                    if (l != null) {
                        //Add it to the list if it still exists
                        fireTo.add(l);
                    } else {
                        //If not, remove the dead reference
                        i.remove();
                    }
                }
                //If there is nothing listening, remove the empty listener list
                //and stop paying attention to this path
                if (listeners.isEmpty()) {
                    scenes2listeners.remove(scenePath);
                    stillListening = Boolean.FALSE;
                } else {
                    stillListening = Boolean.TRUE;
                }
            }
        }

        //Call the listener removal method outside the synch block.
        //StillListening will be null if we were never listening at all
        if (stillListening != null && Boolean.FALSE.equals(stillListening)) {
            noLongerListeningTo(scene);
        }

        //Again, fire changes outside the synch block since we
        //are calling foreign code
        if (fireTo != null) {
            for (Iterator i = fireTo.iterator(); i.hasNext();) {
                ChangeListener l = (ChangeListener) i.next();
                l.stateChanged(new ChangeEvent(this));
            }
        }
    }
    
}
