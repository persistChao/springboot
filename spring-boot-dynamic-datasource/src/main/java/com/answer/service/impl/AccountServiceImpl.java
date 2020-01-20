package com.answer.service.impl;

import com.answer.entity.Account;
import com.answer.mapper.AccountMapper;
import com.answer.service.AccountService;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author answer
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @DS("slave_1")
    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
