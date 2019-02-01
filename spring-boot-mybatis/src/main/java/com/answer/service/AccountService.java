package com.answer.service;

import com.answer.entity.Account;

import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/2/1 16 00
 */

public interface AccountService {

    int add(String name, double money);

    int update(String name, double money, int id);

    int delete(int id);

    Account findAccount(int id);

    List<Account> findAccountList();

}
