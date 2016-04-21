package com.future.api.user.web;

import com.future.api.user.domain.User;
import com.future.api.user.service.UserService;

import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

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
        PageInfo<User> users =  userService.getAllUsers();
        return new ResponseEntity<>(users.getList(), HttpStatus.OK);

       /* if(users !=null && users.size()>0){
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
        else{
            return ResponseEntity.noContent().build();
        }*/
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
            return ResponseEntity.noContent().build();
        }else
            return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    /**
     * create user
     * @return
     */
    @RequestMapping(value = "/users" ,method = RequestMethod.POST ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody User user) throws URISyntaxException{
        log.debug("REST request to create user");
        User newUser = userService.save(user);
        return ResponseEntity.created(new URI("/api/users/"+ newUser.getId())).build();
    }

    /**
     * update user by id
     * @param user
     * @return
     */
    @RequestMapping(value = "/users" ,method = RequestMethod.PUT ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody User user)throws URISyntaxException{
        log.debug("REST request to update user");
        if(user.getId() == null || user.getId().equals("")){
            return create(user);
        }else {
            return new ResponseEntity<>(userService.update(user),HttpStatus.OK);
        }
    }

}