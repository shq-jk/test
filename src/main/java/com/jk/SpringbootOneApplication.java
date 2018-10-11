package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.jk.mapper")  //扫描持久层
@EnableTransactionManagement  //开启spring事务控制
public class SpringbootOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOneApplication.class, args);
    }
}
