package com.gdy.graduate.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gdy.graduate.dao.StudentMapper;
import com.gdy.graduate.entity.Student;
import com.gdy.graduate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Date;


/**
 * 学生业务层
 */

@Service//将当前类交给spring管理，自动创建对象以及对象的维护
@Transactional
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {

    @Autowired
    private  StudentMapper baseMapper;
    @Autowired
    @Lazy
    private StudentService studentService;

    @Override
    public String logIn(Long id,String studentPwd) {
        LambdaUpdateWrapper<Student> wrapper = new LambdaUpdateWrapper<>();
        Date date = new Date();
        wrapper.eq(Student::getId,id);
        wrapper.eq(Student::getStudentPwd,studentPwd);
        wrapper.set(Student::getDeleted,0);
        wrapper.set(Student::getCreateUser,id);
        wrapper.set(Student::getModifiedUser,id);
        wrapper.set(Student::getCreateTime,date);
        wrapper.set(Student::getModifiedTime,date);
        studentService.update(wrapper);
        return "登录成功";
    }
}
