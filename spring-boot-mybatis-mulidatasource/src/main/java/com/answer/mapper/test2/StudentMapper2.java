package com.answer.mapper.test2;

import com.answer.mapper.MyBatisBaseDao;
import com.answer.model.Student;

import java.util.List;

/**
 * StudentMapper2继承基类
 */
public interface StudentMapper2 extends MyBatisBaseDao<Student, Long> {

    List<Student> selectAll();
}