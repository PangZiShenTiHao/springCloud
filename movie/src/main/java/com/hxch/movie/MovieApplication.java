package com.hxch.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class, args);
        System.out.println("movie ... movie启动成功 ... ");
    }

}
