package com.gdy.graduate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gdy.graduate.dao.CompanyMapper;
import com.gdy.graduate.entity.Company;
import com.gdy.graduate.service.CompanyService;
import com.gdy.graduate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 企业业务层
 */
@Service
@Transactional
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {
    @Autowired
    @Lazy
    private StudentService studentService;

    @Override
    public Company Login(Company company){
        if(company.getCreateTime()==null){}
            return baseMapper.selectById(12);
    }
}
