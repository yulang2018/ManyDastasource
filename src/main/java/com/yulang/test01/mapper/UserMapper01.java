package com.yulang.test01.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper01 {
    @Insert("insert into user(pkid,name,age) values(#{pkid},#{name},#{age})")
    public int insert(@Param("pkid") String pkid, @Param("name") String name, @Param("age") Integer age);

}
