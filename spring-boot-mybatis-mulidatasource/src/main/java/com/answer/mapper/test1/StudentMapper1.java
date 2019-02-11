package com.answer.mapper.test1;

import com.answer.mapper.MyBatisBaseDao;
import com.answer.model.Student;

import java.util.List;

/**
 * StudentMapper1继承基类
 */
public interface StudentMapper1 extends MyBatisBaseDao<Student, Long> {
    List<Student> selectAll();
}