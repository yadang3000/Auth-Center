package com.atom.group.authcenter.service.impl;


import com.atom.group.authcenter.dao.UserMapper;
import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.entity.UserExample;
import com.atom.group.authcenter.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;


/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-17 10:18
 **/
@Service
public class UserServiceImpl implements UserSerivce {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean forgetPasswordByPhone(String phone) {
        return null;
    }

    @Override
    public Boolean forgetPasswordByEmail(String email) {
        return null;
    }

    @Override
    public Boolean forgetPasswordByUsername(String username, Integer type) {
        return null;
    }

    @Override
    public Boolean resetPassword(String logins, String code) {
        return null;
    }

    @Override
    public User getUser(Long userId) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdEqualTo(userId);
        List<User> users = userMapper.selectByExample(userExample);
        if (CollectionUtils.isEmpty(users)){
            return null;
        }
        User user = users.stream().findFirst().orElse(null);
        return user;
    }

}
