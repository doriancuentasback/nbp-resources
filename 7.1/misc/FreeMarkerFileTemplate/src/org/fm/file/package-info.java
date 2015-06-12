@TemplateRegistrations({
    
    @TemplateRegistration(folder = "Classes",
    displayName = "#SimpleTemplate_displayName",
    content = "simple/simplefile.java.template",
    description="simple/simplefile-desc.html",
    position=10,
    scriptEngine = "freemarker"),
    
    @TemplateRegistration(folder = "Classes",
    displayName = "#ComplexTemplate_displayName",
    content = "complex/complexfile.java.template",
    description="complex/complexfile-desc.html",
    position=15,
    scriptEngine = "freemarker")
        
})

@Messages({
    "SimpleTemplate_displayName=Simple Java file",
    "ComplexTemplate_displayName=Complex Java file"})

package org.fm.file;

import org.netbeans.api.templates.TemplateRegistration;
import org.netbeans.api.templates.TemplateRegistrations;
import org.openide.util.NbBundle.Messages;
