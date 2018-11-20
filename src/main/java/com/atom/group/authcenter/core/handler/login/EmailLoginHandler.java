package com.atom.group.authcenter.core.handler.login;

import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.model.Logon;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-10 11:43
 **/
public class EmailLoginHandler extends AbstractLoginHandler {

    public EmailLoginHandler(Logon logon) {
        super(logon);
    }

    @Override
    protected User validate() {
        return null;
    }

    @Override
    protected void createJwtBefore() {

    }

    @Override
    protected void createJwtAfter(String jwt) {

    }

}
