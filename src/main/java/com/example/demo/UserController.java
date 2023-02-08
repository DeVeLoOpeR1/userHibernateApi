package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add-user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/get-user/{userId}")
    public User getUser(@PathVariable("userId") int userId){
        return userService.getUser(userId);
    }
}
