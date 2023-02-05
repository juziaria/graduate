package com.gdy.graduate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gdy.graduate.dao.CompanyMapper;
import com.gdy.graduate.dao.StudentMapper;
import com.gdy.graduate.entity.Company;
import com.gdy.graduate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 企业业务层
 */
@Service
@Transactional
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> {
    @Autowired
    private  CompanyMapper baseMapper;
}
