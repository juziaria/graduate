package com.gdy.graduate.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("企业实体类")
public class Company extends BaseEntity implements Serializable {

     @ApiModelProperty(value = "公司账号")
     private Long account;

     @ApiModelProperty(value ="公司密码")
     private String company_pwd;

     @ApiModelProperty(value = "公司名称")
     private String company_name;

     @ApiModelProperty(value = "公司电话")
     private String company_phone;

     @ApiModelProperty(value = "公司邮箱")
     private String company_email;

     @ApiModelProperty(value = "公司地址")
     private String address;

     @ApiModelProperty(value = "盐值")
     private String salt;

     @ApiModelProperty(value = "公司图像")
     private String sign;

     @ApiModelProperty(value = "是否删除")
     private Integer deleted;

}
