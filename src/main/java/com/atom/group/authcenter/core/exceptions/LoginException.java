package com.atom.group.authcenter.core.exceptions;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-09 16:51
 **/
public class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}
