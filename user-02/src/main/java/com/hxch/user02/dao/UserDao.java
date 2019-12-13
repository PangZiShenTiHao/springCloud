package com.hxch.user02.dao;

import com.hxch.user02.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName:UserDao
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/11 0011 13:47
 **/

@Mapper
public interface UserDao {

    public List<User> selectUserByUserName(String username);
}
