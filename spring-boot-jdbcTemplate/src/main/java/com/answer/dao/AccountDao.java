package com.answer.dao;

import com.answer.model.Account;

import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/15 20 34
 */
public interface AccountDao {

    /**
     * 添加
     *
     * @param account
     * @return
     */
    int add(Account account);

    /**
     * 更新
     *
     * @param account
     * @return
     */
    int update(Account account);

    int delete(int id);

    Account findByAccountId(int id);

    List<Account> findAccountList();
}
