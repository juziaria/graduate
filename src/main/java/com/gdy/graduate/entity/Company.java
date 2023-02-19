package com.gdy.graduate.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

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

     public Long getAccount() {
          return account;
     }

     public void setAccount(Long account) {
          this.account = account;
     }

     public String getCompany_pwd() {
          return company_pwd;
     }

     public void setCompany_pwd(String company_pwd) {
          this.company_pwd = company_pwd;
     }

     public String getCompany_name() {
          return company_name;
     }

     public void setCompany_name(String company_name) {
          this.company_name = company_name;
     }

     public String getCompany_phone() {
          return company_phone;
     }

     public void setCompany_phone(String company_phone) {
          this.company_phone = company_phone;
     }

     public String getCompany_email() {
          return company_email;
     }

     public void setCompany_email(String company_email) {
          this.company_email = company_email;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public String getSalt() {
          return salt;
     }

     public void setSalt(String salt) {
          this.salt = salt;
     }

     public String getSign() {
          return sign;
     }

     public void setSign(String sign) {
          this.sign = sign;
     }

     public Integer getDeleted() {
          return deleted;
     }

     public void setDeleted(Integer deleted) {
          this.deleted = deleted;
     }
}
