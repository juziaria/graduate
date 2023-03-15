package com.gdy.graduate.controller;

import com.gdy.graduate.dto.ChangePwdDto;
import com.gdy.graduate.entity.Student;
import com.gdy.graduate.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * @RestController =@RequestBody+@Controller
 * 学生端控制层
 */
@RestController
@RequestMapping("/gdy/student")
@Api(tags = "学生端")
public class StudentController extends BaseController{
    @Autowired
    private StudentService studentService;

    /**
     * 登录
     */
    @ApiOperation("登录")
    @PostMapping("/login/{id}/{pwd}")
    public Student login(@PathVariable Long id ,@PathVariable String pwd){
        return  studentService.login(id, pwd);
    }

    /**
     * 第一次登录后强制修改密码
     * 前端做第二次密码的确认（是否相等）
     * @returnold
     */
    @ApiOperation("更改密码")
    @PostMapping("/changePwd")
    public String changePwd(@RequestBody ChangePwdDto changePwdDto){
        return studentService.changePwd(changePwdDto);
    }



}
