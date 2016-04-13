package com.future.api.login;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountController
 *
 * @author Eric.guo
 * @date 2016/4/12 0012
 */

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @RequestMapping("/login")
    public ResponseEntity login(){
        return null;
    }
}

