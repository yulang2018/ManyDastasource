package com.yulang.controller;

import com.github.pagehelper.PageInfo;
import com.yulang.test01.service.UserService01;
import com.yulang.test02.service.UserService02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService01 userService01;
    @Autowired
    private UserService02 userService02;
    @RequestMapping("/insert")
    public int insertUser(String pkid,String name,Integer age){
        int i1= userService01.insert(pkid,name,age);
        return i1;
    }

    @RequestMapping("/select")
    public PageInfo select(int page,int pageSize){
        return userService01.select(page,pageSize);
    }

}
