package com.hxch.user02.dto;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @ClassName:User
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/11 0011 13:40
 **/
@Component
public class User implements Serializable {
    private String email;
    private String username;
    private String role;
    private String mobile;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
