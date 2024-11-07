package com.security.services;


import com.security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("abc", "abc", "abc@gmail.com"));
        list.add(new User("xyz", "abcxyz", "xyz@gmail.com"));
    }

    public List<User> getAllUsers(){
        return this.list;
    }

    public User getUser(final String username){
        return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    // add new user
    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
