package com.atom.group.authcenter.model;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-10 16:35
 **/
public class Logon {

    /**
     * identity 身份信息，可以为 用户名、手机号、邮箱
     */
    private String identity;

    /**
     * credentials 校验凭证，可以为密码、验证码
     */
    private String credentials;

    /**
     * audience 发起请求的系统
     */
    private String audience;

    /**
     * subject 面向类型 web、app、pc、iot
     */
    private String subject;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
