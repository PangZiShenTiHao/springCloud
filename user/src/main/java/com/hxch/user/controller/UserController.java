package com.hxch.user.controller;

import com.hxch.user.dto.User;
import com.hxch.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/queryUser", method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryUserList(String username){

        return userService.selectUserByUserName(username);

    }
}
