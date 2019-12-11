package com.hxch.user.dao;

import com.hxch.user.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
