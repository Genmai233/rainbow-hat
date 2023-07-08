package com.hu.rainbowhat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.hu.rainbowhat.mapper")
public class RainbowHatApplication {
    public static void main(String[] args) {
        SpringApplication.run(RainbowHatApplication.class, args);
    }
}
