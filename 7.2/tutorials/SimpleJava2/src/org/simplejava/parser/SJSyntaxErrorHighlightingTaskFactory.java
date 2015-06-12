package org.simplejava.parser;

import java.util.Collection;
import java.util.Collections;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.TaskFactory;

@MimeRegistration(mimeType="text/x-sj",service=TaskFactory.class)
public class SJSyntaxErrorHighlightingTaskFactory extends TaskFactory {

    @Override
    public Collection create (Snapshot snapshot) {
        return Collections.singleton (new SJSyntaxErrorHighlightingTask());
    }

}