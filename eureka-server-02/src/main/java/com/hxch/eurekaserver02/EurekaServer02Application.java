package com.hxch.eurekaserver02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer02Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer02Application.class, args);
        System.out.println("eureka-server-02 ... eureka服务端2启动成功 ... ");
    }

}
