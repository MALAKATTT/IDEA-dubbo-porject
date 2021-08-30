package com.thbpowernode.dubbo.web;

import com.thbpowernode.dubbo.model.User;
import com.thbpowernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userDetail")
    public String userDetail(Model model,Integer id, String username){
        User user = userService.queryUserById(id,username);
        model.addAttribute(user);
        return "userDetail";
    }
}
