package com.leo.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leo.demo.as.vo.UserVo;
import com.leo.demo.ds.dao.DemoDao;
import com.leo.demo.ds.entity.UserAccountInfo;
import com.leo.demo.foundation.response.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author leo
 *
 */
@RestController
@Api(tags = { "测试" })
@RequestMapping(value = "/v1/demo/test")
public class DemoController {
    @Autowired
    DemoDao demoDao;

    @ApiOperation(value = "TEST GET", notes = "测试GET")
    @RequestMapping(value = "/{age}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public ResponseResult<String> getAge(@PathVariable String age) {
        Integer year = 2017;
        Integer ageInt = Integer.valueOf(age);
        Integer result = year - ageInt;

        return new ResponseResult<String>(0, "success", String.valueOf(result));
    }

    @ApiOperation(value = "TEST GET", notes = "测试GET")
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public ResponseResult<String> getAllUser() {
        List<UserAccountInfo> list = demoDao.queryAllUser();

        return new ResponseResult<String>(0, "success", String.valueOf(list));
    }
    
    @ApiOperation(value = "TEST POST", notes = "测试POST")
    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public ResponseResult<String> addUser(@RequestBody UserVo user) {
        UserAccountInfo userAccountInfo = new UserAccountInfo();

        userAccountInfo.setUserAccount(user.getUserAccount());
        userAccountInfo.setUserName(user.getUserName());
        userAccountInfo.setCreateTime(new Date());

        demoDao.insert(userAccountInfo);

        return new ResponseResult<String>(0, "success", String.valueOf(userAccountInfo.getUserId()));
    }
}
