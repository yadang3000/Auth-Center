package com.atom.group.authcenter.service.impl;

import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.model.Register;
import com.atom.group.authcenter.service.SignUpService;
import com.atom.group.authcenter.core.handler.register.AbstractRegisterHandler;
import com.atom.group.authcenter.core.handler.register.RegisterAnalyzer;
import org.springframework.stereotype.Service;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-28 09:53
 **/
@Service
public class SignUpServiceImpl implements SignUpService {

    @Override
    public User signUp(Register register) {
        AbstractRegisterHandler registerHandler = RegisterAnalyzer.analyze(register);
        if (registerHandler == null){
            return null;
        }
        return registerHandler.process();
    }

}
