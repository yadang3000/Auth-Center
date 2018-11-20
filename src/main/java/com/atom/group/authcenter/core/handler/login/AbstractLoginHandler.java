package com.atom.group.authcenter.core.handler.login;


import com.atom.group.authcenter.core.context.JedisContextHolder;
import com.atom.group.authcenter.core.exceptions.LoginException;
import com.atom.group.authcenter.core.jedis.JedisClient;
import com.atom.group.authcenter.core.utils.GsonUtils;
import com.atom.group.authcenter.core.utils.JedisKeyUtil;
import com.atom.group.authcenter.core.utils.JwtUtil;
import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.model.Logon;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-30 10:39
 **/
public abstract class AbstractLoginHandler {

    protected static final long TTL = 1000 * 60 * 60 * 24 * 30L;

    private Logon logon;

    private User user;

    public AbstractLoginHandler(Logon logon) {
        this.logon = logon;
    }

    public String process(){

        User user = validate();
        setUser(user);

        createJwtBefore();

        // 生成jwt
        String jwt = null;
        try {
            jwt = JwtUtil.createJWT(
                    String.valueOf(user.getUserId()),
                    logon.getAudience(),
                    logon.getSubject(),
                    TTL
            );
        } catch (Exception e) {
            e.printStackTrace();
            throw new LoginException("登录失败");
        }

        createJwtAfter(jwt);
        return jwt;
    }

    protected abstract User validate();

    protected void createJwtBefore(){
        Logon logon = getLogon();
        User user = getUser();
        // 已登录，清除旧jwt
        JedisClient jedisClient = JedisContextHolder.getJedisClient();
        String cacheJwt = jedisClient.get(JedisKeyUtil.getAuthUserKey(user,logon.getAudience(),logon.getSubject()));
        if (!StringUtils.isEmpty(cacheJwt)){
            jedisClient.del(JedisKeyUtil.getAuthUserKey(user,logon.getAudience(),logon.getSubject()));
        }
    }

    protected void createJwtAfter(String jwt){
        Logon logon = getLogon();
        // redis 缓存
        JedisClient jedisClient = JedisContextHolder.getJedisClient();
        jedisClient.set(JedisKeyUtil.getAuthUserKey(getUser(),logon.getAudience(),logon.getSubject()),jwt,TTL);
    }

    public Logon getLogon() {
        return logon;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
