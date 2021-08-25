package com.thbpowernode.dubbo.service.impl;

import com.thbpowernode.dubbo.model.User;
import com.thbpowernode.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("zhansgan");
        return user;
    }

    @Override
    public Integer queryUserCount() {
        return 9696;
    }
}
