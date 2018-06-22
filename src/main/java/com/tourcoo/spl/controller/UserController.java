package com.tourcoo.spl.controller;

import com.tourcoo.spl.domain.User;
import com.tourcoo.spl.mapper.UserMapper;
import com.tourcoo.spl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "add")
    public void add() {
        User user = new User();
        user.setName("spring1");
        user.setBorn(new Date());
        user.setPhone("13452424563");
        user.setPwd("sfssdfsa");

        int id = userService.add(user);
        return;
    }

    @GetMapping(value = "getUsers")
    public List getUsers() {
        return userMapper.getAll();

    }
}
