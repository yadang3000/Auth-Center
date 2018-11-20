package com.atom.group.authcenter.core.handler.register;

import com.atom.group.authcenter.model.Register;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-28 17:14
 **/
public class EmailRegisterHandler extends AbstractRegisterHandler {


    public EmailRegisterHandler(Register register) {
        super(register);
    }

    @Override
    protected Boolean verify() {
        return null;
    }


}
