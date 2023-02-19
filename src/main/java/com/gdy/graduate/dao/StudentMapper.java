package com.gdy.graduate.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gdy.graduate.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 学生持久层接口
 */
public interface StudentMapper extends BaseMapper<Student> {
    List<Student> findAllStudent();
    void InsertStuPwd(@Param("id") Long id, @Param("stuPwd")String stuPwd, @Param("date")Date date,@Param("salt") String salt);
    
}
