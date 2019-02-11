package com.answer.dao;

import com.answer.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * UsersMapper继承基类
 */
@Repository
public interface UsersMapper extends MyBatisBaseDao<Users, Long> {
}