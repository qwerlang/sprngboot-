package com.example.bootlogin.mapper;
import com.example.bootlogin.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> findAll();
    User findByName(String name);
    String findPswByName(String UserName);
    void save(User user);
}