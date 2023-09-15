package com.postgrestrail.demo12.controller;


import com.postgrestrail.demo12.model.User;
import com.postgrestrail.demo12.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUser(){
        List<User> users = userService.getAllUser();
        System.out.println("users : "+users);
        return users;
    }
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId){
        User user = userService.getUserById(userId);
        System.out.println("userId : "+userId+" : user : "+user);
        return user;
    }

    @PostMapping
    public String saveUser(@RequestBody User user){
        userService.saveUser(user);
        return "user saved successfuly.";
    }

    @PutMapping("/{userId}")
    public String updateUser(@RequestBody User user, @PathVariable Long userId){
        userService.updateUser(user, userId);
        return "user updated successfully.";
    }

    @DeleteMapping("/{userId}")
    public String deleteUseryId(@PathVariable Long userId){
        userService.deleteUseryId(userId);
        return "user deleted successfully.";
    }

}
