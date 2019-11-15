package com.tulasi.demo.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
import java.util.List;  
import java.util.Optional;  
@RestController  
public class UserController {  
    @Autowired  
    private UserService userService;   
    @RequestMapping("/")  
    public List<UserRecord> getAllUser(){  
        return userService.getAllUsers();  
    }     
    @PostMapping(value="/add-user")  
    public void addUser(@RequestBody UserRecord userRecord){  
        userService.addUser(userRecord);  
    }  
    @GetMapping(value="/user/{id}")  
    public Optional<UserRecord> getUser(@PathVariable String id){  
        return userService.getUser(id);  
    }  
}  
