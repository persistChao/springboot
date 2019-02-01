package com.answer.controller;

import com.answer.entity.Account;
import com.answer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/2/1 16 08
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("list")
    public List<Account> getAccountList() {
        return accountService.findAccountList();
    }


    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable("id") int id) {
        return accountService.findAccount(id);
    }

    @PutMapping("/{id}")
    public Account updateAccount(@PathVariable("id") int id , @RequestParam("name") String name
            , @RequestParam("money") double money) {
        accountService.update(name, money, id);
        return accountService.findAccount(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id")int id) {
        int t= accountService.delete(id);
        if(t==1) {
            return "success";
        }else {
            return "fail";
        }

    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {

        int t= accountService.add(name,money);
        if(t==1) {
            return "success";
        }else {
            return "fail";
        }

    }
}
