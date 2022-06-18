package com.example.bootlogin.service;
import com.example.bootlogin.mapper.UserMapper;
import com.example.bootlogin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public String login(User user){
        try {
            User userExistN=userMapper.findByName(user.getUsername());
            System.out.println(userExistN);
            if (userExistN!=null){
                String userExistP=userMapper.findPswByName(user.getUsername());
                if (userExistP.equals(user.getPassword())){
                    return user.getUsername()+"用户登录成功，欢迎您！";
                }else {
                    return "登录失败，密码错误";
                }
            }else {
                return "登录失败，账户不存在";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    public String regist(User user){
        try {
            User userExist=userMapper.findByName(user.getUsername());
            if (user.getUsername().equals("")){
                return "账户名不能为空";
            }else if (user.getPassword().equals("")){
                return "密码不能为空";
            }else if (userExist!=null) {
                return "账户已经存在";
            }else {
                userMapper.save(user);
                return "注册成功";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }


    public List<User> findAll(){
        List<User> list=userMapper.findAll();
        return list;
    }


}
