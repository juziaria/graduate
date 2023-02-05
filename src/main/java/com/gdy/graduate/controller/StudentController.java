package com.gdy.graduate.controller;


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
public class StudentController  {
    @Autowired
    private StudentService studentService;

    @ApiOperation("查找")
    @GetMapping("/check/{id}/{studentPwd}")
    public String login(@PathVariable Long id,@PathVariable String studentPwd){
        return studentService.logIn(id,studentPwd);
    }

}
