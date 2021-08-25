package com.thbpowernode.dubbo.web;

import com.thbpowernode.dubbo.model.User;
import com.thbpowernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userDetail")
    public String userDetail(Model model,Integer id){

        //根据标识获取详情
        User user = userService.queryUserById(id);

        //获取人数
        Integer userCount = userService.queryUserCount();

        model.addAttribute("user",user);
        model.addAttribute("userCount",userCount);

        return "userDetail";
    }
}
