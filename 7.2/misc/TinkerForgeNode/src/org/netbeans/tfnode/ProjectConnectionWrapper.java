/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.tfnode;

import org.netbeans.api.project.Project;
import org.netbeans.api.visual.widget.ConnectionWidget;

/**
 *
 * @author geertjan
 */
public class ProjectConnectionWrapper {
    
    Project project;
    ConnectionWidget connectionWidget;

    public ProjectConnectionWrapper(Project project, ConnectionWidget connectionWidget) {
        this.project = project;
        this.connectionWidget = connectionWidget;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ConnectionWidget getConnectionWidget() {
        return connectionWidget;
    }

    public void setConnectionWidget(ConnectionWidget connectionWidget) {
        this.connectionWidget = connectionWidget;
    }
    
           
}
