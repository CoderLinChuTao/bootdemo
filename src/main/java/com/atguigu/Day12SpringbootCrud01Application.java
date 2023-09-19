package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.atguigu.mapper")//因为springboot配置类里面没有办法扫描mapper接口，所以需要到配置类中配置
@EnableScheduling//开启定时任务
@EnableTransactionManagement
public class Day12SpringbootCrud01Application {

    public static void main(String[] args) {
        SpringApplication.run(Day12SpringbootCrud01Application.class, args);
    }

}
