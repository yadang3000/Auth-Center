package com.atom.group.authcenter.core.handler.login;

import com.atom.group.authcenter.core.exceptions.LoginException;
import com.atom.group.authcenter.core.handler.authentication.UserAuthenticationHandler;
import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.model.Logon;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 16:37
 **/
public class JwtLoginHandler extends AbstractLoginHandler  {

    public JwtLoginHandler(Logon logon) {
        super(logon);
    }

    @Override
    protected User validate() {

        Logon logon = getLogon();
        // 用户在线
        User user = UserAuthenticationHandler.onlineUser(logon.getCredentials());
        if (user==null){
            throw new LoginException("用户未登录，无法刷新");
        }
        return user;
    }
}
