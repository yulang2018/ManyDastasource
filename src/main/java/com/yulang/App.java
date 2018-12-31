package com.yulang;

import com.yulang.datasource.DbConfig1;
import com.yulang.datasource.DbConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableConfigurationProperties({DbConfig1.class, DbConfig2.class})
@MapperScan(basePackages = {"com.yulang.test01.mapper","com.yulang.test02.mapper"})
@EnableCaching
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}
