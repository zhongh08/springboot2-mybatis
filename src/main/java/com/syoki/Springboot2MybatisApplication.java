package com.syoki;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.syoki.dao")
public class Springboot2MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2MybatisApplication.class, args);
    }
}
