/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myfilter;

import com.mycompany.textfilter.TextFilter;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service=TextFilter.class)
public class UpperCaseFilter implements TextFilter {

    @Override
    public String process(String s) {
        return s.toUpperCase();
    }
    
}