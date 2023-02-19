package com.gdy.graduate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gdy.graduate.entity.Company;

public interface CompanyService extends IService<Company> {
    Company Login(Company company);
}
