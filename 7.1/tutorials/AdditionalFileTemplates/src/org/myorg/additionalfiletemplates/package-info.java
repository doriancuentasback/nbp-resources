@TemplateRegistration(
        folder = "Other",
        iconBase="org/myorg/additionalfiletemplates/Datasource.gif", 
        displayName = "#HTMLtemplate_displayName", 
        content = "HTML.html",
        description = "Description.html",
        scriptEngine="freemarker")
@Messages(value = "HTMLtemplate_displayName=Empty HTML file")
package org.myorg.additionalfiletemplates;

import org.netbeans.api.templates.TemplateRegistration;
import org.openide.util.NbBundle.Messages;
