package com.yulang.test01.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yulang.entity.User;
import com.yulang.test01.mapper.UserMapper01;
import com.yulang.test02.mapper.UserMapper02;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
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

    @Cacheable(cacheNames = "users")
    public PageInfo<User> select(int page,int pageSize ){
        PageHelper.startPage(page,pageSize);
        List<User> list = userMapper.select();
        PageInfo<User> pageInfoUser = new PageInfo<User>(list);
        return pageInfoUser;
    }
}
