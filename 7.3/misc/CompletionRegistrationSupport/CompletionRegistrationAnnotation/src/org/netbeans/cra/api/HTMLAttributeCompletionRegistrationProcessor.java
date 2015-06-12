package org.netbeans.cra.api;

import java.util.Set;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import org.openide.filesystems.annotations.LayerBuilder;
import org.openide.filesystems.annotations.LayerGeneratingProcessor;
import org.openide.filesystems.annotations.LayerGenerationException;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service = Processor.class)
@SupportedAnnotationTypes({
    "org.netbeans.cra.api.HTMLAttributeCompletionRegistration",
    "org.netbeans.cra.api.HTMLAttributeCompletionRegistrations"
})
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class HTMLAttributeCompletionRegistrationProcessor extends LayerGeneratingProcessor {

    @Override
    protected boolean handleProcess(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) throws LayerGenerationException {
        if (roundEnv.processingOver()) {
            return false;
        }
        for (Element e : roundEnv.getElementsAnnotatedWith(HTMLAttributeCompletionRegistration.class)) {
            HTMLAttributeCompletionRegistration r = e.getAnnotation(HTMLAttributeCompletionRegistration.class);
            if (r == null) {
                continue;
            }
            process(e, r);
        }
        for (Element e : roundEnv.getElementsAnnotatedWith(HTMLAttributeCompletionRegistrations.class)) {
            HTMLAttributeCompletionRegistrations rr = e.getAnnotation(HTMLAttributeCompletionRegistrations.class);
            if (rr == null) {
                continue;
            }
            for (HTMLAttributeCompletionRegistration t : rr.value()) {
                process(e, t);
            }
        }
        return true;
    }

    protected boolean process(Element e, HTMLAttributeCompletionRegistration t) throws LayerGenerationException {
        LayerBuilder builder = layer(e);
        LayerBuilder.File f = builder.file("Editors/text/xhtml/CompletionProviders/"+t.id() + ".instance");
        f.stringvalue("iconBase", t.iconBase());
        f.stringvalue("attribute", t.attribute());
        f.stringvalue("content", t.content());
        f.stringvalue("contentType", t.contentType());
        f.methodvalue("instanceCreate", "org.netbeans.cra.spi.HTMLAttributeCompletionProvider", "create");
        f.write();
        return true;
    }
    
}
