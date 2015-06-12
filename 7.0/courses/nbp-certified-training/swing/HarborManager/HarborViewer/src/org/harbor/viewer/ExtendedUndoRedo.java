/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.harbor.viewer;

import org.openide.awt.UndoRedo;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author geertjan
 */
@ServiceProvider(service=UndoRedo.Manager.class)
public class ExtendedUndoRedo extends UndoRedo.Manager {
    
}
