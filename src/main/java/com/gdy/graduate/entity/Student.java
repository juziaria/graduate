package com.gdy.graduate.entity;

import com.gdy.graduate.base.BaseEntity;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * springboot约定大于配置，默认配置
 */

@ApiModel("学生实体类")
public class Student extends BaseEntity implements Serializable {
     private Long id;
     private Long studentIdentity;
     private String studentName;
     private String studentPwd;
     private String college;
     private Integer grade;
     private Integer studentClass;
     private String major;
     private String salt;
     private String studentPhone;
     private String studentEmail;
     private Integer studentGender;
     private String studentHeadshot;
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
