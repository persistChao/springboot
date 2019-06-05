package com.answer.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class HelloController {

    private DeferredResult<String> deferredResult = new DeferredResult<>();

//    @Autowired
//    private AsyncService asyncService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello spring boot!";
    }

    @GetMapping("async")
    public DeferredResult<Object> async() {
        DeferredResult<Object> response = new DeferredResult<Object>(3000L, null);
        response.onCompletion(new Runnable() {
            @Override
            public void run() {
                System.out.println("处理程序");
            }
        });
        response.setResult(new Object());
        return response;
    }

    @GetMapping("void")
    public void tr() {
        System.out.println("s");
    }

    @RequestMapping("/testDeferredResult")
    public DeferredResult<String> testDeferredResult() {
        return deferredResult;
    }

    @RequestMapping("/setDeferredResult")
    public String setDeferredResult() {
        deferredResult.setResult("Test result!");
        return "succeed";
    }

}
