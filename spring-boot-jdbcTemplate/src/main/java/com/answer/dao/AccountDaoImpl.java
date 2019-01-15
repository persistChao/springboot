package com.answer.dao;

import com.answer.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/15 20 36
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("INSERT INTO account(name , money) VALUES (?,?)" , account.getName() , account.getMoney());
    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("UPDATE account SET name = ? , money=? WHERE id = ?" , account.getName() , account.getMoney() , account.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM account WHERE id = ?" , id);
    }

    @Override
    public Account findByAccountId(int id) {
        List<Account> list = jdbcTemplate.query("select * from account WHERE id = ?" , new Object[]{id} , new BeanPropertyRowMapper<>(Account.class));
        if (Objects.nonNull(list) && list.size() > 0) {
            Account account = list.get(0);
            return account;
        }
        return null;
    }

    @Override
    public List<Account> findAccountList() {
        List<Account> list = jdbcTemplate.query("select * from account", new Object[]{}, new BeanPropertyRowMapper(Account.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
