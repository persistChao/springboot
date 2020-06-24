package com.answer.service;

import com.answer.dao.AccountMapper;
import com.answer.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/2/1 16 02
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public int add(String name, double money) {
        return accountMapper.add(name, money);
    }

    @Override
    public int update(String name, double money, int id) {
        return accountMapper.update(name, money, id);
    }

    @Override
    public int delete(int id) {
        return accountMapper.delete(id);
    }

    @Override
    public Account findAccount(int id) {
        return accountMapper.findAccount(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountMapper.findAllAccountList();
    }

    @Override
    public Account findByName(String name) {
        return accountMapper.findByName(name);
    }
}
