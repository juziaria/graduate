package com.gdy.graduate.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gdy.graduate.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * 管理员持久层接口
 */
@Repository//其实不要这个注解也可以
public interface AdminMapper extends BaseMapper<Admin> {

}
