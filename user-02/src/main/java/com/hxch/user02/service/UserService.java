package com.hxch.user02.service;

import com.hxch.user02.dao.UserDao;
import com.hxch.user02.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName:UserService
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/11 0011 13:51
 **/

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> selectUserByUserName(String username) {
        return userDao.selectUserByUserName(username);
    }
}
