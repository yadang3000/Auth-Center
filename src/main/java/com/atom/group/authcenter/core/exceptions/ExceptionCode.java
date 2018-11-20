package com.atom.group.authcenter.core.exceptions;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-10 15:26
 **/
public enum ExceptionCode {
    UNKNOWN("500","未知异常"),
    USER_NOT_EXIST("4001","用户不存在"),
    PASSWORD_ERROR("4002","密码错误"),
    CODE_ERROR("4003","验证码错误"),
    LOGIN_EXPIEE("4004","登录已过期"),
    LOGIN_CACHE_EXPIEE("4005","登录已过期(缓存)"),
    MOBILE_ERROR("4006","手机号格式错误"),
    USERNAME_ERROR("4007","用户名格式错误"),
    EMAIL_ERROR("4008","Email格式错误"),
    USERNAME_LENGTH_ERROR("4009","用户名长度8～50"),
    AUDIENCE_DIFF("3001","audience不一致"),
    SUBJECT_DIFF("3002","subject不一致"),
    JWT_DIFF("3003","jwt不一致")
    ;
    private String code;

    private String description;

    ExceptionCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
