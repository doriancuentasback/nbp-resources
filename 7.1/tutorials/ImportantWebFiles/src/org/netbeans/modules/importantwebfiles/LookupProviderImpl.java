package org.netbeans.modules.importantwebfiles;

import org.netbeans.api.project.Project;
import org.netbeans.modules.web.spi.webmodule.WebModuleProvider;
import org.netbeans.spi.project.LookupProvider;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;

@LookupProvider.Registration(projectType = "org-netbeans-modules-web-project")
public class LookupProviderImpl implements LookupProvider {

    @Override
    public Lookup createAdditionalLookup(Lookup lookup) {
        
        Project prj = lookup.lookup(Project.class);
        
        //If there is a web module provider in the
        //project's lookup, add a new lookup item to
        //the lookup, which we will look for to determine
        //whether a node should be created:
        WebModuleProvider wmp = lookup.lookup(WebModuleProvider.class);
        if (wmp != null) {
            return Lookups.fixed(new MyCoolLookupItem(prj));
        }
        
        //If there is no web module in the lookup,
        //we do not add a new item to our lookup,
        //so that later a node will not be created:
        return Lookups.fixed();
        
    }

}