package com.gdy.graduate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gdy.graduate.dto.ChangePwdDto;
import com.gdy.graduate.entity.Student;


public interface StudentService  extends IService<Student> {

    String changePwd(ChangePwdDto changePwdDto);
    //登录成功就直接以当前用户对象的形式进行返回
    Student login(Long id,String pwd);


}
