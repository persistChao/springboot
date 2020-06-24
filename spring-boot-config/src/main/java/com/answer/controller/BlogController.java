package com.answer.controller;

import com.alibaba.fastjson.JSON;
import com.answer.config.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @Autowired
    BlogProperties blogProperties;

    @GetMapping("/blog")
    public String blog() {

//        BlogProperties blogProperties = new BlogProperties();
        String blogstr = JSON.toJSONString(blogProperties);
        String s = "blog name is " + blogProperties.getName() + " , blog title is " + blogProperties.getTitle() + " desc is " + blogProperties.getDesc();
        System.out.println("=============================" + s);
        return blogstr;
    }
}
