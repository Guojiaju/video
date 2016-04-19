package com.future.api.movie.web;

import com.future.api.movie.domain.Movie;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * MovieController
 *
 * @author Eric.guo
 * @date 2016/4/16 18:42
 */
@RestController
@RequestMapping("/api")
public class MovieController {
    @RequestMapping(value = "/movies",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody Movie movie){

        return null;
    }
    @RequestMapping(value = "")
    public ResponseEntity get(){
        return null;
    }
}
