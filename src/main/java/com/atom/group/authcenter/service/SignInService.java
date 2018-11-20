package com.atom.group.authcenter.service;

import com.atom.group.authcenter.model.Logon;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-27 16:41
 **/
public interface SignInService {

    /**
     * 登录授权
     * @return
     */
    String signIn(Logon logon);
}
