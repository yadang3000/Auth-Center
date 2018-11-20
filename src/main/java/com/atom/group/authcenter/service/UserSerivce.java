package com.atom.group.authcenter.service;

import com.atom.group.authcenter.entity.User;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-27 16:42
 **/
public interface UserSerivce {

    /**
     * 通过手机短信方式找回密码
     * 调用此接口，会向用户发送重置密码CODE 短信
     * @param phone
     * @return
     */
    Boolean forgetPasswordByPhone(String phone);

    /**
     * 通过邮件方式找回密码
     * 调用此接口，会向用户发送重置密码CODE 邮件
     * @param email
     * @return
     */
    Boolean forgetPasswordByEmail(String email);


    /**
     *  通过用户名方式找回密码
     * @param username 用户名
     * @param type 1-手机，2-邮箱
     * @return
     */
    Boolean forgetPasswordByUsername(String username,Integer type);


    /**
     * 重置密码
     * @param logins 登录名/手机号/邮箱
     * @param code 验证码
     * @return
     */
    Boolean resetPassword(String logins,String code);


    User getUser(Long userId);

}
