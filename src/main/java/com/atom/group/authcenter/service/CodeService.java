package com.atom.group.authcenter.service;

import com.atom.group.authcenter.core.code.enums.CodeType;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-27 17:43
 **/
public interface CodeService {

    Boolean sendCodeByPhone(String phone, CodeType codeType);

    Boolean sendCodeByEmail(String email);

}
