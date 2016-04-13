package com.future.api.movie.service.imp;

import com.future.api.movie.dao.MovieMapper;
import com.future.api.movie.domain.Movie;
import com.future.api.movie.domain.MovieCriteria;
import com.future.api.movie.service.MovieService;
import com.future.commons.dao.BaseDao;
import com.future.commons.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MovieServiceImp
 *
 * @author Eric.guo
 * @date 2016/4/13 0013
 */
@Service
public class MovieServiceImp extends BaseServiceImpl<Movie,MovieCriteria> implements MovieService {

    @Autowired
    private MovieMapper movieDao;

    @Override
    protected BaseDao<Movie, MovieCriteria, String> getDao() {
        return movieDao;
    }
}
