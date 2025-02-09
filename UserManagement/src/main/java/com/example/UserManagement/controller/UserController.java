package com.example.UserManagement.controller;

import com.example.UserManagement.bean.User;
import com.example.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public List<User> retrieveAllUser(){
        return userService.findAllUser();
    }
    @GetMapping(path="/{id}")
    public User findUserByid(@PathVariable int id){
       return userService.findOne(id);
    }

    @PostMapping("/createuser")
    public User UsercreateUser(@RequestBody User user){
        return userService.save(user);
    }
}
