package com.gdy.graduate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gdy.graduate.entity.Student;

public interface StudentService  extends IService<Student> {

    String logIn(Long id,String studentPwd);
}
