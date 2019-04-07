package com.voice.web.controller;

import com.voice.service.UserService;
import com.voice.web.domain.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tiejunwang
 * @Description:
 * @Date: 2019-03-23
 **/

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UserService userService;


    @ApiOperation(value="Query user by username", notes = "Query user by username")
    @RequestMapping("query")
    public User queryUser(String username){

        return userService.queryUser(username);

    }

}
