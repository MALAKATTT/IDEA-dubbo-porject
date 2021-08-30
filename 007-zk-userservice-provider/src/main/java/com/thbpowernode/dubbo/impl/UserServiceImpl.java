package com.thbpowernode.dubbo.impl;

import com.thbpowernode.dubbo.model.User;
import com.thbpowernode.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id,String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        return user;
    }
}
