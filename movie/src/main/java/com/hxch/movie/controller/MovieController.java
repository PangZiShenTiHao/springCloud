package com.hxch.movie.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

/**
 * @ClassName:MovieController
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/12 0012 11:52
 **/

@Slf4j
@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private RestTemplate template;

    @GetMapping("/getUser")
    public String getUserInfo(){
        String result = template.getForObject("http://localhost:9627/user/queryUser?username=xjt", String.class);
        System.out.println(result);
        return result;
    }
}
