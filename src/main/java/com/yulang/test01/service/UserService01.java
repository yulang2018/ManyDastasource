package com.yulang.test01.service;

import com.yulang.test01.mapper.UserMapper01;
import com.yulang.test02.mapper.UserMapper02;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService01 {
    @Autowired
    private UserMapper01 userMapper;
    @Autowired
    private UserMapper02 userMapper02;
    @Transactional
    public int insert(String pkid, String name, Integer age){
        int i=userMapper02.insert(pkid,name,age);
        int k=1/0;
        int j=userMapper.insert(pkid,name,age);
        return i+j;
    }
}
