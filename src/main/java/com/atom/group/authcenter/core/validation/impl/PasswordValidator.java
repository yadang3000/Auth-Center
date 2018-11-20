package com.atom.group.authcenter.core.validation.impl;

import com.atom.group.authcenter.core.utils.PasswordUtil;
import com.atom.group.authcenter.core.validation.BaseValidator;
import org.springframework.util.StringUtils;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 15:51
 **/
public class PasswordValidator implements BaseValidator {

    private String requestPassword;

    private String dbPassword;

    public PasswordValidator(String requestPassword, String dbPassword) {
        this.requestPassword = requestPassword;
        this.dbPassword = dbPassword;
    }

    @Override
    public Boolean check() {
        if (StringUtils.isEmpty(requestPassword)||StringUtils.isEmpty(dbPassword)){
            return false;
        }
        if (dbPassword.equals(PasswordUtil.encipher(requestPassword))){
            return true;
        }
        return false;
    }
}
