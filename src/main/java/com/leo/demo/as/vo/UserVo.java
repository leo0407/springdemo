package com.leo.demo.as.vo;

import javax.validation.constraints.NotBlank;

/**
 * 用户VO
 * @author Administrator
 *
 */
public class UserVo {
    @NotBlank
    private String userAccount;

    @NotBlank
    private String userName;

    private String password;

    private Long createTime;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

}
