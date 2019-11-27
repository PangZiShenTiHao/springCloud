package com.hxch.eurekaserver03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer03Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer03Application.class, args);
        System.out.println("eureka-server-03 ... eureka服务端3启动成功 ... ");
    }

}
