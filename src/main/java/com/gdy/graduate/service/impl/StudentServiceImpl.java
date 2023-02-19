package com.gdy.graduate.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gdy.graduate.dao.StudentMapper;
import com.gdy.graduate.dto.ChangePwdDto;
import com.gdy.graduate.entity.BaseEntity;
import com.gdy.graduate.entity.Student;
import com.gdy.graduate.service.StudentService;
import com.gdy.graduate.service.ex.StudentException.StudentNotFindEx;
import com.gdy.graduate.service.ex.StudentException.StudnetPwdEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.UUID;


/**
 * 学生业务层
 */

@Service//将当前类交给spring管理，自动创建对象以及对象的维护
@Transactional
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {

//  @Autowired
//  private  StudentMapper baseMapper;
    @Autowired
    @Lazy
    private StudentService studentService;

    /**
     * 定义一个md5算法的加密处理
     */
    private  String getMD5(String PWD,String salt){
        for(int i = 0; i<3;i++){
            PWD=DigestUtils.md5DigestAsHex((salt+PWD+salt).getBytes()).toUpperCase();
        }
        return PWD;
    }
    /**
     * 登录
     * @param id
     * @param studentPwd
     * @return
     */
    @Override
    public Student login(Long id,String studentPwd) {
        Student res = baseMapper.selectById(id);
        //1.判断该学生账号是否存在
        if (res.equals(null) && res.getDeleted().equals(1)){
            throw new StudentNotFindEx("该用户不存在");
        }
        //2.判断是否是初次登录(前端判断)
        //3.判断密码是否正确
        String loginPwd = getMD5(studentPwd,res.getSalt());
      if(!res.getStudentPwd().equals(loginPwd)){
          throw new StudnetPwdEx("输入的密码错误");
        }
        Date date = new Date();
        studentService.lambdaUpdate().eq(Student::getStudentPwd,loginPwd)
                .set(Student::getDeleted,0)
                .set(BaseEntity::getCreateUser,id)
                .set(BaseEntity::getCreateTime,date).update();
     return baseMapper.selectById(id);
    }

    /**
     * 更改密码
     * @param changePwdDto
     * @return
     */
    @Override
    public String changePwd(ChangePwdDto changePwdDto){
        Student res =baseMapper.selectById(changePwdDto.getId());
        String oldPwd = changePwdDto.getOldStuPwd();
        String ressalt = res.getSalt();
        String encryptPwd1 = getMD5(oldPwd,ressalt);
        if(!encryptPwd1.equals(res.getStudentPwd())){
            throw new StudnetPwdEx("旧密码输入错误");
        }
        String newsalt = UUID.randomUUID().toString().toUpperCase();
        String newPwd = changePwdDto.getNewStuPwd();
        String Pwd =getMD5(newPwd,newsalt);
        res.setStudentPwd(Pwd);
        res.setSalt(newsalt);
        res.setModifiedUser(changePwdDto.getId());
        res.setModifiedTime(new Date());
        baseMapper.updateById(res);
        return "修改成功！";
    }
}
