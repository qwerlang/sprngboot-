package com.example.bootlogin.controller;

import com.example.bootlogin.pojo.User;
import com.example.bootlogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;


    @PostMapping("/login")
    public String login(User user){
        return userService.login(user);
    }

    @PostMapping("/regist")
    public String regist(User user){
        return userService.regist(user);
    }

    @RequestMapping(value = "/alluser",method = RequestMethod.GET )//,Invalid bound statement (not found)
    public List<User> findAll(){
        return userService.findAll();
    }
}