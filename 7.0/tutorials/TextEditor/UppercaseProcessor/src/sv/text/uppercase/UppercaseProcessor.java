/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.text.uppercase;

import org.openide.util.lookup.ServiceProvider;
import sv.text.api.TextProcessorInterface;

@ServiceProvider(service=TextProcessorInterface.class)
public class UppercaseProcessor implements TextProcessorInterface {

    @Override
    public String process(String text) {
        return text.toUpperCase();
    }

    @Override
    public String toString() {
        return "Uppercase";
    }
    
}
