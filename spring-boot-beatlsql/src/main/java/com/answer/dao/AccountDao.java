package com.answer.dao;

import com.answer.model.Account;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/31 18 07
 */
public interface AccountDao extends BaseMapper<Account> {

    @SqlStatement(params = "name")
    Account selectAccountByName(String name);
}
