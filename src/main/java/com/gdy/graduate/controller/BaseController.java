package com.gdy.graduate.controller;

import com.gdy.graduate.service.ex.ServiceException;
import com.gdy.graduate.service.ex.StudentNotFindEx;
import com.gdy.graduate.service.ex.StudentPwdEx;
import com.gdy.graduate.utils.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {

//操作成功的状态码
    public static final int Success =200;
//请求处理方法
    //项目异常，被拦截到此方法中，这个方法此时充当的是请求
    @ExceptionHandler(ServiceException.class)
    public JsonResult<Void> handleException(Throwable e){
        JsonResult<Void> result= new JsonResult<>(e);
        if (e instanceof StudentNotFindEx){
            result.setState(4000);
            result.setMessage("找不到该用户");
        }else if (e instanceof StudentPwdEx){
            result.setState(5000);
            result.setMessage("密码错误");
        }
        return result;
    }
}
