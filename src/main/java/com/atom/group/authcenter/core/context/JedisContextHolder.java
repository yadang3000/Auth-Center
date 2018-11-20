package com.atom.group.authcenter.core.context;

import com.atom.group.authcenter.core.jedis.JedisClient;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-16 12:36
 **/
public class JedisContextHolder {

    public static JedisClient getJedisClient(){
        return SpringContextHolder.getInstance().getBean(JedisClient.class);
    }

}
