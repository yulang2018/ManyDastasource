package com.yulang.controller;

import com.github.pagehelper.PageInfo;
import com.yulang.entity.User;
import com.yulang.test01.service.UserService01;
import com.yulang.test02.service.UserService02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    private UserService01 userService01;
    @Autowired
    private UserService02 userService02;
    @RequestMapping("/insert")
    public Object insertUser(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            return result.getFieldError().getField()+":"+result.getFieldError().getDefaultMessage();
        }
        int i1= userService01.insert(user.getPkid(),user.getName(),user.getAge());
        return i1;
    }

    @RequestMapping("/select")
    public PageInfo select(int page,int pageSize){
        PageInfo pageInfo =userService01.select(page,pageSize);
        return userService01.select(page,pageSize);
    }

}
