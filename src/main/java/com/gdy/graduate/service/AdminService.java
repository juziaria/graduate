package com.gdy.graduate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gdy.graduate.entity.Admin;
import com.gdy.graduate.entity.Student;

import java.util.List;

public interface AdminService extends IService<Admin> {
    List<Student> initialStuPassword();
}
