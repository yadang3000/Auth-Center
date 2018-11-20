package com.atom.group.authcenter.core.validation.impl;

import com.atom.group.authcenter.core.utils.AnalyzerUtil;
import com.atom.group.authcenter.core.validation.BaseValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 15:09
 **/
public class UsernameFormatValidator implements BaseValidator {

    private final static Logger logger = LoggerFactory.getLogger(UsernameFormatValidator.class);

    private String username;

    public UsernameFormatValidator(String username) {
        this.username = username;
    }

    @Override
    public Boolean check() {
        if (StringUtils.isEmpty(username)){
            logger.warn("用户名为空，校验不通过",username);
            return false;
        }
        if (username.length()<8||username.length()>50){
            logger.warn("用户名：{}，长度{},不符合规范",username,username.length());
            return false;
        }
        if (!AnalyzerUtil.isUserName(username)){
            logger.warn("用户名：{}，格式不符合规范",username);
            return false;
        }
        return true;
    }

}
