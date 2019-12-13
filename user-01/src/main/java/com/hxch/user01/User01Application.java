package com.hxch.user01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class User01Application {

    public static void main(String[] args) {
        SpringApplication.run(User01Application.class, args);
        log.info("user-01 ... 启动成功");
    }

}
