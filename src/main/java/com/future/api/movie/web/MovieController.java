package com.future.api.movie.web;

import com.future.api.movie.domain.Movie;
import com.future.api.movie.service.MovieService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * MovieController
 *
 * @author Eric.guo
 * @date 2016/4/16 18:42
 */
@RestController
@RequestMapping("/api")
public class MovieController {
    @Autowired
    private MovieService movieService;

   /* @RequestMapping(value = "/movies",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody Movie movie){

        return null;
    }*/
    @ApiOperation(value = "根据查询条件获取对应的movies" ,position = 1)
    @RequestMapping(value = "/movies",method = RequestMethod.POST ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> get(@RequestBody Movie movie){
        List<Movie> movieList = movieService.getMovies(movie);
        return ResponseEntity.ok(movieList);
    }
}
