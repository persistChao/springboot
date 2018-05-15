package com.answer.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 * @author answer
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler
    public ModelAndView defaultErrorHandler(HttpServletRequest request , Exception exception) throws Exception {
        ModelAndView view = new ModelAndView();
        view.addObject("exception" , exception);
        view.addObject("url", request.getRequestURL());
        view.setViewName(DEFAULT_ERROR_VIEW);
        return view;
    }

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest request , MyException e) throws Exception {
        ErrorInfo<String > r = new ErrorInfo<String>();
        r.setCode(ErrorInfo.ERROR);
        r.setMessage(e.getMessage());
        r.setUrl(request.getRequestURL().toString());
        r.setData("Some Data ");
        return r;
    }
}
