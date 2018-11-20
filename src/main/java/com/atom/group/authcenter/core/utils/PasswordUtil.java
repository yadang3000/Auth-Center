package com.atom.group.authcenter.core.utils;

import org.springframework.util.DigestUtils;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 15:59
 **/
public final class PasswordUtil {

    private static final String ENCIPHER_KEY = "Auth-Center";

    public static String encipher(String password){
        String temp = ENCIPHER_KEY+password;
        return DigestUtils.md5DigestAsHex(temp.getBytes());
    }

}
