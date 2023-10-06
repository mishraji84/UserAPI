package org.example.controller;

import org.example.User;
import org.example.dao.UserDaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResources {
private UserDaoService service;

    public UserResources(UserDaoService service) {
        this.service = service;
    }
    @GetMapping("/Users")
    public List<User> getAllUsers()
    {
        return service.findAll();
    }
    @GetMapping("/Users/{id}")
    public User getUsers(@PathVariable int id)
    {
        return service.findOne(id);
    }
    @PostMapping("/Users")
    public User createUser(@RequestBody User user)
    {
        return service.saveUser(user);
    }
}
