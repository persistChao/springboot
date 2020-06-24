package com.answer.controller;

import com.alibaba.fastjson.JSONObject;
import com.answer.dao.UsersMapper;
import com.answer.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/2/11 12 13
 */
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UsersMapper usersMapper;

    /**
     * get user lis
     *
     * @return
     */
    @GetMapping("/list")
    public String getUserList() {
        List<Users> list = usersMapper.selectList();
        return JSONObject.toJSONString(list);
    }
}
