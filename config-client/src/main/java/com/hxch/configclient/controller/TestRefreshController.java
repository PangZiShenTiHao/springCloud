package com.hxch.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:TestRefreshController
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/9 0009 11:10
 **/

@RefreshScope
@RestController
public class TestRefreshController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String getProfile() {
        return this.profile;
    }
}
