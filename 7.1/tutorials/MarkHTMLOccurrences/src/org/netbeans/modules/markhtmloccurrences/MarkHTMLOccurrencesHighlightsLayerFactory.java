package org.netbeans.modules.markhtmloccurrences;

import javax.swing.text.Document;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.api.editor.mimelookup.MimeRegistrations;
import org.netbeans.spi.editor.highlighting.HighlightsLayer;
import org.netbeans.spi.editor.highlighting.HighlightsLayerFactory;
import org.netbeans.spi.editor.highlighting.ZOrder;

@MimeRegistrations({
    @MimeRegistration(mimeType = "text/html", service = HighlightsLayerFactory.class),
    @MimeRegistration(mimeType = "text/xml", service = HighlightsLayerFactory.class)
})
public class MarkHTMLOccurrencesHighlightsLayerFactory implements HighlightsLayerFactory {

    public static MarkHTMLOccurrencesHighlighter getMarkOccurrencesHighlighter(Document doc) {
        MarkHTMLOccurrencesHighlighter highlighter =
                (MarkHTMLOccurrencesHighlighter) doc.getProperty(MarkHTMLOccurrencesHighlighter.class);
        if (highlighter == null) {
            doc.putProperty(MarkHTMLOccurrencesHighlighter.class,
                    highlighter = new MarkHTMLOccurrencesHighlighter(doc));
        }
        return highlighter;
    }

    @Override
    public HighlightsLayer[] createLayers(Context context) {
        return new HighlightsLayer[]{
                    HighlightsLayer.create(
                    MarkHTMLOccurrencesHighlighter.class.getName(),
                    ZOrder.CARET_RACK.forPosition(2000),
                    true,
                    getMarkOccurrencesHighlighter(context.getDocument()).getHighlightsBag())
                };
    }
    
}