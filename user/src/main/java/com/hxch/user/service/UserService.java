package com.hxch.user.service;

import com.hxch.user.dao.UserDao;
import com.hxch.user.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName:UserService
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/11 0011 13:51
 **/

@Service
public class UserService{

    @Autowired
    private UserDao userDao;

    public List<User> selectUserByUserName(String username) {
        return userDao.selectUserByUserName(username);
    }
}
