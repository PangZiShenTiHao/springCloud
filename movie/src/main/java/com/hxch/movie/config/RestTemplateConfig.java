package com.hxch.movie.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:RestTemplateConfig
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/12 0012 11:39
 **/

@Configuration
public class RestTemplateConfig {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Bean
    public RestTemplate restTemplate(){
        return restTemplateBuilder.build();
    }
}
