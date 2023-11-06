package com.anudip.controller;

import com.anudip.entities.User;
import com.anudip.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public User registerStudent(@RequestBody User student){
        return this.userService.add(student);
    }

    @GetMapping("/getById/{id}")
    public User getStudent(@PathVariable Integer id){
        return this.userService.getUserById(id);
    }
}
