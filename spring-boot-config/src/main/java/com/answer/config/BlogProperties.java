package com.answer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties {

    @Value("${com.answer.blog.name}")
    private String name;

    @Value("${com.answer.blog.title}")
    private String title;

    @Value("${com.answer.blog.desc}")
    private String desc;

    @Value("${com.answer.blog.value}")
    private String value;

    @Value("${com.answer.blog.number}")
    private int number;

    @Value("${com.answer.blog.bignumber}")
    private long bignumber;

    @Value("${com.answer.blog.test1}")
    private int test1;

    @Value("${com.answer.blog.test2}")
    private int test2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getBignumber() {
        return bignumber;
    }

    public void setBignumber(long bignumber) {
        this.bignumber = bignumber;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }
}
