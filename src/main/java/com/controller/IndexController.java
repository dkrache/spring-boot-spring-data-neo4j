package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public void get() {
        System.out.println(userService.getUsers());
    }

    @RequestMapping(method = RequestMethod.POST)
    public void save() {
        userService.save(new User("Name", "Password"));
    }

    @RequestMapping(value = "/clear", method = RequestMethod.DELETE)
    public void deleteAll() {
        userService.deleteAll();
    }
}
