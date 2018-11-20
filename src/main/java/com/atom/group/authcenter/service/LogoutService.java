package com.atom.group.authcenter.service;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-27 17:33
 **/
public interface LogoutService {

    Boolean logoutByToken(String jwt);

    Boolean logoutByUserId(String userId);

}
