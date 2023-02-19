package com.gdy.graduate.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gdy.graduate.dao.AdminMapper;
import com.gdy.graduate.dao.StudentMapper;
import com.gdy.graduate.entity.Admin;
import com.gdy.graduate.entity.BaseEntity;
import com.gdy.graduate.entity.Student;
import com.gdy.graduate.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 管理员业务层
 */
@Service
@Transactional
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    @Autowired
    @Lazy
    public AdminService adminService;
    @Resource
    public StudentMapper studentMapper;

    /**
     * 定义一个md5算法的加密处理
     */
    private  String getMD5(String PWD,String salt){
        for(int i = 0; i<3;i++){
            PWD= DigestUtils.md5DigestAsHex((salt+PWD+salt).getBytes()).toUpperCase();
        }
        return PWD;
    }

    @Override
    public List<Student> initialStuPassword(){
        List<Student> studentList = studentMapper.findAllStudent();
        for (Student student:studentList){
            String salt = UUID.randomUUID().toString().toUpperCase();
            String oldStuPwd = Long.toString(student.getStudentIdentity()).substring(6);
            String initialStuPwd = getMD5(oldStuPwd,salt);
            Long stuId = student.getId();
            Date date = new Date();
            studentMapper.InsertStuPwd(stuId,initialStuPwd,date,salt);
        }
        return studentMapper.findAllStudent();
    }

}
