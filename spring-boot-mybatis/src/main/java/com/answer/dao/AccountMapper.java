package com.answer.dao;

import com.answer.entity.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/2/1 15 55
 */

public interface AccountMapper {

    @Insert("insert into account(name , money) values(#{name} , #{money}) ")
    int add(@Param("name") String name, @Param("money") double money);

    @Update("update account set name = #{name} , money = #{money} where id = #{id}")
    int update(@Param("name") String name, @Param("money") double money, @Param("id") int id);

    @Delete("delete from account where id = #{id}")
    int delete(int id);

    @Select("select id id  , name  name , money money  from account ")
    List<Account> findAllAccountList();

    @Select("select id, name as name, money as money from account where id = #{id}")
    Account findAccount(@Param("id") int id);


    @Select("select id id , name name ,money money from account where name=#{name} limit 1")
    Account findByName(@Param("name") String name);
}
