package com.gdy.graduate.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gdy.graduate.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * 学生持久层接口
 */
@Repository
public interface StudentMapper extends BaseMapper<Student> {
    
}
