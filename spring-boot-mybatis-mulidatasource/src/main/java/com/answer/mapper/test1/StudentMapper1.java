package com.answer.mapper.test1;

import com.answer.model.Student;

import java.util.List;

/**
 * StudentMapper1继承基类
 */

public interface StudentMapper1 {
    int deleteByPrimaryKey(long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectAll();
}