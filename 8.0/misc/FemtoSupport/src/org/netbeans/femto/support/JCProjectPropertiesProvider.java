package org.netbeans.femto.support;
import org.netbeans.modules.javacard.project.JCProjectProperties;
import org.netbeans.spi.project.ProjectServiceProvider;
@ProjectServiceProvider(
        service=JCProjectProperties.class,
        projectType="org-netbeans-modules-java-j2seproject")
public class JCProjectPropertiesProvider extends JCProjectProperties{
    
}
