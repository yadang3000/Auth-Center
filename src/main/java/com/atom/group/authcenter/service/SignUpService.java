package com.atom.group.authcenter.service;

import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.model.Register;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-27 16:41
 **/
public interface SignUpService {

    User signUp(Register register);
}
