package com.leo.demo.ds.dao;

import java.util.List;

import com.leo.demo.ds.entity.UserAccountInfo;

public interface DemoDao {
    void insert(UserAccountInfo userAccountInfo);
    List<UserAccountInfo> queryAllUser();
}
