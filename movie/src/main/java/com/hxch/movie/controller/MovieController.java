package com.hxch.movie.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:MovieController
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/12 0012 11:52
 **/

@Slf4j
@Controller
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

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("mv_name", "死神来了");
        model.addAttribute("mv_price", 20.00);
        model.addAttribute("mv_info", "恐怖血腥");
        return "index";
    }
}
