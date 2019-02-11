package com.answer.controller;

import com.answer.mapper.test1.StudentMapper1;
import com.answer.mapper.test2.StudentMapper2;
import com.answer.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/2/11 16 43
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentMapper1 studentMapper1;

    @Autowired
    StudentMapper2 studentMapper2;


    @GetMapping("all")
    public List<Student> getAll() {
        return studentMapper1.selectAll();
    }

    @RequestMapping("/{id}")
    public Student getById(@PathVariable("id") Long id) {
        return studentMapper2.selectByPrimaryKey(id);
    }


}
