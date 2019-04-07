package com.voice.service.impl;

import com.voice.service.UserService;
import com.voice.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voice.dao.mapper.*;

/**
 * @Author: tiejunwang
 * @Description:
 * @Date: 2019-03-23
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUser(String username) {

        User user = new User();
        user.setUsername(username);

        return userMapper.selectOne(user);

    }
}
