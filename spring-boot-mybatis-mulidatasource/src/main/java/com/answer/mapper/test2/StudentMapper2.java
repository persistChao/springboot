package com.answer.mapper.test2;

import com.answer.model.Student;

/**
 * StudentMapper2继承基类
 */
public interface StudentMapper2 {

    int deleteByPrimaryKey(long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}