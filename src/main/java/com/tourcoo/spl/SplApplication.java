package com.tourcoo.spl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tourcoo.spl.mapper")
public class SplApplication {

    public static void main(String[] args) {
        SpringApplication.run(SplApplication.class, args);
    }
}
