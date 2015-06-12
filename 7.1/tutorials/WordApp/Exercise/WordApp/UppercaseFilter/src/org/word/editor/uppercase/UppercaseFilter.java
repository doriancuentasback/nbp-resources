package org.word.editor.uppercase;

import org.openide.util.lookup.ServiceProvider;
import org.word.editor.api.TextFilter;

@ServiceProvider(service=TextFilter.class)
public class UppercaseFilter implements TextFilter {

    @Override
    public String process(String s) {
        return s.toUpperCase();
    }

    @Override
    public String toString() {
        return "Uppercase";
    }
    
}