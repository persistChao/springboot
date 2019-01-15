package com.answer.controller;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.answer.model.Account;
import com.answer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/15 20 49
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    private static Log log = LogFactory.get();


    @GetMapping("/all")
    public List<Account> getAccounts() {
        log.info("查询所有account信息");
        return accountService.findAccountList();
    }

}
