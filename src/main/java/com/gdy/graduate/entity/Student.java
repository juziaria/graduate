package com.gdy.graduate.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * springboot约定大于配置，默认配置
 */
@ApiModel("学生实体类")
public class Student extends BaseEntity implements Serializable {

    @ApiModelProperty(value = "学号")
     private Long id;

    @ApiModelProperty(value = "学生身份证号码")
    private Long studentIdentity;

    @ApiModelProperty(value = "学生姓名")
    private String studentName;

    @ApiModelProperty(value = "学生密码")
    private String studentPwd;

    @ApiModelProperty(value = "学院")
    private String college;

    @ApiModelProperty(value = "年级")
    private Integer grade;

    @ApiModelProperty(value = "班级")
     private Integer studentClass;

    @ApiModelProperty(value = "专业")
     private String major;

    @ApiModelProperty(value = "盐值")
     private String salt;

    @ApiModelProperty(value = "学生电话号码")
     private String studentPhone;

    @ApiModelProperty(value = "学生邮箱")
     private String studentEmail;

    @ApiModelProperty(value = "学生性别")
     private Integer studentGender;

    @ApiModelProperty(value = "头像")
     private String studentHeadshot;

    @ApiModelProperty(value = "是否删除")
     private Integer deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentIdentity() {
        return studentIdentity;
    }

    public void setStudentIdentity(Long studentIdentity) {
        this.studentIdentity = studentIdentity;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPwd() {
        return studentPwd;
    }

    public void setStudentPwd(String studentPwd) {
        this.studentPwd = studentPwd;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Integer studentClass) {
        this.studentClass = studentClass;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Integer getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(Integer studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentHeadshot() {
        return studentHeadshot;
    }

    public void setStudentHeadshot(String studentHeadshot) {
        this.studentHeadshot = studentHeadshot;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
