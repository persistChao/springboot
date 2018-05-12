package com.answer.config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void test() {
        Assert.assertEquals(blogProperties.getName(), "answer blog");
        Assert.assertEquals(blogProperties.getTitle(), "Spring boot 教程");
    }
}
