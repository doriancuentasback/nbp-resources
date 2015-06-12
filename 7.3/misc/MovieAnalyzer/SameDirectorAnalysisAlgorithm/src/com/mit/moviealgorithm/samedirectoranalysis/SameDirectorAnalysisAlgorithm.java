/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.moviealgorithm.samedirectoranalysis;

import com.mit.movie.domain.Movie;
import com.mit.movie.domain.MovieAnalysisAlgorithm;
import java.util.ArrayList;
import java.util.Collection;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service = MovieAnalysisAlgorithm.class)
public class SameDirectorAnalysisAlgorithm implements MovieAnalysisAlgorithm {

    @Override
    public Collection<String> analyze(Movie movie1, Movie movie2) {
	Collection<String> matchList = new ArrayList<String>();
	String director1 = movie1.getDirector().getNsme();
	String director2 = movie2.getDirector().getNsme();
	int value = director1.compareTo(director2);
	if (value == 0){
	    matchList.add(director1);
	}
	return matchList;
    }

}
