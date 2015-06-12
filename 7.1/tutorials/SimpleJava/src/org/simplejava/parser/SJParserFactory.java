/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.simplejava.parser;

import java.util.Collection;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.ParserFactory;

public class SJParserFactory extends ParserFactory {

    @Override
    public Parser createParser (Collection<Snapshot> snapshots) {
        return new SJParser ();
    }

}