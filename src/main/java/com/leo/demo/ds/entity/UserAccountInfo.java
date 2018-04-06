package com.leo.demo.ds.entity;

import java.util.Date;

public class UserAccountInfo {
    private String userId;

    private String userAccount;

    private String userName;

    private Date createTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserAccountInfo [userId=" + userId + ", userAccount=" + userAccount + ", userName=" + userName
                + ", createTime=" + createTime + "]";
    }

}
