package com.atom.group.authcenter.core.validation.impl;

import com.atom.group.authcenter.core.context.DaoContextHolder;
import com.atom.group.authcenter.core.validation.BaseValidator;
import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.entity.UserExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-10 14:26
 **/
public class UsernameExsitValidator implements BaseValidator {

    private final static Logger logger = LoggerFactory.getLogger(UsernameExsitValidator.class);

    private String userName;

    private User user;

    public UsernameExsitValidator(String userName) {
        this.userName = userName;
    }

    @Override
    public Boolean check() {

        user = getDBUser();

        if (user==null){
            logger.warn("用户名：{}，已存在",userName);
            return false;
        }
        return true;
    }


    public User getDBUser(){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(userName);
        List<User> userList = DaoContextHolder.getUserMapper().selectByExample(userExample);
        if (CollectionUtils.isEmpty(userList)){
            return null;
        }
        return userList.get(0);
    }

    public User getUser() {
        return user;
    }
}
