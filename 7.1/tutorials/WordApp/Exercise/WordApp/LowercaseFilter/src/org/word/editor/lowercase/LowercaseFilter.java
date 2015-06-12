package org.word.editor.lowercase;

import org.openide.util.lookup.ServiceProvider;
import org.word.editor.api.TextFilter;

@ServiceProvider(service=TextFilter.class)
public class LowercaseFilter implements TextFilter {

    @Override
    public String process(String s) {
        return s.toLowerCase();
    }

    @Override
    public String toString() {
        return "Lowercase";
    }
    
}