package com.future.api.user.web;

import com.future.api.user.domain.User;
import com.future.api.user.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * UserController
 *
 * @author Eric.guo
 * @date 2016/3/22 0022
 */
@RestController
@RequestMapping("/api")
public class UserController {

    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * Get users
     * @return
     */
    @RequestMapping(value = "/users",method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAll(){
        log.debug("REST request to get all Users");
        List<User> users =  userService.findAll();
        if(users !=null && users.size()>0){
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    /**
     * get user by id
     * @param id
     * @return
     */
    @RequestMapping(value = "/users/{id}" ,method = RequestMethod.GET ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getOne(@PathVariable("id") String id){
        log.debug("REST request to get user by id :{id}" ,id);
        User user = userService.findOne(id);
        if(user == null || user.equals("")){
            return new ResponseEntity<>("The 'id:{id}' user dose not exists",HttpStatus.NO_CONTENT);
        }else
            return new ResponseEntity<>(user,HttpStatus.OK);
    }

    /**
     * create user
     * @return
     */
    @RequestMapping(value = "/users" ,method = RequestMethod.POST ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody User user){
        log.debug("REST request to create user");
        User newUser = userService.save(user);
        return new ResponseEntity<>(newUser,HttpStatus.CREATED);
    }

    /**
     * update user by id
     * @param user
     * @return
     */
    @RequestMapping(value = "/users" ,method = RequestMethod.PUT ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody User user){
        log.debug("REST request to update user");
        if(user.getId() == null || user.getId().equals("")){
            return create(user);
        }else {
            return new ResponseEntity<>(userService.update(user),HttpStatus.OK);
        }
    }

}