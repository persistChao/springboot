package com.answer.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleaf")
    public String index(ModelMap map) {
        map.addAttribute("hosts", "http://www.springcloud.cc");
        return "index";
    }
}
