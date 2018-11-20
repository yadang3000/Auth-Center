package com.atom.group.authcenter.service.impl;

import com.atom.group.authcenter.core.handler.login.AbstractLoginHandler;
import com.atom.group.authcenter.core.handler.login.LoginAnalyzer;
import com.atom.group.authcenter.core.jedis.JedisClient;
import com.atom.group.authcenter.core.utils.GsonUtils;
import com.atom.group.authcenter.core.utils.JwtUtil;
import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.model.Logon;
import com.atom.group.authcenter.service.SignInService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-30 10:35
 **/
@Service
public class SignInServiceImpl implements SignInService {

    @Autowired
    private JedisClient jedisClient;

    @Override
    public String signIn(Logon logon) {
        // 登录类型分析
        AbstractLoginHandler handler = LoginAnalyzer.analyze(logon);
        // 执行登录
        String jwt = handler.process();
        return jwt;
    }

}
