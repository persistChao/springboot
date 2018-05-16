package com.answer.controller;

import com.answer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/cre")
    public String creatUser() {
        userService.create("a" , 1);
        userService.create("b" , 2);
        userService.create("c" , 3);
        userService.create("d" , 4);
        return "create user succss" ;
    }

}
