/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit.movie.domain;

import java.util.Collection;

/**
 *
 * @author geertjan
 */
public interface MovieAnalysisAlgorithm {

    Collection<String> analyze(Movie movie1, Movie movie2);

}
