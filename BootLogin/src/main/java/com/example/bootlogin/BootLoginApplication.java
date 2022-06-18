package com.example.bootlogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.bootlogin.mapper")
@SpringBootApplication
public class BootLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootLoginApplication.class, args);
    }

}
