package com.hxch.user01.controller;

import com.hxch.user01.dto.User;
import com.hxch.user01.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName:UserController
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/11 0011 13:53
 **/
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @LoadBalanced
    @RequestMapping(value = "/queryUser", method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryUserList(String username){

        List<User> userList = userService.selectUserByUserName(username);
        log.info("user-01 = "+userList.toString());
        return userList;

    }
}
