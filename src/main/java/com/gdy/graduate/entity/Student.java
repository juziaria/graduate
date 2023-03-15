package com.gdy.graduate.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * springboot约定大于配置，默认配置
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
