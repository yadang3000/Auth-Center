package com.atom.group.authcenter.core.handler.register;

import com.atom.group.authcenter.core.context.DaoContextHolder;
import com.atom.group.authcenter.core.context.JedisContextHolder;
import com.atom.group.authcenter.core.exceptions.RegisterException;
import com.atom.group.authcenter.core.jedis.JedisClient;
import com.atom.group.authcenter.core.utils.GsonUtils;
import com.atom.group.authcenter.core.utils.JedisKeyUtil;
import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.model.Register;
import org.springframework.util.StringUtils;

import java.util.Random;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-28 17:13
 **/
public abstract class AbstractRegisterHandler {

    protected static final long TTL = 1000*60*60*24;

    private Register register;

    public AbstractRegisterHandler(Register register) {
        this.register = register;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public User process(){
        Boolean matched = verify();
        if (!matched){
            throw new RegisterException("注册失败，请检查提交表单");
        }
        User user = save();

        cache(user);

        return user;
    }

    protected abstract Boolean verify();

    private User save(){
        Register register = getRegister();
        User user = register.createUser();

        int affected = DaoContextHolder.getUserMapper().insertSelective(user);
        if (affected<1){
            throw new RegisterException("注册失败，请稍后再试");
        }
        return user;
    }


    private void cache(User user){
        String cacheKey = JedisKeyUtil.getUserInfoKey(String.valueOf(user.getUserId()));
        JedisClient jedisClient = JedisContextHolder.getJedisClient();
        String cacheResult = jedisClient.get(cacheKey);
        if (!StringUtils.isEmpty(cacheResult)){
            jedisClient.del(cacheKey);
        }

        // 防缓存雪崩
        Random random = new Random();
        int minuteOffset = random.nextInt(10)*1000*60;
        int secondOffset = random.nextInt(1000*60);
        long offset = minuteOffset + secondOffset;

        jedisClient.set(cacheKey,GsonUtils.getInstance().toJson(user),TTL+offset);
    }
}
