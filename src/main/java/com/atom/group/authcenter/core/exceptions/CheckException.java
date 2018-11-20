package com.atom.group.authcenter.core.exceptions;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-10 14:36
 **/
public class CheckException extends RuntimeException{

    private ExceptionCode code;

    public CheckException(ExceptionCode code) {
        super(code.getDescription());
        this.code = code;
    }
}
