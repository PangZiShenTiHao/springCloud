package com.hxch.user02;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class User02Application {

    public static void main(String[] args) {
        SpringApplication.run(User02Application.class, args);
        log.info("user-02 ... 启动成功");
    }

}
