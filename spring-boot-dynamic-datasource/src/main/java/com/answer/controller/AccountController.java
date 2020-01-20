package com.answer.controller;


import com.alibaba.fastjson.JSON;
import com.answer.entity.Account;
import com.answer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/list")
    public Object getAllAccount() {
        List<Account> list = accountService.findAll();
        return JSON.toJSONString(list);
    }
}
