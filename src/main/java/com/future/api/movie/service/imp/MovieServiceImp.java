package com.future.api.movie.service.imp;

import com.future.api.movie.dao.MovieMapper;
import com.future.api.movie.domain.Movie;
import com.future.api.movie.domain.MovieCriteria;
import com.future.api.movie.service.MovieService;
import com.future.commons.dao.BaseDao;
import com.future.commons.service.imp.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * MovieServiceImp
 *
 * @author Eric.guo
 * @date 2016/4/13 0013
 */
@Service
@Transactional
public class MovieServiceImp extends BaseServiceImpl<Movie,MovieCriteria> implements MovieService {

    @Autowired
    private MovieMapper movieDao;

    @Override
    protected BaseDao<Movie, MovieCriteria, String> getDao() {
        return movieDao;
    }

    @Override
    public List<Movie> getMovies(Movie movie) {

        MovieCriteria criteria = new MovieCriteria();
        if(movie.getType() != null){
            criteria.createCriteria().andTypeEqualTo(movie.getType());
        }
        if(movie.getArea() != null){
            criteria.createCriteria().andAreaEqualTo(movie.getArea());
        }
        if(movie.getOwnerId() != null){
            criteria.createCriteria().andCreatedByEqualTo(movie.getOwnerId());
        }
        if(movie.getName() !=null){
            criteria.createCriteria().andNameLike(movie.getName());
        }
        return movieDao.selectByExample(criteria);
    }
}
