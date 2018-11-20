package com.atom.group.authcenter.service.impl;

import com.atom.group.authcenter.core.constans.AuthHeaderConstant;
import com.atom.group.authcenter.core.handler.authentication.UserAuthenticationHandler;
import com.atom.group.authcenter.core.jedis.JedisClient;
import com.atom.group.authcenter.core.utils.JedisKeyUtil;
import com.atom.group.authcenter.service.LogoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 17:10
 **/
@Service
public class LogoutServiceImpl implements LogoutService {

    @Autowired
    private JedisClient jedisClient;

    @Override
    public Boolean logoutByToken(String jwt) {
        String id = UserAuthenticationHandler.getUserId(jwt);
        return logoutByUserId(id);
    }

    @Override
    public Boolean logoutByUserId(String userId) {
        RequestAttributes requestAttributes = null;
        requestAttributes = RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();

        Assert.notNull(request,"无效的请求");

        String header_subject = request.getHeader(AuthHeaderConstant.SUBJECT);
        String header_audience = request.getHeader(AuthHeaderConstant.AUDIENCE);

        Assert.notNull(header_audience,"audience缺失，请标注请求系统");
        Assert.notNull(header_subject,"subject缺失，请注明作用域（web、app、pc、iot）");

        String authUserKey =JedisKeyUtil.getAuthUserKey(userId,header_subject,header_audience);
        String authUser = jedisClient.get(authUserKey);
        if (!StringUtils.isEmpty(authUser)){
            jedisClient.del(authUserKey);
        }
        return true;
    }
}
