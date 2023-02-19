package com.gdy.graduate.dto;

import io.swagger.annotations.ApiModel;

@ApiModel("更改密码")
public class ChangePwdDto {

    private Long id;
    private String oldStuPwd;
    private String newStuPwd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOldStuPwd() {
        return oldStuPwd;
    }

    public void setOldStuPwd(String oldStuPwd) {
        this.oldStuPwd = oldStuPwd;
    }

    public String getNewStuPwd() {
        return newStuPwd;
    }

    public void setNewStuPwd(String newStuPwd) {
        this.newStuPwd = newStuPwd;
    }
}
