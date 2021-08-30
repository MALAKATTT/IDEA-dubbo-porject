package com.thbpowernode.dubbo.service;

import com.thbpowernode.dubbo.model.User;

public interface UserService {

    /**
     * 根据用户表示获取用户信息
     * @param id 用户标识
     * @return
     */
    User queryUserById(Integer id,String username);
}
