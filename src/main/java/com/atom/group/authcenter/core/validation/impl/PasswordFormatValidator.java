package com.atom.group.authcenter.core.validation.impl;

import com.atom.group.authcenter.core.validation.BaseValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 15:22
 **/
public class PasswordFormatValidator implements BaseValidator {

    private final static Logger logger = LoggerFactory.getLogger(PasswordFormatValidator.class);

    private String password;

    public PasswordFormatValidator(String password) {
        this.password = password;
    }

    @Override
    public Boolean check() {
        if(StringUtils.isEmpty(password)){
            logger.warn("密码为空，校验失败");
            return false;
        }
        if (password.contains("-")){
            password = password.replace("-","");
        }

        if (password.length()!=32){
            logger.warn("Password：{}，密码非MD5格式",password);
            return false;
        }

        return true;
    }

}
