package com.answer.web;

import com.answer.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("统一异常管理");
    }
}
