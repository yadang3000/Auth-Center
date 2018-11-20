package com.atom.group.authcenter.service.impl;

import com.atom.group.authcenter.core.constans.AuthHeaderConstant;
import com.atom.group.authcenter.core.handler.authentication.UserAuthenticationHandler;
import com.atom.group.authcenter.core.handler.login.AbstractLoginHandler;
import com.atom.group.authcenter.core.handler.login.LoginAnalyzer;
import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.model.Logon;
import com.atom.group.authcenter.service.RefreshService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 16:09
 **/
@Service
public class RefreshServiceImpl implements RefreshService {


    @Override
    public String refresh(String jwt) {

        RequestAttributes requestAttributes = null;
        requestAttributes = RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();

        Assert.notNull(request,"无效的请求");

        String header_subject = request.getHeader(AuthHeaderConstant.SUBJECT);
        String header_audience = request.getHeader(AuthHeaderConstant.AUDIENCE);

        Logon logon = new Logon();
        logon.setIdentity("jwt");
        logon.setCredentials(jwt);
        logon.setAudience(header_subject);
        logon.setSubject(header_audience);

        // 登录类型分析
        AbstractLoginHandler handler = LoginAnalyzer.analyze(logon);
        // 执行登录
        String res = handler.process();
        return res;
    }
}
