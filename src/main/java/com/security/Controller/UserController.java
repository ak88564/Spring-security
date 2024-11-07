package com.security.Controller;

import com.security.models.User;
import com.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("/")
    public List<User> getAllUsers(){
        return userservice.getAllUsers();
    }

    // return single user
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return userservice.getUser(username);
    }

    @PostMapping("/")
    public User add(@RequestBody User user){ // requestbody deserializes the json into java object
        return userservice.addUser(user);
    }


}
