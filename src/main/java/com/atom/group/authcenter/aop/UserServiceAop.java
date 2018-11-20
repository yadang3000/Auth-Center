package com.atom.group.authcenter.aop;

import com.atom.group.authcenter.core.jedis.JedisClient;
import com.atom.group.authcenter.core.utils.GsonUtils;
import com.atom.group.authcenter.core.utils.JedisKeyUtil;
import com.atom.group.authcenter.entity.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Random;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-17 14:41
 **/
@Aspect
@Component
public class UserServiceAop {

    private static final long TTL = 1000*60*60*24;

    @Autowired
    private JedisClient jedisClient;

    @Around("execution(public * com.atom.group.authcenter.service.UserSerivce.getUser(Long)) && args(userId)")
    public Object getUserAop(ProceedingJoinPoint joinPoint,Long userId) throws Throwable{

        String cacheKey = JedisKeyUtil.getUserInfoKey(String.valueOf(userId));

        // 有缓存读缓存
        String userJson = jedisClient.get(cacheKey);
        if (!StringUtils.isEmpty(userJson)){
            User user = GsonUtils.getInstance().fromJson(userJson,User.class);
            return user;
        }

        Object res = joinPoint.proceed();

        // 防缓存穿透
        if (res == null){
            res = new User();
            ((User) res).setUserId(userId);
        }
        userJson = GsonUtils.getInstance().toJson(res);

        // 防缓存雪崩
        Random random = new Random();
        int minuteOffset = random.nextInt(10)*1000*60;
        int secondOffset = random.nextInt(1000*60);
        long offset = minuteOffset + secondOffset;
        jedisClient.set(cacheKey,userJson,TTL+offset);
        return res;
    }

}
