/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.algorithm.sameactoranalysis;

import com.mit.movie.domain.Actor;
import com.mit.movie.domain.Movie;
import com.mit.movie.domain.MovieAnalysisAlgorithm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service = MovieAnalysisAlgorithm.class)
public class SameActorAnalysisAlgorithm implements MovieAnalysisAlgorithm {

    @Override
    public Collection<String> analyze(Movie movie1, Movie movie2) {
	Collection<String> listOne = new ArrayList<String>();
	Collection<String> listTwo = new ArrayList<String>();
//	for (Actor a1 : movie1.getActors().list()) {
//	    listOne.add(a1.getNsme());
//	}
//	for (Actor a2 : movie2.getActors().list()) {
//	    listTwo.add(a2.getNsme());
//	}
	Collection<String> similar = new HashSet<String>(listOne);
	Collection<String> different = new HashSet<String>();
	different.addAll(listOne);
	different.addAll(listTwo);
	similar.retainAll(listTwo);
	different.removeAll(similar);
	return similar;
    }

}
