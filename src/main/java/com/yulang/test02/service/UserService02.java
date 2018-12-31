package com.yulang.test02.service;

import com.yulang.test02.mapper.UserMapper02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService02 {
    @Autowired
    private UserMapper02 userMapper;
    @Transactional(transactionManager = "test02TransactionManager")
    public int insert(String pkid, String name, Integer age){
        return userMapper.insert(pkid,name,age);
    }
}
