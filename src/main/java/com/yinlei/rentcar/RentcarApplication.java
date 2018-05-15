package com.yinlei.rentcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//启动过滤器
//@ServletComponentScan(basePackages = "com.yinlei.rentcar.tools")
public class RentcarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentcarApplication.class, args);
    }
}
