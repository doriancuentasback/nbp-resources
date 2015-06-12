package org.abc.file;

import org.netbeans.spi.navigator.NavigatorLookupHint;

public class AbcNavigatorLookupHint implements NavigatorLookupHint {
    
    @Override
    public String getContentType() {
        return "text/x-abc";
    }
    
}