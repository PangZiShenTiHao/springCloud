package com.hxch.configclient.controller;

import com.hxch.configclient.dto.JdbcConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:IndexController
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/6 0006 14:08
 **/

@RestController
public class IndexController {
    @Autowired
    private JdbcConfigBean jdbcConfigBean;

    @RequestMapping("/getJdbcConfigBean")
    private String getJdbcConfigBean() {
        System.out.println(jdbcConfigBean.toString());
        return jdbcConfigBean.toString();
    }
}
