package com.atom.group.authcenter.model;

import com.atom.group.authcenter.entity.User;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-27 17:40
 **/
public class Register implements Serializable {

    private String userName;

    private String password;

    private String mobile;

    private String code;

    private String email;

    private String origin;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public User createUser(){
        User user = new User();
        user.setCheckInTime(new Date());
        user.setMobile(mobile);
        user.setUserName(userName);
        user.setPassword(password);
        user.setEmail(email);
        user.setType((byte)0);
        return user;
    }
}
