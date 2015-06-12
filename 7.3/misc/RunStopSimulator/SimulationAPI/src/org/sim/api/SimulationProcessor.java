/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sim.api;

import org.openide.filesystems.FileObject;

/**
 *
 * @author geertjan
 */
public interface SimulationProcessor {

    void process(FileObject fo);
}
