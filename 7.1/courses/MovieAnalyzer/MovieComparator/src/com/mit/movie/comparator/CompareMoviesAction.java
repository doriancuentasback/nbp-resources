/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.comparator;

import com.mit.movie.domain.Movie;
import com.mit.movie.domain.MovieAnalysisAlgorithm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

@ActionID(category = "Movie",
id = "com.mit.movie.viewer.CompareMoviesAction")
@ActionRegistration(displayName = "#CTL_CompareMoviesAction",
iconBase = "com/mit/movie/comparator/icn_compare.gif")
@ActionReferences({
    @ActionReference(path = "Menu/Tools"),
    @ActionReference(path = "Toolbars/File")
})
@Messages("CTL_CompareMoviesAction=Compare Movies")
public final class CompareMoviesAction implements ActionListener {

    private final List<Movie> context;

    public CompareMoviesAction(List<Movie> context) {
	this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
	List<String> similar = new ArrayList<String>();
	Movie movie1 = null;
	Movie movie2 = null;
	for (int i = 0; i < context.size(); i++) {
	    if (i == 0) {
		movie1 = context.get(0);
	    } else if (i == 1) {
		movie2 = context.get(1);
	    }
	}
	Collection<? extends MovieAnalysisAlgorithm> maas = Lookup.getDefault().lookupAll(MovieAnalysisAlgorithm.class);
	for (MovieAnalysisAlgorithm maa : maas) {
	    similar.addAll(maa.analyze(movie1, movie2));
	}
	ComparatorTopComponent ctc = (ComparatorTopComponent) WindowManager.getDefault().findTopComponent("ComparatorTopComponent");
	ctc.open();
	ctc.requestActive();
	ctc.setUniqueList(similar);
    }
}
