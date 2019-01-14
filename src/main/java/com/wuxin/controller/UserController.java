package com.wuxin.controller;

import com.wuxin.dao.UserRepository;
import com.wuxin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/user/{id}")
    public User findById(@PathVariable Integer id) {
//        User user = userRepository.findOne(id);
        return null;
    }
}
