/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.text.lowercase;

import org.openide.util.lookup.ServiceProvider;
import sv.text.api.TextProcessorInterface;

@ServiceProvider(service = TextProcessorInterface.class)
public class LowercaseProcessor implements TextProcessorInterface {

    @Override
    public String process(String text) {
        return text.toLowerCase();
    }

    @Override
    public String toString() {
        return "Lowercase";
    }
    
}
