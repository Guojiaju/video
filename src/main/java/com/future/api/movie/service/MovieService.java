package com.future.api.movie.service;

import com.future.api.movie.domain.Movie;
import com.future.api.movie.domain.MovieCriteria;
import com.future.commons.service.BaseService;

import java.util.List;

/**
 * MovieService
 *
 * @author Eric.guo
 * @date 2016/4/13 0013
 */
public interface MovieService extends BaseService<Movie,MovieCriteria> {
    List<Movie> getMovies(Movie movie);
}
