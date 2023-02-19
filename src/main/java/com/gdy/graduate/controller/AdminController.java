package com.gdy.graduate.controller;

import com.gdy.graduate.entity.Student;
import com.gdy.graduate.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 管理员控制层
 */
@RestController
@RequestMapping("/gdy/admin")
@Api(tags = "管理员端")
public class AdminController{
    @Autowired
    private AdminService baseService;

    @ApiOperation("设置学生初始密码")
    @GetMapping("/initialStuPassword")
    public List<Student> initialStuPassword(){

        return baseService.initialStuPassword();
    }


}
